package com.domaassist;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView txtStatus;
    private AudioHelper audioHelper;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtStatus = findViewById(R.id.txtStatus);

        Button btnVerificar =
                findViewById(R.id.btnVerificar);

        Button btnBluetooth =
                findViewById(R.id.btnBluetooth);

        Button btnAlerta =
                findViewById(R.id.btnAlerta);

        audioHelper = new AudioHelper(this);

        // Atualiza status ao abrir o app
        atualizarStatus();

        btnVerificar.setOnClickListener(v -> atualizarStatus());

        btnBluetooth.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            Settings.ACTION_BLUETOOTH_SETTINGS);

            startActivity(intent);
        });

        btnAlerta.setOnClickListener(v -> {

            mediaPlayer =
                    MediaPlayer.create(
                            this,
                            R.raw.alerta);

            mediaPlayer.start();
        });

        registrarCallback();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Atualiza quando voltar das configurações Bluetooth
        atualizarStatus();
    }

    private void atualizarStatus() {

        boolean speaker =
                audioHelper.audioOutputAvailable(
                        AudioDeviceInfo.TYPE_BUILTIN_SPEAKER);

        BluetoothAdapter bluetoothAdapter =
                BluetoothAdapter.getDefaultAdapter();

        boolean bluetoothLigado = false;

        if (bluetoothAdapter != null) {
            bluetoothLigado = bluetoothAdapter.isEnabled();
        }

        txtStatus.setText(
                "Alto-falante: "
                        + speaker
                        + "\nBluetooth: "
                        + bluetoothLigado
        );
    }

    private void registrarCallback() {

        AudioManager audioManager =
                (AudioManager) getSystemService(AUDIO_SERVICE);

        audioManager.registerAudioDeviceCallback(

                new AudioDeviceCallback() {

                    @Override
                    public void onAudioDevicesAdded(
                            AudioDeviceInfo[] addedDevices) {

                        atualizarStatus();
                    }

                    @Override
                    public void onAudioDevicesRemoved(
                            AudioDeviceInfo[] removedDevices) {

                        atualizarStatus();
                    }

                },

                null
        );
    }

    @Override
    protected void onDestroy() {

        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();
    }
}