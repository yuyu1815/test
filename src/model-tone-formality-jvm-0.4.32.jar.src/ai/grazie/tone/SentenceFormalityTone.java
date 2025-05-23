/*    */ package ai.grazie.tone;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = SentenceFormalityToneSerializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\n\b\001\030\000 \n2\b\022\004\022\0020\0000\001:\001\nB\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\t¨\006\013"}, d2 = {"Lai/grazie/tone/SentenceFormalityTone;", "", "(Ljava/lang/String;I)V", "HIGHLY_FORMAL", "FORMAL", "NEUTRAL_FORMAL", "NEUTRAL_INFORMAL", "INFORMAL", "HIGHLY_INFORMAL", "NONE_FILTERED", "Companion", "model-tone-formality"})
/*    */ public enum SentenceFormalityTone {
/* 12 */   HIGHLY_FORMAL,
/* 13 */   FORMAL,
/* 14 */   NEUTRAL_FORMAL,
/* 15 */   NEUTRAL_INFORMAL,
/* 16 */   INFORMAL,
/* 17 */   HIGHLY_INFORMAL,
/* 18 */   NONE_FILTERED; static { Companion = new Companion(null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/tone/SentenceFormalityTone$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/tone/SentenceFormalityTone;", "model-tone-formality"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SentenceFormalityTone> serializer() {
/*    */       return (KSerializer<SentenceFormalityTone>)SentenceFormalityToneSerializer.INSTANCE;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tone-formality-jvm-0.4.32.jar!\ai\grazie\tone\SentenceFormalityTone.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */