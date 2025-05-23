/*     */ package androidx.collection;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\007\n\002\b\025\032\022\020\003\032\b\022\004\022\002H\0050\004\"\004\b\000\020\005\032\022\020\006\032\b\022\004\022\002H\0050\001\"\004\b\000\020\005\032'\020\006\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t¢\006\002\020\n\0327\020\006\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t2\006\020\013\032\002H\0052\006\020\f\032\0020\t¢\006\002\020\r\032G\020\006\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t2\006\020\013\032\002H\0052\006\020\f\032\0020\t2\006\020\016\032\002H\0052\006\020\017\032\0020\t¢\006\002\020\020\032W\020\006\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t2\006\020\013\032\002H\0052\006\020\f\032\0020\t2\006\020\016\032\002H\0052\006\020\017\032\0020\t2\006\020\021\032\002H\0052\006\020\022\032\0020\t¢\006\002\020\023\032g\020\006\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t2\006\020\013\032\002H\0052\006\020\f\032\0020\t2\006\020\016\032\002H\0052\006\020\017\032\0020\t2\006\020\021\032\002H\0052\006\020\022\032\0020\t2\006\020\024\032\002H\0052\006\020\025\032\0020\t¢\006\002\020\026\032\022\020\027\032\b\022\004\022\002H\0050\004\"\004\b\000\020\005\032'\020\030\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t¢\006\002\020\031\0327\020\030\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t2\006\020\013\032\002H\0052\006\020\f\032\0020\t¢\006\002\020\032\032G\020\030\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t2\006\020\013\032\002H\0052\006\020\f\032\0020\t2\006\020\016\032\002H\0052\006\020\017\032\0020\t¢\006\002\020\033\032W\020\030\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t2\006\020\013\032\002H\0052\006\020\f\032\0020\t2\006\020\016\032\002H\0052\006\020\017\032\0020\t2\006\020\021\032\002H\0052\006\020\022\032\0020\t¢\006\002\020\034\032g\020\030\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\002H\0052\006\020\b\032\0020\t2\006\020\013\032\002H\0052\006\020\f\032\0020\t2\006\020\016\032\002H\0052\006\020\017\032\0020\t2\006\020\021\032\002H\0052\006\020\022\032\0020\t2\006\020\024\032\002H\0052\006\020\025\032\0020\t¢\006\002\020\035\"\026\020\000\032\n\022\006\022\004\030\0010\0020\001X\004¢\006\002\n\000¨\006\036"}, d2 = {"EmptyObjectFloatMap", "Landroidx/collection/MutableObjectFloatMap;", "", "emptyObjectFloatMap", "Landroidx/collection/ObjectFloatMap;", "K", "mutableObjectFloatMapOf", "key1", "value1", "", "(Ljava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key2", "value2", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key3", "value3", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key4", "value4", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key5", "value5", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "objectFloatMap", "objectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "collection"})
/*     */ public final class ObjectFloatMapKt
/*     */ {
/*     */   @NotNull
/*  41 */   private static final MutableObjectFloatMap<Object> EmptyObjectFloatMap = new MutableObjectFloatMap(0);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <K> ObjectFloatMap<K> emptyObjectFloatMap() {
/*  48 */     Intrinsics.checkNotNull(EmptyObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>"); return EmptyObjectFloatMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <K> ObjectFloatMap<K> objectFloatMap() {
/*  55 */     Intrinsics.checkNotNull(EmptyObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>"); return EmptyObjectFloatMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <K> ObjectFloatMap<K> objectFloatMapOf(Object key1, float value1) {
/*  64 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$objectFloatMapOf$1 = 0;
/*  65 */     map.set(key1, value1);
/*     */     return mutableObjectFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <K> ObjectFloatMap<K> objectFloatMapOf(Object key1, float value1, Object key2, float value2) {
/*  78 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$objectFloatMapOf$2 = 0;
/*  79 */     map.set(key1, value1);
/*  80 */     map.set(key2, value2);
/*     */     return mutableObjectFloatMap1;
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
/*     */   @NotNull
/*     */   public static final <K> ObjectFloatMap<K> objectFloatMapOf(Object key1, float value1, Object key2, float value2, Object key3, float value3) {
/*  95 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$objectFloatMapOf$3 = 0;
/*  96 */     map.set(key1, value1);
/*  97 */     map.set(key2, value2);
/*  98 */     map.set(key3, value3);
/*     */     return mutableObjectFloatMap1;
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
/*     */   @NotNull
/*     */   public static final <K> ObjectFloatMap<K> objectFloatMapOf(Object key1, float value1, Object key2, float value2, Object key3, float value3, Object key4, float value4) {
/* 115 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$objectFloatMapOf$4 = 0;
/* 116 */     map.set(key1, value1);
/* 117 */     map.set(key2, value2);
/* 118 */     map.set(key3, value3);
/* 119 */     map.set(key4, value4);
/*     */     return mutableObjectFloatMap1;
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
/*     */   @NotNull
/*     */   public static final <K> ObjectFloatMap<K> objectFloatMapOf(Object key1, float value1, Object key2, float value2, Object key3, float value3, Object key4, float value4, Object key5, float value5) {
/* 138 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$objectFloatMapOf$5 = 0;
/* 139 */     map.set(key1, value1);
/* 140 */     map.set(key2, value2);
/* 141 */     map.set(key3, value3);
/* 142 */     map.set(key4, value4);
/* 143 */     map.set(key5, value5);
/*     */     return mutableObjectFloatMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
/* 149 */     return new MutableObjectFloatMap<>(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(Object key1, float value1) {
/* 158 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$mutableObjectFloatMapOf$1 = 0;
/* 159 */     map.set(key1, value1);
/*     */     return (MutableObjectFloatMap)mutableObjectFloatMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(Object key1, float value1, Object key2, float value2) {
/* 172 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$mutableObjectFloatMapOf$2 = 0;
/* 173 */     map.set(key1, value1);
/* 174 */     map.set(key2, value2);
/*     */     return (MutableObjectFloatMap)mutableObjectFloatMap1;
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
/*     */   @NotNull
/*     */   public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(Object key1, float value1, Object key2, float value2, Object key3, float value3) {
/* 189 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$mutableObjectFloatMapOf$3 = 0;
/* 190 */     map.set(key1, value1);
/* 191 */     map.set(key2, value2);
/* 192 */     map.set(key3, value3);
/*     */     return (MutableObjectFloatMap)mutableObjectFloatMap1;
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
/*     */   @NotNull
/*     */   public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(Object key1, float value1, Object key2, float value2, Object key3, float value3, Object key4, float value4) {
/* 209 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$mutableObjectFloatMapOf$4 = 0;
/* 210 */     map.set(key1, value1);
/* 211 */     map.set(key2, value2);
/* 212 */     map.set(key3, value3);
/* 213 */     map.set(key4, value4);
/*     */     return (MutableObjectFloatMap)mutableObjectFloatMap1;
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
/*     */   @NotNull
/*     */   public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(Object key1, float value1, Object key2, float value2, Object key3, float value3, Object key4, float value4, Object key5, float value5) {
/* 232 */     MutableObjectFloatMap<Object> mutableObjectFloatMap1 = new MutableObjectFloatMap(0, 1, null), map = mutableObjectFloatMap1; int $i$a$-also-ObjectFloatMapKt$mutableObjectFloatMapOf$5 = 0;
/* 233 */     map.set(key1, value1);
/* 234 */     map.set(key2, value2);
/* 235 */     map.set(key3, value3);
/* 236 */     map.set(key4, value4);
/* 237 */     map.set(key5, value5);
/*     */     return (MutableObjectFloatMap)mutableObjectFloatMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\ObjectFloatMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */