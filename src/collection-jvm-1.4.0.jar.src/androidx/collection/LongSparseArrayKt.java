/*     */ package androidx.collection;
/*     */ 
/*     */ import androidx.collection.internal.ContainerHelpersKt;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.LongIterator;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000X\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\n\002\020\t\n\002\b\004\n\002\020\013\n\002\b\035\n\002\020\016\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020(\n\000\032.\020\n\032\0020\013\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\0162\006\020\017\032\002H\fH\b¢\006\002\020\020\032\031\020\021\032\0020\013\"\004\b\000\020\f*\b\022\004\022\002H\f0\005H\b\032!\020\022\032\0020\023\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\016H\b\032&\020\024\032\0020\023\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\017\032\002H\fH\b¢\006\002\020\025\032\031\020\026\032\0020\013\"\004\b\000\020\f*\b\022\004\022\002H\f0\005H\b\032(\020\027\032\004\030\001H\f\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\016H\b¢\006\002\020\030\032.\020\027\032\002H\f\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\0162\006\020\031\032\002H\fH\b¢\006\002\020\032\032:\020\033\032\002H\004\"\n\b\000\020\004*\004\030\001H\f\"\004\b\001\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\0162\006\020\031\032\002H\004H\b¢\006\002\020\032\032!\020\034\032\0020\003\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\016H\b\032&\020\035\032\0020\003\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\017\032\002H\fH\b¢\006\002\020\036\032\031\020\037\032\0020\023\"\004\b\000\020\f*\b\022\004\022\002H\f0\005H\b\032!\020 \032\0020\016\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020!\032\0020\003H\b\032.\020\"\032\0020\013\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\0162\006\020\017\032\002H\fH\b¢\006\002\020\020\032)\020#\032\0020\013\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\016\020$\032\n\022\006\b\001\022\002H\f0\005H\b\0320\020%\032\004\030\001H\f\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\0162\006\020\017\032\002H\fH\b¢\006\002\020\032\032!\020&\032\0020\013\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\016H\b\032.\020&\032\0020\023\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\0162\006\020\017\032\002H\fH\b¢\006\002\020'\032!\020(\032\0020\013\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020!\032\0020\003H\b\0320\020)\032\004\030\001H\f\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\0162\006\020\017\032\002H\fH\b¢\006\002\020\032\0326\020)\032\0020\023\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020\r\032\0020\0162\006\020*\032\002H\f2\006\020+\032\002H\fH\b¢\006\002\020,\032.\020-\032\0020\013\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020!\032\0020\0032\006\020\017\032\002H\fH\b¢\006\002\020.\032\031\020/\032\0020\003\"\004\b\000\020\f*\b\022\004\022\002H\f0\005H\b\032\031\0200\032\00201\"\004\b\000\020\f*\b\022\004\022\002H\f0\005H\b\032&\0202\032\002H\f\"\004\b\000\020\f*\b\022\004\022\002H\f0\0052\006\020!\032\0020\003H\b¢\006\002\0203\032!\0204\032\0020\023\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\r\032\0020\016H\n\032T\0205\032\0020\013\"\004\b\000\020\004*\b\022\004\022\002H\0040\00526\0206\0322\022\023\022\0210\016¢\006\f\b8\022\b\b9\022\004\b\b(\r\022\023\022\021H\004¢\006\f\b8\022\b\b9\022\004\b\b(\017\022\004\022\0020\01307H\bø\001\000\032.\020:\032\002H\004\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\r\032\0020\0162\006\020\031\032\002H\004H\b¢\006\002\020\032\0327\020;\032\002H\004\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\r\032\0020\0162\f\020\031\032\b\022\004\022\002H\0040<H\bø\001\000¢\006\002\020=\032\031\020>\032\0020\023\"\004\b\000\020\004*\b\022\004\022\002H\0040\005H\b\032\026\020?\032\0020@\"\004\b\000\020\004*\b\022\004\022\002H\0040\005\032-\020A\032\b\022\004\022\002H\0040\005\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\f\020$\032\b\022\004\022\002H\0040\005H\002\032-\020B\032\0020\023\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\r\032\0020\0162\006\020\017\032\002H\004H\007¢\006\002\020'\032.\020C\032\0020\013\"\004\b\000\020\004*\b\022\004\022\002H\0040\0052\006\020\r\032\0020\0162\006\020\017\032\002H\004H\n¢\006\002\020\020\032\034\020D\032\b\022\004\022\002H\0040E\"\004\b\000\020\004*\b\022\004\022\002H\0040\005\"\016\020\000\032\0020\001X\004¢\006\002\n\000\"(\020\002\032\0020\003\"\004\b\000\020\004*\b\022\004\022\002H\0040\0058Æ\002¢\006\f\022\004\b\006\020\007\032\004\b\b\020\t\002\007\n\005\b20\001¨\006F"}, d2 = {"DELETED", "", "size", "", "T", "Landroidx/collection/LongSparseArray;", "getSize$annotations", "(Landroidx/collection/LongSparseArray;)V", "getSize", "(Landroidx/collection/LongSparseArray;)I", "commonAppend", "", "E", "key", "", "value", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonGc", "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "commonGetInternal", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "commonRemoveAt", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonSize", "commonToString", "", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "contains", "forEach", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "getOrElse", "Lkotlin/Function0;", "(Landroidx/collection/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "keyIterator", "Lkotlin/collections/LongIterator;", "plus", "remove", "set", "valueIterator", "", "collection"})
/*     */ @SourceDebugExtension({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,606:1\n256#1,6:607\n256#1,6:613\n328#1,18:619\n328#1,18:637\n328#1,18:655\n328#1,18:673\n328#1,18:691\n328#1,18:709\n328#1,18:727\n328#1,18:745\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n243#1:607,6\n248#1:613,6\n360#1:619,18\n410#1:637,18\n425#1:655,18\n437#1:673,18\n451#1:691,18\n459#1:709,18\n467#1:727,18\n505#1:745,18\n*E\n"})
/*     */ public final class LongSparseArrayKt
/*     */ {
/*     */   @NotNull
/*  26 */   private static final Object DELETED = new Object();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public static final <E> E commonGet(@NotNull LongSparseArray $this$commonGet, long key)
/*     */   {
/* 243 */     Intrinsics.checkNotNullParameter($this$commonGet, "<this>"); int $i$f$commonGet = 0; LongSparseArray longSparseArray = $this$commonGet; Object defaultValue$iv = null; int $i$f$commonGetInternal = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 607 */     int i$iv = ContainerHelpersKt.binarySearch(longSparseArray.keys, longSparseArray.size, key);
/* 608 */     return (i$iv < 0 || longSparseArray.values[i$iv] == LongSparseArrayKt.DELETED) ? 
/* 609 */       (E)defaultValue$iv : 
/*     */ 
/*     */       
/* 612 */       (E)longSparseArray.values[i$iv];
/* 613 */   } public static final <T extends E, E> T commonGetInternal(@NotNull LongSparseArray $this$commonGetInternal, long key, Object defaultValue) { Intrinsics.checkNotNullParameter($this$commonGetInternal, "<this>"); int $i$f$commonGetInternal = 0, i = ContainerHelpersKt.binarySearch($this$commonGetInternal.keys, $this$commonGetInternal.size, key); return (i < 0 || $this$commonGetInternal.values[i] == LongSparseArrayKt.DELETED) ? (T)defaultValue : (T)$this$commonGetInternal.values[i]; } public static final <E> void commonRemove(@NotNull LongSparseArray $this$commonRemove, long key) { Intrinsics.checkNotNullParameter($this$commonRemove, "<this>"); int $i$f$commonRemove = 0, i = ContainerHelpersKt.binarySearch($this$commonRemove.keys, $this$commonRemove.size, key); if (i >= 0 && $this$commonRemove.values[i] != LongSparseArrayKt.DELETED) { $this$commonRemove.values[i] = LongSparseArrayKt.DELETED; $this$commonRemove.garbage = true; }  } public static final <E> boolean commonRemove(@NotNull LongSparseArray $this$commonRemove, long key, Object value) { Intrinsics.checkNotNullParameter($this$commonRemove, "<this>"); int $i$f$commonRemove = 0, index = $this$commonRemove.indexOfKey(key); if (index >= 0) { Object mapValue = $this$commonRemove.valueAt(index); if (Intrinsics.areEqual(value, mapValue)) { $this$commonRemove.removeAt(index); return true; }  }  return false; } public static final <E> void commonRemoveAt(@NotNull LongSparseArray $this$commonRemoveAt, int index) { Intrinsics.checkNotNullParameter($this$commonRemoveAt, "<this>"); int $i$f$commonRemoveAt = 0; if ($this$commonRemoveAt.values[index] != LongSparseArrayKt.DELETED) { $this$commonRemoveAt.values[index] = LongSparseArrayKt.DELETED; $this$commonRemoveAt.garbage = true; }  } public static final <E> E commonGet(@NotNull LongSparseArray $this$commonGet, long key, Object defaultValue) { Intrinsics.checkNotNullParameter($this$commonGet, "<this>"); int $i$f$commonGet = 0; LongSparseArray $this$commonGetInternal$iv = $this$commonGet; int $i$f$commonGetInternal = 0; int i$iv = ContainerHelpersKt.binarySearch($this$commonGetInternal$iv.keys, $this$commonGetInternal$iv.size, key);
/* 614 */     return (i$iv < 0 || $this$commonGetInternal$iv.values[i$iv] == LongSparseArrayKt.DELETED) ? 
/* 615 */       (E)defaultValue : 
/*     */ 
/*     */       
/* 618 */       (E)$this$commonGetInternal$iv.values[i$iv]; }
/* 619 */   @Nullable public static final <E> E commonReplace(@NotNull LongSparseArray $this$commonReplace, long key, Object value) { Intrinsics.checkNotNullParameter($this$commonReplace, "<this>"); int $i$f$commonReplace = 0, index = $this$commonReplace.indexOfKey(key); if (index >= 0) { Object oldValue = $this$commonReplace.values[index]; $this$commonReplace.values[index] = value; return (E)oldValue; }  return null; } public static final <E> void commonPut(@NotNull LongSparseArray $this$commonPut, long key, Object value) { Intrinsics.checkNotNullParameter($this$commonPut, "<this>"); int $i$f$commonPut = 0, index = ContainerHelpersKt.binarySearch($this$commonPut.keys, $this$commonPut.size, key); if (index >= 0) { $this$commonPut.values[index] = value; } else { index ^= 0xFFFFFFFF; if (index < $this$commonPut.size && $this$commonPut.values[index] == LongSparseArrayKt.DELETED) { $this$commonPut.keys[index] = key; $this$commonPut.values[index] = value; return; }  if ($this$commonPut.garbage && $this$commonPut.size >= $this$commonPut.keys.length) { LongSparseArray $this$commonGc$iv = $this$commonPut; int $i$f$commonGc = 0; int n$iv = $this$commonGc$iv.size;
/* 620 */         int newSize$iv = 0;
/* 621 */         long[] keys$iv = $this$commonGc$iv.keys;
/* 622 */         Object[] values$iv = $this$commonGc$iv.values;
/* 623 */         for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 624 */           Object value$iv = values$iv[i$iv];
/* 625 */           if (value$iv != LongSparseArrayKt.DELETED) {
/* 626 */             if (i$iv != newSize$iv) {
/* 627 */               keys$iv[newSize$iv] = keys$iv[i$iv];
/* 628 */               values$iv[newSize$iv] = value$iv;
/* 629 */               values$iv[i$iv] = null;
/*     */             } 
/* 631 */             newSize$iv++;
/*     */           } 
/*     */         } 
/* 634 */         $this$commonGc$iv.garbage = false;
/* 635 */         $this$commonGc$iv.size = newSize$iv; index = ContainerHelpersKt.binarySearch($this$commonPut.keys, $this$commonPut.size, key) ^ 0xFFFFFFFF; }  if ($this$commonPut.size >= $this$commonPut.keys.length) { int newSize = ContainerHelpersKt.idealLongArraySize($this$commonPut.size + 1); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut.keys, newSize), "copyOf(this, newSize)"); $this$commonPut.keys = Arrays.copyOf($this$commonPut.keys, newSize); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonPut.values, newSize), "copyOf(this, newSize)"); $this$commonPut.values = Arrays.copyOf($this$commonPut.values, newSize); }  if ($this$commonPut.size - index != 0) { ArraysKt.copyInto($this$commonPut.keys, $this$commonPut.keys, index + 1, index, $this$commonPut.size); ArraysKt.copyInto($this$commonPut.values, $this$commonPut.values, index + 1, index, $this$commonPut.size); }  $this$commonPut.keys[index] = key; $this$commonPut.values[index] = value; int i = $this$commonPut.size; $this$commonPut.size = i + 1; }  }
/*     */   public static final <E> boolean commonReplace(@NotNull LongSparseArray $this$commonReplace, long key, Object oldValue, Object newValue) { Intrinsics.checkNotNullParameter($this$commonReplace, "<this>"); int $i$f$commonReplace = 0, index = $this$commonReplace.indexOfKey(key); if (index >= 0) { Object mapValue = $this$commonReplace.values[index]; if (Intrinsics.areEqual(mapValue, oldValue)) { $this$commonReplace.values[index] = newValue; return true; }  }  return false; }
/*     */   public static final <E> void commonGc(@NotNull LongSparseArray $this$commonGc) { Intrinsics.checkNotNullParameter($this$commonGc, "<this>"); int $i$f$commonGc = 0, n = $this$commonGc.size; int newSize = 0; long[] keys = $this$commonGc.keys; Object[] values = $this$commonGc.values; for (int i = 0; i < n; i++) { Object value = values[i]; if (value != LongSparseArrayKt.DELETED) { if (i != newSize) { keys[newSize] = keys[i]; values[newSize] = value; values[i] = null; }  newSize++; }  }  $this$commonGc.garbage = false; $this$commonGc.size = newSize; } public static final <E> void commonPutAll(@NotNull LongSparseArray $this$commonPutAll, @NotNull LongSparseArray other) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'other'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: iconst_0
/*     */     //   13: istore_2
/*     */     //   14: aload_1
/*     */     //   15: invokevirtual size : ()I
/*     */     //   18: istore_3
/*     */     //   19: iconst_0
/*     */     //   20: istore #4
/*     */     //   22: iload #4
/*     */     //   24: iload_3
/*     */     //   25: if_icmpge -> 58
/*     */     //   28: iload #4
/*     */     //   30: istore #5
/*     */     //   32: iconst_0
/*     */     //   33: istore #6
/*     */     //   35: aload_0
/*     */     //   36: aload_1
/*     */     //   37: iload #5
/*     */     //   39: invokevirtual keyAt : (I)J
/*     */     //   42: aload_1
/*     */     //   43: iload #5
/*     */     //   45: invokevirtual valueAt : (I)Ljava/lang/Object;
/*     */     //   48: invokevirtual put : (JLjava/lang/Object;)V
/*     */     //   51: nop
/*     */     //   52: iinc #4, 1
/*     */     //   55: goto -> 22
/*     */     //   58: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #392	-> 14
/*     */     //   #393	-> 19
/*     */     //   #394	-> 35
/*     */     //   #395	-> 51
/*     */     //   #393	-> 52
/*     */     //   #396	-> 58
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   35	17	6	$i$a$-repeat-LongSparseArrayKt$commonPutAll$1	I
/*     */     //   32	20	5	i	I
/*     */     //   14	45	2	$i$f$commonPutAll	I
/*     */     //   19	40	3	size	I
/*     */     //   0	59	0	$this$commonPutAll	Landroidx/collection/LongSparseArray;
/* 637 */     //   0	59	1	other	Landroidx/collection/LongSparseArray; } @Nullable public static final <E> E commonPutIfAbsent(@NotNull LongSparseArray<Object> $this$commonPutIfAbsent, long key, Object value) { Intrinsics.checkNotNullParameter($this$commonPutIfAbsent, "<this>"); int $i$f$commonPutIfAbsent = 0; Object mapValue = $this$commonPutIfAbsent.get(key); if (mapValue == null) $this$commonPutIfAbsent.put(key, value);  return (E)mapValue; } public static final <E> int commonSize(@NotNull LongSparseArray $this$commonSize) { Intrinsics.checkNotNullParameter($this$commonSize, "<this>"); int $i$f$commonSize = 0; if ($this$commonSize.garbage) { LongSparseArray $this$commonGc$iv = $this$commonSize; int $i$f$commonGc = 0; int n$iv = $this$commonGc$iv.size;
/* 638 */       int newSize$iv = 0;
/* 639 */       long[] keys$iv = $this$commonGc$iv.keys;
/* 640 */       Object[] values$iv = $this$commonGc$iv.values;
/* 641 */       for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 642 */         Object value$iv = values$iv[i$iv];
/* 643 */         if (value$iv != LongSparseArrayKt.DELETED) {
/* 644 */           if (i$iv != newSize$iv) {
/* 645 */             keys$iv[newSize$iv] = keys$iv[i$iv];
/* 646 */             values$iv[newSize$iv] = value$iv;
/* 647 */             values$iv[i$iv] = null;
/*     */           } 
/* 649 */           newSize$iv++;
/*     */         } 
/*     */       } 
/* 652 */       $this$commonGc$iv.garbage = false;
/* 653 */       $this$commonGc$iv.size = newSize$iv; }  return $this$commonSize.size; } public static final <E> boolean commonIsEmpty(@NotNull LongSparseArray $this$commonIsEmpty) { Intrinsics.checkNotNullParameter($this$commonIsEmpty, "<this>"); int $i$f$commonIsEmpty = 0; return ($this$commonIsEmpty.size() == 0); }
/*     */   public static final <E> long commonKeyAt(@NotNull LongSparseArray $this$commonKeyAt, int index) { Intrinsics.checkNotNullParameter($this$commonKeyAt, "<this>"); int $i$f$commonKeyAt = 0; if (!((0 <= index) ? ((index < $this$commonKeyAt.size) ? 1 : 0) : 0)) { int $i$a$-require-LongSparseArrayKt$commonKeyAt$1 = 0; String str = "Expected index to be within 0..size()-1, but was " + index; throw new IllegalArgumentException(str.toString()); }
/* 655 */      if ($this$commonKeyAt.garbage) { LongSparseArray $this$commonGc$iv = $this$commonKeyAt; int $i$f$commonGc = 0; int n$iv = $this$commonGc$iv.size;
/* 656 */       int newSize$iv = 0;
/* 657 */       long[] keys$iv = $this$commonGc$iv.keys;
/* 658 */       Object[] values$iv = $this$commonGc$iv.values;
/* 659 */       for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 660 */         Object value$iv = values$iv[i$iv];
/* 661 */         if (value$iv != LongSparseArrayKt.DELETED) {
/* 662 */           if (i$iv != newSize$iv) {
/* 663 */             keys$iv[newSize$iv] = keys$iv[i$iv];
/* 664 */             values$iv[newSize$iv] = value$iv;
/* 665 */             values$iv[i$iv] = null;
/*     */           } 
/* 667 */           newSize$iv++;
/*     */         } 
/*     */       } 
/* 670 */       $this$commonGc$iv.garbage = false;
/* 671 */       $this$commonGc$iv.size = newSize$iv; }
/*     */      return $this$commonKeyAt.keys[index]; } public static final <E> E commonValueAt(@NotNull LongSparseArray $this$commonValueAt, int index) { Intrinsics.checkNotNullParameter($this$commonValueAt, "<this>"); int $i$f$commonValueAt = 0; if (!((0 <= index) ? ((index < $this$commonValueAt.size) ? 1 : 0) : 0)) { int $i$a$-require-LongSparseArrayKt$commonValueAt$1 = 0; String str = "Expected index to be within 0..size()-1, but was " + index; throw new IllegalArgumentException(str.toString()); }
/* 673 */      if ($this$commonValueAt.garbage) { LongSparseArray $this$commonGc$iv = $this$commonValueAt; int $i$f$commonGc = 0; int n$iv = $this$commonGc$iv.size;
/* 674 */       int newSize$iv = 0;
/* 675 */       long[] keys$iv = $this$commonGc$iv.keys;
/* 676 */       Object[] values$iv = $this$commonGc$iv.values;
/* 677 */       for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 678 */         Object value$iv = values$iv[i$iv];
/* 679 */         if (value$iv != LongSparseArrayKt.DELETED) {
/* 680 */           if (i$iv != newSize$iv) {
/* 681 */             keys$iv[newSize$iv] = keys$iv[i$iv];
/* 682 */             values$iv[newSize$iv] = value$iv;
/* 683 */             values$iv[i$iv] = null;
/*     */           } 
/* 685 */           newSize$iv++;
/*     */         } 
/*     */       } 
/* 688 */       $this$commonGc$iv.garbage = false;
/* 689 */       $this$commonGc$iv.size = newSize$iv; }
/*     */      return (E)$this$commonValueAt.values[index]; } public static final <E> void commonSetValueAt(@NotNull LongSparseArray $this$commonSetValueAt, int index, Object value) { Intrinsics.checkNotNullParameter($this$commonSetValueAt, "<this>"); int $i$f$commonSetValueAt = 0; if (!((0 <= index) ? ((index < $this$commonSetValueAt.size) ? 1 : 0) : 0)) { int $i$a$-require-LongSparseArrayKt$commonSetValueAt$1 = 0; String str = "Expected index to be within 0..size()-1, but was " + index; throw new IllegalArgumentException(str.toString()); }
/* 691 */      if ($this$commonSetValueAt.garbage) { LongSparseArray $this$commonGc$iv = $this$commonSetValueAt; int $i$f$commonGc = 0; int n$iv = $this$commonGc$iv.size;
/* 692 */       int newSize$iv = 0;
/* 693 */       long[] keys$iv = $this$commonGc$iv.keys;
/* 694 */       Object[] values$iv = $this$commonGc$iv.values;
/* 695 */       for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 696 */         Object value$iv = values$iv[i$iv];
/* 697 */         if (value$iv != LongSparseArrayKt.DELETED) {
/* 698 */           if (i$iv != newSize$iv) {
/* 699 */             keys$iv[newSize$iv] = keys$iv[i$iv];
/* 700 */             values$iv[newSize$iv] = value$iv;
/* 701 */             values$iv[i$iv] = null;
/*     */           } 
/* 703 */           newSize$iv++;
/*     */         } 
/*     */       } 
/* 706 */       $this$commonGc$iv.garbage = false;
/* 707 */       $this$commonGc$iv.size = newSize$iv; }
/*     */      $this$commonSetValueAt.values[index] = value; } public static final <E> int commonIndexOfKey(@NotNull LongSparseArray $this$commonIndexOfKey, long key) { Intrinsics.checkNotNullParameter($this$commonIndexOfKey, "<this>"); int $i$f$commonIndexOfKey = 0; if ($this$commonIndexOfKey.garbage) {
/* 709 */       LongSparseArray $this$commonGc$iv = $this$commonIndexOfKey; int $i$f$commonGc = 0; int n$iv = $this$commonGc$iv.size;
/* 710 */       int newSize$iv = 0;
/* 711 */       long[] keys$iv = $this$commonGc$iv.keys;
/* 712 */       Object[] values$iv = $this$commonGc$iv.values;
/* 713 */       for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 714 */         Object value$iv = values$iv[i$iv];
/* 715 */         if (value$iv != LongSparseArrayKt.DELETED) {
/* 716 */           if (i$iv != newSize$iv) {
/* 717 */             keys$iv[newSize$iv] = keys$iv[i$iv];
/* 718 */             values$iv[newSize$iv] = value$iv;
/* 719 */             values$iv[i$iv] = null;
/*     */           } 
/* 721 */           newSize$iv++;
/*     */         } 
/*     */       } 
/* 724 */       $this$commonGc$iv.garbage = false;
/* 725 */       $this$commonGc$iv.size = newSize$iv;
/*     */     }  return ContainerHelpersKt.binarySearch($this$commonIndexOfKey.keys, $this$commonIndexOfKey.size, key); } public static final <E> int commonIndexOfValue(@NotNull LongSparseArray $this$commonIndexOfValue, Object value) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: iconst_0
/*     */     //   7: istore_2
/*     */     //   8: aload_0
/*     */     //   9: getfield garbage : Z
/*     */     //   12: ifeq -> 117
/*     */     //   15: aload_0
/*     */     //   16: astore_3
/*     */     //   17: iconst_0
/*     */     //   18: istore #4
/*     */     //   20: aload_3
/*     */     //   21: getfield size : I
/*     */     //   24: istore #5
/*     */     //   26: iconst_0
/*     */     //   27: istore #6
/*     */     //   29: aload_3
/*     */     //   30: getfield keys : [J
/*     */     //   33: astore #7
/*     */     //   35: aload_3
/*     */     //   36: getfield values : [Ljava/lang/Object;
/*     */     //   39: astore #8
/*     */     //   41: iconst_0
/*     */     //   42: istore #9
/*     */     //   44: iload #9
/*     */     //   46: iload #5
/*     */     //   48: if_icmpge -> 105
/*     */     //   51: aload #8
/*     */     //   53: iload #9
/*     */     //   55: aaload
/*     */     //   56: astore #10
/*     */     //   58: aload #10
/*     */     //   60: invokestatic access$getDELETED$p : ()Ljava/lang/Object;
/*     */     //   63: if_acmpeq -> 99
/*     */     //   66: iload #9
/*     */     //   68: iload #6
/*     */     //   70: if_icmpeq -> 96
/*     */     //   73: aload #7
/*     */     //   75: iload #6
/*     */     //   77: aload #7
/*     */     //   79: iload #9
/*     */     //   81: laload
/*     */     //   82: lastore
/*     */     //   83: aload #8
/*     */     //   85: iload #6
/*     */     //   87: aload #10
/*     */     //   89: aastore
/*     */     //   90: aload #8
/*     */     //   92: iload #9
/*     */     //   94: aconst_null
/*     */     //   95: aastore
/*     */     //   96: iinc #6, 1
/*     */     //   99: iinc #9, 1
/*     */     //   102: goto -> 44
/*     */     //   105: aload_3
/*     */     //   106: iconst_0
/*     */     //   107: putfield garbage : Z
/*     */     //   110: aload_3
/*     */     //   111: iload #6
/*     */     //   113: putfield size : I
/*     */     //   116: nop
/*     */     //   117: aload_0
/*     */     //   118: getfield size : I
/*     */     //   121: istore_3
/*     */     //   122: iconst_0
/*     */     //   123: istore #4
/*     */     //   125: iload #4
/*     */     //   127: iload_3
/*     */     //   128: if_icmpge -> 159
/*     */     //   131: iload #4
/*     */     //   133: istore #5
/*     */     //   135: iconst_0
/*     */     //   136: istore #6
/*     */     //   138: aload_0
/*     */     //   139: getfield values : [Ljava/lang/Object;
/*     */     //   142: iload #5
/*     */     //   144: aaload
/*     */     //   145: aload_1
/*     */     //   146: if_acmpne -> 152
/*     */     //   149: iload #5
/*     */     //   151: ireturn
/*     */     //   152: nop
/*     */     //   153: iinc #4, 1
/*     */     //   156: goto -> 125
/*     */     //   159: iconst_m1
/*     */     //   160: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #466	-> 8
/*     */     //   #467	-> 15
/*     */     //   #727	-> 20
/*     */     //   #728	-> 26
/*     */     //   #729	-> 29
/*     */     //   #730	-> 35
/*     */     //   #731	-> 41
/*     */     //   #732	-> 51
/*     */     //   #733	-> 58
/*     */     //   #734	-> 66
/*     */     //   #735	-> 73
/*     */     //   #736	-> 83
/*     */     //   #737	-> 90
/*     */     //   #739	-> 96
/*     */     //   #731	-> 99
/*     */     //   #742	-> 105
/*     */     //   #743	-> 110
/*     */     //   #744	-> 116
/*     */     //   #469	-> 117
/*     */     //   #470	-> 138
/*     */     //   #471	-> 149
/*     */     //   #473	-> 152
/*     */     //   #469	-> 153
/*     */     //   #474	-> 159
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   58	41	10	value$iv	Ljava/lang/Object;
/*     */     //   44	61	9	i$iv	I
/*     */     //   20	97	4	$i$f$commonGc	I
/*     */     //   26	91	5	n$iv	I
/*     */     //   29	88	6	newSize$iv	I
/*     */     //   35	82	7	keys$iv	[J
/*     */     //   41	76	8	values$iv	[Ljava/lang/Object;
/*     */     //   17	100	3	$this$commonGc$iv	Landroidx/collection/LongSparseArray;
/*     */     //   138	15	6	$i$a$-repeat-LongSparseArrayKt$commonIndexOfValue$1	I
/*     */     //   135	18	5	i	I
/*     */     //   8	153	2	$i$f$commonIndexOfValue	I
/*     */     //   0	161	0	$this$commonIndexOfValue	Landroidx/collection/LongSparseArray;
/*     */     //   0	161	1	value	Ljava/lang/Object; }
/*     */   public static final <E> boolean commonContainsKey(@NotNull LongSparseArray $this$commonContainsKey, long key) { Intrinsics.checkNotNullParameter($this$commonContainsKey, "<this>"); int $i$f$commonContainsKey = 0; return ($this$commonContainsKey.indexOfKey(key) >= 0); }
/*     */   public static final <E> boolean commonContainsValue(@NotNull LongSparseArray<Object> $this$commonContainsValue, Object value) { Intrinsics.checkNotNullParameter($this$commonContainsValue, "<this>"); int $i$f$commonContainsValue = 0; return ($this$commonContainsValue.indexOfValue(value) >= 0); }
/*     */   public static final <E> void commonClear(@NotNull LongSparseArray $this$commonClear) { Intrinsics.checkNotNullParameter($this$commonClear, "<this>");
/*     */     int $i$f$commonClear = 0, n = $this$commonClear.size;
/*     */     Object[] values = $this$commonClear.values;
/*     */     for (int i = 0; i < n; i++)
/*     */       values[i] = null; 
/*     */     $this$commonClear.size = 0;
/*     */     $this$commonClear.garbage = false; }
/*     */   public static final <E> void commonAppend(@NotNull LongSparseArray<Object> $this$commonAppend, long key, Object value) { Intrinsics.checkNotNullParameter($this$commonAppend, "<this>");
/*     */     int $i$f$commonAppend = 0;
/*     */     if ($this$commonAppend.size != 0 && key <= $this$commonAppend.keys[$this$commonAppend.size - 1]) {
/*     */       $this$commonAppend.put(key, value);
/*     */       return;
/*     */     } 
/*     */     if ($this$commonAppend.garbage && $this$commonAppend.size >= $this$commonAppend.keys.length) {
/*     */       LongSparseArray<Object> $this$commonGc$iv = $this$commonAppend;
/*     */       int $i$f$commonGc = 0;
/* 745 */       int n$iv = $this$commonGc$iv.size;
/* 746 */       int newSize$iv = 0;
/* 747 */       long[] keys$iv = $this$commonGc$iv.keys;
/* 748 */       Object[] values$iv = $this$commonGc$iv.values;
/* 749 */       for (int i$iv = 0; i$iv < n$iv; i$iv++) {
/* 750 */         Object value$iv = values$iv[i$iv];
/* 751 */         if (value$iv != LongSparseArrayKt.DELETED) {
/* 752 */           if (i$iv != newSize$iv) {
/* 753 */             keys$iv[newSize$iv] = keys$iv[i$iv];
/* 754 */             values$iv[newSize$iv] = value$iv;
/* 755 */             values$iv[i$iv] = null;
/*     */           } 
/* 757 */           newSize$iv++;
/*     */         } 
/*     */       } 
/* 760 */       $this$commonGc$iv.garbage = false;
/* 761 */       $this$commonGc$iv.size = newSize$iv;
/*     */     } 
/*     */     int pos = $this$commonAppend.size;
/*     */     if (pos >= $this$commonAppend.keys.length) {
/*     */       int newSize = ContainerHelpersKt.idealLongArraySize(pos + 1);
/*     */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonAppend.keys, newSize), "copyOf(this, newSize)");
/*     */       $this$commonAppend.keys = Arrays.copyOf($this$commonAppend.keys, newSize);
/*     */       Intrinsics.checkNotNullExpressionValue(Arrays.copyOf($this$commonAppend.values, newSize), "copyOf(this, newSize)");
/*     */       $this$commonAppend.values = Arrays.copyOf($this$commonAppend.values, newSize);
/*     */     } 
/*     */     $this$commonAppend.keys[pos] = key;
/*     */     $this$commonAppend.values[pos] = value;
/*     */     $this$commonAppend.size = pos + 1; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <E> String commonToString(@NotNull LongSparseArray $this$commonToString) {
/*     */     Intrinsics.checkNotNullParameter($this$commonToString, "<this>");
/*     */     int $i$f$commonToString = 0;
/*     */     if ($this$commonToString.size() <= 0)
/*     */       return "{}"; 
/*     */     int j = $this$commonToString.size * 28;
/*     */     StringBuilder stringBuilder1 = new StringBuilder(j), $this$commonToString_u24lambda_u245 = stringBuilder1;
/*     */     int $i$a$-buildString-LongSparseArrayKt$commonToString$1 = 0;
/*     */     $this$commonToString_u24lambda_u245.append('{');
/*     */     for (int i = 0, k = $this$commonToString.size; i < k; i++) {
/*     */       if (i > 0)
/*     */         $this$commonToString_u24lambda_u245.append(", "); 
/*     */       long key = $this$commonToString.keyAt(i);
/*     */       $this$commonToString_u24lambda_u245.append(key);
/*     */       $this$commonToString_u24lambda_u245.append('=');
/*     */       Object value = $this$commonToString.valueAt(i);
/*     */       if (value != $this$commonToString_u24lambda_u245) {
/*     */         $this$commonToString_u24lambda_u245.append(value);
/*     */       } else {
/*     */         $this$commonToString_u24lambda_u245.append("(this Map)");
/*     */       } 
/*     */     } 
/*     */     $this$commonToString_u24lambda_u245.append('}');
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder(capacity).…builderAction).toString()");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   public static final <T> int getSize(@NotNull LongSparseArray $this$size) {
/*     */     Intrinsics.checkNotNullParameter($this$size, "<this>");
/*     */     int $i$f$getSize = 0;
/*     */     return $this$size.size();
/*     */   }
/*     */   
/*     */   public static final <T> boolean contains(@NotNull LongSparseArray $this$contains, long key) {
/*     */     Intrinsics.checkNotNullParameter($this$contains, "<this>");
/*     */     int $i$f$contains = 0;
/*     */     return $this$contains.containsKey(key);
/*     */   }
/*     */   
/*     */   public static final <T> void set(@NotNull LongSparseArray<Object> $this$set, long key, Object value) {
/*     */     Intrinsics.checkNotNullParameter($this$set, "<this>");
/*     */     int $i$f$set = 0;
/*     */     $this$set.put(key, value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <T> LongSparseArray<T> plus(@NotNull LongSparseArray $this$plus, @NotNull LongSparseArray other) {
/*     */     Intrinsics.checkNotNullParameter($this$plus, "<this>");
/*     */     Intrinsics.checkNotNullParameter(other, "other");
/*     */     LongSparseArray<T> new = new LongSparseArray($this$plus.size() + other.size());
/*     */     new.putAll($this$plus);
/*     */     new.putAll(other);
/*     */     return new;
/*     */   }
/*     */   
/*     */   public static final <T> T getOrDefault(@NotNull LongSparseArray<T> $this$getOrDefault, long key, Object defaultValue) {
/*     */     Intrinsics.checkNotNullParameter($this$getOrDefault, "<this>");
/*     */     int $i$f$getOrDefault = 0;
/*     */     return $this$getOrDefault.get(key, (T)defaultValue);
/*     */   }
/*     */   
/*     */   public static final <T> T getOrElse(@NotNull LongSparseArray $this$getOrElse, long key, @NotNull Function0 defaultValue) {
/*     */     Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
/*     */     Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
/*     */     int $i$f$getOrElse = 0;
/*     */     if ($this$getOrElse.get(key) == null)
/*     */       $this$getOrElse.get(key); 
/*     */     return (T)defaultValue.invoke();
/*     */   }
/*     */   
/*     */   public static final <T> boolean isNotEmpty(@NotNull LongSparseArray $this$isNotEmpty) {
/*     */     Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>");
/*     */     int $i$f$isNotEmpty = 0;
/*     */     return !$this$isNotEmpty.isEmpty();
/*     */   }
/*     */   
/*     */   public static final <T> void forEach(@NotNull LongSparseArray $this$forEach, @NotNull Function2 action) {
/*     */     Intrinsics.checkNotNullParameter($this$forEach, "<this>");
/*     */     Intrinsics.checkNotNullParameter(action, "action");
/*     */     for (int $i$f$forEach = 0, index = 0, i = $this$forEach.size(); index < i; index++)
/*     */       action.invoke(Long.valueOf($this$forEach.keyAt(index)), $this$forEach.valueAt(index)); 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <T> LongIterator keyIterator(@NotNull LongSparseArray<T> $this$keyIterator) {
/*     */     Intrinsics.checkNotNullParameter($this$keyIterator, "<this>");
/*     */     return new LongSparseArrayKt$keyIterator$1($this$keyIterator);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\000\n\002\020\t\n\000*\001\000\b\n\030\0002\0020\001J\t\020\b\032\0020\tH\002J\b\020\n\032\0020\013H\026R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007¨\006\f"}, d2 = {"androidx/collection/LongSparseArrayKt$keyIterator$1", "Lkotlin/collections/LongIterator;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "nextLong", "", "collection"})
/*     */   public static final class LongSparseArrayKt$keyIterator$1 extends LongIterator {
/*     */     private int index;
/*     */     
/*     */     LongSparseArrayKt$keyIterator$1(LongSparseArray<T> $receiver) {}
/*     */     
/*     */     public final int getIndex() {
/*     */       return this.index;
/*     */     }
/*     */     
/*     */     public final void setIndex(int <set-?>) {
/*     */       this.index = <set-?>;
/*     */     }
/*     */     
/*     */     public boolean hasNext() {
/*     */       return (this.index < this.$this_keyIterator.size());
/*     */     }
/*     */     
/*     */     public long nextLong() {
/*     */       int i = this.index;
/*     */       this.index = i + 1;
/*     */       return this.$this_keyIterator.keyAt(i);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <T> Iterator<T> valueIterator(@NotNull LongSparseArray<T> $this$valueIterator) {
/*     */     Intrinsics.checkNotNullParameter($this$valueIterator, "<this>");
/*     */     return new LongSparseArrayKt$valueIterator$1($this$valueIterator);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\020(\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\003*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\t\020\b\032\0020\tH\002J\016\020\n\032\0028\000H\002¢\006\002\020\013R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\004\020\005\"\004\b\006\020\007¨\006\f"}, d2 = {"androidx/collection/LongSparseArrayKt$valueIterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "()Ljava/lang/Object;", "collection"})
/*     */   public static final class LongSparseArrayKt$valueIterator$1 implements Iterator<T>, KMappedMarker {
/*     */     private int index;
/*     */     
/*     */     LongSparseArrayKt$valueIterator$1(LongSparseArray<T> $receiver) {}
/*     */     
/*     */     public final int getIndex() {
/*     */       return this.index;
/*     */     }
/*     */     
/*     */     public final void setIndex(int <set-?>) {
/*     */       this.index = <set-?>;
/*     */     }
/*     */     
/*     */     public boolean hasNext() {
/*     */       return (this.index < this.$this_valueIterator.size());
/*     */     }
/*     */     
/*     */     public T next() {
/*     */       int i = this.index;
/*     */       this.index = i + 1;
/*     */       return this.$this_valueIterator.valueAt(i);
/*     */     }
/*     */     
/*     */     public void remove() {
/*     */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\LongSparseArrayKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */