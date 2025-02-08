# YouTubePlaylistManager

Aplicativo Android para gerenciar playlists e favoritos de vídeos do YouTube, integrado com Firebase e YouTube Data API.

## Pré-requisitos

- Android Studio (versão mais recente)
- Conta no Google Cloud Console e Firebase Console
- Dispositivo Android ou emulador com Google Play Services

## Configuração

### 1. Clone o Repositório

```bash
git clone https://github.com/MarcioMAlmeida/YouTubePlaylistManager.git
cd YouTubePlaylistManager
```

### 2. Configure o Firebase
Acesse o Firebase Console.

Crie um novo projeto.

Adicione um app Android:

Package name: O mesmo do seu projeto (com.example.youtubeplaylistmanager).

SHA-1: Obtenha o SHA-1 do seu ambiente de desenvolvimento:
```bash
keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android
```

Baixe o arquivo google-services.json e coloque na pasta app/.

### 3. Configure a API do YouTube
Acesse o Google Cloud Console.

Habilite a YouTube Data API v3.

Crie uma chave de API em Credenciais > Criar Credenciais > Chave de API.

Adicione a chave no arquivo local.properties:
```properties
YOUTUBE_API_KEY=sua_chave_aqui
```

### 4. Execute o Projeto
Abra o projeto no Android Studio.

Sincronize o Gradle.

Execute o app em um dispositivo/emulador.

### Estrutura do Projeto
data: Camada de dados (Room, Retrofit, Repositórios).

domain: Modelos e casos de uso.

presentation: Telas e ViewModels (Jetpack Compose).

di: Módulos de injeção de dependência (Hilt).

### Diagrama de Arquitetura

Em construção

