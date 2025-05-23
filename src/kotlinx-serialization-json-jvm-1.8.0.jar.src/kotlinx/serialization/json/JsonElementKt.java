/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.ULong;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.StringCompanionObject;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.internal.InlineClassDescriptorKt;
/*     */ import kotlinx.serialization.json.internal.JsonDecodingException;
/*     */ import kotlinx.serialization.json.internal.JsonEncodingException;
/*     */ import kotlinx.serialization.json.internal.StringJsonLexer;
/*     */ import kotlinx.serialization.json.internal.StringOpsKt;
/*     */ import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\030\002\n\002\020\001\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\006\n\002\020\t\n\002\b\006\n\002\020\006\n\002\b\006\n\002\020\007\n\002\b\023\n\002\030\002\n\002\b\007\032\025\020\000\032\0020\0012\b\020\002\032\004\030\0010\003¢\006\002\020\004\032\020\020\000\032\0020\0012\b\020\002\032\004\030\0010\005\032\027\020\000\032\0020\0012\006\020\002\032\0020\006H\007¢\006\004\b\007\020\b\032\027\020\000\032\0020\0012\006\020\002\032\0020\tH\007¢\006\004\b\n\020\013\032\027\020\000\032\0020\0012\006\020\002\032\0020\fH\007¢\006\004\b\r\020\016\032\027\020\000\032\0020\0012\006\020\002\032\0020\017H\007¢\006\004\b\020\020\021\032\020\020\000\032\0020\0012\b\020\002\032\004\030\0010\022\032\022\020\000\032\0020\0232\b\020\002\032\004\030\0010\024H\007\032\022\020\025\032\0020\0012\b\020\002\032\004\030\0010\022H\007\032\024\020N\032\0020\024*\0020\0332\006\020O\032\0020\022H\002\032$\020P\032\004\030\001HQ\"\004\b\000\020Q2\f\020R\032\b\022\004\022\002HQ0SH\b¢\006\002\020T\032\"\020U\032\002HQ\"\004\b\000\020Q2\f\020R\032\b\022\004\022\002HQ0SH\b¢\006\002\020T\032\030\020V\032\0020\0242\006\020W\032\0020\0222\006\020X\032\0020\022H\001\032\f\020Y\032\00201*\0020\001H\000\"\024\020\026\032\0020\027X\004¢\006\b\n\000\032\004\b\030\020\031\"\025\020\032\032\0020\001*\0020\0338F¢\006\006\032\004\b\034\020\035\"\025\020\036\032\0020\037*\0020\0338F¢\006\006\032\004\b \020!\"\025\020\"\032\0020#*\0020\0338F¢\006\006\032\004\b$\020%\"\025\020&\032\0020\023*\0020\0338F¢\006\006\032\004\b'\020(\"\025\020)\032\0020**\0020\0018F¢\006\006\032\004\b+\020,\"\027\020-\032\004\030\0010**\0020\0018F¢\006\006\032\004\b.\020/\"\025\0200\032\00201*\0020\0018F¢\006\006\032\004\b2\0203\"\027\0204\032\004\030\00101*\0020\0018F¢\006\006\032\004\b5\0206\"\025\0207\032\00208*\0020\0018F¢\006\006\032\004\b9\020:\"\027\020;\032\004\030\00108*\0020\0018F¢\006\006\032\004\b<\020=\"\025\020>\032\0020?*\0020\0018F¢\006\006\032\004\b@\020A\"\027\020B\032\004\030\0010?*\0020\0018F¢\006\006\032\004\bC\020D\"\025\020E\032\0020\003*\0020\0018F¢\006\006\032\004\bF\020G\"\027\020H\032\004\030\0010\003*\0020\0018F¢\006\006\032\004\bI\020J\"\027\020K\032\004\030\0010\022*\0020\0018F¢\006\006\032\004\bL\020M¨\006Z"}, d2 = {"JsonPrimitive", "Lkotlinx/serialization/json/JsonPrimitive;", "value", "", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "Lkotlin/UByte;", "JsonPrimitive-7apg3OU", "(B)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UShort;", "JsonPrimitive-xj2QHRw", "(S)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/UInt;", "JsonPrimitive-WZ4Q5Ns", "(I)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlin/ULong;", "JsonPrimitive-VKZWuLQ", "(J)Lkotlinx/serialization/json/JsonPrimitive;", "", "Lkotlinx/serialization/json/JsonNull;", "", "JsonUnquotedLiteral", "jsonUnquotedLiteralDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getJsonUnquotedLiteralDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonElement;", "getJsonPrimitive", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonObject", "Lkotlinx/serialization/json/JsonObject;", "getJsonObject", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonArray", "Lkotlinx/serialization/json/JsonArray;", "getJsonArray", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;", "jsonNull", "getJsonNull", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonNull;", "int", "", "getInt", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "intOrNull", "getIntOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "long", "", "getLong", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "longOrNull", "getLongOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "double", "", "getDouble", "(Lkotlinx/serialization/json/JsonPrimitive;)D", "doubleOrNull", "getDoubleOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "float", "", "getFloat", "(Lkotlinx/serialization/json/JsonPrimitive;)F", "floatOrNull", "getFloatOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Float;", "boolean", "getBoolean", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", "booleanOrNull", "getBooleanOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "contentOrNull", "getContentOrNull", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "error", "element", "exceptionToNull", "T", "f", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "exceptionToNumberFormatException", "unexpectedJson", "key", "expected", "parseLongImpl", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n1#1,350:1\n337#1,4:351\n329#1,4:355\n337#1,4:359\n329#1,4:363\n*S KotlinDebug\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n259#1:351,4\n269#1:355,4\n278#1:359,4\n284#1:363,4\n*E\n"})
/*     */ public final class JsonElementKt
/*     */ {
/*     */   @NotNull
/*     */   public static final JsonPrimitive JsonPrimitive(@Nullable Boolean value) {
/*  54 */     if (value == null) return JsonNull.INSTANCE; 
/*  55 */     return new JsonLiteral(value, false, null, 4, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final JsonPrimitive JsonPrimitive(@Nullable Number value) {
/*  60 */     if (value == null) return JsonNull.INSTANCE; 
/*  61 */     return new JsonLiteral(value, false, null, 4, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalSerializationApi
/*     */   @NotNull
/*     */   public static final JsonPrimitive JsonPrimitive-7apg3OU(byte value) {
/*  70 */     return JsonPrimitive-VKZWuLQ(ULong.constructor-impl(value & 0xFFL));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalSerializationApi
/*     */   @NotNull
/*     */   public static final JsonPrimitive JsonPrimitive-xj2QHRw(short value) {
/*  78 */     return JsonPrimitive-VKZWuLQ(ULong.constructor-impl(value & 0xFFFFL));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalSerializationApi
/*     */   @NotNull
/*     */   public static final JsonPrimitive JsonPrimitive-WZ4Q5Ns(int value) {
/*  86 */     return JsonPrimitive-VKZWuLQ(ULong.constructor-impl(value & 0xFFFFFFFFL));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalSerializationApi
/*     */   @SuppressAnimalSniffer
/*     */   @NotNull
/*     */   public static final JsonPrimitive JsonPrimitive-VKZWuLQ(long value) {
/*  95 */     return JsonUnquotedLiteral(Long.toUnsignedString(value));
/*     */   }
/*     */   @NotNull
/*     */   public static final JsonPrimitive JsonPrimitive(@Nullable String value) {
/*  99 */     if (value == null) return JsonNull.INSTANCE; 
/* 100 */     return new JsonLiteral(value, true, null, 4, null);
/*     */   }
/*     */   
/*     */   @ExperimentalSerializationApi
/*     */   @NotNull
/*     */   public static final JsonNull JsonPrimitive(@Nullable Void value) {
/* 106 */     return JsonNull.INSTANCE;
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
/*     */   @ExperimentalSerializationApi
/*     */   @NotNull
/*     */   public static final JsonPrimitive JsonUnquotedLiteral(@Nullable String value) {
/* 129 */     String str = value;
/*     */     
/* 131 */     if (Intrinsics.areEqual(str, JsonNull.INSTANCE.getContent())) throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive"); 
/* 132 */     return (str == null) ? JsonNull.INSTANCE : new JsonLiteral(value, false, jsonUnquotedLiteralDescriptor);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
/* 137 */     return jsonUnquotedLiteralDescriptor; } @NotNull
/* 138 */   private static final SerialDescriptor jsonUnquotedLiteralDescriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public static final JsonPrimitive getJsonPrimitive(@NotNull JsonElement $this$jsonPrimitive) {
/* 230 */     Intrinsics.checkNotNullParameter($this$jsonPrimitive, "<this>"); if ((($this$jsonPrimitive instanceof JsonPrimitive) ? (JsonPrimitive)$this$jsonPrimitive : null) == null) { ($this$jsonPrimitive instanceof JsonPrimitive) ? (JsonPrimitive)$this$jsonPrimitive : null; error($this$jsonPrimitive, "JsonPrimitive"); throw new KotlinNothingValueException(); }  return ($this$jsonPrimitive instanceof JsonPrimitive) ? (JsonPrimitive)$this$jsonPrimitive : null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final JsonObject getJsonObject(@NotNull JsonElement $this$jsonObject) {
/* 237 */     Intrinsics.checkNotNullParameter($this$jsonObject, "<this>"); if ((($this$jsonObject instanceof JsonObject) ? (JsonObject)$this$jsonObject : null) == null) { ($this$jsonObject instanceof JsonObject) ? (JsonObject)$this$jsonObject : null; error($this$jsonObject, "JsonObject"); throw new KotlinNothingValueException(); }  return ($this$jsonObject instanceof JsonObject) ? (JsonObject)$this$jsonObject : null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final JsonArray getJsonArray(@NotNull JsonElement $this$jsonArray) {
/* 244 */     Intrinsics.checkNotNullParameter($this$jsonArray, "<this>"); if ((($this$jsonArray instanceof JsonArray) ? (JsonArray)$this$jsonArray : null) == null) { ($this$jsonArray instanceof JsonArray) ? (JsonArray)$this$jsonArray : null; error($this$jsonArray, "JsonArray"); throw new KotlinNothingValueException(); }  return ($this$jsonArray instanceof JsonArray) ? (JsonArray)$this$jsonArray : null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final JsonNull getJsonNull(@NotNull JsonElement $this$jsonNull) {
/* 251 */     Intrinsics.checkNotNullParameter($this$jsonNull, "<this>"); if ((($this$jsonNull instanceof JsonNull) ? (JsonNull)$this$jsonNull : null) == null) { ($this$jsonNull instanceof JsonNull) ? (JsonNull)$this$jsonNull : null; error($this$jsonNull, "JsonNull"); throw new KotlinNothingValueException(); }  return ($this$jsonNull instanceof JsonNull) ? (JsonNull)$this$jsonNull : null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Integer getIntOrNull(@NotNull JsonPrimitive $this$intOrNull) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: iconst_0
/*     */     //   7: istore_3
/*     */     //   8: nop
/*     */     //   9: iconst_0
/*     */     //   10: istore #4
/*     */     //   12: aload_0
/*     */     //   13: invokestatic parseLongImpl : (Lkotlinx/serialization/json/JsonPrimitive;)J
/*     */     //   16: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   19: astore #5
/*     */     //   21: goto -> 29
/*     */     //   24: astore #4
/*     */     //   26: aconst_null
/*     */     //   27: astore #5
/*     */     //   29: aload #5
/*     */     //   31: nop
/*     */     //   32: dup
/*     */     //   33: ifnull -> 42
/*     */     //   36: invokevirtual longValue : ()J
/*     */     //   39: goto -> 45
/*     */     //   42: pop
/*     */     //   43: aconst_null
/*     */     //   44: areturn
/*     */     //   45: lstore_1
/*     */     //   46: ldc2_w -2147483648
/*     */     //   49: lload_1
/*     */     //   50: lcmp
/*     */     //   51: ifgt -> 70
/*     */     //   54: lload_1
/*     */     //   55: ldc2_w 2147483647
/*     */     //   58: lcmp
/*     */     //   59: ifgt -> 66
/*     */     //   62: iconst_1
/*     */     //   63: goto -> 71
/*     */     //   66: iconst_0
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_0
/*     */     //   71: ifne -> 76
/*     */     //   74: aconst_null
/*     */     //   75: areturn
/*     */     //   76: lload_1
/*     */     //   77: l2i
/*     */     //   78: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   81: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #269	-> 6
/*     */     //   #355	-> 8
/*     */     //   #356	-> 9
/*     */     //   #269	-> 12
/*     */     //   #356	-> 19
/*     */     //   #357	-> 24
/*     */     //   #358	-> 26
/*     */     //   #355	-> 31
/*     */     //   #269	-> 32
/*     */     //   #270	-> 46
/*     */     //   #271	-> 76
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   12	4	4	$i$a$-exceptionToNull-JsonElementKt$intOrNull$result$1	I
/*     */     //   26	3	4	e$iv	Lkotlinx/serialization/json/internal/JsonDecodingException;
/*     */     //   8	24	3	$i$f$exceptionToNull	I
/*     */     //   46	36	1	result	J
/*     */     //   0	82	0	$this$intOrNull	Lkotlinx/serialization/json/JsonPrimitive;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	21	24	kotlinx/serialization/json/internal/JsonDecodingException
/*     */   }
/*     */   public static final int getInt(@NotNull JsonPrimitive $this$int) { long l1;
/* 259 */     Intrinsics.checkNotNullParameter($this$int, "<this>"); int $i$f$exceptionToNumberFormatException = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 352 */     try { int $i$a$-exceptionToNumberFormatException-JsonElementKt$int$result$1 = 0; l1 = parseLongImpl($this$int); }
/* 353 */     catch (JsonDecodingException e$iv)
/* 354 */     { throw new NumberFormatException(e$iv.getMessage()); }  long result = l1; if (!((-2147483648L <= result) ? ((result <= 2147483647L) ? 1 : 0) : 0))
/*     */       throw new NumberFormatException($this$int.getContent() + " is not an Int"); 
/*     */     return (int)result; } public static final long getLong(@NotNull JsonPrimitive $this$long) { long l;
/*     */     Intrinsics.checkNotNullParameter($this$long, "<this>");
/*     */     int $i$f$exceptionToNumberFormatException = 0;
/*     */     
/* 360 */     try { int $i$a$-exceptionToNumberFormatException-JsonElementKt$long$1 = 0; l = parseLongImpl($this$long); }
/* 361 */     catch (JsonDecodingException e$iv)
/* 362 */     { throw new NumberFormatException(e$iv.getMessage()); }  return l; } @Nullable public static final Long getLongOrNull(@NotNull JsonPrimitive $this$longOrNull) { Long long_; Intrinsics.checkNotNullParameter($this$longOrNull, "<this>"); int $i$f$exceptionToNull = 0;
/*     */     
/* 364 */     try { int $i$a$-exceptionToNull-JsonElementKt$longOrNull$1 = 0; long_ = Long.valueOf(parseLongImpl($this$longOrNull)); }
/* 365 */     catch (JsonDecodingException e$iv)
/* 366 */     { long_ = null; }  return long_; }
/*     */ 
/*     */   
/*     */   public static final double getDouble(@NotNull JsonPrimitive $this$double) {
/*     */     Intrinsics.checkNotNullParameter($this$double, "<this>");
/*     */     return Double.parseDouble($this$double.getContent());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Double getDoubleOrNull(@NotNull JsonPrimitive $this$doubleOrNull) {
/*     */     Intrinsics.checkNotNullParameter($this$doubleOrNull, "<this>");
/*     */     return StringsKt.toDoubleOrNull($this$doubleOrNull.getContent());
/*     */   }
/*     */   
/*     */   public static final float getFloat(@NotNull JsonPrimitive $this$float) {
/*     */     Intrinsics.checkNotNullParameter($this$float, "<this>");
/*     */     return Float.parseFloat($this$float.getContent());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Float getFloatOrNull(@NotNull JsonPrimitive $this$floatOrNull) {
/*     */     Intrinsics.checkNotNullParameter($this$floatOrNull, "<this>");
/*     */     return StringsKt.toFloatOrNull($this$floatOrNull.getContent());
/*     */   }
/*     */   
/*     */   public static final boolean getBoolean(@NotNull JsonPrimitive $this$boolean) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   10: invokestatic toBooleanStrictOrNull : (Ljava/lang/String;)Ljava/lang/Boolean;
/*     */     //   13: dup
/*     */     //   14: ifnull -> 23
/*     */     //   17: invokevirtual booleanValue : ()Z
/*     */     //   20: goto -> 51
/*     */     //   23: pop
/*     */     //   24: new java/lang/IllegalStateException
/*     */     //   27: dup
/*     */     //   28: new java/lang/StringBuilder
/*     */     //   31: dup
/*     */     //   32: invokespecial <init> : ()V
/*     */     //   35: aload_0
/*     */     //   36: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   39: ldc ' does not represent a Boolean'
/*     */     //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   44: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   47: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   50: athrow
/*     */     //   51: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #313	-> 6
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	52	0	$this$boolean	Lkotlinx/serialization/json/JsonPrimitive;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Boolean getBooleanOrNull(@NotNull JsonPrimitive $this$booleanOrNull) {
/*     */     Intrinsics.checkNotNullParameter($this$booleanOrNull, "<this>");
/*     */     return StringOpsKt.toBooleanStrictOrNull($this$booleanOrNull.getContent());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final String getContentOrNull(@NotNull JsonPrimitive $this$contentOrNull) {
/*     */     Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
/*     */     return ($this$contentOrNull instanceof JsonNull) ? null : $this$contentOrNull.getContent();
/*     */   }
/*     */   
/*     */   private static final Void error(JsonElement $this$error, String element) {
/*     */     throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass($this$error.getClass()) + " is not a " + element);
/*     */   }
/*     */   
/*     */   private static final <T> T exceptionToNull(Function0 f) {
/*     */     T t;
/*     */     int $i$f$exceptionToNull = 0;
/*     */     try {
/*     */       t = (T)f.invoke();
/*     */     } catch (JsonDecodingException e) {
/*     */       t = null;
/*     */     } 
/*     */     return t;
/*     */   }
/*     */   
/*     */   private static final <T> T exceptionToNumberFormatException(Function0 f) {
/*     */     Object object;
/*     */     int $i$f$exceptionToNumberFormatException = 0;
/*     */     try {
/*     */       object = f.invoke();
/*     */     } catch (JsonDecodingException e) {
/*     */       throw new NumberFormatException(e.getMessage());
/*     */     } 
/*     */     return (T)object;
/*     */   }
/*     */   
/*     */   @PublishedApi
/*     */   @NotNull
/*     */   public static final Void unexpectedJson(@NotNull String key, @NotNull String expected) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     Intrinsics.checkNotNullParameter(expected, "expected");
/*     */     throw new IllegalArgumentException("Element " + key + " is not a " + expected);
/*     */   }
/*     */   
/*     */   public static final long parseLongImpl(@NotNull JsonPrimitive $this$parseLongImpl) {
/*     */     Intrinsics.checkNotNullParameter($this$parseLongImpl, "<this>");
/*     */     return (new StringJsonLexer($this$parseLongImpl.getContent())).consumeNumericLiteralFully();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonElementKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */