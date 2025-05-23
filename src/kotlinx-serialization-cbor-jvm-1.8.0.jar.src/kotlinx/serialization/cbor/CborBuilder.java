/*     */ package kotlinx.serialization.cbor;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
/*     */ import kotlinx.serialization.modules.SerializersModule;
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
/*     */ @ExperimentalSerializationApi
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b#\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013R\032\020\f\032\0020\007X\016¢\006\016\n\000\032\004\b\r\020\t\"\004\b\016\020\013R\032\020\017\032\0020\007X\016¢\006\016\n\000\032\004\b\020\020\t\"\004\b\021\020\013R\032\020\022\032\0020\007X\016¢\006\016\n\000\032\004\b\023\020\t\"\004\b\024\020\013R\032\020\025\032\0020\007X\016¢\006\016\n\000\032\004\b\026\020\t\"\004\b\027\020\013R\032\020\030\032\0020\007X\016¢\006\016\n\000\032\004\b\031\020\t\"\004\b\032\020\013R\032\020\033\032\0020\007X\016¢\006\016\n\000\032\004\b\034\020\t\"\004\b\035\020\013R\032\020\036\032\0020\007X\016¢\006\016\n\000\032\004\b\037\020\t\"\004\b \020\013R\032\020!\032\0020\007X\016¢\006\016\n\000\032\004\b\"\020\t\"\004\b#\020\013R\032\020$\032\0020\007X\016¢\006\016\n\000\032\004\b%\020\t\"\004\b&\020\013R\032\020'\032\0020\007X\016¢\006\016\n\000\032\004\b(\020\t\"\004\b)\020\013R\032\020*\032\0020+X\016¢\006\016\n\000\032\004\b,\020-\"\004\b.\020/¨\0060"}, d2 = {"Lkotlinx/serialization/cbor/CborBuilder;", "", "cbor", "Lkotlinx/serialization/cbor/Cbor;", "<init>", "(Lkotlinx/serialization/cbor/Cbor;)V", "encodeDefaults", "", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "ignoreUnknownKeys", "getIgnoreUnknownKeys", "setIgnoreUnknownKeys", "encodeKeyTags", "getEncodeKeyTags", "setEncodeKeyTags", "encodeValueTags", "getEncodeValueTags", "setEncodeValueTags", "encodeObjectTags", "getEncodeObjectTags", "setEncodeObjectTags", "verifyKeyTags", "getVerifyKeyTags", "setVerifyKeyTags", "verifyValueTags", "getVerifyValueTags", "setVerifyValueTags", "verifyObjectTags", "getVerifyObjectTags", "setVerifyObjectTags", "useDefiniteLengthEncoding", "getUseDefiniteLengthEncoding", "setUseDefiniteLengthEncoding", "preferCborLabelsOverNames", "getPreferCborLabelsOverNames", "setPreferCborLabelsOverNames", "alwaysUseByteString", "getAlwaysUseByteString", "setAlwaysUseByteString", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "setSerializersModule", "(Lkotlinx/serialization/modules/SerializersModule;)V", "kotlinx-serialization-cbor"})
/*     */ public final class CborBuilder
/*     */ {
/*     */   private boolean encodeDefaults;
/*     */   private boolean ignoreUnknownKeys;
/*     */   private boolean encodeKeyTags;
/*     */   private boolean encodeValueTags;
/*     */   private boolean encodeObjectTags;
/*     */   private boolean verifyKeyTags;
/*     */   private boolean verifyValueTags;
/*     */   private boolean verifyObjectTags;
/*     */   private boolean useDefiniteLengthEncoding;
/*     */   private boolean preferCborLabelsOverNames;
/*     */   private boolean alwaysUseByteString;
/*     */   @NotNull
/*     */   private SerializersModule serializersModule;
/*     */   
/*     */   public final boolean getEncodeDefaults() {
/*     */     return this.encodeDefaults;
/*     */   }
/*     */   
/*     */   public final void setEncodeDefaults(boolean <set-?>) {
/*     */     this.encodeDefaults = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getIgnoreUnknownKeys() {
/*     */     return this.ignoreUnknownKeys;
/*     */   }
/*     */   
/*     */   public final void setIgnoreUnknownKeys(boolean <set-?>) {
/*     */     this.ignoreUnknownKeys = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getEncodeKeyTags() {
/*     */     return this.encodeKeyTags;
/*     */   }
/*     */   
/*     */   public final void setEncodeKeyTags(boolean <set-?>) {
/*     */     this.encodeKeyTags = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getEncodeValueTags() {
/*     */     return this.encodeValueTags;
/*     */   }
/*     */   
/*     */   public final void setEncodeValueTags(boolean <set-?>) {
/*     */     this.encodeValueTags = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getEncodeObjectTags() {
/*     */     return this.encodeObjectTags;
/*     */   }
/*     */   
/*     */   public final void setEncodeObjectTags(boolean <set-?>) {
/*     */     this.encodeObjectTags = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getVerifyKeyTags() {
/*     */     return this.verifyKeyTags;
/*     */   }
/*     */   
/*     */   public final void setVerifyKeyTags(boolean <set-?>) {
/*     */     this.verifyKeyTags = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getVerifyValueTags() {
/*     */     return this.verifyValueTags;
/*     */   }
/*     */   
/*     */   public final void setVerifyValueTags(boolean <set-?>) {
/*     */     this.verifyValueTags = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getVerifyObjectTags() {
/*     */     return this.verifyObjectTags;
/*     */   }
/*     */   
/*     */   public final void setVerifyObjectTags(boolean <set-?>) {
/*     */     this.verifyObjectTags = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getUseDefiniteLengthEncoding() {
/*     */     return this.useDefiniteLengthEncoding;
/*     */   }
/*     */   
/*     */   public final void setUseDefiniteLengthEncoding(boolean <set-?>) {
/*     */     this.useDefiniteLengthEncoding = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getPreferCborLabelsOverNames() {
/*     */     return this.preferCborLabelsOverNames;
/*     */   }
/*     */   
/*     */   public final void setPreferCborLabelsOverNames(boolean <set-?>) {
/*     */     this.preferCborLabelsOverNames = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getAlwaysUseByteString() {
/*     */     return this.alwaysUseByteString;
/*     */   }
/*     */   
/*     */   public final void setAlwaysUseByteString(boolean <set-?>) {
/*     */     this.alwaysUseByteString = <set-?>;
/*     */   }
/*     */   
/*     */   public CborBuilder(@NotNull Cbor cbor) {
/* 136 */     this.encodeDefaults = cbor.getConfiguration().getEncodeDefaults();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     this.ignoreUnknownKeys = cbor.getConfiguration().getIgnoreUnknownKeys();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     this.encodeKeyTags = cbor.getConfiguration().getEncodeKeyTags();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     this.encodeValueTags = cbor.getConfiguration().getEncodeValueTags();
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
/* 174 */     this.encodeObjectTags = cbor.getConfiguration().getEncodeObjectTags();
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
/* 186 */     this.verifyKeyTags = cbor.getConfiguration().getVerifyKeyTags();
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
/* 200 */     this.verifyValueTags = cbor.getConfiguration().getVerifyValueTags();
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
/* 211 */     this.verifyObjectTags = cbor.getConfiguration().getVerifyObjectTags();
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
/* 222 */     this.useDefiniteLengthEncoding = cbor.getConfiguration().getUseDefiniteLengthEncoding();
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
/* 234 */     this.preferCborLabelsOverNames = cbor.getConfiguration().getPreferCborLabelsOverNames();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 244 */     this.alwaysUseByteString = cbor.getConfiguration().getAlwaysUseByteString();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 249 */     this.serializersModule = cbor.getSerializersModule(); } @NotNull public final SerializersModule getSerializersModule() { return this.serializersModule; } public final void setSerializersModule(@NotNull SerializersModule <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.serializersModule = <set-?>; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\CborBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */