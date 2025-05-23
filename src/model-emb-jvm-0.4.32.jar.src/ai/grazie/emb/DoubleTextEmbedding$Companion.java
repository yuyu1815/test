/*    */ package ai.grazie.emb;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\017\020\005\032\b\022\004\022\0020\0040\006HÆ\001¨\006\007"}, d2 = {"Lai/grazie/emb/DoubleTextEmbedding$Companion;", "", "()V", "empty", "Lai/grazie/emb/DoubleTextEmbedding;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-emb"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<DoubleTextEmbedding> serializer() {
/* 54 */     return (KSerializer<DoubleTextEmbedding>)DoubleTextEmbedding.$serializer.INSTANCE; } @NotNull
/* 55 */   public final DoubleTextEmbedding empty() { return new DoubleTextEmbedding(new double[0], false, 2, null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-emb-jvm-0.4.32.jar!\ai\grazie\emb\DoubleTextEmbedding$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */