/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000v\n\000\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\t\n\002\030\002\n\002\020\034\n\002\b\004\n\002\030\002\n\002\b\013\n\002\030\002\n\002\020!\n\002\020\002\n\002\020%\n\002\020#\n\002\b\004\n\002\020$\n\002\b\002\n\002\030\002\n\002\020\f\n\002\020\r\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\032Q\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032*\020\004\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\005\"\016\022\004\022\002H\002\022\004\022\002H\0030\006H\001¢\006\002\020\007\032-\020\b\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n2\022\020\013\032\n\022\006\b\001\022\002H\n0\005\"\002H\nH\001¢\006\002\020\f\032\024\020\r\032\b\022\004\022\002H\n0\016\"\004\b\000\020\nH\001\032-\020\r\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n2\022\020\013\032\n\022\006\b\001\022\002H\n0\005\"\002H\nH\001¢\006\002\020\017\032Q\020\020\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032*\020\004\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\005\"\016\022\004\022\002H\002\022\004\022\002H\0030\006H\001¢\006\002\020\007\032\024\020\021\032\b\022\004\022\002H\n0\t\"\004\b\000\020\nH\001\032-\020\021\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n2\022\020\013\032\n\022\006\b\001\022\002H\n0\005\"\002H\nH\001¢\006\002\020\f\032 \020\022\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003H\000\032Q\020\022\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032*\020\004\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\005\"\016\022\004\022\002H\002\022\004\022\002H\0030\006H\000¢\006\002\020\007\032\024\020\023\032\b\022\004\022\002H\n0\t\"\004\b\000\020\nH\000\032-\020\023\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n2\022\020\013\032\n\022\006\b\001\022\002H\n0\005\"\002H\nH\000¢\006\002\020\f\032\024\020\024\032\b\022\004\022\002H\n0\016\"\004\b\000\020\nH\000\032-\020\024\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n2\022\020\013\032\n\022\006\b\001\022\002H\n0\005\"\002H\nH\000¢\006\002\020\017\032 \020\025\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003H\000\032Q\020\025\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\0032*\020\004\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\005\"\016\022\004\022\002H\002\022\004\022\002H\0030\006H\000¢\006\002\020\007\032\024\020\026\032\b\022\004\022\002H\n0\t\"\004\b\000\020\nH\000\032-\020\026\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n2\022\020\013\032\n\022\006\b\001\022\002H\n0\005\"\002H\nH\000¢\006\002\020\f\032-\020\027\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\0302\f\020\013\032\b\022\004\022\002H\n0\031H\004\032-\020\027\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\t2\f\020\013\032\b\022\004\022\002H\n0\031H\004\032,\020\032\032\b\022\004\022\002H\n0\030\"\004\b\000\020\n*\b\022\004\022\002H\n0\0302\006\020\033\032\002H\nH\n¢\006\002\020\034\0324\020\032\032\b\022\004\022\002H\n0\030\"\004\b\000\020\n*\b\022\004\022\002H\n0\0302\016\020\013\032\n\022\006\b\001\022\002H\n0\005H\002¢\006\002\020\035\032-\020\032\032\b\022\004\022\002H\n0\030\"\004\b\000\020\n*\b\022\004\022\002H\n0\0302\f\020\013\032\b\022\004\022\002H\n0\031H\002\032-\020\032\032\b\022\004\022\002H\n0\030\"\004\b\000\020\n*\b\022\004\022\002H\n0\0302\f\020\013\032\b\022\004\022\002H\n0\036H\002\032,\020\032\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n*\b\022\004\022\002H\n0\0162\006\020\033\032\002H\nH\n¢\006\002\020\037\0324\020\032\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n*\b\022\004\022\002H\n0\0162\016\020\013\032\n\022\006\b\001\022\002H\n0\005H\002¢\006\002\020 \032-\020\032\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n*\b\022\004\022\002H\n0\0162\f\020\013\032\b\022\004\022\002H\n0\031H\002\032-\020\032\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n*\b\022\004\022\002H\n0\0162\f\020\013\032\b\022\004\022\002H\n0\036H\002\032@\020\032\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\006\020!\032\002H\002H\002¢\006\002\020\"\032H\020\032\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\016\020#\032\n\022\006\b\001\022\002H\0020\005H\002¢\006\002\020$\032A\020\032\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\f\020#\032\b\022\004\022\002H\0020\031H\002\032A\020\032\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\f\020#\032\b\022\004\022\002H\0020\036H\002\032,\020\032\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\t2\006\020\033\032\002H\nH\n¢\006\002\020%\0324\020\032\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\t2\016\020\013\032\n\022\006\b\001\022\002H\n0\005H\002¢\006\002\020&\032-\020\032\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\t2\f\020\013\032\b\022\004\022\002H\n0\031H\002\032-\020\032\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\t2\f\020\013\032\b\022\004\022\002H\n0\036H\002\032<\020'\032\b\022\004\022\002H(0\016\"\004\b\000\020(*\b\022\004\022\002H(0\0162\030\020)\032\024\022\n\022\b\022\004\022\002H(0+\022\004\022\0020,0*H\bø\001\000\032V\020'\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\036\020)\032\032\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030-\022\004\022\0020,0*H\bø\001\000\032<\020'\032\b\022\004\022\002H(0\t\"\004\b\000\020(*\b\022\004\022\002H(0\t2\030\020)\032\024\022\n\022\b\022\004\022\002H(0.\022\004\022\0020,0*H\bø\001\000\032,\020/\032\b\022\004\022\002H\n0\030\"\004\b\000\020\n*\b\022\004\022\002H\n0\0302\006\020\033\032\002H\nH\n¢\006\002\020\034\0324\020/\032\b\022\004\022\002H\n0\030\"\004\b\000\020\n*\b\022\004\022\002H\n0\0302\016\020\013\032\n\022\006\b\001\022\002H\n0\005H\002¢\006\002\020\035\032-\020/\032\b\022\004\022\002H\n0\030\"\004\b\000\020\n*\b\022\004\022\002H\n0\0302\f\020\013\032\b\022\004\022\002H\n0\031H\002\032-\020/\032\b\022\004\022\002H\n0\030\"\004\b\000\020\n*\b\022\004\022\002H\n0\0302\f\020\013\032\b\022\004\022\002H\n0\036H\002\032,\020/\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n*\b\022\004\022\002H\n0\0162\006\020\033\032\002H\nH\n¢\006\002\020\037\0324\020/\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n*\b\022\004\022\002H\n0\0162\016\020\013\032\n\022\006\b\001\022\002H\n0\005H\002¢\006\002\020 \032-\020/\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n*\b\022\004\022\002H\n0\0162\f\020\013\032\b\022\004\022\002H\n0\031H\002\032-\020/\032\b\022\004\022\002H\n0\016\"\004\b\000\020\n*\b\022\004\022\002H\n0\0162\f\020\013\032\b\022\004\022\002H\n0\036H\002\032T\020/\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\032\020\004\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\005H\n¢\006\002\0200\032G\020/\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\022\0201\032\016\022\004\022\002H\002\022\004\022\002H\0030\006H\n\032M\020/\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\030\020\004\032\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\031H\n\032I\020/\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\024\0202\032\020\022\006\b\001\022\002H\002\022\004\022\002H\00303H\n\032M\020/\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\030\020\004\032\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\036H\n\032,\020/\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\t2\006\020\033\032\002H\nH\n¢\006\002\020%\0324\020/\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\t2\016\020\013\032\n\022\006\b\001\022\002H\n0\005H\002¢\006\002\020&\032-\020/\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\t2\f\020\013\032\b\022\004\022\002H\n0\031H\002\032-\020/\032\b\022\004\022\002H\n0\t\"\004\b\000\020\n*\b\022\004\022\002H\n0\t2\f\020\013\032\b\022\004\022\002H\n0\036H\002\032S\0204\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\032\020\004\032\026\022\022\b\001\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\005H\000¢\006\002\0200\032L\0204\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\030\020\004\032\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\031H\000\032H\0204\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\024\0202\032\020\022\006\b\001\022\002H\002\022\004\022\002H\00303H\000\032L\0204\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\020\022\006\b\001\022\002H\002\022\004\022\002H\0030\0012\030\020\004\032\024\022\020\022\016\022\004\022\002H\002\022\004\022\002H\0030\0060\036H\000\032\022\0205\032\b\022\004\022\0020706*\00208H\000\032\036\0205\032\b\022\004\022\002H(06\"\004\b\000\020(*\b\022\004\022\002H(0\031H\000\032\036\0205\032\b\022\004\022\002H(06\"\004\b\000\020(*\b\022\004\022\002H(0\036H\000\0320\0209\032\016\022\004\022\002H\002\022\004\022\002H\0030:\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\00303H\000\032\022\020;\032\b\022\004\022\002070\t*\00208H\000\032\036\020;\032\b\022\004\022\002H(0<\"\004\b\000\020(*\b\022\004\022\002H(0\031H\000\032\036\020;\032\b\022\004\022\002H(0<\"\004\b\000\020(*\b\022\004\022\002H(0\036H\000\0320\020=\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\00303H\000\032\022\020>\032\b\022\004\022\002070\t*\00208H\000\032\036\020>\032\b\022\004\022\002H(0\t\"\004\b\000\020(*\b\022\004\022\002H(0\031H\000\032\036\020>\032\b\022\004\022\002H(0\t\"\004\b\000\020(*\b\022\004\022\002H(0\036H\000\032\022\020?\032\b\022\004\022\002070\016*\00208H\000\032\036\020?\032\b\022\004\022\002H(0\016\"\004\b\000\020(*\b\022\004\022\002H(0\031H\000\032\036\020?\032\b\022\004\022\002H(0\016\"\004\b\000\020(*\b\022\004\022\002H(0\036H\000\0320\020@\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\004\b\001\020\003*\016\022\004\022\002H\002\022\004\022\002H\00303H\000\032\022\020A\032\b\022\004\022\002070\t*\00208H\000\032\036\020A\032\b\022\004\022\002H(0\t\"\004\b\000\020(*\b\022\004\022\002H(0\031H\000\032\036\020A\032\b\022\004\022\002H(0\t\"\004\b\000\020(*\b\022\004\022\002H(0\036H\000\002\007\n\005\b20\001¨\006B"}, d2 = {"immutableHashMapOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "K", "V", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "immutableHashSetOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "immutableListOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "([Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "immutableMapOf", "immutableSetOf", "persistentHashMapOf", "persistentHashSetOf", "persistentListOf", "persistentMapOf", "persistentSetOf", "intersect", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "", "minus", "element", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Lkotlin/sequences/Sequence;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "key", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "keys", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "mutate", "T", "mutator", "Lkotlin/Function1;", "", "", "", "", "plus", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;[Lkotlin/Pair;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "pair", "map", "", "putAll", "toImmutableList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "", "toImmutableMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "toImmutableSet", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "toPersistentHashMap", "toPersistentHashSet", "toPersistentList", "toPersistentMap", "toPersistentSet", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
/*     */ public final class ExtensionsKt {
/*     */   @NotNull
/*     */   public static final <T> PersistentSet<T> mutate(@NotNull PersistentSet $this$mutate, @NotNull Function1 mutator) {
/*  31 */     Intrinsics.checkNotNullParameter($this$mutate, "<this>"); Intrinsics.checkNotNullParameter(mutator, "mutator"); int $i$f$mutate = 0; PersistentSet.Builder<T> builder = $this$mutate.builder(); mutator.invoke(builder); return builder.build();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <T> PersistentList<T> mutate(@NotNull PersistentList $this$mutate, @NotNull Function1 mutator) {
/*  41 */     Intrinsics.checkNotNullParameter($this$mutate, "<this>"); Intrinsics.checkNotNullParameter(mutator, "mutator"); int $i$f$mutate = 0; PersistentList.Builder<T> builder = $this$mutate.builder(); mutator.invoke(builder); return builder.build();
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
/*     */   public static final <K, V> PersistentMap<K, V> mutate(@NotNull PersistentMap $this$mutate, @NotNull Function1 mutator) {
/*  53 */     Intrinsics.checkNotNullParameter($this$mutate, "<this>"); Intrinsics.checkNotNullParameter(mutator, "mutator"); int $i$f$mutate = 0; PersistentMap.Builder<K, V> builder = $this$mutate.builder(); mutator.invoke(builder); return builder.build();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<E> $this$plus, Object element) {
/*  62 */     Intrinsics.checkNotNullParameter($this$plus, "<this>"); int $i$f$plus = 0; return $this$plus.add((E)element);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<E> $this$minus, Object element) {
/*  70 */     Intrinsics.checkNotNullParameter($this$minus, "<this>"); int $i$f$minus = 0; return $this$minus.remove((E)element);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection<E> $this$plus, @NotNull Iterable elements)
/*     */   {
/*  80 */     Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentCollection.Builder<E> builder1 = $this$plus.builder(), it = builder1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 742 */     int $i$a$-also-ExtensionsKt$plus$1 = 0; CollectionsKt.addAll(it, elements); return (elements instanceof Collection) ? $this$plus.addAll((Collection<? extends E>)elements) : builder1.build(); } @NotNull public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection $this$plus, @NotNull Object[] elements) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentCollection.Builder<E> builder1 = $this$plus.builder(), it = builder1; int $i$a$-also-ExtensionsKt$plus$2 = 0; CollectionsKt.addAll(it, elements); return builder1.build(); } @NotNull public static final <E> PersistentCollection<E> plus(@NotNull PersistentCollection $this$plus, @NotNull Sequence elements) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentCollection.Builder<E> builder1 = $this$plus.builder(), it = builder1; int $i$a$-also-ExtensionsKt$plus$3 = 0; CollectionsKt.addAll(it, elements); return builder1.build(); } @NotNull public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection<E> $this$minus, @NotNull Iterable elements) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentCollection.Builder<E> builder1 = $this$minus.builder(), it = builder1; int $i$a$-also-ExtensionsKt$minus$1 = 0; CollectionsKt.removeAll(it, elements); return (elements instanceof Collection) ? $this$minus.removeAll((Collection<? extends E>)elements) : builder1.build(); } @NotNull public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection $this$minus, @NotNull Object[] elements) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentCollection.Builder<E> builder1 = $this$minus.builder(), it = builder1; int $i$a$-also-ExtensionsKt$minus$2 = 0; CollectionsKt.removeAll(it, elements); return builder1.build(); } @NotNull public static final <E> PersistentCollection<E> minus(@NotNull PersistentCollection $this$minus, @NotNull Sequence elements) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentCollection.Builder<E> builder1 = $this$minus.builder(), it = builder1; int $i$a$-also-ExtensionsKt$minus$3 = 0; CollectionsKt.removeAll(it, elements); return builder1.build(); } @NotNull public static final <E> PersistentList<E> plus(@NotNull PersistentList<E> $this$plus, Object element) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); int $i$f$plus = 0; return $this$plus.add((E)element); } @NotNull public static final <E> PersistentList<E> minus(@NotNull PersistentList<E> $this$minus, Object element) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); int $i$f$minus = 0; return $this$minus.remove((E)element); }
/* 743 */   @NotNull public static final <E> PersistentList<E> plus(@NotNull PersistentList<E> $this$plus, @NotNull Iterable elements) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentList<E> $this$mutate$iv = $this$plus; int $i$f$mutate = 0; PersistentList.Builder<E> builder = $this$mutate$iv.builder(); List<E> it = builder; int $i$a$-mutate-ExtensionsKt$plus$4 = 0; CollectionsKt.addAll(it, elements); return (elements instanceof Collection) ? $this$plus.addAll((Collection<? extends E>)elements) : builder.build(); } @NotNull public static final <E> PersistentList<E> plus(@NotNull PersistentList $this$plus, @NotNull Object[] elements) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentList $this$mutate$iv = $this$plus; int $i$f$mutate = 0;
/* 744 */     PersistentList.Builder<E> builder = $this$mutate$iv.builder(); List<E> it = builder; int $i$a$-mutate-ExtensionsKt$plus$5 = 0; CollectionsKt.addAll(it, elements); return builder.build(); } @NotNull public static final <E> PersistentList<E> plus(@NotNull PersistentList $this$plus, @NotNull Sequence elements) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentList $this$mutate$iv = $this$plus; int $i$f$mutate = 0;
/* 745 */     PersistentList.Builder<E> builder = $this$mutate$iv.builder(); List<E> it = builder; int $i$a$-mutate-ExtensionsKt$plus$6 = 0; CollectionsKt.addAll(it, elements); return builder.build(); } @NotNull public static final <E> PersistentList<E> minus(@NotNull PersistentList<E> $this$minus, @NotNull Iterable elements) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentList<E> $this$mutate$iv = $this$minus; int $i$f$mutate = 0;
/* 746 */     PersistentList.Builder<E> builder = $this$mutate$iv.builder(); List<E> it = builder; int $i$a$-mutate-ExtensionsKt$minus$4 = 0; CollectionsKt.removeAll(it, elements); return (elements instanceof Collection) ? $this$minus.removeAll((Collection<? extends E>)elements) : builder.build(); } @NotNull public static final <E> PersistentList<E> minus(@NotNull PersistentList $this$minus, @NotNull Object[] elements) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentList $this$mutate$iv = $this$minus; int $i$f$mutate = 0;
/* 747 */     PersistentList.Builder<E> builder = $this$mutate$iv.builder(); List<E> it = builder; int $i$a$-mutate-ExtensionsKt$minus$5 = 0; CollectionsKt.removeAll(it, elements); return builder.build(); } @NotNull public static final <E> PersistentList<E> minus(@NotNull PersistentList $this$minus, @NotNull Sequence elements) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentList $this$mutate$iv = $this$minus; int $i$f$mutate = 0;
/* 748 */     PersistentList.Builder<E> builder = $this$mutate$iv.builder(); List<E> it = builder; int $i$a$-mutate-ExtensionsKt$minus$6 = 0; CollectionsKt.removeAll(it, elements); return builder.build(); } @NotNull public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<E> $this$plus, Object element) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); int $i$f$plus = 0; return $this$plus.add((E)element); } @NotNull public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<E> $this$minus, Object element) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); int $i$f$minus = 0; return $this$minus.remove((E)element); }
/* 749 */   @NotNull public static final <E> PersistentSet<E> plus(@NotNull PersistentSet<E> $this$plus, @NotNull Iterable elements) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet<E> $this$mutate$iv = $this$plus; int $i$f$mutate = 0; PersistentSet.Builder<E> builder = $this$mutate$iv.builder(); Set<E> it = builder; int $i$a$-mutate-ExtensionsKt$plus$7 = 0; CollectionsKt.addAll(it, elements); return (elements instanceof Collection) ? $this$plus.addAll((Collection<? extends E>)elements) : builder.build(); } @NotNull public static final <E> PersistentSet<E> plus(@NotNull PersistentSet $this$plus, @NotNull Object[] elements) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = $this$plus; int $i$f$mutate = 0;
/* 750 */     PersistentSet.Builder<E> builder = $this$mutate$iv.builder(); Set<E> it = builder; int $i$a$-mutate-ExtensionsKt$plus$8 = 0; CollectionsKt.addAll(it, elements); return builder.build(); } @NotNull public static final <E> PersistentSet<E> plus(@NotNull PersistentSet $this$plus, @NotNull Sequence elements) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = $this$plus; int $i$f$mutate = 0;
/* 751 */     PersistentSet.Builder<E> builder = $this$mutate$iv.builder(); Set<E> it = builder; int $i$a$-mutate-ExtensionsKt$plus$9 = 0; CollectionsKt.addAll(it, elements); return builder.build(); } @NotNull public static final <E> PersistentSet<E> minus(@NotNull PersistentSet<E> $this$minus, @NotNull Iterable elements) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet<E> $this$mutate$iv = $this$minus; int $i$f$mutate = 0;
/* 752 */     PersistentSet.Builder<E> builder = $this$mutate$iv.builder(); Set<E> it = builder; int $i$a$-mutate-ExtensionsKt$minus$7 = 0; CollectionsKt.removeAll(it, elements); return (elements instanceof Collection) ? $this$minus.removeAll((Collection<? extends E>)elements) : builder.build(); } @NotNull public static final <E> PersistentSet<E> minus(@NotNull PersistentSet $this$minus, @NotNull Object[] elements) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = $this$minus; int $i$f$mutate = 0;
/* 753 */     PersistentSet.Builder<E> builder = $this$mutate$iv.builder(); Set<E> it = builder; int $i$a$-mutate-ExtensionsKt$minus$8 = 0; CollectionsKt.removeAll(it, elements); return builder.build(); } @NotNull public static final <E> PersistentSet<E> minus(@NotNull PersistentSet $this$minus, @NotNull Sequence elements) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet $this$mutate$iv = $this$minus; int $i$f$mutate = 0;
/* 754 */     PersistentSet.Builder<E> builder = $this$mutate$iv.builder(); Set<E> it = builder; int $i$a$-mutate-ExtensionsKt$minus$9 = 0; CollectionsKt.removeAll(it, elements); return builder.build(); } @NotNull public static final <E> PersistentSet<E> intersect(@NotNull PersistentSet<E> $this$intersect, @NotNull Iterable elements) { Intrinsics.checkNotNullParameter($this$intersect, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); PersistentSet<E> $this$mutate$iv = $this$intersect; int $i$f$mutate = 0;
/* 755 */     PersistentSet.Builder<E> builder = $this$mutate$iv.builder(); Set<E> it = builder; int $i$a$-mutate-ExtensionsKt$intersect$1 = 0; CollectionsKt.retainAll(it, elements); return (elements instanceof Collection) ? $this$intersect.retainAll((Collection<? extends E>)elements) : builder.build(); } @NotNull public static final <E> PersistentSet<E> intersect(@NotNull PersistentCollection<? extends E> $this$intersect, @NotNull Iterable<? extends E> elements) { Intrinsics.checkNotNullParameter($this$intersect, "<this>"); Intrinsics.checkNotNullParameter(elements, "elements"); return intersect(toPersistentSet($this$intersect), elements); } @NotNull public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<K, V> $this$plus, @NotNull Pair pair) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(pair, "pair"); int $i$f$plus = 0; return $this$plus.put((K)pair.getFirst(), (V)pair.getSecond()); } @NotNull public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> $this$plus, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(pairs, "pairs"); int $i$f$plus = 0; return putAll($this$plus, pairs); } @NotNull public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> $this$plus, @NotNull Pair[] pairs) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(pairs, "pairs"); int $i$f$plus = 0; return putAll($this$plus, (Pair<? extends K, ? extends V>[])pairs); } @NotNull public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> $this$plus, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(pairs, "pairs"); int $i$f$plus = 0; return putAll($this$plus, pairs); } @NotNull public static final <K, V> PersistentMap<K, V> plus(@NotNull PersistentMap<? extends K, ? extends V> $this$plus, @NotNull Map<? extends K, ? extends V> map) { Intrinsics.checkNotNullParameter($this$plus, "<this>"); Intrinsics.checkNotNullParameter(map, "map"); int $i$f$plus = 0; return putAll($this$plus, map); } @NotNull public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap<K, V> $this$putAll, @NotNull Map<? extends K, ? extends V> map) { Intrinsics.checkNotNullParameter($this$putAll, "<this>"); Intrinsics.checkNotNullParameter(map, "map"); return $this$putAll.putAll(map); }
/* 756 */   @NotNull public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap $this$putAll, @NotNull Iterable pairs) { Intrinsics.checkNotNullParameter($this$putAll, "<this>"); Intrinsics.checkNotNullParameter(pairs, "pairs"); PersistentMap $this$mutate$iv = $this$putAll; int $i$f$mutate = 0; PersistentMap.Builder<K, V> builder = $this$mutate$iv.builder(); Map<K, V> it = builder; int $i$a$-mutate-ExtensionsKt$putAll$1 = 0; MapsKt.putAll(it, pairs); return builder.build(); } @NotNull public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap $this$putAll, @NotNull Pair[] pairs) { Intrinsics.checkNotNullParameter($this$putAll, "<this>"); Intrinsics.checkNotNullParameter(pairs, "pairs"); PersistentMap $this$mutate$iv = $this$putAll; int $i$f$mutate = 0;
/* 757 */     PersistentMap.Builder<K, V> builder = $this$mutate$iv.builder(); Map<K, V> it = builder; int $i$a$-mutate-ExtensionsKt$putAll$2 = 0; MapsKt.putAll(it, pairs); return builder.build(); } @NotNull public static final <K, V> PersistentMap<K, V> putAll(@NotNull PersistentMap $this$putAll, @NotNull Sequence pairs) { Intrinsics.checkNotNullParameter($this$putAll, "<this>"); Intrinsics.checkNotNullParameter(pairs, "pairs"); PersistentMap $this$mutate$iv = $this$putAll; int $i$f$mutate = 0;
/* 758 */     PersistentMap.Builder<K, V> builder = $this$mutate$iv.builder(); Map<K, V> it = builder; int $i$a$-mutate-ExtensionsKt$putAll$3 = 0; MapsKt.putAll(it, pairs); return builder.build(); } @NotNull public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap<K, V> $this$minus, Object key) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); return $this$minus.remove((K)key); }
/* 759 */   @NotNull public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap $this$minus, @NotNull Iterable keys) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(keys, "keys"); PersistentMap $this$mutate$iv = $this$minus; int $i$f$mutate = 0; PersistentMap.Builder<K, V> builder = $this$mutate$iv.builder(); Map<K, V> it = builder; int $i$a$-mutate-ExtensionsKt$minus$10 = 0; CollectionsKt.removeAll(it.keySet(), keys); return builder.build(); } @NotNull public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap $this$minus, @NotNull Object[] keys) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(keys, "keys"); PersistentMap $this$mutate$iv = $this$minus; int $i$f$mutate = 0;
/* 760 */     PersistentMap.Builder<K, V> builder = $this$mutate$iv.builder(); Map<K, V> it = builder; int $i$a$-mutate-ExtensionsKt$minus$11 = 0; CollectionsKt.removeAll(it.keySet(), keys); return builder.build(); } @NotNull public static final <K, V> PersistentMap<K, V> minus(@NotNull PersistentMap $this$minus, @NotNull Sequence keys) { Intrinsics.checkNotNullParameter($this$minus, "<this>"); Intrinsics.checkNotNullParameter(keys, "keys"); PersistentMap $this$mutate$iv = $this$minus; int $i$f$mutate = 0;
/* 761 */     PersistentMap.Builder<K, V> builder = $this$mutate$iv.builder(); Map<K, V> it = builder; int $i$a$-mutate-ExtensionsKt$minus$12 = 0; CollectionsKt.removeAll(it.keySet(), keys); return builder.build(); } @NotNull public static final <E> PersistentList<E> persistentListOf(@NotNull Object... elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return UtilsKt.persistentVectorOf().addAll(ArraysKt.asList(elements)); } @NotNull public static final <E> PersistentList<E> persistentListOf() { return UtilsKt.persistentVectorOf(); } @NotNull public static final <E> PersistentSet<E> persistentSetOf(@NotNull Object... elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return PersistentOrderedSet.Companion.emptyOf$runtime().addAll(ArraysKt.asList(elements)); } @NotNull public static final <E> PersistentSet<E> persistentSetOf() { return PersistentOrderedSet.Companion.emptyOf$runtime(); } @NotNull public static final <E> PersistentSet<E> persistentHashSetOf(@NotNull Object... elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return PersistentHashSet.Companion.emptyOf$runtime().addAll(ArraysKt.asList(elements)); } @NotNull public static final <E> PersistentSet<E> persistentHashSetOf() { return PersistentHashSet.Companion.emptyOf$runtime(); }
/* 762 */   @NotNull public static final <K, V> PersistentMap<K, V> persistentMapOf(@NotNull Pair... pairs) { Intrinsics.checkNotNullParameter(pairs, "pairs"); PersistentMap $this$mutate$iv = (PersistentMap)PersistentOrderedMap.Companion.emptyOf$runtime(); int $i$f$mutate = 0; Intrinsics.checkNotNull($this$mutate$iv, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>"); PersistentMap.Builder<K, V> builder = $this$mutate$iv.builder(); Map<K, V> it = builder; int $i$a$-mutate-ExtensionsKt$persistentMapOf$1 = 0; MapsKt.putAll(it, pairs); return builder.build(); }
/* 763 */   @NotNull public static final <K, V> PersistentMap<K, V> persistentMapOf() { return (PersistentMap<K, V>)PersistentOrderedMap.Companion.emptyOf$runtime(); } @NotNull public static final <K, V> PersistentMap<K, V> persistentHashMapOf() { return (PersistentMap<K, V>)PersistentHashMap.Companion.emptyOf$runtime(); } @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf(*elements)", imports = {})) @NotNull public static final <E> PersistentList<E> immutableListOf(@NotNull Object... elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return persistentListOf(Arrays.copyOf((E[])elements, elements.length)); } @Deprecated(message = "Use persistentListOf instead.", replaceWith = @ReplaceWith(expression = "persistentListOf()", imports = {})) @NotNull public static final <E> PersistentList<E> immutableListOf() { return persistentListOf(); } @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf(*elements)", imports = {})) @NotNull public static final <E> PersistentSet<E> immutableSetOf(@NotNull Object... elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return persistentSetOf(Arrays.copyOf((E[])elements, elements.length)); } @Deprecated(message = "Use persistentSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentSetOf()", imports = {})) @NotNull public static final <E> PersistentSet<E> immutableSetOf() { return persistentSetOf(); } @Deprecated(message = "Use persistentHashSetOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashSetOf(*elements)", imports = {})) @NotNull public static final <E> PersistentSet<E> immutableHashSetOf(@NotNull Object... elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return persistentHashSetOf(Arrays.copyOf((E[])elements, elements.length)); } @Deprecated(message = "Use persistentMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentMapOf(*pairs)", imports = {})) @NotNull public static final <K, V> PersistentMap<K, V> immutableMapOf(@NotNull Pair... pairs) { Intrinsics.checkNotNullParameter(pairs, "pairs"); return persistentMapOf(Arrays.<Pair<? extends K, ? extends V>>copyOf((Pair<? extends K, ? extends V>[])pairs, pairs.length)); } @NotNull public static final <K, V> PersistentMap<K, V> persistentHashMapOf(@NotNull Pair... pairs) { Intrinsics.checkNotNullParameter(pairs, "pairs"); PersistentMap $this$mutate$iv = (PersistentMap)PersistentHashMap.Companion.emptyOf$runtime(); int $i$f$mutate = 0; Intrinsics.checkNotNull($this$mutate$iv, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>"); PersistentMap.Builder<K, V> builder = $this$mutate$iv.builder(); Map<K, V> it = builder; int $i$a$-mutate-ExtensionsKt$persistentHashMapOf$1 = 0; MapsKt.putAll(it, pairs); return builder.build(); }
/* 764 */   @Deprecated(message = "Use persistentHashMapOf instead.", replaceWith = @ReplaceWith(expression = "persistentHashMapOf(*pairs)", imports = {})) @NotNull public static final <K, V> PersistentMap<K, V> immutableHashMapOf(@NotNull Pair... pairs) { Intrinsics.checkNotNullParameter(pairs, "pairs"); return persistentHashMapOf(Arrays.<Pair<? extends K, ? extends V>>copyOf((Pair<? extends K, ? extends V>[])pairs, pairs.length)); } @NotNull public static final <T> ImmutableList<T> toImmutableList(@NotNull Iterable<? extends T> $this$toImmutableList) { Intrinsics.checkNotNullParameter($this$toImmutableList, "<this>"); if ((($this$toImmutableList instanceof ImmutableList) ? $this$toImmutableList : null) == null) ($this$toImmutableList instanceof ImmutableList) ? $this$toImmutableList : null;  return toPersistentList($this$toImmutableList); } @NotNull public static final <T> ImmutableList<T> toImmutableList(@NotNull Sequence<? extends T> $this$toImmutableList) { Intrinsics.checkNotNullParameter($this$toImmutableList, "<this>"); return toPersistentList($this$toImmutableList); } @NotNull public static final ImmutableList<Character> toImmutableList(@NotNull CharSequence $this$toImmutableList) { Intrinsics.checkNotNullParameter($this$toImmutableList, "<this>"); return toPersistentList($this$toImmutableList); } @NotNull public static final <T> PersistentList<T> toPersistentList(@NotNull Iterable $this$toPersistentList) { Intrinsics.checkNotNullParameter($this$toPersistentList, "<this>"); if ((($this$toPersistentList instanceof PersistentList) ? (PersistentList<T>)$this$toPersistentList : null) == null) { ($this$toPersistentList instanceof PersistentList) ? (PersistentList<T>)$this$toPersistentList : null; ($this$toPersistentList instanceof PersistentList.Builder) ? (Object<?>)$this$toPersistentList : null; if ((((($this$toPersistentList instanceof PersistentList.Builder) ? (Object<?>)$this$toPersistentList : null) != null) ? (($this$toPersistentList instanceof PersistentList.Builder) ? (Object<?>)$this$toPersistentList : null).build() : null) == null) ((($this$toPersistentList instanceof PersistentList.Builder) ? (Object<?>)$this$toPersistentList : null) != null) ? (($this$toPersistentList instanceof PersistentList.Builder) ? (Object<?>)$this$toPersistentList : null).build() : null;  }  return ($this$toPersistentList instanceof PersistentList) ? (PersistentList<T>)$this$toPersistentList : null; } @NotNull public static final <T> PersistentList<T> toPersistentList(@NotNull Sequence<? extends T> $this$toPersistentList) { Intrinsics.checkNotNullParameter($this$toPersistentList, "<this>"); return plus(persistentListOf(), $this$toPersistentList); } @NotNull public static final PersistentList<Character> toPersistentList(@NotNull CharSequence $this$toPersistentList) { Intrinsics.checkNotNullParameter($this$toPersistentList, "<this>"); PersistentList<?> $this$mutate$iv = persistentListOf(); int $i$f$mutate = 0; PersistentList.Builder<?> builder = $this$mutate$iv.builder(); List<?> it = builder; int $i$a$-mutate-ExtensionsKt$toPersistentList$1 = 0; StringsKt.toCollection($this$toPersistentList, it); return (PersistentList)builder.build(); } @NotNull public static final <T> ImmutableSet<T> toImmutableSet(@NotNull Iterable<? extends T> $this$toImmutableSet) { Intrinsics.checkNotNullParameter($this$toImmutableSet, "<this>"); if ((($this$toImmutableSet instanceof ImmutableSet) ? $this$toImmutableSet : null) == null) { ($this$toImmutableSet instanceof ImmutableSet) ? $this$toImmutableSet : null; ($this$toImmutableSet instanceof PersistentSet.Builder) ? (Object<?>)$this$toImmutableSet : null; ((($this$toImmutableSet instanceof PersistentSet.Builder) ? (Object<?>)$this$toImmutableSet : null) != null) ? (ImmutableSet)(($this$toImmutableSet instanceof PersistentSet.Builder) ? (Object<?>)$this$toImmutableSet : null).build() : null; }  return ((((($this$toImmutableSet instanceof PersistentSet.Builder) ? (Object<?>)$this$toImmutableSet : null) != null) ? (ImmutableSet)(($this$toImmutableSet instanceof PersistentSet.Builder) ? (Object<?>)$this$toImmutableSet : null).build() : null) != null) ? (((($this$toImmutableSet instanceof PersistentSet.Builder) ? (Object<?>)$this$toImmutableSet : null) != null) ? (ImmutableSet)(($this$toImmutableSet instanceof PersistentSet.Builder) ? (Object<?>)$this$toImmutableSet : null).build() : null) : plus(persistentSetOf(), $this$toImmutableSet); } @NotNull public static final <T> ImmutableSet<T> toImmutableSet(@NotNull Sequence<? extends T> $this$toImmutableSet) { Intrinsics.checkNotNullParameter($this$toImmutableSet, "<this>"); return toPersistentSet($this$toImmutableSet); } @NotNull public static final PersistentSet<Character> toImmutableSet(@NotNull CharSequence $this$toImmutableSet) { Intrinsics.checkNotNullParameter($this$toImmutableSet, "<this>"); return toPersistentSet($this$toImmutableSet); } @NotNull public static final <T> PersistentSet<T> toPersistentSet(@NotNull Iterable<? extends T> $this$toPersistentSet) { Intrinsics.checkNotNullParameter($this$toPersistentSet, "<this>"); ($this$toPersistentSet instanceof PersistentOrderedSet) ? (PersistentSet<T>)$this$toPersistentSet : null; ($this$toPersistentSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder) ? $this$toPersistentSet : null; if ((((($this$toPersistentSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder) ? $this$toPersistentSet : null) != null) ? (($this$toPersistentSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder) ? $this$toPersistentSet : null).build() : null) == null) ((($this$toPersistentSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder) ? $this$toPersistentSet : null) != null) ? (($this$toPersistentSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder) ? $this$toPersistentSet : null).build() : null;  return ((($this$toPersistentSet instanceof PersistentOrderedSet) ? (PersistentSet<T>)$this$toPersistentSet : null) != null) ? (($this$toPersistentSet instanceof PersistentOrderedSet) ? (PersistentSet<T>)$this$toPersistentSet : null) : plus(PersistentOrderedSet.Companion.emptyOf$runtime(), $this$toPersistentSet); } @NotNull public static final <T> PersistentSet<T> toPersistentSet(@NotNull Sequence<? extends T> $this$toPersistentSet) { Intrinsics.checkNotNullParameter($this$toPersistentSet, "<this>"); return plus(persistentSetOf(), $this$toPersistentSet); }
/* 765 */   @NotNull public static final PersistentSet<Character> toPersistentSet(@NotNull CharSequence $this$toPersistentSet) { Intrinsics.checkNotNullParameter($this$toPersistentSet, "<this>"); PersistentSet<?> $this$mutate$iv = persistentSetOf(); int $i$f$mutate = 0; PersistentSet.Builder<?> builder = $this$mutate$iv.builder(); Set<?> it = builder; int $i$a$-mutate-ExtensionsKt$toPersistentSet$1 = 0; StringsKt.toCollection($this$toPersistentSet, it); return (PersistentSet)builder.build(); } @NotNull public static final <T> PersistentSet<T> toPersistentHashSet(@NotNull Iterable<? extends T> $this$toPersistentHashSet) { Intrinsics.checkNotNullParameter($this$toPersistentHashSet, "<this>"); ($this$toPersistentHashSet instanceof PersistentHashSet) ? (PersistentSet<T>)$this$toPersistentHashSet : null; ($this$toPersistentHashSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) ? $this$toPersistentHashSet : null; ((($this$toPersistentHashSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) ? $this$toPersistentHashSet : null) != null) ? (PersistentSet<T>)(($this$toPersistentHashSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) ? $this$toPersistentHashSet : null).build() : null; return ((($this$toPersistentHashSet instanceof PersistentHashSet) ? (PersistentSet<T>)$this$toPersistentHashSet : null) != null) ? (($this$toPersistentHashSet instanceof PersistentHashSet) ? (PersistentSet<T>)$this$toPersistentHashSet : null) : (((((($this$toPersistentHashSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) ? $this$toPersistentHashSet : null) != null) ? (PersistentSet<T>)(($this$toPersistentHashSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) ? $this$toPersistentHashSet : null).build() : null) != null) ? (((($this$toPersistentHashSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) ? $this$toPersistentHashSet : null) != null) ? (PersistentSet<T>)(($this$toPersistentHashSet instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) ? $this$toPersistentHashSet : null).build() : null) : plus(PersistentHashSet.Companion.emptyOf$runtime(), $this$toPersistentHashSet)); } @NotNull public static final <T> PersistentSet<T> toPersistentHashSet(@NotNull Sequence<? extends T> $this$toPersistentHashSet) { Intrinsics.checkNotNullParameter($this$toPersistentHashSet, "<this>"); return plus(persistentHashSetOf(), $this$toPersistentHashSet); }
/* 766 */   @NotNull public static final PersistentSet<Character> toPersistentHashSet(@NotNull CharSequence $this$toPersistentHashSet) { Intrinsics.checkNotNullParameter($this$toPersistentHashSet, "<this>"); PersistentSet<?> $this$mutate$iv = persistentHashSetOf(); int $i$f$mutate = 0; PersistentSet.Builder<?> builder = $this$mutate$iv.builder(); Set<?> it = builder; int $i$a$-mutate-ExtensionsKt$toPersistentHashSet$1 = 0; StringsKt.toCollection($this$toPersistentHashSet, it); return (PersistentSet)builder.build(); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <K, V> ImmutableMap<K, V> toImmutableMap(@NotNull Map<? extends K, ? extends V> $this$toImmutableMap) {
/*     */     Intrinsics.checkNotNullParameter($this$toImmutableMap, "<this>");
/*     */     if ((($this$toImmutableMap instanceof ImmutableMap) ? $this$toImmutableMap : null) == null) {
/*     */       ($this$toImmutableMap instanceof ImmutableMap) ? $this$toImmutableMap : null;
/*     */       ($this$toImmutableMap instanceof PersistentMap.Builder) ? (Object<?, ?>)$this$toImmutableMap : null;
/*     */       ((($this$toImmutableMap instanceof PersistentMap.Builder) ? (Object<?, ?>)$this$toImmutableMap : null) != null) ? (ImmutableMap)(($this$toImmutableMap instanceof PersistentMap.Builder) ? (Object<?, ?>)$this$toImmutableMap : null).build() : null;
/*     */     } 
/*     */     return ((((($this$toImmutableMap instanceof PersistentMap.Builder) ? (Object<?, ?>)$this$toImmutableMap : null) != null) ? (ImmutableMap)(($this$toImmutableMap instanceof PersistentMap.Builder) ? (Object<?, ?>)$this$toImmutableMap : null).build() : null) != null) ? (((($this$toImmutableMap instanceof PersistentMap.Builder) ? (Object<?, ?>)$this$toImmutableMap : null) != null) ? (ImmutableMap)(($this$toImmutableMap instanceof PersistentMap.Builder) ? (Object<?, ?>)$this$toImmutableMap : null).build() : null) : persistentMapOf().putAll($this$toImmutableMap);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <K, V> PersistentMap<K, V> toPersistentMap(@NotNull Map $this$toPersistentMap) {
/*     */     Intrinsics.checkNotNullParameter($this$toPersistentMap, "<this>");
/*     */     ($this$toPersistentMap instanceof PersistentOrderedMap) ? (PersistentMap<K, V>)$this$toPersistentMap : null;
/*     */     ($this$toPersistentMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder) ? $this$toPersistentMap : null;
/*     */     if ((((($this$toPersistentMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder) ? $this$toPersistentMap : null) != null) ? (($this$toPersistentMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder) ? $this$toPersistentMap : null).build() : null) == null)
/*     */       ((($this$toPersistentMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder) ? $this$toPersistentMap : null) != null) ? (($this$toPersistentMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder) ? $this$toPersistentMap : null).build() : null; 
/*     */     return ((($this$toPersistentMap instanceof PersistentOrderedMap) ? (PersistentMap<K, V>)$this$toPersistentMap : null) != null) ? (($this$toPersistentMap instanceof PersistentOrderedMap) ? (PersistentMap<K, V>)$this$toPersistentMap : null) : PersistentOrderedMap.Companion.emptyOf$runtime().putAll($this$toPersistentMap);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final <K, V> PersistentMap<K, V> toPersistentHashMap(@NotNull Map $this$toPersistentHashMap) {
/*     */     Intrinsics.checkNotNullParameter($this$toPersistentHashMap, "<this>");
/*     */     ($this$toPersistentHashMap instanceof PersistentHashMap) ? (PersistentMap<K, V>)$this$toPersistentHashMap : null;
/*     */     ($this$toPersistentHashMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) ? $this$toPersistentHashMap : null;
/*     */     ((($this$toPersistentHashMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) ? $this$toPersistentHashMap : null) != null) ? (PersistentMap<K, V>)(($this$toPersistentHashMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) ? $this$toPersistentHashMap : null).build() : null;
/*     */     return ((($this$toPersistentHashMap instanceof PersistentHashMap) ? (PersistentMap<K, V>)$this$toPersistentHashMap : null) != null) ? (($this$toPersistentHashMap instanceof PersistentHashMap) ? (PersistentMap<K, V>)$this$toPersistentHashMap : null) : (((((($this$toPersistentHashMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) ? $this$toPersistentHashMap : null) != null) ? (PersistentMap<K, V>)(($this$toPersistentHashMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) ? $this$toPersistentHashMap : null).build() : null) != null) ? (((($this$toPersistentHashMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) ? $this$toPersistentHashMap : null) != null) ? (PersistentMap<K, V>)(($this$toPersistentHashMap instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) ? $this$toPersistentHashMap : null).build() : null) : PersistentHashMap.Companion.emptyOf$runtime().putAll($this$toPersistentHashMap));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\ExtensionsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */