/*    */ package ai.grazie.tone;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = DocFormalityToneSerializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\t\b\001\030\000 \t2\b\022\004\022\0020\0000\001:\001\tB\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\b¨\006\n"}, d2 = {"Lai/grazie/tone/DocFormalityTone;", "", "(Ljava/lang/String;I)V", "FORMAL", "SEMI_FORMAL", "NEUTRAL", "SEMI_INFORMAL", "INFORMAL", "MIXED", "Companion", "model-tone-formality"})
/*    */ public enum DocFormalityTone {
/* 11 */   FORMAL,
/* 12 */   SEMI_FORMAL,
/* 13 */   NEUTRAL,
/* 14 */   SEMI_INFORMAL,
/* 15 */   INFORMAL,
/* 16 */   MIXED; static { Companion = new Companion(null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/tone/DocFormalityTone$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/tone/DocFormalityTone;", "model-tone-formality"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<DocFormalityTone> serializer() {
/*    */       return (KSerializer<DocFormalityTone>)DocFormalityToneSerializer.INSTANCE;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tone-formality-jvm-0.4.32.jar!\ai\grazie\tone\DocFormalityTone.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */