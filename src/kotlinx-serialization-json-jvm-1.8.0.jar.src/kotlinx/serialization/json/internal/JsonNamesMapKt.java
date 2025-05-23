/*     */ package kotlinx.serialization.json.internal;
/*     */ import java.util.Map;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonNamingStrategy;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000V\n\000\n\002\030\002\n\002\020$\n\002\020\016\n\002\020\b\n\002\b\003\n\002\020\021\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\032 \020\n\032\016\022\004\022\0020\003\022\004\022\0020\0040\002*\0020\0132\006\020\f\032\0020\rH\002\032 \020\016\032\016\022\004\022\0020\003\022\004\022\0020\0040\002*\0020\r2\006\020\017\032\0020\013H\000\032'\020\020\032\b\022\004\022\0020\0030\b*\0020\0132\006\020\f\032\0020\r2\006\020\021\032\0020\022H\000¢\006\002\020\023\032\034\020\024\032\0020\003*\0020\0132\006\020\f\032\0020\r2\006\020\025\032\0020\004H\000\032\026\020\026\032\004\030\0010\022*\0020\0132\006\020\f\032\0020\rH\000\032\034\020\027\032\0020\004*\0020\0132\006\020\f\032\0020\r2\006\020\030\032\0020\003H\002\032\024\020\031\032\0020\032*\0020\r2\006\020\017\032\0020\013H\002\032\034\020\033\032\0020\004*\0020\0132\006\020\f\032\0020\r2\006\020\030\032\0020\003H\000\032&\020\034\032\0020\004*\0020\0132\006\020\f\032\0020\r2\006\020\030\032\0020\0032\b\b\002\020\035\032\0020\003H\000\032c\020\036\032\0020\032*\0020\r2\006\020\017\032\0020\0132\006\020\025\032\0020\0042!\020\037\032\035\022\023\022\0210\032¢\006\f\b!\022\b\b\030\022\004\b\b(\"\022\004\022\0020\0320 2\016\020#\032\n\022\006\022\004\030\0010\0030$2\016\b\002\020%\032\b\022\004\022\0020&0$H\bø\001\000\032\024\020'\032\0020\032*\0020\0132\006\020\f\032\0020\rH\000\"&\020\000\032\024\022\020\022\016\022\004\022\0020\003\022\004\022\0020\0040\0020\001X\004¢\006\b\n\000\032\004\b\005\020\006\" \020\007\032\016\022\n\022\b\022\004\022\0020\0030\b0\001X\004¢\006\b\n\000\032\004\b\t\020\006\002\007\n\005\b20\001¨\006("}, d2 = {"JsonDeserializationNamesKey", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "", "", "", "getJsonDeserializationNamesKey", "()Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "JsonSerializationNamesKey", "", "getJsonSerializationNamesKey", "buildDeserializationNamesMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "json", "Lkotlinx/serialization/json/Json;", "deserializationNamesMap", "descriptor", "serializationNamesIndices", "strategy", "Lkotlinx/serialization/json/JsonNamingStrategy;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonNamingStrategy;)[Ljava/lang/String;", "getJsonElementName", "index", "namingStrategy", "getJsonNameIndexSlowPath", "name", "decodeCaseInsensitive", "", "getJsonNameIndex", "getJsonNameIndexOrThrow", "suffix", "tryCoerceValue", "peekNull", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "consume", "peekString", "Lkotlin/Function0;", "onEnumCoercing", "", "ignoreUnknownKeys", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n808#2,11:156\n1755#2,3:170\n13402#3,2:167\n1#4:169\n*S KotlinDebug\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n*L\n35#1:156,11\n154#1:170,3\n35#1:167,2\n*E\n"})
/*     */ public final class JsonNamesMapKt {
/*     */   @NotNull
/*  14 */   private static final DescriptorSchemaCache.Key<Map<String, Integer>> JsonDeserializationNamesKey = new DescriptorSchemaCache.Key<>(); @NotNull public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonDeserializationNamesKey() { return JsonDeserializationNamesKey; }
/*     */    @NotNull
/*  16 */   private static final DescriptorSchemaCache.Key<String[]> JsonSerializationNamesKey = (DescriptorSchemaCache.Key)new DescriptorSchemaCache.Key<>(); @NotNull public static final DescriptorSchemaCache.Key<String[]> getJsonSerializationNamesKey() { return JsonSerializationNamesKey; }
/*     */ 
/*     */   
/*     */   private static final void buildDeserializationNamesMap$putOrThrow(Map<String, Integer> $this$buildDeserializationNamesMap_u24putOrThrow, SerialDescriptor $this_buildDeserializationNamesMap, String name, int index) {
/*  20 */     String entity = Intrinsics.areEqual($this_buildDeserializationNamesMap.getKind(), SerialKind.ENUM.INSTANCE) ? "enum value" : "property";
/*  21 */     if ($this$buildDeserializationNamesMap_u24putOrThrow.containsKey(name)) {
/*  22 */       throw new JsonException(
/*  23 */           "The suggested name '" + name + "' for " + entity + ' ' + $this_buildDeserializationNamesMap.getElementName(index) + " is already one of the names for " + entity + ' ' + 
/*  24 */           $this_buildDeserializationNamesMap.getElementName(((Number)MapsKt.getValue($this$buildDeserializationNamesMap_u24putOrThrow, name)).intValue()) + " in " + $this_buildDeserializationNamesMap);
/*     */     }
/*     */     Integer integer = Integer.valueOf(index);
/*  27 */     $this$buildDeserializationNamesMap_u24putOrThrow.put(name, integer); } private static final Map<String, Integer> buildDeserializationNamesMap(SerialDescriptor $this$buildDeserializationNamesMap, Json json) { String[] arrayOfString;
/*     */     byte b;
/*     */     int $i$f$filterIsInstanceTo;
/*  30 */     Map<Object, Object> builder = 
/*  31 */       new LinkedHashMap<>();
/*  32 */     boolean useLowercaseEnums = decodeCaseInsensitive(json, $this$buildDeserializationNamesMap);
/*  33 */     JsonNamingStrategy strategyForClasses = namingStrategy($this$buildDeserializationNamesMap, json);
/*  34 */     int i = 0, j = $this$buildDeserializationNamesMap.getElementsCount(); if (i < j)
/*  35 */     { Iterable $this$filterIsInstance$iv = $this$buildDeserializationNamesMap.getElementAnnotations(i); int $i$f$filterIsInstance = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 156 */       Iterable iterable1 = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 165 */       for (Object element$iv$iv : iterable1) { if (element$iv$iv instanceof JsonNames) destination$iv$iv.add(element$iv$iv);  }
/* 166 */        if ((JsonNames)CollectionsKt.singleOrNull((List)destination$iv$iv) != null && ((JsonNames)CollectionsKt.singleOrNull((List)destination$iv$iv)).names() != null) { arrayOfString = ((JsonNames)CollectionsKt.singleOrNull((List)destination$iv$iv)).names(); int $i$f$forEach = 0;
/* 167 */         b = 0; $i$f$filterIsInstanceTo = arrayOfString.length; } else { ((JsonNames)CollectionsKt.singleOrNull((List)destination$iv$iv)).names(); Intrinsics.checkNotNullExpressionValue($this$buildDeserializationNamesMap.getElementName(i).toLowerCase(Locale.ROOT), "toLowerCase(...)"); }
/*     */        }
/* 169 */     else { Map<Object, Object> map = builder; int $i$a$-ifEmpty-JsonNamesMapKt$buildDeserializationNamesMap$3 = 0;
/*     */       return map.isEmpty() ? MapsKt.emptyMap() : (Map)map; }
/*     */     
/*     */     if (b < $i$f$filterIsInstanceTo) {
/*     */       Object element$iv = arrayOfString[b], object1 = element$iv;
/*     */       int $i$a$-forEach-JsonNamesMapKt$buildDeserializationNamesMap$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(object1.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */     }  }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Map<String, Integer> deserializationNamesMap(@NotNull Json $this$deserializationNamesMap, @NotNull SerialDescriptor descriptor) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'descriptor'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: invokestatic getSchemaCache : (Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/internal/DescriptorSchemaCache;
/*     */     //   16: aload_1
/*     */     //   17: getstatic kotlinx/serialization/json/internal/JsonNamesMapKt.JsonDeserializationNamesKey : Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;
/*     */     //   20: aload_1
/*     */     //   21: aload_0
/*     */     //   22: <illegal opcode> invoke : (Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Lkotlin/jvm/functions/Function0;
/*     */     //   27: invokevirtual getOrPut : (Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*     */     //   30: checkcast java/util/Map
/*     */     //   33: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #54	-> 12
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	34	0	$this$deserializationNamesMap	Lkotlinx/serialization/json/Json;
/*     */     //   0	34	1	descriptor	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */   }
/*     */   
/*     */   private static final Map deserializationNamesMap$lambda$3(SerialDescriptor $descriptor, Json $this_deserializationNamesMap) {
/*     */     return buildDeserializationNamesMap($descriptor, $this_deserializationNamesMap);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String[] serializationNamesIndices(@NotNull SerialDescriptor $this$serializationNamesIndices, @NotNull Json json, @NotNull JsonNamingStrategy strategy) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'json'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'strategy'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_1
/*     */     //   19: invokestatic getSchemaCache : (Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/internal/DescriptorSchemaCache;
/*     */     //   22: aload_0
/*     */     //   23: getstatic kotlinx/serialization/json/internal/JsonNamesMapKt.JsonSerializationNamesKey : Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;
/*     */     //   26: aload_0
/*     */     //   27: aload_2
/*     */     //   28: <illegal opcode> invoke : (Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/JsonNamingStrategy;)Lkotlin/jvm/functions/Function0;
/*     */     //   33: invokevirtual getOrPut : (Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*     */     //   36: checkcast [Ljava/lang/String;
/*     */     //   39: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #57	-> 18
/*     */     //   #62	-> 39
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	40	0	$this$serializationNamesIndices	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	40	1	json	Lkotlinx/serialization/json/Json;
/*     */     //   0	40	2	strategy	Lkotlinx/serialization/json/JsonNamingStrategy;
/*     */   }
/*     */   
/*     */   private static final String[] serializationNamesIndices$lambda$4(SerialDescriptor $this_serializationNamesIndices, JsonNamingStrategy $strategy) {
/*     */     byte b;
/*     */     int i;
/*     */     String[] arrayOfString;
/*     */     for (b = 0, i = $this_serializationNamesIndices.getElementsCount(), arrayOfString = new String[i]; b < i; ) {
/*     */       byte b1 = b;
/*     */       String baseName = $this_serializationNamesIndices.getElementName(b1);
/*     */       arrayOfString[b1] = $strategy.serialNameForJson($this_serializationNamesIndices, b1, baseName);
/*     */       b++;
/*     */     } 
/*     */     return arrayOfString;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String getJsonElementName(@NotNull SerialDescriptor $this$getJsonElementName, @NotNull Json json, int index) {
/*     */     Intrinsics.checkNotNullParameter($this$getJsonElementName, "<this>");
/*     */     Intrinsics.checkNotNullParameter(json, "json");
/*     */     JsonNamingStrategy strategy = namingStrategy($this$getJsonElementName, json);
/*     */     return (strategy == null) ? $this$getJsonElementName.getElementName(index) : serializationNamesIndices($this$getJsonElementName, json, strategy)[index];
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final JsonNamingStrategy namingStrategy(@NotNull SerialDescriptor $this$namingStrategy, @NotNull Json json) {
/*     */     Intrinsics.checkNotNullParameter($this$namingStrategy, "<this>");
/*     */     Intrinsics.checkNotNullParameter(json, "json");
/*     */     return Intrinsics.areEqual($this$namingStrategy.getKind(), StructureKind.CLASS.INSTANCE) ? json.getConfiguration().getNamingStrategy() : null;
/*     */   }
/*     */   
/*     */   private static final int getJsonNameIndexSlowPath(SerialDescriptor $this$getJsonNameIndexSlowPath, Json json, String name) {
/*     */     (Integer)deserializationNamesMap(json, $this$getJsonNameIndexSlowPath).get(name);
/*     */     return ((Integer)deserializationNamesMap(json, $this$getJsonNameIndexSlowPath).get(name) != null) ? ((Integer)deserializationNamesMap(json, $this$getJsonNameIndexSlowPath).get(name)).intValue() : -3;
/*     */   }
/*     */   
/*     */   private static final boolean decodeCaseInsensitive(Json $this$decodeCaseInsensitive, SerialDescriptor descriptor) {
/*     */     return ($this$decodeCaseInsensitive.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.areEqual(descriptor.getKind(), SerialKind.ENUM.INSTANCE));
/*     */   }
/*     */   
/*     */   public static final int getJsonNameIndex(@NotNull SerialDescriptor $this$getJsonNameIndex, @NotNull Json json, @NotNull String name) {
/*     */     Intrinsics.checkNotNullParameter($this$getJsonNameIndex, "<this>");
/*     */     Intrinsics.checkNotNullParameter(json, "json");
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     if (decodeCaseInsensitive(json, $this$getJsonNameIndex)) {
/*     */       Intrinsics.checkNotNullExpressionValue(name.toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */       return getJsonNameIndexSlowPath($this$getJsonNameIndex, json, name.toLowerCase(Locale.ROOT));
/*     */     } 
/*     */     JsonNamingStrategy strategy = namingStrategy($this$getJsonNameIndex, json);
/*     */     if (strategy != null)
/*     */       return getJsonNameIndexSlowPath($this$getJsonNameIndex, json, name); 
/*     */     int index = $this$getJsonNameIndex.getElementIndex(name);
/*     */     if (index != -3)
/*     */       return index; 
/*     */     if (!json.getConfiguration().getUseAlternativeNames())
/*     */       return index; 
/*     */     return getJsonNameIndexSlowPath($this$getJsonNameIndex, json, name);
/*     */   }
/*     */   
/*     */   public static final int getJsonNameIndexOrThrow(@NotNull SerialDescriptor $this$getJsonNameIndexOrThrow, @NotNull Json json, @NotNull String name, @NotNull String suffix) {
/*     */     Intrinsics.checkNotNullParameter($this$getJsonNameIndexOrThrow, "<this>");
/*     */     Intrinsics.checkNotNullParameter(json, "json");
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(suffix, "suffix");
/*     */     int index = getJsonNameIndex($this$getJsonNameIndexOrThrow, json, name);
/*     */     if (index == -3)
/*     */       throw new SerializationException($this$getJsonNameIndexOrThrow.getSerialName() + " does not contain element with name '" + name + '\'' + suffix); 
/*     */     return index;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 176)
/*     */   public static final class JsonNamesMapKt$tryCoerceValue$1 implements Function0<Unit> {
/*     */     public static final JsonNamesMapKt$tryCoerceValue$1 INSTANCE = new JsonNamesMapKt$tryCoerceValue$1();
/*     */     
/*     */     public final void invoke() {}
/*     */   }
/*     */   
/*     */   public static final boolean tryCoerceValue(@NotNull Json $this$tryCoerceValue, @NotNull SerialDescriptor descriptor, int index, @NotNull Function1 peekNull, @NotNull Function0 peekString, @NotNull Function0 onEnumCoercing) {
/*     */     Intrinsics.checkNotNullParameter($this$tryCoerceValue, "<this>");
/*     */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*     */     Intrinsics.checkNotNullParameter(peekNull, "peekNull");
/*     */     Intrinsics.checkNotNullParameter(peekString, "peekString");
/*     */     Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
/*     */     int $i$f$tryCoerceValue = 0;
/*     */     boolean isOptional = descriptor.isElementOptional(index);
/*     */     SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
/*     */     if (isOptional && !elementDescriptor.isNullable() && ((Boolean)peekNull.invoke(Boolean.valueOf(true))).booleanValue())
/*     */       return true; 
/*     */     if (Intrinsics.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE)) {
/*     */       String enumValue;
/*     */       if (elementDescriptor.isNullable() && ((Boolean)peekNull.invoke(Boolean.valueOf(false))).booleanValue())
/*     */         return false; 
/*     */       if ((String)peekString.invoke() == null) {
/*     */         (String)peekString.invoke();
/*     */         return false;
/*     */       } 
/*     */       int enumIndex = getJsonNameIndex(elementDescriptor, $this$tryCoerceValue, enumValue);
/*     */       boolean coerceToNull = (!$this$tryCoerceValue.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable());
/*     */       if (enumIndex == -3 && (isOptional || coerceToNull)) {
/*     */         onEnumCoercing.invoke();
/*     */         return true;
/*     */       } 
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   public static final boolean ignoreUnknownKeys(@NotNull SerialDescriptor $this$ignoreUnknownKeys, @NotNull Json json) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'json'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_1
/*     */     //   13: invokevirtual getConfiguration : ()Lkotlinx/serialization/json/JsonConfiguration;
/*     */     //   16: invokevirtual getIgnoreUnknownKeys : ()Z
/*     */     //   19: ifne -> 110
/*     */     //   22: aload_0
/*     */     //   23: invokeinterface getAnnotations : ()Ljava/util/List;
/*     */     //   28: checkcast java/lang/Iterable
/*     */     //   31: astore_2
/*     */     //   32: iconst_0
/*     */     //   33: istore_3
/*     */     //   34: aload_2
/*     */     //   35: instanceof java/util/Collection
/*     */     //   38: ifeq -> 57
/*     */     //   41: aload_2
/*     */     //   42: checkcast java/util/Collection
/*     */     //   45: invokeinterface isEmpty : ()Z
/*     */     //   50: ifeq -> 57
/*     */     //   53: iconst_0
/*     */     //   54: goto -> 107
/*     */     //   57: aload_2
/*     */     //   58: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   63: astore #4
/*     */     //   65: aload #4
/*     */     //   67: invokeinterface hasNext : ()Z
/*     */     //   72: ifeq -> 106
/*     */     //   75: aload #4
/*     */     //   77: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   82: astore #5
/*     */     //   84: aload #5
/*     */     //   86: checkcast java/lang/annotation/Annotation
/*     */     //   89: astore #6
/*     */     //   91: iconst_0
/*     */     //   92: istore #7
/*     */     //   94: aload #6
/*     */     //   96: instanceof kotlinx/serialization/json/JsonIgnoreUnknownKeys
/*     */     //   99: ifeq -> 65
/*     */     //   102: iconst_1
/*     */     //   103: goto -> 107
/*     */     //   106: iconst_0
/*     */     //   107: ifeq -> 114
/*     */     //   110: iconst_1
/*     */     //   111: goto -> 115
/*     */     //   114: iconst_0
/*     */     //   115: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #154	-> 12
/*     */     //   #170	-> 34
/*     */     //   #171	-> 57
/*     */     //   #154	-> 94
/*     */     //   #171	-> 99
/*     */     //   #172	-> 106
/*     */     //   #154	-> 107
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   94	5	7	$i$a$-any-JsonNamesMapKt$ignoreUnknownKeys$1	I
/*     */     //   91	8	6	it	Ljava/lang/annotation/Annotation;
/*     */     //   84	22	5	element$iv	Ljava/lang/Object;
/*     */     //   34	73	3	$i$f$any	I
/*     */     //   32	75	2	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   0	116	0	$this$ignoreUnknownKeys	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	116	1	json	Lkotlinx/serialization/json/Json;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonNamesMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */