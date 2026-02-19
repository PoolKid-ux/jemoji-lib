# jemoji (Java Emoji)

```
Uma simples biblioteca de emojis para java. Isso é 
para ter suporte até para java 8, mas eu não 
testei. Permitido qualquer alteração no código.

talvez seja um pouco chato para quem 
quiser "melhorar" o projeto, pois vai ter que 
compilar tudo usando o javac e se implementar libs 
externas... boa sorte.
```

```java
// Jemoji.java (exemplo)

import jemoji.Emoji

public class Jemoji {
	public static void main(String[] args) {
		System.out.println(Emoji.FACE_SMALLING.print());
	}
}

// or

class EmojiPack {
	public static String FACE_SMILLING = 
Emoji.FACE_SMILLING.print();
	public static String FACE_SMILLING_BT = 
Emoji.getEmojiByName("face_smilling");
}

class AnotherExample {
	public static void main(String[] args) {
		System.out.println(EmojiPack.FACE_SMILLING);
	}
}

```
