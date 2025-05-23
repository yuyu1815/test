/*     */ package ai.grazie.model.cloud;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.reflect.KClass;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\016\b\002\020\002\032\b\022\002\b\003\030\0010\003¢\006\002\020\004J\017\020\007\032\b\022\002\b\003\030\0010\003HÆ\003J\031\020\b\032\0020\0002\016\b\002\020\002\032\b\022\002\b\003\030\0010\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\017HÖ\001R\027\020\002\032\b\022\002\b\003\030\0010\003¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/model/cloud/SseConfig;", "", "unknownDataClass", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "getUnknownDataClass", "()Lkotlin/reflect/KClass;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model-cloud"})
/*     */ public final class SseConfig
/*     */ {
/*     */   @Nullable
/*     */   private final KClass<?> unknownDataClass;
/*     */   
/*     */   public SseConfig(@Nullable KClass<?> unknownDataClass) {
/* 108 */     this.unknownDataClass = unknownDataClass; } @Nullable public final KClass<?> getUnknownDataClass() { return this.unknownDataClass; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final KClass<?> component1() {
/*     */     return this.unknownDataClass;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SseConfig copy(@Nullable KClass<?> unknownDataClass) {
/*     */     return new SseConfig(unknownDataClass);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "SseConfig(unknownDataClass=" + this.unknownDataClass + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return (this.unknownDataClass == null) ? 0 : this.unknownDataClass.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof SseConfig))
/*     */       return false; 
/*     */     SseConfig sseConfig = (SseConfig)other;
/*     */     return !!Intrinsics.areEqual(this.unknownDataClass, sseConfig.unknownDataClass);
/*     */   }
/*     */   
/*     */   public SseConfig() {
/*     */     this(null, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\SseConfig.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */