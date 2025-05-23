/*     */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;
/*     */ 
/*     */ import androidx.compose.runtime.PreconditionsKt;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
/*     */ import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.Arrays;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function5;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.IntProgression;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b*\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b(\b\000\030\000 }*\004\b\000\020\001*\004\b\001\020\0022\0020\003:\002}~B'\b\026\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\016\020\007\032\n\022\006\022\004\030\0010\0030\b¢\006\002\020\tB/\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\016\020\007\032\n\022\006\022\004\030\0010\0030\b\022\b\020\n\032\004\030\0010\013¢\006\002\020\fJ\001\020\021\032\0020\0222\001\020\023\032}\022\037\022\035\022\004\022\0028\000\022\004\022\0028\0010\000¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\023\022\0210\005¢\006\f\b\025\022\b\b\026\022\004\b\b(\030\022\023\022\0210\005¢\006\f\b\025\022\b\b\026\022\004\b\b(\031\022\023\022\0210\005¢\006\f\b\025\022\b\b\026\022\004\b\b(\004\022\023\022\0210\005¢\006\f\b\025\022\b\b\026\022\004\b\b(\006\022\004\022\0020\0220\024H\000¢\006\002\b\032J\001\020\021\032\0020\0222\001\020\023\032}\022\037\022\035\022\004\022\0028\000\022\004\022\0028\0010\000¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\023\022\0210\005¢\006\f\b\025\022\b\b\026\022\004\b\b(\030\022\023\022\0210\005¢\006\f\b\025\022\b\b\026\022\004\b\b(\031\022\023\022\0210\005¢\006\f\b\025\022\b\b\026\022\004\b\b(\004\022\023\022\0210\005¢\006\f\b\025\022\b\b\026\022\004\b\b(\006\022\004\022\0020\0220\0242\006\020\031\032\0020\0052\006\020\030\032\0020\005H\002J\024\020\033\032\016\022\004\022\0028\000\022\004\022\0028\0010\034H\002J\024\020\035\032\016\022\004\022\0028\000\022\004\022\0028\0010\034H\002JO\020\036\032\n\022\006\022\004\030\0010\0030\b2\006\020\037\032\0020\0052\006\020 \032\0020\0052\006\020!\032\0020\0052\006\020\"\032\0028\0002\006\020#\032\0028\0012\006\020\030\032\0020\0052\b\020$\032\004\030\0010\013H\002¢\006\002\020%J\b\020&\032\0020\005H\002J\025\020'\032\0020(2\006\020)\032\0028\000H\002¢\006\002\020*J\027\020+\032\004\030\0018\0012\006\020)\032\0028\000H\002¢\006\002\020,J+\020-\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0342\006\020)\032\0028\0002\006\020.\032\0028\001H\002¢\006\002\020/J#\0200\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020)\032\0028\000H\002¢\006\002\0201J+\0200\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020)\032\0028\0002\006\020.\032\0028\001H\002¢\006\002\0202J\036\0203\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\0204\032\0020\005H\002J#\0205\032\0020(2\006\0206\032\0020\0052\006\020)\032\0028\0002\006\020\030\032\0020\005¢\006\002\0207J\034\0208\032\0020(2\022\0209\032\016\022\004\022\0028\000\022\004\022\0028\0010\000H\002J\r\020:\032\0020\005H\000¢\006\002\b;J\025\020<\032\0020\0052\006\020 \032\0020\005H\000¢\006\002\b=J%\020>\032\004\030\0018\0012\006\0206\032\0020\0052\006\020)\032\0028\0002\006\020\030\032\0020\005¢\006\002\020?J\025\020@\032\0020(2\006\020 \032\0020\005H\000¢\006\002\bAJ\020\020B\032\0020(2\006\020 \032\0020\005H\002J1\020C\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020 \032\0020\0052\006\020)\032\0028\0002\006\020.\032\0028\001H\002¢\006\002\020DJ\025\020E\032\0028\0002\006\020\037\032\0020\005H\002¢\006\002\020FJ[\020G\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020H\032\0020\0052\006\020I\032\0028\0002\006\020J\032\0028\0012\006\020K\032\0020\0052\006\020L\032\0028\0002\006\020M\032\0028\0012\006\020\030\032\0020\0052\b\020$\032\004\030\0010\013H\002¢\006\002\020NJI\020O\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\037\032\0020\0052\006\020 \032\0020\0052\006\020!\032\0020\0052\006\020\"\032\0028\0002\006\020#\032\0028\0012\006\020\030\032\0020\005H\002¢\006\002\020PJ=\020Q\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020)\032\0028\0002\006\020.\032\0028\0012\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010SH\002¢\006\002\020TJ8\020U\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\022\0209\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020V\032\0020W2\006\020$\032\0020\013H\002J?\020X\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020)\032\0028\0002\006\020.\032\0028\0012\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010SH\002¢\006\002\020TJ7\020X\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020)\032\0028\0002\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010SH\002¢\006\002\020YJ2\020Z\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\0204\032\0020\0052\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010SH\002J9\020[\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020 \032\0020\0052\006\020)\032\0028\0002\006\020.\032\0028\0012\006\020$\032\0020\013H\002¢\006\002\020\\JQ\020]\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\037\032\0020\0052\006\020 \032\0020\0052\006\020!\032\0020\0052\006\020\"\032\0028\0002\006\020#\032\0028\0012\006\020\030\032\0020\0052\006\020$\032\0020\013H\002¢\006\002\020^JK\020_\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\0206\032\0020\0052\006\020)\032\0028\0002\006\020.\032\0028\0012\006\020\030\032\0020\0052\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010S¢\006\002\020`JJ\020a\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\022\0209\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\030\032\0020\0052\006\020V\032\0020W2\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010SJT\020b\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\022\0209\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020 \032\0020\0052\006\020\030\032\0020\0052\006\020V\032\0020W2\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010SH\002JM\020c\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\0206\032\0020\0052\006\020)\032\0028\0002\006\020.\032\0028\0012\006\020\030\032\0020\0052\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010S¢\006\002\020`JE\020c\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\0206\032\0020\0052\006\020)\032\0028\0002\006\020\030\032\0020\0052\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010S¢\006\002\020dJ:\020e\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020\037\032\0020\0052\006\020 \032\0020\0052\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010SH\002J.\020f\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020g\032\0020\0052\006\020 \032\0020\0052\006\020$\032\0020\013H\002JX\020h\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\022\020i\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\024\020j\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020g\032\0020\0052\006\020 \032\0020\0052\006\020$\032\0020\013H\002J8\020k\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020g\032\0020\0052\022\020j\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020$\032\0020\013H\002J=\020l\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\037\032\0020\0052\006\020.\032\0028\0012\022\020R\032\016\022\004\022\0028\000\022\004\022\0028\0010SH\002¢\006\002\020mJ!\020n\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020g\032\0020\005H\000¢\006\002\boJ\025\020g\032\0020\0052\006\020 \032\0020\005H\000¢\006\002\bpJ9\020q\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0342\006\0206\032\0020\0052\006\020)\032\0028\0002\006\020.\032\0028\0012\006\020\030\032\0020\005¢\006\002\020rJ9\020s\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\0206\032\0020\0052\006\020)\032\0028\0002\006\020.\032\0028\0012\006\020\030\032\0020\005¢\006\002\020tJ1\020s\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\0206\032\0020\0052\006\020)\032\0028\0002\006\020\030\032\0020\005¢\006\002\020uJ&\020v\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020\037\032\0020\0052\006\020 \032\0020\005H\002J&\020w\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020g\032\0020\0052\006\020 \032\0020\005H\002JP\020x\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\022\020i\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\024\020j\032\020\022\004\022\0028\000\022\004\022\0028\001\030\0010\0002\006\020g\032\0020\0052\006\020 \032\0020\005H\002J8\020y\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020g\032\0020\0052\006\020 \032\0020\0052\022\020j\032\016\022\004\022\0028\000\022\004\022\0028\0010\000H\002J)\020z\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\037\032\0020\0052\006\020.\032\0028\001H\002¢\006\002\020{J\025\020|\032\0028\0012\006\020\037\032\0020\005H\002¢\006\002\020FR0\020\007\032\n\022\006\022\004\030\0010\0030\b2\016\020\r\032\n\022\006\022\004\030\0010\0030\b@BX\016¢\006\n\n\002\020\020\032\004\b\016\020\017R\016\020\004\032\0020\005X\016¢\006\002\n\000R\016\020\006\032\0020\005X\016¢\006\002\n\000R\020\020\n\032\004\030\0010\013X\004¢\006\002\n\000¨\006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "dataMap", "", "nodeMap", "buffer", "", "(II[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "<set-?>", "getBuffer$runtime", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "accept", "", "visitor", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "node", "shift", "hash", "accept$runtime", "asInsertResult", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "bufferMoveEntryToNode", "keyIndex", "positionMask", "newKeyHash", "newKey", "newValue", "owner", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "calculateSize", "collisionContainsKey", "", "key", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemoveEntryAtIndex", "i", "containsKey", "keyHash", "(ILjava/lang/Object;I)Z", "elementsIdentityEquals", "otherNode", "entryCount", "entryCount$runtime", "entryKeyIndex", "entryKeyIndex$runtime", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "hasEntryAt", "hasEntryAt$runtime", "hasNodeAt", "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyAtIndex", "(I)Ljava/lang/Object;", "makeNode", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPut", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPutAll", "intersectionCounter", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemoveEntryAtIndex", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePutAll", "mutablePutAllFromOtherNodeCell", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemoveEntryAtIndex", "mutableRemoveNodeAtIndex", "nodeIndex", "mutableReplaceNode", "targetNode", "newNode", "mutableUpdateNodeAtIndex", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeAtIndex", "nodeAtIndex$runtime", "nodeIndex$runtime", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "remove", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "removeNodeAtIndex", "replaceNode", "updateNodeAtIndex", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "valueAtKeyIndex", "Companion", "ModificationResult", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,899:1\n10#2,9:900\n10#2,9:916\n10#2,9:925\n61#3,7:909\n84#4:934\n1#5:935\n26#6:936\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n630#1:900,9\n648#1:916,9\n652#1:925,9\n640#1:909,7\n700#1:934\n700#1:935\n897#1:936\n*E\n"})
/*     */ public final class TrieNode<K, V>
/*     */ {
/*     */   public TrieNode(int dataMap, int nodeMap, @NotNull Object[] buffer, @Nullable MutabilityOwnership ownedBy) {
/*  75 */     this.dataMap = dataMap;
/*  76 */     this.nodeMap = nodeMap;
/*     */     
/*  78 */     this.ownedBy = ownedBy;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     this.buffer = buffer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TrieNode(int dataMap, int nodeMap, @NotNull Object[] buffer) {
/*     */     this(dataMap, nodeMap, buffer, null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\t\n\002\030\002\n\000\b\000\030\000*\004\b\002\020\001*\004\b\003\020\0022\0020\003B!\022\022\020\004\032\016\022\004\022\0028\002\022\004\022\0028\0030\005\022\006\020\006\032\0020\007¢\006\002\020\bJD\020\017\032\016\022\004\022\0028\002\022\004\022\0028\0030\0002*\020\020\032&\022\020\022\016\022\004\022\0028\002\022\004\022\0028\0030\005\022\020\022\016\022\004\022\0028\002\022\004\022\0028\0030\0050\021H\bø\001\000R&\020\004\032\016\022\004\022\0028\002\022\004\022\0028\0030\005X\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\fR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\r\020\016\002\007\n\005\b20\001¨\006\022"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "sizeDelta", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "getSizeDelta", "()I", "replaceNode", "operation", "Lkotlin/Function1;", "runtime"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1#2:900\n*E\n"})
/*     */   public static final class ModificationResult<K, V>
/*     */   {
/*     */     @NotNull
/*     */     private TrieNode<K, V> node;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final int sizeDelta;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int $stable = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public ModificationResult(@NotNull TrieNode<K, V> node, int sizeDelta) {
/*     */       this.node = node;
/*     */       this.sizeDelta = sizeDelta;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final TrieNode<K, V> getNode() {
/*     */       return this.node;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void setNode(@NotNull TrieNode<K, V> <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.node = <set-?>;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final int getSizeDelta() {
/*     */       return this.sizeDelta;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final ModificationResult<K, V> replaceNode(@NotNull Function1 operation)
/*     */     {
/*     */       Intrinsics.checkNotNullParameter(operation, "operation");
/*     */       int $i$f$replaceNode = 0;
/*     */       ModificationResult<K, V> modificationResult1 = this, $this$replaceNode_u24lambda_u240 = modificationResult1;
/* 900 */       int $i$a$-apply-TrieNode$ModificationResult$replaceNode$1 = 0; $this$replaceNode_u24lambda_u240.setNode((TrieNode)operation.invoke($this$replaceNode_u24lambda_u240.getNode())); return modificationResult1; } } private final ModificationResult<K, V> asInsertResult() { return new ModificationResult<>(this, 1); } private final ModificationResult<K, V> asUpdateResult() { return new ModificationResult<>(this, 0); } @NotNull public final Object[] getBuffer$runtime() { return this.buffer; } public final int entryCount$runtime() { return Integer.bitCount(this.dataMap); } public final boolean hasEntryAt$runtime(int positionMask) { return ((this.dataMap & positionMask) != 0); } private final boolean hasNodeAt(int positionMask) { return ((this.nodeMap & positionMask) != 0); } public final int entryKeyIndex$runtime(int positionMask) { return 2 * Integer.bitCount(this.dataMap & positionMask - 1); } public final int nodeIndex$runtime(int positionMask) { return this.buffer.length - 1 - Integer.bitCount(this.nodeMap & positionMask - 1); } private final K keyAtIndex(int keyIndex) { return (K)this.buffer[keyIndex]; } private final V valueAtKeyIndex(int keyIndex) { return (V)this.buffer[keyIndex + 1]; } @NotNull public final TrieNode<K, V> nodeAtIndex$runtime(int nodeIndex) { Intrinsics.checkNotNull(this.buffer[nodeIndex], "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>"); return (TrieNode<K, V>)this.buffer[nodeIndex]; } private final TrieNode<K, V> insertEntryAt(int positionMask, Object key, Object value) { int keyIndex = entryKeyIndex$runtime(positionMask); Object[] newBuffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, keyIndex, key, value); return new TrieNode(this.dataMap | positionMask, this.nodeMap, newBuffer); } private final TrieNode<K, V> mutableInsertEntryAt(int positionMask, Object key, Object value, MutabilityOwnership owner) { int keyIndex = entryKeyIndex$runtime(positionMask); if (this.ownedBy == owner) { this.buffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, keyIndex, key, value); this.dataMap |= positionMask; return this; }  Object[] newBuffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, keyIndex, key, value); return new TrieNode(this.dataMap | positionMask, this.nodeMap, newBuffer, owner); } private final TrieNode<K, V> updateValueAtIndex(int keyIndex, Object value) { Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length); newBuffer[keyIndex + 1] = value; return new TrieNode(this.dataMap, this.nodeMap, newBuffer); } private final TrieNode<K, V> mutableUpdateValueAtIndex(int keyIndex, Object value, PersistentHashMapBuilder mutator) { if (this.ownedBy == mutator.getOwnership()) { this.buffer[keyIndex + 1] = value; return this; }  int i = mutator.getModCount$runtime(); mutator.setModCount$runtime(i + 1); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length); newBuffer[keyIndex + 1] = value; return new TrieNode(this.dataMap, this.nodeMap, newBuffer, mutator.getOwnership()); } private final TrieNode<K, V> updateNodeAtIndex(int nodeIndex, int positionMask, TrieNode<K, V> newNode) { Object[] newNodeBuffer = newNode.buffer; if (newNodeBuffer.length == 2 && newNode.nodeMap == 0) { if (this.buffer.length == 1) { newNode.dataMap = this.nodeMap; return newNode; }  int keyIndex = entryKeyIndex$runtime(positionMask); Object[] arrayOfObject = TrieNodeKt.access$replaceNodeWithEntry(this.buffer, nodeIndex, keyIndex, newNodeBuffer[0], newNodeBuffer[1]); return new TrieNode(this.dataMap ^ positionMask, this.nodeMap ^ positionMask, arrayOfObject); }  Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length); newBuffer[nodeIndex] = newNode; return new TrieNode(this.dataMap, this.nodeMap, newBuffer); } private final TrieNode<K, V> mutableUpdateNodeAtIndex(int nodeIndex, TrieNode<K, V> newNode, MutabilityOwnership owner) { if (this.buffer.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) { newNode.dataMap = this.nodeMap; return newNode; }  if (this.ownedBy == owner) { this.buffer[nodeIndex] = newNode; return this; }  Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length); newBuffer[nodeIndex] = newNode; return new TrieNode(this.dataMap, this.nodeMap, newBuffer, owner); } private final TrieNode<K, V> removeNodeAtIndex(int nodeIndex, int positionMask) { if (this.buffer.length == 1) return null;  Object[] newBuffer = TrieNodeKt.access$removeNodeAtIndex(this.buffer, nodeIndex); return new TrieNode(this.dataMap, this.nodeMap ^ positionMask, newBuffer); } private final TrieNode<K, V> mutableRemoveNodeAtIndex(int nodeIndex, int positionMask, MutabilityOwnership owner) { if (this.buffer.length == 1) return null;  if (this.ownedBy == owner) { this.buffer = TrieNodeKt.access$removeNodeAtIndex(this.buffer, nodeIndex); this.nodeMap ^= positionMask; return this; }  Object[] newBuffer = TrieNodeKt.access$removeNodeAtIndex(this.buffer, nodeIndex); return new TrieNode(this.dataMap, this.nodeMap ^ positionMask, newBuffer, owner); } private final Object[] bufferMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, Object newKey, Object newValue, int shift, MutabilityOwnership owner) { Object storedKey = keyAtIndex(keyIndex); int storedKeyHash = (storedKey != null) ? storedKey.hashCode() : 0; Object storedValue = valueAtKeyIndex(keyIndex); TrieNode<K, V> newNode = makeNode(storedKeyHash, (K)storedKey, (V)storedValue, newKeyHash, (K)newKey, (V)newValue, shift + 5, owner); int nodeIndex = nodeIndex$runtime(positionMask) + 1; return TrieNodeKt.access$replaceEntryWithNode(this.buffer, keyIndex, nodeIndex, newNode); } @NotNull public final TrieNode<K, V> mutablePutAll(@NotNull TrieNode<K, V> otherNode, int shift, @NotNull DeltaCounter intersectionCounter, @NotNull PersistentHashMapBuilder<K, V> mutator) { Intrinsics.checkNotNullParameter(otherNode, "otherNode"); Intrinsics.checkNotNullParameter(intersectionCounter, "intersectionCounter"); Intrinsics.checkNotNullParameter(mutator, "mutator"); if (this == otherNode) { intersectionCounter.plusAssign(calculateSize()); return this; }  if (shift > 30) return mutableCollisionPutAll(otherNode, intersectionCounter, mutator.getOwnership());  int newNodeMap = 0; newNodeMap = this.nodeMap | otherNode.nodeMap; int newDataMap = 0; newDataMap = (this.dataMap ^ otherNode.dataMap) & (newNodeMap ^ 0xFFFFFFFF); int $this$forEachOneBit$iv = this.dataMap & otherNode.dataMap, $i$f$forEachOneBit = 0; int mask$iv = $this$forEachOneBit$iv;
/* 901 */     int index$iv = 0;
/* 902 */     for (; mask$iv != 0; leftKey = keyAtIndex(entryKeyIndex$runtime(positionMask)), rightKey = otherNode.keyAtIndex(otherNode.entryKeyIndex$runtime(positionMask))) {
/* 903 */       Object leftKey, rightKey; int bit$iv = Integer.lowestOneBit(mask$iv);
/* 904 */       int positionMask = bit$iv, $i$a$-forEachOneBit-TrieNode$mutablePutAll$1 = 0;
/*     */     } 
/*     */ 
/*     */     
/*     */     boolean value$iv = ((newNodeMap & newDataMap) == 0);
/*     */     
/*     */     int $i$f$checkPrecondition = 0;
/*     */     
/* 912 */     if (!value$iv)
/* 913 */       PreconditionsKt.throwIllegalStateException("Check failed.");  Object[] newBuffer = new Object[Integer.bitCount(newDataMap) * 2 + Integer.bitCount(newNodeMap)];
/*     */     TrieNode<K, V> mutableNode = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && this.dataMap == newDataMap && this.nodeMap == newNodeMap) ? this : new TrieNode(newDataMap, newNodeMap, newBuffer);
/*     */     int i = newNodeMap, j = 0;
/* 916 */     int k = i;
/* 917 */     int m = 0;
/* 918 */     while (k != 0) {
/* 919 */       int bit$iv = Integer.lowestOneBit(k);
/* 920 */       int n = m, positionMask = bit$iv, $i$a$-forEachOneBit-TrieNode$mutablePutAll$2 = 0; int newNodeIndex = mutableNode.buffer.length - 1 - n; mutableNode.buffer[newNodeIndex] = mutablePutAllFromOtherNodeCell(otherNode, positionMask, shift, intersectionCounter, mutator);
/* 921 */       m++;
/* 922 */       k ^= bit$iv;
/*     */     }  i = newDataMap;
/*     */     j = 0;
/* 925 */     k = i;
/* 926 */     m = 0;
/* 927 */     for (; k != 0; newKeyIndex = index * 2)
/* 928 */     { int newKeyIndex, bit$iv = Integer.lowestOneBit(k);
/* 929 */       int index = m, positionMask = bit$iv, $i$a$-forEachOneBit-TrieNode$mutablePutAll$3 = 0; }  return elementsIdentityEquals(mutableNode) ? this : (otherNode.elementsIdentityEquals(mutableNode) ? otherNode : mutableNode); }
/*     */   private final TrieNode<K, V> moveEntryToNode(int keyIndex, int positionMask, int newKeyHash, Object newKey, Object newValue, int shift) { Object[] newBuffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, (K)newKey, (V)newValue, shift, null); return new TrieNode(this.dataMap ^ positionMask, this.nodeMap | positionMask, newBuffer); }
/*     */   private final TrieNode<K, V> mutableMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, Object newKey, Object newValue, int shift, MutabilityOwnership owner) { if (this.ownedBy == owner) { this.buffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, (K)newKey, (V)newValue, shift, owner); this.dataMap ^= positionMask; this.nodeMap |= positionMask; return this; }  Object[] newBuffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, (K)newKey, (V)newValue, shift, owner); return new TrieNode(this.dataMap ^ positionMask, this.nodeMap | positionMask, newBuffer, owner); }
/*     */   private final TrieNode<K, V> makeNode(int keyHash1, Object key1, Object value1, int keyHash2, Object key2, Object value2, int shift, MutabilityOwnership owner) { if (shift > 30) { Object[] arrayOfObject1 = new Object[4]; arrayOfObject1[0] = key1; arrayOfObject1[1] = value1; arrayOfObject1[2] = key2; arrayOfObject1[3] = value2; return new TrieNode(0, 0, arrayOfObject1, owner); }  int setBit1 = TrieNodeKt.indexSegment(keyHash1, shift); int setBit2 = TrieNodeKt.indexSegment(keyHash2, shift); if (setBit1 != setBit2) { Object[] arrayOfObject1 = new Object[4]; arrayOfObject1[0] = key1; arrayOfObject1[1] = value1; arrayOfObject1[2] = key2; arrayOfObject1[3] = value2; arrayOfObject1 = new Object[4]; arrayOfObject1[0] = key2; arrayOfObject1[1] = value2; arrayOfObject1[2] = key1; arrayOfObject1[3] = value1; Object[] nodeBuffer = (setBit1 < setBit2) ? arrayOfObject1 : arrayOfObject1; return new TrieNode(1 << setBit1 | 1 << setBit2, 0, nodeBuffer, owner); }  TrieNode<K, V> node = makeNode(keyHash1, (K)key1, (V)value1, keyHash2, (K)key2, (V)value2, shift + 5, owner); Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = node; return new TrieNode(0, 1 << setBit1, arrayOfObject, owner); }
/*     */   private final TrieNode<K, V> removeEntryAtIndex(int keyIndex, int positionMask) { if (this.buffer.length == 2) return null;  Object[] newBuffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, keyIndex); return new TrieNode(this.dataMap ^ positionMask, this.nodeMap, newBuffer); }
/* 934 */   private final TrieNode<K, V> mutableRemoveEntryAtIndex(int keyIndex, int positionMask, PersistentHashMapBuilder mutator) { int i = mutator.size(); mutator.setSize(i + -1); mutator.setOperationResult$runtime(valueAtKeyIndex(keyIndex)); if (this.buffer.length == 2) return null;  if (this.ownedBy == mutator.getOwnership()) { this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, keyIndex); this.dataMap ^= positionMask; return this; }  Object[] newBuffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, keyIndex); return new TrieNode(this.dataMap ^ positionMask, this.nodeMap, newBuffer, mutator.getOwnership()); } private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i) { if (this.buffer.length == 2) return null;  Object[] newBuffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i); return new TrieNode(0, 0, newBuffer); } private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder mutator) { int j = mutator.size(); mutator.setSize(j + -1); mutator.setOperationResult$runtime(valueAtKeyIndex(i)); if (this.buffer.length == 2) return null;  if (this.ownedBy == mutator.getOwnership()) { this.buffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i); return this; }  Object[] newBuffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i); return new TrieNode(0, 0, newBuffer, mutator.getOwnership()); } private final boolean collisionContainsKey(Object key) { IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, this.buffer.length), 2); int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep(); if ((k > 0 && i <= j) || (k < 0 && j <= i)) while (true) { if (Intrinsics.areEqual(key, this.buffer[i])) return true;  if (i != j) { i += k; continue; }  break; }   return false; } private final V collisionGet(Object key) { IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, this.buffer.length), 2); int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep(); if ((k > 0 && i <= j) || (k < 0 && j <= i)) while (true) { if (Intrinsics.areEqual(key, keyAtIndex(i))) return valueAtKeyIndex(i);  if (i != j) { i += k; continue; }  break; }   return null; } private final ModificationResult<K, V> collisionPut(Object key, Object value) { IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, this.buffer.length), 2); int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep(); if ((k > 0 && i <= j) || (k < 0 && j <= i)) while (true) { if (Intrinsics.areEqual(key, keyAtIndex(i))) { if (value == valueAtKeyIndex(i)) return null;  Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] arrayOfObject = Arrays.copyOf(this.buffer, this.buffer.length); arrayOfObject[i + 1] = value; return (new TrieNode(0, 0, arrayOfObject)).asUpdateResult(); }  if (i != j) { i += k; continue; }  break; }   Object[] newBuffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, key, value); return (new TrieNode(0, 0, newBuffer)).asInsertResult(); } private final TrieNode<K, V> mutableCollisionPut(Object key, Object value, PersistentHashMapBuilder mutator) { IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, this.buffer.length), 2); int i = intProgression.getFirst(), k = intProgression.getLast(), m = intProgression.getStep(); if ((m > 0 && i <= k) || (m < 0 && k <= i)) while (true) { if (Intrinsics.areEqual(key, keyAtIndex(i))) { mutator.setOperationResult$runtime(valueAtKeyIndex(i)); if (this.ownedBy == mutator.getOwnership()) { this.buffer[i + 1] = value; return this; }  int n = mutator.getModCount$runtime(); mutator.setModCount$runtime(n + 1); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length), "copyOf(...)"); Object[] arrayOfObject = Arrays.copyOf(this.buffer, this.buffer.length); arrayOfObject[i + 1] = value; return new TrieNode(0, 0, arrayOfObject, mutator.getOwnership()); }  if (i != k) { i += m; continue; }  break; }   int j = mutator.size(); mutator.setSize(j + 1); Object[] newBuffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, key, value); return new TrieNode(0, 0, newBuffer, mutator.getOwnership()); } private final TrieNode<K, V> collisionRemove(Object key) { IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, this.buffer.length), 2); int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep(); if ((k > 0 && i <= j) || (k < 0 && j <= i)) while (true) { if (Intrinsics.areEqual(key, keyAtIndex(i))) return collisionRemoveEntryAtIndex(i);  if (i != j) { i += k; continue; }  break; }   return this; } private final TrieNode<K, V> mutableCollisionRemove(Object key, PersistentHashMapBuilder<K, V> mutator) { IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, this.buffer.length), 2); int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep(); if ((k > 0 && i <= j) || (k < 0 && j <= i)) while (true) { if (Intrinsics.areEqual(key, keyAtIndex(i))) return mutableCollisionRemoveEntryAtIndex(i, mutator);  if (i != j) { i += k; continue; }  break; }   return this; } private final TrieNode<K, V> collisionRemove(Object key, Object value) { IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, this.buffer.length), 2); int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep(); if ((k > 0 && i <= j) || (k < 0 && j <= i)) while (true) { if (Intrinsics.areEqual(key, keyAtIndex(i)) && Intrinsics.areEqual(value, valueAtKeyIndex(i))) return collisionRemoveEntryAtIndex(i);  if (i != j) { i += k; continue; }  break; }   return this; } private final TrieNode<K, V> mutableCollisionRemove(Object key, Object value, PersistentHashMapBuilder<K, V> mutator) { IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, this.buffer.length), 2); int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep(); if ((k > 0 && i <= j) || (k < 0 && j <= i)) while (true) { if (Intrinsics.areEqual(key, keyAtIndex(i)) && Intrinsics.areEqual(value, valueAtKeyIndex(i))) return mutableCollisionRemoveEntryAtIndex(i, mutator);  if (i != j) { i += k; continue; }  break; }   return this; } private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> otherNode, DeltaCounter intersectionCounter, MutabilityOwnership owner) { CommonFunctionsKt.assert((this.nodeMap == 0)); CommonFunctionsKt.assert((this.dataMap == 0)); CommonFunctionsKt.assert((otherNode.nodeMap == 0)); CommonFunctionsKt.assert((otherNode.dataMap == 0)); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(this.buffer, this.buffer.length + otherNode.buffer.length), "copyOf(...)"); Object[] tempBuffer = Arrays.copyOf(this.buffer, this.buffer.length + otherNode.buffer.length); int i = this.buffer.length; IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, otherNode.buffer.length), 2); int j = intProgression.getFirst(), k = intProgression.getLast(), m = intProgression.getStep(); if ((m > 0 && j <= k) || (m < 0 && k <= j)) while (true) { if (!collisionContainsKey((K)otherNode.buffer[j])) { tempBuffer[i] = otherNode.buffer[j]; tempBuffer[i + 1] = otherNode.buffer[j + 1]; i += 2; } else { int n = intersectionCounter.getCount(); intersectionCounter.setCount(n + 1); }  if (j != k) { j += m; continue; }  break; }   int newSize = i; Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(tempBuffer, newSize), "copyOf(...)"); return (newSize == this.buffer.length) ? this : ((newSize == otherNode.buffer.length) ? otherNode : ((newSize == tempBuffer.length) ? new TrieNode(0, 0, tempBuffer, owner) : new TrieNode(0, 0, Arrays.copyOf(tempBuffer, newSize), owner))); } private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode otherNode, int positionMask, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder<K, V> mutator) { TrieNode<K, V> targetNode = nodeAtIndex$runtime(nodeIndex$runtime(positionMask)); TrieNode<K, V> trieNode1 = otherNode.nodeAtIndex$runtime(otherNode.nodeIndex$runtime(positionMask)); int keyIndex = otherNode.entryKeyIndex$runtime(positionMask); Object key = otherNode.keyAtIndex(keyIndex); Object object1 = otherNode.valueAtKeyIndex(keyIndex); int oldSize = mutator.size(); TrieNode<K, V> trieNode2 = targetNode.mutablePut((key != null) ? key.hashCode() : 0, (K)key, (V)object1, shift + 5, mutator), it = trieNode2; int $i$a$-also-TrieNode$mutablePutAllFromOtherNodeCell$1 = 0; if (mutator.size() == oldSize) { int j = intersectionCounter.getCount(); intersectionCounter.setCount(j + 1); }  TrieNode<K, V> otherTargetNode = otherNode.nodeAtIndex$runtime(otherNode.nodeIndex$runtime(positionMask)); keyIndex = entryKeyIndex$runtime(positionMask); key = keyAtIndex(keyIndex); int i = intersectionCounter.getCount(); intersectionCounter.setCount(i + 1); Object value = valueAtKeyIndex(keyIndex); int thisKeyIndex = entryKeyIndex$runtime(positionMask); Object thisKey = keyAtIndex(thisKeyIndex); Object thisValue = valueAtKeyIndex(thisKeyIndex); int otherKeyIndex = otherNode.entryKeyIndex$runtime(positionMask); Object otherKey = otherNode.keyAtIndex(otherKeyIndex); Object otherValue = otherNode.valueAtKeyIndex(otherKeyIndex); return hasNodeAt(positionMask) ? (otherNode.hasNodeAt(positionMask) ? targetNode.mutablePutAll(trieNode1, shift + 5, intersectionCounter, mutator) : (otherNode.hasEntryAt$runtime(positionMask) ? trieNode2 : targetNode)) : (otherNode.hasNodeAt(positionMask) ? (hasEntryAt$runtime(positionMask) ? (otherTargetNode.containsKey((key != null) ? key.hashCode() : 0, key, shift + 5) ? otherTargetNode : otherTargetNode.mutablePut((key != null) ? key.hashCode() : 0, (K)key, (V)value, shift + 5, mutator)) : otherTargetNode) : makeNode((thisKey != null) ? thisKey.hashCode() : 0, (K)thisKey, (V)thisValue, (otherKey != null) ? otherKey.hashCode() : 0, (K)otherKey, (V)otherValue, shift + 5, mutator.getOwnership())); } private final int calculateSize() { if (this.nodeMap == 0) return this.buffer.length / 2;  int numValues = Integer.bitCount(this.dataMap); int result = numValues; for (int i = numValues * 2, j = this.buffer.length; i < j; i++) result += nodeAtIndex$runtime(i).calculateSize();  return result; } private final boolean elementsIdentityEquals(TrieNode otherNode) { if (this == otherNode) return true;  if (this.nodeMap != otherNode.nodeMap) return false;  if (this.dataMap != otherNode.dataMap) return false;  for (int i = 0, j = this.buffer.length; i < j; i++) { if (this.buffer[i] != otherNode.buffer[i]) return false;  }  return true; } public final boolean containsKey(int keyHash, Object key, int shift) { int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift); if (hasEntryAt$runtime(keyPositionMask)) return Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime(keyPositionMask)));  if (hasNodeAt(keyPositionMask)) { TrieNode<K, V> targetNode = nodeAtIndex$runtime(nodeIndex$runtime(keyPositionMask)); if (shift == 30) return targetNode.collisionContainsKey((K)key);  return targetNode.containsKey(keyHash, (K)key, shift + 5); }  return false; } @Nullable public final V get(int keyHash, Object key, int shift) { int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift); if (hasEntryAt$runtime(keyPositionMask)) { int keyIndex = entryKeyIndex$runtime(keyPositionMask); if (Intrinsics.areEqual(key, keyAtIndex(keyIndex))) return valueAtKeyIndex(keyIndex);  return null; }  if (hasNodeAt(keyPositionMask)) { TrieNode<K, V> targetNode = nodeAtIndex$runtime(nodeIndex$runtime(keyPositionMask)); if (shift == 30) return targetNode.collisionGet((K)key);  return targetNode.get(keyHash, (K)key, shift + 5); }  return null; } @Nullable public final ModificationResult<K, V> put(int keyHash, Object key, Object value, int shift) { int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift); if (hasEntryAt$runtime(keyPositionMask)) { int keyIndex = entryKeyIndex$runtime(keyPositionMask); if (Intrinsics.areEqual(key, keyAtIndex(keyIndex))) { if (valueAtKeyIndex(keyIndex) == value) return null;  return updateValueAtIndex(keyIndex, (V)value).asUpdateResult(); }  return moveEntryToNode(keyIndex, keyPositionMask, keyHash, (K)key, (V)value, shift).asInsertResult(); }  if (hasNodeAt(keyPositionMask)) { ModificationResult<K, V> putResult; int nodeIndex = nodeIndex$runtime(keyPositionMask); TrieNode<K, V> targetNode = nodeAtIndex$runtime(nodeIndex); if (shift == 30) { if (targetNode.collisionPut((K)key, (V)value) == null) { targetNode.collisionPut((K)key, (V)value); return null; }  } else if (targetNode.put(keyHash, (K)key, (V)value, shift + 5) == null) { targetNode.put(keyHash, (K)key, (V)value, shift + 5); return null; }  ModificationResult<K, V> this_$iv = putResult; int $i$f$replaceNode = 0; ModificationResult<K, V> modificationResult1 = this_$iv, $this$replaceNode_u24lambda_u240$iv = modificationResult1;
/* 935 */       int $i$a$-apply-TrieNode$ModificationResult$replaceNode$1$iv = 0; TrieNode<K, V> trieNode1 = $this$replaceNode_u24lambda_u240$iv.getNode(); ModificationResult<K, V> modificationResult2 = $this$replaceNode_u24lambda_u240$iv; int $i$a$-replaceNode-TrieNode$put$1 = 0; modificationResult2.setNode(updateNodeAtIndex(nodeIndex, keyPositionMask, trieNode1)); return modificationResult1; }  return insertEntryAt(keyPositionMask, (K)key, (V)value).asInsertResult(); } @NotNull public final TrieNode<K, V> mutablePut(int keyHash, Object key, Object value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) { Intrinsics.checkNotNullParameter(mutator, "mutator"); int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift); if (hasEntryAt$runtime(keyPositionMask)) { int keyIndex = entryKeyIndex$runtime(keyPositionMask); if (Intrinsics.areEqual(key, keyAtIndex(keyIndex))) { mutator.setOperationResult$runtime(valueAtKeyIndex(keyIndex)); if (valueAtKeyIndex(keyIndex) == value) return this;  return mutableUpdateValueAtIndex(keyIndex, (V)value, mutator); }  int j = mutator.size(); mutator.setSize(j + 1); return mutableMoveEntryToNode(keyIndex, keyPositionMask, keyHash, (K)key, (V)value, shift, mutator.getOwnership()); }  if (hasNodeAt(keyPositionMask)) { int nodeIndex = nodeIndex$runtime(keyPositionMask); TrieNode<K, V> targetNode = nodeAtIndex$runtime(nodeIndex); TrieNode<K, V> newNode = (shift == 30) ? targetNode.mutableCollisionPut((K)key, (V)value, mutator) : targetNode.mutablePut(keyHash, (K)key, (V)value, shift + 5, mutator); if (targetNode == newNode) return this;  return mutableUpdateNodeAtIndex(nodeIndex, newNode, mutator.getOwnership()); }  int i = mutator.size(); mutator.setSize(i + 1); return mutableInsertEntryAt(keyPositionMask, (K)key, (V)value, mutator.getOwnership()); } @Nullable public final TrieNode<K, V> remove(int keyHash, Object key, int shift) { int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift); if (hasEntryAt$runtime(keyPositionMask)) { int keyIndex = entryKeyIndex$runtime(keyPositionMask); if (Intrinsics.areEqual(key, keyAtIndex(keyIndex))) return removeEntryAtIndex(keyIndex, keyPositionMask);  return this; }  if (hasNodeAt(keyPositionMask)) { int nodeIndex = nodeIndex$runtime(keyPositionMask); TrieNode<K, V> targetNode = nodeAtIndex$runtime(nodeIndex); TrieNode<K, V> newNode = (shift == 30) ? targetNode.collisionRemove((K)key) : targetNode.remove(keyHash, (K)key, shift + 5); return replaceNode(targetNode, newNode, nodeIndex, keyPositionMask); }  return this; } private final TrieNode<K, V> replaceNode(TrieNode targetNode, TrieNode<K, V> newNode, int nodeIndex, int positionMask) { return (newNode == null) ? removeNodeAtIndex(nodeIndex, positionMask) : ((targetNode != newNode) ? updateNodeAtIndex(nodeIndex, positionMask, newNode) : this); } @Nullable public final TrieNode<K, V> mutableRemove(int keyHash, Object key, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) { Intrinsics.checkNotNullParameter(mutator, "mutator"); int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift); if (hasEntryAt$runtime(keyPositionMask)) { int keyIndex = entryKeyIndex$runtime(keyPositionMask); if (Intrinsics.areEqual(key, keyAtIndex(keyIndex))) return mutableRemoveEntryAtIndex(keyIndex, keyPositionMask, mutator);  return this; }  if (hasNodeAt(keyPositionMask)) { int nodeIndex = nodeIndex$runtime(keyPositionMask); TrieNode<K, V> targetNode = nodeAtIndex$runtime(nodeIndex); TrieNode<K, V> newNode = (shift == 30) ? targetNode.mutableCollisionRemove((K)key, mutator) : targetNode.mutableRemove(keyHash, (K)key, shift + 5, mutator); return mutableReplaceNode(targetNode, newNode, nodeIndex, keyPositionMask, mutator.getOwnership()); }  return this; } private final TrieNode<K, V> mutableReplaceNode(TrieNode targetNode, TrieNode<K, V> newNode, int nodeIndex, int positionMask, MutabilityOwnership owner) { return (newNode == null) ? mutableRemoveNodeAtIndex(nodeIndex, positionMask, owner) : ((this.ownedBy == owner || targetNode != newNode) ? mutableUpdateNodeAtIndex(nodeIndex, newNode, owner) : this); } @Nullable public final TrieNode<K, V> remove(int keyHash, Object key, Object value, int shift) { int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift); if (hasEntryAt$runtime(keyPositionMask)) { int keyIndex = entryKeyIndex$runtime(keyPositionMask); if (Intrinsics.areEqual(key, keyAtIndex(keyIndex)) && Intrinsics.areEqual(value, valueAtKeyIndex(keyIndex))) return removeEntryAtIndex(keyIndex, keyPositionMask);  return this; }  if (hasNodeAt(keyPositionMask)) { int nodeIndex = nodeIndex$runtime(keyPositionMask); TrieNode<K, V> targetNode = nodeAtIndex$runtime(nodeIndex); TrieNode<K, V> newNode = (shift == 30) ? targetNode.collisionRemove((K)key, (V)value) : targetNode.remove(keyHash, (K)key, (V)value, shift + 5); return replaceNode(targetNode, newNode, nodeIndex, keyPositionMask); }  return this; } @Nullable public final TrieNode<K, V> mutableRemove(int keyHash, Object key, Object value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) { Intrinsics.checkNotNullParameter(mutator, "mutator"); int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift); if (hasEntryAt$runtime(keyPositionMask)) { int keyIndex = entryKeyIndex$runtime(keyPositionMask); if (Intrinsics.areEqual(key, keyAtIndex(keyIndex)) && Intrinsics.areEqual(value, valueAtKeyIndex(keyIndex))) return mutableRemoveEntryAtIndex(keyIndex, keyPositionMask, mutator);  return this; }  if (hasNodeAt(keyPositionMask)) { int nodeIndex = nodeIndex$runtime(keyPositionMask); TrieNode<K, V> targetNode = nodeAtIndex$runtime(nodeIndex); TrieNode<K, V> newNode = (shift == 30) ? targetNode.mutableCollisionRemove((K)key, (V)value, mutator) : targetNode.mutableRemove(keyHash, (K)key, (V)value, shift + 5, mutator); return mutableReplaceNode(targetNode, newNode, nodeIndex, keyPositionMask, mutator.getOwnership()); }  return this; } public final void accept$runtime(@NotNull Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor) { Intrinsics.checkNotNullParameter(visitor, "visitor"); accept(visitor, 0, 0); } private final void accept(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor, int hash, int shift) { visitor.invoke(this, Integer.valueOf(shift), Integer.valueOf(hash), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap)); int nodePositions = this.nodeMap; while (nodePositions != 0) { int mask = Integer.lowestOneBit(nodePositions); int hashSegment = Integer.numberOfTrailingZeros(mask); TrieNode<K, V> childNode = nodeAtIndex$runtime(nodeIndex$runtime(mask)); childNode.accept(visitor, hash + (hashSegment << shift), shift + 5); nodePositions -= mask; }  } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\020\001\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\016\022\004\022\0020\005\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime"}) public static final class Companion {
/* 936 */     private Companion() {} @NotNull public final TrieNode getEMPTY$runtime() { return TrieNode.EMPTY; } } @NotNull public static final Companion Companion = new Companion(null); private int dataMap; private int nodeMap; @Nullable private final MutabilityOwnership ownedBy; @NotNull private Object[] buffer; public static final int $stable = 8; @NotNull private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);
/*     */   
/*     */   static {
/*     */     int $i$f$emptyArray = 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableMap\TrieNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */