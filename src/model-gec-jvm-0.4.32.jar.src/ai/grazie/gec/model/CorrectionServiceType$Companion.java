/*    */ package ai.grazie.gec.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/gec/model/CorrectionServiceType$Companion;", "", "()V", "decode", "Lai/grazie/gec/model/CorrectionServiceType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*    */ @SourceDebugExtension({"SMAP\nCorrectionServiceType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CorrectionServiceType.kt\nai/grazie/gec/model/CorrectionServiceType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,23:1\n1310#2,2:24\n*S KotlinDebug\n*F\n+ 1 CorrectionServiceType.kt\nai/grazie/gec/model/CorrectionServiceType$Companion\n*L\n20#1:24,2\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<CorrectionServiceType> serializer() {
/* 19 */     return (KSerializer<CorrectionServiceType>)CorrectionServiceType.Serializer.INSTANCE;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CorrectionServiceType decode(@NotNull String value) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'value'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: invokestatic values : ()[Lai/grazie/gec/model/CorrectionServiceType;
/*    */     //   9: astore_2
/*    */     //   10: iconst_0
/*    */     //   11: istore_3
/*    */     //   12: iconst_0
/*    */     //   13: istore #4
/*    */     //   15: aload_2
/*    */     //   16: arraylength
/*    */     //   17: istore #5
/*    */     //   19: iload #4
/*    */     //   21: iload #5
/*    */     //   23: if_icmpge -> 62
/*    */     //   26: aload_2
/*    */     //   27: iload #4
/*    */     //   29: aaload
/*    */     //   30: astore #6
/*    */     //   32: aload #6
/*    */     //   34: astore #7
/*    */     //   36: iconst_0
/*    */     //   37: istore #8
/*    */     //   39: aload #7
/*    */     //   41: invokevirtual name : ()Ljava/lang/String;
/*    */     //   44: aload_1
/*    */     //   45: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   48: ifeq -> 56
/*    */     //   51: aload #6
/*    */     //   53: goto -> 63
/*    */     //   56: iinc #4, 1
/*    */     //   59: goto -> 19
/*    */     //   62: aconst_null
/*    */     //   63: dup
/*    */     //   64: ifnonnull -> 71
/*    */     //   67: pop
/*    */     //   68: getstatic ai/grazie/gec/model/CorrectionServiceType.OTHER : Lai/grazie/gec/model/CorrectionServiceType;
/*    */     //   71: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 6
/*    */     //   #24	-> 12
/*    */     //   #20	-> 39
/*    */     //   #24	-> 48
/*    */     //   #25	-> 62
/*    */     //   #20	-> 63
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   39	9	8	$i$a$-firstOrNull-CorrectionServiceType$Companion$decode$1	I
/*    */     //   36	12	7	it	Lai/grazie/gec/model/CorrectionServiceType;
/*    */     //   32	24	6	element$iv	Ljava/lang/Object;
/*    */     //   12	51	3	$i$f$firstOrNull	I
/*    */     //   10	53	2	$this$firstOrNull$iv	[Ljava/lang/Object;
/*    */     //   0	72	0	this	Lai/grazie/gec/model/CorrectionServiceType$Companion;
/*    */     //   0	72	1	value	Ljava/lang/String;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\CorrectionServiceType$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */