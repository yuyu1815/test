/*      */ package androidx.compose.runtime.snapshots;
/*      */ 
/*      */ import androidx.compose.runtime.Stable;
/*      */ import androidx.compose.runtime.SynchronizedObject;
/*      */ import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
/*      */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ import java.util.RandomAccess;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Unit;
/*      */ import kotlin.jvm.JvmName;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.CollectionToArray;
/*      */ import kotlin.jvm.internal.InlineMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.jvm.internal.markers.KMutableList;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000~\n\002\030\002\n\000\n\002\030\002\n\002\020!\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\036\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020)\n\002\b\002\n\002\020+\n\002\b\026\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\b\007\030\000*\004\b\000\020\0012\0020\0022\b\022\004\022\002H\0010\0032\0060\004j\002`\005:\001SB\005¢\006\002\020\006J\025\020\034\032\0020\0352\006\020\036\032\0028\000H\026¢\006\002\020\037J\035\020\034\032\0020 2\006\020!\032\0020\0272\006\020\036\032\0028\000H\026¢\006\002\020\"J\036\020#\032\0020\0352\006\020!\032\0020\0272\f\020$\032\b\022\004\022\0028\0000%H\026J\026\020#\032\0020\0352\f\020$\032\b\022\004\022\0028\0000%H\026J\b\020&\032\0020 H\026J3\020'\032\0020\0352\b\b\002\020(\032\0020\0352\036\020)\032\032\022\n\022\b\022\004\022\0028\0000+\022\n\022\b\022\004\022\0028\0000+0*H\bJ\026\020,\032\0020\0352\006\020\036\032\0028\000H\002¢\006\002\020\037J\026\020-\032\0020\0352\f\020$\032\b\022\004\022\0028\0000%H\026J\026\020.\032\0028\0002\006\020!\032\0020\027H\002¢\006\002\020/J\025\0200\032\0020\0272\006\020\036\032\0028\000H\026¢\006\002\0201J\b\0202\032\0020\035H\026J\017\0203\032\b\022\004\022\0028\00004H\002J\025\0205\032\0020\0272\006\020\036\032\0028\000H\026¢\006\002\0201J\016\0206\032\b\022\004\022\0028\00007H\026J\026\0206\032\b\022\004\022\0028\000072\006\020!\032\0020\027H\026J.\0208\032\002H9\"\004\b\001\02092\030\020)\032\024\022\n\022\b\022\004\022\0028\0000\003\022\004\022\002H90*H\b¢\006\002\020:J\"\020;\032\0020\0352\030\020)\032\024\022\n\022\b\022\004\022\0028\0000\003\022\004\022\0020\0350*H\002J\020\020<\032\0020 2\006\020=\032\0020\rH\026J\025\020>\032\0020\0352\006\020\036\032\0028\000H\026¢\006\002\020\037J\026\020?\032\0020\0352\f\020$\032\b\022\004\022\0028\0000%H\026J\025\020@\032\0028\0002\006\020!\032\0020\027H\026¢\006\002\020/J\026\020A\032\0020 2\006\020B\032\0020\0272\006\020C\032\0020\027J\026\020D\032\0020\0352\f\020$\032\b\022\004\022\0028\0000%H\026J+\020E\032\0020\0272\f\020$\032\b\022\004\022\0028\0000%2\006\020F\032\0020\0272\006\020G\032\0020\027H\000¢\006\002\bHJ\036\020I\032\0028\0002\006\020!\032\0020\0272\006\020\036\032\0028\000H\002¢\006\002\020JJ\036\020K\032\b\022\004\022\0028\0000\0032\006\020B\032\0020\0272\006\020C\032\0020\027H\026J\f\020L\032\b\022\004\022\0028\0000\bJ\b\020M\032\0020NH\026J3\020O\032\0020 2\b\b\002\020(\032\0020\0352\036\020)\032\032\022\n\022\b\022\004\022\0028\0000+\022\n\022\b\022\004\022\0028\0000+0*H\bJ3\020P\032\002H9\"\004\b\001\02092\035\020)\032\031\022\n\022\b\022\004\022\0028\0000\022\022\004\022\002H90*¢\006\002\bQH\b¢\006\002\020:J3\020R\032\002H9\"\004\b\001\02092\035\020)\032\031\022\n\022\b\022\004\022\0028\0000\022\022\004\022\002H90*¢\006\002\bQH\b¢\006\002\020:R \020\007\032\b\022\004\022\0028\0000\b8AX\004¢\006\f\022\004\b\t\020\006\032\004\b\n\020\013R\036\020\016\032\0020\r2\006\020\f\032\0020\r@RX\016¢\006\b\n\000\032\004\b\017\020\020R \020\021\032\b\022\004\022\0028\0000\0228@X\004¢\006\f\022\004\b\023\020\006\032\004\b\024\020\025R\024\020\026\032\0020\0278VX\004¢\006\006\032\004\b\030\020\031R\024\020\032\032\0020\0278@X\004¢\006\006\032\004\b\033\020\031¨\006T"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "()V", "debuggerDisplayValue", "", "getDebuggerDisplayValue$annotations", "getDebuggerDisplayValue", "()Ljava/util/List;", "<set-?>", "Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "readable", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime$annotations", "getReadable$runtime", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "size", "", "getSize", "()I", "structure", "getStructure$runtime", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "conditionalUpdate", "structural", "block", "Lkotlin/Function1;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "mutate", "R", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "mutateBoolean", "prependStateRecord", "value", "remove", "removeAll", "removeAt", "removeRange", "fromIndex", "toIndex", "retainAll", "retainAllInRange", "start", "end", "retainAllInRange$runtime", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "toList", "toString", "", "update", "withCurrent", "Lkotlin/ExtensionFunctionType;", "writable", "StateListStateRecord", "runtime"})
/*      */ @Stable
/*      */ @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n172#1:499\n211#1,10:509\n221#1:520\n172#1:521\n222#1,9:523\n168#1:532\n231#1,7:538\n241#1,6:548\n204#1,17:554\n221#1:572\n172#1:573\n222#1,9:575\n168#1:584\n231#1,7:590\n241#1,6:600\n209#1:606\n211#1,10:607\n221#1:618\n172#1:619\n222#1,9:621\n168#1:630\n231#1,7:636\n241#1,6:646\n168#1:652\n211#1,10:663\n221#1:674\n172#1:675\n222#1,9:677\n168#1:686\n231#1,7:692\n241#1,6:702\n211#1,10:708\n221#1:719\n172#1:720\n222#1,9:722\n168#1:731\n231#1,7:737\n241#1,6:747\n204#1,17:754\n221#1:772\n172#1:773\n222#1,9:775\n168#1:784\n231#1,7:790\n241#1,6:800\n209#1:806\n208#1,13:807\n221#1:821\n172#1:822\n222#1,9:824\n168#1:833\n231#1,7:839\n241#1,6:849\n209#1:855\n177#1,5:856\n182#1:862\n172#1:863\n183#1,7:865\n168#1:872\n190#1,7:878\n199#1,3:888\n177#1,5:891\n182#1:897\n172#1:898\n183#1,7:900\n168#1:907\n190#1,7:913\n199#1,3:923\n172#1:926\n177#1,5:938\n182#1:944\n172#1:945\n183#1,7:947\n168#1:954\n190#1,7:960\n199#1,3:970\n172#1:974\n168#1:976\n215#1,6:987\n221#1:994\n172#1:995\n222#1,9:997\n168#1:1006\n231#1,7:1012\n241#1,6:1022\n215#1,7:1028\n172#1:1035\n222#1,9:1037\n168#1:1046\n231#1,7:1052\n241#1,6:1062\n172#1:1069\n168#1:1071\n172#1:1083\n168#1:1085\n2421#2:500\n2421#2:508\n2421#2:522\n2314#2,2:533\n1844#2:535\n2316#2,2:536\n2318#2,3:545\n2421#2:574\n2314#2,2:585\n1844#2:587\n2316#2,2:588\n2318#2,3:597\n2421#2:620\n2314#2,2:631\n1844#2:633\n2316#2,2:634\n2318#2,3:643\n2314#2,2:653\n1844#2:655\n2316#2,2:657\n2318#2,3:660\n2421#2:676\n2314#2,2:687\n1844#2:689\n2316#2,2:690\n2318#2,3:699\n2421#2:721\n2314#2,2:732\n1844#2:734\n2316#2,2:735\n2318#2,3:744\n2421#2:774\n2314#2,2:785\n1844#2:787\n2316#2,2:788\n2318#2,3:797\n2421#2:823\n2314#2,2:834\n1844#2:836\n2316#2,2:837\n2318#2,3:846\n2421#2:864\n2314#2,2:873\n1844#2:875\n2316#2,2:876\n2318#2,3:885\n2421#2:899\n2314#2,2:908\n1844#2:910\n2316#2,2:911\n2318#2,3:920\n2421#2:927\n2314#2,2:928\n1844#2:930\n2316#2,5:932\n2421#2:937\n2421#2:946\n2314#2,2:955\n1844#2:957\n2316#2,2:958\n2318#2,3:967\n2421#2:975\n2314#2,2:977\n1844#2:979\n2316#2,2:981\n2318#2,3:984\n2421#2:996\n2314#2,2:1007\n1844#2:1009\n2316#2,2:1010\n2318#2,3:1019\n2421#2:1036\n2314#2,2:1047\n1844#2:1049\n2316#2,2:1050\n2318#2,3:1059\n2421#2:1070\n2314#2,2:1072\n1844#2:1074\n2316#2,2:1076\n2318#2,3:1079\n2421#2:1084\n2314#2,2:1086\n1844#2:1088\n2316#2,2:1090\n2318#2,3:1093\n33#3,7:501\n26#4:519\n26#4:571\n26#4:617\n26#4:656\n26#4:659\n26#4:673\n26#4:718\n26#4:771\n26#4:820\n26#4:861\n26#4:896\n26#4:931\n26#4:943\n26#4:973\n26#4:980\n26#4:983\n26#4:993\n26#4:1068\n26#4:1075\n26#4:1078\n26#4:1082\n26#4:1089\n26#4:1092\n1#5:753\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n72#1:499\n119#1:509,10\n119#1:520\n119#1:521\n119#1:523,9\n119#1:532\n119#1:538,7\n119#1:548,6\n120#1:554,17\n120#1:572\n120#1:573\n120#1:575,9\n120#1:584\n120#1:590,7\n120#1:600,6\n120#1:606\n125#1:607,10\n125#1:618\n125#1:619\n125#1:621,9\n125#1:630\n125#1:636,7\n125#1:646,6\n127#1:652\n135#1:663,10\n135#1:674\n135#1:675\n135#1:677,9\n135#1:686\n135#1:692,7\n135#1:702,6\n136#1:708,10\n136#1:719\n136#1:720\n136#1:722,9\n136#1:731\n136#1:737,7\n136#1:747,6\n137#1:754,17\n137#1:772\n137#1:773\n137#1:775,9\n137#1:784\n137#1:790,7\n137#1:800,6\n137#1:806\n140#1:807,13\n140#1:821\n140#1:822\n140#1:824,9\n140#1:833\n140#1:839,7\n140#1:849,6\n140#1:855\n144#1:856,5\n144#1:862\n144#1:863\n144#1:865,7\n144#1:872\n144#1:878,7\n144#1:888,3\n151#1:891,5\n151#1:897\n151#1:898\n151#1:900,7\n151#1:907\n151#1:913,7\n151#1:923,3\n164#1:926\n174#1:938,5\n174#1:944\n174#1:945\n174#1:947,7\n174#1:954\n174#1:960,7\n174#1:970,3\n182#1:974\n189#1:976\n208#1:987,6\n208#1:994\n208#1:995\n208#1:997,9\n208#1:1006\n208#1:1012,7\n208#1:1022,6\n208#1:1028,7\n208#1:1035\n208#1:1037,9\n208#1:1046\n208#1:1052,7\n208#1:1062,6\n221#1:1069\n230#1:1071\n221#1:1083\n230#1:1085\n72#1:500\n115#1:508\n119#1:522\n119#1:533,2\n119#1:535\n119#1:536,2\n119#1:545,3\n120#1:574\n120#1:585,2\n120#1:587\n120#1:588,2\n120#1:597,3\n125#1:620\n125#1:631,2\n125#1:633\n125#1:634,2\n125#1:643,3\n127#1:653,2\n127#1:655\n127#1:657,2\n127#1:660,3\n135#1:676\n135#1:687,2\n135#1:689\n135#1:690,2\n135#1:699,3\n136#1:721\n136#1:732,2\n136#1:734\n136#1:735,2\n136#1:744,3\n137#1:774\n137#1:785,2\n137#1:787\n137#1:788,2\n137#1:797,3\n140#1:823\n140#1:834,2\n140#1:836\n140#1:837,2\n140#1:846,3\n144#1:864\n144#1:873,2\n144#1:875\n144#1:876,2\n144#1:885,3\n151#1:899\n151#1:908,2\n151#1:910\n151#1:911,2\n151#1:920,3\n164#1:927\n168#1:928,2\n168#1:930\n168#1:932,5\n172#1:937\n174#1:946\n174#1:955,2\n174#1:957\n174#1:958,2\n174#1:967,3\n182#1:975\n189#1:977,2\n189#1:979\n189#1:981,2\n189#1:984,3\n208#1:996\n208#1:1007,2\n208#1:1009\n208#1:1010,2\n208#1:1019,3\n208#1:1036\n208#1:1047,2\n208#1:1049\n208#1:1050,2\n208#1:1059,3\n221#1:1070\n230#1:1072,2\n230#1:1074\n230#1:1076,2\n230#1:1079,3\n221#1:1084\n230#1:1086,2\n230#1:1088\n230#1:1090,2\n230#1:1093,3\n109#1:501,7\n119#1:519\n120#1:571\n125#1:617\n127#1:656\n128#1:659\n135#1:673\n136#1:718\n137#1:771\n140#1:820\n144#1:861\n151#1:896\n168#1:931\n174#1:943\n181#1:973\n189#1:980\n190#1:983\n208#1:993\n220#1:1068\n230#1:1075\n231#1:1078\n220#1:1082\n230#1:1089\n231#1:1092\n*E\n"})
/*      */ public final class SnapshotStateList<T>
/*      */   implements StateObject, List<T>, RandomAccess, KMutableList
/*      */ {
/*      */   @NotNull
/*      */   private StateRecord firstStateRecord;
/*      */   public static final int $stable;
/*      */   
/*      */   public SnapshotStateList() {
/*   38 */     PersistentList<?> persistentList = ExtensionsKt.persistentListOf(); SnapshotStateList snapshotStateList = this; int $i$a$-let-SnapshotStateList$firstStateRecord$1 = 0;
/*   39 */     StateListStateRecord stateListStateRecord1 = new StateListStateRecord(persistentList), it = stateListStateRecord1; int $i$a$-also-SnapshotStateList$firstStateRecord$1$1 = 0;
/*   40 */     if (Snapshot.Companion.isInSnapshot()) {
/*   41 */       StateListStateRecord stateListStateRecord2 = new StateListStateRecord(persistentList), stateListStateRecord3 = stateListStateRecord2, stateListStateRecord4 = it; int $i$a$-also-SnapshotStateList$firstStateRecord$1$1$1 = 0;
/*   42 */       stateListStateRecord3.setSnapshotId$runtime(1);
/*   43 */       stateListStateRecord4.setNext$runtime(stateListStateRecord2);
/*      */     } 
/*      */     snapshotStateList.firstStateRecord = stateListStateRecord1;
/*      */   } @NotNull
/*      */   public StateRecord getFirstStateRecord() {
/*      */     return this.firstStateRecord;
/*      */   } public void prependStateRecord(@NotNull StateRecord value) {
/*   50 */     Intrinsics.checkNotNullParameter(value, "value"); value.setNext$runtime(getFirstStateRecord());
/*      */     
/*   52 */     this.firstStateRecord = value;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final List<T> toList() {
/*   70 */     return (List<T>)getReadable$runtime().getList$runtime();
/*      */   } @NotNull public final StateListStateRecord<T> getReadable$runtime() { Intrinsics.checkNotNull(getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); return SnapshotKt.<StateListStateRecord<T>>readable((StateListStateRecord<T>)getFirstStateRecord(), this); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\b\n\002\020\002\n\002\b\003\b\000\030\000*\004\b\001\020\0012\0020\002B\025\b\000\022\f\020\003\032\b\022\004\022\0028\0010\004¢\006\002\020\005J\020\020\022\032\0020\0232\006\020\024\032\0020\002H\026J\b\020\025\032\0020\002H\026R \020\003\032\b\022\004\022\0028\0010\004X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\005R\032\020\t\032\0020\nX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\032\020\017\032\0020\nX\016¢\006\016\n\000\032\004\b\020\020\f\"\004\b\021\020\016¨\006\026"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "list", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", "getList$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime", "modification", "", "getModification$runtime", "()I", "setModification$runtime", "(I)V", "structuralChange", "getStructuralChange$runtime", "setStructuralChange$runtime", "assign", "", "value", "create", "runtime"}) @StabilityInferred(parameters = 0) @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,498:1\n26#2:499\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n87#1:499\n*E\n"}) public static final class StateListStateRecord<T> extends StateRecord {
/*   72 */     @NotNull private PersistentList<? extends T> list; private int modification; private int structuralChange; public static final int $stable = 8; @NotNull public final PersistentList<T> getList$runtime() { return (PersistentList)this.list; } public final void setList$runtime(@NotNull PersistentList<? extends T> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.list = <set-?>; } public StateListStateRecord(@NotNull PersistentList<? extends T> list) { this.list = list; } public final int getModification$runtime() { return this.modification; } public final void setModification$runtime(int <set-?>) { this.modification = <set-?>; } public final int getStructuralChange$runtime() { return this.structuralChange; } public final void setStructuralChange$runtime(int <set-?>) { this.structuralChange = <set-?>; } public void assign(@NotNull StateRecord value) { Intrinsics.checkNotNullParameter(value, "value"); SynchronizedObject lock$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-SnapshotStateList$StateListStateRecord$assign$1 = 0; this.list = ((StateListStateRecord)value).list; this.modification = ((StateListStateRecord)value).modification; this.structuralChange = ((StateListStateRecord)value).structuralChange; Unit unit = Unit.INSTANCE; }  } @NotNull public StateRecord create() { return new StateListStateRecord(this.list); } } public int getSize() { return getReadable$runtime().getList$runtime().size(); } public boolean contains(Object element) { return getReadable$runtime().getList$runtime().contains(element); } public boolean containsAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return getReadable$runtime().getList$runtime().containsAll(elements); } public T get(int index) { return (T)getReadable$runtime().getList$runtime().get(index); } public int indexOf(Object element) { return getReadable$runtime().getList$runtime().indexOf(element); } public final int getStructure$runtime() { SnapshotStateList this_$iv = this; int $i$f$withCurrent = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  499 */     Intrinsics.checkNotNull(this_$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv = this_$iv.getFirstStateRecord(); int i = 0;
/*  500 */     StateListStateRecord $this$_get_structure__u24lambda_u243 = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv); int $i$a$-withCurrent-SnapshotStateList$structure$1 = 0; return $this$_get_structure__u24lambda_u243.getStructuralChange$runtime(); }
/*      */   public boolean isEmpty() { return getReadable$runtime().getList$runtime().isEmpty(); }
/*      */   @NotNull public Iterator<T> iterator() { return listIterator(); }
/*      */   public int lastIndexOf(Object element) { return getReadable$runtime().getList$runtime().lastIndexOf(element); }
/*      */   @NotNull public ListIterator<T> listIterator() { return new StateListIterator<>(this, 0); }
/*      */   @NotNull public ListIterator<T> listIterator(int index) { return new StateListIterator<>(this, index); }
/*      */   @NotNull public List<T> subList(int fromIndex, int toIndex) { // Byte code:
/*      */     //   0: iconst_0
/*      */     //   1: iload_1
/*      */     //   2: if_icmpgt -> 18
/*      */     //   5: iload_1
/*      */     //   6: iload_2
/*      */     //   7: if_icmpgt -> 14
/*      */     //   10: iconst_1
/*      */     //   11: goto -> 19
/*      */     //   14: iconst_0
/*      */     //   15: goto -> 19
/*      */     //   18: iconst_0
/*      */     //   19: ifeq -> 34
/*      */     //   22: iload_2
/*      */     //   23: aload_0
/*      */     //   24: invokevirtual size : ()I
/*      */     //   27: if_icmpgt -> 34
/*      */     //   30: iconst_1
/*      */     //   31: goto -> 35
/*      */     //   34: iconst_0
/*      */     //   35: istore_3
/*      */     //   36: iconst_0
/*      */     //   37: istore #4
/*      */     //   39: nop
/*      */     //   40: iload_3
/*      */     //   41: ifne -> 52
/*      */     //   44: iconst_0
/*      */     //   45: istore #5
/*      */     //   47: ldc 'fromIndex or toIndex are out of bounds'
/*      */     //   49: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   52: nop
/*      */     //   53: new androidx/compose/runtime/snapshots/SubList
/*      */     //   56: dup
/*      */     //   57: aload_0
/*      */     //   58: iload_1
/*      */     //   59: iload_2
/*      */     //   60: invokespecial <init> : (Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V
/*      */     //   63: checkcast java/util/List
/*      */     //   66: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #109	-> 0
/*      */     //   #501	-> 39
/*      */     //   #504	-> 40
/*      */     //   #505	-> 44
/*      */     //   #110	-> 47
/*      */     //   #505	-> 49
/*      */     //   #507	-> 52
/*      */     //   #112	-> 53
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   47	2	5	$i$a$-requirePrecondition-SnapshotStateList$subList$1	I
/*      */     //   39	14	4	$i$f$requirePrecondition	I
/*      */     //   36	17	3	value$iv	Z
/*      */     //   0	67	0	this	Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*      */     //   0	67	1	fromIndex	I
/*      */     //   0	67	2	toIndex	I } @NotNull public String toString() { Intrinsics.checkNotNull(getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv = getFirstStateRecord();
/*      */     int $i$f$withCurrent = 0;
/*  508 */     StateListStateRecord it = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv); int $i$a$-withCurrent-SnapshotStateList$toString$1 = 0;
/*      */     return "SnapshotStateList(value=" + it.getList$runtime() + ")@" + hashCode(); } public boolean add(Object element) {
/*  510 */     boolean structural$iv = true;
/*      */     
/*      */     int $i$f$conditionalUpdate = 0;
/*  513 */     SnapshotStateList $this$conditionalUpdate_u24lambda_u2428$iv = this; int $i$a$-run-SnapshotStateList$conditionalUpdate$1$iv = 0;
/*  514 */     boolean result$iv = false;
/*      */     while (true) {
/*  516 */       Object oldList$iv = null;
/*  517 */       int currentModification$iv = 0;
/*  518 */       SynchronizedObject lock$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  519 */       synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv = 0;
/*  520 */         SnapshotStateList snapshotStateList = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$withCurrent = 0;
/*  521 */         Intrinsics.checkNotNull(snapshotStateList.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv = snapshotStateList.getFirstStateRecord(); int m = 0;
/*  522 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv = 0; StateListStateRecord current$iv = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv;
/*  523 */         currentModification$iv = current$iv.getModification$runtime();
/*  524 */         oldList$iv = current$iv.getList$runtime();
/*  525 */         Unit unit = Unit.INSTANCE; }
/*  526 */        Intrinsics.checkNotNull(oldList$iv); Object object1 = oldList$iv; int $i$a$-conditionalUpdate$default-SnapshotStateList$add$1 = 0; PersistentList newList$iv = object1.add(element);
/*  527 */       if (Intrinsics.areEqual(newList$iv, oldList$iv)) {
/*  528 */         result$iv = false;
/*      */         break;
/*      */       } 
/*  531 */       SnapshotStateList this_$iv$iv = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$writable = 0;
/*  532 */       Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  533 */       Object snapshot$iv$iv$iv = null; snapshot$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  534 */       int $i$f$sync = 0;
/*  535 */       SynchronizedObject lock$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0; synchronized (lock$iv$iv$iv$iv$iv) {
/*  536 */         int $i$a$-sync-SnapshotKt$writable$3$iv$iv$iv = 0; snapshot$iv$iv$iv = Snapshot.Companion.getCurrent();
/*  537 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv$iv, this_$iv$iv, (Snapshot)snapshot$iv$iv$iv); int $i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv = 0;
/*  538 */         SynchronizedObject synchronizedObject = SnapshotStateListKt.access$getSync$p(); int m = 0; synchronized (synchronizedObject)
/*      */         { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$2$1$iv = 0;
/*  540 */           $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setList$runtime(newList$iv);
/*  541 */           int n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getStructuralChange$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setStructuralChange$runtime(n + 1);
/*  542 */           n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setModification$runtime(n + 1);
/*  543 */           boolean bool = ($this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime() == currentModification$iv) ? true : 
/*  544 */             false; }  $i$a$-conditionalUpdate$default-SnapshotStateList$add$1 = bool;
/*  545 */       }  $i$f$sync = $i$a$-conditionalUpdate$default-SnapshotStateList$add$1; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv$iv = 0;
/*  546 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv$iv, this_$iv$iv);
/*      */       if ($i$f$sync != 0) {
/*  548 */         result$iv = true;
/*      */         break;
/*      */       } 
/*      */     } 
/*  552 */     return result$iv;
/*      */   }
/*      */   
/*  555 */   public void add(int index, Object element) { boolean structural$iv = true;
/*      */     
/*      */     int $i$f$update = 0;
/*  558 */     SnapshotStateList this_$iv$iv = this; int $i$f$conditionalUpdate = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  565 */     SnapshotStateList $this$conditionalUpdate_u24lambda_u2428$iv$iv = this_$iv$iv; int $i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv = 0;
/*  566 */     boolean result$iv$iv = false;
/*      */     while (true) {
/*  568 */       Object oldList$iv$iv = null;
/*  569 */       int currentModification$iv$iv = 0;
/*  570 */       SynchronizedObject lock$iv$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  571 */       synchronized (lock$iv$iv$iv) { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv$iv = 0;
/*  572 */         SnapshotStateList snapshotStateList = $this$conditionalUpdate_u24lambda_u2428$iv$iv; int $i$f$withCurrent = 0;
/*  573 */         Intrinsics.checkNotNull(snapshotStateList.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv$iv = snapshotStateList.getFirstStateRecord(); int m = 0;
/*  574 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv$iv = 0; StateListStateRecord current$iv$iv = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv$iv;
/*  575 */         currentModification$iv$iv = current$iv$iv.getModification$runtime();
/*  576 */         oldList$iv$iv = current$iv$iv.getList$runtime();
/*  577 */         Unit unit = Unit.INSTANCE; }
/*  578 */        Intrinsics.checkNotNull(oldList$iv$iv); null = oldList$iv$iv; int $i$a$-update$default-SnapshotStateList$add$2 = 0; PersistentList newList$iv$iv = null.add(index, element);
/*  579 */       if (Intrinsics.areEqual(newList$iv$iv, oldList$iv$iv)) {
/*  580 */         result$iv$iv = false;
/*      */         break;
/*      */       } 
/*  583 */       SnapshotStateList this_$iv$iv$iv = $this$conditionalUpdate_u24lambda_u2428$iv$iv; int $i$f$writable = 0;
/*  584 */       Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/*  585 */       Object snapshot$iv$iv$iv$iv = null; snapshot$iv$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  586 */       int $i$f$sync = 0;
/*  587 */       SynchronizedObject lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0; synchronized (lock$iv$iv$iv$iv$iv$iv) {
/*  588 */         int $i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv = 0; snapshot$iv$iv$iv$iv = Snapshot.Companion.getCurrent();
/*  589 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv$iv$iv, this_$iv$iv$iv, (Snapshot)snapshot$iv$iv$iv$iv); int $i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv$iv = 0;
/*  590 */         SynchronizedObject synchronizedObject = SnapshotStateListKt.access$getSync$p(); int m = 0; synchronized (synchronizedObject)
/*      */         { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$2$1$iv$iv = 0;
/*  592 */           $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.setList$runtime(newList$iv$iv);
/*  593 */           int n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.getStructuralChange$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.setStructuralChange$runtime(n + 1);
/*  594 */           n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.getModification$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.setModification$runtime(n + 1);
/*  595 */           boolean bool1 = ($this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.getModification$runtime() == currentModification$iv$iv) ? true : 
/*  596 */             false; }  boolean bool = bool1;
/*  597 */       }  $i$f$sync = bool; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv$iv$iv = 0;
/*  598 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv$iv$iv, this_$iv$iv$iv);
/*      */       if ($i$f$sync != 0) {
/*  600 */         result$iv$iv = true; break;
/*      */       } 
/*      */     }  } public boolean addAll(int index, @NotNull Collection<? extends T> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return mutateBoolean(new SnapshotStateList$addAll$1(index, elements)); }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\013\n\002\b\002\n\002\020!\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}) static final class SnapshotStateList$addAll$1 extends Lambda implements Function1<List<T>, Boolean> {
/*      */     @NotNull public final Boolean invoke(@NotNull List<T> it) { Intrinsics.checkNotNullParameter(it, "it");
/*      */       return Boolean.valueOf(it.addAll(this.$index, this.$elements)); }
/*      */     SnapshotStateList$addAll$1(int $index, Collection<T> $elements) { super(1); } }
/*      */   public boolean addAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements");
/*  608 */     boolean structural$iv = true;
/*      */     
/*      */     int $i$f$conditionalUpdate = 0;
/*  611 */     SnapshotStateList $this$conditionalUpdate_u24lambda_u2428$iv = this; int $i$a$-run-SnapshotStateList$conditionalUpdate$1$iv = 0;
/*  612 */     boolean result$iv = false;
/*      */     while (true) {
/*  614 */       Object oldList$iv = null;
/*  615 */       int currentModification$iv = 0;
/*  616 */       SynchronizedObject lock$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  617 */       synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv = 0;
/*  618 */         SnapshotStateList snapshotStateList = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$withCurrent = 0;
/*  619 */         Intrinsics.checkNotNull(snapshotStateList.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv = snapshotStateList.getFirstStateRecord(); int m = 0;
/*  620 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv = 0; StateListStateRecord current$iv = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv;
/*  621 */         currentModification$iv = current$iv.getModification$runtime();
/*  622 */         oldList$iv = current$iv.getList$runtime();
/*  623 */         Unit unit = Unit.INSTANCE; }
/*  624 */        Intrinsics.checkNotNull(oldList$iv); Object object1 = oldList$iv; int $i$a$-conditionalUpdate$default-SnapshotStateList$addAll$2 = 0; PersistentList newList$iv = object1.addAll(elements);
/*  625 */       if (Intrinsics.areEqual(newList$iv, oldList$iv)) {
/*  626 */         result$iv = false;
/*      */         break;
/*      */       } 
/*  629 */       SnapshotStateList this_$iv$iv = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$writable = 0;
/*  630 */       Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  631 */       Object snapshot$iv$iv$iv = null; snapshot$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  632 */       int $i$f$sync = 0;
/*  633 */       SynchronizedObject lock$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0; synchronized (lock$iv$iv$iv$iv$iv) {
/*  634 */         int $i$a$-sync-SnapshotKt$writable$3$iv$iv$iv = 0; snapshot$iv$iv$iv = Snapshot.Companion.getCurrent();
/*  635 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv$iv, this_$iv$iv, (Snapshot)snapshot$iv$iv$iv); int $i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv = 0;
/*  636 */         SynchronizedObject synchronizedObject = SnapshotStateListKt.access$getSync$p(); int m = 0; synchronized (synchronizedObject)
/*      */         { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$2$1$iv = 0;
/*  638 */           $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setList$runtime(newList$iv);
/*  639 */           int n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getStructuralChange$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setStructuralChange$runtime(n + 1);
/*  640 */           n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setModification$runtime(n + 1);
/*  641 */           boolean bool = ($this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime() == currentModification$iv) ? true : 
/*  642 */             false; }  $i$a$-conditionalUpdate$default-SnapshotStateList$addAll$2 = bool;
/*  643 */       }  $i$f$sync = $i$a$-conditionalUpdate$default-SnapshotStateList$addAll$2; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv$iv = 0;
/*  644 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv$iv, this_$iv$iv);
/*      */       if ($i$f$sync != 0) {
/*  646 */         result$iv = true;
/*      */         break;
/*      */       } 
/*      */     } 
/*  650 */     return result$iv; } public void clear() { SnapshotStateList this_$iv = this;
/*      */     int $i$f$writable = 0;
/*  652 */     Intrinsics.checkNotNull(this_$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv = this_$iv.getFirstStateRecord(); int i = 0;
/*  653 */     Object snapshot$iv$iv = null; snapshot$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  654 */     int $i$f$sync = 0;
/*  655 */     SynchronizedObject lock$iv$iv$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0;
/*  656 */     synchronized (lock$iv$iv$iv$iv) { int $i$a$-sync-SnapshotKt$writable$3$iv$iv = 0;
/*  657 */       snapshot$iv$iv = Snapshot.Companion.getCurrent();
/*  658 */       StateListStateRecord $this$clear_u24lambda_u2410 = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv, this_$iv, (Snapshot)snapshot$iv$iv); int $i$a$-writable-SnapshotStateList$clear$1 = 0; SynchronizedObject lock$iv = SnapshotStateListKt.access$getSync$p(); int k = 0;
/*  659 */       synchronized (lock$iv) { int $i$a$-synchronized-SnapshotStateList$clear$1$1 = 0; $this$clear_u24lambda_u2410.setList$runtime(ExtensionsKt.persistentListOf()); int m = $this$clear_u24lambda_u2410.getModification$runtime(); $this$clear_u24lambda_u2410.setModification$runtime(m + 1); m = $this$clear_u24lambda_u2410.getStructuralChange$runtime(); $this$clear_u24lambda_u2410.setStructuralChange$runtime(m + 1); $i$a$-synchronized-SnapshotStateList$clear$1$1 = m; }  int j = $i$a$-synchronized-SnapshotStateList$clear$1$1; }
/*  660 */      $i$f$sync = j; int it$iv$iv = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv = 0;
/*  661 */     SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv, this_$iv); }
/*      */   
/*      */   public boolean remove(Object element) {
/*  664 */     boolean structural$iv = true;
/*      */     
/*      */     int $i$f$conditionalUpdate = 0;
/*  667 */     SnapshotStateList $this$conditionalUpdate_u24lambda_u2428$iv = this; int $i$a$-run-SnapshotStateList$conditionalUpdate$1$iv = 0;
/*  668 */     boolean result$iv = false;
/*      */     while (true) {
/*  670 */       Object oldList$iv = null;
/*  671 */       int currentModification$iv = 0;
/*  672 */       SynchronizedObject lock$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  673 */       synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv = 0;
/*  674 */         SnapshotStateList snapshotStateList = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$withCurrent = 0;
/*  675 */         Intrinsics.checkNotNull(snapshotStateList.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv = snapshotStateList.getFirstStateRecord(); int m = 0;
/*  676 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv = 0; StateListStateRecord current$iv = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv;
/*  677 */         currentModification$iv = current$iv.getModification$runtime();
/*  678 */         oldList$iv = current$iv.getList$runtime();
/*  679 */         Unit unit = Unit.INSTANCE; }
/*  680 */        Intrinsics.checkNotNull(oldList$iv); Object object1 = oldList$iv; int $i$a$-conditionalUpdate$default-SnapshotStateList$remove$1 = 0; PersistentList newList$iv = object1.remove(element);
/*  681 */       if (Intrinsics.areEqual(newList$iv, oldList$iv)) {
/*  682 */         result$iv = false;
/*      */         break;
/*      */       } 
/*  685 */       SnapshotStateList this_$iv$iv = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$writable = 0;
/*  686 */       Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  687 */       Object snapshot$iv$iv$iv = null; snapshot$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  688 */       int $i$f$sync = 0;
/*  689 */       SynchronizedObject lock$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0; synchronized (lock$iv$iv$iv$iv$iv) {
/*  690 */         int $i$a$-sync-SnapshotKt$writable$3$iv$iv$iv = 0; snapshot$iv$iv$iv = Snapshot.Companion.getCurrent();
/*  691 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv$iv, this_$iv$iv, (Snapshot)snapshot$iv$iv$iv); int $i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv = 0;
/*  692 */         SynchronizedObject synchronizedObject = SnapshotStateListKt.access$getSync$p(); int m = 0; synchronized (synchronizedObject)
/*      */         { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$2$1$iv = 0;
/*  694 */           $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setList$runtime(newList$iv);
/*  695 */           int n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getStructuralChange$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setStructuralChange$runtime(n + 1);
/*  696 */           n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setModification$runtime(n + 1);
/*  697 */           boolean bool = ($this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime() == currentModification$iv) ? true : 
/*  698 */             false; }  $i$a$-conditionalUpdate$default-SnapshotStateList$remove$1 = bool;
/*  699 */       }  $i$f$sync = $i$a$-conditionalUpdate$default-SnapshotStateList$remove$1; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv$iv = 0;
/*  700 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv$iv, this_$iv$iv);
/*      */       if ($i$f$sync != 0) {
/*  702 */         result$iv = true;
/*      */         break;
/*      */       } 
/*      */     } 
/*  706 */     return result$iv;
/*      */   }
/*      */   public boolean removeAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements");
/*  709 */     boolean structural$iv = true;
/*      */     
/*      */     int $i$f$conditionalUpdate = 0;
/*  712 */     SnapshotStateList $this$conditionalUpdate_u24lambda_u2428$iv = this; int $i$a$-run-SnapshotStateList$conditionalUpdate$1$iv = 0;
/*  713 */     boolean result$iv = false;
/*      */     while (true) {
/*  715 */       Object oldList$iv = null;
/*  716 */       int currentModification$iv = 0;
/*  717 */       SynchronizedObject lock$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  718 */       synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv = 0;
/*  719 */         SnapshotStateList snapshotStateList = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$withCurrent = 0;
/*  720 */         Intrinsics.checkNotNull(snapshotStateList.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv = snapshotStateList.getFirstStateRecord(); int m = 0;
/*  721 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv = 0; StateListStateRecord current$iv = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv;
/*  722 */         currentModification$iv = current$iv.getModification$runtime();
/*  723 */         oldList$iv = current$iv.getList$runtime();
/*  724 */         Unit unit = Unit.INSTANCE; }
/*  725 */        Intrinsics.checkNotNull(oldList$iv); Object object1 = oldList$iv; int $i$a$-conditionalUpdate$default-SnapshotStateList$removeAll$1 = 0; PersistentList newList$iv = object1.removeAll(elements);
/*  726 */       if (Intrinsics.areEqual(newList$iv, oldList$iv)) {
/*  727 */         result$iv = false;
/*      */         break;
/*      */       } 
/*  730 */       SnapshotStateList this_$iv$iv = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$writable = 0;
/*  731 */       Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  732 */       Object snapshot$iv$iv$iv = null; snapshot$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  733 */       int $i$f$sync = 0;
/*  734 */       SynchronizedObject lock$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0; synchronized (lock$iv$iv$iv$iv$iv) {
/*  735 */         int $i$a$-sync-SnapshotKt$writable$3$iv$iv$iv = 0; snapshot$iv$iv$iv = Snapshot.Companion.getCurrent();
/*  736 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv$iv, this_$iv$iv, (Snapshot)snapshot$iv$iv$iv); int $i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv = 0;
/*  737 */         SynchronizedObject synchronizedObject = SnapshotStateListKt.access$getSync$p(); int m = 0; synchronized (synchronizedObject)
/*      */         { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$2$1$iv = 0;
/*  739 */           $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setList$runtime(newList$iv);
/*  740 */           int n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getStructuralChange$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setStructuralChange$runtime(n + 1);
/*  741 */           n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setModification$runtime(n + 1);
/*  742 */           boolean bool = ($this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime() == currentModification$iv) ? true : 
/*  743 */             false; }  $i$a$-conditionalUpdate$default-SnapshotStateList$removeAll$1 = bool;
/*  744 */       }  $i$f$sync = $i$a$-conditionalUpdate$default-SnapshotStateList$removeAll$1; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv$iv = 0;
/*  745 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv$iv, this_$iv$iv);
/*      */       if ($i$f$sync != 0) {
/*  747 */         result$iv = true;
/*      */         break;
/*      */       } 
/*      */     } 
/*  751 */     return result$iv; } public T removeAt(int index) { T t = get(index);
/*      */     Object it = t;
/*  753 */     int $i$a$-also-SnapshotStateList$removeAt$1 = 0;
/*      */     
/*  755 */     boolean structural$iv = true;
/*      */     
/*      */     int $i$f$update = 0;
/*  758 */     SnapshotStateList this_$iv$iv = this; int $i$f$conditionalUpdate = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  765 */     SnapshotStateList $this$conditionalUpdate_u24lambda_u2428$iv$iv = this_$iv$iv; int $i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv = 0;
/*  766 */     boolean result$iv$iv = false;
/*      */     while (true) {
/*  768 */       Object oldList$iv$iv = null;
/*  769 */       int currentModification$iv$iv = 0;
/*  770 */       SynchronizedObject lock$iv$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  771 */       synchronized (lock$iv$iv$iv) { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv$iv = 0;
/*  772 */         SnapshotStateList snapshotStateList = $this$conditionalUpdate_u24lambda_u2428$iv$iv; int $i$f$withCurrent = 0;
/*  773 */         Intrinsics.checkNotNull(snapshotStateList.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv$iv = snapshotStateList.getFirstStateRecord(); int m = 0;
/*  774 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv$iv = 0; StateListStateRecord current$iv$iv = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv$iv;
/*  775 */         currentModification$iv$iv = current$iv$iv.getModification$runtime();
/*  776 */         oldList$iv$iv = current$iv$iv.getList$runtime();
/*  777 */         Unit unit = Unit.INSTANCE; }
/*  778 */        Intrinsics.checkNotNull(oldList$iv$iv); Object object1 = oldList$iv$iv; int $i$a$-update$default-SnapshotStateList$removeAt$1$1 = 0; PersistentList newList$iv$iv = object1.removeAt(index);
/*  779 */       if (Intrinsics.areEqual(newList$iv$iv, oldList$iv$iv)) {
/*  780 */         result$iv$iv = false;
/*      */         break;
/*      */       } 
/*  783 */       SnapshotStateList this_$iv$iv$iv = $this$conditionalUpdate_u24lambda_u2428$iv$iv; int $i$f$writable = 0;
/*  784 */       Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/*  785 */       Object snapshot$iv$iv$iv$iv = null; snapshot$iv$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  786 */       int $i$f$sync = 0;
/*  787 */       SynchronizedObject lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0; synchronized (lock$iv$iv$iv$iv$iv$iv) {
/*  788 */         int $i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv = 0; snapshot$iv$iv$iv$iv = Snapshot.Companion.getCurrent();
/*  789 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv$iv$iv, this_$iv$iv$iv, (Snapshot)snapshot$iv$iv$iv$iv); int $i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv$iv = 0;
/*  790 */         SynchronizedObject synchronizedObject = SnapshotStateListKt.access$getSync$p(); int m = 0; synchronized (synchronizedObject)
/*      */         { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$2$1$iv$iv = 0;
/*  792 */           $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.setList$runtime(newList$iv$iv);
/*  793 */           int n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.getStructuralChange$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.setStructuralChange$runtime(n + 1);
/*  794 */           n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.getModification$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.setModification$runtime(n + 1);
/*  795 */           boolean bool = ($this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.getModification$runtime() == currentModification$iv$iv) ? true : 
/*  796 */             false; }  $i$a$-update$default-SnapshotStateList$removeAt$1$1 = bool;
/*  797 */       }  $i$f$sync = $i$a$-update$default-SnapshotStateList$removeAt$1$1; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv$iv$iv = 0;
/*  798 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv$iv$iv, this_$iv$iv$iv);
/*      */       if ($i$f$sync != 0) {
/*  800 */         result$iv$iv = true; break;
/*      */       } 
/*      */     }  return t; } public boolean retainAll(@NotNull Collection<? extends T> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return mutateBoolean(new SnapshotStateList$retainAll$1(elements)); }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\013\n\002\b\002\n\002\020!\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}) static final class SnapshotStateList$retainAll$1 extends Lambda implements Function1<List<T>, Boolean> {
/*      */     SnapshotStateList$retainAll$1(Collection<T> $elements) { super(1); }
/*      */     @NotNull public final Boolean invoke(@NotNull List it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(it.retainAll(this.$elements)); } }
/*      */   public T set(int index, Object element) { T t = get(index); Object it = t; int $i$a$-also-SnapshotStateList$set$1 = 0; SnapshotStateList snapshotStateList1 = this; boolean structural$iv = false; int $i$f$update = 0;
/*  807 */     SnapshotStateList this_$iv$iv = snapshotStateList1; int $i$f$conditionalUpdate = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  814 */     SnapshotStateList $this$conditionalUpdate_u24lambda_u2428$iv$iv = this_$iv$iv; int $i$a$-run-SnapshotStateList$conditionalUpdate$1$iv$iv = 0;
/*  815 */     boolean result$iv$iv = false;
/*      */     while (true) {
/*  817 */       Object oldList$iv$iv = null;
/*  818 */       int currentModification$iv$iv = 0;
/*  819 */       SynchronizedObject lock$iv$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  820 */       synchronized (lock$iv$iv$iv) { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv$iv = 0;
/*  821 */         SnapshotStateList snapshotStateList = $this$conditionalUpdate_u24lambda_u2428$iv$iv; int $i$f$withCurrent = 0;
/*  822 */         Intrinsics.checkNotNull(snapshotStateList.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv$iv = snapshotStateList.getFirstStateRecord(); int m = 0;
/*  823 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv$iv = 0; StateListStateRecord current$iv$iv = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv$iv;
/*  824 */         currentModification$iv$iv = current$iv$iv.getModification$runtime();
/*  825 */         oldList$iv$iv = current$iv$iv.getList$runtime();
/*  826 */         Unit unit = Unit.INSTANCE; }
/*  827 */        Intrinsics.checkNotNull(oldList$iv$iv); null = oldList$iv$iv; int $i$a$-update-SnapshotStateList$set$1$1 = 0; PersistentList newList$iv$iv = null.set(index, element);
/*  828 */       if (Intrinsics.areEqual(newList$iv$iv, oldList$iv$iv)) {
/*  829 */         result$iv$iv = false;
/*      */         break;
/*      */       } 
/*  832 */       SnapshotStateList this_$iv$iv$iv = $this$conditionalUpdate_u24lambda_u2428$iv$iv; int $i$f$writable = 0;
/*  833 */       Intrinsics.checkNotNull(this_$iv$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv$iv = this_$iv$iv$iv.getFirstStateRecord(); int i = 0;
/*  834 */       Object snapshot$iv$iv$iv$iv = null; snapshot$iv$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  835 */       int $i$f$sync = 0;
/*  836 */       SynchronizedObject lock$iv$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0; synchronized (lock$iv$iv$iv$iv$iv$iv) {
/*  837 */         int $i$a$-sync-SnapshotKt$writable$3$iv$iv$iv$iv = 0; snapshot$iv$iv$iv$iv = Snapshot.Companion.getCurrent();
/*  838 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv$iv$iv, this_$iv$iv$iv, (Snapshot)snapshot$iv$iv$iv$iv); int $i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv$iv = 0;
/*  839 */         SynchronizedObject synchronizedObject = SnapshotStateListKt.access$getSync$p(); int m = 0; synchronized (synchronizedObject)
/*      */         { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$2$1$iv$iv = 0;
/*  841 */           $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.setList$runtime(newList$iv$iv);
/*      */           
/*  843 */           int n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.getModification$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.setModification$runtime(n + 1);
/*  844 */           boolean bool1 = ($this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv$iv.getModification$runtime() == currentModification$iv$iv) ? true : 
/*  845 */             false; }  boolean bool = bool1;
/*  846 */       }  $i$f$sync = bool; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv$iv$iv = 0;
/*  847 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv$iv$iv, this_$iv$iv$iv);
/*      */       if ($i$f$sync != 0) {
/*  849 */         result$iv$iv = true;
/*      */         break;
/*      */       } 
/*      */     } 
/*      */     return t; } public final void removeRange(int fromIndex, int toIndex) {
/*      */     SnapshotStateList this_$iv = this;
/*      */     int $i$f$mutate = 0;
/*  856 */     Object result$iv = null;
/*      */     while (true) {
/*  858 */       Object oldList$iv = null;
/*  859 */       int currentModification$iv = 0;
/*  860 */       SynchronizedObject lock$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  861 */       synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateList$mutate$1$iv = 0;
/*  862 */         SnapshotStateList this_$iv$iv = this_$iv; int $i$f$withCurrent = 0;
/*  863 */         Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  864 */         StateListStateRecord $this$mutate_u24lambda_u2421_u24lambda_u2420$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$mutate$1$current$1$iv = 0; StateListStateRecord current$iv = $this$mutate_u24lambda_u2421_u24lambda_u2420$iv;
/*  865 */         currentModification$iv = current$iv.getModification$runtime();
/*  866 */         oldList$iv = current$iv.getList$runtime();
/*  867 */         Unit unit = Unit.INSTANCE; }
/*  868 */        Intrinsics.checkNotNull(oldList$iv); PersistentList.Builder builder$iv = oldList$iv.builder();
/*  869 */       List it = (List)builder$iv; int $i$a$-mutate-SnapshotStateList$removeRange$1 = 0; it.subList(fromIndex, toIndex).clear(); result$iv = Unit.INSTANCE;
/*  870 */       PersistentList newList$iv = builder$iv.build();
/*  871 */       if (!Intrinsics.areEqual(newList$iv, oldList$iv)) { SnapshotStateList this_$iv$iv = this_$iv; int $i$f$writable = 0;
/*  872 */         Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  873 */         Object snapshot$iv$iv$iv = null; snapshot$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  874 */         int $i$f$sync = 0;
/*  875 */         SynchronizedObject lock$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int j = 0;
/*      */         SynchronizedObject synchronizedObject1 = lock$iv$iv$iv$iv$iv;
/*      */         /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ }
/*      */       
/*      */       break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int retainAllInRange$runtime(@NotNull Collection<?> elements, int start, int end) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     int startSize = size();
/*      */     SnapshotStateList this_$iv = this;
/*      */     int $i$f$mutate = 0;
/*  891 */     Object result$iv = null;
/*      */     while (true) {
/*  893 */       Object oldList$iv = null;
/*  894 */       int currentModification$iv = 0;
/*  895 */       SynchronizedObject lock$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  896 */       synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateList$mutate$1$iv = 0;
/*  897 */         SnapshotStateList this_$iv$iv = this_$iv; int $i$f$withCurrent = 0;
/*  898 */         Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  899 */         StateListStateRecord $this$mutate_u24lambda_u2421_u24lambda_u2420$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$mutate$1$current$1$iv = 0; StateListStateRecord current$iv = $this$mutate_u24lambda_u2421_u24lambda_u2420$iv;
/*  900 */         currentModification$iv = current$iv.getModification$runtime();
/*  901 */         oldList$iv = current$iv.getList$runtime();
/*  902 */         Unit unit = Unit.INSTANCE; }
/*  903 */        Intrinsics.checkNotNull(oldList$iv); PersistentList.Builder builder$iv = oldList$iv.builder();
/*  904 */       List it = (List)builder$iv; int $i$a$-mutate-SnapshotStateList$retainAllInRange$1 = 0; it.subList(start, end).retainAll(elements); result$iv = Unit.INSTANCE;
/*  905 */       PersistentList newList$iv = builder$iv.build();
/*  906 */       if (!Intrinsics.areEqual(newList$iv, oldList$iv)) { SnapshotStateList this_$iv$iv = this_$iv; int $i$f$writable = 0;
/*  907 */         Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  908 */         Object snapshot$iv$iv$iv = null; snapshot$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  909 */         int $i$f$sync = 0;
/*  910 */         SynchronizedObject lock$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int j = 0;
/*      */         SynchronizedObject synchronizedObject1 = lock$iv$iv$iv$iv$iv;
/*      */         /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ }
/*      */       
/*      */       break;
/*      */     } 
/*      */     return startSize - size();
/*      */   }
/*      */ 
/*      */   
/*      */   @JvmName(name = "getDebuggerDisplayValue")
/*      */   @NotNull
/*      */   public final List<T> getDebuggerDisplayValue()
/*      */   {
/*      */     SnapshotStateList this_$iv = this;
/*      */     int $i$f$withCurrent = 0;
/*  926 */     Intrinsics.checkNotNull(this_$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv = this_$iv.getFirstStateRecord(); int i = 0;
/*  927 */     StateListStateRecord $this$_get_debuggerDisplayValue__u24lambda_u2419 = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv); int $i$a$-withCurrent-SnapshotStateList$debuggerDisplayValue$1 = 0; return (List<T>)$this$_get_debuggerDisplayValue__u24lambda_u2419.getList$runtime(); } private final <R> R writable(Function1 block) { int $i$f$writable = 0; Intrinsics.checkNotNull(getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv = getFirstStateRecord(); int i = 0;
/*  928 */     Object snapshot$iv = null; snapshot$iv = SnapshotKt.getSnapshotInitializer();
/*  929 */     int $i$f$sync = 0;
/*  930 */     SynchronizedObject lock$iv$iv$iv = SnapshotKt.getLock(); int $i$f$synchronized = 0;
/*  931 */     SynchronizedObject synchronizedObject1 = lock$iv$iv$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-sync-SnapshotKt$writable$3$iv = 0;
/*  932 */       snapshot$iv = Snapshot.Companion.getCurrent();
/*  933 */       Object object = block.invoke(SnapshotKt.writableRecord($this$writable$iv, this, (Snapshot)snapshot$iv)); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }
/*  934 */      Object object1 = object; Object it$iv = object1; int $i$a$-also-SnapshotKt$writable$4$iv = 0;
/*  935 */     SnapshotKt.notifyWrite((Snapshot)snapshot$iv, this); return (R)object1; } private final <R> R withCurrent(Function1 block) { int $i$f$withCurrent = 0; Intrinsics.checkNotNull(getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv = getFirstStateRecord();
/*      */     int i = 0;
/*  937 */     return (R)block.invoke(SnapshotKt.current($this$withCurrent$iv)); } private final boolean mutateBoolean(Function1 block) { SnapshotStateList this_$iv = this; int $i$f$mutate = 0;
/*  938 */     Object result$iv = null;
/*      */     while (true) {
/*  940 */       Object oldList$iv = null;
/*  941 */       int currentModification$iv = 0;
/*  942 */       SynchronizedObject lock$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  943 */       synchronized (lock$iv$iv) { int $i$a$-synchronized-SnapshotStateList$mutate$1$iv = 0;
/*  944 */         SnapshotStateList this_$iv$iv = this_$iv; int $i$f$withCurrent = 0;
/*  945 */         Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  946 */         StateListStateRecord $this$mutate_u24lambda_u2421_u24lambda_u2420$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$mutate$1$current$1$iv = 0; StateListStateRecord current$iv = $this$mutate_u24lambda_u2421_u24lambda_u2420$iv;
/*  947 */         currentModification$iv = current$iv.getModification$runtime();
/*  948 */         oldList$iv = current$iv.getList$runtime();
/*  949 */         Unit unit = Unit.INSTANCE; }
/*  950 */        Intrinsics.checkNotNull(oldList$iv); PersistentList.Builder builder$iv = oldList$iv.builder();
/*  951 */       result$iv = block.invoke(builder$iv);
/*  952 */       PersistentList newList$iv = builder$iv.build();
/*  953 */       if (!Intrinsics.areEqual(newList$iv, oldList$iv)) { SnapshotStateList this_$iv$iv = this_$iv; int $i$f$writable = 0;
/*  954 */         Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/*  955 */         Object snapshot$iv$iv$iv = null; snapshot$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  956 */         int $i$f$sync = 0;
/*  957 */         SynchronizedObject lock$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int j = 0;
/*      */ 
/*      */ 
/*      */         
/*      */         SynchronizedObject synchronizedObject1 = lock$iv$iv$iv$iv$iv;
/*      */ 
/*      */         
/*      */         /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ }
/*      */ 
/*      */ 
/*      */       
/*      */       break;
/*      */     } 
/*      */ 
/*      */     
/*  972 */     return ((Boolean)result$iv).booleanValue(); } private final <R> R mutate(Function1 block) { int $i$f$mutate = 0; Object result = null; while (true) {
/*  973 */       Object oldList = null; int currentModification = 0; SynchronizedObject lock$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0; SynchronizedObject synchronizedObject1 = lock$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-synchronized-SnapshotStateList$mutate$1 = 0; SnapshotStateList this_$iv = this; int $i$f$withCurrent = 0;
/*  974 */         Intrinsics.checkNotNull(this_$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv = this_$iv.getFirstStateRecord(); int i = 0;
/*  975 */         StateListStateRecord $this$mutate_u24lambda_u2421_u24lambda_u2420 = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv); int $i$a$-withCurrent-SnapshotStateList$mutate$1$current$1 = 0; StateListStateRecord current = $this$mutate_u24lambda_u2421_u24lambda_u2420; currentModification = current.getModification$runtime(); oldList = current.getList$runtime(); Unit unit = Unit.INSTANCE; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }
/*  976 */        Intrinsics.checkNotNull(oldList); PersistentList.Builder builder = oldList.builder(); result = block.invoke(builder); PersistentList newList = builder.build(); if (!Intrinsics.areEqual(newList, oldList)) { SnapshotStateList this_$iv = this; int $i$f$writable = 0; Intrinsics.checkNotNull(this_$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv = this_$iv.getFirstStateRecord(); int i = 0;
/*  977 */         Object snapshot$iv$iv = null; snapshot$iv$iv = SnapshotKt.getSnapshotInitializer();
/*  978 */         int $i$f$sync = 0;
/*  979 */         SynchronizedObject lock$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0;
/*  980 */         SynchronizedObject synchronizedObject2 = lock$iv$iv$iv$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-sync-SnapshotKt$writable$3$iv$iv = 0;
/*  981 */           snapshot$iv$iv = Snapshot.Companion.getCurrent();
/*  982 */           StateListStateRecord $this$mutate_u24lambda_u2423 = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv, this_$iv, (Snapshot)snapshot$iv$iv); int $i$a$-writable-SnapshotStateList$mutate$2 = 0; SynchronizedObject synchronizedObject3 = SnapshotStateListKt.access$getSync$p(); int m = 0;
/*  983 */           SynchronizedObject synchronizedObject4 = synchronizedObject3; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-synchronized-SnapshotStateList$mutate$2$1 = 0; $this$mutate_u24lambda_u2423.setList$runtime(newList); int n = $this$mutate_u24lambda_u2423.getModification$runtime(); $this$mutate_u24lambda_u2423.setModification$runtime(n + 1); n = $this$mutate_u24lambda_u2423.getStructuralChange$runtime(); $this$mutate_u24lambda_u2423.setStructuralChange$runtime(n + 1); boolean bool1 = ($this$mutate_u24lambda_u2423.getModification$runtime() == currentModification) ? true : false; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  boolean bool = bool1; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }
/*  984 */          $i$f$sync = bool; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv = 0;
/*  985 */         SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv, this_$iv); if ($i$f$sync != 0)
/*      */           break;  continue; }  break;
/*  987 */     }  return (R)result; } private final void update(boolean structural, Function1 block) { int $i$f$update = 0; SnapshotStateList this_$iv = this; int $i$f$conditionalUpdate = 0; SnapshotStateList $this$conditionalUpdate_u24lambda_u2428$iv = this_$iv; int $i$a$-run-SnapshotStateList$conditionalUpdate$1$iv = 0;
/*  988 */     boolean result$iv = false;
/*      */     while (true) {
/*  990 */       Object oldList$iv = null;
/*  991 */       int currentModification$iv = 0;
/*  992 */       SynchronizedObject lock$iv$iv = SnapshotStateListKt.access$getSync$p(); int $i$f$synchronized = 0;
/*  993 */       SynchronizedObject synchronizedObject1 = lock$iv$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1$iv = 0;
/*  994 */         SnapshotStateList snapshotStateList = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$withCurrent = 0;
/*  995 */         Intrinsics.checkNotNull(snapshotStateList.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv$iv = snapshotStateList.getFirstStateRecord(); int m = 0;
/*  996 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv$iv); int $i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1$iv = 0; StateListStateRecord current$iv = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424$iv;
/*  997 */         currentModification$iv = current$iv.getModification$runtime();
/*  998 */         oldList$iv = current$iv.getList$runtime();
/*  999 */         Unit unit = Unit.INSTANCE; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }
/* 1000 */        Intrinsics.checkNotNull(oldList$iv); PersistentList newList$iv = (PersistentList)block.invoke(oldList$iv);
/* 1001 */       if (Intrinsics.areEqual(newList$iv, oldList$iv)) {
/* 1002 */         result$iv = false;
/*      */         break;
/*      */       } 
/* 1005 */       SnapshotStateList this_$iv$iv = $this$conditionalUpdate_u24lambda_u2428$iv; int $i$f$writable = 0;
/* 1006 */       Intrinsics.checkNotNull(this_$iv$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv$iv = this_$iv$iv.getFirstStateRecord(); int i = 0;
/* 1007 */       Object snapshot$iv$iv$iv = null; snapshot$iv$iv$iv = SnapshotKt.getSnapshotInitializer();
/* 1008 */       int $i$f$sync = 0;
/* 1009 */       SynchronizedObject lock$iv$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0; SynchronizedObject synchronizedObject2 = lock$iv$iv$iv$iv$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ 
/* 1010 */       try { int $i$a$-sync-SnapshotKt$writable$3$iv$iv$iv = 0; snapshot$iv$iv$iv = Snapshot.Companion.getCurrent();
/* 1011 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv$iv, this_$iv$iv, (Snapshot)snapshot$iv$iv$iv); int $i$a$-writable-SnapshotStateList$conditionalUpdate$1$2$iv = 0;
/* 1012 */         SynchronizedObject synchronizedObject3 = SnapshotStateListKt.access$getSync$p(); int m = 0; SynchronizedObject synchronizedObject4 = synchronizedObject3; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ 
/*      */         try { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$2$1$iv = 0;
/* 1014 */           $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setList$runtime(newList$iv);
/* 1015 */           if (structural) { int i1 = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getStructuralChange$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setStructuralChange$runtime(i1 + 1); }
/* 1016 */            int n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.setModification$runtime(n + 1);
/* 1017 */           boolean bool1 = ($this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427$iv.getModification$runtime() == currentModification$iv) ? true : 
/* 1018 */             false; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  boolean bool = bool1; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }
/* 1019 */        $i$f$sync = bool; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv$iv = 0;
/* 1020 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv$iv, this_$iv$iv);
/*      */       if ($i$f$sync != 0) {
/* 1022 */         result$iv = true;
/*      */         break;
/*      */       } 
/*      */     }  }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private final boolean conditionalUpdate(boolean structural, Function1 block) {
/*      */     int $i$f$conditionalUpdate = 0;
/*      */     SnapshotStateList $this$conditionalUpdate_u24lambda_u2428 = this;
/*      */     int $i$a$-run-SnapshotStateList$conditionalUpdate$1 = 0;
/*      */     boolean result = false;
/*      */     while (true) {
/*      */       Object oldList = null;
/*      */       int currentModification = 0;
/*      */       SynchronizedObject lock$iv = SnapshotStateListKt.access$getSync$p();
/*      */       int $i$f$synchronized = 0;
/* 1068 */       SynchronizedObject synchronizedObject1 = lock$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$1 = 0; SnapshotStateList snapshotStateList = $this$conditionalUpdate_u24lambda_u2428; int $i$f$withCurrent = 0;
/* 1069 */         Intrinsics.checkNotNull(snapshotStateList.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$withCurrent$iv$iv = snapshotStateList.getFirstStateRecord(); int m = 0;
/* 1070 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424 = (StateListStateRecord)SnapshotKt.<StateRecord>current($this$withCurrent$iv$iv); int $i$a$-withCurrent-SnapshotStateList$conditionalUpdate$1$1$current$1 = 0; StateListStateRecord current = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2425_u24lambda_u2424; currentModification = current.getModification$runtime(); oldList = current.getList$runtime(); Unit unit = Unit.INSTANCE; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  Intrinsics.checkNotNull(oldList); PersistentList newList = (PersistentList)block.invoke(oldList); if (Intrinsics.areEqual(newList, oldList)) { result = false; break; }
/* 1071 */        SnapshotStateList this_$iv = $this$conditionalUpdate_u24lambda_u2428; int $i$f$writable = 0; Intrinsics.checkNotNull(this_$iv.getFirstStateRecord(), "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"); StateRecord $this$writable$iv$iv = this_$iv.getFirstStateRecord(); int i = 0;
/* 1072 */       Object snapshot$iv$iv = null; snapshot$iv$iv = SnapshotKt.getSnapshotInitializer();
/* 1073 */       int $i$f$sync = 0;
/* 1074 */       SynchronizedObject lock$iv$iv$iv$iv = SnapshotKt.getLock(); int k = 0;
/* 1075 */       SynchronizedObject synchronizedObject2 = lock$iv$iv$iv$iv; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-sync-SnapshotKt$writable$3$iv$iv = 0;
/* 1076 */         snapshot$iv$iv = Snapshot.Companion.getCurrent();
/* 1077 */         StateListStateRecord $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427 = (StateListStateRecord)SnapshotKt.<StateRecord>writableRecord($this$writable$iv$iv, this_$iv, (Snapshot)snapshot$iv$iv); int $i$a$-writable-SnapshotStateList$conditionalUpdate$1$2 = 0; SynchronizedObject synchronizedObject3 = SnapshotStateListKt.access$getSync$p(); int m = 0;
/* 1078 */         SynchronizedObject synchronizedObject4 = synchronizedObject3; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ try { int $i$a$-synchronized-SnapshotStateList$conditionalUpdate$1$2$1 = 0; $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427.setList$runtime(newList); if (structural) { int i1 = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427.getStructuralChange$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427.setStructuralChange$runtime(i1 + 1); }  int n = $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427.getModification$runtime(); $this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427.setModification$runtime(n + 1); boolean bool1 = ($this$conditionalUpdate_u24lambda_u2428_u24lambda_u2427.getModification$runtime() == currentModification) ? true : false; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }  boolean bool = bool1; } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{androidx/compose/runtime/SynchronizedObject}, name=null} */ InlineMarker.finallyEnd(1); }
/* 1079 */        $i$f$sync = bool; int j = $i$f$sync, $i$a$-also-SnapshotKt$writable$4$iv$iv = 0;
/* 1080 */       SnapshotKt.notifyWrite((Snapshot)snapshot$iv$iv, this_$iv);
/*      */       if ($i$f$sync != 0) {
/*      */         result = true;
/*      */         break;
/*      */       } 
/*      */     } 
/*      */     return result;
/*      */   }
/*      */   
/*      */   public <T> T[] toArray(Object[] array) {
/*      */     Intrinsics.checkNotNullParameter(array, "array");
/*      */     return (T[])CollectionToArray.toArray(this, array);
/*      */   }
/*      */   
/*      */   public Object[] toArray() {
/*      */     return CollectionToArray.toArray(this);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotStateList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */