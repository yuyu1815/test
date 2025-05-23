/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020%\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\005\b\000\030\0002\0020\001:\001\026B\007¢\006\004\b\002\020\003J6\020\t\032\0020\n\"\b\b\000\020\013*\0020\0012\006\020\f\032\0020\0062\f\020\r\032\b\022\004\022\002H\0130\0072\006\020\016\032\002H\013H\002¢\006\002\020\017J9\020\020\032\002H\013\"\b\b\000\020\013*\0020\0012\006\020\f\032\0020\0062\f\020\r\032\b\022\004\022\002H\0130\0072\f\020\021\032\b\022\004\022\002H\0130\022¢\006\002\020\023J0\020\024\032\004\030\001H\013\"\b\b\000\020\013*\0020\0012\006\020\f\032\0020\0062\f\020\r\032\b\022\004\022\002H\0130\007H\002¢\006\002\020\025R6\020\004\032*\022\004\022\0020\006\022 \022\036\022\n\022\b\022\004\022\0020\0010\007\022\004\022\0020\0010\005j\b\022\004\022\0020\001`\b0\005X\004¢\006\002\n\000¨\006\027"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "", "<init>", "()V", "map", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "Lkotlinx/serialization/json/internal/DescriptorData;", "set", "", "T", "descriptor", "key", "value", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Ljava/lang/Object;)V", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;)Ljava/lang/Object;", "Key", "kotlinx-serialization-json"})
/*    */ @SourceDebugExtension({"SMAP\nSchemaCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n381#2,7:54\n1#3:61\n*S KotlinDebug\n*F\n+ 1 SchemaCache.kt\nkotlinx/serialization/json/internal/DescriptorSchemaCache\n*L\n25#1:54,7\n*E\n"})
/*    */ public final class DescriptorSchemaCache
/*    */ {
/*    */   @NotNull
/* 20 */   private final Map<SerialDescriptor, Map<Key<Object>, Object>> map = CreateMapForCacheKt.createMapForCache(16);
/*    */ 
/*    */ 
/*    */   
/*    */   public final <T> void set(@NotNull SerialDescriptor descriptor, @NotNull Key key, @NotNull Object value) {
/* 25 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); Map<SerialDescriptor, Map<Key<Object>, Object>> $this$getOrPut$iv = this.map; int $i$f$getOrPut = 0;
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
/* 54 */     Object<Key<Object>, Object> value$iv = (Object<Key<Object>, Object>)$this$getOrPut$iv.get(descriptor);
/* 55 */     if (value$iv == null) {
/* 56 */       int $i$a$-getOrPut-DescriptorSchemaCache$set$1 = 0; Object<?, ?> answer$iv = (Object<?, ?>)CreateMapForCacheKt.createMapForCache(2);
/* 57 */       $this$getOrPut$iv.put(descriptor, answer$iv);
/*    */     } 
/*    */     
/* 60 */     $this$getOrPut$iv = (Map)value$iv; Key key1 = key; value$iv = (Object<Key<Object>, Object>)value; $this$getOrPut$iv.put(key1, value$iv); } @NotNull public final <T> T getOrPut(@NotNull SerialDescriptor descriptor, @NotNull Key<?> key, @NotNull Function0 defaultValue) { Intrinsics.checkNotNullParameter(descriptor, "descriptor"); Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); if (get(descriptor, key) != null) {
/* 61 */       Object it = get(descriptor, key); int $i$a$-let-DescriptorSchemaCache$getOrPut$1 = 0;
/*    */       return (T)it;
/*    */     } 
/*    */     get(descriptor, key);
/*    */     Object value = defaultValue.invoke();
/*    */     set(descriptor, key, value);
/*    */     return (T)value; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final <T> T get(@NotNull SerialDescriptor descriptor, @NotNull Key key) {
/*    */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     (Map)this.map.get(descriptor);
/*    */     if ((((Map)this.map.get(descriptor) != null) ? ((Map)this.map.get(descriptor)).get(key) : null) == null)
/*    */       ((Map)this.map.get(descriptor) != null) ? ((Map)this.map.get(descriptor)).get(key) : null; 
/*    */     return null;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\000\n\002\b\003\030\000*\b\b\000\020\001*\0020\0022\0020\002B\007¢\006\004\b\003\020\004¨\006\005"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "T", "", "<init>", "()V", "kotlinx-serialization-json"})
/*    */   public static final class Key<T> {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\DescriptorSchemaCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */