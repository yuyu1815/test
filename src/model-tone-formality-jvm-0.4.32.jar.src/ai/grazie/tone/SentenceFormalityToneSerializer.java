/*    */ package ai.grazie.tone;
/*    */ 
/*    */ import ai.grazie.utils.StringValueClassSerializer;
/*    */ import ai.grazie.utils.mpp.LoggerFactory;
/*    */ import ai.grazie.utils.mpp.MPPLogger;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\006\032\0020\0022\006\020\007\032\0020\bH\002R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\t"}, d2 = {"Lai/grazie/tone/SentenceFormalityToneSerializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/tone/SentenceFormalityTone;", "()V", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "fromName", "name", "", "model-tone-formality"})
/*    */ @SourceDebugExtension({"SMAP\nSentenceFormalityTone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceFormalityTone.kt\nai/grazie/tone/SentenceFormalityToneSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/*    */ public final class SentenceFormalityToneSerializer
/*    */   extends StringValueClassSerializer<SentenceFormalityTone>
/*    */ {
/*    */   private SentenceFormalityToneSerializer() {
/* 21 */     super(
/* 22 */         "SentenceFormalityTone", 
/* 23 */         null.INSTANCE, 
/* 24 */         null.INSTANCE);
/*    */   } @NotNull
/* 26 */   public static final SentenceFormalityToneSerializer INSTANCE = new SentenceFormalityToneSerializer(); private final SentenceFormalityTone fromName(String name) { // Byte code:
/*    */     //   0: invokestatic values : ()[Lai/grazie/tone/SentenceFormalityTone;
/*    */     //   3: astore_2
/*    */     //   4: iconst_0
/*    */     //   5: istore_3
/*    */     //   6: aload_2
/*    */     //   7: arraylength
/*    */     //   8: istore #4
/*    */     //   10: iload_3
/*    */     //   11: iload #4
/*    */     //   13: if_icmpge -> 63
/*    */     //   16: aload_2
/*    */     //   17: iload_3
/*    */     //   18: aaload
/*    */     //   19: astore #5
/*    */     //   21: aload #5
/*    */     //   23: astore #6
/*    */     //   25: iconst_0
/*    */     //   26: istore #7
/*    */     //   28: aload #6
/*    */     //   30: invokevirtual name : ()Ljava/lang/String;
/*    */     //   33: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   36: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   39: dup
/*    */     //   40: ldc 'toLowerCase(...)'
/*    */     //   42: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   45: aload_1
/*    */     //   46: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   49: ifeq -> 57
/*    */     //   52: aload #5
/*    */     //   54: goto -> 64
/*    */     //   57: iinc #3, 1
/*    */     //   60: goto -> 10
/*    */     //   63: aconst_null
/*    */     //   64: dup
/*    */     //   65: ifnonnull -> 100
/*    */     //   68: pop
/*    */     //   69: aload_0
/*    */     //   70: checkcast ai/grazie/tone/SentenceFormalityToneSerializer
/*    */     //   73: astore_2
/*    */     //   74: iconst_0
/*    */     //   75: istore_3
/*    */     //   76: getstatic ai/grazie/tone/SentenceFormalityToneSerializer.logger : Lai/grazie/utils/mpp/MPPLogger;
/*    */     //   79: aconst_null
/*    */     //   80: new ai/grazie/tone/SentenceFormalityToneSerializer$fromName$2$1
/*    */     //   83: dup
/*    */     //   84: aload_1
/*    */     //   85: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   88: checkcast kotlin/jvm/functions/Function0
/*    */     //   91: iconst_1
/*    */     //   92: aconst_null
/*    */     //   93: invokestatic error$default : (Lai/grazie/utils/mpp/MPPLogger;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*    */     //   96: getstatic ai/grazie/tone/SentenceFormalityTone.NONE_FILTERED : Lai/grazie/tone/SentenceFormalityTone;
/*    */     //   99: nop
/*    */     //   100: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 0
/*    */     //   #35	-> 25
/*    */     //   #29	-> 28
/*    */     //   #29	-> 45
/*    */     //   #29	-> 49
/*    */     //   #29	-> 64
/*    */     //   #30	-> 76
/*    */     //   #31	-> 96
/*    */     //   #29	-> 99
/*    */     //   #32	-> 100
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   28	21	7	$i$a$-find-SentenceFormalityToneSerializer$fromName$1	I
/*    */     //   25	24	6	it	Lai/grazie/tone/SentenceFormalityTone;
/*    */     //   76	23	3	$i$a$-run-SentenceFormalityToneSerializer$fromName$2	I
/*    */     //   74	25	2	$this$fromName_u24lambda_u241	Lai/grazie/tone/SentenceFormalityToneSerializer;
/*    */     //   0	101	0	this	Lai/grazie/tone/SentenceFormalityToneSerializer;
/* 26 */     //   0	101	1	name	Ljava/lang/String; } @NotNull private static final MPPLogger logger = LoggerFactory.INSTANCE.create("ai.grazie.tone.FormalityToneSerializer");
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class SentenceFormalityToneSerializer$fromName$2$1 extends Lambda implements Function0<String> { public final String invoke() {
/* 30 */       return "Unknown SentenceFormalityTone: " + this.$name;
/*    */     }
/*    */     
/*    */     SentenceFormalityToneSerializer$fromName$2$1(String $name) {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tone-formality-jvm-0.4.32.jar!\ai\grazie\tone\SentenceFormalityToneSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */