package com.example.listadetarefas;// Importe necessário
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listadetarefas.R;

public class CommandListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_list);

        // Exemplo de dados para a lista (substitua com seus próprios comandos)
        String[] commandList = {"Alerta", "Mensagem", "Treinamento","Feedbacks","Noticias", "Sair"};

        // Configure a ListView para exibir os comandos
        ArrayAdapter<String> commandAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, commandList);
        ListView commandListView = findViewById(R.id.commandListView);
        commandListView.setAdapter(commandAdapter);

        // Adicione um ouvinte de clique aos itens da lista
        commandListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCommand = commandAdapter.getItem(position);

                // Verifique qual comando foi selecionado
                if ("Alerta".equals(selectedCommand)) {
                    // Lógica para adicionar tarefa
                } else if ("Mensagem".equals(selectedCommand)) {
                    // Lógica para lidar com outros comandos
                } else if ("Treinamento".equals(selectedCommand)) {
                    // Lógica para lidar com outros comandos
                }else if ("Feedbacks".equals(selectedCommand)) {
                    // Lógica para lidar com outros comandos
                }else if ("Noticias".equals(selectedCommand)) {
                    // Lógica para lidar com outros comandos
                }else if ("Sair".equals(selectedCommand)) {
                    // Se o comando for "Sair", volte para MainActivity
                    finish();  // Isso encerrará a CommandListActivity e retornará à MainActivity
                }
            }
        });
    }
}
