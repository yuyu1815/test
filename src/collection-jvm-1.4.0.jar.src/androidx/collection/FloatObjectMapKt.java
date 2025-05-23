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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\020\001\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\025\032\022\020\003\032\b\022\004\022\002H\0050\004\"\004\b\000\020\005\032\022\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\005\032'\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\005¢\006\002\020\n\0327\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\005¢\006\002\020\r\032G\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\005¢\006\002\020\020\032W\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\005¢\006\002\020\023\032g\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\0052\006\020\024\032\0020\b2\006\020\025\032\002H\005¢\006\002\020\026\032\022\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\005\032'\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\005¢\006\002\020\030\0327\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\005¢\006\002\020\031\032G\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\005¢\006\002\020\032\032W\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\005¢\006\002\020\033\032g\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\0052\006\020\024\032\0020\b2\006\020\025\032\002H\005¢\006\002\020\034\"\024\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\002\n\000¨\006\035"}, d2 = {"EmptyFloatObjectMap", "Landroidx/collection/MutableFloatObjectMap;", "", "emptyFloatObjectMap", "Landroidx/collection/FloatObjectMap;", "V", "floatObjectMapOf", "key1", "", "value1", "(FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key2", "value2", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key3", "value3", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key4", "value4", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key5", "value5", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "mutableFloatObjectMapOf", "(FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "collection"})
/*     */ public final class FloatObjectMapKt
/*     */ {
/*     */   @NotNull
/*  41 */   private static final MutableFloatObjectMap EmptyFloatObjectMap = new MutableFloatObjectMap(0);
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
/*  47 */     Intrinsics.checkNotNull(EmptyFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>"); return EmptyFloatObjectMap;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> FloatObjectMap<V> floatObjectMapOf() {
/*  53 */     Intrinsics.checkNotNull(EmptyFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>"); return EmptyFloatObjectMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> FloatObjectMap<V> floatObjectMapOf(float key1, Object value1) {
/*  61 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$floatObjectMapOf$1 = 0;
/*  62 */     map.set(key1, value1);
/*     */     return mutableFloatObjectMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> FloatObjectMap<V> floatObjectMapOf(float key1, Object value1, float key2, Object value2) {
/*  74 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$floatObjectMapOf$2 = 0;
/*  75 */     map.set(key1, value1);
/*  76 */     map.set(key2, value2);
/*     */     return mutableFloatObjectMap1;
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
/*     */   @NotNull
/*     */   public static final <V> FloatObjectMap<V> floatObjectMapOf(float key1, Object value1, float key2, Object value2, float key3, Object value3) {
/*  90 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$floatObjectMapOf$3 = 0;
/*  91 */     map.set(key1, value1);
/*  92 */     map.set(key2, value2);
/*  93 */     map.set(key3, value3);
/*     */     return mutableFloatObjectMap1;
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
/*     */   @NotNull
/*     */   public static final <V> FloatObjectMap<V> floatObjectMapOf(float key1, Object value1, float key2, Object value2, float key3, Object value3, float key4, Object value4) {
/* 109 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$floatObjectMapOf$4 = 0;
/* 110 */     map.set(key1, value1);
/* 111 */     map.set(key2, value2);
/* 112 */     map.set(key3, value3);
/* 113 */     map.set(key4, value4);
/*     */     return mutableFloatObjectMap1;
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
/*     */   @NotNull
/*     */   public static final <V> FloatObjectMap<V> floatObjectMapOf(float key1, Object value1, float key2, Object value2, float key3, Object value3, float key4, Object value4, float key5, Object value5) {
/* 131 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$floatObjectMapOf$5 = 0;
/* 132 */     map.set(key1, value1);
/* 133 */     map.set(key2, value2);
/* 134 */     map.set(key3, value3);
/* 135 */     map.set(key4, value4);
/* 136 */     map.set(key5, value5);
/*     */     return mutableFloatObjectMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
/* 142 */     return new MutableFloatObjectMap<>(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float key1, Object value1) {
/* 150 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$mutableFloatObjectMapOf$1 = 0;
/* 151 */     map.set(key1, value1);
/*     */     return (MutableFloatObjectMap)mutableFloatObjectMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float key1, Object value1, float key2, Object value2) {
/* 163 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$mutableFloatObjectMapOf$2 = 0;
/* 164 */     map.set(key1, value1);
/* 165 */     map.set(key2, value2);
/*     */     return (MutableFloatObjectMap)mutableFloatObjectMap1;
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
/*     */   @NotNull
/*     */   public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float key1, Object value1, float key2, Object value2, float key3, Object value3) {
/* 179 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$mutableFloatObjectMapOf$3 = 0;
/* 180 */     map.set(key1, value1);
/* 181 */     map.set(key2, value2);
/* 182 */     map.set(key3, value3);
/*     */     return (MutableFloatObjectMap)mutableFloatObjectMap1;
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
/*     */   @NotNull
/*     */   public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float key1, Object value1, float key2, Object value2, float key3, Object value3, float key4, Object value4) {
/* 198 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$mutableFloatObjectMapOf$4 = 0;
/* 199 */     map.set(key1, value1);
/* 200 */     map.set(key2, value2);
/* 201 */     map.set(key3, value3);
/* 202 */     map.set(key4, value4);
/*     */     return (MutableFloatObjectMap)mutableFloatObjectMap1;
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
/*     */   @NotNull
/*     */   public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float key1, Object value1, float key2, Object value2, float key3, Object value3, float key4, Object value4, float key5, Object value5) {
/* 220 */     MutableFloatObjectMap<Object> mutableFloatObjectMap1 = new MutableFloatObjectMap(0, 1, null), map = mutableFloatObjectMap1; int $i$a$-also-FloatObjectMapKt$mutableFloatObjectMapOf$5 = 0;
/* 221 */     map.set(key1, value1);
/* 222 */     map.set(key2, value2);
/* 223 */     map.set(key3, value3);
/* 224 */     map.set(key4, value4);
/* 225 */     map.set(key5, value5);
/*     */     return (MutableFloatObjectMap)mutableFloatObjectMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\FloatObjectMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */