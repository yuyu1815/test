/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*     */ import androidx.compose.foundation.lazy.LazyListScope;
/*     */ import androidx.compose.foundation.lazy.LazyListState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.snapshots.SnapshotStateList;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.SerializableArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionFailed;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.StepMetaInfoAppearedEvent;
/*     */ import com.intellij.openapi.fileChooser.FileChooserDescriptor;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000P\n\000\n\002\020\016\n\000\n\002\020\t\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\032\025\020\000\032\0020\0012\b\020\002\032\004\030\0010\003¢\006\002\020\004\032\016\020\005\032\0020\0012\006\020\006\032\0020\007\032\022\020\b\032\0020\0012\b\020\t\032\004\030\0010\nH\002\032\025\020\013\032\0020\f2\006\020\r\032\0020\016H\007¢\006\002\020\017\032I\020\020\032\0020\f2\f\020\021\032\b\022\004\022\0020\0230\0222\b\b\002\020\024\032\0020\0252\022\020\026\032\016\022\004\022\0020\023\022\004\022\0020\f0\0272\016\020\030\032\n\022\006\022\004\030\0010\0010\031H\007¢\006\002\020\032\032A\020\033\032\0020\f2\006\020\034\032\0020\0232\006\020\024\032\0020\0252\022\020\026\032\016\022\004\022\0020\023\022\004\022\0020\f0\0272\016\020\030\032\n\022\006\022\004\030\0010\0010\031H\007¢\006\002\020\035¨\006\036²\006\020\020\037\032\b\022\004\022\0020\0230 X\002²\006\f\020!\032\004\030\0010\023X\002"}, d2 = {"formatTimestamp", "", "timestamp", "", "(Ljava/lang/Long;)Ljava/lang/String;", "summarizeEvent", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "idPresentation", "requestId", "Lcom/intellij/ml/llm/matterhorn/SerializableArtifactId;", "EventLogScreen", "", "viewModel", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;Landroidx/compose/runtime/Composer;I)V", "EventTreeView", "nodes", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;", "indent", "", "onNodeClick", "Lkotlin/Function1;", "hoveredGroupId", "Landroidx/compose/runtime/MutableState;", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V", "EventTreeItem", "node", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "eventTree", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "selectedNode"})
/*     */ @SourceDebugExtension({"SMAP\nDebugEventsPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugEventsPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsPageKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,298:1\n1225#2,6:299\n1225#2,6:415\n1225#2,6:422\n1225#2,6:429\n1225#2,6:436\n1225#2,6:483\n1225#2,6:572\n1225#2,6:578\n1225#2,6:596\n1225#2,6:602\n1225#2,6:608\n1225#2,6:614\n1225#2,6:657\n1225#2,6:666\n1225#2,6:673\n1225#2,6:680\n149#3:305\n149#3:421\n149#3:428\n149#3:435\n149#3:446\n149#3:497\n149#3:534\n149#3:620\n149#3:663\n149#3:664\n149#3:665\n149#3:672\n149#3:679\n99#4:306\n96#4,6:307\n102#4:341\n99#4:378\n95#4,7:379\n102#4:414\n106#4:445\n106#4:595\n99#4:621\n96#4,6:622\n102#4:656\n106#4:689\n79#5,6:313\n86#5,4:328\n90#5,2:338\n79#5,6:349\n86#5,4:364\n90#5,2:374\n79#5,6:386\n86#5,4:401\n90#5,2:411\n94#5:444\n79#5,6:454\n86#5,4:469\n90#5,2:479\n94#5:491\n94#5:495\n79#5,6:505\n86#5,4:520\n90#5,2:530\n79#5,6:543\n86#5,4:558\n90#5,2:568\n94#5:586\n94#5:590\n94#5:594\n79#5,6:628\n86#5,4:643\n90#5,2:653\n94#5:688\n368#6,9:319\n377#6:340\n368#6,9:355\n377#6:376\n368#6,9:392\n377#6:413\n378#6,2:442\n368#6,9:460\n377#6:481\n378#6,2:489\n378#6,2:493\n368#6,9:511\n377#6:532\n368#6,9:549\n377#6:570\n378#6,2:584\n378#6,2:588\n378#6,2:592\n368#6,9:634\n377#6:655\n378#6,2:686\n4034#7,6:332\n4034#7,6:368\n4034#7,6:405\n4034#7,6:473\n4034#7,6:524\n4034#7,6:562\n4034#7,6:647\n86#8:342\n83#8,6:343\n89#8:377\n93#8:496\n86#8:535\n82#8,7:536\n89#8:571\n93#8:587\n71#9:447\n68#9,6:448\n74#9:482\n78#9:492\n71#9:498\n68#9,6:499\n74#9:533\n78#9:591\n1863#10,2:690\n81#11:692\n81#11:693\n143#12,12:694\n*S KotlinDebug\n*F\n+ 1 DebugEventsPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsPageKt\n*L\n74#1:299,6\n82#1:415,6\n93#1:422,6\n104#1:429,6\n115#1:436,6\n132#1:483,6\n147#1:572,6\n150#1:578,6\n178#1:596,6\n185#1:602,6\n216#1:608,6\n208#1:614,6\n240#1:657,6\n250#1:666,6\n260#1:673,6\n269#1:680,6\n76#1:305\n89#1:421\n100#1:428\n111#1:435\n123#1:446\n139#1:497\n144#1:534\n230#1:620\n241#1:663\n243#1:664\n245#1:665\n256#1:672\n265#1:679\n76#1:306\n76#1:307,6\n76#1:341\n79#1:378\n79#1:379,7\n79#1:414\n79#1:445\n76#1:595\n226#1:621\n226#1:622,6\n226#1:656\n226#1:689\n76#1:313,6\n76#1:328,4\n76#1:338,2\n77#1:349,6\n77#1:364,4\n77#1:374,2\n79#1:386,6\n79#1:401,4\n79#1:411,2\n79#1:444\n126#1:454,6\n126#1:469,4\n126#1:479,2\n126#1:491\n77#1:495\n142#1:505,6\n142#1:520,4\n142#1:530,2\n143#1:543,6\n143#1:558,4\n143#1:568,2\n143#1:586\n142#1:590\n76#1:594\n226#1:628,6\n226#1:643,4\n226#1:653,2\n226#1:688\n76#1:319,9\n76#1:340\n77#1:355,9\n77#1:376\n79#1:392,9\n79#1:413\n79#1:442,2\n126#1:460,9\n126#1:481\n126#1:489,2\n77#1:493,2\n142#1:511,9\n142#1:532\n143#1:549,9\n143#1:570\n143#1:584,2\n142#1:588,2\n76#1:592,2\n226#1:634,9\n226#1:655\n226#1:686,2\n76#1:332,6\n77#1:368,6\n79#1:405,6\n126#1:473,6\n142#1:524,6\n143#1:562,6\n226#1:647,6\n77#1:342\n77#1:343,6\n77#1:377\n77#1:496\n143#1:535\n143#1:536,7\n143#1:571\n143#1:587\n126#1:447\n126#1:448,6\n126#1:482\n126#1:492\n142#1:498\n142#1:499,6\n142#1:533\n142#1:591\n279#1:690,2\n72#1:692\n73#1:693\n186#1:694,12\n*E\n"})
/*     */ public final class DebugEventsPageKt {
/*     */   @NotNull
/*     */   public static final String formatTimestamp(@Nullable Long timestamp) {
/*  35 */     SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
/*  36 */     Date date = new Date(timestamp.longValue());
/*  37 */     String str = dateFormat.format(date);
/*     */     Intrinsics.checkNotNull(str);
/*  39 */     return (timestamp != null) ? str : "Unknown Time";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String summarizeEvent(@NotNull CustomArtifactEvent event) {
/*  44 */     Intrinsics.checkNotNullParameter(event, "event"); CustomArtifactEvent customArtifactEvent = event;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     ((AgentActionExecutionFailed)event).getException().getMessage(); return (customArtifactEvent instanceof LlmRequestEvent) ? ("LlmRequestEvent, attempt=" + ((LlmRequestEvent)event).getAttemptNumber()) : ((customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.llm.LlmResponseEvent) ? "LlmResponseEvent" : ((customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.llm.LlmRequestFailed) ? "LlmRequestFailed" : ((customArtifactEvent instanceof BeforeStepStartedEvent) ? ("Step Start \"" + ((BeforeStepStartedEvent)event).getActionRequest().getName() + "\"") : ((customArtifactEvent instanceof AfterStepFinishedEvent) ? ("Step End \"" + ((AfterStepFinishedEvent)event).getActionRequest().getName() + "\"") : ((customArtifactEvent instanceof ActionRequestBuildingStarted) ? ("Action Request Building Started: attempt=" + ((ActionRequestBuildingStarted)event).getAttemptNumber()) : ((customArtifactEvent instanceof ActionRequestBuildingFinished) ? ("Action Request Building Finished: attempt=" + ((ActionRequestBuildingFinished)event).getAttemptNumber()) : ((customArtifactEvent instanceof ActionRequestBuildingFailed) ? ("Action Request Building Failed: attempt=" + ((ActionRequestBuildingFailed)event).getAttemptNumber()) : ((customArtifactEvent instanceof AgentActionExecutionStarted) ? ("Action Started: action=" + ((AgentActionExecutionStarted)event).getActionToExecute().getName()) : ((customArtifactEvent instanceof com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionFinished) ? "Action Finished" : ((customArtifactEvent instanceof AgentActionExecutionFailed) ? ("Action Failed: error=" + ((((AgentActionExecutionFailed)event).getException().getMessage() != null) ? StringsKt.take(((AgentActionExecutionFailed)event).getException().getMessage(), 50) : null)) : (
/*  56 */       (customArtifactEvent instanceof BeforeArtifactBuildingStarted) ? ("Artifact started: " + idPresentation(((BeforeArtifactBuildingStarted)event).getRequestId())) : (
/*  57 */       (customArtifactEvent instanceof AfterArtifactBuildingFinished) ? ("Artifact finished: " + idPresentation(((AfterArtifactBuildingFinished)event).getRequestId())) : (
/*     */       
/*  59 */       (customArtifactEvent instanceof StepMetaInfoAppearedEvent) ? ("MetaInfo appeared: " + ((StepMetaInfoAppearedEvent)event).getStepName() + ", type = " + ((StepMetaInfoAppearedEvent)event).getStepType()) : ("Event: " + 
/*  60 */       Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName()))))))))))))));
/*     */   }
/*     */   
/*     */   private static final String idPresentation(SerializableArtifactId requestId) {
/*  64 */     ArtifactId<?> id = requestId.toArtifactId();
/*  65 */     return (requestId != null) ? ((id != null) ? (EventDetailsKt.getPresentableArtifactNameAndType(id) + EventDetailsKt.getPresentableArtifactNameAndType(id)) : requestId.getData()) : 
/*  66 */       "";
/*     */   } @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void EventLogScreen(@NotNull EventLogViewModel viewModel, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'viewModel'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 702127637
/*     */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   14: astore_1
/*     */     //   15: iload_2
/*     */     //   16: istore_3
/*     */     //   17: iload_2
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 42
/*     */     //   24: iload_3
/*     */     //   25: aload_1
/*     */     //   26: aload_0
/*     */     //   27: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   32: ifeq -> 39
/*     */     //   35: iconst_4
/*     */     //   36: goto -> 40
/*     */     //   39: iconst_2
/*     */     //   40: ior
/*     */     //   41: istore_3
/*     */     //   42: iload_3
/*     */     //   43: iconst_3
/*     */     //   44: iand
/*     */     //   45: iconst_2
/*     */     //   46: if_icmpne -> 58
/*     */     //   49: aload_1
/*     */     //   50: invokeinterface getSkipping : ()Z
/*     */     //   55: ifne -> 4087
/*     */     //   58: invokestatic isTraceInProgress : ()Z
/*     */     //   61: ifeq -> 74
/*     */     //   64: ldc 702127637
/*     */     //   66: iload_3
/*     */     //   67: iconst_m1
/*     */     //   68: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.EventLogScreen (DebugEventsPage.kt:70)'
/*     */     //   71: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   74: aload_0
/*     */     //   75: invokevirtual getEventTree : ()Landroidx/compose/runtime/MutableState;
/*     */     //   78: astore #4
/*     */     //   80: aload_0
/*     */     //   81: invokevirtual getSelectedNode : ()Landroidx/compose/runtime/MutableState;
/*     */     //   84: astore #5
/*     */     //   86: aload_1
/*     */     //   87: ldc_w -394060368
/*     */     //   90: invokeinterface startReplaceGroup : (I)V
/*     */     //   95: aload_1
/*     */     //   96: astore #8
/*     */     //   98: iconst_0
/*     */     //   99: istore #9
/*     */     //   101: nop
/*     */     //   102: iconst_0
/*     */     //   103: istore #10
/*     */     //   105: aload #8
/*     */     //   107: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   112: astore #11
/*     */     //   114: iconst_0
/*     */     //   115: istore #12
/*     */     //   117: aload #11
/*     */     //   119: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   122: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   125: if_acmpne -> 154
/*     */     //   128: iconst_0
/*     */     //   129: istore #13
/*     */     //   131: aconst_null
/*     */     //   132: aconst_null
/*     */     //   133: iconst_2
/*     */     //   134: aconst_null
/*     */     //   135: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   138: astore #13
/*     */     //   140: aload #8
/*     */     //   142: aload #13
/*     */     //   144: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   149: aload #13
/*     */     //   151: goto -> 156
/*     */     //   154: aload #11
/*     */     //   156: nop
/*     */     //   157: nop
/*     */     //   158: nop
/*     */     //   159: checkcast androidx/compose/runtime/MutableState
/*     */     //   162: astore #7
/*     */     //   164: aload_1
/*     */     //   165: invokeinterface endReplaceGroup : ()V
/*     */     //   170: aload #7
/*     */     //   172: astore #6
/*     */     //   174: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   177: checkcast androidx/compose/ui/Modifier
/*     */     //   180: fconst_0
/*     */     //   181: iconst_1
/*     */     //   182: aconst_null
/*     */     //   183: invokestatic fillMaxSize$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   186: bipush #8
/*     */     //   188: istore #7
/*     */     //   190: iconst_0
/*     */     //   191: istore #8
/*     */     //   193: iload #7
/*     */     //   195: i2f
/*     */     //   196: invokestatic constructor-impl : (F)F
/*     */     //   199: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   202: astore #7
/*     */     //   204: bipush #6
/*     */     //   206: istore #10
/*     */     //   208: iconst_0
/*     */     //   209: istore #11
/*     */     //   211: aload_1
/*     */     //   212: ldc_w 693286680
/*     */     //   215: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   218: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   221: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   224: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   227: astore #8
/*     */     //   229: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   232: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   235: astore #9
/*     */     //   237: aload #8
/*     */     //   239: aload #9
/*     */     //   241: aload_1
/*     */     //   242: bipush #14
/*     */     //   244: iload #10
/*     */     //   246: iconst_3
/*     */     //   247: ishr
/*     */     //   248: iand
/*     */     //   249: bipush #112
/*     */     //   251: iload #10
/*     */     //   253: iconst_3
/*     */     //   254: ishr
/*     */     //   255: iand
/*     */     //   256: ior
/*     */     //   257: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   260: astore #12
/*     */     //   262: bipush #112
/*     */     //   264: iload #10
/*     */     //   266: iconst_3
/*     */     //   267: ishl
/*     */     //   268: iand
/*     */     //   269: istore #13
/*     */     //   271: nop
/*     */     //   272: iconst_0
/*     */     //   273: istore #14
/*     */     //   275: aload_1
/*     */     //   276: ldc_w -1323940314
/*     */     //   279: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   282: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   285: aload_1
/*     */     //   286: iconst_0
/*     */     //   287: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   290: istore #15
/*     */     //   292: aload_1
/*     */     //   293: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   298: astore #16
/*     */     //   300: aload_1
/*     */     //   301: aload #7
/*     */     //   303: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   306: astore #17
/*     */     //   308: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   311: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   314: astore #18
/*     */     //   316: bipush #6
/*     */     //   318: sipush #896
/*     */     //   321: iload #13
/*     */     //   323: bipush #6
/*     */     //   325: ishl
/*     */     //   326: iand
/*     */     //   327: ior
/*     */     //   328: istore #19
/*     */     //   330: nop
/*     */     //   331: iconst_0
/*     */     //   332: istore #20
/*     */     //   334: aload_1
/*     */     //   335: ldc_w -692256719
/*     */     //   338: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   341: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   344: aload_1
/*     */     //   345: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   350: instanceof androidx/compose/runtime/Applier
/*     */     //   353: ifne -> 359
/*     */     //   356: invokestatic invalidApplier : ()V
/*     */     //   359: aload_1
/*     */     //   360: invokeinterface startReusableNode : ()V
/*     */     //   365: aload_1
/*     */     //   366: invokeinterface getInserting : ()Z
/*     */     //   371: ifeq -> 385
/*     */     //   374: aload_1
/*     */     //   375: aload #18
/*     */     //   377: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   382: goto -> 391
/*     */     //   385: aload_1
/*     */     //   386: invokeinterface useNode : ()V
/*     */     //   391: aload_1
/*     */     //   392: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   395: astore #21
/*     */     //   397: iconst_0
/*     */     //   398: istore #22
/*     */     //   400: aload #21
/*     */     //   402: aload #12
/*     */     //   404: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   407: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   410: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   413: aload #21
/*     */     //   415: aload #16
/*     */     //   417: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   420: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   423: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   426: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   429: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   432: astore #23
/*     */     //   434: iconst_0
/*     */     //   435: istore #24
/*     */     //   437: aload #21
/*     */     //   439: astore #25
/*     */     //   441: iconst_0
/*     */     //   442: istore #26
/*     */     //   444: aload #25
/*     */     //   446: invokeinterface getInserting : ()Z
/*     */     //   451: ifne -> 472
/*     */     //   454: aload #25
/*     */     //   456: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   461: iload #15
/*     */     //   463: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   466: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   469: ifne -> 498
/*     */     //   472: aload #25
/*     */     //   474: iload #15
/*     */     //   476: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   479: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   484: aload #21
/*     */     //   486: iload #15
/*     */     //   488: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   491: aload #23
/*     */     //   493: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   498: nop
/*     */     //   499: nop
/*     */     //   500: nop
/*     */     //   501: aload #21
/*     */     //   503: aload #17
/*     */     //   505: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   508: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   511: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   514: nop
/*     */     //   515: nop
/*     */     //   516: aload_1
/*     */     //   517: bipush #14
/*     */     //   519: iload #19
/*     */     //   521: bipush #6
/*     */     //   523: ishr
/*     */     //   524: iand
/*     */     //   525: istore #27
/*     */     //   527: astore #28
/*     */     //   529: iconst_0
/*     */     //   530: istore #29
/*     */     //   532: aload #28
/*     */     //   534: ldc_w -407840262
/*     */     //   537: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   540: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   543: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   546: aload #28
/*     */     //   548: bipush #6
/*     */     //   550: bipush #112
/*     */     //   552: iload #10
/*     */     //   554: bipush #6
/*     */     //   556: ishr
/*     */     //   557: iand
/*     */     //   558: ior
/*     */     //   559: istore #30
/*     */     //   561: astore #31
/*     */     //   563: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   566: astore #32
/*     */     //   568: iconst_0
/*     */     //   569: istore #33
/*     */     //   571: aload #32
/*     */     //   573: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   576: checkcast androidx/compose/ui/Modifier
/*     */     //   579: fconst_1
/*     */     //   580: iconst_0
/*     */     //   581: iconst_2
/*     */     //   582: aconst_null
/*     */     //   583: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   586: astore #34
/*     */     //   588: iconst_0
/*     */     //   589: istore #35
/*     */     //   591: iconst_0
/*     */     //   592: istore #36
/*     */     //   594: aload #31
/*     */     //   596: ldc_w -483455358
/*     */     //   599: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   602: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   605: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   608: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   611: astore #37
/*     */     //   613: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   616: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   619: astore #38
/*     */     //   621: aload #37
/*     */     //   623: aload #38
/*     */     //   625: aload #31
/*     */     //   627: bipush #14
/*     */     //   629: iload #35
/*     */     //   631: iconst_3
/*     */     //   632: ishr
/*     */     //   633: iand
/*     */     //   634: bipush #112
/*     */     //   636: iload #35
/*     */     //   638: iconst_3
/*     */     //   639: ishr
/*     */     //   640: iand
/*     */     //   641: ior
/*     */     //   642: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   645: astore #39
/*     */     //   647: bipush #112
/*     */     //   649: iload #35
/*     */     //   651: iconst_3
/*     */     //   652: ishl
/*     */     //   653: iand
/*     */     //   654: istore #40
/*     */     //   656: nop
/*     */     //   657: iconst_0
/*     */     //   658: istore #41
/*     */     //   660: aload #31
/*     */     //   662: ldc_w -1323940314
/*     */     //   665: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   668: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   671: aload #31
/*     */     //   673: iconst_0
/*     */     //   674: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   677: istore #42
/*     */     //   679: aload #31
/*     */     //   681: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   686: astore #43
/*     */     //   688: aload #31
/*     */     //   690: aload #34
/*     */     //   692: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   695: astore #44
/*     */     //   697: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   700: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   703: astore #45
/*     */     //   705: bipush #6
/*     */     //   707: sipush #896
/*     */     //   710: iload #40
/*     */     //   712: bipush #6
/*     */     //   714: ishl
/*     */     //   715: iand
/*     */     //   716: ior
/*     */     //   717: istore #46
/*     */     //   719: nop
/*     */     //   720: iconst_0
/*     */     //   721: istore #47
/*     */     //   723: aload #31
/*     */     //   725: ldc_w -692256719
/*     */     //   728: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   731: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   734: aload #31
/*     */     //   736: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   741: instanceof androidx/compose/runtime/Applier
/*     */     //   744: ifne -> 750
/*     */     //   747: invokestatic invalidApplier : ()V
/*     */     //   750: aload #31
/*     */     //   752: invokeinterface startReusableNode : ()V
/*     */     //   757: aload #31
/*     */     //   759: invokeinterface getInserting : ()Z
/*     */     //   764: ifeq -> 779
/*     */     //   767: aload #31
/*     */     //   769: aload #45
/*     */     //   771: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   776: goto -> 786
/*     */     //   779: aload #31
/*     */     //   781: invokeinterface useNode : ()V
/*     */     //   786: aload #31
/*     */     //   788: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   791: astore #48
/*     */     //   793: iconst_0
/*     */     //   794: istore #49
/*     */     //   796: aload #48
/*     */     //   798: aload #39
/*     */     //   800: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   803: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   806: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   809: aload #48
/*     */     //   811: aload #43
/*     */     //   813: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   816: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   819: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   822: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   825: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   828: astore #50
/*     */     //   830: iconst_0
/*     */     //   831: istore #51
/*     */     //   833: aload #48
/*     */     //   835: astore #52
/*     */     //   837: iconst_0
/*     */     //   838: istore #53
/*     */     //   840: aload #52
/*     */     //   842: invokeinterface getInserting : ()Z
/*     */     //   847: ifne -> 868
/*     */     //   850: aload #52
/*     */     //   852: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   857: iload #42
/*     */     //   859: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   862: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   865: ifne -> 894
/*     */     //   868: aload #52
/*     */     //   870: iload #42
/*     */     //   872: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   875: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   880: aload #48
/*     */     //   882: iload #42
/*     */     //   884: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   887: aload #50
/*     */     //   889: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   894: nop
/*     */     //   895: nop
/*     */     //   896: nop
/*     */     //   897: aload #48
/*     */     //   899: aload #44
/*     */     //   901: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   904: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   907: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   910: nop
/*     */     //   911: nop
/*     */     //   912: aload #31
/*     */     //   914: bipush #14
/*     */     //   916: iload #46
/*     */     //   918: bipush #6
/*     */     //   920: ishr
/*     */     //   921: iand
/*     */     //   922: istore #54
/*     */     //   924: astore #55
/*     */     //   926: iconst_0
/*     */     //   927: istore #56
/*     */     //   929: aload #55
/*     */     //   931: ldc_w -384784025
/*     */     //   934: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   937: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   940: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   943: aload #55
/*     */     //   945: bipush #6
/*     */     //   947: bipush #112
/*     */     //   949: iload #35
/*     */     //   951: bipush #6
/*     */     //   953: ishr
/*     */     //   954: iand
/*     */     //   955: ior
/*     */     //   956: istore #57
/*     */     //   958: astore #58
/*     */     //   960: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   963: astore #59
/*     */     //   965: iconst_0
/*     */     //   966: istore #60
/*     */     //   968: iconst_0
/*     */     //   969: istore #61
/*     */     //   971: nop
/*     */     //   972: iconst_0
/*     */     //   973: istore #62
/*     */     //   975: aload #58
/*     */     //   977: ldc_w 693286680
/*     */     //   980: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   983: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   986: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   989: checkcast androidx/compose/ui/Modifier
/*     */     //   992: astore #63
/*     */     //   994: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   997: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1000: astore #64
/*     */     //   1002: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1005: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1008: astore #65
/*     */     //   1010: aload #64
/*     */     //   1012: aload #65
/*     */     //   1014: aload #58
/*     */     //   1016: bipush #14
/*     */     //   1018: iload #61
/*     */     //   1020: iconst_3
/*     */     //   1021: ishr
/*     */     //   1022: iand
/*     */     //   1023: bipush #112
/*     */     //   1025: iload #61
/*     */     //   1027: iconst_3
/*     */     //   1028: ishr
/*     */     //   1029: iand
/*     */     //   1030: ior
/*     */     //   1031: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1034: astore #66
/*     */     //   1036: bipush #112
/*     */     //   1038: iload #61
/*     */     //   1040: iconst_3
/*     */     //   1041: ishl
/*     */     //   1042: iand
/*     */     //   1043: istore #67
/*     */     //   1045: nop
/*     */     //   1046: iconst_0
/*     */     //   1047: istore #68
/*     */     //   1049: aload #58
/*     */     //   1051: ldc_w -1323940314
/*     */     //   1054: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1057: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1060: aload #58
/*     */     //   1062: iconst_0
/*     */     //   1063: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1066: istore #69
/*     */     //   1068: aload #58
/*     */     //   1070: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1075: astore #70
/*     */     //   1077: aload #58
/*     */     //   1079: aload #63
/*     */     //   1081: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1084: astore #71
/*     */     //   1086: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1089: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1092: astore #72
/*     */     //   1094: bipush #6
/*     */     //   1096: sipush #896
/*     */     //   1099: iload #67
/*     */     //   1101: bipush #6
/*     */     //   1103: ishl
/*     */     //   1104: iand
/*     */     //   1105: ior
/*     */     //   1106: istore #73
/*     */     //   1108: nop
/*     */     //   1109: iconst_0
/*     */     //   1110: istore #74
/*     */     //   1112: aload #58
/*     */     //   1114: ldc_w -692256719
/*     */     //   1117: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1120: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1123: aload #58
/*     */     //   1125: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1130: instanceof androidx/compose/runtime/Applier
/*     */     //   1133: ifne -> 1139
/*     */     //   1136: invokestatic invalidApplier : ()V
/*     */     //   1139: aload #58
/*     */     //   1141: invokeinterface startReusableNode : ()V
/*     */     //   1146: aload #58
/*     */     //   1148: invokeinterface getInserting : ()Z
/*     */     //   1153: ifeq -> 1168
/*     */     //   1156: aload #58
/*     */     //   1158: aload #72
/*     */     //   1160: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1165: goto -> 1175
/*     */     //   1168: aload #58
/*     */     //   1170: invokeinterface useNode : ()V
/*     */     //   1175: aload #58
/*     */     //   1177: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1180: astore #75
/*     */     //   1182: iconst_0
/*     */     //   1183: istore #76
/*     */     //   1185: aload #75
/*     */     //   1187: aload #66
/*     */     //   1189: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1192: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1195: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1198: aload #75
/*     */     //   1200: aload #70
/*     */     //   1202: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1205: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1208: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1211: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1214: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1217: astore #77
/*     */     //   1219: iconst_0
/*     */     //   1220: istore #78
/*     */     //   1222: aload #75
/*     */     //   1224: astore #79
/*     */     //   1226: iconst_0
/*     */     //   1227: istore #80
/*     */     //   1229: aload #79
/*     */     //   1231: invokeinterface getInserting : ()Z
/*     */     //   1236: ifne -> 1257
/*     */     //   1239: aload #79
/*     */     //   1241: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1246: iload #69
/*     */     //   1248: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1251: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1254: ifne -> 1283
/*     */     //   1257: aload #79
/*     */     //   1259: iload #69
/*     */     //   1261: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1264: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1269: aload #75
/*     */     //   1271: iload #69
/*     */     //   1273: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1276: aload #77
/*     */     //   1278: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1283: nop
/*     */     //   1284: nop
/*     */     //   1285: nop
/*     */     //   1286: aload #75
/*     */     //   1288: aload #71
/*     */     //   1290: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1293: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1296: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1299: nop
/*     */     //   1300: nop
/*     */     //   1301: aload #58
/*     */     //   1303: bipush #14
/*     */     //   1305: iload #73
/*     */     //   1307: bipush #6
/*     */     //   1309: ishr
/*     */     //   1310: iand
/*     */     //   1311: istore #81
/*     */     //   1313: astore #82
/*     */     //   1315: iconst_0
/*     */     //   1316: istore #83
/*     */     //   1318: aload #82
/*     */     //   1320: ldc_w -407840262
/*     */     //   1323: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1326: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1329: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1332: aload #82
/*     */     //   1334: bipush #6
/*     */     //   1336: bipush #112
/*     */     //   1338: iload #61
/*     */     //   1340: bipush #6
/*     */     //   1342: ishr
/*     */     //   1343: iand
/*     */     //   1344: ior
/*     */     //   1345: istore #84
/*     */     //   1347: astore #85
/*     */     //   1349: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1352: astore #86
/*     */     //   1354: iconst_0
/*     */     //   1355: istore #87
/*     */     //   1357: aload_0
/*     */     //   1358: invokevirtual getFilterLLMEvents : ()Landroidx/compose/runtime/MutableState;
/*     */     //   1361: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1366: checkcast java/lang/Boolean
/*     */     //   1369: invokevirtual booleanValue : ()Z
/*     */     //   1372: aload #85
/*     */     //   1374: ldc_w 1926727850
/*     */     //   1377: invokeinterface startReplaceGroup : (I)V
/*     */     //   1382: aload #85
/*     */     //   1384: astore #88
/*     */     //   1386: aload_1
/*     */     //   1387: aload_0
/*     */     //   1388: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1393: istore #89
/*     */     //   1395: nop
/*     */     //   1396: iconst_0
/*     */     //   1397: istore #90
/*     */     //   1399: aload #88
/*     */     //   1401: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1406: astore #91
/*     */     //   1408: iconst_0
/*     */     //   1409: istore #92
/*     */     //   1411: iload #89
/*     */     //   1413: ifne -> 1427
/*     */     //   1416: aload #91
/*     */     //   1418: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1421: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1424: if_acmpne -> 1460
/*     */     //   1427: istore #93
/*     */     //   1429: iconst_0
/*     */     //   1430: istore #94
/*     */     //   1432: aload_0
/*     */     //   1433: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;)Lkotlin/jvm/functions/Function1;
/*     */     //   1438: astore #95
/*     */     //   1440: iload #93
/*     */     //   1442: aload #95
/*     */     //   1444: astore #96
/*     */     //   1446: aload #88
/*     */     //   1448: aload #96
/*     */     //   1450: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1455: aload #96
/*     */     //   1457: goto -> 1462
/*     */     //   1460: aload #91
/*     */     //   1462: nop
/*     */     //   1463: nop
/*     */     //   1464: nop
/*     */     //   1465: checkcast kotlin/jvm/functions/Function1
/*     */     //   1468: astore #97
/*     */     //   1470: aload #85
/*     */     //   1472: invokeinterface endReplaceGroup : ()V
/*     */     //   1477: aload #97
/*     */     //   1479: aconst_null
/*     */     //   1480: iconst_0
/*     */     //   1481: aconst_null
/*     */     //   1482: aconst_null
/*     */     //   1483: aconst_null
/*     */     //   1484: aconst_null
/*     */     //   1485: aconst_null
/*     */     //   1486: aconst_null
/*     */     //   1487: aconst_null
/*     */     //   1488: aload #85
/*     */     //   1490: iconst_0
/*     */     //   1491: iconst_0
/*     */     //   1492: sipush #2044
/*     */     //   1495: invokestatic Checkbox : (ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1498: ldc_w 'Show LLM Events'
/*     */     //   1501: aconst_null
/*     */     //   1502: lconst_0
/*     */     //   1503: lconst_0
/*     */     //   1504: aconst_null
/*     */     //   1505: aconst_null
/*     */     //   1506: aconst_null
/*     */     //   1507: lconst_0
/*     */     //   1508: aconst_null
/*     */     //   1509: iconst_0
/*     */     //   1510: lconst_0
/*     */     //   1511: iconst_0
/*     */     //   1512: iconst_0
/*     */     //   1513: iconst_0
/*     */     //   1514: aconst_null
/*     */     //   1515: aconst_null
/*     */     //   1516: aload #85
/*     */     //   1518: bipush #6
/*     */     //   1520: iconst_0
/*     */     //   1521: ldc_w 65534
/*     */     //   1524: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1527: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1530: checkcast androidx/compose/ui/Modifier
/*     */     //   1533: bipush #8
/*     */     //   1535: istore #97
/*     */     //   1537: iconst_0
/*     */     //   1538: istore #88
/*     */     //   1540: iload #97
/*     */     //   1542: i2f
/*     */     //   1543: invokestatic constructor-impl : (F)F
/*     */     //   1546: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1549: aload #85
/*     */     //   1551: bipush #6
/*     */     //   1553: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1556: aload_0
/*     */     //   1557: invokevirtual getFilterArtifactEvents : ()Landroidx/compose/runtime/MutableState;
/*     */     //   1560: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1565: checkcast java/lang/Boolean
/*     */     //   1568: invokevirtual booleanValue : ()Z
/*     */     //   1571: aload #85
/*     */     //   1573: ldc_w 1926737455
/*     */     //   1576: invokeinterface startReplaceGroup : (I)V
/*     */     //   1581: aload #85
/*     */     //   1583: astore #88
/*     */     //   1585: aload_1
/*     */     //   1586: aload_0
/*     */     //   1587: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1592: istore #89
/*     */     //   1594: nop
/*     */     //   1595: iconst_0
/*     */     //   1596: istore #90
/*     */     //   1598: aload #88
/*     */     //   1600: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1605: astore #91
/*     */     //   1607: iconst_0
/*     */     //   1608: istore #92
/*     */     //   1610: iload #89
/*     */     //   1612: ifne -> 1626
/*     */     //   1615: aload #91
/*     */     //   1617: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1620: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1623: if_acmpne -> 1659
/*     */     //   1626: istore #93
/*     */     //   1628: iconst_0
/*     */     //   1629: istore #94
/*     */     //   1631: aload_0
/*     */     //   1632: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;)Lkotlin/jvm/functions/Function1;
/*     */     //   1637: astore #95
/*     */     //   1639: iload #93
/*     */     //   1641: aload #95
/*     */     //   1643: astore #96
/*     */     //   1645: aload #88
/*     */     //   1647: aload #96
/*     */     //   1649: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1654: aload #96
/*     */     //   1656: goto -> 1661
/*     */     //   1659: aload #91
/*     */     //   1661: nop
/*     */     //   1662: nop
/*     */     //   1663: nop
/*     */     //   1664: checkcast kotlin/jvm/functions/Function1
/*     */     //   1667: astore #97
/*     */     //   1669: aload #85
/*     */     //   1671: invokeinterface endReplaceGroup : ()V
/*     */     //   1676: aload #97
/*     */     //   1678: aconst_null
/*     */     //   1679: iconst_0
/*     */     //   1680: aconst_null
/*     */     //   1681: aconst_null
/*     */     //   1682: aconst_null
/*     */     //   1683: aconst_null
/*     */     //   1684: aconst_null
/*     */     //   1685: aconst_null
/*     */     //   1686: aconst_null
/*     */     //   1687: aload #85
/*     */     //   1689: iconst_0
/*     */     //   1690: iconst_0
/*     */     //   1691: sipush #2044
/*     */     //   1694: invokestatic Checkbox : (ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1697: ldc_w 'Show Artifact Events'
/*     */     //   1700: aconst_null
/*     */     //   1701: lconst_0
/*     */     //   1702: lconst_0
/*     */     //   1703: aconst_null
/*     */     //   1704: aconst_null
/*     */     //   1705: aconst_null
/*     */     //   1706: lconst_0
/*     */     //   1707: aconst_null
/*     */     //   1708: iconst_0
/*     */     //   1709: lconst_0
/*     */     //   1710: iconst_0
/*     */     //   1711: iconst_0
/*     */     //   1712: iconst_0
/*     */     //   1713: aconst_null
/*     */     //   1714: aconst_null
/*     */     //   1715: aload #85
/*     */     //   1717: bipush #6
/*     */     //   1719: iconst_0
/*     */     //   1720: ldc_w 65534
/*     */     //   1723: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1726: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1729: checkcast androidx/compose/ui/Modifier
/*     */     //   1732: bipush #8
/*     */     //   1734: istore #97
/*     */     //   1736: iconst_0
/*     */     //   1737: istore #88
/*     */     //   1739: iload #97
/*     */     //   1741: i2f
/*     */     //   1742: invokestatic constructor-impl : (F)F
/*     */     //   1745: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1748: aload #85
/*     */     //   1750: bipush #6
/*     */     //   1752: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1755: aload_0
/*     */     //   1756: invokevirtual getFilterStepEvents : ()Landroidx/compose/runtime/MutableState;
/*     */     //   1759: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1764: checkcast java/lang/Boolean
/*     */     //   1767: invokevirtual booleanValue : ()Z
/*     */     //   1770: aload #85
/*     */     //   1772: ldc_w 1926747243
/*     */     //   1775: invokeinterface startReplaceGroup : (I)V
/*     */     //   1780: aload #85
/*     */     //   1782: astore #88
/*     */     //   1784: aload_1
/*     */     //   1785: aload_0
/*     */     //   1786: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1791: istore #89
/*     */     //   1793: nop
/*     */     //   1794: iconst_0
/*     */     //   1795: istore #90
/*     */     //   1797: aload #88
/*     */     //   1799: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1804: astore #91
/*     */     //   1806: iconst_0
/*     */     //   1807: istore #92
/*     */     //   1809: iload #89
/*     */     //   1811: ifne -> 1825
/*     */     //   1814: aload #91
/*     */     //   1816: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1819: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1822: if_acmpne -> 1858
/*     */     //   1825: istore #93
/*     */     //   1827: iconst_0
/*     */     //   1828: istore #94
/*     */     //   1830: aload_0
/*     */     //   1831: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;)Lkotlin/jvm/functions/Function1;
/*     */     //   1836: astore #95
/*     */     //   1838: iload #93
/*     */     //   1840: aload #95
/*     */     //   1842: astore #96
/*     */     //   1844: aload #88
/*     */     //   1846: aload #96
/*     */     //   1848: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1853: aload #96
/*     */     //   1855: goto -> 1860
/*     */     //   1858: aload #91
/*     */     //   1860: nop
/*     */     //   1861: nop
/*     */     //   1862: nop
/*     */     //   1863: checkcast kotlin/jvm/functions/Function1
/*     */     //   1866: astore #97
/*     */     //   1868: aload #85
/*     */     //   1870: invokeinterface endReplaceGroup : ()V
/*     */     //   1875: aload #97
/*     */     //   1877: aconst_null
/*     */     //   1878: iconst_0
/*     */     //   1879: aconst_null
/*     */     //   1880: aconst_null
/*     */     //   1881: aconst_null
/*     */     //   1882: aconst_null
/*     */     //   1883: aconst_null
/*     */     //   1884: aconst_null
/*     */     //   1885: aconst_null
/*     */     //   1886: aload #85
/*     */     //   1888: iconst_0
/*     */     //   1889: iconst_0
/*     */     //   1890: sipush #2044
/*     */     //   1893: invokestatic Checkbox : (ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1896: ldc_w 'Show Step Events'
/*     */     //   1899: aconst_null
/*     */     //   1900: lconst_0
/*     */     //   1901: lconst_0
/*     */     //   1902: aconst_null
/*     */     //   1903: aconst_null
/*     */     //   1904: aconst_null
/*     */     //   1905: lconst_0
/*     */     //   1906: aconst_null
/*     */     //   1907: iconst_0
/*     */     //   1908: lconst_0
/*     */     //   1909: iconst_0
/*     */     //   1910: iconst_0
/*     */     //   1911: iconst_0
/*     */     //   1912: aconst_null
/*     */     //   1913: aconst_null
/*     */     //   1914: aload #85
/*     */     //   1916: bipush #6
/*     */     //   1918: iconst_0
/*     */     //   1919: ldc_w 65534
/*     */     //   1922: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1925: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1928: checkcast androidx/compose/ui/Modifier
/*     */     //   1931: bipush #8
/*     */     //   1933: istore #97
/*     */     //   1935: iconst_0
/*     */     //   1936: istore #88
/*     */     //   1938: iload #97
/*     */     //   1940: i2f
/*     */     //   1941: invokestatic constructor-impl : (F)F
/*     */     //   1944: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1947: aload #85
/*     */     //   1949: bipush #6
/*     */     //   1951: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1954: aload_0
/*     */     //   1955: invokevirtual getFilterOtherEvents : ()Landroidx/compose/runtime/MutableState;
/*     */     //   1958: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1963: checkcast java/lang/Boolean
/*     */     //   1966: invokevirtual booleanValue : ()Z
/*     */     //   1969: aload #85
/*     */     //   1971: ldc_w 1926756812
/*     */     //   1974: invokeinterface startReplaceGroup : (I)V
/*     */     //   1979: aload #85
/*     */     //   1981: astore #88
/*     */     //   1983: aload_1
/*     */     //   1984: aload_0
/*     */     //   1985: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1990: istore #89
/*     */     //   1992: nop
/*     */     //   1993: iconst_0
/*     */     //   1994: istore #90
/*     */     //   1996: aload #88
/*     */     //   1998: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2003: astore #91
/*     */     //   2005: iconst_0
/*     */     //   2006: istore #92
/*     */     //   2008: iload #89
/*     */     //   2010: ifne -> 2024
/*     */     //   2013: aload #91
/*     */     //   2015: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2018: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2021: if_acmpne -> 2057
/*     */     //   2024: istore #93
/*     */     //   2026: iconst_0
/*     */     //   2027: istore #94
/*     */     //   2029: aload_0
/*     */     //   2030: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;)Lkotlin/jvm/functions/Function1;
/*     */     //   2035: astore #95
/*     */     //   2037: iload #93
/*     */     //   2039: aload #95
/*     */     //   2041: astore #96
/*     */     //   2043: aload #88
/*     */     //   2045: aload #96
/*     */     //   2047: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2052: aload #96
/*     */     //   2054: goto -> 2059
/*     */     //   2057: aload #91
/*     */     //   2059: nop
/*     */     //   2060: nop
/*     */     //   2061: nop
/*     */     //   2062: checkcast kotlin/jvm/functions/Function1
/*     */     //   2065: astore #97
/*     */     //   2067: aload #85
/*     */     //   2069: invokeinterface endReplaceGroup : ()V
/*     */     //   2074: aload #97
/*     */     //   2076: aconst_null
/*     */     //   2077: iconst_0
/*     */     //   2078: aconst_null
/*     */     //   2079: aconst_null
/*     */     //   2080: aconst_null
/*     */     //   2081: aconst_null
/*     */     //   2082: aconst_null
/*     */     //   2083: aconst_null
/*     */     //   2084: aconst_null
/*     */     //   2085: aload #85
/*     */     //   2087: iconst_0
/*     */     //   2088: iconst_0
/*     */     //   2089: sipush #2044
/*     */     //   2092: invokestatic Checkbox : (ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2095: ldc_w 'Show Other Events'
/*     */     //   2098: aconst_null
/*     */     //   2099: lconst_0
/*     */     //   2100: lconst_0
/*     */     //   2101: aconst_null
/*     */     //   2102: aconst_null
/*     */     //   2103: aconst_null
/*     */     //   2104: lconst_0
/*     */     //   2105: aconst_null
/*     */     //   2106: iconst_0
/*     */     //   2107: lconst_0
/*     */     //   2108: iconst_0
/*     */     //   2109: iconst_0
/*     */     //   2110: iconst_0
/*     */     //   2111: aconst_null
/*     */     //   2112: aconst_null
/*     */     //   2113: aload #85
/*     */     //   2115: bipush #6
/*     */     //   2117: iconst_0
/*     */     //   2118: ldc_w 65534
/*     */     //   2121: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2124: nop
/*     */     //   2125: aload #82
/*     */     //   2127: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2130: aload #58
/*     */     //   2132: invokeinterface endNode : ()V
/*     */     //   2137: aload #58
/*     */     //   2139: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2142: nop
/*     */     //   2143: aload #58
/*     */     //   2145: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2148: nop
/*     */     //   2149: aload #58
/*     */     //   2151: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2154: nop
/*     */     //   2155: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2158: checkcast androidx/compose/ui/Modifier
/*     */     //   2161: bipush #8
/*     */     //   2163: istore #63
/*     */     //   2165: iconst_0
/*     */     //   2166: istore #64
/*     */     //   2168: iload #63
/*     */     //   2170: i2f
/*     */     //   2171: invokestatic constructor-impl : (F)F
/*     */     //   2174: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2177: aload #58
/*     */     //   2179: bipush #6
/*     */     //   2181: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2184: aload #59
/*     */     //   2186: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2189: checkcast androidx/compose/ui/Modifier
/*     */     //   2192: fconst_1
/*     */     //   2193: iconst_0
/*     */     //   2194: iconst_2
/*     */     //   2195: aconst_null
/*     */     //   2196: invokestatic weight$default : (Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2199: astore #63
/*     */     //   2201: iconst_0
/*     */     //   2202: istore #61
/*     */     //   2204: iconst_0
/*     */     //   2205: istore #62
/*     */     //   2207: aload #58
/*     */     //   2209: ldc_w 733328855
/*     */     //   2212: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   2215: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2218: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2221: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   2224: astore #64
/*     */     //   2226: iconst_0
/*     */     //   2227: istore #65
/*     */     //   2229: aload #64
/*     */     //   2231: iload #65
/*     */     //   2233: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2236: astore #66
/*     */     //   2238: bipush #112
/*     */     //   2240: iload #61
/*     */     //   2242: iconst_3
/*     */     //   2243: ishl
/*     */     //   2244: iand
/*     */     //   2245: istore #67
/*     */     //   2247: nop
/*     */     //   2248: iconst_0
/*     */     //   2249: istore #68
/*     */     //   2251: aload #58
/*     */     //   2253: ldc_w -1323940314
/*     */     //   2256: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2259: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2262: aload #58
/*     */     //   2264: iconst_0
/*     */     //   2265: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2268: istore #69
/*     */     //   2270: aload #58
/*     */     //   2272: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2277: astore #70
/*     */     //   2279: aload #58
/*     */     //   2281: aload #63
/*     */     //   2283: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2286: astore #71
/*     */     //   2288: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2291: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2294: astore #72
/*     */     //   2296: bipush #6
/*     */     //   2298: sipush #896
/*     */     //   2301: iload #67
/*     */     //   2303: bipush #6
/*     */     //   2305: ishl
/*     */     //   2306: iand
/*     */     //   2307: ior
/*     */     //   2308: istore #73
/*     */     //   2310: nop
/*     */     //   2311: iconst_0
/*     */     //   2312: istore #74
/*     */     //   2314: aload #58
/*     */     //   2316: ldc_w -692256719
/*     */     //   2319: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2322: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2325: aload #58
/*     */     //   2327: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2332: instanceof androidx/compose/runtime/Applier
/*     */     //   2335: ifne -> 2341
/*     */     //   2338: invokestatic invalidApplier : ()V
/*     */     //   2341: aload #58
/*     */     //   2343: invokeinterface startReusableNode : ()V
/*     */     //   2348: aload #58
/*     */     //   2350: invokeinterface getInserting : ()Z
/*     */     //   2355: ifeq -> 2370
/*     */     //   2358: aload #58
/*     */     //   2360: aload #72
/*     */     //   2362: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2367: goto -> 2377
/*     */     //   2370: aload #58
/*     */     //   2372: invokeinterface useNode : ()V
/*     */     //   2377: aload #58
/*     */     //   2379: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2382: astore #75
/*     */     //   2384: iconst_0
/*     */     //   2385: istore #76
/*     */     //   2387: aload #75
/*     */     //   2389: aload #66
/*     */     //   2391: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2394: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2397: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2400: aload #75
/*     */     //   2402: aload #70
/*     */     //   2404: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2407: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2410: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2413: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2416: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2419: astore #77
/*     */     //   2421: iconst_0
/*     */     //   2422: istore #78
/*     */     //   2424: aload #75
/*     */     //   2426: astore #79
/*     */     //   2428: iconst_0
/*     */     //   2429: istore #80
/*     */     //   2431: aload #79
/*     */     //   2433: invokeinterface getInserting : ()Z
/*     */     //   2438: ifne -> 2459
/*     */     //   2441: aload #79
/*     */     //   2443: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2448: iload #69
/*     */     //   2450: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2453: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2456: ifne -> 2485
/*     */     //   2459: aload #79
/*     */     //   2461: iload #69
/*     */     //   2463: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2466: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2471: aload #75
/*     */     //   2473: iload #69
/*     */     //   2475: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2478: aload #77
/*     */     //   2480: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2485: nop
/*     */     //   2486: nop
/*     */     //   2487: nop
/*     */     //   2488: aload #75
/*     */     //   2490: aload #71
/*     */     //   2492: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2495: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2498: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2501: nop
/*     */     //   2502: nop
/*     */     //   2503: aload #58
/*     */     //   2505: bipush #14
/*     */     //   2507: iload #73
/*     */     //   2509: bipush #6
/*     */     //   2511: ishr
/*     */     //   2512: iand
/*     */     //   2513: istore #81
/*     */     //   2515: astore #82
/*     */     //   2517: iconst_0
/*     */     //   2518: istore #83
/*     */     //   2520: aload #82
/*     */     //   2522: ldc_w -2146769399
/*     */     //   2525: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   2528: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2531: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   2534: aload #82
/*     */     //   2536: bipush #6
/*     */     //   2538: bipush #112
/*     */     //   2540: iload #61
/*     */     //   2542: bipush #6
/*     */     //   2544: ishr
/*     */     //   2545: iand
/*     */     //   2546: ior
/*     */     //   2547: istore #84
/*     */     //   2549: astore #85
/*     */     //   2551: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   2554: astore #86
/*     */     //   2556: iconst_0
/*     */     //   2557: istore #87
/*     */     //   2559: aload #4
/*     */     //   2561: invokestatic EventLogScreen$lambda$0 : (Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   2564: invokevirtual isEmpty : ()Z
/*     */     //   2567: ifeq -> 2619
/*     */     //   2570: aload #85
/*     */     //   2572: ldc_w -399781138
/*     */     //   2575: invokeinterface startReplaceGroup : (I)V
/*     */     //   2580: ldc_w 'No events recorded.'
/*     */     //   2583: aconst_null
/*     */     //   2584: lconst_0
/*     */     //   2585: lconst_0
/*     */     //   2586: aconst_null
/*     */     //   2587: aconst_null
/*     */     //   2588: aconst_null
/*     */     //   2589: lconst_0
/*     */     //   2590: aconst_null
/*     */     //   2591: iconst_0
/*     */     //   2592: lconst_0
/*     */     //   2593: iconst_0
/*     */     //   2594: iconst_0
/*     */     //   2595: iconst_0
/*     */     //   2596: aconst_null
/*     */     //   2597: aconst_null
/*     */     //   2598: aload #85
/*     */     //   2600: bipush #6
/*     */     //   2602: iconst_0
/*     */     //   2603: ldc_w 65534
/*     */     //   2606: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2609: aload #85
/*     */     //   2611: invokeinterface endReplaceGroup : ()V
/*     */     //   2616: goto -> 2767
/*     */     //   2619: aload #85
/*     */     //   2621: ldc_w -399722548
/*     */     //   2624: invokeinterface startReplaceGroup : (I)V
/*     */     //   2629: aload #4
/*     */     //   2631: invokestatic EventLogScreen$lambda$0 : (Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   2634: checkcast java/util/List
/*     */     //   2637: iconst_0
/*     */     //   2638: aload #85
/*     */     //   2640: ldc_w 1926770911
/*     */     //   2643: invokeinterface startReplaceGroup : (I)V
/*     */     //   2648: aload #85
/*     */     //   2650: astore #88
/*     */     //   2652: aload_1
/*     */     //   2653: aload_0
/*     */     //   2654: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2659: istore #89
/*     */     //   2661: nop
/*     */     //   2662: iconst_0
/*     */     //   2663: istore #90
/*     */     //   2665: aload #88
/*     */     //   2667: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2672: astore #91
/*     */     //   2674: iconst_0
/*     */     //   2675: istore #92
/*     */     //   2677: iload #89
/*     */     //   2679: ifne -> 2693
/*     */     //   2682: aload #91
/*     */     //   2684: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2687: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2690: if_acmpne -> 2730
/*     */     //   2693: istore #93
/*     */     //   2695: astore #94
/*     */     //   2697: iconst_0
/*     */     //   2698: istore #95
/*     */     //   2700: aload_0
/*     */     //   2701: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;)Lkotlin/jvm/functions/Function1;
/*     */     //   2706: astore #96
/*     */     //   2708: aload #94
/*     */     //   2710: iload #93
/*     */     //   2712: aload #96
/*     */     //   2714: astore #97
/*     */     //   2716: aload #88
/*     */     //   2718: aload #97
/*     */     //   2720: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2725: aload #97
/*     */     //   2727: goto -> 2732
/*     */     //   2730: aload #91
/*     */     //   2732: nop
/*     */     //   2733: nop
/*     */     //   2734: nop
/*     */     //   2735: checkcast kotlin/jvm/functions/Function1
/*     */     //   2738: astore #98
/*     */     //   2740: aload #85
/*     */     //   2742: invokeinterface endReplaceGroup : ()V
/*     */     //   2747: aload #98
/*     */     //   2749: aload #6
/*     */     //   2751: aload #85
/*     */     //   2753: sipush #3072
/*     */     //   2756: iconst_2
/*     */     //   2757: invokestatic EventTreeView : (Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2760: aload #85
/*     */     //   2762: invokeinterface endReplaceGroup : ()V
/*     */     //   2767: nop
/*     */     //   2768: aload #82
/*     */     //   2770: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2773: aload #58
/*     */     //   2775: invokeinterface endNode : ()V
/*     */     //   2780: aload #58
/*     */     //   2782: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2785: nop
/*     */     //   2786: aload #58
/*     */     //   2788: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2791: nop
/*     */     //   2792: aload #58
/*     */     //   2794: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2797: nop
/*     */     //   2798: nop
/*     */     //   2799: aload #55
/*     */     //   2801: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2804: aload #31
/*     */     //   2806: invokeinterface endNode : ()V
/*     */     //   2811: aload #31
/*     */     //   2813: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2816: nop
/*     */     //   2817: aload #31
/*     */     //   2819: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2822: nop
/*     */     //   2823: aload #31
/*     */     //   2825: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2828: nop
/*     */     //   2829: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2832: checkcast androidx/compose/ui/Modifier
/*     */     //   2835: bipush #8
/*     */     //   2837: istore #34
/*     */     //   2839: iconst_0
/*     */     //   2840: istore #37
/*     */     //   2842: iload #34
/*     */     //   2844: i2f
/*     */     //   2845: invokestatic constructor-impl : (F)F
/*     */     //   2848: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2851: aload #31
/*     */     //   2853: bipush #6
/*     */     //   2855: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2858: aload #32
/*     */     //   2860: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2863: checkcast androidx/compose/ui/Modifier
/*     */     //   2866: fconst_1
/*     */     //   2867: iconst_0
/*     */     //   2868: iconst_2
/*     */     //   2869: aconst_null
/*     */     //   2870: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2873: iconst_0
/*     */     //   2874: aload #31
/*     */     //   2876: iconst_0
/*     */     //   2877: iconst_1
/*     */     //   2878: invokestatic rememberScrollState : (ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;
/*     */     //   2881: iconst_0
/*     */     //   2882: aconst_null
/*     */     //   2883: iconst_0
/*     */     //   2884: bipush #14
/*     */     //   2886: aconst_null
/*     */     //   2887: invokestatic verticalScroll$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2890: astore #34
/*     */     //   2892: iconst_0
/*     */     //   2893: istore #35
/*     */     //   2895: iconst_0
/*     */     //   2896: istore #36
/*     */     //   2898: aload #31
/*     */     //   2900: ldc_w 733328855
/*     */     //   2903: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   2906: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2909: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2912: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   2915: astore #37
/*     */     //   2917: iconst_0
/*     */     //   2918: istore #38
/*     */     //   2920: aload #37
/*     */     //   2922: iload #38
/*     */     //   2924: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2927: astore #39
/*     */     //   2929: bipush #112
/*     */     //   2931: iload #35
/*     */     //   2933: iconst_3
/*     */     //   2934: ishl
/*     */     //   2935: iand
/*     */     //   2936: istore #40
/*     */     //   2938: nop
/*     */     //   2939: iconst_0
/*     */     //   2940: istore #41
/*     */     //   2942: aload #31
/*     */     //   2944: ldc_w -1323940314
/*     */     //   2947: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2950: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2953: aload #31
/*     */     //   2955: iconst_0
/*     */     //   2956: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2959: istore #42
/*     */     //   2961: aload #31
/*     */     //   2963: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2968: astore #43
/*     */     //   2970: aload #31
/*     */     //   2972: aload #34
/*     */     //   2974: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2977: astore #44
/*     */     //   2979: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2982: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2985: astore #45
/*     */     //   2987: bipush #6
/*     */     //   2989: sipush #896
/*     */     //   2992: iload #40
/*     */     //   2994: bipush #6
/*     */     //   2996: ishl
/*     */     //   2997: iand
/*     */     //   2998: ior
/*     */     //   2999: istore #46
/*     */     //   3001: nop
/*     */     //   3002: iconst_0
/*     */     //   3003: istore #47
/*     */     //   3005: aload #31
/*     */     //   3007: ldc_w -692256719
/*     */     //   3010: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   3013: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3016: aload #31
/*     */     //   3018: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   3023: instanceof androidx/compose/runtime/Applier
/*     */     //   3026: ifne -> 3032
/*     */     //   3029: invokestatic invalidApplier : ()V
/*     */     //   3032: aload #31
/*     */     //   3034: invokeinterface startReusableNode : ()V
/*     */     //   3039: aload #31
/*     */     //   3041: invokeinterface getInserting : ()Z
/*     */     //   3046: ifeq -> 3061
/*     */     //   3049: aload #31
/*     */     //   3051: aload #45
/*     */     //   3053: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   3058: goto -> 3068
/*     */     //   3061: aload #31
/*     */     //   3063: invokeinterface useNode : ()V
/*     */     //   3068: aload #31
/*     */     //   3070: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   3073: astore #48
/*     */     //   3075: iconst_0
/*     */     //   3076: istore #49
/*     */     //   3078: aload #48
/*     */     //   3080: aload #39
/*     */     //   3082: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3085: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3088: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3091: aload #48
/*     */     //   3093: aload #43
/*     */     //   3095: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3098: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3101: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3104: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3107: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3110: astore #50
/*     */     //   3112: iconst_0
/*     */     //   3113: istore #51
/*     */     //   3115: aload #48
/*     */     //   3117: astore #52
/*     */     //   3119: iconst_0
/*     */     //   3120: istore #53
/*     */     //   3122: aload #52
/*     */     //   3124: invokeinterface getInserting : ()Z
/*     */     //   3129: ifne -> 3150
/*     */     //   3132: aload #52
/*     */     //   3134: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3139: iload #42
/*     */     //   3141: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3144: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   3147: ifne -> 3176
/*     */     //   3150: aload #52
/*     */     //   3152: iload #42
/*     */     //   3154: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3157: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3162: aload #48
/*     */     //   3164: iload #42
/*     */     //   3166: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3169: aload #50
/*     */     //   3171: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3176: nop
/*     */     //   3177: nop
/*     */     //   3178: nop
/*     */     //   3179: aload #48
/*     */     //   3181: aload #44
/*     */     //   3183: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3186: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3189: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3192: nop
/*     */     //   3193: nop
/*     */     //   3194: aload #31
/*     */     //   3196: bipush #14
/*     */     //   3198: iload #46
/*     */     //   3200: bipush #6
/*     */     //   3202: ishr
/*     */     //   3203: iand
/*     */     //   3204: istore #54
/*     */     //   3206: astore #55
/*     */     //   3208: iconst_0
/*     */     //   3209: istore #56
/*     */     //   3211: aload #55
/*     */     //   3213: ldc_w -2146769399
/*     */     //   3216: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   3219: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3222: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   3225: aload #55
/*     */     //   3227: bipush #6
/*     */     //   3229: bipush #112
/*     */     //   3231: iload #35
/*     */     //   3233: bipush #6
/*     */     //   3235: ishr
/*     */     //   3236: iand
/*     */     //   3237: ior
/*     */     //   3238: istore #57
/*     */     //   3240: astore #58
/*     */     //   3242: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   3245: astore #59
/*     */     //   3247: iconst_0
/*     */     //   3248: istore #60
/*     */     //   3250: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   3253: bipush #8
/*     */     //   3255: istore #61
/*     */     //   3257: iconst_0
/*     */     //   3258: istore #62
/*     */     //   3260: iload #61
/*     */     //   3262: i2f
/*     */     //   3263: invokestatic constructor-impl : (F)F
/*     */     //   3266: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   3269: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   3272: astore #61
/*     */     //   3274: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   3277: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   3280: astore #62
/*     */     //   3282: sipush #432
/*     */     //   3285: istore #63
/*     */     //   3287: nop
/*     */     //   3288: iconst_0
/*     */     //   3289: istore #64
/*     */     //   3291: aload #58
/*     */     //   3293: ldc_w -483455358
/*     */     //   3296: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   3299: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3302: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   3305: checkcast androidx/compose/ui/Modifier
/*     */     //   3308: astore #65
/*     */     //   3310: aload #61
/*     */     //   3312: aload #62
/*     */     //   3314: aload #58
/*     */     //   3316: bipush #14
/*     */     //   3318: iload #63
/*     */     //   3320: iconst_3
/*     */     //   3321: ishr
/*     */     //   3322: iand
/*     */     //   3323: bipush #112
/*     */     //   3325: iload #63
/*     */     //   3327: iconst_3
/*     */     //   3328: ishr
/*     */     //   3329: iand
/*     */     //   3330: ior
/*     */     //   3331: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3334: astore #66
/*     */     //   3336: bipush #112
/*     */     //   3338: iload #63
/*     */     //   3340: iconst_3
/*     */     //   3341: ishl
/*     */     //   3342: iand
/*     */     //   3343: istore #67
/*     */     //   3345: nop
/*     */     //   3346: iconst_0
/*     */     //   3347: istore #68
/*     */     //   3349: aload #58
/*     */     //   3351: ldc_w -1323940314
/*     */     //   3354: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   3357: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3360: aload #58
/*     */     //   3362: iconst_0
/*     */     //   3363: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   3366: istore #69
/*     */     //   3368: aload #58
/*     */     //   3370: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3375: astore #70
/*     */     //   3377: aload #58
/*     */     //   3379: aload #65
/*     */     //   3381: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   3384: astore #71
/*     */     //   3386: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3389: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   3392: astore #72
/*     */     //   3394: bipush #6
/*     */     //   3396: sipush #896
/*     */     //   3399: iload #67
/*     */     //   3401: bipush #6
/*     */     //   3403: ishl
/*     */     //   3404: iand
/*     */     //   3405: ior
/*     */     //   3406: istore #73
/*     */     //   3408: nop
/*     */     //   3409: iconst_0
/*     */     //   3410: istore #74
/*     */     //   3412: aload #58
/*     */     //   3414: ldc_w -692256719
/*     */     //   3417: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   3420: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3423: aload #58
/*     */     //   3425: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   3430: instanceof androidx/compose/runtime/Applier
/*     */     //   3433: ifne -> 3439
/*     */     //   3436: invokestatic invalidApplier : ()V
/*     */     //   3439: aload #58
/*     */     //   3441: invokeinterface startReusableNode : ()V
/*     */     //   3446: aload #58
/*     */     //   3448: invokeinterface getInserting : ()Z
/*     */     //   3453: ifeq -> 3468
/*     */     //   3456: aload #58
/*     */     //   3458: aload #72
/*     */     //   3460: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   3465: goto -> 3475
/*     */     //   3468: aload #58
/*     */     //   3470: invokeinterface useNode : ()V
/*     */     //   3475: aload #58
/*     */     //   3477: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   3480: astore #75
/*     */     //   3482: iconst_0
/*     */     //   3483: istore #76
/*     */     //   3485: aload #75
/*     */     //   3487: aload #66
/*     */     //   3489: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3492: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3495: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3498: aload #75
/*     */     //   3500: aload #70
/*     */     //   3502: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3505: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3508: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3511: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3514: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3517: astore #77
/*     */     //   3519: iconst_0
/*     */     //   3520: istore #78
/*     */     //   3522: aload #75
/*     */     //   3524: astore #79
/*     */     //   3526: iconst_0
/*     */     //   3527: istore #80
/*     */     //   3529: aload #79
/*     */     //   3531: invokeinterface getInserting : ()Z
/*     */     //   3536: ifne -> 3557
/*     */     //   3539: aload #79
/*     */     //   3541: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3546: iload #69
/*     */     //   3548: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3551: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   3554: ifne -> 3583
/*     */     //   3557: aload #79
/*     */     //   3559: iload #69
/*     */     //   3561: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3564: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3569: aload #75
/*     */     //   3571: iload #69
/*     */     //   3573: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3576: aload #77
/*     */     //   3578: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3583: nop
/*     */     //   3584: nop
/*     */     //   3585: nop
/*     */     //   3586: aload #75
/*     */     //   3588: aload #71
/*     */     //   3590: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3593: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3596: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3599: nop
/*     */     //   3600: nop
/*     */     //   3601: aload #58
/*     */     //   3603: bipush #14
/*     */     //   3605: iload #73
/*     */     //   3607: bipush #6
/*     */     //   3609: ishr
/*     */     //   3610: iand
/*     */     //   3611: istore #81
/*     */     //   3613: astore #82
/*     */     //   3615: iconst_0
/*     */     //   3616: istore #83
/*     */     //   3618: aload #82
/*     */     //   3620: ldc_w -384784025
/*     */     //   3623: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   3626: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3629: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   3632: aload #82
/*     */     //   3634: bipush #6
/*     */     //   3636: bipush #112
/*     */     //   3638: iload #63
/*     */     //   3640: bipush #6
/*     */     //   3642: ishr
/*     */     //   3643: iand
/*     */     //   3644: ior
/*     */     //   3645: istore #84
/*     */     //   3647: astore #85
/*     */     //   3649: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   3652: astore #86
/*     */     //   3654: iconst_0
/*     */     //   3655: istore #87
/*     */     //   3657: aload #85
/*     */     //   3659: ldc_w 1926784251
/*     */     //   3662: invokeinterface startReplaceGroup : (I)V
/*     */     //   3667: aload #85
/*     */     //   3669: astore #88
/*     */     //   3671: aload_1
/*     */     //   3672: aload_0
/*     */     //   3673: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   3678: istore #89
/*     */     //   3680: nop
/*     */     //   3681: iconst_0
/*     */     //   3682: istore #90
/*     */     //   3684: aload #88
/*     */     //   3686: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3691: astore #91
/*     */     //   3693: iconst_0
/*     */     //   3694: istore #92
/*     */     //   3696: iload #89
/*     */     //   3698: ifne -> 3712
/*     */     //   3701: aload #91
/*     */     //   3703: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3706: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3709: if_acmpne -> 3737
/*     */     //   3712: iconst_0
/*     */     //   3713: istore #93
/*     */     //   3715: aload_0
/*     */     //   3716: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;)Lkotlin/jvm/functions/Function0;
/*     */     //   3721: astore #94
/*     */     //   3723: aload #88
/*     */     //   3725: aload #94
/*     */     //   3727: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3732: aload #94
/*     */     //   3734: goto -> 3739
/*     */     //   3737: aload #91
/*     */     //   3739: nop
/*     */     //   3740: nop
/*     */     //   3741: nop
/*     */     //   3742: checkcast kotlin/jvm/functions/Function0
/*     */     //   3745: astore #95
/*     */     //   3747: aload #85
/*     */     //   3749: invokeinterface endReplaceGroup : ()V
/*     */     //   3754: aload #95
/*     */     //   3756: aconst_null
/*     */     //   3757: iconst_0
/*     */     //   3758: aconst_null
/*     */     //   3759: aconst_null
/*     */     //   3760: aconst_null
/*     */     //   3761: getstatic com/intellij/ml/llm/matterhorn/ej/ui/debug/ComposableSingletons$DebugEventsPageKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/ComposableSingletons$DebugEventsPageKt;
/*     */     //   3764: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*     */     //   3767: aload #85
/*     */     //   3769: ldc_w 1572864
/*     */     //   3772: bipush #62
/*     */     //   3774: invokestatic DefaultButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   3777: aload #85
/*     */     //   3779: ldc_w 1926787622
/*     */     //   3782: invokeinterface startReplaceGroup : (I)V
/*     */     //   3787: aload #85
/*     */     //   3789: astore #88
/*     */     //   3791: aload_1
/*     */     //   3792: aload_0
/*     */     //   3793: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   3798: istore #89
/*     */     //   3800: nop
/*     */     //   3801: iconst_0
/*     */     //   3802: istore #90
/*     */     //   3804: aload #88
/*     */     //   3806: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3811: astore #91
/*     */     //   3813: iconst_0
/*     */     //   3814: istore #92
/*     */     //   3816: iload #89
/*     */     //   3818: ifne -> 3832
/*     */     //   3821: aload #91
/*     */     //   3823: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3826: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3829: if_acmpne -> 3857
/*     */     //   3832: iconst_0
/*     */     //   3833: istore #93
/*     */     //   3835: aload_0
/*     */     //   3836: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;)Lkotlin/jvm/functions/Function0;
/*     */     //   3841: astore #94
/*     */     //   3843: aload #88
/*     */     //   3845: aload #94
/*     */     //   3847: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3852: aload #94
/*     */     //   3854: goto -> 3859
/*     */     //   3857: aload #91
/*     */     //   3859: nop
/*     */     //   3860: nop
/*     */     //   3861: nop
/*     */     //   3862: checkcast kotlin/jvm/functions/Function0
/*     */     //   3865: astore #95
/*     */     //   3867: aload #85
/*     */     //   3869: invokeinterface endReplaceGroup : ()V
/*     */     //   3874: aload #95
/*     */     //   3876: aconst_null
/*     */     //   3877: iconst_0
/*     */     //   3878: aconst_null
/*     */     //   3879: aconst_null
/*     */     //   3880: aconst_null
/*     */     //   3881: getstatic com/intellij/ml/llm/matterhorn/ej/ui/debug/ComposableSingletons$DebugEventsPageKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/ComposableSingletons$DebugEventsPageKt;
/*     */     //   3884: invokevirtual getLambda-2$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*     */     //   3887: aload #85
/*     */     //   3889: ldc_w 1572864
/*     */     //   3892: bipush #62
/*     */     //   3894: invokestatic DefaultButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   3897: aload #5
/*     */     //   3899: invokestatic EventLogScreen$lambda$1 : (Landroidx/compose/runtime/MutableState;)Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;
/*     */     //   3902: ifnonnull -> 3954
/*     */     //   3905: aload #85
/*     */     //   3907: ldc_w -398795679
/*     */     //   3910: invokeinterface startReplaceGroup : (I)V
/*     */     //   3915: ldc_w 'Select an event to view details.'
/*     */     //   3918: aconst_null
/*     */     //   3919: lconst_0
/*     */     //   3920: lconst_0
/*     */     //   3921: aconst_null
/*     */     //   3922: aconst_null
/*     */     //   3923: aconst_null
/*     */     //   3924: lconst_0
/*     */     //   3925: aconst_null
/*     */     //   3926: iconst_0
/*     */     //   3927: lconst_0
/*     */     //   3928: iconst_0
/*     */     //   3929: iconst_0
/*     */     //   3930: iconst_0
/*     */     //   3931: aconst_null
/*     */     //   3932: aconst_null
/*     */     //   3933: aload #85
/*     */     //   3935: bipush #6
/*     */     //   3937: iconst_0
/*     */     //   3938: ldc_w 65534
/*     */     //   3941: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   3944: aload #85
/*     */     //   3946: invokeinterface endReplaceGroup : ()V
/*     */     //   3951: goto -> 3986
/*     */     //   3954: aload #85
/*     */     //   3956: ldc_w -398728285
/*     */     //   3959: invokeinterface startReplaceGroup : (I)V
/*     */     //   3964: aload #5
/*     */     //   3966: invokestatic EventLogScreen$lambda$1 : (Landroidx/compose/runtime/MutableState;)Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;
/*     */     //   3969: dup
/*     */     //   3970: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   3973: aload #85
/*     */     //   3975: iconst_0
/*     */     //   3976: invokestatic EventDetailView : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;Landroidx/compose/runtime/Composer;I)V
/*     */     //   3979: aload #85
/*     */     //   3981: invokeinterface endReplaceGroup : ()V
/*     */     //   3986: nop
/*     */     //   3987: aload #82
/*     */     //   3989: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3992: aload #58
/*     */     //   3994: invokeinterface endNode : ()V
/*     */     //   3999: aload #58
/*     */     //   4001: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4004: nop
/*     */     //   4005: aload #58
/*     */     //   4007: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4010: nop
/*     */     //   4011: aload #58
/*     */     //   4013: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4016: nop
/*     */     //   4017: nop
/*     */     //   4018: aload #55
/*     */     //   4020: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4023: aload #31
/*     */     //   4025: invokeinterface endNode : ()V
/*     */     //   4030: aload #31
/*     */     //   4032: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4035: nop
/*     */     //   4036: aload #31
/*     */     //   4038: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4041: nop
/*     */     //   4042: aload #31
/*     */     //   4044: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4047: nop
/*     */     //   4048: nop
/*     */     //   4049: aload #28
/*     */     //   4051: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4054: aload_1
/*     */     //   4055: invokeinterface endNode : ()V
/*     */     //   4060: aload_1
/*     */     //   4061: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4064: nop
/*     */     //   4065: aload_1
/*     */     //   4066: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4069: nop
/*     */     //   4070: aload_1
/*     */     //   4071: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4074: nop
/*     */     //   4075: invokestatic isTraceInProgress : ()Z
/*     */     //   4078: ifeq -> 4093
/*     */     //   4081: invokestatic traceEventEnd : ()V
/*     */     //   4084: goto -> 4093
/*     */     //   4087: aload_1
/*     */     //   4088: invokeinterface skipToGroupEnd : ()V
/*     */     //   4093: aload_1
/*     */     //   4094: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   4099: dup
/*     */     //   4100: ifnull -> 4118
/*     */     //   4103: aload_0
/*     */     //   4104: iload_2
/*     */     //   4105: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;I)Lkotlin/jvm/functions/Function2;
/*     */     //   4110: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   4115: goto -> 4119
/*     */     //   4118: pop
/*     */     //   4119: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #71	-> 6
/*     */     //   #72	-> 74
/*     */     //   #73	-> 80
/*     */     //   #74	-> 101
/*     */     //   #299	-> 105
/*     */     //   #300	-> 117
/*     */     //   #301	-> 128
/*     */     //   #74	-> 131
/*     */     //   #301	-> 138
/*     */     //   #302	-> 140
/*     */     //   #303	-> 149
/*     */     //   #304	-> 154
/*     */     //   #300	-> 156
/*     */     //   #299	-> 157
/*     */     //   #299	-> 158
/*     */     //   #74	-> 159
/*     */     //   #76	-> 174
/*     */     //   #305	-> 193
/*     */     //   #76	-> 199
/*     */     //   #306	-> 218
/*     */     //   #307	-> 221
/*     */     //   #308	-> 229
/*     */     //   #311	-> 237
/*     */     //   #312	-> 271
/*     */     //   #313	-> 282
/*     */     //   #314	-> 287
/*     */     //   #315	-> 293
/*     */     //   #316	-> 301
/*     */     //   #318	-> 308
/*     */     //   #317	-> 330
/*     */     //   #319	-> 341
/*     */     //   #320	-> 344
/*     */     //   #321	-> 360
/*     */     //   #322	-> 365
/*     */     //   #323	-> 375
/*     */     //   #325	-> 386
/*     */     //   #327	-> 391
/*     */     //   #328	-> 400
/*     */     //   #329	-> 413
/*     */     //   #331	-> 426
/*     */     //   #332	-> 437
/*     */     //   #333	-> 444
/*     */     //   #334	-> 472
/*     */     //   #335	-> 484
/*     */     //   #337	-> 498
/*     */     //   #332	-> 499
/*     */     //   #337	-> 500
/*     */     //   #338	-> 501
/*     */     //   #339	-> 514
/*     */     //   #327	-> 515
/*     */     //   #340	-> 516
/*     */     //   #341	-> 540
/*     */     //   #77	-> 571
/*     */     //   #342	-> 602
/*     */     //   #343	-> 605
/*     */     //   #344	-> 613
/*     */     //   #347	-> 621
/*     */     //   #348	-> 656
/*     */     //   #349	-> 668
/*     */     //   #350	-> 674
/*     */     //   #351	-> 681
/*     */     //   #352	-> 690
/*     */     //   #354	-> 697
/*     */     //   #353	-> 719
/*     */     //   #355	-> 731
/*     */     //   #356	-> 734
/*     */     //   #357	-> 752
/*     */     //   #358	-> 757
/*     */     //   #359	-> 769
/*     */     //   #361	-> 781
/*     */     //   #363	-> 786
/*     */     //   #364	-> 796
/*     */     //   #365	-> 809
/*     */     //   #367	-> 822
/*     */     //   #368	-> 833
/*     */     //   #369	-> 840
/*     */     //   #370	-> 868
/*     */     //   #371	-> 880
/*     */     //   #373	-> 894
/*     */     //   #368	-> 895
/*     */     //   #373	-> 896
/*     */     //   #374	-> 897
/*     */     //   #375	-> 910
/*     */     //   #363	-> 911
/*     */     //   #376	-> 912
/*     */     //   #377	-> 937
/*     */     //   #79	-> 971
/*     */     //   #378	-> 983
/*     */     //   #379	-> 986
/*     */     //   #380	-> 994
/*     */     //   #381	-> 1002
/*     */     //   #384	-> 1010
/*     */     //   #385	-> 1045
/*     */     //   #386	-> 1057
/*     */     //   #387	-> 1063
/*     */     //   #388	-> 1070
/*     */     //   #389	-> 1079
/*     */     //   #391	-> 1086
/*     */     //   #390	-> 1108
/*     */     //   #392	-> 1120
/*     */     //   #393	-> 1123
/*     */     //   #394	-> 1141
/*     */     //   #395	-> 1146
/*     */     //   #396	-> 1158
/*     */     //   #398	-> 1170
/*     */     //   #400	-> 1175
/*     */     //   #401	-> 1185
/*     */     //   #402	-> 1198
/*     */     //   #404	-> 1211
/*     */     //   #405	-> 1222
/*     */     //   #406	-> 1229
/*     */     //   #407	-> 1257
/*     */     //   #408	-> 1269
/*     */     //   #410	-> 1283
/*     */     //   #405	-> 1284
/*     */     //   #410	-> 1285
/*     */     //   #411	-> 1286
/*     */     //   #412	-> 1299
/*     */     //   #400	-> 1300
/*     */     //   #413	-> 1301
/*     */     //   #414	-> 1326
/*     */     //   #81	-> 1357
/*     */     //   #82	-> 1395
/*     */     //   #415	-> 1399
/*     */     //   #416	-> 1411
/*     */     //   #417	-> 1427
/*     */     //   #82	-> 1432
/*     */     //   #417	-> 1444
/*     */     //   #418	-> 1446
/*     */     //   #419	-> 1455
/*     */     //   #420	-> 1460
/*     */     //   #416	-> 1462
/*     */     //   #415	-> 1463
/*     */     //   #415	-> 1464
/*     */     //   #82	-> 1465
/*     */     //   #80	-> 1495
/*     */     //   #87	-> 1498
/*     */     //   #89	-> 1527
/*     */     //   #421	-> 1540
/*     */     //   #89	-> 1546
/*     */     //   #92	-> 1556
/*     */     //   #93	-> 1594
/*     */     //   #422	-> 1598
/*     */     //   #423	-> 1610
/*     */     //   #424	-> 1626
/*     */     //   #93	-> 1631
/*     */     //   #424	-> 1643
/*     */     //   #425	-> 1645
/*     */     //   #426	-> 1654
/*     */     //   #427	-> 1659
/*     */     //   #423	-> 1661
/*     */     //   #422	-> 1662
/*     */     //   #422	-> 1663
/*     */     //   #93	-> 1664
/*     */     //   #91	-> 1694
/*     */     //   #98	-> 1697
/*     */     //   #100	-> 1726
/*     */     //   #428	-> 1739
/*     */     //   #100	-> 1745
/*     */     //   #103	-> 1755
/*     */     //   #104	-> 1793
/*     */     //   #429	-> 1797
/*     */     //   #430	-> 1809
/*     */     //   #431	-> 1825
/*     */     //   #104	-> 1830
/*     */     //   #431	-> 1842
/*     */     //   #432	-> 1844
/*     */     //   #433	-> 1853
/*     */     //   #434	-> 1858
/*     */     //   #430	-> 1860
/*     */     //   #429	-> 1861
/*     */     //   #429	-> 1862
/*     */     //   #104	-> 1863
/*     */     //   #102	-> 1893
/*     */     //   #109	-> 1896
/*     */     //   #111	-> 1925
/*     */     //   #435	-> 1938
/*     */     //   #111	-> 1944
/*     */     //   #114	-> 1954
/*     */     //   #115	-> 1992
/*     */     //   #436	-> 1996
/*     */     //   #437	-> 2008
/*     */     //   #438	-> 2024
/*     */     //   #115	-> 2029
/*     */     //   #438	-> 2041
/*     */     //   #439	-> 2043
/*     */     //   #440	-> 2052
/*     */     //   #441	-> 2057
/*     */     //   #437	-> 2059
/*     */     //   #436	-> 2060
/*     */     //   #436	-> 2061
/*     */     //   #115	-> 2062
/*     */     //   #113	-> 2092
/*     */     //   #120	-> 2095
/*     */     //   #121	-> 2124
/*     */     //   #414	-> 2125
/*     */     //   #413	-> 2130
/*     */     //   #442	-> 2132
/*     */     //   #392	-> 2139
/*     */     //   #443	-> 2142
/*     */     //   #386	-> 2145
/*     */     //   #444	-> 2148
/*     */     //   #378	-> 2151
/*     */     //   #445	-> 2154
/*     */     //   #123	-> 2155
/*     */     //   #446	-> 2168
/*     */     //   #123	-> 2174
/*     */     //   #126	-> 2184
/*     */     //   #447	-> 2215
/*     */     //   #448	-> 2218
/*     */     //   #449	-> 2226
/*     */     //   #452	-> 2229
/*     */     //   #453	-> 2247
/*     */     //   #454	-> 2259
/*     */     //   #455	-> 2265
/*     */     //   #456	-> 2272
/*     */     //   #457	-> 2281
/*     */     //   #459	-> 2288
/*     */     //   #458	-> 2310
/*     */     //   #460	-> 2322
/*     */     //   #461	-> 2325
/*     */     //   #462	-> 2343
/*     */     //   #463	-> 2348
/*     */     //   #464	-> 2360
/*     */     //   #466	-> 2372
/*     */     //   #468	-> 2377
/*     */     //   #469	-> 2387
/*     */     //   #470	-> 2400
/*     */     //   #472	-> 2413
/*     */     //   #473	-> 2424
/*     */     //   #474	-> 2431
/*     */     //   #475	-> 2459
/*     */     //   #476	-> 2471
/*     */     //   #478	-> 2485
/*     */     //   #473	-> 2486
/*     */     //   #478	-> 2487
/*     */     //   #479	-> 2488
/*     */     //   #480	-> 2501
/*     */     //   #468	-> 2502
/*     */     //   #481	-> 2503
/*     */     //   #482	-> 2528
/*     */     //   #127	-> 2559
/*     */     //   #128	-> 2580
/*     */     //   #127	-> 2609
/*     */     //   #129	-> 2619
/*     */     //   #131	-> 2629
/*     */     //   #132	-> 2661
/*     */     //   #483	-> 2665
/*     */     //   #484	-> 2677
/*     */     //   #485	-> 2693
/*     */     //   #132	-> 2700
/*     */     //   #485	-> 2714
/*     */     //   #486	-> 2716
/*     */     //   #487	-> 2725
/*     */     //   #488	-> 2730
/*     */     //   #484	-> 2732
/*     */     //   #483	-> 2733
/*     */     //   #483	-> 2734
/*     */     //   #132	-> 2735
/*     */     //   #133	-> 2749
/*     */     //   #130	-> 2757
/*     */     //   #129	-> 2760
/*     */     //   #136	-> 2767
/*     */     //   #482	-> 2768
/*     */     //   #481	-> 2773
/*     */     //   #489	-> 2775
/*     */     //   #460	-> 2782
/*     */     //   #490	-> 2785
/*     */     //   #454	-> 2788
/*     */     //   #491	-> 2791
/*     */     //   #447	-> 2794
/*     */     //   #492	-> 2797
/*     */     //   #137	-> 2798
/*     */     //   #377	-> 2799
/*     */     //   #376	-> 2804
/*     */     //   #493	-> 2806
/*     */     //   #355	-> 2813
/*     */     //   #494	-> 2816
/*     */     //   #349	-> 2819
/*     */     //   #495	-> 2822
/*     */     //   #342	-> 2825
/*     */     //   #496	-> 2828
/*     */     //   #139	-> 2829
/*     */     //   #497	-> 2842
/*     */     //   #139	-> 2848
/*     */     //   #142	-> 2858
/*     */     //   #498	-> 2906
/*     */     //   #499	-> 2909
/*     */     //   #500	-> 2917
/*     */     //   #503	-> 2920
/*     */     //   #504	-> 2938
/*     */     //   #505	-> 2950
/*     */     //   #506	-> 2956
/*     */     //   #507	-> 2963
/*     */     //   #508	-> 2972
/*     */     //   #510	-> 2979
/*     */     //   #509	-> 3001
/*     */     //   #511	-> 3013
/*     */     //   #512	-> 3016
/*     */     //   #513	-> 3034
/*     */     //   #514	-> 3039
/*     */     //   #515	-> 3051
/*     */     //   #517	-> 3063
/*     */     //   #519	-> 3068
/*     */     //   #520	-> 3078
/*     */     //   #521	-> 3091
/*     */     //   #523	-> 3104
/*     */     //   #524	-> 3115
/*     */     //   #525	-> 3122
/*     */     //   #526	-> 3150
/*     */     //   #527	-> 3162
/*     */     //   #529	-> 3176
/*     */     //   #524	-> 3177
/*     */     //   #529	-> 3178
/*     */     //   #530	-> 3179
/*     */     //   #531	-> 3192
/*     */     //   #519	-> 3193
/*     */     //   #532	-> 3194
/*     */     //   #533	-> 3219
/*     */     //   #144	-> 3250
/*     */     //   #534	-> 3260
/*     */     //   #144	-> 3266
/*     */     //   #145	-> 3274
/*     */     //   #143	-> 3287
/*     */     //   #535	-> 3299
/*     */     //   #536	-> 3302
/*     */     //   #541	-> 3310
/*     */     //   #542	-> 3345
/*     */     //   #543	-> 3357
/*     */     //   #544	-> 3363
/*     */     //   #545	-> 3370
/*     */     //   #546	-> 3379
/*     */     //   #548	-> 3386
/*     */     //   #547	-> 3408
/*     */     //   #549	-> 3420
/*     */     //   #550	-> 3423
/*     */     //   #551	-> 3441
/*     */     //   #552	-> 3446
/*     */     //   #553	-> 3458
/*     */     //   #555	-> 3470
/*     */     //   #557	-> 3475
/*     */     //   #558	-> 3485
/*     */     //   #559	-> 3498
/*     */     //   #561	-> 3511
/*     */     //   #562	-> 3522
/*     */     //   #563	-> 3529
/*     */     //   #564	-> 3557
/*     */     //   #565	-> 3569
/*     */     //   #567	-> 3583
/*     */     //   #562	-> 3584
/*     */     //   #567	-> 3585
/*     */     //   #568	-> 3586
/*     */     //   #569	-> 3599
/*     */     //   #557	-> 3600
/*     */     //   #570	-> 3601
/*     */     //   #571	-> 3626
/*     */     //   #147	-> 3680
/*     */     //   #572	-> 3684
/*     */     //   #573	-> 3696
/*     */     //   #574	-> 3712
/*     */     //   #147	-> 3715
/*     */     //   #574	-> 3721
/*     */     //   #575	-> 3723
/*     */     //   #576	-> 3732
/*     */     //   #577	-> 3737
/*     */     //   #573	-> 3739
/*     */     //   #572	-> 3740
/*     */     //   #572	-> 3741
/*     */     //   #147	-> 3742
/*     */     //   #150	-> 3800
/*     */     //   #578	-> 3804
/*     */     //   #579	-> 3816
/*     */     //   #580	-> 3832
/*     */     //   #150	-> 3835
/*     */     //   #580	-> 3841
/*     */     //   #581	-> 3843
/*     */     //   #582	-> 3852
/*     */     //   #583	-> 3857
/*     */     //   #579	-> 3859
/*     */     //   #578	-> 3860
/*     */     //   #578	-> 3861
/*     */     //   #150	-> 3862
/*     */     //   #158	-> 3897
/*     */     //   #159	-> 3915
/*     */     //   #158	-> 3944
/*     */     //   #160	-> 3954
/*     */     //   #161	-> 3964
/*     */     //   #160	-> 3979
/*     */     //   #163	-> 3986
/*     */     //   #571	-> 3987
/*     */     //   #570	-> 3992
/*     */     //   #584	-> 3994
/*     */     //   #549	-> 4001
/*     */     //   #585	-> 4004
/*     */     //   #543	-> 4007
/*     */     //   #586	-> 4010
/*     */     //   #535	-> 4013
/*     */     //   #587	-> 4016
/*     */     //   #164	-> 4017
/*     */     //   #533	-> 4018
/*     */     //   #532	-> 4023
/*     */     //   #588	-> 4025
/*     */     //   #511	-> 4032
/*     */     //   #589	-> 4035
/*     */     //   #505	-> 4038
/*     */     //   #590	-> 4041
/*     */     //   #498	-> 4044
/*     */     //   #591	-> 4047
/*     */     //   #165	-> 4048
/*     */     //   #341	-> 4049
/*     */     //   #340	-> 4054
/*     */     //   #592	-> 4055
/*     */     //   #319	-> 4061
/*     */     //   #593	-> 4064
/*     */     //   #313	-> 4066
/*     */     //   #594	-> 4069
/*     */     //   #306	-> 4071
/*     */     //   #595	-> 4074
/*     */     //   #166	-> 4087
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   131	7	13	$i$a$-cache-DebugEventsPageKt$EventLogScreen$hoveredGroupId$1	I
/*     */     //   140	11	13	value$iv	Ljava/lang/Object;
/*     */     //   117	40	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   114	43	11	it$iv	Ljava/lang/Object;
/*     */     //   105	54	10	$i$f$cache	I
/*     */     //   102	57	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   102	57	9	invalid$iv	Z
/*     */     //   193	6	8	$i$f$getDp	I
/*     */     //   190	9	7	$this$dp$iv	I
/*     */     //   1432	6	94	$i$a$-cache-DebugEventsPageKt$EventLogScreen$1$1$1$1	I
/*     */     //   1446	11	96	value$iv	Ljava/lang/Object;
/*     */     //   1411	52	92	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1408	55	91	it$iv	Ljava/lang/Object;
/*     */     //   1399	66	90	$i$f$cache	I
/*     */     //   1396	69	88	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1396	69	89	invalid$iv	Z
/*     */     //   1540	6	88	$i$f$getDp	I
/*     */     //   1537	9	97	$this$dp$iv	I
/*     */     //   1631	6	94	$i$a$-cache-DebugEventsPageKt$EventLogScreen$1$1$1$2	I
/*     */     //   1645	11	96	value$iv	Ljava/lang/Object;
/*     */     //   1610	52	92	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1607	55	91	it$iv	Ljava/lang/Object;
/*     */     //   1598	66	90	$i$f$cache	I
/*     */     //   1595	69	88	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1595	69	89	invalid$iv	Z
/*     */     //   1739	6	88	$i$f$getDp	I
/*     */     //   1736	9	97	$this$dp$iv	I
/*     */     //   1830	6	94	$i$a$-cache-DebugEventsPageKt$EventLogScreen$1$1$1$3	I
/*     */     //   1844	11	96	value$iv	Ljava/lang/Object;
/*     */     //   1809	52	92	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1806	55	91	it$iv	Ljava/lang/Object;
/*     */     //   1797	66	90	$i$f$cache	I
/*     */     //   1794	69	88	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1794	69	89	invalid$iv	Z
/*     */     //   1938	6	88	$i$f$getDp	I
/*     */     //   1935	9	97	$this$dp$iv	I
/*     */     //   2029	6	94	$i$a$-cache-DebugEventsPageKt$EventLogScreen$1$1$1$4	I
/*     */     //   2043	11	96	value$iv	Ljava/lang/Object;
/*     */     //   2008	52	92	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2005	55	91	it$iv	Ljava/lang/Object;
/*     */     //   1996	66	90	$i$f$cache	I
/*     */     //   1993	69	88	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1993	69	89	invalid$iv	Z
/*     */     //   1357	768	87	$i$a$-Row-DebugEventsPageKt$EventLogScreen$1$1$1	I
/*     */     //   1354	771	86	$this$EventLogScreen_u24lambda_u2424_u24lambda_u2415_u24lambda_u2411	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1354	771	85	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1354	771	84	$changed	I
/*     */     //   1318	812	83	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1315	815	82	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1315	815	81	$changed$iv	I
/*     */     //   1229	55	80	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1226	58	79	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1222	64	78	$i$f$set-impl	I
/*     */     //   1219	67	77	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1185	115	76	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1182	118	75	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1112	1031	74	$i$f$ReusableComposeNode	I
/*     */     //   1109	1034	72	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1109	1034	73	$changed$iv$iv$iv	I
/*     */     //   1049	1100	68	$i$f$Layout	I
/*     */     //   1068	1081	69	compositeKeyHash$iv$iv	I
/*     */     //   1077	1072	70	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1086	1063	71	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1046	1103	67	$changed$iv$iv	I
/*     */     //   975	1180	62	$i$f$Row	I
/*     */     //   1036	1119	66	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   994	1161	63	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1002	1153	64	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1010	1145	65	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   972	1183	61	$changed$iv	I
/*     */     //   2168	6	64	$i$f$getDp	I
/*     */     //   2165	9	63	$this$dp$iv	I
/*     */     //   2700	6	95	$i$a$-cache-DebugEventsPageKt$EventLogScreen$1$1$2$1	I
/*     */     //   2716	11	97	value$iv	Ljava/lang/Object;
/*     */     //   2677	56	92	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2674	59	91	it$iv	Ljava/lang/Object;
/*     */     //   2665	70	90	$i$f$cache	I
/*     */     //   2662	73	88	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2662	73	89	invalid$iv	Z
/*     */     //   2559	209	87	$i$a$-Box-DebugEventsPageKt$EventLogScreen$1$1$2	I
/*     */     //   2556	212	86	$this$EventLogScreen_u24lambda_u2424_u24lambda_u2415_u24lambda_u2414	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   2556	212	85	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2556	212	84	$changed	I
/*     */     //   2520	253	83	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   2517	256	82	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2517	256	81	$changed$iv	I
/*     */     //   2431	55	80	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2428	58	79	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2424	64	78	$i$f$set-impl	I
/*     */     //   2421	67	77	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2387	115	76	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2384	118	75	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2314	472	74	$i$f$ReusableComposeNode	I
/*     */     //   2311	475	72	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2311	475	73	$changed$iv$iv$iv	I
/*     */     //   2251	541	68	$i$f$Layout	I
/*     */     //   2270	522	69	compositeKeyHash$iv$iv	I
/*     */     //   2279	513	70	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2288	504	71	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2248	544	67	$changed$iv$iv	I
/*     */     //   2207	591	62	$i$f$Box	I
/*     */     //   2238	560	66	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2204	594	63	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2226	572	64	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   2229	569	65	propagateMinConstraints$iv	Z
/*     */     //   2204	594	61	$changed$iv	I
/*     */     //   968	1831	60	$i$a$-Column-DebugEventsPageKt$EventLogScreen$1$1	I
/*     */     //   965	1834	59	$this$EventLogScreen_u24lambda_u2424_u24lambda_u2415	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   965	1834	58	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   965	1834	57	$changed	I
/*     */     //   929	1875	56	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   926	1878	55	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   926	1878	54	$changed$iv	I
/*     */     //   840	55	53	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   837	58	52	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   833	64	51	$i$f$set-impl	I
/*     */     //   830	67	50	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   796	115	49	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   793	118	48	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   723	2094	47	$i$f$ReusableComposeNode	I
/*     */     //   720	2097	45	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   720	2097	46	$changed$iv$iv$iv	I
/*     */     //   660	2163	41	$i$f$Layout	I
/*     */     //   679	2144	42	compositeKeyHash$iv$iv	I
/*     */     //   688	2135	43	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   697	2126	44	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   657	2166	40	$changed$iv$iv	I
/*     */     //   594	2235	36	$i$f$Column	I
/*     */     //   647	2182	39	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   591	2238	34	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   613	2216	37	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   621	2208	38	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   591	2238	35	$changed$iv	I
/*     */     //   2842	6	37	$i$f$getDp	I
/*     */     //   2839	9	34	$this$dp$iv	I
/*     */     //   3260	6	62	$i$f$getDp	I
/*     */     //   3257	9	61	$this$dp$iv	I
/*     */     //   3715	6	93	$i$a$-cache-DebugEventsPageKt$EventLogScreen$1$2$1$1	I
/*     */     //   3723	11	94	value$iv	Ljava/lang/Object;
/*     */     //   3696	44	92	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3693	47	91	it$iv	Ljava/lang/Object;
/*     */     //   3684	58	90	$i$f$cache	I
/*     */     //   3681	61	88	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3681	61	89	invalid$iv	Z
/*     */     //   3835	6	93	$i$a$-cache-DebugEventsPageKt$EventLogScreen$1$2$1$2	I
/*     */     //   3843	11	94	value$iv	Ljava/lang/Object;
/*     */     //   3816	44	92	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3813	47	91	it$iv	Ljava/lang/Object;
/*     */     //   3804	58	90	$i$f$cache	I
/*     */     //   3801	61	88	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3801	61	89	invalid$iv	Z
/*     */     //   3657	330	87	$i$a$-Column-DebugEventsPageKt$EventLogScreen$1$2$1	I
/*     */     //   3654	333	86	$this$EventLogScreen_u24lambda_u2424_u24lambda_u2423_u24lambda_u2422	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   3654	333	85	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3654	333	84	$changed	I
/*     */     //   3618	374	83	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   3615	377	82	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3615	377	81	$changed$iv	I
/*     */     //   3529	55	80	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   3526	58	79	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3522	64	78	$i$f$set-impl	I
/*     */     //   3519	67	77	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   3485	115	76	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   3482	118	75	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3412	593	74	$i$f$ReusableComposeNode	I
/*     */     //   3409	596	72	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   3409	596	73	$changed$iv$iv$iv	I
/*     */     //   3349	662	68	$i$f$Layout	I
/*     */     //   3368	643	69	compositeKeyHash$iv$iv	I
/*     */     //   3377	634	70	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3386	625	71	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3346	665	67	$changed$iv$iv	I
/*     */     //   3291	726	64	$i$f$Column	I
/*     */     //   3336	681	66	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3310	707	65	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3288	729	61	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   3288	729	62	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   3288	729	63	$changed$iv	I
/*     */     //   3250	768	60	$i$a$-Box-DebugEventsPageKt$EventLogScreen$1$2	I
/*     */     //   3247	771	59	$this$EventLogScreen_u24lambda_u2424_u24lambda_u2423	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   3247	771	58	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3247	771	57	$changed	I
/*     */     //   3211	812	56	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   3208	815	55	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3208	815	54	$changed$iv	I
/*     */     //   3122	55	53	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   3119	58	52	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3115	64	51	$i$f$set-impl	I
/*     */     //   3112	67	50	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   3078	115	49	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   3075	118	48	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3005	1031	47	$i$f$ReusableComposeNode	I
/*     */     //   3002	1034	45	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   3002	1034	46	$changed$iv$iv$iv	I
/*     */     //   2942	1100	41	$i$f$Layout	I
/*     */     //   2961	1081	42	compositeKeyHash$iv$iv	I
/*     */     //   2970	1072	43	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2979	1063	44	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2939	1103	40	$changed$iv$iv	I
/*     */     //   2898	1150	36	$i$f$Box	I
/*     */     //   2929	1119	39	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2895	1153	34	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2917	1131	37	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   2920	1128	38	propagateMinConstraints$iv	Z
/*     */     //   2895	1153	35	$changed$iv	I
/*     */     //   571	3478	33	$i$a$-Row-DebugEventsPageKt$EventLogScreen$1	I
/*     */     //   568	3481	32	$this$EventLogScreen_u24lambda_u2424	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   568	3481	31	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   568	3481	30	$changed	I
/*     */     //   532	3522	29	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   529	3525	28	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   529	3525	27	$changed$iv	I
/*     */     //   444	55	26	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   441	58	25	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   437	64	24	$i$f$set-impl	I
/*     */     //   434	67	23	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   400	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   397	118	21	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   334	3731	20	$i$f$ReusableComposeNode	I
/*     */     //   331	3734	18	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   331	3734	19	$changed$iv$iv$iv	I
/*     */     //   275	3795	14	$i$f$Layout	I
/*     */     //   292	3778	15	compositeKeyHash$iv$iv	I
/*     */     //   300	3770	16	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   308	3762	17	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   272	3798	13	$changed$iv$iv	I
/*     */     //   211	3864	11	$i$f$Row	I
/*     */     //   262	3813	12	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   208	3867	7	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   229	3846	8	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   237	3838	9	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   208	3867	10	$changed$iv	I
/*     */     //   80	4004	4	eventTree$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   86	3998	5	selectedNode$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   174	3910	6	hoveredGroupId	Landroidx/compose/runtime/MutableState;
/*     */     //   17	4103	3	$dirty	I
/*     */     //   0	4120	0	viewModel	Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogViewModel;
/*     */     //   0	4120	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	4120	2	$changed	I
/*     */   }
/*  72 */   private static final SnapshotStateList<EventNode> EventLogScreen$lambda$0(MutableState $eventTree$delegate) { State state = (State)$eventTree$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 692 */       (SnapshotStateList<EventNode>)state.getValue(); } private static final EventNode EventLogScreen$lambda$1(MutableState $selectedNode$delegate) { State state = (State)$selectedNode$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 693 */     return (EventNode)state.getValue(); }
/*     */   private static final Unit EventLogScreen$lambda$24$lambda$15$lambda$11$lambda$4$lambda$3(EventLogViewModel $viewModel, boolean it) { $viewModel.getFilterLLMEvents().setValue(Boolean.valueOf(it)); $viewModel.refreshEventTree(); return Unit.INSTANCE; }
/*     */   private static final Unit EventLogScreen$lambda$24$lambda$15$lambda$11$lambda$6$lambda$5(EventLogViewModel $viewModel, boolean it) { $viewModel.getFilterArtifactEvents().setValue(Boolean.valueOf(it)); $viewModel.refreshEventTree(); return Unit.INSTANCE; } private static final Unit EventTreeView$lambda$29$lambda$28(List $nodes, int $indent, Function1 $onNodeClick, MutableState $hoveredGroupId, LazyListScope $this$LazyColumn) { Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn"); LazyListScope $this$items_u24default$iv = $this$LazyColumn;
/* 696 */     Function1 key$iv = null;
/* 697 */     Function1 contentType$iv = DebugEventsPageKt$EventTreeView$lambda$29$lambda$28$$inlined$items$default$1.INSTANCE;
/*     */     int $i$f$items = 0;
/* 699 */     $this$items_u24default$iv.items(
/* 700 */         $nodes.size(), 
/* 701 */         null, new DebugEventsPageKt$EventTreeView$lambda$29$lambda$28$$inlined$items$default$3(contentType$iv, $nodes), 
/*     */         
/* 703 */         (Function4)ComposableLambdaKt.composableLambdaInstance(-632812321, true, new DebugEventsPageKt$EventTreeView$lambda$29$lambda$28$$inlined$items$default$4($nodes, $indent, $onNodeClick, $hoveredGroupId)));
/*     */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   private static final Unit EventLogScreen$lambda$24$lambda$15$lambda$11$lambda$8$lambda$7(EventLogViewModel $viewModel, boolean it) {
/*     */     $viewModel.getFilterStepEvents().setValue(Boolean.valueOf(it));
/*     */     $viewModel.refreshEventTree();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventLogScreen$lambda$24$lambda$15$lambda$11$lambda$10$lambda$9(EventLogViewModel $viewModel, boolean it) {
/*     */     $viewModel.getFilterOtherEvents().setValue(Boolean.valueOf(it));
/*     */     $viewModel.refreshEventTree();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventLogScreen$lambda$24$lambda$15$lambda$14$lambda$13$lambda$12(EventLogViewModel $viewModel, EventNode it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     $viewModel.selectNode(it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventLogScreen$lambda$24$lambda$23$lambda$22$lambda$17$lambda$16(EventLogViewModel $viewModel) {
/*     */     $viewModel.clearLog();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventLogScreen$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20(EventLogViewModel $viewModel) {
/*     */     FileChooserDescriptor fileChooserDescriptor = new FileChooserDescriptor(true, false, false, false, false, false);
/*     */     FileChooser.chooseFile(fileChooserDescriptor, null, null, $viewModel::EventLogScreen$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$18::EventLogScreen$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final void EventLogScreen$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$19(Function1 $tmp0, Object p0) {
/*     */     $tmp0.invoke(p0);
/*     */   }
/*     */   
/*     */   private static final Unit EventLogScreen$lambda$24$lambda$23$lambda$22$lambda$21$lambda$20$lambda$18(EventLogViewModel $viewModel, VirtualFile chosenFile) {
/*     */     Intrinsics.checkNotNullExpressionValue(chosenFile.toNioPath(), "toNioPath(...)");
/*     */     $viewModel.load(chosenFile.toNioPath());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void EventTreeView(@NotNull List nodes, int indent, @NotNull Function1 onNodeClick, @NotNull MutableState hoveredGroupId, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'nodes'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 'onNodeClick'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_3
/*     */     //   15: ldc_w 'hoveredGroupId'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload #4
/*     */     //   23: ldc_w 1821923695
/*     */     //   26: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   31: astore #4
/*     */     //   33: iload #5
/*     */     //   35: istore #7
/*     */     //   37: iload #6
/*     */     //   39: iconst_1
/*     */     //   40: iand
/*     */     //   41: ifeq -> 54
/*     */     //   44: iload #7
/*     */     //   46: bipush #6
/*     */     //   48: ior
/*     */     //   49: istore #7
/*     */     //   51: goto -> 83
/*     */     //   54: iload #5
/*     */     //   56: bipush #6
/*     */     //   58: iand
/*     */     //   59: ifne -> 83
/*     */     //   62: iload #7
/*     */     //   64: aload #4
/*     */     //   66: aload_0
/*     */     //   67: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   72: ifeq -> 79
/*     */     //   75: iconst_4
/*     */     //   76: goto -> 80
/*     */     //   79: iconst_2
/*     */     //   80: ior
/*     */     //   81: istore #7
/*     */     //   83: iload #6
/*     */     //   85: iconst_2
/*     */     //   86: iand
/*     */     //   87: ifeq -> 100
/*     */     //   90: iload #7
/*     */     //   92: bipush #48
/*     */     //   94: ior
/*     */     //   95: istore #7
/*     */     //   97: goto -> 131
/*     */     //   100: iload #5
/*     */     //   102: bipush #48
/*     */     //   104: iand
/*     */     //   105: ifne -> 131
/*     */     //   108: iload #7
/*     */     //   110: aload #4
/*     */     //   112: iload_1
/*     */     //   113: invokeinterface changed : (I)Z
/*     */     //   118: ifeq -> 126
/*     */     //   121: bipush #32
/*     */     //   123: goto -> 128
/*     */     //   126: bipush #16
/*     */     //   128: ior
/*     */     //   129: istore #7
/*     */     //   131: iload #6
/*     */     //   133: iconst_4
/*     */     //   134: iand
/*     */     //   135: ifeq -> 149
/*     */     //   138: iload #7
/*     */     //   140: sipush #384
/*     */     //   143: ior
/*     */     //   144: istore #7
/*     */     //   146: goto -> 183
/*     */     //   149: iload #5
/*     */     //   151: sipush #384
/*     */     //   154: iand
/*     */     //   155: ifne -> 183
/*     */     //   158: iload #7
/*     */     //   160: aload #4
/*     */     //   162: aload_2
/*     */     //   163: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   168: ifeq -> 177
/*     */     //   171: sipush #256
/*     */     //   174: goto -> 180
/*     */     //   177: sipush #128
/*     */     //   180: ior
/*     */     //   181: istore #7
/*     */     //   183: iload #6
/*     */     //   185: bipush #8
/*     */     //   187: iand
/*     */     //   188: ifeq -> 202
/*     */     //   191: iload #7
/*     */     //   193: sipush #3072
/*     */     //   196: ior
/*     */     //   197: istore #7
/*     */     //   199: goto -> 236
/*     */     //   202: iload #5
/*     */     //   204: sipush #3072
/*     */     //   207: iand
/*     */     //   208: ifne -> 236
/*     */     //   211: iload #7
/*     */     //   213: aload #4
/*     */     //   215: aload_3
/*     */     //   216: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   221: ifeq -> 230
/*     */     //   224: sipush #2048
/*     */     //   227: goto -> 233
/*     */     //   230: sipush #1024
/*     */     //   233: ior
/*     */     //   234: istore #7
/*     */     //   236: iload #7
/*     */     //   238: sipush #1171
/*     */     //   241: iand
/*     */     //   242: sipush #1170
/*     */     //   245: if_icmpne -> 258
/*     */     //   248: aload #4
/*     */     //   250: invokeinterface getSkipping : ()Z
/*     */     //   255: ifne -> 649
/*     */     //   258: iload #6
/*     */     //   260: iconst_2
/*     */     //   261: iand
/*     */     //   262: ifeq -> 267
/*     */     //   265: iconst_0
/*     */     //   266: istore_1
/*     */     //   267: invokestatic isTraceInProgress : ()Z
/*     */     //   270: ifeq -> 285
/*     */     //   273: ldc_w 1821923695
/*     */     //   276: iload #7
/*     */     //   278: iconst_m1
/*     */     //   279: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.EventTreeView (DebugEventsPage.kt:173)'
/*     */     //   282: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   285: iconst_0
/*     */     //   286: iconst_0
/*     */     //   287: aload #4
/*     */     //   289: iconst_0
/*     */     //   290: iconst_3
/*     */     //   291: invokestatic rememberLazyListState : (IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   294: astore #8
/*     */     //   296: aload_0
/*     */     //   297: aload #4
/*     */     //   299: ldc_w -1963926907
/*     */     //   302: invokeinterface startReplaceGroup : (I)V
/*     */     //   307: aload #4
/*     */     //   309: astore #10
/*     */     //   311: aload #4
/*     */     //   313: aload_0
/*     */     //   314: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   319: aload #4
/*     */     //   321: aload #8
/*     */     //   323: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   328: ior
/*     */     //   329: istore #11
/*     */     //   331: iconst_0
/*     */     //   332: istore #12
/*     */     //   334: aload #10
/*     */     //   336: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   341: astore #13
/*     */     //   343: iconst_0
/*     */     //   344: istore #14
/*     */     //   346: iload #11
/*     */     //   348: ifne -> 362
/*     */     //   351: aload #13
/*     */     //   353: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   356: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   359: if_acmpne -> 400
/*     */     //   362: astore #17
/*     */     //   364: iconst_0
/*     */     //   365: istore #15
/*     */     //   367: new com/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsPageKt$EventTreeView$1$1
/*     */     //   370: dup
/*     */     //   371: aload_0
/*     */     //   372: aload #8
/*     */     //   374: aconst_null
/*     */     //   375: invokespecial <init> : (Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/coroutines/Continuation;)V
/*     */     //   378: checkcast kotlin/jvm/functions/Function2
/*     */     //   381: aload #17
/*     */     //   383: swap
/*     */     //   384: astore #16
/*     */     //   386: aload #10
/*     */     //   388: aload #16
/*     */     //   390: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   395: aload #16
/*     */     //   397: goto -> 402
/*     */     //   400: aload #13
/*     */     //   402: nop
/*     */     //   403: nop
/*     */     //   404: nop
/*     */     //   405: checkcast kotlin/jvm/functions/Function2
/*     */     //   408: astore #9
/*     */     //   410: aload #4
/*     */     //   412: invokeinterface endReplaceGroup : ()V
/*     */     //   417: aload #9
/*     */     //   419: aload #4
/*     */     //   421: bipush #14
/*     */     //   423: iload #7
/*     */     //   425: iand
/*     */     //   426: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   429: aconst_null
/*     */     //   430: aload #8
/*     */     //   432: aconst_null
/*     */     //   433: iconst_0
/*     */     //   434: aconst_null
/*     */     //   435: aconst_null
/*     */     //   436: aconst_null
/*     */     //   437: iconst_0
/*     */     //   438: aload #4
/*     */     //   440: ldc_w -1963921057
/*     */     //   443: invokeinterface startReplaceGroup : (I)V
/*     */     //   448: aload #4
/*     */     //   450: astore #10
/*     */     //   452: aload #4
/*     */     //   454: aload_0
/*     */     //   455: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   460: iload #7
/*     */     //   462: bipush #112
/*     */     //   464: iand
/*     */     //   465: bipush #32
/*     */     //   467: if_icmpne -> 474
/*     */     //   470: iconst_1
/*     */     //   471: goto -> 475
/*     */     //   474: iconst_0
/*     */     //   475: ior
/*     */     //   476: iload #7
/*     */     //   478: sipush #896
/*     */     //   481: iand
/*     */     //   482: sipush #256
/*     */     //   485: if_icmpne -> 492
/*     */     //   488: iconst_1
/*     */     //   489: goto -> 493
/*     */     //   492: iconst_0
/*     */     //   493: ior
/*     */     //   494: iload #7
/*     */     //   496: sipush #7168
/*     */     //   499: iand
/*     */     //   500: sipush #2048
/*     */     //   503: if_icmpne -> 510
/*     */     //   506: iconst_1
/*     */     //   507: goto -> 511
/*     */     //   510: iconst_0
/*     */     //   511: ior
/*     */     //   512: istore #11
/*     */     //   514: iconst_0
/*     */     //   515: istore #12
/*     */     //   517: aload #10
/*     */     //   519: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   524: astore #13
/*     */     //   526: iconst_0
/*     */     //   527: istore #14
/*     */     //   529: iload #11
/*     */     //   531: ifne -> 545
/*     */     //   534: aload #13
/*     */     //   536: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   539: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   542: if_acmpne -> 609
/*     */     //   545: istore #24
/*     */     //   547: astore #23
/*     */     //   549: astore #22
/*     */     //   551: astore #21
/*     */     //   553: istore #20
/*     */     //   555: astore #19
/*     */     //   557: astore #18
/*     */     //   559: astore #17
/*     */     //   561: iconst_0
/*     */     //   562: istore #15
/*     */     //   564: aload_0
/*     */     //   565: iload_1
/*     */     //   566: aload_2
/*     */     //   567: aload_3
/*     */     //   568: <illegal opcode> invoke : (Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   573: astore #25
/*     */     //   575: aload #17
/*     */     //   577: aload #18
/*     */     //   579: aload #19
/*     */     //   581: iload #20
/*     */     //   583: aload #21
/*     */     //   585: aload #22
/*     */     //   587: aload #23
/*     */     //   589: iload #24
/*     */     //   591: aload #25
/*     */     //   593: astore #16
/*     */     //   595: aload #10
/*     */     //   597: aload #16
/*     */     //   599: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   604: aload #16
/*     */     //   606: goto -> 611
/*     */     //   609: aload #13
/*     */     //   611: nop
/*     */     //   612: nop
/*     */     //   613: nop
/*     */     //   614: checkcast kotlin/jvm/functions/Function1
/*     */     //   617: astore #9
/*     */     //   619: aload #4
/*     */     //   621: invokeinterface endReplaceGroup : ()V
/*     */     //   626: aload #9
/*     */     //   628: aload #4
/*     */     //   630: iconst_0
/*     */     //   631: sipush #253
/*     */     //   634: invokestatic LazyColumn : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   637: invokestatic isTraceInProgress : ()Z
/*     */     //   640: ifeq -> 656
/*     */     //   643: invokestatic traceEventEnd : ()V
/*     */     //   646: goto -> 656
/*     */     //   649: aload #4
/*     */     //   651: invokeinterface skipToGroupEnd : ()V
/*     */     //   656: aload #4
/*     */     //   658: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   663: dup
/*     */     //   664: ifnull -> 688
/*     */     //   667: aload_0
/*     */     //   668: iload_1
/*     */     //   669: aload_2
/*     */     //   670: aload_3
/*     */     //   671: iload #5
/*     */     //   673: iload #6
/*     */     //   675: <illegal opcode> invoke : (Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;II)Lkotlin/jvm/functions/Function2;
/*     */     //   680: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   685: goto -> 689
/*     */     //   688: pop
/*     */     //   689: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #174	-> 21
/*     */     //   #171	-> 265
/*     */     //   #174	-> 282
/*     */     //   #175	-> 291
/*     */     //   #178	-> 296
/*     */     //   #596	-> 334
/*     */     //   #597	-> 346
/*     */     //   #598	-> 362
/*     */     //   #178	-> 367
/*     */     //   #598	-> 384
/*     */     //   #599	-> 386
/*     */     //   #600	-> 395
/*     */     //   #601	-> 400
/*     */     //   #597	-> 402
/*     */     //   #596	-> 403
/*     */     //   #596	-> 404
/*     */     //   #178	-> 405
/*     */     //   #185	-> 430
/*     */     //   #602	-> 517
/*     */     //   #603	-> 529
/*     */     //   #604	-> 545
/*     */     //   #185	-> 564
/*     */     //   #604	-> 593
/*     */     //   #605	-> 595
/*     */     //   #606	-> 604
/*     */     //   #607	-> 609
/*     */     //   #603	-> 611
/*     */     //   #602	-> 612
/*     */     //   #602	-> 613
/*     */     //   #185	-> 614
/*     */     //   #195	-> 649
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   367	14	15	$i$a$-cache-DebugEventsPageKt$EventTreeView$1	I
/*     */     //   386	11	16	value$iv	Ljava/lang/Object;
/*     */     //   346	57	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   343	60	13	it$iv	Ljava/lang/Object;
/*     */     //   334	71	12	$i$f$cache	I
/*     */     //   331	74	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   331	74	11	invalid$iv	Z
/*     */     //   564	9	15	$i$a$-cache-DebugEventsPageKt$EventTreeView$2	I
/*     */     //   595	11	16	value$iv	Ljava/lang/Object;
/*     */     //   529	83	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   526	86	13	it$iv	Ljava/lang/Object;
/*     */     //   517	97	12	$i$f$cache	I
/*     */     //   514	100	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   514	100	11	invalid$iv	Z
/*     */     //   296	350	8	listState	Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   37	653	7	$dirty	I
/*     */     //   0	690	0	nodes	Ljava/util/List;
/*     */     //   0	690	1	indent	I
/*     */     //   0	690	2	onNodeClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	690	3	hoveredGroupId	Landroidx/compose/runtime/MutableState;
/*     */     //   0	690	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	690	5	$changed	I
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "DebugEventsPage.kt", l = {180}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.debug.DebugEventsPageKt$EventTreeView$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class DebugEventsPageKt$EventTreeView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     DebugEventsPageKt$EventTreeView$1$1(List<EventNode> $nodes, LazyListState $listState, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 106, 0 -> 32, 1 -> 96
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $nodes : Ljava/util/List;
/*     */       //   40: checkcast java/util/Collection
/*     */       //   43: invokeinterface isEmpty : ()Z
/*     */       //   48: ifne -> 55
/*     */       //   51: iconst_1
/*     */       //   52: goto -> 56
/*     */       //   55: iconst_0
/*     */       //   56: ifeq -> 102
/*     */       //   59: aload_0
/*     */       //   60: getfield $listState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */       //   63: aload_0
/*     */       //   64: getfield $nodes : Ljava/util/List;
/*     */       //   67: invokeinterface size : ()I
/*     */       //   72: iconst_1
/*     */       //   73: isub
/*     */       //   74: iconst_0
/*     */       //   75: aload_0
/*     */       //   76: checkcast kotlin/coroutines/Continuation
/*     */       //   79: iconst_2
/*     */       //   80: aconst_null
/*     */       //   81: aload_0
/*     */       //   82: iconst_1
/*     */       //   83: putfield label : I
/*     */       //   86: invokestatic animateScrollToItem$default : (Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   89: dup
/*     */       //   90: aload_2
/*     */       //   91: if_acmpne -> 101
/*     */       //   94: aload_2
/*     */       //   95: areturn
/*     */       //   96: aload_1
/*     */       //   97: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   100: aload_1
/*     */       //   101: pop
/*     */       //   102: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   105: areturn
/*     */       //   106: new java/lang/IllegalStateException
/*     */       //   109: dup
/*     */       //   110: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   112: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   115: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #178	-> 3
/*     */       //   #179	-> 36
/*     */       //   #179	-> 56
/*     */       //   #180	-> 59
/*     */       //   #178	-> 94
/*     */       //   #182	-> 101
/*     */       //   #178	-> 106
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	116	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsPageKt$EventTreeView$1$1;
/*     */       //   36	70	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super DebugEventsPageKt$EventTreeView$1$1> $completion) {
/*     */       return (Continuation<Unit>)new DebugEventsPageKt$EventTreeView$1$1(this.$nodes, this.$listState, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((DebugEventsPageKt$EventTreeView$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void EventTreeItem(@NotNull EventNode node, int indent, @NotNull Function1 onNodeClick, @NotNull MutableState hoveredGroupId, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'node'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 'onNodeClick'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_3
/*     */     //   15: ldc_w 'hoveredGroupId'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload #4
/*     */     //   23: ldc_w -967813771
/*     */     //   26: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   31: astore #4
/*     */     //   33: iload #5
/*     */     //   35: istore #6
/*     */     //   37: iload #5
/*     */     //   39: bipush #6
/*     */     //   41: iand
/*     */     //   42: ifne -> 66
/*     */     //   45: iload #6
/*     */     //   47: aload #4
/*     */     //   49: aload_0
/*     */     //   50: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   55: ifeq -> 62
/*     */     //   58: iconst_4
/*     */     //   59: goto -> 63
/*     */     //   62: iconst_2
/*     */     //   63: ior
/*     */     //   64: istore #6
/*     */     //   66: iload #5
/*     */     //   68: bipush #48
/*     */     //   70: iand
/*     */     //   71: ifne -> 97
/*     */     //   74: iload #6
/*     */     //   76: aload #4
/*     */     //   78: iload_1
/*     */     //   79: invokeinterface changed : (I)Z
/*     */     //   84: ifeq -> 92
/*     */     //   87: bipush #32
/*     */     //   89: goto -> 94
/*     */     //   92: bipush #16
/*     */     //   94: ior
/*     */     //   95: istore #6
/*     */     //   97: iload #5
/*     */     //   99: sipush #384
/*     */     //   102: iand
/*     */     //   103: ifne -> 131
/*     */     //   106: iload #6
/*     */     //   108: aload #4
/*     */     //   110: aload_2
/*     */     //   111: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   116: ifeq -> 125
/*     */     //   119: sipush #256
/*     */     //   122: goto -> 128
/*     */     //   125: sipush #128
/*     */     //   128: ior
/*     */     //   129: istore #6
/*     */     //   131: iload #5
/*     */     //   133: sipush #3072
/*     */     //   136: iand
/*     */     //   137: ifne -> 165
/*     */     //   140: iload #6
/*     */     //   142: aload #4
/*     */     //   144: aload_3
/*     */     //   145: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   150: ifeq -> 159
/*     */     //   153: sipush #2048
/*     */     //   156: goto -> 162
/*     */     //   159: sipush #1024
/*     */     //   162: ior
/*     */     //   163: istore #6
/*     */     //   165: iload #6
/*     */     //   167: sipush #1171
/*     */     //   170: iand
/*     */     //   171: sipush #1170
/*     */     //   174: if_icmpne -> 187
/*     */     //   177: aload #4
/*     */     //   179: invokeinterface getSkipping : ()Z
/*     */     //   184: ifne -> 2345
/*     */     //   187: invokestatic isTraceInProgress : ()Z
/*     */     //   190: ifeq -> 205
/*     */     //   193: ldc_w -967813771
/*     */     //   196: iload #6
/*     */     //   198: iconst_m1
/*     */     //   199: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.EventTreeItem (DebugEventsPage.kt:203)'
/*     */     //   202: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   205: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   208: checkcast androidx/compose/ui/Modifier
/*     */     //   211: aconst_null
/*     */     //   212: aload #4
/*     */     //   214: ldc_w 1969038582
/*     */     //   217: invokeinterface startReplaceGroup : (I)V
/*     */     //   222: aload #4
/*     */     //   224: astore #9
/*     */     //   226: iload #6
/*     */     //   228: bipush #14
/*     */     //   230: iand
/*     */     //   231: iconst_4
/*     */     //   232: if_icmpne -> 239
/*     */     //   235: iconst_1
/*     */     //   236: goto -> 240
/*     */     //   239: iconst_0
/*     */     //   240: iload #6
/*     */     //   242: sipush #7168
/*     */     //   245: iand
/*     */     //   246: sipush #2048
/*     */     //   249: if_icmpne -> 256
/*     */     //   252: iconst_1
/*     */     //   253: goto -> 257
/*     */     //   256: iconst_0
/*     */     //   257: ior
/*     */     //   258: istore #10
/*     */     //   260: nop
/*     */     //   261: iconst_0
/*     */     //   262: istore #11
/*     */     //   264: aload #9
/*     */     //   266: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   271: astore #12
/*     */     //   273: iconst_0
/*     */     //   274: istore #13
/*     */     //   276: iload #10
/*     */     //   278: ifne -> 292
/*     */     //   281: aload #12
/*     */     //   283: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   286: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   289: if_acmpne -> 330
/*     */     //   292: astore #52
/*     */     //   294: astore #51
/*     */     //   296: iconst_0
/*     */     //   297: istore #14
/*     */     //   299: aload_0
/*     */     //   300: aload_3
/*     */     //   301: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   306: astore #53
/*     */     //   308: aload #51
/*     */     //   310: aload #52
/*     */     //   312: aload #53
/*     */     //   314: astore #15
/*     */     //   316: aload #9
/*     */     //   318: aload #15
/*     */     //   320: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   325: aload #15
/*     */     //   327: goto -> 332
/*     */     //   330: aload #12
/*     */     //   332: nop
/*     */     //   333: nop
/*     */     //   334: nop
/*     */     //   335: checkcast kotlin/jvm/functions/Function0
/*     */     //   338: astore #8
/*     */     //   340: aload #4
/*     */     //   342: invokeinterface endReplaceGroup : ()V
/*     */     //   347: aload #8
/*     */     //   349: aload #4
/*     */     //   351: ldc_w 1969032366
/*     */     //   354: invokeinterface startReplaceGroup : (I)V
/*     */     //   359: aload #4
/*     */     //   361: astore #9
/*     */     //   363: iload #6
/*     */     //   365: bipush #14
/*     */     //   367: iand
/*     */     //   368: iconst_4
/*     */     //   369: if_icmpne -> 376
/*     */     //   372: iconst_1
/*     */     //   373: goto -> 377
/*     */     //   376: iconst_0
/*     */     //   377: iload #6
/*     */     //   379: sipush #7168
/*     */     //   382: iand
/*     */     //   383: sipush #2048
/*     */     //   386: if_icmpne -> 393
/*     */     //   389: iconst_1
/*     */     //   390: goto -> 394
/*     */     //   393: iconst_0
/*     */     //   394: ior
/*     */     //   395: istore #10
/*     */     //   397: nop
/*     */     //   398: iconst_0
/*     */     //   399: istore #11
/*     */     //   401: aload #9
/*     */     //   403: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   408: astore #12
/*     */     //   410: iconst_0
/*     */     //   411: istore #13
/*     */     //   413: iload #10
/*     */     //   415: ifne -> 429
/*     */     //   418: aload #12
/*     */     //   420: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   423: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   426: if_acmpne -> 471
/*     */     //   429: astore #53
/*     */     //   431: astore #52
/*     */     //   433: astore #51
/*     */     //   435: iconst_0
/*     */     //   436: istore #14
/*     */     //   438: aload_0
/*     */     //   439: aload_3
/*     */     //   440: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   445: astore #54
/*     */     //   447: aload #51
/*     */     //   449: aload #52
/*     */     //   451: aload #53
/*     */     //   453: aload #54
/*     */     //   455: astore #15
/*     */     //   457: aload #9
/*     */     //   459: aload #15
/*     */     //   461: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   466: aload #15
/*     */     //   468: goto -> 473
/*     */     //   471: aload #12
/*     */     //   473: nop
/*     */     //   474: nop
/*     */     //   475: nop
/*     */     //   476: checkcast kotlin/jvm/functions/Function0
/*     */     //   479: astore #8
/*     */     //   481: aload #4
/*     */     //   483: invokeinterface endReplaceGroup : ()V
/*     */     //   488: aload #8
/*     */     //   490: iconst_1
/*     */     //   491: aconst_null
/*     */     //   492: invokestatic pointerMoveFilter$default : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   495: astore #7
/*     */     //   497: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   500: checkcast androidx/compose/ui/Modifier
/*     */     //   503: fconst_0
/*     */     //   504: iconst_1
/*     */     //   505: aconst_null
/*     */     //   506: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   509: aload #7
/*     */     //   511: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   516: iload_1
/*     */     //   517: bipush #16
/*     */     //   519: imul
/*     */     //   520: istore #8
/*     */     //   522: iconst_0
/*     */     //   523: istore #9
/*     */     //   525: iload #8
/*     */     //   527: i2f
/*     */     //   528: invokestatic constructor-impl : (F)F
/*     */     //   531: iconst_4
/*     */     //   532: istore #8
/*     */     //   534: iconst_0
/*     */     //   535: istore #9
/*     */     //   537: iload #8
/*     */     //   539: i2f
/*     */     //   540: invokestatic constructor-impl : (F)F
/*     */     //   543: fconst_0
/*     */     //   544: iconst_4
/*     */     //   545: istore #8
/*     */     //   547: iconst_0
/*     */     //   548: istore #9
/*     */     //   550: iload #8
/*     */     //   552: i2f
/*     */     //   553: invokestatic constructor-impl : (F)F
/*     */     //   556: iconst_4
/*     */     //   557: aconst_null
/*     */     //   558: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   561: astore #8
/*     */     //   563: iconst_0
/*     */     //   564: istore #11
/*     */     //   566: nop
/*     */     //   567: iconst_0
/*     */     //   568: istore #12
/*     */     //   570: aload #4
/*     */     //   572: ldc_w 693286680
/*     */     //   575: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   578: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   581: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   584: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   587: astore #9
/*     */     //   589: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   592: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   595: astore #10
/*     */     //   597: aload #9
/*     */     //   599: aload #10
/*     */     //   601: aload #4
/*     */     //   603: bipush #14
/*     */     //   605: iload #11
/*     */     //   607: iconst_3
/*     */     //   608: ishr
/*     */     //   609: iand
/*     */     //   610: bipush #112
/*     */     //   612: iload #11
/*     */     //   614: iconst_3
/*     */     //   615: ishr
/*     */     //   616: iand
/*     */     //   617: ior
/*     */     //   618: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   621: astore #13
/*     */     //   623: bipush #112
/*     */     //   625: iload #11
/*     */     //   627: iconst_3
/*     */     //   628: ishl
/*     */     //   629: iand
/*     */     //   630: istore #14
/*     */     //   632: nop
/*     */     //   633: iconst_0
/*     */     //   634: istore #15
/*     */     //   636: aload #4
/*     */     //   638: ldc_w -1323940314
/*     */     //   641: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   644: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   647: aload #4
/*     */     //   649: iconst_0
/*     */     //   650: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   653: istore #16
/*     */     //   655: aload #4
/*     */     //   657: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   662: astore #17
/*     */     //   664: aload #4
/*     */     //   666: aload #8
/*     */     //   668: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   671: astore #18
/*     */     //   673: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   676: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   679: astore #19
/*     */     //   681: bipush #6
/*     */     //   683: sipush #896
/*     */     //   686: iload #14
/*     */     //   688: bipush #6
/*     */     //   690: ishl
/*     */     //   691: iand
/*     */     //   692: ior
/*     */     //   693: istore #20
/*     */     //   695: nop
/*     */     //   696: iconst_0
/*     */     //   697: istore #21
/*     */     //   699: aload #4
/*     */     //   701: ldc_w -692256719
/*     */     //   704: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   707: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   710: aload #4
/*     */     //   712: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   717: instanceof androidx/compose/runtime/Applier
/*     */     //   720: ifne -> 726
/*     */     //   723: invokestatic invalidApplier : ()V
/*     */     //   726: aload #4
/*     */     //   728: invokeinterface startReusableNode : ()V
/*     */     //   733: aload #4
/*     */     //   735: invokeinterface getInserting : ()Z
/*     */     //   740: ifeq -> 755
/*     */     //   743: aload #4
/*     */     //   745: aload #19
/*     */     //   747: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   752: goto -> 762
/*     */     //   755: aload #4
/*     */     //   757: invokeinterface useNode : ()V
/*     */     //   762: aload #4
/*     */     //   764: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   767: astore #22
/*     */     //   769: iconst_0
/*     */     //   770: istore #23
/*     */     //   772: aload #22
/*     */     //   774: aload #13
/*     */     //   776: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   779: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   782: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   785: aload #22
/*     */     //   787: aload #17
/*     */     //   789: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   792: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   795: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   798: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   801: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   804: astore #24
/*     */     //   806: iconst_0
/*     */     //   807: istore #25
/*     */     //   809: aload #22
/*     */     //   811: astore #26
/*     */     //   813: iconst_0
/*     */     //   814: istore #27
/*     */     //   816: aload #26
/*     */     //   818: invokeinterface getInserting : ()Z
/*     */     //   823: ifne -> 844
/*     */     //   826: aload #26
/*     */     //   828: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   833: iload #16
/*     */     //   835: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   838: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   841: ifne -> 870
/*     */     //   844: aload #26
/*     */     //   846: iload #16
/*     */     //   848: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   851: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   856: aload #22
/*     */     //   858: iload #16
/*     */     //   860: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   863: aload #24
/*     */     //   865: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   870: nop
/*     */     //   871: nop
/*     */     //   872: nop
/*     */     //   873: aload #22
/*     */     //   875: aload #18
/*     */     //   877: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   880: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   883: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   886: nop
/*     */     //   887: nop
/*     */     //   888: aload #4
/*     */     //   890: bipush #14
/*     */     //   892: iload #20
/*     */     //   894: bipush #6
/*     */     //   896: ishr
/*     */     //   897: iand
/*     */     //   898: istore #28
/*     */     //   900: astore #29
/*     */     //   902: iconst_0
/*     */     //   903: istore #30
/*     */     //   905: aload #29
/*     */     //   907: ldc_w -407840262
/*     */     //   910: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   913: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   916: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   919: aload #29
/*     */     //   921: bipush #6
/*     */     //   923: bipush #112
/*     */     //   925: iload #11
/*     */     //   927: bipush #6
/*     */     //   929: ishr
/*     */     //   930: iand
/*     */     //   931: ior
/*     */     //   932: istore #31
/*     */     //   934: astore #32
/*     */     //   936: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   939: astore #33
/*     */     //   941: iconst_0
/*     */     //   942: istore #34
/*     */     //   944: aload_0
/*     */     //   945: astore #35
/*     */     //   947: aload #35
/*     */     //   949: instanceof com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   952: ifeq -> 1531
/*     */     //   955: aload #32
/*     */     //   957: ldc_w 918406135
/*     */     //   960: invokeinterface startReplaceGroup : (I)V
/*     */     //   965: aload_0
/*     */     //   966: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   969: invokevirtual getChildren : ()Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   972: checkcast java/util/Collection
/*     */     //   975: invokeinterface isEmpty : ()Z
/*     */     //   980: ifne -> 987
/*     */     //   983: iconst_1
/*     */     //   984: goto -> 988
/*     */     //   987: iconst_0
/*     */     //   988: ifeq -> 1257
/*     */     //   991: aload #32
/*     */     //   993: ldc_w 918473560
/*     */     //   996: invokeinterface startReplaceGroup : (I)V
/*     */     //   1001: aload_0
/*     */     //   1002: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   1005: invokevirtual getExpanded : ()Landroidx/compose/runtime/MutableState;
/*     */     //   1008: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1013: checkcast java/lang/Boolean
/*     */     //   1016: invokevirtual booleanValue : ()Z
/*     */     //   1019: ifeq -> 1028
/*     */     //   1022: ldc_w '▼'
/*     */     //   1025: goto -> 1031
/*     */     //   1028: ldc_w '▶'
/*     */     //   1031: astore #36
/*     */     //   1033: aload #36
/*     */     //   1035: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1038: checkcast androidx/compose/ui/Modifier
/*     */     //   1041: iconst_0
/*     */     //   1042: aconst_null
/*     */     //   1043: aconst_null
/*     */     //   1044: aload #32
/*     */     //   1046: ldc_w -1355839320
/*     */     //   1049: invokeinterface startReplaceGroup : (I)V
/*     */     //   1054: aload #32
/*     */     //   1056: astore #37
/*     */     //   1058: iload #6
/*     */     //   1060: bipush #14
/*     */     //   1062: iand
/*     */     //   1063: iconst_4
/*     */     //   1064: if_icmpne -> 1071
/*     */     //   1067: iconst_1
/*     */     //   1068: goto -> 1072
/*     */     //   1071: iconst_0
/*     */     //   1072: istore #38
/*     */     //   1074: iconst_0
/*     */     //   1075: istore #39
/*     */     //   1077: aload #37
/*     */     //   1079: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1084: astore #40
/*     */     //   1086: iconst_0
/*     */     //   1087: istore #41
/*     */     //   1089: iload #38
/*     */     //   1091: ifne -> 1105
/*     */     //   1094: aload #40
/*     */     //   1096: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1099: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1102: if_acmpne -> 1154
/*     */     //   1105: astore #42
/*     */     //   1107: astore #43
/*     */     //   1109: istore #44
/*     */     //   1111: astore #45
/*     */     //   1113: astore #46
/*     */     //   1115: iconst_0
/*     */     //   1116: istore #47
/*     */     //   1118: aload_0
/*     */     //   1119: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;)Lkotlin/jvm/functions/Function0;
/*     */     //   1124: astore #48
/*     */     //   1126: aload #46
/*     */     //   1128: aload #45
/*     */     //   1130: iload #44
/*     */     //   1132: aload #43
/*     */     //   1134: aload #42
/*     */     //   1136: aload #48
/*     */     //   1138: astore #49
/*     */     //   1140: aload #37
/*     */     //   1142: aload #49
/*     */     //   1144: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1149: aload #49
/*     */     //   1151: goto -> 1156
/*     */     //   1154: aload #40
/*     */     //   1156: nop
/*     */     //   1157: nop
/*     */     //   1158: nop
/*     */     //   1159: checkcast kotlin/jvm/functions/Function0
/*     */     //   1162: astore #50
/*     */     //   1164: aload #32
/*     */     //   1166: invokeinterface endReplaceGroup : ()V
/*     */     //   1171: aload #50
/*     */     //   1173: bipush #7
/*     */     //   1175: aconst_null
/*     */     //   1176: invokestatic clickable-XHw0xAI$default : (Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1179: bipush #16
/*     */     //   1181: istore #50
/*     */     //   1183: iconst_0
/*     */     //   1184: istore #37
/*     */     //   1186: iload #50
/*     */     //   1188: i2f
/*     */     //   1189: invokestatic constructor-impl : (F)F
/*     */     //   1192: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1195: lconst_0
/*     */     //   1196: lconst_0
/*     */     //   1197: aconst_null
/*     */     //   1198: aconst_null
/*     */     //   1199: aconst_null
/*     */     //   1200: lconst_0
/*     */     //   1201: aconst_null
/*     */     //   1202: iconst_0
/*     */     //   1203: lconst_0
/*     */     //   1204: iconst_0
/*     */     //   1205: iconst_0
/*     */     //   1206: iconst_0
/*     */     //   1207: aconst_null
/*     */     //   1208: aconst_null
/*     */     //   1209: aload #32
/*     */     //   1211: iconst_0
/*     */     //   1212: iconst_0
/*     */     //   1213: ldc_w 65532
/*     */     //   1216: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1219: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1222: checkcast androidx/compose/ui/Modifier
/*     */     //   1225: iconst_4
/*     */     //   1226: istore #50
/*     */     //   1228: iconst_0
/*     */     //   1229: istore #37
/*     */     //   1231: iload #50
/*     */     //   1233: i2f
/*     */     //   1234: invokestatic constructor-impl : (F)F
/*     */     //   1237: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1240: aload #32
/*     */     //   1242: bipush #6
/*     */     //   1244: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1247: aload #32
/*     */     //   1249: invokeinterface endReplaceGroup : ()V
/*     */     //   1254: goto -> 1303
/*     */     //   1257: aload #32
/*     */     //   1259: ldc_w 918804330
/*     */     //   1262: invokeinterface startReplaceGroup : (I)V
/*     */     //   1267: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1270: checkcast androidx/compose/ui/Modifier
/*     */     //   1273: bipush #20
/*     */     //   1275: istore #36
/*     */     //   1277: iconst_0
/*     */     //   1278: istore #50
/*     */     //   1280: iload #36
/*     */     //   1282: i2f
/*     */     //   1283: invokestatic constructor-impl : (F)F
/*     */     //   1286: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1289: aload #32
/*     */     //   1291: bipush #6
/*     */     //   1293: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1296: aload #32
/*     */     //   1298: invokeinterface endReplaceGroup : ()V
/*     */     //   1303: aload_0
/*     */     //   1304: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   1307: invokevirtual getTimestamp : ()J
/*     */     //   1310: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   1313: invokestatic formatTimestamp : (Ljava/lang/Long;)Ljava/lang/String;
/*     */     //   1316: aload_0
/*     */     //   1317: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   1320: invokevirtual getEvent : ()Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;
/*     */     //   1323: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   1326: invokestatic summarizeEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)Ljava/lang/String;
/*     */     //   1329: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1334: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1337: checkcast androidx/compose/ui/Modifier
/*     */     //   1340: iconst_0
/*     */     //   1341: aconst_null
/*     */     //   1342: aconst_null
/*     */     //   1343: aload #32
/*     */     //   1345: ldc_w -1355827313
/*     */     //   1348: invokeinterface startReplaceGroup : (I)V
/*     */     //   1353: aload #32
/*     */     //   1355: astore #50
/*     */     //   1357: iload #6
/*     */     //   1359: sipush #896
/*     */     //   1362: iand
/*     */     //   1363: sipush #256
/*     */     //   1366: if_icmpne -> 1373
/*     */     //   1369: iconst_1
/*     */     //   1370: goto -> 1374
/*     */     //   1373: iconst_0
/*     */     //   1374: iload #6
/*     */     //   1376: bipush #14
/*     */     //   1378: iand
/*     */     //   1379: iconst_4
/*     */     //   1380: if_icmpne -> 1387
/*     */     //   1383: iconst_1
/*     */     //   1384: goto -> 1388
/*     */     //   1387: iconst_0
/*     */     //   1388: ior
/*     */     //   1389: istore #37
/*     */     //   1391: iconst_0
/*     */     //   1392: istore #38
/*     */     //   1394: aload #50
/*     */     //   1396: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1401: astore #39
/*     */     //   1403: iconst_0
/*     */     //   1404: istore #40
/*     */     //   1406: iload #37
/*     */     //   1408: ifne -> 1422
/*     */     //   1411: aload #39
/*     */     //   1413: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1416: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1419: if_acmpne -> 1472
/*     */     //   1422: astore #42
/*     */     //   1424: astore #43
/*     */     //   1426: istore #44
/*     */     //   1428: astore #45
/*     */     //   1430: astore #46
/*     */     //   1432: iconst_0
/*     */     //   1433: istore #41
/*     */     //   1435: aload_2
/*     */     //   1436: aload_0
/*     */     //   1437: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;)Lkotlin/jvm/functions/Function0;
/*     */     //   1442: astore #48
/*     */     //   1444: aload #46
/*     */     //   1446: aload #45
/*     */     //   1448: iload #44
/*     */     //   1450: aload #43
/*     */     //   1452: aload #42
/*     */     //   1454: aload #48
/*     */     //   1456: astore #47
/*     */     //   1458: aload #50
/*     */     //   1460: aload #47
/*     */     //   1462: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1467: aload #47
/*     */     //   1469: goto -> 1474
/*     */     //   1472: aload #39
/*     */     //   1474: nop
/*     */     //   1475: nop
/*     */     //   1476: nop
/*     */     //   1477: checkcast kotlin/jvm/functions/Function0
/*     */     //   1480: astore #36
/*     */     //   1482: aload #32
/*     */     //   1484: invokeinterface endReplaceGroup : ()V
/*     */     //   1489: aload #36
/*     */     //   1491: bipush #7
/*     */     //   1493: aconst_null
/*     */     //   1494: invokestatic clickable-XHw0xAI$default : (Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1497: lconst_0
/*     */     //   1498: lconst_0
/*     */     //   1499: aconst_null
/*     */     //   1500: aconst_null
/*     */     //   1501: aconst_null
/*     */     //   1502: lconst_0
/*     */     //   1503: aconst_null
/*     */     //   1504: iconst_0
/*     */     //   1505: lconst_0
/*     */     //   1506: iconst_0
/*     */     //   1507: iconst_0
/*     */     //   1508: iconst_0
/*     */     //   1509: aconst_null
/*     */     //   1510: aconst_null
/*     */     //   1511: aload #32
/*     */     //   1513: iconst_0
/*     */     //   1514: iconst_0
/*     */     //   1515: ldc_w 65532
/*     */     //   1518: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1521: aload #32
/*     */     //   1523: invokeinterface endReplaceGroup : ()V
/*     */     //   1528: goto -> 2103
/*     */     //   1531: aload #35
/*     */     //   1533: instanceof com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode
/*     */     //   1536: ifeq -> 1806
/*     */     //   1539: aload #32
/*     */     //   1541: ldc_w 919102829
/*     */     //   1544: invokeinterface startReplaceGroup : (I)V
/*     */     //   1549: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1552: checkcast androidx/compose/ui/Modifier
/*     */     //   1555: bipush #20
/*     */     //   1557: istore #36
/*     */     //   1559: iconst_0
/*     */     //   1560: istore #50
/*     */     //   1562: iload #36
/*     */     //   1564: i2f
/*     */     //   1565: invokestatic constructor-impl : (F)F
/*     */     //   1568: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1571: aload #32
/*     */     //   1573: bipush #6
/*     */     //   1575: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1578: aload_0
/*     */     //   1579: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode
/*     */     //   1582: invokevirtual getTimestamp : ()J
/*     */     //   1585: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   1588: invokestatic formatTimestamp : (Ljava/lang/Long;)Ljava/lang/String;
/*     */     //   1591: aload_0
/*     */     //   1592: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode
/*     */     //   1595: invokevirtual getEvent : ()Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;
/*     */     //   1598: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   1601: invokestatic summarizeEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)Ljava/lang/String;
/*     */     //   1604: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1609: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1612: checkcast androidx/compose/ui/Modifier
/*     */     //   1615: iconst_0
/*     */     //   1616: aconst_null
/*     */     //   1617: aconst_null
/*     */     //   1618: aload #32
/*     */     //   1620: ldc_w -1355818321
/*     */     //   1623: invokeinterface startReplaceGroup : (I)V
/*     */     //   1628: aload #32
/*     */     //   1630: astore #50
/*     */     //   1632: iload #6
/*     */     //   1634: sipush #896
/*     */     //   1637: iand
/*     */     //   1638: sipush #256
/*     */     //   1641: if_icmpne -> 1648
/*     */     //   1644: iconst_1
/*     */     //   1645: goto -> 1649
/*     */     //   1648: iconst_0
/*     */     //   1649: iload #6
/*     */     //   1651: bipush #14
/*     */     //   1653: iand
/*     */     //   1654: iconst_4
/*     */     //   1655: if_icmpne -> 1662
/*     */     //   1658: iconst_1
/*     */     //   1659: goto -> 1663
/*     */     //   1662: iconst_0
/*     */     //   1663: ior
/*     */     //   1664: istore #37
/*     */     //   1666: iconst_0
/*     */     //   1667: istore #38
/*     */     //   1669: aload #50
/*     */     //   1671: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1676: astore #39
/*     */     //   1678: iconst_0
/*     */     //   1679: istore #40
/*     */     //   1681: iload #37
/*     */     //   1683: ifne -> 1697
/*     */     //   1686: aload #39
/*     */     //   1688: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1691: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1694: if_acmpne -> 1747
/*     */     //   1697: astore #42
/*     */     //   1699: astore #43
/*     */     //   1701: istore #44
/*     */     //   1703: astore #45
/*     */     //   1705: astore #46
/*     */     //   1707: iconst_0
/*     */     //   1708: istore #41
/*     */     //   1710: aload_2
/*     */     //   1711: aload_0
/*     */     //   1712: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;)Lkotlin/jvm/functions/Function0;
/*     */     //   1717: astore #48
/*     */     //   1719: aload #46
/*     */     //   1721: aload #45
/*     */     //   1723: iload #44
/*     */     //   1725: aload #43
/*     */     //   1727: aload #42
/*     */     //   1729: aload #48
/*     */     //   1731: astore #47
/*     */     //   1733: aload #50
/*     */     //   1735: aload #47
/*     */     //   1737: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1742: aload #47
/*     */     //   1744: goto -> 1749
/*     */     //   1747: aload #39
/*     */     //   1749: nop
/*     */     //   1750: nop
/*     */     //   1751: nop
/*     */     //   1752: checkcast kotlin/jvm/functions/Function0
/*     */     //   1755: astore #36
/*     */     //   1757: aload #32
/*     */     //   1759: invokeinterface endReplaceGroup : ()V
/*     */     //   1764: aload #36
/*     */     //   1766: bipush #7
/*     */     //   1768: aconst_null
/*     */     //   1769: invokestatic clickable-XHw0xAI$default : (Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1772: lconst_0
/*     */     //   1773: lconst_0
/*     */     //   1774: aconst_null
/*     */     //   1775: aconst_null
/*     */     //   1776: aconst_null
/*     */     //   1777: lconst_0
/*     */     //   1778: aconst_null
/*     */     //   1779: iconst_0
/*     */     //   1780: lconst_0
/*     */     //   1781: iconst_0
/*     */     //   1782: iconst_0
/*     */     //   1783: iconst_0
/*     */     //   1784: aconst_null
/*     */     //   1785: aconst_null
/*     */     //   1786: aload #32
/*     */     //   1788: iconst_0
/*     */     //   1789: iconst_0
/*     */     //   1790: ldc_w 65532
/*     */     //   1793: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1796: aload #32
/*     */     //   1798: invokeinterface endReplaceGroup : ()V
/*     */     //   1803: goto -> 2103
/*     */     //   1806: aload #35
/*     */     //   1808: instanceof com/intellij/ml/llm/matterhorn/ej/ui/debug/SimpleEventNode
/*     */     //   1811: ifeq -> 2078
/*     */     //   1814: aload #32
/*     */     //   1816: ldc_w 919383596
/*     */     //   1819: invokeinterface startReplaceGroup : (I)V
/*     */     //   1824: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1827: checkcast androidx/compose/ui/Modifier
/*     */     //   1830: bipush #20
/*     */     //   1832: istore #36
/*     */     //   1834: iconst_0
/*     */     //   1835: istore #50
/*     */     //   1837: iload #36
/*     */     //   1839: i2f
/*     */     //   1840: invokestatic constructor-impl : (F)F
/*     */     //   1843: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1846: aload #32
/*     */     //   1848: bipush #6
/*     */     //   1850: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1853: aload_0
/*     */     //   1854: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/SimpleEventNode
/*     */     //   1857: invokevirtual getTimestamp : ()J
/*     */     //   1860: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   1863: invokestatic formatTimestamp : (Ljava/lang/Long;)Ljava/lang/String;
/*     */     //   1866: aload_0
/*     */     //   1867: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/SimpleEventNode
/*     */     //   1870: invokevirtual getEvent : ()Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;
/*     */     //   1873: invokestatic summarizeEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)Ljava/lang/String;
/*     */     //   1876: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1881: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1884: checkcast androidx/compose/ui/Modifier
/*     */     //   1887: iconst_0
/*     */     //   1888: aconst_null
/*     */     //   1889: aconst_null
/*     */     //   1890: aload #32
/*     */     //   1892: ldc_w -1355809041
/*     */     //   1895: invokeinterface startReplaceGroup : (I)V
/*     */     //   1900: aload #32
/*     */     //   1902: astore #50
/*     */     //   1904: iload #6
/*     */     //   1906: sipush #896
/*     */     //   1909: iand
/*     */     //   1910: sipush #256
/*     */     //   1913: if_icmpne -> 1920
/*     */     //   1916: iconst_1
/*     */     //   1917: goto -> 1921
/*     */     //   1920: iconst_0
/*     */     //   1921: iload #6
/*     */     //   1923: bipush #14
/*     */     //   1925: iand
/*     */     //   1926: iconst_4
/*     */     //   1927: if_icmpne -> 1934
/*     */     //   1930: iconst_1
/*     */     //   1931: goto -> 1935
/*     */     //   1934: iconst_0
/*     */     //   1935: ior
/*     */     //   1936: istore #37
/*     */     //   1938: iconst_0
/*     */     //   1939: istore #38
/*     */     //   1941: aload #50
/*     */     //   1943: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1948: astore #39
/*     */     //   1950: iconst_0
/*     */     //   1951: istore #40
/*     */     //   1953: iload #37
/*     */     //   1955: ifne -> 1969
/*     */     //   1958: aload #39
/*     */     //   1960: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1963: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1966: if_acmpne -> 2019
/*     */     //   1969: astore #42
/*     */     //   1971: astore #43
/*     */     //   1973: istore #44
/*     */     //   1975: astore #45
/*     */     //   1977: astore #46
/*     */     //   1979: iconst_0
/*     */     //   1980: istore #41
/*     */     //   1982: aload_2
/*     */     //   1983: aload_0
/*     */     //   1984: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;)Lkotlin/jvm/functions/Function0;
/*     */     //   1989: astore #48
/*     */     //   1991: aload #46
/*     */     //   1993: aload #45
/*     */     //   1995: iload #44
/*     */     //   1997: aload #43
/*     */     //   1999: aload #42
/*     */     //   2001: aload #48
/*     */     //   2003: astore #47
/*     */     //   2005: aload #50
/*     */     //   2007: aload #47
/*     */     //   2009: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2014: aload #47
/*     */     //   2016: goto -> 2021
/*     */     //   2019: aload #39
/*     */     //   2021: nop
/*     */     //   2022: nop
/*     */     //   2023: nop
/*     */     //   2024: checkcast kotlin/jvm/functions/Function0
/*     */     //   2027: astore #36
/*     */     //   2029: aload #32
/*     */     //   2031: invokeinterface endReplaceGroup : ()V
/*     */     //   2036: aload #36
/*     */     //   2038: bipush #7
/*     */     //   2040: aconst_null
/*     */     //   2041: invokestatic clickable-XHw0xAI$default : (Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2044: lconst_0
/*     */     //   2045: lconst_0
/*     */     //   2046: aconst_null
/*     */     //   2047: aconst_null
/*     */     //   2048: aconst_null
/*     */     //   2049: lconst_0
/*     */     //   2050: aconst_null
/*     */     //   2051: iconst_0
/*     */     //   2052: lconst_0
/*     */     //   2053: iconst_0
/*     */     //   2054: iconst_0
/*     */     //   2055: iconst_0
/*     */     //   2056: aconst_null
/*     */     //   2057: aconst_null
/*     */     //   2058: aload #32
/*     */     //   2060: iconst_0
/*     */     //   2061: iconst_0
/*     */     //   2062: ldc_w 65532
/*     */     //   2065: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2068: aload #32
/*     */     //   2070: invokeinterface endReplaceGroup : ()V
/*     */     //   2075: goto -> 2103
/*     */     //   2078: aload #32
/*     */     //   2080: ldc_w -1355847958
/*     */     //   2083: invokeinterface startReplaceGroup : (I)V
/*     */     //   2088: aload #32
/*     */     //   2090: invokeinterface endReplaceGroup : ()V
/*     */     //   2095: new kotlin/NoWhenBranchMatchedException
/*     */     //   2098: dup
/*     */     //   2099: invokespecial <init> : ()V
/*     */     //   2102: athrow
/*     */     //   2103: nop
/*     */     //   2104: aload #29
/*     */     //   2106: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2109: aload #4
/*     */     //   2111: invokeinterface endNode : ()V
/*     */     //   2116: aload #4
/*     */     //   2118: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2121: nop
/*     */     //   2122: aload #4
/*     */     //   2124: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2127: nop
/*     */     //   2128: aload #4
/*     */     //   2130: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2133: nop
/*     */     //   2134: aload_0
/*     */     //   2135: instanceof com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   2138: ifeq -> 2333
/*     */     //   2141: aload #4
/*     */     //   2143: ldc_w 1969096402
/*     */     //   2146: invokeinterface startReplaceGroup : (I)V
/*     */     //   2151: aload_0
/*     */     //   2152: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   2155: invokevirtual getExpanded : ()Landroidx/compose/runtime/MutableState;
/*     */     //   2158: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2163: checkcast java/lang/Boolean
/*     */     //   2166: invokevirtual booleanValue : ()Z
/*     */     //   2169: ifeq -> 2256
/*     */     //   2172: aload_0
/*     */     //   2173: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   2176: invokevirtual getChildren : ()Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   2179: checkcast java/lang/Iterable
/*     */     //   2182: astore #8
/*     */     //   2184: iconst_0
/*     */     //   2185: istore #9
/*     */     //   2187: aload #8
/*     */     //   2189: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   2194: astore #10
/*     */     //   2196: aload #10
/*     */     //   2198: invokeinterface hasNext : ()Z
/*     */     //   2203: ifeq -> 2255
/*     */     //   2206: aload #10
/*     */     //   2208: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   2213: astore #11
/*     */     //   2215: aload #11
/*     */     //   2217: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode
/*     */     //   2220: astore #12
/*     */     //   2222: iconst_0
/*     */     //   2223: istore #13
/*     */     //   2225: aload #12
/*     */     //   2227: iload_1
/*     */     //   2228: iconst_1
/*     */     //   2229: iadd
/*     */     //   2230: aload_2
/*     */     //   2231: aload_3
/*     */     //   2232: aload #4
/*     */     //   2234: sipush #896
/*     */     //   2237: iload #6
/*     */     //   2239: iand
/*     */     //   2240: sipush #7168
/*     */     //   2243: iload #6
/*     */     //   2245: iand
/*     */     //   2246: ior
/*     */     //   2247: invokestatic EventTreeItem : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2250: nop
/*     */     //   2251: nop
/*     */     //   2252: goto -> 2196
/*     */     //   2255: nop
/*     */     //   2256: aload #4
/*     */     //   2258: invokeinterface endReplaceGroup : ()V
/*     */     //   2263: aload_0
/*     */     //   2264: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   2267: invokevirtual getEndNode : ()Landroidx/compose/runtime/MutableState;
/*     */     //   2270: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2275: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode
/*     */     //   2278: dup
/*     */     //   2279: ifnonnull -> 2287
/*     */     //   2282: pop
/*     */     //   2283: aconst_null
/*     */     //   2284: goto -> 2332
/*     */     //   2287: astore #11
/*     */     //   2289: iconst_0
/*     */     //   2290: istore #12
/*     */     //   2292: aload #11
/*     */     //   2294: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode
/*     */     //   2297: iload_1
/*     */     //   2298: aload_2
/*     */     //   2299: aload_3
/*     */     //   2300: aload #4
/*     */     //   2302: bipush #112
/*     */     //   2304: iload #6
/*     */     //   2306: iand
/*     */     //   2307: sipush #896
/*     */     //   2310: iload #6
/*     */     //   2312: iand
/*     */     //   2313: ior
/*     */     //   2314: sipush #7168
/*     */     //   2317: iload #6
/*     */     //   2319: iand
/*     */     //   2320: ior
/*     */     //   2321: invokestatic EventTreeItem : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2324: nop
/*     */     //   2325: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   2328: pop
/*     */     //   2329: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   2332: pop
/*     */     //   2333: invokestatic isTraceInProgress : ()Z
/*     */     //   2336: ifeq -> 2352
/*     */     //   2339: invokestatic traceEventEnd : ()V
/*     */     //   2342: goto -> 2352
/*     */     //   2345: aload #4
/*     */     //   2347: invokeinterface skipToGroupEnd : ()V
/*     */     //   2352: aload #4
/*     */     //   2354: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2359: dup
/*     */     //   2360: ifnull -> 2382
/*     */     //   2363: aload_0
/*     */     //   2364: iload_1
/*     */     //   2365: aload_2
/*     */     //   2366: aload_3
/*     */     //   2367: iload #5
/*     */     //   2369: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;I)Lkotlin/jvm/functions/Function2;
/*     */     //   2374: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2379: goto -> 2383
/*     */     //   2382: pop
/*     */     //   2383: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #204	-> 21
/*     */     //   #207	-> 205
/*     */     //   #216	-> 260
/*     */     //   #608	-> 264
/*     */     //   #609	-> 276
/*     */     //   #610	-> 292
/*     */     //   #216	-> 299
/*     */     //   #610	-> 314
/*     */     //   #611	-> 316
/*     */     //   #612	-> 325
/*     */     //   #613	-> 330
/*     */     //   #609	-> 332
/*     */     //   #608	-> 333
/*     */     //   #608	-> 334
/*     */     //   #216	-> 335
/*     */     //   #208	-> 397
/*     */     //   #614	-> 401
/*     */     //   #615	-> 413
/*     */     //   #616	-> 429
/*     */     //   #208	-> 438
/*     */     //   #616	-> 455
/*     */     //   #617	-> 457
/*     */     //   #618	-> 466
/*     */     //   #619	-> 471
/*     */     //   #615	-> 473
/*     */     //   #614	-> 474
/*     */     //   #614	-> 475
/*     */     //   #208	-> 476
/*     */     //   #207	-> 490
/*     */     //   #227	-> 497
/*     */     //   #228	-> 503
/*     */     //   #229	-> 509
/*     */     //   #230	-> 516
/*     */     //   #620	-> 525
/*     */     //   #230	-> 531
/*     */     //   #620	-> 537
/*     */     //   #230	-> 543
/*     */     //   #620	-> 550
/*     */     //   #230	-> 556
/*     */     //   #226	-> 566
/*     */     //   #621	-> 578
/*     */     //   #622	-> 581
/*     */     //   #623	-> 589
/*     */     //   #626	-> 597
/*     */     //   #627	-> 632
/*     */     //   #628	-> 644
/*     */     //   #629	-> 650
/*     */     //   #630	-> 657
/*     */     //   #631	-> 666
/*     */     //   #633	-> 673
/*     */     //   #632	-> 695
/*     */     //   #634	-> 707
/*     */     //   #635	-> 710
/*     */     //   #636	-> 728
/*     */     //   #637	-> 733
/*     */     //   #638	-> 745
/*     */     //   #640	-> 757
/*     */     //   #642	-> 762
/*     */     //   #643	-> 772
/*     */     //   #644	-> 785
/*     */     //   #646	-> 798
/*     */     //   #647	-> 809
/*     */     //   #648	-> 816
/*     */     //   #649	-> 844
/*     */     //   #650	-> 856
/*     */     //   #652	-> 870
/*     */     //   #647	-> 871
/*     */     //   #652	-> 872
/*     */     //   #653	-> 873
/*     */     //   #654	-> 886
/*     */     //   #642	-> 887
/*     */     //   #655	-> 888
/*     */     //   #656	-> 913
/*     */     //   #232	-> 944
/*     */     //   #233	-> 947
/*     */     //   #235	-> 965
/*     */     //   #235	-> 988
/*     */     //   #236	-> 1001
/*     */     //   #238	-> 1033
/*     */     //   #239	-> 1035
/*     */     //   #240	-> 1041
/*     */     //   #657	-> 1077
/*     */     //   #658	-> 1089
/*     */     //   #659	-> 1105
/*     */     //   #240	-> 1118
/*     */     //   #659	-> 1138
/*     */     //   #660	-> 1140
/*     */     //   #661	-> 1149
/*     */     //   #662	-> 1154
/*     */     //   #658	-> 1156
/*     */     //   #657	-> 1157
/*     */     //   #657	-> 1158
/*     */     //   #240	-> 1159
/*     */     //   #241	-> 1179
/*     */     //   #663	-> 1186
/*     */     //   #241	-> 1192
/*     */     //   #237	-> 1216
/*     */     //   #243	-> 1219
/*     */     //   #664	-> 1231
/*     */     //   #243	-> 1237
/*     */     //   #235	-> 1247
/*     */     //   #244	-> 1257
/*     */     //   #245	-> 1267
/*     */     //   #665	-> 1280
/*     */     //   #245	-> 1286
/*     */     //   #244	-> 1296
/*     */     //   #249	-> 1303
/*     */     //   #250	-> 1334
/*     */     //   #666	-> 1394
/*     */     //   #667	-> 1406
/*     */     //   #668	-> 1422
/*     */     //   #250	-> 1435
/*     */     //   #668	-> 1456
/*     */     //   #669	-> 1458
/*     */     //   #670	-> 1467
/*     */     //   #671	-> 1472
/*     */     //   #667	-> 1474
/*     */     //   #666	-> 1475
/*     */     //   #666	-> 1476
/*     */     //   #250	-> 1477
/*     */     //   #248	-> 1518
/*     */     //   #233	-> 1521
/*     */     //   #255	-> 1531
/*     */     //   #256	-> 1549
/*     */     //   #672	-> 1562
/*     */     //   #256	-> 1568
/*     */     //   #259	-> 1578
/*     */     //   #260	-> 1609
/*     */     //   #673	-> 1669
/*     */     //   #674	-> 1681
/*     */     //   #675	-> 1697
/*     */     //   #260	-> 1710
/*     */     //   #675	-> 1731
/*     */     //   #676	-> 1733
/*     */     //   #677	-> 1742
/*     */     //   #678	-> 1747
/*     */     //   #674	-> 1749
/*     */     //   #673	-> 1750
/*     */     //   #673	-> 1751
/*     */     //   #260	-> 1752
/*     */     //   #258	-> 1793
/*     */     //   #255	-> 1796
/*     */     //   #264	-> 1806
/*     */     //   #265	-> 1824
/*     */     //   #679	-> 1837
/*     */     //   #265	-> 1843
/*     */     //   #268	-> 1853
/*     */     //   #269	-> 1881
/*     */     //   #680	-> 1941
/*     */     //   #681	-> 1953
/*     */     //   #682	-> 1969
/*     */     //   #269	-> 1982
/*     */     //   #682	-> 2003
/*     */     //   #683	-> 2005
/*     */     //   #684	-> 2014
/*     */     //   #685	-> 2019
/*     */     //   #681	-> 2021
/*     */     //   #680	-> 2022
/*     */     //   #680	-> 2023
/*     */     //   #269	-> 2024
/*     */     //   #267	-> 2065
/*     */     //   #264	-> 2068
/*     */     //   #232	-> 2078
/*     */     //   #274	-> 2103
/*     */     //   #656	-> 2104
/*     */     //   #655	-> 2109
/*     */     //   #686	-> 2111
/*     */     //   #634	-> 2118
/*     */     //   #687	-> 2121
/*     */     //   #628	-> 2124
/*     */     //   #688	-> 2127
/*     */     //   #621	-> 2130
/*     */     //   #689	-> 2133
/*     */     //   #277	-> 2134
/*     */     //   #278	-> 2151
/*     */     //   #279	-> 2172
/*     */     //   #690	-> 2187
/*     */     //   #281	-> 2225
/*     */     //   #282	-> 2227
/*     */     //   #283	-> 2230
/*     */     //   #284	-> 2231
/*     */     //   #280	-> 2247
/*     */     //   #286	-> 2250
/*     */     //   #690	-> 2251
/*     */     //   #691	-> 2255
/*     */     //   #289	-> 2263
/*     */     //   #291	-> 2292
/*     */     //   #292	-> 2297
/*     */     //   #293	-> 2298
/*     */     //   #294	-> 2299
/*     */     //   #290	-> 2321
/*     */     //   #296	-> 2324
/*     */     //   #289	-> 2328
/*     */     //   #289	-> 2332
/*     */     //   #298	-> 2345
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   299	7	14	$i$a$-cache-DebugEventsPageKt$EventTreeItem$hoverModifier$1	I
/*     */     //   316	11	15	value$iv	Ljava/lang/Object;
/*     */     //   276	57	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   273	60	12	it$iv	Ljava/lang/Object;
/*     */     //   264	71	11	$i$f$cache	I
/*     */     //   261	74	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   261	74	10	invalid$iv	Z
/*     */     //   438	7	14	$i$a$-cache-DebugEventsPageKt$EventTreeItem$hoverModifier$2	I
/*     */     //   457	11	15	value$iv	Ljava/lang/Object;
/*     */     //   413	61	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   410	64	12	it$iv	Ljava/lang/Object;
/*     */     //   401	75	11	$i$f$cache	I
/*     */     //   398	78	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   398	78	10	invalid$iv	Z
/*     */     //   525	6	9	$i$f$getDp	I
/*     */     //   522	9	8	$this$dp$iv	I
/*     */     //   537	6	9	$i$f$getDp	I
/*     */     //   534	9	8	$this$dp$iv	I
/*     */     //   550	6	9	$i$f$getDp	I
/*     */     //   547	9	8	$this$dp$iv	I
/*     */     //   1118	6	47	$i$a$-cache-DebugEventsPageKt$EventTreeItem$1$1	I
/*     */     //   1140	11	49	value$iv	Ljava/lang/Object;
/*     */     //   1089	68	41	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1086	71	40	it$iv	Ljava/lang/Object;
/*     */     //   1077	82	39	$i$f$cache	I
/*     */     //   1074	85	37	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1074	85	38	invalid$iv	Z
/*     */     //   1186	6	37	$i$f$getDp	I
/*     */     //   1183	9	50	$this$dp$iv	I
/*     */     //   1231	6	37	$i$f$getDp	I
/*     */     //   1228	9	50	$this$dp$iv	I
/*     */     //   1033	214	36	expandCollapseSymbol	Ljava/lang/String;
/*     */     //   1280	6	50	$i$f$getDp	I
/*     */     //   1277	9	36	$this$dp$iv	I
/*     */     //   1435	7	41	$i$a$-cache-DebugEventsPageKt$EventTreeItem$1$2	I
/*     */     //   1458	11	47	value$iv	Ljava/lang/Object;
/*     */     //   1406	69	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1403	72	39	it$iv	Ljava/lang/Object;
/*     */     //   1394	83	38	$i$f$cache	I
/*     */     //   1391	86	50	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1391	86	37	invalid$iv	Z
/*     */     //   1562	6	50	$i$f$getDp	I
/*     */     //   1559	9	36	$this$dp$iv	I
/*     */     //   1710	7	41	$i$a$-cache-DebugEventsPageKt$EventTreeItem$1$3	I
/*     */     //   1733	11	47	value$iv	Ljava/lang/Object;
/*     */     //   1681	69	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1678	72	39	it$iv	Ljava/lang/Object;
/*     */     //   1669	83	38	$i$f$cache	I
/*     */     //   1666	86	50	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1666	86	37	invalid$iv	Z
/*     */     //   1837	6	50	$i$f$getDp	I
/*     */     //   1834	9	36	$this$dp$iv	I
/*     */     //   1982	7	41	$i$a$-cache-DebugEventsPageKt$EventTreeItem$1$4	I
/*     */     //   2005	11	47	value$iv	Ljava/lang/Object;
/*     */     //   1953	69	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1950	72	39	it$iv	Ljava/lang/Object;
/*     */     //   1941	83	38	$i$f$cache	I
/*     */     //   1938	86	50	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1938	86	37	invalid$iv	Z
/*     */     //   944	1160	34	$i$a$-Row-DebugEventsPageKt$EventTreeItem$1	I
/*     */     //   941	1163	33	$this$EventTreeItem_u24lambda_u2443	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   941	1163	32	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   941	1163	31	$changed	I
/*     */     //   905	1204	30	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   902	1207	29	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   902	1207	28	$changed$iv	I
/*     */     //   816	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   813	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   809	64	25	$i$f$set-impl	I
/*     */     //   806	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   772	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   769	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   699	1423	21	$i$f$ReusableComposeNode	I
/*     */     //   696	1426	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   696	1426	20	$changed$iv$iv$iv	I
/*     */     //   636	1492	15	$i$f$Layout	I
/*     */     //   655	1473	16	compositeKeyHash$iv$iv	I
/*     */     //   664	1464	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   673	1455	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   633	1495	14	$changed$iv$iv	I
/*     */     //   570	1564	12	$i$f$Row	I
/*     */     //   623	1511	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   567	1567	8	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   589	1545	9	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   597	1537	10	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   567	1567	11	$changed$iv	I
/*     */     //   2225	26	13	$i$a$-forEach-DebugEventsPageKt$EventTreeItem$2	I
/*     */     //   2222	29	12	child	Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;
/*     */     //   2215	37	11	element$iv	Ljava/lang/Object;
/*     */     //   2187	69	9	$i$f$forEach	I
/*     */     //   2184	72	8	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   2292	33	12	$i$a$-let-DebugEventsPageKt$EventTreeItem$3	I
/*     */     //   2289	36	11	endNode	Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode;
/*     */     //   497	1845	7	hoverModifier	Landroidx/compose/ui/Modifier;
/*     */     //   37	2347	6	$dirty	I
/*     */     //   0	2384	0	node	Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;
/*     */     //   0	2384	1	indent	I
/*     */     //   0	2384	2	onNodeClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2384	3	hoveredGroupId	Landroidx/compose/runtime/MutableState;
/*     */     //   0	2384	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2384	5	$changed	I
/*     */   }
/*     */   
/*     */   private static final boolean EventTreeItem$lambda$34$lambda$33(EventNode $node, MutableState $hoveredGroupId) {
/*     */     if (($node instanceof GroupStartNode || $node instanceof GroupEndNode) && $node.getGroupId() != null)
/*     */       $hoveredGroupId.setValue($node.getGroupId()); 
/*     */     return false;
/*     */   }
/*     */   
/*     */   private static final boolean EventTreeItem$lambda$32$lambda$31(EventNode $node, MutableState $hoveredGroupId) {
/*     */     if (($node instanceof GroupStartNode || $node instanceof GroupEndNode) && Intrinsics.areEqual($hoveredGroupId.getValue(), $node.getGroupId()))
/*     */       $hoveredGroupId.setValue(null); 
/*     */     return false;
/*     */   }
/*     */   
/*     */   private static final Unit EventTreeItem$lambda$43$lambda$36$lambda$35(EventNode $node) {
/*     */     ((GroupStartNode)$node).getExpanded().setValue(Boolean.valueOf(!((Boolean)((GroupStartNode)$node).getExpanded().getValue()).booleanValue()));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventTreeItem$lambda$43$lambda$38$lambda$37(Function1 $onNodeClick, EventNode $node) {
/*     */     $onNodeClick.invoke($node);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventTreeItem$lambda$43$lambda$40$lambda$39(Function1 $onNodeClick, EventNode $node) {
/*     */     $onNodeClick.invoke($node);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventTreeItem$lambda$43$lambda$42$lambda$41(Function1 $onNodeClick, EventNode $node) {
/*     */     $onNodeClick.invoke($node);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventLogScreen$lambda$25(EventLogViewModel $viewModel, int $$changed, Composer $composer, int $force) {
/*     */     EventLogScreen($viewModel, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventTreeView$lambda$30(List<? extends EventNode> $nodes, int $indent, Function1<? super EventNode, Unit> $onNodeClick, MutableState<String> $hoveredGroupId, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     EventTreeView($nodes, $indent, $onNodeClick, $hoveredGroupId, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventTreeItem$lambda$46(EventNode $node, int $indent, Function1<? super EventNode, Unit> $onNodeClick, MutableState<String> $hoveredGroupId, int $$changed, Composer $composer, int $force) {
/*     */     EventTreeItem($node, $indent, $onNodeClick, $hoveredGroupId, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\DebugEventsPageKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */