package jemoji;

import com.github.poolkid.jemoji.meta.EmojiCategory;
import static com.github.poolkid.jemoji.util.UnicodeUtil.toPrint;

public enum Emojis {
	// ============== emoticons ==============
	FACE_SMILLING(EmojiCategory.EMOTICON, "U+1F600", 
"face_smilling"),
  UNKNOWN(EmojiCategory.EMOTICON, "non-code", "non-name");

	private final EmojiCategory category;
	private final String unicode;
	private final String name;

	Emojis(EmojiCategory category, String unicode, 
String name) {
		this.category = category;
		this.unicode = unicode;
		this.name = name;
	}

	public EmojiCategory getCategory() {
		return category;
	}

	public String getUnicode() {
		return unicode;
	}

	public String getName() {
		return name;
	}

  public Emojis getEmojiByName(String name) {
    for (Emojis ee : values()) {
      if (ee.getName().equals(name)) {
        return ee;
      }
    }
    return UNKNOWN;
  }

	public String print() {
		return toPrint(unicode);
	}
}
