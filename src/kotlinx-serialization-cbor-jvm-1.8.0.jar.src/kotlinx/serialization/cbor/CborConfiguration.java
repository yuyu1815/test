/*     */ package kotlinx.serialization.cbor;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @ExperimentalSerializationApi
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\031\n\002\020\016\n\000\b\007\030\0002\0020\001Ba\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\003¢\006\004\b\016\020\017J\b\020\034\032\0020\035H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\022\020\021R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\023\020\021R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\024\020\021R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\025\020\021R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\026\020\021R\021\020\t\032\0020\003¢\006\b\n\000\032\004\b\027\020\021R\021\020\n\032\0020\003¢\006\b\n\000\032\004\b\030\020\021R\021\020\013\032\0020\003¢\006\b\n\000\032\004\b\031\020\021R\021\020\f\032\0020\003¢\006\b\n\000\032\004\b\032\020\021R\021\020\r\032\0020\003¢\006\b\n\000\032\004\b\033\020\021¨\006\036"}, d2 = {"Lkotlinx/serialization/cbor/CborConfiguration;", "", "encodeDefaults", "", "ignoreUnknownKeys", "encodeKeyTags", "encodeValueTags", "encodeObjectTags", "verifyKeyTags", "verifyValueTags", "verifyObjectTags", "useDefiniteLengthEncoding", "preferCborLabelsOverNames", "alwaysUseByteString", "<init>", "(ZZZZZZZZZZZ)V", "getEncodeDefaults", "()Z", "getIgnoreUnknownKeys", "getEncodeKeyTags", "getEncodeValueTags", "getEncodeObjectTags", "getVerifyKeyTags", "getVerifyValueTags", "getVerifyObjectTags", "getUseDefiniteLengthEncoding", "getPreferCborLabelsOverNames", "getAlwaysUseByteString", "toString", "", "kotlinx-serialization-cbor"})
/*     */ public final class CborConfiguration
/*     */ {
/*     */   private final boolean encodeDefaults;
/*     */   private final boolean ignoreUnknownKeys;
/*     */   private final boolean encodeKeyTags;
/*     */   private final boolean encodeValueTags;
/*     */   private final boolean encodeObjectTags;
/*     */   private final boolean verifyKeyTags;
/*     */   private final boolean verifyValueTags;
/*     */   private final boolean verifyObjectTags;
/*     */   private final boolean useDefiniteLengthEncoding;
/*     */   private final boolean preferCborLabelsOverNames;
/*     */   private final boolean alwaysUseByteString;
/*     */   
/*     */   public final boolean getEncodeDefaults() {
/*     */     return this.encodeDefaults;
/*     */   }
/*     */   
/*     */   public final boolean getIgnoreUnknownKeys() {
/*     */     return this.ignoreUnknownKeys;
/*     */   }
/*     */   
/*     */   public final boolean getEncodeKeyTags() {
/*     */     return this.encodeKeyTags;
/*     */   }
/*     */   
/*     */   public final boolean getEncodeValueTags() {
/*     */     return this.encodeValueTags;
/*     */   }
/*     */   
/*     */   public final boolean getEncodeObjectTags() {
/*     */     return this.encodeObjectTags;
/*     */   }
/*     */   
/*     */   public final boolean getVerifyKeyTags() {
/*     */     return this.verifyKeyTags;
/*     */   }
/*     */   
/*     */   public final boolean getVerifyValueTags() {
/*     */     return this.verifyValueTags;
/*     */   }
/*     */   
/*     */   public final boolean getVerifyObjectTags() {
/*     */     return this.verifyObjectTags;
/*     */   }
/*     */   
/*     */   public final boolean getUseDefiniteLengthEncoding() {
/*     */     return this.useDefiniteLengthEncoding;
/*     */   }
/*     */   
/*     */   public final boolean getPreferCborLabelsOverNames() {
/*     */     return this.preferCborLabelsOverNames;
/*     */   }
/*     */   
/*     */   public CborConfiguration(boolean encodeDefaults, boolean ignoreUnknownKeys, boolean encodeKeyTags, boolean encodeValueTags, boolean encodeObjectTags, boolean verifyKeyTags, boolean verifyValueTags, boolean verifyObjectTags, boolean useDefiniteLengthEncoding, boolean preferCborLabelsOverNames, boolean alwaysUseByteString) {
/*  95 */     this.encodeDefaults = encodeDefaults;
/*  96 */     this.ignoreUnknownKeys = ignoreUnknownKeys;
/*  97 */     this.encodeKeyTags = encodeKeyTags;
/*  98 */     this.encodeValueTags = encodeValueTags;
/*  99 */     this.encodeObjectTags = encodeObjectTags;
/* 100 */     this.verifyKeyTags = verifyKeyTags;
/* 101 */     this.verifyValueTags = verifyValueTags;
/* 102 */     this.verifyObjectTags = verifyObjectTags;
/* 103 */     this.useDefiniteLengthEncoding = useDefiniteLengthEncoding;
/* 104 */     this.preferCborLabelsOverNames = preferCborLabelsOverNames;
/* 105 */     this.alwaysUseByteString = alwaysUseByteString; } public final boolean getAlwaysUseByteString() { return this.alwaysUseByteString; }
/*     */    @NotNull
/*     */   public String toString() {
/* 108 */     StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("CborConfiguration(encodeDefaults=").append(this.encodeDefaults).append(", ignoreUnknownKeys=").append(this.ignoreUnknownKeys).append(", encodeKeyTags=").append(
/* 109 */         this.encodeKeyTags).append(", encodeValueTags=").append(this.encodeValueTags).append(", encodeObjectTags=").append(this.encodeObjectTags).append(", verifyKeyTags=").append(
/* 110 */         this.verifyKeyTags).append(", verifyValueTags=").append(this.verifyValueTags).append(", verifyObjectTags=").append(this.verifyObjectTags).append(", useDefiniteLengthEncoding=").append(
/* 111 */         this.useDefiniteLengthEncoding).append(", preferCborLabelsOverNames=").append(
/* 112 */         this.preferCborLabelsOverNames).append(", alwaysUseByteString=").append(this.alwaysUseByteString).append(')');
/*     */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\CborConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */