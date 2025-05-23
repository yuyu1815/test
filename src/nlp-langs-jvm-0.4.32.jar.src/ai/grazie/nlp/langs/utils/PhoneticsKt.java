package ai.grazie.nlp.langs.utils;

import ai.grazie.nlp.langs.Language;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\"\n\002\020\f\n\002\030\002\n\002\b\005\"\033\020\000\032\b\022\004\022\0020\0020\001*\0020\0038F¢\006\006\032\004\b\004\020\005\"\033\020\006\032\b\022\004\022\0020\0020\001*\0020\0038F¢\006\006\032\004\b\007\020\005¨\006\b"}, d2 = {"consonants", "", "", "Lai/grazie/nlp/langs/Language;", "getConsonants", "(Lai/grazie/nlp/langs/Language;)Ljava/util/Set;", "vowels", "getVowels", "nlp-langs"})
public final class PhoneticsKt {
  @NotNull
  public static final Set<Character> getConsonants(@NotNull Language $this$consonants) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getstatic ai/grazie/nlp/langs/utils/PhoneticsKt$WhenMappings.$EnumSwitchMapping$0 : [I
    //   10: swap
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: iconst_1
    //   16: if_icmpne -> 28
    //   19: getstatic ai/grazie/nlp/langs/utils/Phonetics$Russian.INSTANCE : Lai/grazie/nlp/langs/utils/Phonetics$Russian;
    //   22: invokevirtual getConsonants : ()Ljava/util/Set;
    //   25: goto -> 41
    //   28: new java/lang/IllegalStateException
    //   31: dup
    //   32: ldc 'Consonants are not yet provided'
    //   34: invokevirtual toString : ()Ljava/lang/String;
    //   37: invokespecial <init> : (Ljava/lang/String;)V
    //   40: athrow
    //   41: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #19	-> 6
    //   #20	-> 15
    //   #21	-> 32
    //   #22	-> 41
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	42	0	$this$consonants	Lai/grazie/nlp/langs/Language;
  }
  
  @NotNull
  public static final Set<Character> getVowels(@NotNull Language $this$vowels) {
    // Byte code:
    //   0: aload_0
    //   1: ldc '<this>'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_0
    //   7: getstatic ai/grazie/nlp/langs/utils/PhoneticsKt$WhenMappings.$EnumSwitchMapping$0 : [I
    //   10: swap
    //   11: invokevirtual ordinal : ()I
    //   14: iaload
    //   15: iconst_1
    //   16: if_icmpne -> 28
    //   19: getstatic ai/grazie/nlp/langs/utils/Phonetics$Russian.INSTANCE : Lai/grazie/nlp/langs/utils/Phonetics$Russian;
    //   22: invokevirtual getVowels : ()Ljava/util/Set;
    //   25: goto -> 41
    //   28: new java/lang/IllegalStateException
    //   31: dup
    //   32: ldc 'Vowels are not yet provided'
    //   34: invokevirtual toString : ()Ljava/lang/String;
    //   37: invokespecial <init> : (Ljava/lang/String;)V
    //   40: athrow
    //   41: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #25	-> 6
    //   #26	-> 15
    //   #27	-> 32
    //   #28	-> 41
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	42	0	$this$vowels	Lai/grazie/nlp/langs/Language;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\lang\\utils\PhoneticsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */