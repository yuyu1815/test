/*    */ package ai.grazie.gec.blocking;
/*    */ 
/*    */ import ai.grazie.gec.model.SentenceWithCorrections;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\002\b\003\b'\030\0002\0020\001B\005¢\006\002\020\002J!\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0070\004H'¢\006\002\020\bJ\016\020\003\032\0020\0052\006\020\t\032\0020\007¨\006\n"}, d2 = {"Lai/grazie/gec/blocking/BlockingCorrectionService;", "", "()V", "correct", "", "Lai/grazie/gec/model/SentenceWithCorrections;", "sentences", "", "([Ljava/lang/String;)[Lai/grazie/gec/model/SentenceWithCorrections;", "sentence", "model-gec"})
/*    */ public abstract class BlockingCorrectionService
/*    */ {
/*    */   @NotNull
/*    */   public final SentenceWithCorrections correct(@NotNull String sentence) {
/* 14 */     Intrinsics.checkNotNullParameter(sentence, "sentence"); String[] arrayOfString = new String[1]; arrayOfString[0] = sentence; return (SentenceWithCorrections)ArraysKt.single((Object[])correct(arrayOfString));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public abstract SentenceWithCorrections[] correct(@NotNull String[] paramArrayOfString);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\blocking\BlockingCorrectionService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */