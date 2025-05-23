/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import java.awt.Dimension;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\006\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003¢\006\004\b\006\020\007B3\b\020\022\006\020\b\032\0020\003\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\006\020\013J\016\020\020\032\0020\0212\006\020\022\032\0020\021J\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\003HÆ\003J'\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\034HÖ\001J%\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#H\001¢\006\002\b$R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\rR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\017\020\r¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LLMVision;", "", "maxDimension", "", "maxPixels", "maxDimensionDivider", "<init>", "(III)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMaxDimension", "()I", "getMaxPixels", "getMaxDimensionDivider", "getMaxSupportedSize", "Ljava/awt/Dimension;", "originalSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class LLMVision {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int maxDimension;
/*    */   private final int maxPixels;
/*    */   private final int maxDimensionDivider;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LLMVision$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/LLMVision;", "core"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<LLMVision> serializer() {
/* 30 */       return (KSerializer<LLMVision>)LLMVision.$serializer.INSTANCE;
/*    */     } }
/*    */   
/* 33 */   public LLMVision(int maxDimension, int maxPixels, int maxDimensionDivider) { this.maxDimension = maxDimension;
/*    */     
/* 35 */     this.maxPixels = maxPixels;
/*    */ 
/*    */     
/* 38 */     this.maxDimensionDivider = maxDimensionDivider; } public final int getMaxDimension() { return this.maxDimension; } public final int getMaxDimensionDivider() { return this.maxDimensionDivider; }
/*    */   public final int getMaxPixels() { return this.maxPixels; } @NotNull
/*    */   public final Dimension getMaxSupportedSize(@NotNull Dimension originalSize) {
/* 41 */     Intrinsics.checkNotNullParameter(originalSize, "originalSize"); Dimension adjustedSize = originalSize;
/* 42 */     int pixels = originalSize.width * originalSize.height;
/* 43 */     if (pixels > this.maxPixels) {
/*    */       
/* 45 */       double k = Math.sqrt(this.maxPixels / pixels);
/* 46 */       adjustedSize = new Dimension((int)(originalSize.width * k), (int)(originalSize.height * k));
/*    */     } 
/*    */     
/* 49 */     int biggerAxisDimension = Math.max(adjustedSize.width, adjustedSize.height);
/* 50 */     int adjustedAxisDimension = 
/* 51 */       (biggerAxisDimension > this.maxDimension) ? this.maxDimension : (
/* 52 */       biggerAxisDimension / this.maxDimensionDivider * this.maxDimensionDivider);
/*    */     
/* 54 */     if (adjustedAxisDimension != biggerAxisDimension) {
/* 55 */       double k = adjustedAxisDimension / biggerAxisDimension;
/* 56 */       adjustedSize = (biggerAxisDimension == adjustedSize.width) ? 
/* 57 */         new Dimension(adjustedAxisDimension, (int)(adjustedSize.height * k)) : 
/*    */         
/* 59 */         new Dimension((int)(adjustedSize.width * k), adjustedAxisDimension);
/*    */     } 
/* 61 */     return adjustedSize;
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.maxDimension;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.maxPixels;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.maxDimensionDivider;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMVision copy(int maxDimension, int maxPixels, int maxDimensionDivider) {
/*    */     return new LLMVision(maxDimension, maxPixels, maxDimensionDivider);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LLMVision(maxDimension=" + this.maxDimension + ", maxPixels=" + this.maxPixels + ", maxDimensionDivider=" + this.maxDimensionDivider + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.maxDimension);
/*    */     result = result * 31 + Integer.hashCode(this.maxPixels);
/*    */     return result * 31 + Integer.hashCode(this.maxDimensionDivider);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LLMVision))
/*    */       return false; 
/*    */     LLMVision lLMVision = (LLMVision)other;
/*    */     return (this.maxDimension != lLMVision.maxDimension) ? false : ((this.maxPixels != lLMVision.maxPixels) ? false : (!(this.maxDimensionDivider != lLMVision.maxDimensionDivider)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\LLMVision.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */