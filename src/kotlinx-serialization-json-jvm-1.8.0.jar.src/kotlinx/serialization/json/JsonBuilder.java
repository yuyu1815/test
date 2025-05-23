/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
/*     */ import kotlinx.serialization.modules.SerializersModule;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\020\n\002\020\016\n\002\b\r\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\033\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\030\0002\0020\001B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\r\020Q\032\0020RH\000¢\006\002\bSR\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013R\032\020\f\032\0020\007X\016¢\006\016\n\000\032\004\b\r\020\t\"\004\b\016\020\013R\032\020\017\032\0020\007X\016¢\006\016\n\000\032\004\b\020\020\t\"\004\b\021\020\013R\032\020\022\032\0020\007X\016¢\006\016\n\000\032\004\b\022\020\t\"\004\b\023\020\013R\032\020\024\032\0020\007X\016¢\006\016\n\000\032\004\b\025\020\t\"\004\b\026\020\013R$\020\027\032\0020\0308\006@\006X\016¢\006\024\n\000\022\004\b\031\020\032\032\004\b\033\020\034\"\004\b\035\020\036R\032\020\037\032\0020\007X\016¢\006\016\n\000\032\004\b \020\t\"\004\b!\020\013R\032\020\"\032\0020\030X\016¢\006\016\n\000\032\004\b#\020\034\"\004\b$\020\036R$\020%\032\0020&8\006@\006X\016¢\006\024\n\000\022\004\b'\020\032\032\004\b(\020)\"\004\b*\020+R\032\020,\032\0020\007X\016¢\006\016\n\000\032\004\b-\020\t\"\004\b.\020\013R&\020/\032\004\030\001008\006@\006X\016¢\006\024\n\000\022\004\b1\020\032\032\004\b2\0203\"\004\b4\0205R$\0206\032\0020\0078\006@\006X\016¢\006\024\n\000\022\004\b7\020\032\032\004\b8\020\t\"\004\b9\020\013R$\020:\032\0020\0078\006@\006X\016¢\006\024\n\000\022\004\b;\020\032\032\004\b<\020\t\"\004\b=\020\013R$\020>\032\0020\0078\006@\006X\016¢\006\024\n\000\022\004\b?\020\032\032\004\b@\020\t\"\004\bA\020\013R\032\020B\032\0020\007X\016¢\006\016\n\000\032\004\bC\020\t\"\004\bD\020\013R\032\020E\032\0020\007X\016¢\006\016\n\000\032\004\bF\020\t\"\004\bG\020\013R\032\020H\032\0020\007X\016¢\006\016\n\000\032\004\bI\020\t\"\004\bJ\020\013R\032\020K\032\0020LX\016¢\006\016\n\000\032\004\bM\020N\"\004\bO\020P¨\006T"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/Json;)V", "encodeDefaults", "", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "explicitNulls", "getExplicitNulls", "setExplicitNulls", "ignoreUnknownKeys", "getIgnoreUnknownKeys", "setIgnoreUnknownKeys", "isLenient", "setLenient", "prettyPrint", "getPrettyPrint", "setPrettyPrint", "prettyPrintIndent", "", "getPrettyPrintIndent$annotations", "()V", "getPrettyPrintIndent", "()Ljava/lang/String;", "setPrettyPrintIndent", "(Ljava/lang/String;)V", "coerceInputValues", "getCoerceInputValues", "setCoerceInputValues", "classDiscriminator", "getClassDiscriminator", "setClassDiscriminator", "classDiscriminatorMode", "Lkotlinx/serialization/json/ClassDiscriminatorMode;", "getClassDiscriminatorMode$annotations", "getClassDiscriminatorMode", "()Lkotlinx/serialization/json/ClassDiscriminatorMode;", "setClassDiscriminatorMode", "(Lkotlinx/serialization/json/ClassDiscriminatorMode;)V", "useAlternativeNames", "getUseAlternativeNames", "setUseAlternativeNames", "namingStrategy", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getNamingStrategy$annotations", "getNamingStrategy", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "setNamingStrategy", "(Lkotlinx/serialization/json/JsonNamingStrategy;)V", "decodeEnumsCaseInsensitive", "getDecodeEnumsCaseInsensitive$annotations", "getDecodeEnumsCaseInsensitive", "setDecodeEnumsCaseInsensitive", "allowTrailingComma", "getAllowTrailingComma$annotations", "getAllowTrailingComma", "setAllowTrailingComma", "allowComments", "getAllowComments$annotations", "getAllowComments", "setAllowComments", "allowSpecialFloatingPointValues", "getAllowSpecialFloatingPointValues", "setAllowSpecialFloatingPointValues", "allowStructuredMapKeys", "getAllowStructuredMapKeys", "setAllowStructuredMapKeys", "useArrayPolymorphism", "getUseArrayPolymorphism", "setUseArrayPolymorphism", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "setSerializersModule", "(Lkotlinx/serialization/modules/SerializersModule;)V", "build", "Lkotlinx/serialization/json/JsonConfiguration;", "build$kotlinx_serialization_json", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,724:1\n1069#2,2:725\n*S KotlinDebug\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n*L\n687#1:725,2\n*E\n"})
/*     */ public final class JsonBuilder
/*     */ {
/*     */   private boolean encodeDefaults;
/*     */   private boolean explicitNulls;
/*     */   private boolean ignoreUnknownKeys;
/*     */   private boolean isLenient;
/*     */   private boolean prettyPrint;
/*     */   @NotNull
/*     */   private String prettyPrintIndent;
/*     */   private boolean coerceInputValues;
/*     */   @NotNull
/*     */   private String classDiscriminator;
/*     */   @NotNull
/*     */   private ClassDiscriminatorMode classDiscriminatorMode;
/*     */   private boolean useAlternativeNames;
/*     */   @Nullable
/*     */   private JsonNamingStrategy namingStrategy;
/*     */   private boolean decodeEnumsCaseInsensitive;
/*     */   private boolean allowTrailingComma;
/*     */   private boolean allowComments;
/*     */   private boolean allowSpecialFloatingPointValues;
/*     */   private boolean allowStructuredMapKeys;
/*     */   private boolean useArrayPolymorphism;
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
/*     */   public final boolean getExplicitNulls() {
/*     */     return this.explicitNulls;
/*     */   }
/*     */   
/*     */   public final void setExplicitNulls(boolean <set-?>) {
/*     */     this.explicitNulls = <set-?>;
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
/*     */   public final boolean isLenient() {
/*     */     return this.isLenient;
/*     */   }
/*     */   
/*     */   public final void setLenient(boolean <set-?>) {
/*     */     this.isLenient = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getPrettyPrint() {
/*     */     return this.prettyPrint;
/*     */   }
/*     */   
/*     */   public final void setPrettyPrint(boolean <set-?>) {
/*     */     this.prettyPrint = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getPrettyPrintIndent() {
/*     */     return this.prettyPrintIndent;
/*     */   }
/*     */   
/*     */   public final void setPrettyPrintIndent(@NotNull String <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.prettyPrintIndent = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getCoerceInputValues() {
/*     */     return this.coerceInputValues;
/*     */   }
/*     */   
/*     */   public final void setCoerceInputValues(boolean <set-?>) {
/*     */     this.coerceInputValues = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getClassDiscriminator() {
/*     */     return this.classDiscriminator;
/*     */   }
/*     */   
/*     */   public final void setClassDiscriminator(@NotNull String <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.classDiscriminator = <set-?>;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ClassDiscriminatorMode getClassDiscriminatorMode() {
/*     */     return this.classDiscriminatorMode;
/*     */   }
/*     */   
/*     */   public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.classDiscriminatorMode = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getUseAlternativeNames() {
/*     */     return this.useAlternativeNames;
/*     */   }
/*     */   
/*     */   public final void setUseAlternativeNames(boolean <set-?>) {
/*     */     this.useAlternativeNames = <set-?>;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final JsonNamingStrategy getNamingStrategy() {
/*     */     return this.namingStrategy;
/*     */   }
/*     */   
/*     */   public final void setNamingStrategy(@Nullable JsonNamingStrategy <set-?>) {
/*     */     this.namingStrategy = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getDecodeEnumsCaseInsensitive() {
/*     */     return this.decodeEnumsCaseInsensitive;
/*     */   }
/*     */   
/*     */   public final void setDecodeEnumsCaseInsensitive(boolean <set-?>) {
/*     */     this.decodeEnumsCaseInsensitive = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getAllowTrailingComma() {
/*     */     return this.allowTrailingComma;
/*     */   }
/*     */   
/*     */   public final void setAllowTrailingComma(boolean <set-?>) {
/*     */     this.allowTrailingComma = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getAllowComments() {
/*     */     return this.allowComments;
/*     */   }
/*     */   
/*     */   public final void setAllowComments(boolean <set-?>) {
/*     */     this.allowComments = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getAllowSpecialFloatingPointValues() {
/*     */     return this.allowSpecialFloatingPointValues;
/*     */   }
/*     */   
/*     */   public final void setAllowSpecialFloatingPointValues(boolean <set-?>) {
/*     */     this.allowSpecialFloatingPointValues = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getAllowStructuredMapKeys() {
/*     */     return this.allowStructuredMapKeys;
/*     */   }
/*     */   
/*     */   public final void setAllowStructuredMapKeys(boolean <set-?>) {
/*     */     this.allowStructuredMapKeys = <set-?>;
/*     */   }
/*     */   
/*     */   public final boolean getUseArrayPolymorphism() {
/*     */     return this.useArrayPolymorphism;
/*     */   }
/*     */   
/*     */   public final void setUseArrayPolymorphism(boolean <set-?>) {
/*     */     this.useArrayPolymorphism = <set-?>;
/*     */   }
/*     */   
/*     */   public JsonBuilder(@NotNull Json json) {
/* 369 */     this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
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
/* 423 */     this.explicitNulls = json.getConfiguration().getExplicitNulls();
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
/* 446 */     this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
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
/* 460 */     this.isLenient = json.getConfiguration().isLenient();
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
/* 481 */     this.prettyPrint = json.getConfiguration().getPrettyPrint();
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
/* 492 */     this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
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
/* 524 */     this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
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
/* 537 */     this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
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
/* 549 */     this.classDiscriminatorMode = json.getConfiguration().getClassDiscriminatorMode();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 558 */     this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 568 */     this.namingStrategy = json.getConfiguration().getNamingStrategy();
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
/* 599 */     this.decodeEnumsCaseInsensitive = json.getConfiguration().getDecodeEnumsCaseInsensitive();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 608 */     this.allowTrailingComma = json.getConfiguration().getAllowTrailingComma();
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
/* 624 */     this.allowComments = json.getConfiguration().getAllowComments();
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
/* 643 */     this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 650 */     this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 659 */     this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 668 */     this.serializersModule = json.getSerializersModule(); } @NotNull public final SerializersModule getSerializersModule() { return this.serializersModule; } public final void setSerializersModule(@NotNull SerializersModule <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.serializersModule = <set-?>; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final JsonConfiguration build$kotlinx_serialization_json() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield useArrayPolymorphism : Z
/*     */     //   4: ifeq -> 71
/*     */     //   7: aload_0
/*     */     //   8: getfield classDiscriminator : Ljava/lang/String;
/*     */     //   11: ldc 'type'
/*     */     //   13: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   16: ifne -> 36
/*     */     //   19: iconst_0
/*     */     //   20: istore_2
/*     */     //   21: ldc 'Class discriminator should not be specified when array polymorphism is specified'
/*     */     //   23: astore_2
/*     */     //   24: new java/lang/IllegalArgumentException
/*     */     //   27: dup
/*     */     //   28: aload_2
/*     */     //   29: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   32: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   35: athrow
/*     */     //   36: aload_0
/*     */     //   37: getfield classDiscriminatorMode : Lkotlinx/serialization/json/ClassDiscriminatorMode;
/*     */     //   40: getstatic kotlinx/serialization/json/ClassDiscriminatorMode.POLYMORPHIC : Lkotlinx/serialization/json/ClassDiscriminatorMode;
/*     */     //   43: if_acmpne -> 50
/*     */     //   46: iconst_1
/*     */     //   47: goto -> 51
/*     */     //   50: iconst_0
/*     */     //   51: ifne -> 71
/*     */     //   54: iconst_0
/*     */     //   55: istore_2
/*     */     //   56: ldc 'useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.'
/*     */     //   58: astore_2
/*     */     //   59: new java/lang/IllegalArgumentException
/*     */     //   62: dup
/*     */     //   63: aload_2
/*     */     //   64: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   67: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   70: athrow
/*     */     //   71: aload_0
/*     */     //   72: getfield prettyPrint : Z
/*     */     //   75: ifne -> 107
/*     */     //   78: aload_0
/*     */     //   79: getfield prettyPrintIndent : Ljava/lang/String;
/*     */     //   82: ldc '    '
/*     */     //   84: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   87: ifne -> 249
/*     */     //   90: iconst_0
/*     */     //   91: istore_2
/*     */     //   92: ldc 'Indent should not be specified when default printing mode is used'
/*     */     //   94: astore_2
/*     */     //   95: new java/lang/IllegalArgumentException
/*     */     //   98: dup
/*     */     //   99: aload_2
/*     */     //   100: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   103: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   106: athrow
/*     */     //   107: aload_0
/*     */     //   108: getfield prettyPrintIndent : Ljava/lang/String;
/*     */     //   111: ldc '    '
/*     */     //   113: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   116: ifne -> 249
/*     */     //   119: aload_0
/*     */     //   120: getfield prettyPrintIndent : Ljava/lang/String;
/*     */     //   123: checkcast java/lang/CharSequence
/*     */     //   126: astore_2
/*     */     //   127: iconst_0
/*     */     //   128: istore_3
/*     */     //   129: iconst_0
/*     */     //   130: istore #4
/*     */     //   132: iload #4
/*     */     //   134: aload_2
/*     */     //   135: invokeinterface length : ()I
/*     */     //   140: if_icmpge -> 206
/*     */     //   143: aload_2
/*     */     //   144: iload #4
/*     */     //   146: invokeinterface charAt : (I)C
/*     */     //   151: istore #5
/*     */     //   153: iload #5
/*     */     //   155: istore #6
/*     */     //   157: iconst_0
/*     */     //   158: istore #7
/*     */     //   160: iload #6
/*     */     //   162: bipush #32
/*     */     //   164: if_icmpeq -> 188
/*     */     //   167: iload #6
/*     */     //   169: bipush #9
/*     */     //   171: if_icmpeq -> 188
/*     */     //   174: iload #6
/*     */     //   176: bipush #13
/*     */     //   178: if_icmpeq -> 188
/*     */     //   181: iload #6
/*     */     //   183: bipush #10
/*     */     //   185: if_icmpne -> 192
/*     */     //   188: iconst_1
/*     */     //   189: goto -> 193
/*     */     //   192: iconst_0
/*     */     //   193: ifne -> 200
/*     */     //   196: iconst_0
/*     */     //   197: goto -> 207
/*     */     //   200: iinc #4, 1
/*     */     //   203: goto -> 132
/*     */     //   206: iconst_1
/*     */     //   207: istore_1
/*     */     //   208: iload_1
/*     */     //   209: ifne -> 249
/*     */     //   212: iconst_0
/*     */     //   213: istore_2
/*     */     //   214: new java/lang/StringBuilder
/*     */     //   217: dup
/*     */     //   218: invokespecial <init> : ()V
/*     */     //   221: ldc 'Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had '
/*     */     //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   226: aload_0
/*     */     //   227: getfield prettyPrintIndent : Ljava/lang/String;
/*     */     //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   233: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   236: astore_2
/*     */     //   237: new java/lang/IllegalArgumentException
/*     */     //   240: dup
/*     */     //   241: aload_2
/*     */     //   242: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   245: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   248: athrow
/*     */     //   249: new kotlinx/serialization/json/JsonConfiguration
/*     */     //   252: dup
/*     */     //   253: aload_0
/*     */     //   254: getfield encodeDefaults : Z
/*     */     //   257: aload_0
/*     */     //   258: getfield ignoreUnknownKeys : Z
/*     */     //   261: aload_0
/*     */     //   262: getfield isLenient : Z
/*     */     //   265: aload_0
/*     */     //   266: getfield allowStructuredMapKeys : Z
/*     */     //   269: aload_0
/*     */     //   270: getfield prettyPrint : Z
/*     */     //   273: aload_0
/*     */     //   274: getfield explicitNulls : Z
/*     */     //   277: aload_0
/*     */     //   278: getfield prettyPrintIndent : Ljava/lang/String;
/*     */     //   281: aload_0
/*     */     //   282: getfield coerceInputValues : Z
/*     */     //   285: aload_0
/*     */     //   286: getfield useArrayPolymorphism : Z
/*     */     //   289: aload_0
/*     */     //   290: getfield classDiscriminator : Ljava/lang/String;
/*     */     //   293: aload_0
/*     */     //   294: getfield allowSpecialFloatingPointValues : Z
/*     */     //   297: aload_0
/*     */     //   298: getfield useAlternativeNames : Z
/*     */     //   301: aload_0
/*     */     //   302: getfield namingStrategy : Lkotlinx/serialization/json/JsonNamingStrategy;
/*     */     //   305: aload_0
/*     */     //   306: getfield decodeEnumsCaseInsensitive : Z
/*     */     //   309: aload_0
/*     */     //   310: getfield allowTrailingComma : Z
/*     */     //   313: aload_0
/*     */     //   314: getfield allowComments : Z
/*     */     //   317: aload_0
/*     */     //   318: getfield classDiscriminatorMode : Lkotlinx/serialization/json/ClassDiscriminatorMode;
/*     */     //   321: invokespecial <init> : (ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZLkotlinx/serialization/json/JsonNamingStrategy;ZZZLkotlinx/serialization/json/ClassDiscriminatorMode;)V
/*     */     //   324: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #672	-> 0
/*     */     //   #673	-> 7
/*     */     //   #674	-> 21
/*     */     //   #673	-> 23
/*     */     //   #676	-> 36
/*     */     //   #677	-> 56
/*     */     //   #676	-> 58
/*     */     //   #681	-> 71
/*     */     //   #682	-> 78
/*     */     //   #683	-> 92
/*     */     //   #682	-> 94
/*     */     //   #685	-> 107
/*     */     //   #687	-> 119
/*     */     //   #725	-> 129
/*     */     //   #687	-> 160
/*     */     //   #725	-> 193
/*     */     //   #726	-> 206
/*     */     //   #687	-> 207
/*     */     //   #688	-> 208
/*     */     //   #689	-> 214
/*     */     //   #688	-> 236
/*     */     //   #693	-> 249
/*     */     //   #694	-> 253
/*     */     //   #695	-> 265
/*     */     //   #696	-> 281
/*     */     //   #697	-> 289
/*     */     //   #698	-> 301
/*     */     //   #693	-> 321
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   21	2	2	$i$a$-require-JsonBuilder$build$1	I
/*     */     //   56	2	2	$i$a$-require-JsonBuilder$build$2	I
/*     */     //   92	2	2	$i$a$-require-JsonBuilder$build$3	I
/*     */     //   160	33	7	$i$a$-all-JsonBuilder$build$allWhitespaces$1	I
/*     */     //   157	36	6	it	C
/*     */     //   153	47	5	element$iv	C
/*     */     //   129	78	3	$i$f$all	I
/*     */     //   127	80	2	$this$all$iv	Ljava/lang/CharSequence;
/*     */     //   214	22	2	$i$a$-require-JsonBuilder$build$4	I
/*     */     //   208	41	1	allWhitespaces	Z
/*     */     //   0	325	0	this	Lkotlinx/serialization/json/JsonBuilder;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */