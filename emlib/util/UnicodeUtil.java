package emlib.util;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class UnicodeUtil {

	public UnicodeUtil() {
	}

	public static String toPrint(final String u) {
		return Stream.of(u.split("\\s+"))
					.map(UnicodeUtil::gsp)
					.collect(Collectors.joining(" "));
	}

	private static String gsp(final String unicode) {
        final var codePoint = Integer.parseInt(unicode.substring(2), 16);

        if (codePoint >= 0x0000 && codePoint <= 0xFFFF) {
            return String.valueOf((char) codePoint);
        }

        final var adjustedCodePoint = codePoint - 0x10000;
        return new String(new char[]{(char) (0xD800 + (adjustedCodePoint >> 10)),
                (char) (0xDC00 + (adjustedCodePoint & 0x3FF))});
    }

}
