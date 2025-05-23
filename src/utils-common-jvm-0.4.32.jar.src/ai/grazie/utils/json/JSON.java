/*     */ package ai.grazie.utils.json;
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\022\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\007\b&\030\000 %2\0020\001:\003%&'B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\"\020\007\032\0020\b\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\002H\tH\b¢\006\002\020\013J+\020\007\032\0020\b\"\b\b\000\020\t*\0020\0012\f\020\f\032\b\022\004\022\002H\t0\r2\006\020\n\032\002H\t¢\006\002\020\016J\"\020\017\032\0020\020\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\002H\tH\b¢\006\002\020\021J\"\020\022\032\002H\t\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\0020\bH\b¢\006\002\020\023J\"\020\022\032\002H\t\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\0020\024H\b¢\006\002\020\025J'\020\022\032\002H\t\"\004\b\000\020\t2\f\020\f\032\b\022\004\022\002H\t0\0262\006\020\n\032\0020\b¢\006\002\020\027J'\020\022\032\002H\t\"\004\b\000\020\t2\f\020\f\032\b\022\004\022\002H\t0\0262\006\020\n\032\0020\024¢\006\002\020\030J+\020\022\032\002H\t\"\b\b\000\020\t*\0020\0012\f\020\f\032\b\022\004\022\002H\t0\0262\006\020\n\032\0020\020¢\006\002\020\031J\"\020\022\032\002H\t\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\0020\020H\b¢\006\002\020\032J\016\020\033\032\0020\0202\006\020\n\032\0020\024J$\020\034\032\004\030\001H\t\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\0020\024H\b¢\006\002\020\025J)\020\034\032\004\030\001H\t\"\004\b\000\020\t2\f\020\f\032\b\022\004\022\002H\t0\0262\006\020\n\032\0020\024¢\006\002\020\030J\030\020\035\032\004\030\0010\0242\006\020\n\032\0020\0242\006\020\036\032\0020\024J\020\020\037\032\0020\0242\006\020 \032\0020!H\002J\"\020\"\032\0020\024\"\n\b\000\020\t\030\001*\0020\0012\006\020\n\032\002H\tH\b¢\006\002\020#J+\020\"\032\0020\024\"\b\b\000\020\t*\0020\0012\f\020\f\032\b\022\004\022\002H\t0\r2\006\020\n\032\002H\t¢\006\002\020$R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006("}, d2 = {"Lai/grazie/utils/json/JSON;", "", "json", "Lkotlinx/serialization/json/Json;", "(Lkotlinx/serialization/json/Json;)V", "getJson", "()Lkotlinx/serialization/json/Json;", "bytes", "", "T", "value", "(Ljava/lang/Object;)[B", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)[B", "jsonElement", "Lkotlinx/serialization/json/JsonElement;", "(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "parse", "([B)Ljava/lang/Object;", "", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;[B)Ljava/lang/Object;", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;", "(Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "parseJsonElement", "parseOrNull", "parseStringValueOrNull", "key", "prepareClientDataSafeMessage", "e", "Lkotlinx/serialization/SerializationException;", "string", "(Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Default", "Pretty", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nJSON.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,109:1\n70#1:110\n*S KotlinDebug\n*F\n+ 1 JSON.kt\nai/grazie/utils/json/JSON\n*L\n75#1:110\n*E\n"})
/*     */ public abstract class JSON { @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*   6 */   public JSON(@NotNull Json json) { this.json = json; } @NotNull private final Json json; @NotNull public final Json getJson() { return this.json; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/utils/json/JSON$Companion;", "", "()V", "build", "Lai/grazie/utils/json/JSON;", "json", "Lkotlinx/serialization/json/Json;", "utils-common"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*   8 */     public final JSON build(@NotNull Json json) { Intrinsics.checkNotNullParameter(json, "json"); return new JSON$Companion$build$1(json); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001¨\006\002"}, d2 = {"ai/grazie/utils/json/JSON$Companion$build$1", "Lai/grazie/utils/json/JSON;", "utils-common"}) public static final class JSON$Companion$build$1 extends JSON { JSON$Companion$build$1(Json $json) { super($json); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/json/JSON$Default;", "Lai/grazie/utils/json/JSON;", "()V", "utils-common"})
/*     */   public static final class Default extends JSON { @NotNull
/*     */     public static final Default INSTANCE = new Default(); private Default() {
/*  11 */       super(JsonKt.Json$default(null, null.INSTANCE, 1, null));
/*     */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/utils/json/JSON$Pretty;", "Lai/grazie/utils/json/JSON;", "()V", "utils-common"})
/*     */   public static final class Pretty extends JSON { @NotNull
/*     */     public static final Pretty INSTANCE = new Pretty();
/*     */     private Pretty() {
/*  16 */       super(JsonKt.Json$default(null, null.INSTANCE, 1, null));
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final <T> String string(@NotNull SerializationStrategy serializer, @NotNull Object value) {
/*  24 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); return this.json.encodeToString(serializer, value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final <T> byte[] bytes(@NotNull SerializationStrategy<? super Object> serializer, @NotNull Object value) {
/*  35 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); return StringsKt.encodeToByteArray(string(serializer, value));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final <T> T parse(@NotNull DeserializationStrategy serializer, @NotNull String value) {
/*     */     Object object;
/*  42 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); 
/*  43 */     try { object = this.json.decodeFromString(serializer, value); }
/*  44 */     catch (SerializationException e)
/*  45 */     { throw new SerializationException(prepareClientDataSafeMessage(e)); }  return (T)object;
/*     */   }
/*     */   @NotNull
/*     */   public final <T> T parse(@NotNull DeserializationStrategy serializer, @NotNull JsonElement value) {
/*     */     Object object;
/*  50 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); 
/*  51 */     try { object = this.json.decodeFromJsonElement(serializer, value); }
/*  52 */     catch (SerializationException e)
/*  53 */     { throw new SerializationException(prepareClientDataSafeMessage(e)); }  return (T)object;
/*     */   }
/*     */   @Nullable
/*     */   public final <T> T parseOrNull(@NotNull DeserializationStrategy<? extends Object> serializer, @NotNull String value) {
/*     */     T t;
/*  58 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); 
/*  59 */     try { t = parse(serializer, value); }
/*  60 */     catch (SerializationException e)
/*  61 */     { return null; }  return t;
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
/*     */   public final <T> T parse(@NotNull DeserializationStrategy serializer, @NotNull byte[] value) {
/*  82 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); Intrinsics.checkNotNullParameter(value, "value"); return (T)this.json.decodeFromString(serializer, StringsKt.decodeToString(value));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String parseStringValueOrNull(@NotNull String value, @NotNull String key) {
/*  90 */     Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullParameter(key, "key"); JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.json.parseToJsonElement(value)).get(key)); return ((JsonElement)JsonElementKt.getJsonObject(this.json.parseToJsonElement(value)).get(key) != null && JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.json.parseToJsonElement(value)).get(key)) != null) ? JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.json.parseToJsonElement(value)).get(key)).getContent() : null;
/*     */   }
/*     */   @NotNull
/*     */   public final JsonElement parseJsonElement(@NotNull String value) {
/*  94 */     Intrinsics.checkNotNullParameter(value, "value"); return this.json.parseToJsonElement(value);
/*     */   }
/*     */   
/*     */   private final String prepareClientDataSafeMessage(SerializationException e) {
/*  98 */     String stacktrace = ExceptionsKt.stackTraceToString((Throwable)e);
/*     */ 
/*     */ 
/*     */     
/* 102 */     int startIndex = StringsKt.indexOf$default(stacktrace, "\n\tat kotlinx.serialization", 0, false, 6, null);
/* 103 */     int endIndex = StringsKt.indexOf$default(stacktrace, "\n\tat ai.grazie.utils.json.JSON", 0, false, 6, null);
/* 104 */     Intrinsics.checkNotNullExpressionValue(stacktrace.substring(startIndex, endIndex), "substring(...)"); String trimmedStacktrace = (startIndex == -1 || endIndex == -1) ? "Unknown" : stacktrace.substring(startIndex, endIndex);
/*     */     
/* 106 */     return "(Client-data safe message) " + Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName() + ": " + trimmedStacktrace + "\n\t<...>";
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\json\JSON.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */