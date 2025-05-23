/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.SerializersKt;
/*     */ import kotlinx.serialization.StringFormat;
/*     */ import kotlinx.serialization.json.internal.AbstractJsonLexer;
/*     */ import kotlinx.serialization.json.internal.DescriptorSchemaCache;
/*     */ import kotlinx.serialization.json.internal.InternalJsonWriter;
/*     */ import kotlinx.serialization.json.internal.JsonStreamsKt;
/*     */ import kotlinx.serialization.json.internal.JsonToStringWriter;
/*     */ import kotlinx.serialization.json.internal.StreamingJsonDecoder;
/*     */ import kotlinx.serialization.json.internal.StringJsonLexer;
/*     */ import kotlinx.serialization.json.internal.StringJsonLexerKt;
/*     */ import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
/*     */ import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
/*     */ import kotlinx.serialization.json.internal.WriteMode;
/*     */ import kotlinx.serialization.modules.SerializersModule;
/*     */ import kotlinx.serialization.modules.SerializersModuleBuildersKt;
/*     */ import org.intellij.lang.annotations.Language;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\000\b6\030\000 '2\0020\001:\001'B\031\b\004\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J'\020\022\032\0020\023\"\004\b\000\020\0242\f\020\025\032\b\022\004\022\002H\0240\0262\006\020\027\032\002H\024¢\006\002\020\030J)\020\031\032\002H\024\"\004\b\000\020\0242\f\020\032\032\b\022\004\022\002H\0240\0332\b\b\001\020\034\032\0020\023¢\006\002\020\035J'\020\036\032\0020\037\"\004\b\000\020\0242\f\020\025\032\b\022\004\022\002H\0240\0262\006\020\027\032\002H\024¢\006\002\020 J'\020!\032\002H\024\"\004\b\000\020\0242\f\020\032\032\b\022\004\022\002H\0240\0332\006\020\"\032\0020\037¢\006\002\020#J\020\020$\032\0020\0372\b\b\001\020\034\032\0020\023J\036\020\022\032\0020\023\"\006\b\000\020\024\030\0012\006\020\027\032\002H\024H\b¢\006\002\020%J \020\031\032\002H\024\"\006\b\000\020\024\030\0012\b\b\001\020\034\032\0020\023H\b¢\006\002\020&R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013R\034\020\f\032\0020\r8\000X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021\001\002()¨\006*"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/StringFormat;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/modules/SerializersModule;)V", "getConfiguration", "()Lkotlinx/serialization/json/JsonConfiguration;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "_schemaCache", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "get_schemaCache$kotlinx_serialization_json", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "encodeToString", "", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "decodeFromString", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "string", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "encodeToJsonElement", "Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "decodeFromJsonElement", "element", "(Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "parseToJsonElement", "(Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/Object;", "Default", "Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/JsonImpl;", "kotlinx-serialization-json"})
/*     */ public abstract class Json
/*     */   implements StringFormat
/*     */ {
/*     */   @NotNull
/*     */   public static final Default Default = new Default(null);
/*     */   @NotNull
/*     */   private final JsonConfiguration configuration;
/*     */   @NotNull
/*     */   private final SerializersModule serializersModule;
/*     */   @NotNull
/*     */   private final DescriptorSchemaCache _schemaCache;
/*     */   
/*     */   @NotNull
/*     */   public final JsonConfiguration getConfiguration() {
/*     */     return this.configuration;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public SerializersModule getSerializersModule() {
/*     */     return this.serializersModule;
/*     */   }
/*     */   
/*     */   private Json(JsonConfiguration configuration, SerializersModule serializersModule) {
/*  74 */     this.configuration = configuration;
/*  75 */     this.serializersModule = serializersModule;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     this._schemaCache = new DescriptorSchemaCache();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final DescriptorSchemaCache get_schemaCache$kotlinx_serialization_json() {
/*     */     return this._schemaCache;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/Json;", "<init>", "()V", "kotlinx-serialization-json"})
/*     */   public static final class Default
/*     */     extends Json
/*     */   {
/*     */     private Default() {
/* 100 */       super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), SerializersModuleBuildersKt.EmptySerializersModule(), null);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final <T> String encodeToString(@NotNull SerializationStrategy serializer, Object value) {
/* 123 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); JsonToStringWriter result = new JsonToStringWriter();
/*     */     try {
/* 125 */       JsonStreamsKt.encodeByWriter(this, (InternalJsonWriter)result, serializer, value);
/* 126 */       return result.toString();
/*     */     } finally {
/* 128 */       result.release();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final <T> T decodeFromString(@NotNull DeserializationStrategy deserializer, @Language(value = "json", prefix = "", suffix = "") @NotNull String string) {
/* 147 */     Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(string, "string"); StringJsonLexer lexer = StringJsonLexerKt.StringJsonLexer(this, string);
/* 148 */     StreamingJsonDecoder input = new StreamingJsonDecoder(this, WriteMode.OBJ, (AbstractJsonLexer)lexer, deserializer.getDescriptor(), null);
/* 149 */     Object result = input.decodeSerializableValue(deserializer);
/* 150 */     lexer.expectEof();
/* 151 */     return (T)result;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final <T> JsonElement encodeToJsonElement(@NotNull SerializationStrategy serializer, Object value) {
/* 160 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); return TreeJsonEncoderKt.writeJson(this, value, serializer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final <T> T decodeFromJsonElement(@NotNull DeserializationStrategy deserializer, @NotNull JsonElement element) {
/* 170 */     Intrinsics.checkNotNullParameter(deserializer, "deserializer"); Intrinsics.checkNotNullParameter(element, "element"); return (T)TreeJsonDecoderKt.readJson(this, element, deserializer);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final JsonElement parseToJsonElement(@Language(value = "json", prefix = "", suffix = "") @NotNull String string) {
/* 179 */     Intrinsics.checkNotNullParameter(string, "string"); return decodeFromString((DeserializationStrategy<? extends JsonElement>)JsonElementSerializer.INSTANCE, string);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\Json.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */