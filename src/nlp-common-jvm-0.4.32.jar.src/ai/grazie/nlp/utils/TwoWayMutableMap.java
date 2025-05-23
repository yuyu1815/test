/*    */ package ai.grazie.nlp.utils;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020$\n\002\b\002\n\002\020\b\n\000\n\002\020%\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\016\n\002\020\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\000 8*\004\b\000\020\001*\004\b\001\020\0022\0020\003:\00278B\033\b\026\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005¢\006\002\020\006BE\b\021\022\006\020\007\032\0020\b\022\024\020\t\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\n\022\024\020\013\032\020\022\004\022\0028\001\022\004\022\0028\000\030\0010\n\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B1\022\024\b\002\020\t\032\016\022\004\022\0028\000\022\004\022\0028\0010\n\022\024\b\002\020\013\032\016\022\004\022\0028\001\022\004\022\0028\0000\n¢\006\002\020\017J\023\020\030\032\0020\0312\006\020\032\032\0028\000¢\006\002\020\033J\023\020\034\032\0020\0312\006\020\035\032\0028\001¢\006\002\020\033J\025\020\036\032\004\030\0018\0012\006\020\032\032\0028\000¢\006\002\020\037J\033\020 \032\0028\0012\006\020\032\032\0028\0002\006\020!\032\0028\001¢\006\002\020\"J\025\020#\032\004\030\0018\0002\006\020\035\032\0028\001¢\006\002\020\037J\033\020$\032\0028\0002\006\020\035\032\0028\0012\006\020!\032\0028\000¢\006\002\020\"J\006\020%\032\0020\031J\006\020&\032\0020\031J\033\020'\032\0020(2\006\020\032\032\0028\0002\006\020\035\032\0028\001¢\006\002\020)J\033\020*\032\0020(2\006\020\035\032\0028\0012\006\020\032\032\0028\000¢\006\002\020)JZ\020+\032\0020(\"\004\b\002\020,\"\004\b\003\020-2\022\020.\032\016\022\004\022\002H,\022\004\022\002H-0\0002\006\020/\032\002002\006\0201\032\002022\f\0203\032\b\022\004\022\002H,042\f\0205\032\b\022\004\022\002H-04HÁ\001¢\006\002\b6R\035\020\020\032\016\022\004\022\0028\000\022\004\022\0028\0010\0058F¢\006\006\032\004\b\021\020\022R\035\020\023\032\016\022\004\022\0028\001\022\004\022\0028\0000\0058F¢\006\006\032\004\b\024\020\022R\032\020\t\032\016\022\004\022\0028\000\022\004\022\0028\0010\nX\004¢\006\002\n\000R\021\020\025\032\0020\b8F¢\006\006\032\004\b\026\020\027R\032\020\013\032\016\022\004\022\0028\001\022\004\022\0028\0000\nX\004¢\006\002\n\000¨\0069"}, d2 = {"Lai/grazie/nlp/utils/TwoWayMutableMap;", "K", "V", "", "map", "", "(Ljava/util/Map;)V", "seen1", "", "keysToValues", "", "valuesToKeys", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Map;Ljava/util/Map;)V", "entriesKeysToValues", "getEntriesKeysToValues", "()Ljava/util/Map;", "entriesValuesToKeys", "getEntriesValuesToKeys", "size", "getSize", "()I", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "getByKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "getByKeyOrDefault", "default", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getByValue", "getByValueOrDefault", "isEmpty", "isNotEmpty", "setByKey", "", "(Ljava/lang/Object;Ljava/lang/Object;)V", "setByValue", "write$Self", "T0", "T1", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "typeSerial1", "write$Self$nlp_common", "$serializer", "Companion", "nlp-common"})
/*    */ @SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nai/grazie/nlp/utils/TwoWayMutableMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1557#2:46\n1628#2,3:47\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nai/grazie/nlp/utils/TwoWayMutableMap\n*L\n12#1:46\n12#1:47,3\n*E\n"})
/*    */ public final class TwoWayMutableMap<K, V> {
/*    */   @NotNull
/*  6 */   public static final Companion Companion = new Companion(null); @NotNull private final Map<K, V> keysToValues; @NotNull private final Map<V, K> valuesToKeys; @JvmField
/*    */   @NotNull
/*  8 */   private static final SerialDescriptor $cachedDescriptor; public TwoWayMutableMap(@NotNull Map<K, V> keysToValues, @NotNull Map<V, K> valuesToKeys) { this.keysToValues = keysToValues;
/*  9 */     this.valuesToKeys = valuesToKeys; }
/*    */   static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.nlp.utils.TwoWayMutableMap", null, 2); pluginGeneratedSerialDescriptor.addElement("keysToValues", true);
/*    */     pluginGeneratedSerialDescriptor.addElement("valuesToKeys", true);
/* 12 */     $cachedDescriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor; } public TwoWayMutableMap(@NotNull Map map) { this(
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 46 */         map1, MapsKt.toMap(list, new HashMap<>())); }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\021\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\b\007\030\000*\004\b\002\020\001*\004\b\003\020\0022\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0040\003B\007\b\002¢\006\002\020\005B#\b\027\022\f\020\006\032\b\022\004\022\0028\0020\007\022\f\020\b\032\b\022\004\022\0028\0030\007¢\006\002\020\tJ\030\020\021\032\f\022\b\022\006\022\002\b\0030\0070\022HÖ\001¢\006\002\020\023J\035\020\024\032\016\022\004\022\0028\000\022\004\022\0028\0010\0042\006\020\025\032\0020\026HÖ\001J%\020\027\032\0020\0302\006\020\031\032\0020\0322\022\020\033\032\016\022\004\022\0028\000\022\004\022\0028\0010\004HÖ\001J\030\020\034\032\f\022\b\022\006\022\002\b\0030\0070\022HÖ\001¢\006\002\020\023R\024\020\n\032\0020\0138VXÖ\005¢\006\006\032\004\b\f\020\rR\032\020\006\032\b\022\004\022\0028\0020\0078BXÂ\005¢\006\006\032\004\b\016\020\017R\032\020\b\032\b\022\004\022\0028\0030\0078BXÂ\005¢\006\006\032\004\b\020\020\017¨\006\035"}, d2 = {"ai/grazie/nlp/utils/TwoWayMutableMap.$serializer", "K", "V", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/nlp/utils/TwoWayMutableMap;", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "typeSerial1", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getTypeSerial0", "()Lkotlinx/serialization/KSerializer;", "getTypeSerial1", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "nlp-common"})
/*    */   public static final class $serializer<K, V> implements GeneratedSerializer<TwoWayMutableMap<K, V>> {
/*    */     private $serializer() {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.nlp.utils.TwoWayMutableMap", this, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("keysToValues", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("valuesToKeys", true);
/*    */       this.descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)this.descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)new LinkedHashMapSerializer(this.typeSerial0, this.typeSerial1);
/*    */       arrayOfKSerializer[1] = (KSerializer)new LinkedHashMapSerializer(this.typeSerial1, this.typeSerial0);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public TwoWayMutableMap<K, V> deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Map map1 = null, map2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         map1 = (Map)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new LinkedHashMapSerializer(this.typeSerial0, this.typeSerial1), map1);
/*    */         i |= 0x1;
/*    */         map2 = (Map)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new LinkedHashMapSerializer(this.typeSerial1, this.typeSerial0), map2);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               map1 = (Map)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new LinkedHashMapSerializer(this.typeSerial0, this.typeSerial1), map1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               map2 = (Map)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)new LinkedHashMapSerializer(this.typeSerial1, this.typeSerial0), map2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new TwoWayMutableMap<>(i, map1, map2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull TwoWayMutableMap value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       TwoWayMutableMap.write$Self$nlp_common(value, compositeEncoder, serialDescriptor, this.typeSerial0, this.typeSerial1);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = this.typeSerial0;
/*    */       arrayOfKSerializer[1] = this.typeSerial1;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     private final KSerializer<K> getTypeSerial0() {
/*    */       return (KSerializer)this.typeSerial0;
/*    */     }
/*    */     
/*    */     private final KSerializer<V> getTypeSerial1() {
/*    */       return (KSerializer)this.typeSerial1;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002JC\020\003\032\024\022\020\022\016\022\004\022\002H\006\022\004\022\002H\0070\0050\004\"\004\b\002\020\006\"\004\b\003\020\0072\f\020\b\032\b\022\004\022\002H\0060\0042\f\020\t\032\b\022\004\022\002H\0070\004HÆ\001¨\006\n"}, d2 = {"Lai/grazie/nlp/utils/TwoWayMutableMap$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/nlp/utils/TwoWayMutableMap;", "T0", "T1", "typeSerial0", "typeSerial1", "nlp-common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final <T0, T1> KSerializer<TwoWayMutableMap<T0, T1>> serializer(@NotNull KSerializer typeSerial0, @NotNull KSerializer typeSerial1) {
/*    */       Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
/*    */       Intrinsics.checkNotNullParameter(typeSerial1, "typeSerial1");
/*    */       return (KSerializer<TwoWayMutableMap<T0, T1>>)new TwoWayMutableMap.$serializer<>(typeSerial0, typeSerial1);
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final V getByKey(Object key) {
/*    */     return this.keysToValues.get(key);
/*    */   }
/*    */   
/*    */   public final V getByKeyOrDefault(Object key, Object default) {
/*    */     if (getByKey((K)key) == null)
/*    */       getByKey((K)key); 
/*    */     return (V)default;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final K getByValue(Object value) {
/*    */     return this.valuesToKeys.get(value);
/*    */   }
/*    */   
/*    */   public final K getByValueOrDefault(Object value, Object default) {
/*    */     if (getByValue((V)value) == null)
/*    */       getByValue((V)value); 
/*    */     return (K)default;
/*    */   }
/*    */   
/*    */   public final boolean containsKey(Object key) {
/*    */     return this.keysToValues.containsKey(key);
/*    */   }
/*    */   
/*    */   public final boolean containsValue(Object value) {
/*    */     return this.valuesToKeys.containsKey(value);
/*    */   }
/*    */   
/*    */   public final void setByKey(Object key, Object value) {
/*    */     this.keysToValues.put((K)key, (V)value);
/*    */     this.valuesToKeys.put((V)value, (K)key);
/*    */   }
/*    */   
/*    */   public final void setByValue(Object value, Object key) {
/*    */     this.keysToValues.put((K)key, (V)value);
/*    */     this.valuesToKeys.put((V)value, (K)key);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<K, V> getEntriesKeysToValues() {
/*    */     return this.keysToValues;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<V, K> getEntriesValuesToKeys() {
/*    */     return this.valuesToKeys;
/*    */   }
/*    */   
/*    */   public final int getSize() {
/*    */     return this.keysToValues.size();
/*    */   }
/*    */   
/*    */   public final boolean isEmpty() {
/*    */     return (getSize() == 0);
/*    */   }
/*    */   
/*    */   public final boolean isNotEmpty() {
/*    */     return !isEmpty();
/*    */   }
/*    */   
/*    */   public TwoWayMutableMap() {
/*    */     this((Map)null, (Map)null, 3, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\TwoWayMutableMap.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */