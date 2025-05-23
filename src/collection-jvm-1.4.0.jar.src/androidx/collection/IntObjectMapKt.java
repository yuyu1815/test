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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\020\001\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\025\032\022\020\003\032\b\022\004\022\002H\0050\004\"\004\b\000\020\005\032\022\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\005\032'\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\005¢\006\002\020\n\0327\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\005¢\006\002\020\r\032G\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\005¢\006\002\020\020\032W\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\005¢\006\002\020\023\032g\020\006\032\b\022\004\022\002H\0050\004\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\0052\006\020\024\032\0020\b2\006\020\025\032\002H\005¢\006\002\020\026\032\022\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\005\032'\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\005¢\006\002\020\030\0327\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\005¢\006\002\020\031\032G\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\005¢\006\002\020\032\032W\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\005¢\006\002\020\033\032g\020\027\032\b\022\004\022\002H\0050\001\"\004\b\000\020\0052\006\020\007\032\0020\b2\006\020\t\032\002H\0052\006\020\013\032\0020\b2\006\020\f\032\002H\0052\006\020\016\032\0020\b2\006\020\017\032\002H\0052\006\020\021\032\0020\b2\006\020\022\032\002H\0052\006\020\024\032\0020\b2\006\020\025\032\002H\005¢\006\002\020\034\"\024\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\002\n\000¨\006\035"}, d2 = {"EmptyIntObjectMap", "Landroidx/collection/MutableIntObjectMap;", "", "emptyIntObjectMap", "Landroidx/collection/IntObjectMap;", "V", "intObjectMapOf", "key1", "", "value1", "(ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key2", "value2", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key3", "value3", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key4", "value4", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key5", "value5", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "mutableIntObjectMapOf", "(ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "collection"})
/*     */ public final class IntObjectMapKt
/*     */ {
/*     */   @NotNull
/*  41 */   private static final MutableIntObjectMap EmptyIntObjectMap = new MutableIntObjectMap(0);
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> IntObjectMap<V> emptyIntObjectMap() {
/*  47 */     Intrinsics.checkNotNull(EmptyIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>"); return EmptyIntObjectMap;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> IntObjectMap<V> intObjectMapOf() {
/*  53 */     Intrinsics.checkNotNull(EmptyIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>"); return EmptyIntObjectMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> IntObjectMap<V> intObjectMapOf(int key1, Object value1) {
/*  61 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$intObjectMapOf$1 = 0;
/*  62 */     map.set(key1, value1);
/*     */     return mutableIntObjectMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> IntObjectMap<V> intObjectMapOf(int key1, Object value1, int key2, Object value2) {
/*  74 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$intObjectMapOf$2 = 0;
/*  75 */     map.set(key1, value1);
/*  76 */     map.set(key2, value2);
/*     */     return mutableIntObjectMap1;
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
/*     */   public static final <V> IntObjectMap<V> intObjectMapOf(int key1, Object value1, int key2, Object value2, int key3, Object value3) {
/*  90 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$intObjectMapOf$3 = 0;
/*  91 */     map.set(key1, value1);
/*  92 */     map.set(key2, value2);
/*  93 */     map.set(key3, value3);
/*     */     return mutableIntObjectMap1;
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
/*     */   public static final <V> IntObjectMap<V> intObjectMapOf(int key1, Object value1, int key2, Object value2, int key3, Object value3, int key4, Object value4) {
/* 109 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$intObjectMapOf$4 = 0;
/* 110 */     map.set(key1, value1);
/* 111 */     map.set(key2, value2);
/* 112 */     map.set(key3, value3);
/* 113 */     map.set(key4, value4);
/*     */     return mutableIntObjectMap1;
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
/*     */   public static final <V> IntObjectMap<V> intObjectMapOf(int key1, Object value1, int key2, Object value2, int key3, Object value3, int key4, Object value4, int key5, Object value5) {
/* 131 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$intObjectMapOf$5 = 0;
/* 132 */     map.set(key1, value1);
/* 133 */     map.set(key2, value2);
/* 134 */     map.set(key3, value3);
/* 135 */     map.set(key4, value4);
/* 136 */     map.set(key5, value5);
/*     */     return mutableIntObjectMap1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf() {
/* 142 */     return new MutableIntObjectMap<>(0, 1, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, Object value1) {
/* 150 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$mutableIntObjectMapOf$1 = 0;
/* 151 */     map.set(key1, value1);
/*     */     return (MutableIntObjectMap)mutableIntObjectMap1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, Object value1, int key2, Object value2) {
/* 163 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$mutableIntObjectMapOf$2 = 0;
/* 164 */     map.set(key1, value1);
/* 165 */     map.set(key2, value2);
/*     */     return (MutableIntObjectMap)mutableIntObjectMap1;
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
/*     */   public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, Object value1, int key2, Object value2, int key3, Object value3) {
/* 179 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$mutableIntObjectMapOf$3 = 0;
/* 180 */     map.set(key1, value1);
/* 181 */     map.set(key2, value2);
/* 182 */     map.set(key3, value3);
/*     */     return (MutableIntObjectMap)mutableIntObjectMap1;
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
/*     */   public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, Object value1, int key2, Object value2, int key3, Object value3, int key4, Object value4) {
/* 198 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$mutableIntObjectMapOf$4 = 0;
/* 199 */     map.set(key1, value1);
/* 200 */     map.set(key2, value2);
/* 201 */     map.set(key3, value3);
/* 202 */     map.set(key4, value4);
/*     */     return (MutableIntObjectMap)mutableIntObjectMap1;
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
/*     */   public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int key1, Object value1, int key2, Object value2, int key3, Object value3, int key4, Object value4, int key5, Object value5) {
/* 220 */     MutableIntObjectMap<Object> mutableIntObjectMap1 = new MutableIntObjectMap(0, 1, null), map = mutableIntObjectMap1; int $i$a$-also-IntObjectMapKt$mutableIntObjectMapOf$5 = 0;
/* 221 */     map.set(key1, value1);
/* 222 */     map.set(key2, value2);
/* 223 */     map.set(key3, value3);
/* 224 */     map.set(key4, value4);
/* 225 */     map.set(key5, value5);
/*     */     return (MutableIntObjectMap)mutableIntObjectMap1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\IntObjectMapKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */