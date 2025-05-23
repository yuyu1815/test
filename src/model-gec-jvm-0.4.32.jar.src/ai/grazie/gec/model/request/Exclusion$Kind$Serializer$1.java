package ai.grazie.gec.model.request;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lai/grazie/gec/model/request/Exclusion$Kind;", "value", "", "invoke"})
@SourceDebugExtension({"SMAP\nExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exclusion.kt\nai/grazie/gec/model/request/Exclusion$Kind$Serializer$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,33:1\n1310#2,2:34\n*S KotlinDebug\n*F\n+ 1 Exclusion.kt\nai/grazie/gec/model/request/Exclusion$Kind$Serializer$1\n*L\n28#1:34,2\n*E\n"})
final class null extends Lambda implements Function1<String, Exclusion.Kind> {
  public static final null INSTANCE = (null)new Object();
  
  null() {
    super(1);
  }
  
  public final Exclusion.Kind invoke(String value) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'value'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: invokestatic values : ()[Lai/grazie/gec/model/request/Exclusion$Kind;
    //   9: astore_2
    //   10: iconst_0
    //   11: istore_3
    //   12: iconst_0
    //   13: istore #4
    //   15: aload_2
    //   16: arraylength
    //   17: istore #5
    //   19: iload #4
    //   21: iload #5
    //   23: if_icmpge -> 62
    //   26: aload_2
    //   27: iload #4
    //   29: aaload
    //   30: astore #6
    //   32: aload #6
    //   34: astore #7
    //   36: iconst_0
    //   37: istore #8
    //   39: aload #7
    //   41: invokevirtual name : ()Ljava/lang/String;
    //   44: aload_1
    //   45: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   48: ifeq -> 56
    //   51: aload #6
    //   53: goto -> 63
    //   56: iinc #4, 1
    //   59: goto -> 19
    //   62: aconst_null
    //   63: dup
    //   64: ifnonnull -> 71
    //   67: pop
    //   68: getstatic ai/grazie/gec/model/request/Exclusion$Kind.Unknown : Lai/grazie/gec/model/request/Exclusion$Kind;
    //   71: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #28	-> 6
    //   #34	-> 12
    //   #28	-> 39
    //   #34	-> 48
    //   #35	-> 62
    //   #28	-> 63
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   39	9	8	$i$a$-firstOrNull-Exclusion$Kind$Serializer$1$1	I
    //   36	12	7	it	Lai/grazie/gec/model/request/Exclusion$Kind;
    //   32	24	6	element$iv	Ljava/lang/Object;
    //   12	51	3	$i$f$firstOrNull	I
    //   10	53	2	$this$firstOrNull$iv	[Ljava/lang/Object;
    //   0	72	0	this	Lai/grazie/gec/model/request/Exclusion$Kind$Serializer$1;
    //   0	72	1	value	Ljava/lang/String;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\request\Exclusion$Kind$Serializer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */