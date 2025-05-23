/*    */ package ai.grazie.code.indexing.model;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\n\b\001\030\000 \f2\b\022\004\022\0020\0000\001:\001\fB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\007\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\r"}, d2 = {"Lai/grazie/code/indexing/model/VectorPrecision;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "toString", "Single", "Half", "Bit", "Int8", "Companion", "model-indexing"})
/*    */ public enum VectorPrecision {
/*  9 */   Single("fp32"), Half("fp16"), Bit("bit"), Int8("int8"); @NotNull public static final Companion Companion; @NotNull private final String displayName; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*    */   VectorPrecision(String displayName) { this.displayName = displayName; } @NotNull
/* 12 */   public String toString() { return this.displayName; }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>();
/*    */     
/*    */     null() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final KSerializer<Object> invoke() {
/*    */       return EnumsKt.createSimpleEnumSerializer("ai.grazie.code.indexing.model.VectorPrecision", (Enum[])VectorPrecision.values());
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/VectorPrecision$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/VectorPrecision;", "model-indexing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<VectorPrecision> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplayName() {
/*    */     return this.displayName;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\VectorPrecision.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */