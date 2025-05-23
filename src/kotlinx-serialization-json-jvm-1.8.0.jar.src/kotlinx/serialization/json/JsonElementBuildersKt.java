/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000L\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\013\n\000\n\002\020\004\n\002\020\001\n\002\b\006\n\002\020\036\n\002\b\004\0322\020\000\032\0020\0012\027\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006H\bø\001\000\002\n\n\b\b\001\022\002\020\001 \001\0322\020\007\032\0020\b2\027\020\002\032\023\022\004\022\0020\t\022\004\022\0020\0050\003¢\006\002\b\006H\bø\001\000\002\n\n\b\b\001\022\002\020\001 \001\032-\020\n\032\004\030\0010\013*\0020\0042\006\020\f\032\0020\r2\027\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006\032-\020\016\032\004\030\0010\013*\0020\0042\006\020\f\032\0020\r2\027\020\002\032\023\022\004\022\0020\t\022\004\022\0020\0050\003¢\006\002\b\006\032#\020\017\032\004\030\0010\013*\0020\0042\006\020\f\032\0020\r2\b\020\020\032\004\030\0010\021¢\006\002\020\022\032\036\020\017\032\004\030\0010\013*\0020\0042\006\020\f\032\0020\r2\b\020\020\032\004\030\0010\023\032\036\020\017\032\004\030\0010\013*\0020\0042\006\020\f\032\0020\r2\b\020\020\032\004\030\0010\r\032 \020\017\032\004\030\0010\013*\0020\0042\006\020\f\032\0020\r2\b\020\020\032\004\030\0010\024H\007\032\031\020\025\032\0020\021*\0020\t2\b\020\020\032\004\030\0010\021¢\006\002\020\026\032\024\020\025\032\0020\021*\0020\t2\b\020\020\032\004\030\0010\023\032\024\020\025\032\0020\021*\0020\t2\b\020\020\032\004\030\0010\r\032\026\020\025\032\0020\021*\0020\t2\b\020\020\032\004\030\0010\024H\007\032#\020\027\032\0020\021*\0020\t2\027\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006\032#\020\030\032\0020\021*\0020\t2\027\020\002\032\023\022\004\022\0020\t\022\004\022\0020\0050\003¢\006\002\b\006\032!\020\031\032\0020\021*\0020\t2\016\020\032\032\n\022\006\022\004\030\0010\r0\033H\007¢\006\002\b\034\032!\020\031\032\0020\021*\0020\t2\016\020\032\032\n\022\006\022\004\030\0010\0210\033H\007¢\006\002\b\035\032!\020\031\032\0020\021*\0020\t2\016\020\032\032\n\022\006\022\004\030\0010\0230\033H\007¢\006\002\b\036\002\007\n\005\b20\001¨\006\037"}, d2 = {"buildJsonObject", "Lkotlinx/serialization/json/JsonObject;", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonObjectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "buildJsonArray", "Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonArrayBuilder;", "putJsonObject", "Lkotlinx/serialization/json/JsonElement;", "key", "", "putJsonArray", "put", "value", "", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonElement;", "", "", "add", "(Lkotlinx/serialization/json/JsonArrayBuilder;Ljava/lang/Boolean;)Z", "addJsonObject", "addJsonArray", "addAll", "values", "", "addAllStrings", "addAllBooleans", "addAllNumbers", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nJsonElementBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n29#1,3:232\n52#1,3:235\n29#1,3:238\n52#1,3:241\n1557#2:244\n1628#2,3:245\n1557#2:248\n1628#2,3:249\n1557#2:252\n1628#2,3:253\n*S KotlinDebug\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n82#1:232,3\n90#1:235,3\n189#1:238,3\n197#1:241,3\n207#1:244\n207#1:245,3\n217#1:248\n217#1:249,3\n227#1:252\n227#1:253,3\n*E\n"})
/*     */ public final class JsonElementBuildersKt
/*     */ {
/*     */   @NotNull
/*     */   public static final JsonObject buildJsonObject(@NotNull Function1 builderAction) {
/*  29 */     Intrinsics.checkNotNullParameter(builderAction, "builderAction"); int $i$f$buildJsonObject = 0; JsonObjectBuilder builder = new JsonObjectBuilder();
/*  30 */     builderAction.invoke(builder);
/*  31 */     return builder.build();
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
/*     */   @NotNull
/*     */   public static final JsonArray buildJsonArray(@NotNull Function1 builderAction) {
/*  52 */     Intrinsics.checkNotNullParameter(builderAction, "builderAction"); int $i$f$buildJsonArray = 0; JsonArrayBuilder builder = new JsonArrayBuilder();
/*  53 */     builderAction.invoke(builder);
/*  54 */     return builder.build();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static final JsonElement putJsonObject(@NotNull JsonObjectBuilder $this$putJsonObject, @NotNull String key, @NotNull Function1 builderAction)
/*     */   {
/*  82 */     Intrinsics.checkNotNullParameter($this$putJsonObject, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(builderAction, "builderAction"); int $i$f$buildJsonObject = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 232 */     JsonObjectBuilder builder$iv = new JsonObjectBuilder();
/* 233 */     builderAction.invoke(builder$iv);
/* 234 */     return $this$putJsonObject.put(key, builder$iv.build()); } @Nullable public static final JsonElement putJsonArray(@NotNull JsonObjectBuilder $this$putJsonArray, @NotNull String key, @NotNull Function1 builderAction) { Intrinsics.checkNotNullParameter($this$putJsonArray, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(builderAction, "builderAction"); int $i$f$buildJsonArray = 0;
/* 235 */     JsonArrayBuilder builder$iv = new JsonArrayBuilder();
/* 236 */     builderAction.invoke(builder$iv);
/* 237 */     return $this$putJsonArray.put(key, builder$iv.build()); }
/* 238 */   @Nullable public static final JsonElement put(@NotNull JsonObjectBuilder $this$put, @NotNull String key, @Nullable Boolean value) { Intrinsics.checkNotNullParameter($this$put, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); return $this$put.put(key, JsonElementKt.JsonPrimitive(value)); } @Nullable public static final JsonElement put(@NotNull JsonObjectBuilder $this$put, @NotNull String key, @Nullable Number value) { Intrinsics.checkNotNullParameter($this$put, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); return $this$put.put(key, JsonElementKt.JsonPrimitive(value)); } @Nullable public static final JsonElement put(@NotNull JsonObjectBuilder $this$put, @NotNull String key, @Nullable String value) { Intrinsics.checkNotNullParameter($this$put, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); return $this$put.put(key, JsonElementKt.JsonPrimitive(value)); } @ExperimentalSerializationApi @Nullable public static final JsonElement put(@NotNull JsonObjectBuilder $this$put, @NotNull String key, @Nullable Void value) { Intrinsics.checkNotNullParameter($this$put, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); return $this$put.put(key, JsonNull.INSTANCE); } public static final boolean addJsonObject(@NotNull JsonArrayBuilder $this$addJsonObject, @NotNull Function1 builderAction) { Intrinsics.checkNotNullParameter($this$addJsonObject, "<this>"); Intrinsics.checkNotNullParameter(builderAction, "builderAction"); int $i$f$buildJsonObject = 0; JsonObjectBuilder builder$iv = new JsonObjectBuilder();
/* 239 */     builderAction.invoke(builder$iv);
/* 240 */     return $this$addJsonObject.add(builder$iv.build()); }
/* 241 */   public static final boolean add(@NotNull JsonArrayBuilder $this$add, @Nullable Boolean value) { Intrinsics.checkNotNullParameter($this$add, "<this>"); return $this$add.add(JsonElementKt.JsonPrimitive(value)); } public static final boolean add(@NotNull JsonArrayBuilder $this$add, @Nullable Number value) { Intrinsics.checkNotNullParameter($this$add, "<this>"); return $this$add.add(JsonElementKt.JsonPrimitive(value)); } public static final boolean add(@NotNull JsonArrayBuilder $this$add, @Nullable String value) { Intrinsics.checkNotNullParameter($this$add, "<this>"); return $this$add.add(JsonElementKt.JsonPrimitive(value)); } @ExperimentalSerializationApi public static final boolean add(@NotNull JsonArrayBuilder $this$add, @Nullable Void value) { Intrinsics.checkNotNullParameter($this$add, "<this>"); return $this$add.add(JsonNull.INSTANCE); } public static final boolean addJsonArray(@NotNull JsonArrayBuilder $this$addJsonArray, @NotNull Function1 builderAction) { Intrinsics.checkNotNullParameter($this$addJsonArray, "<this>"); Intrinsics.checkNotNullParameter(builderAction, "builderAction"); int $i$f$buildJsonArray = 0; JsonArrayBuilder builder$iv = new JsonArrayBuilder();
/* 242 */     builderAction.invoke(builder$iv);
/* 243 */     return $this$addJsonArray.add(builder$iv.build()); } @ExperimentalSerializationApi @JvmName(name = "addAllStrings") public static final boolean addAllStrings(@NotNull JsonArrayBuilder $this$addAll, @NotNull Collection values) { Intrinsics.checkNotNullParameter($this$addAll, "<this>"); Intrinsics.checkNotNullParameter(values, "values"); Collection collection1 = values; JsonArrayBuilder jsonArrayBuilder = $this$addAll; int $i$f$map = 0;
/* 244 */     Collection collection2 = collection1; Collection<JsonPrimitive> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); int $i$f$mapTo = 0;
/* 245 */     for (Object item$iv$iv : collection2) {
/* 246 */       String str = (String)item$iv$iv; Collection<JsonPrimitive> collection = destination$iv$iv; int $i$a$-map-JsonElementBuildersKt$addAll$1 = 0; collection.add(JsonElementKt.JsonPrimitive(str));
/* 247 */     }  return jsonArrayBuilder.addAll((List)destination$iv$iv); } @ExperimentalSerializationApi @JvmName(name = "addAllBooleans") public static final boolean addAllBooleans(@NotNull JsonArrayBuilder $this$addAll, @NotNull Collection values) { Intrinsics.checkNotNullParameter($this$addAll, "<this>"); Intrinsics.checkNotNullParameter(values, "values"); Collection collection1 = values; JsonArrayBuilder jsonArrayBuilder = $this$addAll; int $i$f$map = 0;
/* 248 */     Collection collection2 = collection1; Collection<JsonPrimitive> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); int $i$f$mapTo = 0;
/* 249 */     for (Object item$iv$iv : collection2) {
/* 250 */       Boolean bool = (Boolean)item$iv$iv; Collection<JsonPrimitive> collection = destination$iv$iv; int $i$a$-map-JsonElementBuildersKt$addAll$2 = 0; collection.add(JsonElementKt.JsonPrimitive(bool));
/* 251 */     }  return jsonArrayBuilder.addAll((List)destination$iv$iv); } @ExperimentalSerializationApi @JvmName(name = "addAllNumbers") public static final boolean addAllNumbers(@NotNull JsonArrayBuilder $this$addAll, @NotNull Collection values) { Intrinsics.checkNotNullParameter($this$addAll, "<this>"); Intrinsics.checkNotNullParameter(values, "values"); Collection collection1 = values; JsonArrayBuilder jsonArrayBuilder = $this$addAll; int $i$f$map = 0;
/* 252 */     Collection collection2 = collection1; Collection<JsonPrimitive> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10)); int $i$f$mapTo = 0;
/* 253 */     for (Object item$iv$iv : collection2) {
/* 254 */       Number number = (Number)item$iv$iv; Collection<JsonPrimitive> collection = destination$iv$iv; int $i$a$-map-JsonElementBuildersKt$addAll$3 = 0; collection.add(JsonElementKt.JsonPrimitive(number));
/* 255 */     }  return jsonArrayBuilder.addAll((List)destination$iv$iv); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonElementBuildersKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */