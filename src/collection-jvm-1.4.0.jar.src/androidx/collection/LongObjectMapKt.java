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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\020\001\n\000\n\002\030\002\n\002\b\003\n\002\020\t\n\002\b\025\032\022\020\003\032\b\022\004\022\002H\0050\004\"\004\b\000\020\005\032\022\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\005\032'\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\005¢\006\002\020\n\0327\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\005¢\006\002\020\r\032G\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\005¢\006\002\020\020\032W\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\005¢\006\002\020\023\032g\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\0052\006\020\024\032\0020\b2\006\020\025\032\002H\005¢\006\002\020\026\032\022\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\005\032'\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\005¢\006\002\020\030\0327\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\005¢\006\002\020\031\032G\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\005¢\006\002\020\032\032W\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\005¢\006\002\020\033\032g\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\0052\006\020\024\032\0020\b2\006\020\025\032\002H\005¢\006\002\020\034\"\024\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\002\n\000¨\006\035"}, d2 = {"EmptyLongObjectMap", "Landroidx/collection/MutableLongObjectMap;", "", "emptyLongObjectMap", "Landroidx/collection/LongObjectMap;", "V", "longObjectMapOf", "key1", "", "value1", "(JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key2", "value2", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key3", "value3", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key4", "value4", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key5", "value5", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "mutableLongObjectMapOf", "(JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "collection"})
/*     */ public final class LongObjectMapKt
/*     */ {
/*     */   @NotNull
/*  41 */   private static final MutableLongObjectMap EmptyLongObjectMap = new MutableLongObjectMap(0);
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> LongObjectMap<V> emptyLongObjectMap() {
/*  47 */     Intrinsics.checkNotNull(EmptyLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>"); return EmptyLongObjectMap;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> LongObjectMap<V> longObjectMapOf() {
/*  53 */     Intrinsics.checkNotNull(EmptyLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>"); return EmptyLongObjectMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> LongObjectMap<V> longObjectMapOf(long key1, Object value1) {
/*  61 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$longObjectMapOf$1 = 0;
/*  62 */     map.set(key1, value1);
/*     */     return mutableLongObjectMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> LongObjectMap<V> longObjectMapOf(long key1, Object value1, long key2, Object value2) {
/*  74 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$longObjectMapOf$2 = 0;
/*  75 */     map.set(key1, value1);
/*  76 */     map.set(key2, value2);
/*     */     return mutableLongObjectMap1;
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
/*     */   public static final <V> LongObjectMap<V> longObjectMapOf(long key1, Object value1, long key2, Object value2, long key3, Object value3) {
/*  90 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$longObjectMapOf$3 = 0;
/*  91 */     map.set(key1, value1);
/*  92 */     map.set(key2, value2);
/*  93 */     map.set(key3, value3);
/*     */     return mutableLongObjectMap1;
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
/*     */   public static final <V> LongObjectMap<V> longObjectMapOf(long key1, Object value1, long key2, Object value2, long key3, Object value3, long key4, Object value4) {
/* 109 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$longObjectMapOf$4 = 0;
/* 110 */     map.set(key1, value1);
/* 111 */     map.set(key2, value2);
/* 112 */     map.set(key3, value3);
/* 113 */     map.set(key4, value4);
/*     */     return mutableLongObjectMap1;
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
/*     */   public static final <V> LongObjectMap<V> longObjectMapOf(long key1, Object value1, long key2, Object value2, long key3, Object value3, long key4, Object value4, long key5, Object value5) {
/* 131 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$longObjectMapOf$5 = 0;
/* 132 */     map.set(key1, value1);
/* 133 */     map.set(key2, value2);
/* 134 */     map.set(key3, value3);
/* 135 */     map.set(key4, value4);
/* 136 */     map.set(key5, value5);
/*     */     return mutableLongObjectMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf() {
/* 142 */     return new MutableLongObjectMap<>(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, Object value1) {
/* 150 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$mutableLongObjectMapOf$1 = 0;
/* 151 */     map.set(key1, value1);
/*     */     return (MutableLongObjectMap)mutableLongObjectMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, Object value1, long key2, Object value2) {
/* 163 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$mutableLongObjectMapOf$2 = 0;
/* 164 */     map.set(key1, value1);
/* 165 */     map.set(key2, value2);
/*     */     return (MutableLongObjectMap)mutableLongObjectMap1;
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
/*     */   public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, Object value1, long key2, Object value2, long key3, Object value3) {
/* 179 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$mutableLongObjectMapOf$3 = 0;
/* 180 */     map.set(key1, value1);
/* 181 */     map.set(key2, value2);
/* 182 */     map.set(key3, value3);
/*     */     return (MutableLongObjectMap)mutableLongObjectMap1;
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
/*     */   public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, Object value1, long key2, Object value2, long key3, Object value3, long key4, Object value4) {
/* 198 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$mutableLongObjectMapOf$4 = 0;
/* 199 */     map.set(key1, value1);
/* 200 */     map.set(key2, value2);
/* 201 */     map.set(key3, value3);
/* 202 */     map.set(key4, value4);
/*     */     return (MutableLongObjectMap)mutableLongObjectMap1;
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
/*     */   public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long key1, Object value1, long key2, Object value2, long key3, Object value3, long key4, Object value4, long key5, Object value5) {
/* 220 */     MutableLongObjectMap<Object> mutableLongObjectMap1 = new MutableLongObjectMap(0, 1, null), map = mutableLongObjectMap1; int $i$a$-also-LongObjectMapKt$mutableLongObjectMapOf$5 = 0;
/* 221 */     map.set(key1, value1);
/* 222 */     map.set(key2, value2);
/* 223 */     map.set(key3, value3);
/* 224 */     map.set(key4, value4);
/* 225 */     map.set(key5, value5);
/*     */     return (MutableLongObjectMap)mutableLongObjectMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\LongObjectMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */