/*    */ package kotlinx.serialization.json;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\006\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\"\030\0002\0020\001Bµ\001\b\000\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\003\022\b\b\002\020\b\032\0020\003\022\b\b\002\020\t\032\0020\n\022\b\b\002\020\013\032\0020\003\022\b\b\002\020\f\032\0020\003\022\b\b\002\020\r\032\0020\n\022\b\b\002\020\016\032\0020\003\022\b\b\002\020\017\032\0020\003\022\n\b\002\020\020\032\004\030\0010\021\022\b\b\002\020\022\032\0020\003\022\b\b\002\020\023\032\0020\003\022\b\b\002\020\024\032\0020\003\022\b\b\002\020\025\032\0020\026¢\006\004\b\027\020\030J\b\0207\032\0020\nH\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\031\020\032R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\033\020\032R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\005\020\032R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\034\020\032R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\035\020\032R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\036\020\032R\034\020\t\032\0020\n8\006X\004¢\006\016\n\000\022\004\b\037\020 \032\004\b!\020\"R\021\020\013\032\0020\003¢\006\b\n\000\032\004\b#\020\032R\021\020\f\032\0020\003¢\006\b\n\000\032\004\b$\020\032R\021\020\r\032\0020\n¢\006\b\n\000\032\004\b%\020\"R\021\020\016\032\0020\003¢\006\b\n\000\032\004\b&\020\032R\021\020\017\032\0020\003¢\006\b\n\000\032\004\b'\020\032R\036\020\020\032\004\030\0010\0218\006X\004¢\006\016\n\000\022\004\b(\020 \032\004\b)\020*R\034\020\022\032\0020\0038\006X\004¢\006\016\n\000\022\004\b+\020 \032\004\b,\020\032R\034\020\023\032\0020\0038\006X\004¢\006\016\n\000\022\004\b-\020 \032\004\b.\020\032R\034\020\024\032\0020\0038\006X\004¢\006\016\n\000\022\004\b/\020 \032\004\b0\020\032R,\020\025\032\0020\0262\006\0201\032\0020\0268\006@GX\016¢\006\024\n\000\022\004\b2\020 \032\004\b3\0204\"\004\b5\0206¨\0068"}, d2 = {"Lkotlinx/serialization/json/JsonConfiguration;", "", "encodeDefaults", "", "ignoreUnknownKeys", "isLenient", "allowStructuredMapKeys", "prettyPrint", "explicitNulls", "prettyPrintIndent", "", "coerceInputValues", "useArrayPolymorphism", "classDiscriminator", "allowSpecialFloatingPointValues", "useAlternativeNames", "namingStrategy", "Lkotlinx/serialization/json/JsonNamingStrategy;", "decodeEnumsCaseInsensitive", "allowTrailingComma", "allowComments", "classDiscriminatorMode", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLkotlinx/serialization/json/JsonNamingStrategy;ZZZLkotlinx/serialization/json/ClassDiscriminatorMode;)V", "getEncodeDefaults", "()Z", "getIgnoreUnknownKeys", "getAllowStructuredMapKeys", "getPrettyPrint", "getExplicitNulls", "getPrettyPrintIndent$annotations", "()V", "getPrettyPrintIndent", "()Ljava/lang/String;", "getCoerceInputValues", "getUseArrayPolymorphism", "getClassDiscriminator", "getAllowSpecialFloatingPointValues", "getUseAlternativeNames", "getNamingStrategy$annotations", "getNamingStrategy", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "getDecodeEnumsCaseInsensitive$annotations", "getDecodeEnumsCaseInsensitive", "getAllowTrailingComma$annotations", "getAllowTrailingComma", "getAllowComments$annotations", "getAllowComments", "value", "getClassDiscriminatorMode$annotations", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "toString", "kotlinx-serialization-json"})
/*    */ public final class JsonConfiguration { private final boolean encodeDefaults; private final boolean ignoreUnknownKeys; private final boolean isLenient; private final boolean allowStructuredMapKeys; private final boolean prettyPrint;
/*    */   private final boolean explicitNulls;
/*    */   @NotNull
/*    */   private final String prettyPrintIndent;
/*    */   private final boolean coerceInputValues;
/*    */   private final boolean useArrayPolymorphism;
/*    */   @NotNull
/*    */   private final String classDiscriminator;
/*    */   private final boolean allowSpecialFloatingPointValues;
/*    */   private final boolean useAlternativeNames;
/*    */   @Nullable
/*    */   private final JsonNamingStrategy namingStrategy;
/*    */   private final boolean decodeEnumsCaseInsensitive;
/*    */   private final boolean allowTrailingComma;
/*    */   private final boolean allowComments;
/*    */   @NotNull
/*    */   private ClassDiscriminatorMode classDiscriminatorMode;
/*    */   
/* 20 */   public JsonConfiguration(boolean encodeDefaults, boolean ignoreUnknownKeys, boolean isLenient, boolean allowStructuredMapKeys, boolean prettyPrint, boolean explicitNulls, @NotNull String prettyPrintIndent, boolean coerceInputValues, boolean useArrayPolymorphism, @NotNull String classDiscriminator, boolean allowSpecialFloatingPointValues, boolean useAlternativeNames, @Nullable JsonNamingStrategy namingStrategy, boolean decodeEnumsCaseInsensitive, boolean allowTrailingComma, boolean allowComments, @NotNull ClassDiscriminatorMode classDiscriminatorMode) { this.encodeDefaults = encodeDefaults;
/* 21 */     this.ignoreUnknownKeys = ignoreUnknownKeys;
/* 22 */     this.isLenient = isLenient;
/* 23 */     this.allowStructuredMapKeys = allowStructuredMapKeys;
/* 24 */     this.prettyPrint = prettyPrint;
/* 25 */     this.explicitNulls = explicitNulls;
/* 26 */     this.prettyPrintIndent = prettyPrintIndent;
/*    */     
/* 28 */     this.coerceInputValues = coerceInputValues;
/* 29 */     this.useArrayPolymorphism = useArrayPolymorphism;
/* 30 */     this.classDiscriminator = classDiscriminator;
/* 31 */     this.allowSpecialFloatingPointValues = allowSpecialFloatingPointValues;
/* 32 */     this.useAlternativeNames = useAlternativeNames;
/* 33 */     this.namingStrategy = namingStrategy;
/*    */     
/* 35 */     this.decodeEnumsCaseInsensitive = decodeEnumsCaseInsensitive;
/*    */     
/* 37 */     this.allowTrailingComma = allowTrailingComma;
/*    */     
/* 39 */     this.allowComments = allowComments;
/*    */     
/* 41 */     this.classDiscriminatorMode = classDiscriminatorMode; } public final boolean getEncodeDefaults() { return this.encodeDefaults; } public final boolean getIgnoreUnknownKeys() { return this.ignoreUnknownKeys; } public final boolean isLenient() { return this.isLenient; } public final boolean getAllowStructuredMapKeys() { return this.allowStructuredMapKeys; } public final boolean getPrettyPrint() { return this.prettyPrint; } public final boolean getExplicitNulls() { return this.explicitNulls; } @NotNull public final String getPrettyPrintIndent() { return this.prettyPrintIndent; } public final boolean getCoerceInputValues() { return this.coerceInputValues; } @NotNull public final ClassDiscriminatorMode getClassDiscriminatorMode() { return this.classDiscriminatorMode; } public final boolean getUseArrayPolymorphism() { return this.useArrayPolymorphism; } @NotNull public final String getClassDiscriminator() { return this.classDiscriminator; } public final boolean getAllowSpecialFloatingPointValues() { return this.allowSpecialFloatingPointValues; } public final boolean getUseAlternativeNames() { return this.useAlternativeNames; } @Nullable public final JsonNamingStrategy getNamingStrategy() { return this.namingStrategy; } public final boolean getDecodeEnumsCaseInsensitive() { return this.decodeEnumsCaseInsensitive; } public final boolean getAllowTrailingComma() { return this.allowTrailingComma; } public final boolean getAllowComments() { return this.allowComments; } @Deprecated(message = "JsonConfiguration is not meant to be mutable, and will be made read-only in a future release. The `Json(from = ...) {}` copy builder should be used instead.", level = DeprecationLevel.ERROR) public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.classDiscriminatorMode = <set-?>; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/* 53 */     StringBuilder stringBuilder = new StringBuilder(); stringBuilder.append("JsonConfiguration(encodeDefaults=").append(this.encodeDefaults).append(", ignoreUnknownKeys=").append(this.ignoreUnknownKeys).append(", isLenient=").append(this.isLenient).append(", allowStructuredMapKeys=").append(
/* 54 */         this.allowStructuredMapKeys).append(", prettyPrint=").append(this.prettyPrint).append(", explicitNulls=").append(this.explicitNulls).append(", prettyPrintIndent='").append(
/* 55 */         this.prettyPrintIndent).append("', coerceInputValues=").append(this.coerceInputValues).append(", useArrayPolymorphism=").append(this.useArrayPolymorphism).append(", classDiscriminator='").append(
/* 56 */         this.classDiscriminator).append("', allowSpecialFloatingPointValues=").append(this.allowSpecialFloatingPointValues).append(", useAlternativeNames=");
/* 57 */     stringBuilder.append(this.useAlternativeNames).append(", namingStrategy=").append(this.namingStrategy).append(", decodeEnumsCaseInsensitive=").append(this.decodeEnumsCaseInsensitive).append(", allowTrailingComma=").append(
/* 58 */         this.allowTrailingComma).append(", allowComments=").append(this.allowComments).append(", classDiscriminatorMode=").append(this.classDiscriminatorMode).append(')');
/*    */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   public JsonConfiguration() {
/*    */     this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */