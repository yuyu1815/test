/*   */ package ai.grazie.model.cloud.annotations;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Serializable
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\000 \0052\b\022\004\022\0020\0000\001:\001\005B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\006"}, d2 = {"Lai/grazie/model/cloud/annotations/AnnotationType;", "", "(Ljava/lang/String;I)V", "DEPRECATED_API", "DEPRECATED_PARAM", "Companion", "model-cloud"})
/*   */ public enum AnnotationType {
/* 7 */   DEPRECATED_API,
/* 8 */   DEPRECATED_PARAM; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
/*   */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*   */ 
/*   */   
/*   */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */     public static final null INSTANCE = (null)new Function0<>();
/*   */     
/*   */     null() {
/*   */       super(0);
/*   */     }
/*   */     
/*   */     public final KSerializer<Object> invoke() {
/*   */       return EnumsKt.createSimpleEnumSerializer("ai.grazie.model.cloud.annotations.AnnotationType", (Enum[])AnnotationType.values());
/*   */     }
/*   */   }
/*   */   
/*   */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/annotations/AnnotationType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/annotations/AnnotationType;", "model-cloud"})
/*   */   public static final class Companion {
/*   */     private Companion() {}
/*   */     
/*   */     @NotNull
/*   */     public final KSerializer<AnnotationType> serializer() {
/*   */       return get$cachedSerializer();
/*   */     }
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\annotations\AnnotationType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */