/*     */ package ai.grazie.utils.mpp.collections;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020$\n\000\n\002\030\002\n\002\b\007\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\013\n\002\020\016\n\000\b\007\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B+\b\000\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\002\020\tJ\023\020\023\032\0020\0242\006\020\025\032\0028\000¢\006\002\020\026J\023\020\027\032\0020\0242\006\020\030\032\0028\001¢\006\002\020\026J\023\020\031\032\0020\0242\b\020\032\032\004\030\0010\003H\002J\030\020\033\032\004\030\0018\0012\006\020\025\032\0028\000H\002¢\006\002\020\034J\b\020\035\032\0020\017H\026J\006\020\036\032\0020\024J\b\020\037\032\0020 H\026R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\n\020\013R \020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005X\004¢\006\b\n\000\032\004\b\f\020\rR\021\020\016\032\0020\0178F¢\006\006\032\004\b\020\020\021R\024\020\b\032\0020\007X\004¢\006\b\n\000\032\004\b\022\020\013¨\006!"}, d2 = {"Lai/grazie/utils/mpp/collections/ExportableMap;", "K", "V", "", "map", "", "keyType", "Lai/grazie/utils/mpp/collections/ExportableType;", "valueType", "(Ljava/util/Map;Lai/grazie/utils/mpp/collections/ExportableType;Lai/grazie/utils/mpp/collections/ExportableType;)V", "getKeyType$utils_common", "()Lai/grazie/utils/mpp/collections/ExportableType;", "getMap$utils_common", "()Ljava/util/Map;", "size", "", "getSize", "()I", "getValueType$utils_common", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "isEmpty", "toString", "", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nExportableMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportableMap.kt\nai/grazie/utils/mpp/collections/ExportableMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
/*     */ public final class ExportableMap<K, V> { @NotNull
/*     */   private final Map<K, V> map; @NotNull
/*     */   private final ExportableType keyType; @NotNull
/*     */   private final ExportableType valueType;
/*     */   
/*   8 */   public ExportableMap(@NotNull Map<K, V> map, @NotNull ExportableType keyType, @NotNull ExportableType valueType) { this.map = map;
/*   9 */     this.keyType = keyType;
/*  10 */     this.valueType = valueType;
/*     */ 
/*     */     
/*  13 */     for (Map.Entry<K, V> entry : this.map.entrySet()) { Object key = entry.getKey(), value = entry.getValue();
/*  14 */       if (key != null) { Object it = key;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 114 */         int $i$a$-let-ExportableMap$1 = 0; ExportableTypeKt.requireIsInstance(this.keyType, it); } else {  }  if (value != null) { Object it = value; int $i$a$-let-ExportableMap$2 = 0; ExportableTypeKt.requireIsInstance(this.valueType, it); }  }  } @NotNull public final Map<K, V> getMap$utils_common() { return this.map; } @NotNull public final ExportableType getKeyType$utils_common() { return this.keyType; } public final boolean containsKey(Object key) { if (key != null) { Object it = key; int $i$a$-let-ExportableMap$containsKey$1 = 0; ExportableTypeKt.requireIsInstance(this.keyType, it); } else {  }  return this.map.containsKey(key); } @NotNull public final ExportableType getValueType$utils_common() { return this.valueType; } public final int getSize() { return this.map.size(); } public final boolean containsValue(Object value) { if (value != null) { Object it = value; int $i$a$-let-ExportableMap$containsValue$1 = 0; ExportableTypeKt.requireIsInstance(this.valueType, it); } else {  }  return this.map.containsValue(value); } @Nullable public final V get(Object key) { if (key != null) { Object it = key; int $i$a$-let-ExportableMap$get$1 = 0;
/*     */       ExportableTypeKt.requireIsInstance(this.keyType, it); }
/*     */     else
/*     */     {  }
/*     */     
/*     */     return this.map.get(key); }
/*     */ 
/*     */   
/*     */   public final boolean isEmpty() {
/*     */     return this.map.isEmpty();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (other == null || getClass() != other.getClass())
/*     */       return false; 
/*     */     (ExportableMap)other;
/*     */     if (!Intrinsics.areEqual(this.map, ((ExportableMap)other).map))
/*     */       return false; 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.map.hashCode();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ExportableMap(map=" + this.map + ")";
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\collections\ExportableMap.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */