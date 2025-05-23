/*    */ package ai.grazie.tone;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = MergeStrategyIdSerializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\000 \0052\b\022\004\022\0020\0000\001:\001\005B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\006"}, d2 = {"Lai/grazie/tone/MergeStrategyId;", "", "(Ljava/lang/String;I)V", "MOST_FREQUENT", "BINS_BASED", "Companion", "model-tone-formality"})
/*    */ public enum MergeStrategyId {
/* 11 */   MOST_FREQUENT, BINS_BASED; static { Companion = new Companion(null); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/tone/MergeStrategyId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/tone/MergeStrategyId;", "model-tone-formality"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<MergeStrategyId> serializer() {
/*    */       return (KSerializer<MergeStrategyId>)MergeStrategyIdSerializer.INSTANCE;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tone-formality-jvm-0.4.32.jar!\ai\grazie\tone\MergeStrategyId.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */