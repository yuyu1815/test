/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.ColumnKt;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.ColumnScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.layout.SpacerKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import com.intellij.ml.llm.matterhorn.AfterArtifactBuildingFinished;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.BeforeArtifactBuildingStarted;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingFailed;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingFinished;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ActionRequestBuildingStarted;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionFailed;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionFinished;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecutionStarted;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentStateUpdatedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.PlanUpdatedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.StepMetaInfoAppearedEvent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.PlanItem;
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableThrowable;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswerChoice;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmRequestEvent;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmRequestFailed;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmResponseEvent;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornTool;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000`\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\007¢\006\002\020\004\032\025\020\005\032\0020\0012\006\020\006\032\0020\007H\007¢\006\002\020\b\032\025\020\t\032\0020\0012\006\020\n\032\0020\013H\007¢\006\002\020\f\032\035\020\r\032\0020\0012\006\020\016\032\0020\0172\006\020\020\032\0020\021H\007¢\006\002\020\022\032\025\020\023\032\0020\0012\006\020\024\032\0020\025H\007¢\006\002\020\026\032\024\020\027\032\0020\0302\f\020\031\032\b\022\002\b\003\030\0010\032\032\025\020\033\032\0020\0012\006\020\034\032\0020\035H\007¢\006\002\020\036\032\033\020\037\032\0020\0012\f\020 \032\b\022\004\022\0020\"0!H\007¢\006\002\020#\032\025\020$\032\0020\0012\006\020%\032\0020&H\007¢\006\002\020'¨\006("}, d2 = {"EventDetailView", "", "node", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;Landroidx/compose/runtime/Composer;I)V", "MatterhornChatView", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Landroidx/compose/runtime/Composer;I)V", "MatterhornToolView", "tool", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;Landroidx/compose/runtime/Composer;I)V", "MatterhornChatElementView", "index", "", "element", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "(ILcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Landroidx/compose/runtime/Composer;I)V", "EventDetails", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "(Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;Landroidx/compose/runtime/Composer;I)V", "getPresentableArtifactNameAndType", "", "artifactId", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "AIAnswerView", "answer", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "(Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;Landroidx/compose/runtime/Composer;I)V", "ContentChoicesView", "contentChoices", "", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "ModelParametersView", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "(Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nEventDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDetails.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventDetailsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,311:1\n149#2:312\n149#2:353\n149#2:390\n149#2:394\n149#2:397\n149#2:402\n149#2:439\n149#2:486\n149#2:527\n149#2:564\n149#2:569\n149#2:613\n86#3:313\n83#3,6:314\n89#3:348\n93#3:352\n86#3:354\n83#3,6:355\n89#3:389\n93#3:401\n86#3:403\n83#3,6:404\n89#3:438\n86#3:440\n83#3,6:441\n89#3:475\n93#3:481\n93#3:485\n86#3:487\n83#3,6:488\n89#3:522\n93#3:526\n86#3:528\n83#3,6:529\n89#3:563\n93#3:568\n86#3:570\n83#3,6:571\n89#3:605\n93#3:612\n86#3:614\n83#3,6:615\n89#3:649\n93#3:659\n79#4,6:320\n86#4,4:335\n90#4,2:345\n94#4:351\n79#4,6:361\n86#4,4:376\n90#4,2:386\n94#4:400\n79#4,6:410\n86#4,4:425\n90#4,2:435\n79#4,6:447\n86#4,4:462\n90#4,2:472\n94#4:480\n94#4:484\n79#4,6:494\n86#4,4:509\n90#4,2:519\n94#4:525\n79#4,6:535\n86#4,4:550\n90#4,2:560\n94#4:567\n79#4,6:577\n86#4,4:592\n90#4,2:602\n94#4:611\n79#4,6:621\n86#4,4:636\n90#4,2:646\n94#4:658\n368#5,9:326\n377#5:347\n378#5,2:349\n368#5,9:367\n377#5:388\n378#5,2:398\n368#5,9:416\n377#5:437\n368#5,9:453\n377#5:474\n378#5,2:478\n378#5,2:482\n368#5,9:500\n377#5:521\n378#5,2:523\n368#5,9:541\n377#5:562\n378#5,2:565\n368#5,9:583\n377#5:604\n378#5,2:609\n368#5,9:627\n377#5:648\n378#5,2:656\n4034#6,6:339\n4034#6,6:380\n4034#6,6:429\n4034#6,6:466\n4034#6,6:513\n4034#6,6:554\n4034#6,6:596\n4034#6,6:640\n1872#7,3:391\n1863#7,2:395\n1863#7,2:476\n1872#7,3:606\n1225#8,6:650\n*S KotlinDebug\n*F\n+ 1 EventDetails.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventDetailsKt\n*L\n24#1:312\n51#1:353\n53#1:390\n61#1:394\n68#1:397\n75#1:402\n88#1:439\n99#1:486\n246#1:527\n256#1:564\n266#1:569\n276#1:613\n24#1:313\n24#1:314,6\n24#1:348\n24#1:352\n51#1:354\n51#1:355,6\n51#1:389\n51#1:401\n75#1:403\n75#1:404,6\n75#1:438\n88#1:440\n88#1:441,6\n88#1:475\n88#1:481\n75#1:485\n99#1:487\n99#1:488,6\n99#1:522\n99#1:526\n246#1:528\n246#1:529,6\n246#1:563\n246#1:568\n266#1:570\n266#1:571,6\n266#1:605\n266#1:612\n276#1:614\n276#1:615,6\n276#1:649\n276#1:659\n24#1:320,6\n24#1:335,4\n24#1:345,2\n24#1:351\n51#1:361,6\n51#1:376,4\n51#1:386,2\n51#1:400\n75#1:410,6\n75#1:425,4\n75#1:435,2\n88#1:447,6\n88#1:462,4\n88#1:472,2\n88#1:480\n75#1:484\n99#1:494,6\n99#1:509,4\n99#1:519,2\n99#1:525\n246#1:535,6\n246#1:550,4\n246#1:560,2\n246#1:567\n266#1:577,6\n266#1:592,4\n266#1:602,2\n266#1:611\n276#1:621,6\n276#1:636,4\n276#1:646,2\n276#1:658\n24#1:326,9\n24#1:347\n24#1:349,2\n51#1:367,9\n51#1:388\n51#1:398,2\n75#1:416,9\n75#1:437\n88#1:453,9\n88#1:474\n88#1:478,2\n75#1:482,2\n99#1:500,9\n99#1:521\n99#1:523,2\n246#1:541,9\n246#1:562\n246#1:565,2\n266#1:583,9\n266#1:604\n266#1:609,2\n276#1:627,9\n276#1:648\n276#1:656,2\n24#1:339,6\n51#1:380,6\n75#1:429,6\n88#1:466,6\n99#1:513,6\n246#1:554,6\n266#1:596,6\n276#1:640,6\n56#1:391,3\n63#1:395,2\n89#1:476,2\n267#1:606,3\n304#1:650,6\n*E\n"})
/*     */ public final class EventDetailsKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void EventDetailView(@NotNull EventNode node, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'node'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 1358945494
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
/*     */     //   27: invokeinterface changed : (Ljava/lang/Object;)Z
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
/*     */     //   55: ifne -> 959
/*     */     //   58: invokestatic isTraceInProgress : ()Z
/*     */     //   61: ifeq -> 73
/*     */     //   64: ldc 1358945494
/*     */     //   66: iload_3
/*     */     //   67: iconst_m1
/*     */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.debug.EventDetailView (EventDetails.kt:22)'
/*     */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   73: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   76: checkcast androidx/compose/ui/Modifier
/*     */     //   79: bipush #8
/*     */     //   81: istore #4
/*     */     //   83: iconst_0
/*     */     //   84: istore #5
/*     */     //   86: iload #4
/*     */     //   88: i2f
/*     */     //   89: invokestatic constructor-impl : (F)F
/*     */     //   92: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   95: astore #4
/*     */     //   97: bipush #6
/*     */     //   99: istore #7
/*     */     //   101: iconst_0
/*     */     //   102: istore #8
/*     */     //   104: aload_1
/*     */     //   105: ldc -483455358
/*     */     //   107: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   109: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   112: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   115: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   118: astore #5
/*     */     //   120: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   123: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   126: astore #6
/*     */     //   128: aload #5
/*     */     //   130: aload #6
/*     */     //   132: aload_1
/*     */     //   133: bipush #14
/*     */     //   135: iload #7
/*     */     //   137: iconst_3
/*     */     //   138: ishr
/*     */     //   139: iand
/*     */     //   140: bipush #112
/*     */     //   142: iload #7
/*     */     //   144: iconst_3
/*     */     //   145: ishr
/*     */     //   146: iand
/*     */     //   147: ior
/*     */     //   148: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   151: astore #9
/*     */     //   153: bipush #112
/*     */     //   155: iload #7
/*     */     //   157: iconst_3
/*     */     //   158: ishl
/*     */     //   159: iand
/*     */     //   160: istore #10
/*     */     //   162: nop
/*     */     //   163: iconst_0
/*     */     //   164: istore #11
/*     */     //   166: aload_1
/*     */     //   167: ldc -1323940314
/*     */     //   169: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   171: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   174: aload_1
/*     */     //   175: iconst_0
/*     */     //   176: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   179: istore #12
/*     */     //   181: aload_1
/*     */     //   182: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   187: astore #13
/*     */     //   189: aload_1
/*     */     //   190: aload #4
/*     */     //   192: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   195: astore #14
/*     */     //   197: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   200: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   203: astore #15
/*     */     //   205: bipush #6
/*     */     //   207: sipush #896
/*     */     //   210: iload #10
/*     */     //   212: bipush #6
/*     */     //   214: ishl
/*     */     //   215: iand
/*     */     //   216: ior
/*     */     //   217: istore #16
/*     */     //   219: nop
/*     */     //   220: iconst_0
/*     */     //   221: istore #17
/*     */     //   223: aload_1
/*     */     //   224: ldc -692256719
/*     */     //   226: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   228: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   231: aload_1
/*     */     //   232: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   237: instanceof androidx/compose/runtime/Applier
/*     */     //   240: ifne -> 246
/*     */     //   243: invokestatic invalidApplier : ()V
/*     */     //   246: aload_1
/*     */     //   247: invokeinterface startReusableNode : ()V
/*     */     //   252: aload_1
/*     */     //   253: invokeinterface getInserting : ()Z
/*     */     //   258: ifeq -> 272
/*     */     //   261: aload_1
/*     */     //   262: aload #15
/*     */     //   264: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   269: goto -> 278
/*     */     //   272: aload_1
/*     */     //   273: invokeinterface useNode : ()V
/*     */     //   278: aload_1
/*     */     //   279: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   282: astore #18
/*     */     //   284: iconst_0
/*     */     //   285: istore #19
/*     */     //   287: aload #18
/*     */     //   289: aload #9
/*     */     //   291: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   294: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   297: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   300: aload #18
/*     */     //   302: aload #13
/*     */     //   304: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   307: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   310: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   313: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   316: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   319: astore #20
/*     */     //   321: iconst_0
/*     */     //   322: istore #21
/*     */     //   324: aload #18
/*     */     //   326: astore #22
/*     */     //   328: iconst_0
/*     */     //   329: istore #23
/*     */     //   331: aload #22
/*     */     //   333: invokeinterface getInserting : ()Z
/*     */     //   338: ifne -> 359
/*     */     //   341: aload #22
/*     */     //   343: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   348: iload #12
/*     */     //   350: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   353: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   356: ifne -> 385
/*     */     //   359: aload #22
/*     */     //   361: iload #12
/*     */     //   363: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   366: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   371: aload #18
/*     */     //   373: iload #12
/*     */     //   375: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   378: aload #20
/*     */     //   380: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   385: nop
/*     */     //   386: nop
/*     */     //   387: nop
/*     */     //   388: aload #18
/*     */     //   390: aload #14
/*     */     //   392: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   395: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   398: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   401: nop
/*     */     //   402: nop
/*     */     //   403: aload_1
/*     */     //   404: bipush #14
/*     */     //   406: iload #16
/*     */     //   408: bipush #6
/*     */     //   410: ishr
/*     */     //   411: iand
/*     */     //   412: istore #24
/*     */     //   414: astore #25
/*     */     //   416: iconst_0
/*     */     //   417: istore #26
/*     */     //   419: aload #25
/*     */     //   421: ldc -384784025
/*     */     //   423: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   425: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   428: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   431: aload #25
/*     */     //   433: bipush #6
/*     */     //   435: bipush #112
/*     */     //   437: iload #7
/*     */     //   439: bipush #6
/*     */     //   441: ishr
/*     */     //   442: iand
/*     */     //   443: ior
/*     */     //   444: istore #27
/*     */     //   446: astore #28
/*     */     //   448: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   451: astore #29
/*     */     //   453: iconst_0
/*     */     //   454: istore #30
/*     */     //   456: ldc 'Event Details'
/*     */     //   458: aconst_null
/*     */     //   459: lconst_0
/*     */     //   460: lconst_0
/*     */     //   461: aconst_null
/*     */     //   462: aconst_null
/*     */     //   463: aconst_null
/*     */     //   464: lconst_0
/*     */     //   465: aconst_null
/*     */     //   466: iconst_0
/*     */     //   467: lconst_0
/*     */     //   468: iconst_0
/*     */     //   469: iconst_0
/*     */     //   470: iconst_0
/*     */     //   471: aconst_null
/*     */     //   472: aconst_null
/*     */     //   473: aload #28
/*     */     //   475: bipush #6
/*     */     //   477: iconst_0
/*     */     //   478: ldc 65534
/*     */     //   480: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   483: aload_0
/*     */     //   484: invokevirtual getEvent : ()Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;
/*     */     //   487: invokestatic getEventCategory : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventCategory;
/*     */     //   490: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventCategory;)Ljava/lang/String;
/*     */     //   495: aconst_null
/*     */     //   496: lconst_0
/*     */     //   497: lconst_0
/*     */     //   498: aconst_null
/*     */     //   499: aconst_null
/*     */     //   500: aconst_null
/*     */     //   501: lconst_0
/*     */     //   502: aconst_null
/*     */     //   503: iconst_0
/*     */     //   504: lconst_0
/*     */     //   505: iconst_0
/*     */     //   506: iconst_0
/*     */     //   507: iconst_0
/*     */     //   508: aconst_null
/*     */     //   509: aconst_null
/*     */     //   510: aload #28
/*     */     //   512: iconst_0
/*     */     //   513: iconst_0
/*     */     //   514: ldc 65534
/*     */     //   516: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   519: aload_0
/*     */     //   520: astore #31
/*     */     //   522: aload #31
/*     */     //   524: instanceof com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   527: ifeq -> 643
/*     */     //   530: aload #28
/*     */     //   532: ldc -1310209027
/*     */     //   534: invokeinterface startReplaceGroup : (I)V
/*     */     //   539: aload_0
/*     */     //   540: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   543: invokevirtual getTimestamp : ()J
/*     */     //   546: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   549: invokestatic formatTimestamp : (Ljava/lang/Long;)Ljava/lang/String;
/*     */     //   552: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   557: aconst_null
/*     */     //   558: lconst_0
/*     */     //   559: lconst_0
/*     */     //   560: aconst_null
/*     */     //   561: aconst_null
/*     */     //   562: aconst_null
/*     */     //   563: lconst_0
/*     */     //   564: aconst_null
/*     */     //   565: iconst_0
/*     */     //   566: lconst_0
/*     */     //   567: iconst_0
/*     */     //   568: iconst_0
/*     */     //   569: iconst_0
/*     */     //   570: aconst_null
/*     */     //   571: aconst_null
/*     */     //   572: aload #28
/*     */     //   574: iconst_0
/*     */     //   575: iconst_0
/*     */     //   576: ldc 65534
/*     */     //   578: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   581: aload_0
/*     */     //   582: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   585: invokevirtual getGroupKey : ()Ljava/lang/String;
/*     */     //   588: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   593: aconst_null
/*     */     //   594: lconst_0
/*     */     //   595: lconst_0
/*     */     //   596: aconst_null
/*     */     //   597: aconst_null
/*     */     //   598: aconst_null
/*     */     //   599: lconst_0
/*     */     //   600: aconst_null
/*     */     //   601: iconst_0
/*     */     //   602: lconst_0
/*     */     //   603: iconst_0
/*     */     //   604: iconst_0
/*     */     //   605: iconst_0
/*     */     //   606: aconst_null
/*     */     //   607: aconst_null
/*     */     //   608: aload #28
/*     */     //   610: iconst_0
/*     */     //   611: iconst_0
/*     */     //   612: ldc 65534
/*     */     //   614: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   617: aload_0
/*     */     //   618: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode
/*     */     //   621: invokevirtual getEvent : ()Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;
/*     */     //   624: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   627: aload #28
/*     */     //   629: iconst_0
/*     */     //   630: invokestatic EventDetails : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;Landroidx/compose/runtime/Composer;I)V
/*     */     //   633: aload #28
/*     */     //   635: invokeinterface endReplaceGroup : ()V
/*     */     //   640: goto -> 920
/*     */     //   643: aload #31
/*     */     //   645: instanceof com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode
/*     */     //   648: ifeq -> 765
/*     */     //   651: aload #28
/*     */     //   653: ldc_w -1310017633
/*     */     //   656: invokeinterface startReplaceGroup : (I)V
/*     */     //   661: aload_0
/*     */     //   662: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode
/*     */     //   665: invokevirtual getTimestamp : ()J
/*     */     //   668: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   671: invokestatic formatTimestamp : (Ljava/lang/Long;)Ljava/lang/String;
/*     */     //   674: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   679: aconst_null
/*     */     //   680: lconst_0
/*     */     //   681: lconst_0
/*     */     //   682: aconst_null
/*     */     //   683: aconst_null
/*     */     //   684: aconst_null
/*     */     //   685: lconst_0
/*     */     //   686: aconst_null
/*     */     //   687: iconst_0
/*     */     //   688: lconst_0
/*     */     //   689: iconst_0
/*     */     //   690: iconst_0
/*     */     //   691: iconst_0
/*     */     //   692: aconst_null
/*     */     //   693: aconst_null
/*     */     //   694: aload #28
/*     */     //   696: iconst_0
/*     */     //   697: iconst_0
/*     */     //   698: ldc 65534
/*     */     //   700: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   703: aload_0
/*     */     //   704: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode
/*     */     //   707: invokevirtual getGroupKey : ()Ljava/lang/String;
/*     */     //   710: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   715: aconst_null
/*     */     //   716: lconst_0
/*     */     //   717: lconst_0
/*     */     //   718: aconst_null
/*     */     //   719: aconst_null
/*     */     //   720: aconst_null
/*     */     //   721: lconst_0
/*     */     //   722: aconst_null
/*     */     //   723: iconst_0
/*     */     //   724: lconst_0
/*     */     //   725: iconst_0
/*     */     //   726: iconst_0
/*     */     //   727: iconst_0
/*     */     //   728: aconst_null
/*     */     //   729: aconst_null
/*     */     //   730: aload #28
/*     */     //   732: iconst_0
/*     */     //   733: iconst_0
/*     */     //   734: ldc 65534
/*     */     //   736: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   739: aload_0
/*     */     //   740: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode
/*     */     //   743: invokevirtual getEvent : ()Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;
/*     */     //   746: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   749: aload #28
/*     */     //   751: iconst_0
/*     */     //   752: invokestatic EventDetails : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;Landroidx/compose/runtime/Composer;I)V
/*     */     //   755: aload #28
/*     */     //   757: invokeinterface endReplaceGroup : ()V
/*     */     //   762: goto -> 920
/*     */     //   765: aload #31
/*     */     //   767: instanceof com/intellij/ml/llm/matterhorn/ej/ui/debug/SimpleEventNode
/*     */     //   770: ifeq -> 895
/*     */     //   773: aload #28
/*     */     //   775: ldc_w -1309824937
/*     */     //   778: invokeinterface startReplaceGroup : (I)V
/*     */     //   783: aload_0
/*     */     //   784: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/SimpleEventNode
/*     */     //   787: invokevirtual getTimestamp : ()J
/*     */     //   790: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   793: invokestatic formatTimestamp : (Ljava/lang/Long;)Ljava/lang/String;
/*     */     //   796: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   801: aconst_null
/*     */     //   802: lconst_0
/*     */     //   803: lconst_0
/*     */     //   804: aconst_null
/*     */     //   805: aconst_null
/*     */     //   806: aconst_null
/*     */     //   807: lconst_0
/*     */     //   808: aconst_null
/*     */     //   809: iconst_0
/*     */     //   810: lconst_0
/*     */     //   811: iconst_0
/*     */     //   812: iconst_0
/*     */     //   813: iconst_0
/*     */     //   814: aconst_null
/*     */     //   815: aconst_null
/*     */     //   816: aload #28
/*     */     //   818: iconst_0
/*     */     //   819: iconst_0
/*     */     //   820: ldc 65534
/*     */     //   822: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   825: aload_0
/*     */     //   826: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/SimpleEventNode
/*     */     //   829: invokevirtual getEvent : ()Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;
/*     */     //   832: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   835: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   838: invokeinterface getSimpleName : ()Ljava/lang/String;
/*     */     //   843: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   848: aconst_null
/*     */     //   849: lconst_0
/*     */     //   850: lconst_0
/*     */     //   851: aconst_null
/*     */     //   852: aconst_null
/*     */     //   853: aconst_null
/*     */     //   854: lconst_0
/*     */     //   855: aconst_null
/*     */     //   856: iconst_0
/*     */     //   857: lconst_0
/*     */     //   858: iconst_0
/*     */     //   859: iconst_0
/*     */     //   860: iconst_0
/*     */     //   861: aconst_null
/*     */     //   862: aconst_null
/*     */     //   863: aload #28
/*     */     //   865: iconst_0
/*     */     //   866: iconst_0
/*     */     //   867: ldc 65534
/*     */     //   869: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   872: aload_0
/*     */     //   873: checkcast com/intellij/ml/llm/matterhorn/ej/ui/debug/SimpleEventNode
/*     */     //   876: invokevirtual getEvent : ()Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;
/*     */     //   879: aload #28
/*     */     //   881: iconst_0
/*     */     //   882: invokestatic EventDetails : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;Landroidx/compose/runtime/Composer;I)V
/*     */     //   885: aload #28
/*     */     //   887: invokeinterface endReplaceGroup : ()V
/*     */     //   892: goto -> 920
/*     */     //   895: aload #28
/*     */     //   897: ldc_w 373376317
/*     */     //   900: invokeinterface startReplaceGroup : (I)V
/*     */     //   905: aload #28
/*     */     //   907: invokeinterface endReplaceGroup : ()V
/*     */     //   912: new kotlin/NoWhenBranchMatchedException
/*     */     //   915: dup
/*     */     //   916: invokespecial <init> : ()V
/*     */     //   919: athrow
/*     */     //   920: nop
/*     */     //   921: aload #25
/*     */     //   923: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   926: aload_1
/*     */     //   927: invokeinterface endNode : ()V
/*     */     //   932: aload_1
/*     */     //   933: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   936: nop
/*     */     //   937: aload_1
/*     */     //   938: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   941: nop
/*     */     //   942: aload_1
/*     */     //   943: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   946: nop
/*     */     //   947: invokestatic isTraceInProgress : ()Z
/*     */     //   950: ifeq -> 965
/*     */     //   953: invokestatic traceEventEnd : ()V
/*     */     //   956: goto -> 965
/*     */     //   959: aload_1
/*     */     //   960: invokeinterface skipToGroupEnd : ()V
/*     */     //   965: aload_1
/*     */     //   966: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   971: dup
/*     */     //   972: ifnull -> 990
/*     */     //   975: aload_0
/*     */     //   976: iload_2
/*     */     //   977: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;I)Lkotlin/jvm/functions/Function2;
/*     */     //   982: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   987: goto -> 991
/*     */     //   990: pop
/*     */     //   991: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #23	-> 6
/*     */     //   #24	-> 73
/*     */     //   #312	-> 86
/*     */     //   #24	-> 92
/*     */     //   #313	-> 109
/*     */     //   #314	-> 112
/*     */     //   #315	-> 120
/*     */     //   #318	-> 128
/*     */     //   #319	-> 162
/*     */     //   #320	-> 171
/*     */     //   #321	-> 176
/*     */     //   #322	-> 182
/*     */     //   #323	-> 190
/*     */     //   #325	-> 197
/*     */     //   #324	-> 219
/*     */     //   #326	-> 228
/*     */     //   #327	-> 231
/*     */     //   #328	-> 247
/*     */     //   #329	-> 252
/*     */     //   #330	-> 262
/*     */     //   #332	-> 273
/*     */     //   #334	-> 278
/*     */     //   #335	-> 287
/*     */     //   #336	-> 300
/*     */     //   #338	-> 313
/*     */     //   #339	-> 324
/*     */     //   #340	-> 331
/*     */     //   #341	-> 359
/*     */     //   #342	-> 371
/*     */     //   #344	-> 385
/*     */     //   #339	-> 386
/*     */     //   #344	-> 387
/*     */     //   #345	-> 388
/*     */     //   #346	-> 401
/*     */     //   #334	-> 402
/*     */     //   #347	-> 403
/*     */     //   #348	-> 425
/*     */     //   #25	-> 456
/*     */     //   #26	-> 483
/*     */     //   #27	-> 519
/*     */     //   #28	-> 522
/*     */     //   #29	-> 539
/*     */     //   #30	-> 581
/*     */     //   #31	-> 617
/*     */     //   #28	-> 633
/*     */     //   #34	-> 643
/*     */     //   #35	-> 661
/*     */     //   #36	-> 703
/*     */     //   #37	-> 739
/*     */     //   #34	-> 755
/*     */     //   #40	-> 765
/*     */     //   #41	-> 783
/*     */     //   #42	-> 825
/*     */     //   #43	-> 872
/*     */     //   #40	-> 885
/*     */     //   #27	-> 895
/*     */     //   #46	-> 920
/*     */     //   #348	-> 921
/*     */     //   #347	-> 926
/*     */     //   #349	-> 927
/*     */     //   #326	-> 933
/*     */     //   #350	-> 936
/*     */     //   #320	-> 938
/*     */     //   #351	-> 941
/*     */     //   #313	-> 943
/*     */     //   #352	-> 946
/*     */     //   #47	-> 959
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   86	6	5	$i$f$getDp	I
/*     */     //   83	9	4	$this$dp$iv	I
/*     */     //   456	465	30	$i$a$-Column-EventDetailsKt$EventDetailView$1	I
/*     */     //   453	468	29	$this$EventDetailView_u24lambda_u240	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   453	468	28	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   453	468	27	$changed	I
/*     */     //   419	507	26	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   416	510	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   416	510	24	$changed$iv	I
/*     */     //   331	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   328	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   324	64	21	$i$f$set-impl	I
/*     */     //   321	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   287	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   284	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   223	714	17	$i$f$ReusableComposeNode	I
/*     */     //   220	717	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   220	717	16	$changed$iv$iv$iv	I
/*     */     //   166	776	11	$i$f$Layout	I
/*     */     //   181	761	12	compositeKeyHash$iv$iv	I
/*     */     //   189	753	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   197	745	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   163	779	10	$changed$iv$iv	I
/*     */     //   104	843	8	$i$f$Column	I
/*     */     //   153	794	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   101	846	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   120	827	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   128	819	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   101	846	7	$changed$iv	I
/*     */     //   17	975	3	$dirty	I
/*     */     //   0	992	0	node	Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;
/*     */     //   0	992	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	992	2	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void MatterhornChatView(@NotNull MatterhornChat chat, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'chat'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w -1559579753
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_1
/*     */     //   17: iload_2
/*     */     //   18: istore_3
/*     */     //   19: iload_2
/*     */     //   20: bipush #6
/*     */     //   22: iand
/*     */     //   23: ifne -> 44
/*     */     //   26: iload_3
/*     */     //   27: aload_1
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: iconst_3
/*     */     //   46: iand
/*     */     //   47: iconst_2
/*     */     //   48: if_icmpne -> 60
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getSkipping : ()Z
/*     */     //   57: ifne -> 939
/*     */     //   60: invokestatic isTraceInProgress : ()Z
/*     */     //   63: ifeq -> 77
/*     */     //   66: ldc_w -1559579753
/*     */     //   69: iload_3
/*     */     //   70: iconst_m1
/*     */     //   71: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.MatterhornChatView (EventDetails.kt:49)'
/*     */     //   74: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   77: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   80: checkcast androidx/compose/ui/Modifier
/*     */     //   83: bipush #16
/*     */     //   85: istore #4
/*     */     //   87: iconst_0
/*     */     //   88: istore #5
/*     */     //   90: iload #4
/*     */     //   92: i2f
/*     */     //   93: invokestatic constructor-impl : (F)F
/*     */     //   96: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   99: astore #4
/*     */     //   101: bipush #6
/*     */     //   103: istore #7
/*     */     //   105: iconst_0
/*     */     //   106: istore #8
/*     */     //   108: aload_1
/*     */     //   109: ldc -483455358
/*     */     //   111: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   113: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   116: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   119: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   122: astore #5
/*     */     //   124: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   127: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   130: astore #6
/*     */     //   132: aload #5
/*     */     //   134: aload #6
/*     */     //   136: aload_1
/*     */     //   137: bipush #14
/*     */     //   139: iload #7
/*     */     //   141: iconst_3
/*     */     //   142: ishr
/*     */     //   143: iand
/*     */     //   144: bipush #112
/*     */     //   146: iload #7
/*     */     //   148: iconst_3
/*     */     //   149: ishr
/*     */     //   150: iand
/*     */     //   151: ior
/*     */     //   152: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   155: astore #9
/*     */     //   157: bipush #112
/*     */     //   159: iload #7
/*     */     //   161: iconst_3
/*     */     //   162: ishl
/*     */     //   163: iand
/*     */     //   164: istore #10
/*     */     //   166: nop
/*     */     //   167: iconst_0
/*     */     //   168: istore #11
/*     */     //   170: aload_1
/*     */     //   171: ldc -1323940314
/*     */     //   173: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   175: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   178: aload_1
/*     */     //   179: iconst_0
/*     */     //   180: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   183: istore #12
/*     */     //   185: aload_1
/*     */     //   186: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   191: astore #13
/*     */     //   193: aload_1
/*     */     //   194: aload #4
/*     */     //   196: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   199: astore #14
/*     */     //   201: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   204: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   207: astore #15
/*     */     //   209: bipush #6
/*     */     //   211: sipush #896
/*     */     //   214: iload #10
/*     */     //   216: bipush #6
/*     */     //   218: ishl
/*     */     //   219: iand
/*     */     //   220: ior
/*     */     //   221: istore #16
/*     */     //   223: nop
/*     */     //   224: iconst_0
/*     */     //   225: istore #17
/*     */     //   227: aload_1
/*     */     //   228: ldc -692256719
/*     */     //   230: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   232: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   235: aload_1
/*     */     //   236: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   241: instanceof androidx/compose/runtime/Applier
/*     */     //   244: ifne -> 250
/*     */     //   247: invokestatic invalidApplier : ()V
/*     */     //   250: aload_1
/*     */     //   251: invokeinterface startReusableNode : ()V
/*     */     //   256: aload_1
/*     */     //   257: invokeinterface getInserting : ()Z
/*     */     //   262: ifeq -> 276
/*     */     //   265: aload_1
/*     */     //   266: aload #15
/*     */     //   268: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   273: goto -> 282
/*     */     //   276: aload_1
/*     */     //   277: invokeinterface useNode : ()V
/*     */     //   282: aload_1
/*     */     //   283: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   286: astore #18
/*     */     //   288: iconst_0
/*     */     //   289: istore #19
/*     */     //   291: aload #18
/*     */     //   293: aload #9
/*     */     //   295: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   298: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   301: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   304: aload #18
/*     */     //   306: aload #13
/*     */     //   308: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   311: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   314: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   317: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   320: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   323: astore #20
/*     */     //   325: iconst_0
/*     */     //   326: istore #21
/*     */     //   328: aload #18
/*     */     //   330: astore #22
/*     */     //   332: iconst_0
/*     */     //   333: istore #23
/*     */     //   335: aload #22
/*     */     //   337: invokeinterface getInserting : ()Z
/*     */     //   342: ifne -> 363
/*     */     //   345: aload #22
/*     */     //   347: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   352: iload #12
/*     */     //   354: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   357: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   360: ifne -> 389
/*     */     //   363: aload #22
/*     */     //   365: iload #12
/*     */     //   367: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   370: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   375: aload #18
/*     */     //   377: iload #12
/*     */     //   379: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   382: aload #20
/*     */     //   384: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   389: nop
/*     */     //   390: nop
/*     */     //   391: nop
/*     */     //   392: aload #18
/*     */     //   394: aload #14
/*     */     //   396: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   399: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   402: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   405: nop
/*     */     //   406: nop
/*     */     //   407: aload_1
/*     */     //   408: bipush #14
/*     */     //   410: iload #16
/*     */     //   412: bipush #6
/*     */     //   414: ishr
/*     */     //   415: iand
/*     */     //   416: istore #24
/*     */     //   418: astore #25
/*     */     //   420: iconst_0
/*     */     //   421: istore #26
/*     */     //   423: aload #25
/*     */     //   425: ldc -384784025
/*     */     //   427: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   429: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   432: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   435: aload #25
/*     */     //   437: bipush #6
/*     */     //   439: bipush #112
/*     */     //   441: iload #7
/*     */     //   443: bipush #6
/*     */     //   445: ishr
/*     */     //   446: iand
/*     */     //   447: ior
/*     */     //   448: istore #27
/*     */     //   450: astore #28
/*     */     //   452: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   455: astore #29
/*     */     //   457: iconst_0
/*     */     //   458: istore #30
/*     */     //   460: aload_0
/*     */     //   461: invokevirtual getSystem : ()Ljava/lang/String;
/*     */     //   464: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   469: aconst_null
/*     */     //   470: lconst_0
/*     */     //   471: lconst_0
/*     */     //   472: aconst_null
/*     */     //   473: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   476: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   479: aconst_null
/*     */     //   480: lconst_0
/*     */     //   481: aconst_null
/*     */     //   482: iconst_0
/*     */     //   483: lconst_0
/*     */     //   484: iconst_0
/*     */     //   485: iconst_0
/*     */     //   486: iconst_0
/*     */     //   487: aconst_null
/*     */     //   488: aconst_null
/*     */     //   489: aload #28
/*     */     //   491: ldc_w 196608
/*     */     //   494: iconst_0
/*     */     //   495: ldc_w 65502
/*     */     //   498: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   501: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   504: checkcast androidx/compose/ui/Modifier
/*     */     //   507: bipush #8
/*     */     //   509: istore #31
/*     */     //   511: iconst_0
/*     */     //   512: istore #32
/*     */     //   514: iload #31
/*     */     //   516: i2f
/*     */     //   517: invokestatic constructor-impl : (F)F
/*     */     //   520: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   523: aload #28
/*     */     //   525: bipush #6
/*     */     //   527: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   530: ldc_w 'Messages:'
/*     */     //   533: aconst_null
/*     */     //   534: lconst_0
/*     */     //   535: lconst_0
/*     */     //   536: aconst_null
/*     */     //   537: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   540: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   543: aconst_null
/*     */     //   544: lconst_0
/*     */     //   545: aconst_null
/*     */     //   546: iconst_0
/*     */     //   547: lconst_0
/*     */     //   548: iconst_0
/*     */     //   549: iconst_0
/*     */     //   550: iconst_0
/*     */     //   551: aconst_null
/*     */     //   552: aconst_null
/*     */     //   553: aload #28
/*     */     //   555: ldc_w 196614
/*     */     //   558: iconst_0
/*     */     //   559: ldc_w 65502
/*     */     //   562: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   565: aload #28
/*     */     //   567: ldc_w 2084763432
/*     */     //   570: invokeinterface startReplaceGroup : (I)V
/*     */     //   575: aload_0
/*     */     //   576: invokevirtual getMessages : ()Ljava/util/List;
/*     */     //   579: checkcast java/lang/Iterable
/*     */     //   582: astore #31
/*     */     //   584: iconst_0
/*     */     //   585: istore #32
/*     */     //   587: iconst_0
/*     */     //   588: istore #33
/*     */     //   590: aload #31
/*     */     //   592: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   597: astore #34
/*     */     //   599: aload #34
/*     */     //   601: invokeinterface hasNext : ()Z
/*     */     //   606: ifeq -> 662
/*     */     //   609: aload #34
/*     */     //   611: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   616: astore #35
/*     */     //   618: iload #33
/*     */     //   620: iinc #33, 1
/*     */     //   623: istore #36
/*     */     //   625: iload #36
/*     */     //   627: ifge -> 633
/*     */     //   630: invokestatic throwIndexOverflow : ()V
/*     */     //   633: iload #36
/*     */     //   635: aload #35
/*     */     //   637: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   640: astore #37
/*     */     //   642: istore #38
/*     */     //   644: iconst_0
/*     */     //   645: istore #39
/*     */     //   647: iload #38
/*     */     //   649: aload #37
/*     */     //   651: aload #28
/*     */     //   653: iconst_0
/*     */     //   654: invokestatic MatterhornChatElementView : (ILcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Landroidx/compose/runtime/Composer;I)V
/*     */     //   657: nop
/*     */     //   658: nop
/*     */     //   659: goto -> 599
/*     */     //   662: nop
/*     */     //   663: aload #28
/*     */     //   665: invokeinterface endReplaceGroup : ()V
/*     */     //   670: aload #28
/*     */     //   672: ldc_w 2084766589
/*     */     //   675: invokeinterface startReplaceGroup : (I)V
/*     */     //   680: aload_0
/*     */     //   681: invokevirtual getTools : ()Ljava/util/List;
/*     */     //   684: checkcast java/util/Collection
/*     */     //   687: invokeinterface isEmpty : ()Z
/*     */     //   692: ifne -> 699
/*     */     //   695: iconst_1
/*     */     //   696: goto -> 700
/*     */     //   699: iconst_0
/*     */     //   700: ifeq -> 831
/*     */     //   703: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   706: checkcast androidx/compose/ui/Modifier
/*     */     //   709: bipush #8
/*     */     //   711: istore #31
/*     */     //   713: iconst_0
/*     */     //   714: istore #32
/*     */     //   716: iload #31
/*     */     //   718: i2f
/*     */     //   719: invokestatic constructor-impl : (F)F
/*     */     //   722: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   725: aload #28
/*     */     //   727: bipush #6
/*     */     //   729: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   732: ldc_w 'Tools:'
/*     */     //   735: aconst_null
/*     */     //   736: lconst_0
/*     */     //   737: lconst_0
/*     */     //   738: aconst_null
/*     */     //   739: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   742: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   745: aconst_null
/*     */     //   746: lconst_0
/*     */     //   747: aconst_null
/*     */     //   748: iconst_0
/*     */     //   749: lconst_0
/*     */     //   750: iconst_0
/*     */     //   751: iconst_0
/*     */     //   752: iconst_0
/*     */     //   753: aconst_null
/*     */     //   754: aconst_null
/*     */     //   755: aload #28
/*     */     //   757: ldc_w 196614
/*     */     //   760: iconst_0
/*     */     //   761: ldc_w 65502
/*     */     //   764: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   767: aload_0
/*     */     //   768: invokevirtual getTools : ()Ljava/util/List;
/*     */     //   771: checkcast java/lang/Iterable
/*     */     //   774: astore #31
/*     */     //   776: iconst_0
/*     */     //   777: istore #32
/*     */     //   779: aload #31
/*     */     //   781: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   786: astore #33
/*     */     //   788: aload #33
/*     */     //   790: invokeinterface hasNext : ()Z
/*     */     //   795: ifeq -> 830
/*     */     //   798: aload #33
/*     */     //   800: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   805: astore #34
/*     */     //   807: aload #34
/*     */     //   809: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornTool
/*     */     //   812: astore #35
/*     */     //   814: iconst_0
/*     */     //   815: istore #36
/*     */     //   817: aload #35
/*     */     //   819: aload #28
/*     */     //   821: iconst_0
/*     */     //   822: invokestatic MatterhornToolView : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;Landroidx/compose/runtime/Composer;I)V
/*     */     //   825: nop
/*     */     //   826: nop
/*     */     //   827: goto -> 788
/*     */     //   830: nop
/*     */     //   831: aload #28
/*     */     //   833: invokeinterface endReplaceGroup : ()V
/*     */     //   838: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   841: checkcast androidx/compose/ui/Modifier
/*     */     //   844: bipush #8
/*     */     //   846: istore #31
/*     */     //   848: iconst_0
/*     */     //   849: istore #32
/*     */     //   851: iload #31
/*     */     //   853: i2f
/*     */     //   854: invokestatic constructor-impl : (F)F
/*     */     //   857: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   860: aload #28
/*     */     //   862: bipush #6
/*     */     //   864: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   867: aload_0
/*     */     //   868: invokevirtual getToolChoice : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;
/*     */     //   871: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolChoice;)Ljava/lang/String;
/*     */     //   876: aconst_null
/*     */     //   877: lconst_0
/*     */     //   878: lconst_0
/*     */     //   879: aconst_null
/*     */     //   880: aconst_null
/*     */     //   881: aconst_null
/*     */     //   882: lconst_0
/*     */     //   883: aconst_null
/*     */     //   884: iconst_0
/*     */     //   885: lconst_0
/*     */     //   886: iconst_0
/*     */     //   887: iconst_0
/*     */     //   888: iconst_0
/*     */     //   889: aconst_null
/*     */     //   890: aconst_null
/*     */     //   891: aload #28
/*     */     //   893: iconst_0
/*     */     //   894: iconst_0
/*     */     //   895: ldc 65534
/*     */     //   897: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   900: nop
/*     */     //   901: aload #25
/*     */     //   903: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   906: aload_1
/*     */     //   907: invokeinterface endNode : ()V
/*     */     //   912: aload_1
/*     */     //   913: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   916: nop
/*     */     //   917: aload_1
/*     */     //   918: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   921: nop
/*     */     //   922: aload_1
/*     */     //   923: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   926: nop
/*     */     //   927: invokestatic isTraceInProgress : ()Z
/*     */     //   930: ifeq -> 945
/*     */     //   933: invokestatic traceEventEnd : ()V
/*     */     //   936: goto -> 945
/*     */     //   939: aload_1
/*     */     //   940: invokeinterface skipToGroupEnd : ()V
/*     */     //   945: aload_1
/*     */     //   946: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   951: dup
/*     */     //   952: ifnull -> 970
/*     */     //   955: aload_0
/*     */     //   956: iload_2
/*     */     //   957: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;I)Lkotlin/jvm/functions/Function2;
/*     */     //   962: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   967: goto -> 971
/*     */     //   970: pop
/*     */     //   971: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 7
/*     */     //   #51	-> 77
/*     */     //   #353	-> 90
/*     */     //   #51	-> 96
/*     */     //   #354	-> 113
/*     */     //   #355	-> 116
/*     */     //   #356	-> 124
/*     */     //   #359	-> 132
/*     */     //   #360	-> 166
/*     */     //   #361	-> 175
/*     */     //   #362	-> 180
/*     */     //   #363	-> 186
/*     */     //   #364	-> 194
/*     */     //   #366	-> 201
/*     */     //   #365	-> 223
/*     */     //   #367	-> 232
/*     */     //   #368	-> 235
/*     */     //   #369	-> 251
/*     */     //   #370	-> 256
/*     */     //   #371	-> 266
/*     */     //   #373	-> 277
/*     */     //   #375	-> 282
/*     */     //   #376	-> 291
/*     */     //   #377	-> 304
/*     */     //   #379	-> 317
/*     */     //   #380	-> 328
/*     */     //   #381	-> 335
/*     */     //   #382	-> 363
/*     */     //   #383	-> 375
/*     */     //   #385	-> 389
/*     */     //   #380	-> 390
/*     */     //   #385	-> 391
/*     */     //   #386	-> 392
/*     */     //   #387	-> 405
/*     */     //   #375	-> 406
/*     */     //   #388	-> 407
/*     */     //   #389	-> 429
/*     */     //   #52	-> 460
/*     */     //   #53	-> 501
/*     */     //   #390	-> 514
/*     */     //   #53	-> 520
/*     */     //   #55	-> 530
/*     */     //   #56	-> 575
/*     */     //   #391	-> 587
/*     */     //   #392	-> 590
/*     */     //   #392	-> 635
/*     */     //   #57	-> 647
/*     */     //   #58	-> 657
/*     */     //   #392	-> 658
/*     */     //   #393	-> 662
/*     */     //   #60	-> 680
/*     */     //   #60	-> 700
/*     */     //   #61	-> 703
/*     */     //   #394	-> 716
/*     */     //   #61	-> 722
/*     */     //   #62	-> 732
/*     */     //   #63	-> 767
/*     */     //   #395	-> 779
/*     */     //   #64	-> 817
/*     */     //   #65	-> 825
/*     */     //   #395	-> 826
/*     */     //   #396	-> 830
/*     */     //   #68	-> 838
/*     */     //   #397	-> 851
/*     */     //   #68	-> 857
/*     */     //   #69	-> 867
/*     */     //   #70	-> 900
/*     */     //   #389	-> 901
/*     */     //   #388	-> 906
/*     */     //   #398	-> 907
/*     */     //   #367	-> 913
/*     */     //   #399	-> 916
/*     */     //   #361	-> 918
/*     */     //   #400	-> 921
/*     */     //   #354	-> 923
/*     */     //   #401	-> 926
/*     */     //   #71	-> 939
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   90	6	5	$i$f$getDp	I
/*     */     //   87	9	4	$this$dp$iv	I
/*     */     //   514	6	32	$i$f$getDp	I
/*     */     //   511	9	31	$this$dp$iv	I
/*     */     //   647	11	39	$i$a$-forEachIndexed-EventDetailsKt$MatterhornChatView$1$1	I
/*     */     //   644	14	38	index	I
/*     */     //   644	14	37	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   618	41	35	item$iv	Ljava/lang/Object;
/*     */     //   587	76	32	$i$f$forEachIndexed	I
/*     */     //   590	73	33	index$iv	I
/*     */     //   584	79	31	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */     //   716	6	32	$i$f$getDp	I
/*     */     //   713	9	31	$this$dp$iv	I
/*     */     //   817	9	36	$i$a$-forEach-EventDetailsKt$MatterhornChatView$1$2	I
/*     */     //   814	12	35	tool	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;
/*     */     //   807	20	34	element$iv	Ljava/lang/Object;
/*     */     //   779	52	32	$i$f$forEach	I
/*     */     //   776	55	31	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   851	6	32	$i$f$getDp	I
/*     */     //   848	9	31	$this$dp$iv	I
/*     */     //   460	441	30	$i$a$-Column-EventDetailsKt$MatterhornChatView$1	I
/*     */     //   457	444	29	$this$MatterhornChatView_u24lambda_u244	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   457	444	28	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   457	444	27	$changed	I
/*     */     //   423	483	26	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   420	486	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   420	486	24	$changed$iv	I
/*     */     //   335	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   332	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   328	64	21	$i$f$set-impl	I
/*     */     //   325	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   291	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   288	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   227	690	17	$i$f$ReusableComposeNode	I
/*     */     //   224	693	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   224	693	16	$changed$iv$iv$iv	I
/*     */     //   170	752	11	$i$f$Layout	I
/*     */     //   185	737	12	compositeKeyHash$iv$iv	I
/*     */     //   193	729	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   201	721	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   167	755	10	$changed$iv$iv	I
/*     */     //   108	819	8	$i$f$Column	I
/*     */     //   157	770	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   105	822	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   124	803	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   132	795	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   105	822	7	$changed$iv	I
/*     */     //   19	953	3	$dirty	I
/*     */     //   0	972	0	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   0	972	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	972	2	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void MatterhornToolView(@NotNull MatterhornTool tool, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'tool'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w -1324098665
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_1
/*     */     //   17: iload_2
/*     */     //   18: istore_3
/*     */     //   19: iload_2
/*     */     //   20: bipush #6
/*     */     //   22: iand
/*     */     //   23: ifne -> 44
/*     */     //   26: iload_3
/*     */     //   27: aload_1
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: iconst_3
/*     */     //   46: iand
/*     */     //   47: iconst_2
/*     */     //   48: if_icmpne -> 60
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getSkipping : ()Z
/*     */     //   57: ifne -> 1314
/*     */     //   60: invokestatic isTraceInProgress : ()Z
/*     */     //   63: ifeq -> 77
/*     */     //   66: ldc_w -1324098665
/*     */     //   69: iload_3
/*     */     //   70: iconst_m1
/*     */     //   71: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.MatterhornToolView (EventDetails.kt:73)'
/*     */     //   74: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   77: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   80: checkcast androidx/compose/ui/Modifier
/*     */     //   83: bipush #8
/*     */     //   85: istore #4
/*     */     //   87: iconst_0
/*     */     //   88: istore #5
/*     */     //   90: iload #4
/*     */     //   92: i2f
/*     */     //   93: invokestatic constructor-impl : (F)F
/*     */     //   96: fconst_0
/*     */     //   97: fconst_0
/*     */     //   98: fconst_0
/*     */     //   99: bipush #14
/*     */     //   101: aconst_null
/*     */     //   102: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   105: astore #4
/*     */     //   107: bipush #6
/*     */     //   109: istore #7
/*     */     //   111: iconst_0
/*     */     //   112: istore #8
/*     */     //   114: aload_1
/*     */     //   115: ldc -483455358
/*     */     //   117: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   119: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   122: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   125: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   128: astore #5
/*     */     //   130: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   133: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   136: astore #6
/*     */     //   138: aload #5
/*     */     //   140: aload #6
/*     */     //   142: aload_1
/*     */     //   143: bipush #14
/*     */     //   145: iload #7
/*     */     //   147: iconst_3
/*     */     //   148: ishr
/*     */     //   149: iand
/*     */     //   150: bipush #112
/*     */     //   152: iload #7
/*     */     //   154: iconst_3
/*     */     //   155: ishr
/*     */     //   156: iand
/*     */     //   157: ior
/*     */     //   158: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   161: astore #9
/*     */     //   163: bipush #112
/*     */     //   165: iload #7
/*     */     //   167: iconst_3
/*     */     //   168: ishl
/*     */     //   169: iand
/*     */     //   170: istore #10
/*     */     //   172: nop
/*     */     //   173: iconst_0
/*     */     //   174: istore #11
/*     */     //   176: aload_1
/*     */     //   177: ldc -1323940314
/*     */     //   179: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   181: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   184: aload_1
/*     */     //   185: iconst_0
/*     */     //   186: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   189: istore #12
/*     */     //   191: aload_1
/*     */     //   192: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   197: astore #13
/*     */     //   199: aload_1
/*     */     //   200: aload #4
/*     */     //   202: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   205: astore #14
/*     */     //   207: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   210: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   213: astore #15
/*     */     //   215: bipush #6
/*     */     //   217: sipush #896
/*     */     //   220: iload #10
/*     */     //   222: bipush #6
/*     */     //   224: ishl
/*     */     //   225: iand
/*     */     //   226: ior
/*     */     //   227: istore #16
/*     */     //   229: nop
/*     */     //   230: iconst_0
/*     */     //   231: istore #17
/*     */     //   233: aload_1
/*     */     //   234: ldc -692256719
/*     */     //   236: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   238: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   241: aload_1
/*     */     //   242: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   247: instanceof androidx/compose/runtime/Applier
/*     */     //   250: ifne -> 256
/*     */     //   253: invokestatic invalidApplier : ()V
/*     */     //   256: aload_1
/*     */     //   257: invokeinterface startReusableNode : ()V
/*     */     //   262: aload_1
/*     */     //   263: invokeinterface getInserting : ()Z
/*     */     //   268: ifeq -> 282
/*     */     //   271: aload_1
/*     */     //   272: aload #15
/*     */     //   274: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   279: goto -> 288
/*     */     //   282: aload_1
/*     */     //   283: invokeinterface useNode : ()V
/*     */     //   288: aload_1
/*     */     //   289: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   292: astore #18
/*     */     //   294: iconst_0
/*     */     //   295: istore #19
/*     */     //   297: aload #18
/*     */     //   299: aload #9
/*     */     //   301: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   304: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   307: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   310: aload #18
/*     */     //   312: aload #13
/*     */     //   314: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   317: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   320: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   323: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   326: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   329: astore #20
/*     */     //   331: iconst_0
/*     */     //   332: istore #21
/*     */     //   334: aload #18
/*     */     //   336: astore #22
/*     */     //   338: iconst_0
/*     */     //   339: istore #23
/*     */     //   341: aload #22
/*     */     //   343: invokeinterface getInserting : ()Z
/*     */     //   348: ifne -> 369
/*     */     //   351: aload #22
/*     */     //   353: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   358: iload #12
/*     */     //   360: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   363: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   366: ifne -> 395
/*     */     //   369: aload #22
/*     */     //   371: iload #12
/*     */     //   373: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   376: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   381: aload #18
/*     */     //   383: iload #12
/*     */     //   385: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   388: aload #20
/*     */     //   390: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   395: nop
/*     */     //   396: nop
/*     */     //   397: nop
/*     */     //   398: aload #18
/*     */     //   400: aload #14
/*     */     //   402: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   405: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   408: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   411: nop
/*     */     //   412: nop
/*     */     //   413: aload_1
/*     */     //   414: bipush #14
/*     */     //   416: iload #16
/*     */     //   418: bipush #6
/*     */     //   420: ishr
/*     */     //   421: iand
/*     */     //   422: istore #24
/*     */     //   424: astore #25
/*     */     //   426: iconst_0
/*     */     //   427: istore #26
/*     */     //   429: aload #25
/*     */     //   431: ldc -384784025
/*     */     //   433: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   435: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   438: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   441: aload #25
/*     */     //   443: bipush #6
/*     */     //   445: bipush #112
/*     */     //   447: iload #7
/*     */     //   449: bipush #6
/*     */     //   451: ishr
/*     */     //   452: iand
/*     */     //   453: ior
/*     */     //   454: istore #27
/*     */     //   456: astore #28
/*     */     //   458: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   461: astore #29
/*     */     //   463: iconst_0
/*     */     //   464: istore #30
/*     */     //   466: aload_0
/*     */     //   467: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   470: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   475: aconst_null
/*     */     //   476: lconst_0
/*     */     //   477: lconst_0
/*     */     //   478: aconst_null
/*     */     //   479: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   482: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   485: aconst_null
/*     */     //   486: lconst_0
/*     */     //   487: aconst_null
/*     */     //   488: iconst_0
/*     */     //   489: lconst_0
/*     */     //   490: iconst_0
/*     */     //   491: iconst_0
/*     */     //   492: iconst_0
/*     */     //   493: aconst_null
/*     */     //   494: aconst_null
/*     */     //   495: aload #28
/*     */     //   497: ldc_w 196608
/*     */     //   500: iconst_0
/*     */     //   501: ldc_w 65502
/*     */     //   504: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   507: aload_0
/*     */     //   508: invokevirtual getType : ()Ljava/lang/String;
/*     */     //   511: astore #31
/*     */     //   513: aload #28
/*     */     //   515: ldc_w 14290807
/*     */     //   518: invokeinterface startReplaceGroup : (I)V
/*     */     //   523: aload #31
/*     */     //   525: dup
/*     */     //   526: ifnonnull -> 533
/*     */     //   529: pop
/*     */     //   530: goto -> 571
/*     */     //   533: astore #32
/*     */     //   535: iconst_0
/*     */     //   536: istore #33
/*     */     //   538: aload #32
/*     */     //   540: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   545: aconst_null
/*     */     //   546: lconst_0
/*     */     //   547: lconst_0
/*     */     //   548: aconst_null
/*     */     //   549: aconst_null
/*     */     //   550: aconst_null
/*     */     //   551: lconst_0
/*     */     //   552: aconst_null
/*     */     //   553: iconst_0
/*     */     //   554: lconst_0
/*     */     //   555: iconst_0
/*     */     //   556: iconst_0
/*     */     //   557: iconst_0
/*     */     //   558: aconst_null
/*     */     //   559: aconst_null
/*     */     //   560: aload #28
/*     */     //   562: iconst_0
/*     */     //   563: iconst_0
/*     */     //   564: ldc 65534
/*     */     //   566: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   569: nop
/*     */     //   570: nop
/*     */     //   571: aload #28
/*     */     //   573: invokeinterface endReplaceGroup : ()V
/*     */     //   578: aload_0
/*     */     //   579: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   582: astore #31
/*     */     //   584: aload #28
/*     */     //   586: ldc_w 14292839
/*     */     //   589: invokeinterface startReplaceGroup : (I)V
/*     */     //   594: aload #31
/*     */     //   596: dup
/*     */     //   597: ifnonnull -> 604
/*     */     //   600: pop
/*     */     //   601: goto -> 651
/*     */     //   604: astore #32
/*     */     //   606: iconst_0
/*     */     //   607: istore #33
/*     */     //   609: aload #32
/*     */     //   611: checkcast java/lang/CharSequence
/*     */     //   614: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   617: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   620: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   625: aconst_null
/*     */     //   626: lconst_0
/*     */     //   627: lconst_0
/*     */     //   628: aconst_null
/*     */     //   629: aconst_null
/*     */     //   630: aconst_null
/*     */     //   631: lconst_0
/*     */     //   632: aconst_null
/*     */     //   633: iconst_0
/*     */     //   634: lconst_0
/*     */     //   635: iconst_0
/*     */     //   636: iconst_0
/*     */     //   637: iconst_0
/*     */     //   638: aconst_null
/*     */     //   639: aconst_null
/*     */     //   640: aload #28
/*     */     //   642: iconst_0
/*     */     //   643: iconst_0
/*     */     //   644: ldc 65534
/*     */     //   646: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   649: nop
/*     */     //   650: nop
/*     */     //   651: aload #28
/*     */     //   653: invokeinterface endReplaceGroup : ()V
/*     */     //   658: aload #28
/*     */     //   660: ldc_w 14294981
/*     */     //   663: invokeinterface startReplaceGroup : (I)V
/*     */     //   668: aload_0
/*     */     //   669: invokevirtual getParams : ()Ljava/util/List;
/*     */     //   672: checkcast java/util/Collection
/*     */     //   675: astore #31
/*     */     //   677: aload #31
/*     */     //   679: ifnull -> 692
/*     */     //   682: aload #31
/*     */     //   684: invokeinterface isEmpty : ()Z
/*     */     //   689: ifeq -> 696
/*     */     //   692: iconst_1
/*     */     //   693: goto -> 697
/*     */     //   696: iconst_0
/*     */     //   697: ifne -> 1268
/*     */     //   700: ldc_w 'Parameters:'
/*     */     //   703: aconst_null
/*     */     //   704: lconst_0
/*     */     //   705: lconst_0
/*     */     //   706: aconst_null
/*     */     //   707: aconst_null
/*     */     //   708: aconst_null
/*     */     //   709: lconst_0
/*     */     //   710: aconst_null
/*     */     //   711: iconst_0
/*     */     //   712: lconst_0
/*     */     //   713: iconst_0
/*     */     //   714: iconst_0
/*     */     //   715: iconst_0
/*     */     //   716: aconst_null
/*     */     //   717: aconst_null
/*     */     //   718: aload #28
/*     */     //   720: bipush #6
/*     */     //   722: iconst_0
/*     */     //   723: ldc 65534
/*     */     //   725: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   728: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   731: checkcast androidx/compose/ui/Modifier
/*     */     //   734: bipush #8
/*     */     //   736: istore #31
/*     */     //   738: iconst_0
/*     */     //   739: istore #34
/*     */     //   741: iload #31
/*     */     //   743: i2f
/*     */     //   744: invokestatic constructor-impl : (F)F
/*     */     //   747: fconst_0
/*     */     //   748: fconst_0
/*     */     //   749: fconst_0
/*     */     //   750: bipush #14
/*     */     //   752: aconst_null
/*     */     //   753: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   756: astore #31
/*     */     //   758: bipush #6
/*     */     //   760: istore #32
/*     */     //   762: iconst_0
/*     */     //   763: istore #33
/*     */     //   765: aload #28
/*     */     //   767: ldc -483455358
/*     */     //   769: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   771: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   774: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   777: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   780: astore #34
/*     */     //   782: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   785: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   788: astore #35
/*     */     //   790: aload #34
/*     */     //   792: aload #35
/*     */     //   794: aload #28
/*     */     //   796: bipush #14
/*     */     //   798: iload #32
/*     */     //   800: iconst_3
/*     */     //   801: ishr
/*     */     //   802: iand
/*     */     //   803: bipush #112
/*     */     //   805: iload #32
/*     */     //   807: iconst_3
/*     */     //   808: ishr
/*     */     //   809: iand
/*     */     //   810: ior
/*     */     //   811: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   814: astore #36
/*     */     //   816: bipush #112
/*     */     //   818: iload #32
/*     */     //   820: iconst_3
/*     */     //   821: ishl
/*     */     //   822: iand
/*     */     //   823: istore #37
/*     */     //   825: nop
/*     */     //   826: iconst_0
/*     */     //   827: istore #38
/*     */     //   829: aload #28
/*     */     //   831: ldc -1323940314
/*     */     //   833: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   835: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   838: aload #28
/*     */     //   840: iconst_0
/*     */     //   841: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   844: istore #39
/*     */     //   846: aload #28
/*     */     //   848: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   853: astore #40
/*     */     //   855: aload #28
/*     */     //   857: aload #31
/*     */     //   859: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   862: astore #41
/*     */     //   864: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   867: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   870: astore #42
/*     */     //   872: bipush #6
/*     */     //   874: sipush #896
/*     */     //   877: iload #37
/*     */     //   879: bipush #6
/*     */     //   881: ishl
/*     */     //   882: iand
/*     */     //   883: ior
/*     */     //   884: istore #43
/*     */     //   886: nop
/*     */     //   887: iconst_0
/*     */     //   888: istore #44
/*     */     //   890: aload #28
/*     */     //   892: ldc -692256719
/*     */     //   894: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   896: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   899: aload #28
/*     */     //   901: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   906: instanceof androidx/compose/runtime/Applier
/*     */     //   909: ifne -> 915
/*     */     //   912: invokestatic invalidApplier : ()V
/*     */     //   915: aload #28
/*     */     //   917: invokeinterface startReusableNode : ()V
/*     */     //   922: aload #28
/*     */     //   924: invokeinterface getInserting : ()Z
/*     */     //   929: ifeq -> 944
/*     */     //   932: aload #28
/*     */     //   934: aload #42
/*     */     //   936: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   941: goto -> 951
/*     */     //   944: aload #28
/*     */     //   946: invokeinterface useNode : ()V
/*     */     //   951: aload #28
/*     */     //   953: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   956: astore #45
/*     */     //   958: iconst_0
/*     */     //   959: istore #46
/*     */     //   961: aload #45
/*     */     //   963: aload #36
/*     */     //   965: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   968: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   971: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   974: aload #45
/*     */     //   976: aload #40
/*     */     //   978: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   981: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   984: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   987: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   990: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   993: astore #47
/*     */     //   995: iconst_0
/*     */     //   996: istore #48
/*     */     //   998: aload #45
/*     */     //   1000: astore #49
/*     */     //   1002: iconst_0
/*     */     //   1003: istore #50
/*     */     //   1005: aload #49
/*     */     //   1007: invokeinterface getInserting : ()Z
/*     */     //   1012: ifne -> 1033
/*     */     //   1015: aload #49
/*     */     //   1017: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1022: iload #39
/*     */     //   1024: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1027: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1030: ifne -> 1059
/*     */     //   1033: aload #49
/*     */     //   1035: iload #39
/*     */     //   1037: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1040: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1045: aload #45
/*     */     //   1047: iload #39
/*     */     //   1049: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1052: aload #47
/*     */     //   1054: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1059: nop
/*     */     //   1060: nop
/*     */     //   1061: nop
/*     */     //   1062: aload #45
/*     */     //   1064: aload #41
/*     */     //   1066: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1069: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1072: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1075: nop
/*     */     //   1076: nop
/*     */     //   1077: aload #28
/*     */     //   1079: bipush #14
/*     */     //   1081: iload #43
/*     */     //   1083: bipush #6
/*     */     //   1085: ishr
/*     */     //   1086: iand
/*     */     //   1087: istore #51
/*     */     //   1089: astore #52
/*     */     //   1091: iconst_0
/*     */     //   1092: istore #53
/*     */     //   1094: aload #52
/*     */     //   1096: ldc -384784025
/*     */     //   1098: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1100: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1103: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1106: aload #52
/*     */     //   1108: bipush #6
/*     */     //   1110: bipush #112
/*     */     //   1112: iload #32
/*     */     //   1114: bipush #6
/*     */     //   1116: ishr
/*     */     //   1117: iand
/*     */     //   1118: ior
/*     */     //   1119: istore #54
/*     */     //   1121: astore #55
/*     */     //   1123: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1126: astore #56
/*     */     //   1128: iconst_0
/*     */     //   1129: istore #57
/*     */     //   1131: aload #55
/*     */     //   1133: ldc_w -1438282164
/*     */     //   1136: invokeinterface startReplaceGroup : (I)V
/*     */     //   1141: aload_0
/*     */     //   1142: invokevirtual getParams : ()Ljava/util/List;
/*     */     //   1145: dup
/*     */     //   1146: ldc_w 'null cannot be cast to non-null type kotlin.collections.Iterable<kotlin.Any?>'
/*     */     //   1149: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1152: checkcast java/lang/Iterable
/*     */     //   1155: astore #58
/*     */     //   1157: iconst_0
/*     */     //   1158: istore #59
/*     */     //   1160: aload #58
/*     */     //   1162: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1167: astore #60
/*     */     //   1169: aload #60
/*     */     //   1171: invokeinterface hasNext : ()Z
/*     */     //   1176: ifeq -> 1229
/*     */     //   1179: aload #60
/*     */     //   1181: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1186: astore #61
/*     */     //   1188: aload #61
/*     */     //   1190: astore #62
/*     */     //   1192: iconst_0
/*     */     //   1193: istore #63
/*     */     //   1195: aload #62
/*     */     //   1197: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   1200: aconst_null
/*     */     //   1201: lconst_0
/*     */     //   1202: lconst_0
/*     */     //   1203: aconst_null
/*     */     //   1204: aconst_null
/*     */     //   1205: aconst_null
/*     */     //   1206: lconst_0
/*     */     //   1207: aconst_null
/*     */     //   1208: iconst_0
/*     */     //   1209: lconst_0
/*     */     //   1210: iconst_0
/*     */     //   1211: iconst_0
/*     */     //   1212: iconst_0
/*     */     //   1213: aconst_null
/*     */     //   1214: aconst_null
/*     */     //   1215: aload #55
/*     */     //   1217: iconst_0
/*     */     //   1218: iconst_0
/*     */     //   1219: ldc 65534
/*     */     //   1221: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1224: nop
/*     */     //   1225: nop
/*     */     //   1226: goto -> 1169
/*     */     //   1229: nop
/*     */     //   1230: aload #55
/*     */     //   1232: invokeinterface endReplaceGroup : ()V
/*     */     //   1237: nop
/*     */     //   1238: aload #52
/*     */     //   1240: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1243: aload #28
/*     */     //   1245: invokeinterface endNode : ()V
/*     */     //   1250: aload #28
/*     */     //   1252: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1255: nop
/*     */     //   1256: aload #28
/*     */     //   1258: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1261: nop
/*     */     //   1262: aload #28
/*     */     //   1264: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1267: nop
/*     */     //   1268: aload #28
/*     */     //   1270: invokeinterface endReplaceGroup : ()V
/*     */     //   1275: nop
/*     */     //   1276: aload #25
/*     */     //   1278: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1281: aload_1
/*     */     //   1282: invokeinterface endNode : ()V
/*     */     //   1287: aload_1
/*     */     //   1288: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1291: nop
/*     */     //   1292: aload_1
/*     */     //   1293: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1296: nop
/*     */     //   1297: aload_1
/*     */     //   1298: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1301: nop
/*     */     //   1302: invokestatic isTraceInProgress : ()Z
/*     */     //   1305: ifeq -> 1320
/*     */     //   1308: invokestatic traceEventEnd : ()V
/*     */     //   1311: goto -> 1320
/*     */     //   1314: aload_1
/*     */     //   1315: invokeinterface skipToGroupEnd : ()V
/*     */     //   1320: aload_1
/*     */     //   1321: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1326: dup
/*     */     //   1327: ifnull -> 1345
/*     */     //   1330: aload_0
/*     */     //   1331: iload_2
/*     */     //   1332: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1337: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1342: goto -> 1346
/*     */     //   1345: pop
/*     */     //   1346: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #74	-> 7
/*     */     //   #75	-> 77
/*     */     //   #402	-> 90
/*     */     //   #75	-> 96
/*     */     //   #403	-> 119
/*     */     //   #404	-> 122
/*     */     //   #405	-> 130
/*     */     //   #408	-> 138
/*     */     //   #409	-> 172
/*     */     //   #410	-> 181
/*     */     //   #411	-> 186
/*     */     //   #412	-> 192
/*     */     //   #413	-> 200
/*     */     //   #415	-> 207
/*     */     //   #414	-> 229
/*     */     //   #416	-> 238
/*     */     //   #417	-> 241
/*     */     //   #418	-> 257
/*     */     //   #419	-> 262
/*     */     //   #420	-> 272
/*     */     //   #422	-> 283
/*     */     //   #424	-> 288
/*     */     //   #425	-> 297
/*     */     //   #426	-> 310
/*     */     //   #428	-> 323
/*     */     //   #429	-> 334
/*     */     //   #430	-> 341
/*     */     //   #431	-> 369
/*     */     //   #432	-> 381
/*     */     //   #434	-> 395
/*     */     //   #429	-> 396
/*     */     //   #434	-> 397
/*     */     //   #435	-> 398
/*     */     //   #436	-> 411
/*     */     //   #424	-> 412
/*     */     //   #437	-> 413
/*     */     //   #438	-> 435
/*     */     //   #76	-> 466
/*     */     //   #78	-> 507
/*     */     //   #79	-> 538
/*     */     //   #80	-> 569
/*     */     //   #78	-> 570
/*     */     //   #78	-> 571
/*     */     //   #82	-> 578
/*     */     //   #83	-> 609
/*     */     //   #83	-> 646
/*     */     //   #84	-> 649
/*     */     //   #82	-> 650
/*     */     //   #82	-> 651
/*     */     //   #86	-> 668
/*     */     //   #86	-> 697
/*     */     //   #87	-> 700
/*     */     //   #88	-> 728
/*     */     //   #439	-> 741
/*     */     //   #88	-> 747
/*     */     //   #440	-> 771
/*     */     //   #441	-> 774
/*     */     //   #442	-> 782
/*     */     //   #445	-> 790
/*     */     //   #446	-> 825
/*     */     //   #447	-> 835
/*     */     //   #448	-> 841
/*     */     //   #449	-> 848
/*     */     //   #450	-> 857
/*     */     //   #452	-> 864
/*     */     //   #451	-> 886
/*     */     //   #453	-> 896
/*     */     //   #454	-> 899
/*     */     //   #455	-> 917
/*     */     //   #456	-> 922
/*     */     //   #457	-> 934
/*     */     //   #459	-> 946
/*     */     //   #461	-> 951
/*     */     //   #462	-> 961
/*     */     //   #463	-> 974
/*     */     //   #465	-> 987
/*     */     //   #466	-> 998
/*     */     //   #467	-> 1005
/*     */     //   #468	-> 1033
/*     */     //   #469	-> 1045
/*     */     //   #471	-> 1059
/*     */     //   #466	-> 1060
/*     */     //   #471	-> 1061
/*     */     //   #472	-> 1062
/*     */     //   #473	-> 1075
/*     */     //   #461	-> 1076
/*     */     //   #474	-> 1077
/*     */     //   #475	-> 1100
/*     */     //   #89	-> 1141
/*     */     //   #476	-> 1160
/*     */     //   #90	-> 1195
/*     */     //   #91	-> 1224
/*     */     //   #476	-> 1225
/*     */     //   #477	-> 1229
/*     */     //   #92	-> 1237
/*     */     //   #475	-> 1238
/*     */     //   #474	-> 1243
/*     */     //   #478	-> 1245
/*     */     //   #453	-> 1252
/*     */     //   #479	-> 1255
/*     */     //   #447	-> 1258
/*     */     //   #480	-> 1261
/*     */     //   #440	-> 1264
/*     */     //   #481	-> 1267
/*     */     //   #94	-> 1275
/*     */     //   #438	-> 1276
/*     */     //   #437	-> 1281
/*     */     //   #482	-> 1282
/*     */     //   #416	-> 1288
/*     */     //   #483	-> 1291
/*     */     //   #410	-> 1293
/*     */     //   #484	-> 1296
/*     */     //   #403	-> 1298
/*     */     //   #485	-> 1301
/*     */     //   #95	-> 1314
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   90	6	5	$i$f$getDp	I
/*     */     //   87	9	4	$this$dp$iv	I
/*     */     //   538	32	33	$i$a$-let-EventDetailsKt$MatterhornToolView$1$1	I
/*     */     //   535	35	32	it	Ljava/lang/String;
/*     */     //   609	41	33	$i$a$-let-EventDetailsKt$MatterhornToolView$1$2	I
/*     */     //   606	44	32	it	Ljava/lang/String;
/*     */     //   741	6	34	$i$f$getDp	I
/*     */     //   738	9	31	$this$dp$iv	I
/*     */     //   1195	30	63	$i$a$-forEach-EventDetailsKt$MatterhornToolView$1$3$1	I
/*     */     //   1192	33	62	param	Ljava/lang/Object;
/*     */     //   1188	38	61	element$iv	Ljava/lang/Object;
/*     */     //   1160	70	59	$i$f$forEach	I
/*     */     //   1157	73	58	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   1131	107	57	$i$a$-Column-EventDetailsKt$MatterhornToolView$1$3	I
/*     */     //   1128	110	56	$this$MatterhornToolView_u24lambda_u2410_u24lambda_u249	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1128	110	55	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1128	110	54	$changed	I
/*     */     //   1094	149	53	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1091	152	52	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1091	152	51	$changed$iv	I
/*     */     //   1005	55	50	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1002	58	49	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   998	64	48	$i$f$set-impl	I
/*     */     //   995	67	47	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   961	115	46	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   958	118	45	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   890	366	44	$i$f$ReusableComposeNode	I
/*     */     //   887	369	42	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   887	369	43	$changed$iv$iv$iv	I
/*     */     //   829	433	38	$i$f$Layout	I
/*     */     //   846	416	39	compositeKeyHash$iv$iv	I
/*     */     //   855	407	40	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   864	398	41	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   826	436	37	$changed$iv$iv	I
/*     */     //   765	503	33	$i$f$Column	I
/*     */     //   816	452	36	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   762	506	31	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   782	486	34	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   790	478	35	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   762	506	32	$changed$iv	I
/*     */     //   466	810	30	$i$a$-Column-EventDetailsKt$MatterhornToolView$1	I
/*     */     //   463	813	29	$this$MatterhornToolView_u24lambda_u2410	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   463	813	28	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   463	813	27	$changed	I
/*     */     //   429	852	26	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   426	855	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   426	855	24	$changed$iv	I
/*     */     //   341	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   338	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   334	64	21	$i$f$set-impl	I
/*     */     //   331	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   297	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   294	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   233	1059	17	$i$f$ReusableComposeNode	I
/*     */     //   230	1062	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   230	1062	16	$changed$iv$iv$iv	I
/*     */     //   176	1121	11	$i$f$Layout	I
/*     */     //   191	1106	12	compositeKeyHash$iv$iv	I
/*     */     //   199	1098	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   207	1090	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   173	1124	10	$changed$iv$iv	I
/*     */     //   114	1188	8	$i$f$Column	I
/*     */     //   163	1139	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   111	1191	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   130	1172	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   138	1164	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   111	1191	7	$changed$iv	I
/*     */     //   19	1328	3	$dirty	I
/*     */     //   0	1347	0	tool	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornTool;
/*     */     //   0	1347	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1347	2	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void MatterhornChatElementView(int index, @NotNull MatterhornChatElement element, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'element'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w -380251462
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_2
/*     */     //   17: iload_3
/*     */     //   18: istore #4
/*     */     //   20: iload_3
/*     */     //   21: bipush #6
/*     */     //   23: iand
/*     */     //   24: ifne -> 47
/*     */     //   27: iload #4
/*     */     //   29: aload_2
/*     */     //   30: iload_0
/*     */     //   31: invokeinterface changed : (I)Z
/*     */     //   36: ifeq -> 43
/*     */     //   39: iconst_4
/*     */     //   40: goto -> 44
/*     */     //   43: iconst_2
/*     */     //   44: ior
/*     */     //   45: istore #4
/*     */     //   47: iload_3
/*     */     //   48: bipush #48
/*     */     //   50: iand
/*     */     //   51: ifne -> 76
/*     */     //   54: iload #4
/*     */     //   56: aload_2
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #4
/*     */     //   76: iload #4
/*     */     //   78: bipush #19
/*     */     //   80: iand
/*     */     //   81: bipush #18
/*     */     //   83: if_icmpne -> 95
/*     */     //   86: aload_2
/*     */     //   87: invokeinterface getSkipping : ()Z
/*     */     //   92: ifne -> 641
/*     */     //   95: invokestatic isTraceInProgress : ()Z
/*     */     //   98: ifeq -> 113
/*     */     //   101: ldc_w -380251462
/*     */     //   104: iload #4
/*     */     //   106: iconst_m1
/*     */     //   107: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.MatterhornChatElementView (EventDetails.kt:97)'
/*     */     //   110: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   113: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   116: checkcast androidx/compose/ui/Modifier
/*     */     //   119: bipush #8
/*     */     //   121: istore #5
/*     */     //   123: iconst_0
/*     */     //   124: istore #6
/*     */     //   126: iload #5
/*     */     //   128: i2f
/*     */     //   129: invokestatic constructor-impl : (F)F
/*     */     //   132: fconst_0
/*     */     //   133: fconst_0
/*     */     //   134: fconst_0
/*     */     //   135: bipush #14
/*     */     //   137: aconst_null
/*     */     //   138: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   141: astore #5
/*     */     //   143: bipush #6
/*     */     //   145: istore #8
/*     */     //   147: iconst_0
/*     */     //   148: istore #9
/*     */     //   150: aload_2
/*     */     //   151: ldc -483455358
/*     */     //   153: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   155: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   158: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   161: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   164: astore #6
/*     */     //   166: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   169: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   172: astore #7
/*     */     //   174: aload #6
/*     */     //   176: aload #7
/*     */     //   178: aload_2
/*     */     //   179: bipush #14
/*     */     //   181: iload #8
/*     */     //   183: iconst_3
/*     */     //   184: ishr
/*     */     //   185: iand
/*     */     //   186: bipush #112
/*     */     //   188: iload #8
/*     */     //   190: iconst_3
/*     */     //   191: ishr
/*     */     //   192: iand
/*     */     //   193: ior
/*     */     //   194: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   197: astore #10
/*     */     //   199: bipush #112
/*     */     //   201: iload #8
/*     */     //   203: iconst_3
/*     */     //   204: ishl
/*     */     //   205: iand
/*     */     //   206: istore #11
/*     */     //   208: nop
/*     */     //   209: iconst_0
/*     */     //   210: istore #12
/*     */     //   212: aload_2
/*     */     //   213: ldc -1323940314
/*     */     //   215: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   217: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   220: aload_2
/*     */     //   221: iconst_0
/*     */     //   222: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   225: istore #13
/*     */     //   227: aload_2
/*     */     //   228: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   233: astore #14
/*     */     //   235: aload_2
/*     */     //   236: aload #5
/*     */     //   238: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   241: astore #15
/*     */     //   243: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   246: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   249: astore #16
/*     */     //   251: bipush #6
/*     */     //   253: sipush #896
/*     */     //   256: iload #11
/*     */     //   258: bipush #6
/*     */     //   260: ishl
/*     */     //   261: iand
/*     */     //   262: ior
/*     */     //   263: istore #17
/*     */     //   265: nop
/*     */     //   266: iconst_0
/*     */     //   267: istore #18
/*     */     //   269: aload_2
/*     */     //   270: ldc -692256719
/*     */     //   272: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   274: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   277: aload_2
/*     */     //   278: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   283: instanceof androidx/compose/runtime/Applier
/*     */     //   286: ifne -> 292
/*     */     //   289: invokestatic invalidApplier : ()V
/*     */     //   292: aload_2
/*     */     //   293: invokeinterface startReusableNode : ()V
/*     */     //   298: aload_2
/*     */     //   299: invokeinterface getInserting : ()Z
/*     */     //   304: ifeq -> 318
/*     */     //   307: aload_2
/*     */     //   308: aload #16
/*     */     //   310: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   315: goto -> 324
/*     */     //   318: aload_2
/*     */     //   319: invokeinterface useNode : ()V
/*     */     //   324: aload_2
/*     */     //   325: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   328: astore #19
/*     */     //   330: iconst_0
/*     */     //   331: istore #20
/*     */     //   333: aload #19
/*     */     //   335: aload #10
/*     */     //   337: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   340: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   343: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   346: aload #19
/*     */     //   348: aload #14
/*     */     //   350: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   353: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   356: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   359: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   362: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   365: astore #21
/*     */     //   367: iconst_0
/*     */     //   368: istore #22
/*     */     //   370: aload #19
/*     */     //   372: astore #23
/*     */     //   374: iconst_0
/*     */     //   375: istore #24
/*     */     //   377: aload #23
/*     */     //   379: invokeinterface getInserting : ()Z
/*     */     //   384: ifne -> 405
/*     */     //   387: aload #23
/*     */     //   389: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   394: iload #13
/*     */     //   396: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   399: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   402: ifne -> 431
/*     */     //   405: aload #23
/*     */     //   407: iload #13
/*     */     //   409: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   412: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   417: aload #19
/*     */     //   419: iload #13
/*     */     //   421: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   424: aload #21
/*     */     //   426: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   431: nop
/*     */     //   432: nop
/*     */     //   433: nop
/*     */     //   434: aload #19
/*     */     //   436: aload #15
/*     */     //   438: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   441: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   444: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   447: nop
/*     */     //   448: nop
/*     */     //   449: aload_2
/*     */     //   450: bipush #14
/*     */     //   452: iload #17
/*     */     //   454: bipush #6
/*     */     //   456: ishr
/*     */     //   457: iand
/*     */     //   458: istore #25
/*     */     //   460: astore #26
/*     */     //   462: iconst_0
/*     */     //   463: istore #27
/*     */     //   465: aload #26
/*     */     //   467: ldc -384784025
/*     */     //   469: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   471: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   474: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   477: aload #26
/*     */     //   479: bipush #6
/*     */     //   481: bipush #112
/*     */     //   483: iload #8
/*     */     //   485: bipush #6
/*     */     //   487: ishr
/*     */     //   488: iand
/*     */     //   489: ior
/*     */     //   490: istore #28
/*     */     //   492: astore #29
/*     */     //   494: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   497: astore #30
/*     */     //   499: iconst_0
/*     */     //   500: istore #31
/*     */     //   502: iload_0
/*     */     //   503: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   508: aconst_null
/*     */     //   509: lconst_0
/*     */     //   510: lconst_0
/*     */     //   511: aconst_null
/*     */     //   512: aconst_null
/*     */     //   513: aconst_null
/*     */     //   514: lconst_0
/*     */     //   515: aconst_null
/*     */     //   516: iconst_0
/*     */     //   517: lconst_0
/*     */     //   518: iconst_0
/*     */     //   519: iconst_0
/*     */     //   520: iconst_0
/*     */     //   521: aconst_null
/*     */     //   522: aconst_null
/*     */     //   523: aload #29
/*     */     //   525: iconst_0
/*     */     //   526: iconst_0
/*     */     //   527: ldc 65534
/*     */     //   529: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   532: aload_1
/*     */     //   533: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   538: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   543: aconst_null
/*     */     //   544: lconst_0
/*     */     //   545: lconst_0
/*     */     //   546: aconst_null
/*     */     //   547: aconst_null
/*     */     //   548: aconst_null
/*     */     //   549: lconst_0
/*     */     //   550: aconst_null
/*     */     //   551: iconst_0
/*     */     //   552: lconst_0
/*     */     //   553: iconst_0
/*     */     //   554: iconst_0
/*     */     //   555: iconst_0
/*     */     //   556: aconst_null
/*     */     //   557: aconst_null
/*     */     //   558: aload #29
/*     */     //   560: iconst_0
/*     */     //   561: iconst_0
/*     */     //   562: ldc 65534
/*     */     //   564: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   567: aload_1
/*     */     //   568: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   573: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;)Ljava/lang/String;
/*     */     //   578: aconst_null
/*     */     //   579: lconst_0
/*     */     //   580: lconst_0
/*     */     //   581: aconst_null
/*     */     //   582: aconst_null
/*     */     //   583: aconst_null
/*     */     //   584: lconst_0
/*     */     //   585: aconst_null
/*     */     //   586: iconst_0
/*     */     //   587: lconst_0
/*     */     //   588: iconst_0
/*     */     //   589: iconst_0
/*     */     //   590: iconst_0
/*     */     //   591: aconst_null
/*     */     //   592: aconst_null
/*     */     //   593: aload #29
/*     */     //   595: iconst_0
/*     */     //   596: iconst_0
/*     */     //   597: ldc 65534
/*     */     //   599: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   602: nop
/*     */     //   603: aload #26
/*     */     //   605: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   608: aload_2
/*     */     //   609: invokeinterface endNode : ()V
/*     */     //   614: aload_2
/*     */     //   615: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   618: nop
/*     */     //   619: aload_2
/*     */     //   620: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   623: nop
/*     */     //   624: aload_2
/*     */     //   625: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   628: nop
/*     */     //   629: invokestatic isTraceInProgress : ()Z
/*     */     //   632: ifeq -> 647
/*     */     //   635: invokestatic traceEventEnd : ()V
/*     */     //   638: goto -> 647
/*     */     //   641: aload_2
/*     */     //   642: invokeinterface skipToGroupEnd : ()V
/*     */     //   647: aload_2
/*     */     //   648: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   653: dup
/*     */     //   654: ifnull -> 673
/*     */     //   657: iload_0
/*     */     //   658: aload_1
/*     */     //   659: iload_3
/*     */     //   660: <illegal opcode> invoke : (ILcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;I)Lkotlin/jvm/functions/Function2;
/*     */     //   665: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   670: goto -> 674
/*     */     //   673: pop
/*     */     //   674: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #98	-> 7
/*     */     //   #99	-> 113
/*     */     //   #486	-> 126
/*     */     //   #99	-> 132
/*     */     //   #487	-> 155
/*     */     //   #488	-> 158
/*     */     //   #489	-> 166
/*     */     //   #492	-> 174
/*     */     //   #493	-> 208
/*     */     //   #494	-> 217
/*     */     //   #495	-> 222
/*     */     //   #496	-> 228
/*     */     //   #497	-> 236
/*     */     //   #499	-> 243
/*     */     //   #498	-> 265
/*     */     //   #500	-> 274
/*     */     //   #501	-> 277
/*     */     //   #502	-> 293
/*     */     //   #503	-> 298
/*     */     //   #504	-> 308
/*     */     //   #506	-> 319
/*     */     //   #508	-> 324
/*     */     //   #509	-> 333
/*     */     //   #510	-> 346
/*     */     //   #512	-> 359
/*     */     //   #513	-> 370
/*     */     //   #514	-> 377
/*     */     //   #515	-> 405
/*     */     //   #516	-> 417
/*     */     //   #518	-> 431
/*     */     //   #513	-> 432
/*     */     //   #518	-> 433
/*     */     //   #519	-> 434
/*     */     //   #520	-> 447
/*     */     //   #508	-> 448
/*     */     //   #521	-> 449
/*     */     //   #522	-> 471
/*     */     //   #100	-> 502
/*     */     //   #101	-> 532
/*     */     //   #102	-> 567
/*     */     //   #103	-> 602
/*     */     //   #522	-> 603
/*     */     //   #521	-> 608
/*     */     //   #523	-> 609
/*     */     //   #500	-> 615
/*     */     //   #524	-> 618
/*     */     //   #494	-> 620
/*     */     //   #525	-> 623
/*     */     //   #487	-> 625
/*     */     //   #526	-> 628
/*     */     //   #104	-> 641
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   126	6	6	$i$f$getDp	I
/*     */     //   123	9	5	$this$dp$iv	I
/*     */     //   502	101	31	$i$a$-Column-EventDetailsKt$MatterhornChatElementView$1	I
/*     */     //   499	104	30	$this$MatterhornChatElementView_u24lambda_u2412	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   499	104	29	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   499	104	28	$changed	I
/*     */     //   465	143	27	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   462	146	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   462	146	25	$changed$iv	I
/*     */     //   377	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   374	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   370	64	22	$i$f$set-impl	I
/*     */     //   367	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   333	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   330	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   269	350	18	$i$f$ReusableComposeNode	I
/*     */     //   266	353	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   266	353	17	$changed$iv$iv$iv	I
/*     */     //   212	412	12	$i$f$Layout	I
/*     */     //   227	397	13	compositeKeyHash$iv$iv	I
/*     */     //   235	389	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   243	381	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   209	415	11	$changed$iv$iv	I
/*     */     //   150	479	9	$i$f$Column	I
/*     */     //   199	430	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   147	482	5	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   166	463	6	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   174	455	7	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   147	482	8	$changed$iv	I
/*     */     //   20	655	4	$dirty	I
/*     */     //   0	675	0	index	I
/*     */     //   0	675	1	element	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   0	675	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	675	3	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void EventDetails(@NotNull CustomArtifactEvent event, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'event'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 1868748903
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_1
/*     */     //   17: iload_2
/*     */     //   18: istore_3
/*     */     //   19: iload_2
/*     */     //   20: bipush #6
/*     */     //   22: iand
/*     */     //   23: ifne -> 44
/*     */     //   26: iload_3
/*     */     //   27: aload_1
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: iconst_3
/*     */     //   46: iand
/*     */     //   47: iconst_2
/*     */     //   48: if_icmpne -> 60
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getSkipping : ()Z
/*     */     //   57: ifne -> 118
/*     */     //   60: invokestatic isTraceInProgress : ()Z
/*     */     //   63: ifeq -> 77
/*     */     //   66: ldc_w 1868748903
/*     */     //   69: iload_3
/*     */     //   70: iconst_m1
/*     */     //   71: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.EventDetails (EventDetails.kt:106)'
/*     */     //   74: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   77: aconst_null
/*     */     //   78: ldc_w -1375708918
/*     */     //   81: iconst_1
/*     */     //   82: new com/intellij/ml/llm/matterhorn/ej/ui/debug/EventDetailsKt$EventDetails$1
/*     */     //   85: dup
/*     */     //   86: aload_0
/*     */     //   87: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   90: aload_1
/*     */     //   91: bipush #54
/*     */     //   93: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   96: checkcast kotlin/jvm/functions/Function2
/*     */     //   99: aload_1
/*     */     //   100: bipush #48
/*     */     //   102: iconst_1
/*     */     //   103: invokestatic SelectionContainer : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   106: invokestatic isTraceInProgress : ()Z
/*     */     //   109: ifeq -> 124
/*     */     //   112: invokestatic traceEventEnd : ()V
/*     */     //   115: goto -> 124
/*     */     //   118: aload_1
/*     */     //   119: invokeinterface skipToGroupEnd : ()V
/*     */     //   124: aload_1
/*     */     //   125: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   130: dup
/*     */     //   131: ifnull -> 149
/*     */     //   134: aload_0
/*     */     //   135: iload_2
/*     */     //   136: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;I)Lkotlin/jvm/functions/Function2;
/*     */     //   141: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   146: goto -> 150
/*     */     //   149: pop
/*     */     //   150: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #107	-> 7
/*     */     //   #108	-> 78
/*     */     //   #238	-> 118
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   19	132	3	$dirty	I
/*     */     //   0	151	0	event	Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;
/*     */     //   0	151	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	151	2	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nEventDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDetails.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventDetailsKt$EventDetails$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,311:1\n86#2:312\n82#2,7:313\n89#2:348\n86#2:350\n83#2,6:351\n89#2:385\n93#2:391\n86#2:393\n83#2,6:394\n89#2:428\n93#2:434\n86#2:438\n83#2,6:439\n89#2:473\n93#2:478\n86#2:480\n83#2,6:481\n89#2:515\n93#2:521\n86#2:523\n83#2,6:524\n89#2:558\n93#2:564\n93#2:574\n79#3,6:320\n86#3,4:335\n90#3,2:345\n79#3,6:357\n86#3,4:372\n90#3,2:382\n94#3:390\n79#3,6:400\n86#3,4:415\n90#3,2:425\n94#3:433\n79#3,6:445\n86#3,4:460\n90#3,2:470\n94#3:477\n79#3,6:487\n86#3,4:502\n90#3,2:512\n94#3:520\n79#3,6:530\n86#3,4:545\n90#3,2:555\n94#3:563\n94#3:573\n368#4,9:326\n377#4:347\n368#4,9:363\n377#4:384\n378#4,2:388\n368#4,9:406\n377#4:427\n378#4,2:431\n368#4,9:451\n377#4:472\n378#4,2:475\n368#4,9:493\n377#4:514\n378#4,2:518\n368#4,9:536\n377#4:557\n378#4,2:561\n378#4,2:571\n4034#5,6:339\n4034#5,6:376\n4034#5,6:419\n4034#5,6:464\n4034#5,6:506\n4034#5,6:549\n149#6:349\n149#6:386\n149#6:387\n149#6:392\n149#6:429\n149#6:430\n149#6:435\n149#6:436\n149#6:437\n149#6:474\n149#6:479\n149#6:516\n149#6:517\n149#6:522\n149#6:559\n149#6:560\n1225#7,6:565\n*S KotlinDebug\n*F\n+ 1 EventDetails.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventDetailsKt$EventDetails$1\n*L\n109#1:312\n109#1:313,7\n109#1:348\n112#1:350\n112#1:351,6\n112#1:385\n112#1:391\n126#1:393\n126#1:394,6\n126#1:428\n126#1:434\n179#1:438\n179#1:439,6\n179#1:473\n179#1:478\n190#1:480\n190#1:481,6\n190#1:515\n190#1:521\n204#1:523\n204#1:524,6\n204#1:558\n204#1:564\n109#1:574\n109#1:320,6\n109#1:335,4\n109#1:345,2\n112#1:357,6\n112#1:372,4\n112#1:382,2\n112#1:390\n126#1:400,6\n126#1:415,4\n126#1:425,2\n126#1:433\n179#1:445,6\n179#1:460,4\n179#1:470,2\n179#1:477\n190#1:487,6\n190#1:502,4\n190#1:512,2\n190#1:520\n204#1:530,6\n204#1:545,4\n204#1:555,2\n204#1:563\n109#1:573\n109#1:326,9\n109#1:347\n112#1:363,9\n112#1:384\n112#1:388,2\n126#1:406,9\n126#1:427\n126#1:431,2\n179#1:451,9\n179#1:472\n179#1:475,2\n190#1:493,9\n190#1:514\n190#1:518,2\n204#1:536,9\n204#1:557\n204#1:561,2\n109#1:571,2\n109#1:339,6\n112#1:376,6\n126#1:419,6\n179#1:464,6\n190#1:506,6\n204#1:549,6\n112#1:349\n114#1:386\n119#1:387\n126#1:392\n128#1:429\n130#1:430\n170#1:435\n173#1:436\n179#1:437\n181#1:474\n190#1:479\n192#1:516\n199#1:517\n204#1:522\n206#1:559\n213#1:560\n218#1:565,6\n*E\n"})
/*     */   static final class EventDetailsKt$EventDetails$1
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/* 109 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1375708918, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.debug.EventDetails.<anonymous> (EventDetails.kt:108)");  CustomArtifactEvent customArtifactEvent1 = this.$event; int $changed$iv = 0, $i$f$Column = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 312 */         ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 313 */         Modifier modifier$iv = (Modifier)Modifier.Companion;
/* 314 */         Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
/* 315 */         Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */ 
/*     */         
/* 318 */         MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 319 */         int $i$f$Layout = 0;
/* 320 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 321 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 322 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 323 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */         
/* 325 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 326 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 327 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 328 */           .startReusableNode();
/* 329 */         if ($composer.getInserting()) { $composer
/* 330 */             .createNode(function0); } else { $composer
/*     */             
/* 332 */             .useNode(); }
/*     */         
/* 334 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 335 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 336 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 338 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 339 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 340 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 341 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 342 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 345 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 347 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/* 348 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; ColumnScope $this$invoke_u24lambda_u248 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1 = 0; CustomArtifactEvent customArtifactEvent2 = customArtifactEvent1; if (customArtifactEvent2 instanceof LlmRequestEvent)
/* 349 */         { composer1.startReplaceGroup(-1787217185); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 350 */           ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 351 */           Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 352 */           Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */           
/* 355 */           MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 356 */           int i1 = 0;
/* 357 */           ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 358 */           int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 359 */           CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 360 */           Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */           
/* 362 */           Function0 function01 = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 363 */           ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 364 */           if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 365 */             .startReusableNode();
/* 366 */           if (composer1.getInserting()) { composer1
/* 367 */               .createNode(function01); } else { composer1
/*     */               
/* 369 */               .useNode(); }
/*     */           
/* 371 */           Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 372 */           Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 373 */           Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */           
/* 375 */           Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 376 */           Composer composer3 = composer2; int i7 = 0;
/* 377 */           if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 378 */             composer3.updateRememberedValue(Integer.valueOf(i2));
/* 379 */             composer2.apply(Integer.valueOf(i2), function2);
/*     */           } 
/*     */           
/* 382 */           Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */           
/* 384 */           int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 385 */           ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u240 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$1 = 0; FontWeight fontWeight2 = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Llm Request Event:", null, 0L, l, null, fontWeight2, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 386 */           SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("ID: " + ((LlmRequestEvent)customArtifactEvent1).getId(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Attempt Number: " + ((LlmRequestEvent)customArtifactEvent1).getAttemptNumber(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); EventDetailsKt.MatterhornChatView(((LlmRequestEvent)customArtifactEvent1).getChat(), composer5, 0); i11 = 16; i12 = 0;
/* 387 */           SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); FontWeight fontWeight1 = FontWeight.Companion.getBold(); l = TextUnitKt.getSp(14); TextKt.Text-bAzTDeA("Model Parameters:", null, 0L, l, null, fontWeight1, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); EventDetailsKt.ModelParametersView(((LlmRequestEvent)customArtifactEvent1).getModelParameters(), composer5, 0); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 388 */           composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 389 */           ComposerKt.sourceInformationMarkerEnd(composer1);
/* 390 */           ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */         else if (customArtifactEvent2 instanceof LlmResponseEvent)
/* 392 */         { composer1.startReplaceGroup(-1786573408); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 393 */           ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 394 */           Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 395 */           Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */           
/* 398 */           MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 399 */           int i1 = 0;
/* 400 */           ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 401 */           int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 402 */           CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 403 */           Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */           
/* 405 */           Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 406 */           ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 407 */           if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 408 */             .startReusableNode();
/* 409 */           if (composer1.getInserting()) { composer1
/* 410 */               .createNode(factory$iv$iv$iv); } else { composer1
/*     */               
/* 412 */               .useNode(); }
/*     */           
/* 414 */           Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 415 */           Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 416 */           Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */           
/* 418 */           Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 419 */           Composer composer3 = composer2; int i7 = 0;
/* 420 */           if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 421 */             composer3.updateRememberedValue(Integer.valueOf(i2));
/* 422 */             composer2.apply(Integer.valueOf(i2), function2);
/*     */           } 
/*     */           
/* 425 */           Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */           
/* 427 */           int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 428 */           ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u241 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$2 = 0; FontWeight fontWeight2 = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Llm Response Event:", null, 0L, l, null, fontWeight2, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 429 */           SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("ID: " + ((LlmResponseEvent)customArtifactEvent1).getId(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); i11 = 16; i12 = 0;
/* 430 */           SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); FontWeight fontWeight1 = FontWeight.Companion.getBold(); l = TextUnitKt.getSp(14); TextKt.Text-bAzTDeA("Answer Details:", null, 0L, l, null, fontWeight1, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); EventDetailsKt.AIAnswerView(((LlmResponseEvent)customArtifactEvent1).getAnswer(), composer5, 0); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 431 */           composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 432 */           ComposerKt.sourceInformationMarkerEnd(composer1);
/* 433 */           ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof LlmRequestFailed) { composer1.startReplaceGroup(-1786064729); TextKt.Text-bAzTDeA("LlmRequestFailed:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); TextKt.Text-bAzTDeA("ID: " + ((LlmRequestFailed)customArtifactEvent1).getId(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); TextKt.Text-bAzTDeA("Error: " + ((LlmRequestFailed)customArtifactEvent1).getException().getMessage(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof com.intellij.ml.llm.matterhorn.ej.core.BeforeStepStartedEvent) { composer1.startReplaceGroup(-1785897577); TextKt.Text-bAzTDeA("BeforeStepStartedEvent:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof com.intellij.ml.llm.matterhorn.ej.core.AfterStepFinishedEvent) { composer1.startReplaceGroup(-1785807398); TextKt.Text-bAzTDeA("AfterStepEndedEvent:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof ActionRequestBuildingStarted) { composer1.startReplaceGroup(-1785712104); TextKt.Text-bAzTDeA("ActionRequestBuildingStarted:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); TextKt.Text-bAzTDeA("Attempt Number: " + ((ActionRequestBuildingStarted)customArtifactEvent1).getAttemptNumber(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof ActionRequestBuildingFinished) { composer1.startReplaceGroup(-1785550594); TextKt.Text-bAzTDeA("ActionRequestBuildingFinished:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); TextKt.Text-bAzTDeA("Attempt Number: " + ((ActionRequestBuildingFinished)customArtifactEvent1).getAttemptNumber(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); TextKt.Text-bAzTDeA("Action Request: " + ((ActionRequestBuildingFinished)customArtifactEvent1).getActionRequest(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); }
/*     */         else if (customArtifactEvent2 instanceof ActionRequestBuildingFailed) { composer1.startReplaceGroup(-1785317133); TextKt.Text-bAzTDeA("ActionRequestBuildingFailed:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); TextKt.Text-bAzTDeA("Attempt Number: " + ((ActionRequestBuildingFailed)customArtifactEvent1).getAttemptNumber(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); TextKt.Text-bAzTDeA("Error:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); SerializableThrowable throwable = ((ActionRequestBuildingFailed)customArtifactEvent1).getSerializableThrowable(); if (throwable != null) { if (throwable.getMessage() == null)
/* 435 */               throwable.getMessage();  String message = "No message"; String stackTrace = throwable.getStackTrace(); SerializableThrowable it = throwable.getCause(); int $i$a$-let-EventDetailsKt$EventDetails$1$1$cause$1 = 0; throwable.getCause(); String cause = (throwable.getCause() != null) ? ("Caused by: " + it.getMessage() + "\n" + it.getStackTrace()) : null; TextKt.Text-bAzTDeA("Message: " + message, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); TextKt.Text-bAzTDeA("Stack Trace:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); int $this$dp$iv = 8, $i$f$getDp = 0; TextKt.Text-bAzTDeA(stackTrace, PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv), 0.0F, 0.0F, 0.0F, 14, null), 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 48, 0, 65532); if (cause != null)
/* 436 */             { TextKt.Text-bAzTDeA("Cause:", null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 6, 0, 65534); $this$dp$iv = 8; $i$f$getDp = 0; TextKt.Text-bAzTDeA(cause, PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv), 0.0F, 0.0F, 0.0F, 14, null), 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 48, 0, 65532); }  }  composer1.endReplaceGroup(); }
/* 437 */         else if (customArtifactEvent2 instanceof AgentActionExecutionStarted) { composer1.startReplaceGroup(-1784527656); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 438 */           ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 439 */           Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 440 */           Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */           
/* 443 */           MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 444 */           int i1 = 0;
/* 445 */           ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 446 */           int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 447 */           CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 448 */           Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */           
/* 450 */           Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 451 */           ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 452 */           if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 453 */             .startReusableNode();
/* 454 */           if (composer1.getInserting()) { composer1
/* 455 */               .createNode(factory$iv$iv$iv); } else { composer1
/*     */               
/* 457 */               .useNode(); }
/*     */           
/* 459 */           Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 460 */           Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 461 */           Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */           
/* 463 */           Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 464 */           Composer composer3 = composer2; int i7 = 0;
/* 465 */           if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 466 */             composer3.updateRememberedValue(Integer.valueOf(i2));
/* 467 */             composer2.apply(Integer.valueOf(i2), function2);
/*     */           } 
/*     */           
/* 470 */           Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */           
/* 472 */           int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 473 */           ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u243 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$3 = 0; FontWeight fontWeight = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Agent Action Execution Started:", null, 0L, l, null, fontWeight, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 474 */           SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("Action Name: " + ((AgentActionExecutionStarted)customArtifactEvent1).getActionToExecute().getName(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Description: " + ((AgentActionExecutionStarted)customArtifactEvent1).getActionToExecute().getDescription(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Number of Commands: " + ((AgentActionExecutionStarted)customArtifactEvent1).getActionToExecute().getNumCommands(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Title: " + ((AgentActionExecutionStarted)customArtifactEvent1).getActionToExecute().getTitle(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 475 */           composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 476 */           ComposerKt.sourceInformationMarkerEnd(composer1);
/* 477 */           ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */         else if (customArtifactEvent2 instanceof AgentActionExecutionFinished)
/* 479 */         { composer1.startReplaceGroup(-1783984939); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 480 */           ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 481 */           Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 482 */           Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */           
/* 485 */           MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 486 */           int i1 = 0;
/* 487 */           ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 488 */           int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 489 */           CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 490 */           Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */           
/* 492 */           Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 493 */           ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 494 */           if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 495 */             .startReusableNode();
/* 496 */           if (composer1.getInserting()) { composer1
/* 497 */               .createNode(factory$iv$iv$iv); } else { composer1
/*     */               
/* 499 */               .useNode(); }
/*     */           
/* 501 */           Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 502 */           Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 503 */           Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */           
/* 505 */           Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 506 */           Composer composer3 = composer2; int i7 = 0;
/* 507 */           if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 508 */             composer3.updateRememberedValue(Integer.valueOf(i2));
/* 509 */             composer2.apply(Integer.valueOf(i2), function2);
/*     */           } 
/*     */           
/* 512 */           Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */           
/* 514 */           int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 515 */           ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u244 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$4 = 0; FontWeight fontWeight = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Agent Action Execution Finished:", null, 0L, l, null, fontWeight, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 516 */           SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("Action Name: " + ((AgentActionExecutionFinished)customArtifactEvent1).getActionToExecute().getName(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Description: " + ((AgentActionExecutionFinished)customArtifactEvent1).getActionToExecute().getDescription(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Number of Commands: " + ((AgentActionExecutionFinished)customArtifactEvent1).getActionToExecute().getNumCommands(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Title: " + ((AgentActionExecutionFinished)customArtifactEvent1).getActionToExecute().getTitle(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); i11 = 8; i12 = 0;
/* 517 */           SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("Result: " + ((AgentActionExecutionFinished)customArtifactEvent1).getResult(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); ComposerKt.sourceInformationMarkerEnd(composer4);
/* 518 */           composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 519 */           ComposerKt.sourceInformationMarkerEnd(composer1);
/* 520 */           ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */         else if (customArtifactEvent2 instanceof AgentActionExecutionFailed)
/* 522 */         { composer1.startReplaceGroup(-1783347641); int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); int k = 6, m = 0;
/* 523 */           ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 524 */           Arrangement.Vertical vertical = Arrangement.INSTANCE.getTop();
/* 525 */           Alignment.Horizontal horizontal = Alignment.Companion.getStart();
/*     */ 
/*     */           
/* 528 */           MeasurePolicy measurePolicy = ColumnKt.columnMeasurePolicy(vertical, horizontal, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3;
/* 529 */           int i1 = 0;
/* 530 */           ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 531 */           int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
/* 532 */           CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap();
/* 533 */           Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
/*     */           
/* 535 */           Function0 factory$iv$iv$iv = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0;
/* 536 */           ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 537 */           if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 538 */             .startReusableNode();
/* 539 */           if (composer1.getInserting()) { composer1
/* 540 */               .createNode(factory$iv$iv$iv); } else { composer1
/*     */               
/* 542 */               .useNode(); }
/*     */           
/* 544 */           Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0;
/* 545 */           Updater.set-impl(composer2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 546 */           Updater.set-impl(composer2, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */           
/* 548 */           Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0;
/* 549 */           Composer composer3 = composer2; int i7 = 0;
/* 550 */           if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) {
/* 551 */             composer3.updateRememberedValue(Integer.valueOf(i2));
/* 552 */             composer2.apply(Integer.valueOf(i2), function2);
/*     */           } 
/*     */           
/* 555 */           Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier());
/*     */           
/* 557 */           int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0;
/* 558 */           ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u248_u24lambda_u245 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-EventDetailsKt$EventDetails$1$1$5 = 0; FontWeight fontWeight = FontWeight.Companion.getBold(); long l = TextUnitKt.getSp(16); TextKt.Text-bAzTDeA("Agent Action Execution Failed:", null, 0L, l, null, fontWeight, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 199686, 0, 65494); int i11 = 8, i12 = 0;
/* 559 */           SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); TextKt.Text-bAzTDeA("Action Name: " + ((AgentActionExecutionFailed)customArtifactEvent1).getActionToExecute().getName(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Description: " + ((AgentActionExecutionFailed)customArtifactEvent1).getActionToExecute().getDescription(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Number of Commands: " + ((AgentActionExecutionFailed)customArtifactEvent1).getActionToExecute().getNumCommands(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); TextKt.Text-bAzTDeA("Title: " + ((AgentActionExecutionFailed)customArtifactEvent1).getActionToExecute().getTitle(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 0, 0, 65534); i11 = 8; i12 = 0;
/* 560 */           SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl(i11)), composer5, 6); if (((AgentActionExecutionFailed)customArtifactEvent1).getException().getMessage() == null)
/* 561 */             ((AgentActionExecutionFailed)customArtifactEvent1).getException().getMessage();  TextKt.Text-bAzTDeA("Error: " + "Unknown error", null, Color.Companion.getRed-0d7_KjU(), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer5, 384, 0, 65530); ComposerKt.sourceInformationMarkerEnd(composer4); composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 562 */           ComposerKt.sourceInformationMarkerEnd(composer1);
/* 563 */           ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */         else if (customArtifactEvent2 instanceof PlanUpdatedEvent)
/* 565 */         { composer1.startReplaceGroup(-1782692766); composer1.startReplaceGroup(-1858619782); Composer composer = composer1; boolean invalid$iv = false; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */           
/* 567 */           CharSequence charSequence1 = null; boolean bool = false; CharSequence charSequence2 = null, charSequence3 = null, charSequence4 = "\n"; List list = ((PlanUpdatedEvent)customArtifactEvent1).getPlan(); int $i$a$-cache-EventDetailsKt$EventDetails$1$1$6 = 0; Function1 function12 = EventDetailsKt$EventDetails$1::invoke$lambda$8$lambda$7$lambda$6; Object value$iv = function12;
/* 568 */           composer.updateRememberedValue(value$iv);
/* 569 */           Function1 function11 = (it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 570 */             (Function1)it$iv; composer1.endReplaceGroup(); TextKt.Text-bAzTDeA("Plan:\n" + CollectionsKt.joinToString$default(list, charSequence4, charSequence3, charSequence2, bool, charSequence1, function11, 30, null), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof AgentStateUpdatedEvent) { composer1.startReplaceGroup(-1782551437); TextKt.Text-bAzTDeA("Agent state: " + ((AgentStateUpdatedEvent)customArtifactEvent1).getState(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof BeforeArtifactBuildingStarted) { composer1.startReplaceGroup(-1782448827); ((BeforeArtifactBuildingStarted)customArtifactEvent1).getRequestId(); TextKt.Text-bAzTDeA("Id: " + EventDetailsKt.getPresentableArtifactNameAndType((((BeforeArtifactBuildingStarted)customArtifactEvent1).getRequestId() != null) ? ((BeforeArtifactBuildingStarted)customArtifactEvent1).getRequestId().toArtifactId() : null), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof AfterArtifactBuildingFinished) { composer1.startReplaceGroup(-1782302011); ((AfterArtifactBuildingFinished)customArtifactEvent1).getRequestId(); TextKt.Text-bAzTDeA("Id: " + EventDetailsKt.getPresentableArtifactNameAndType((((AfterArtifactBuildingFinished)customArtifactEvent1).getRequestId() != null) ? ((AfterArtifactBuildingFinished)customArtifactEvent1).getRequestId().toArtifactId() : null), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else if (customArtifactEvent2 instanceof StepMetaInfoAppearedEvent) { composer1.startReplaceGroup(-1782159783); TextKt.Text-bAzTDeA("MetaInfo: " + ((StepMetaInfoAppearedEvent)customArtifactEvent1).getStepName() + ", type = " + ((StepMetaInfoAppearedEvent)customArtifactEvent1).getStepType(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); } else { composer1.startReplaceGroup(-1782061668); TextKt.Text-bAzTDeA("Event Data: " + customArtifactEvent1, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65534); composer1.endReplaceGroup(); }
/* 571 */          ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 572 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 573 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 574 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */     
/*     */     private static final CharSequence invoke$lambda$8$lambda$7$lambda$6(PlanItem it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return it.getDescription() + " " + it.getDescription();
/*     */     }
/*     */     
/*     */     EventDetailsKt$EventDetails$1(CustomArtifactEvent $event) {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String getPresentableArtifactNameAndType(@Nullable ArtifactId artifactId) {
/*     */     if (artifactId == null || artifactId.getName() == null)
/*     */       artifactId.getName(); 
/*     */     if (artifactId == null || artifactId.getType() == null)
/*     */       artifactId.getType(); 
/*     */     return "" + artifactId.getType() + " " + artifactId.getType();
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void AIAnswerView(@NotNull AIAnswer answer, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'answer'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 275475223
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_1
/*     */     //   17: iload_2
/*     */     //   18: istore_3
/*     */     //   19: iload_2
/*     */     //   20: bipush #6
/*     */     //   22: iand
/*     */     //   23: ifne -> 44
/*     */     //   26: iload_3
/*     */     //   27: aload_1
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: iconst_3
/*     */     //   46: iand
/*     */     //   47: iconst_2
/*     */     //   48: if_icmpne -> 60
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getSkipping : ()Z
/*     */     //   57: ifne -> 889
/*     */     //   60: invokestatic isTraceInProgress : ()Z
/*     */     //   63: ifeq -> 77
/*     */     //   66: ldc_w 275475223
/*     */     //   69: iload_3
/*     */     //   70: iconst_m1
/*     */     //   71: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.AIAnswerView (EventDetails.kt:244)'
/*     */     //   74: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   77: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   80: checkcast androidx/compose/ui/Modifier
/*     */     //   83: bipush #8
/*     */     //   85: istore #4
/*     */     //   87: iconst_0
/*     */     //   88: istore #5
/*     */     //   90: iload #4
/*     */     //   92: i2f
/*     */     //   93: invokestatic constructor-impl : (F)F
/*     */     //   96: fconst_0
/*     */     //   97: fconst_0
/*     */     //   98: fconst_0
/*     */     //   99: bipush #14
/*     */     //   101: aconst_null
/*     */     //   102: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   105: astore #4
/*     */     //   107: bipush #6
/*     */     //   109: istore #7
/*     */     //   111: iconst_0
/*     */     //   112: istore #8
/*     */     //   114: aload_1
/*     */     //   115: ldc -483455358
/*     */     //   117: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   119: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   122: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   125: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   128: astore #5
/*     */     //   130: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   133: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   136: astore #6
/*     */     //   138: aload #5
/*     */     //   140: aload #6
/*     */     //   142: aload_1
/*     */     //   143: bipush #14
/*     */     //   145: iload #7
/*     */     //   147: iconst_3
/*     */     //   148: ishr
/*     */     //   149: iand
/*     */     //   150: bipush #112
/*     */     //   152: iload #7
/*     */     //   154: iconst_3
/*     */     //   155: ishr
/*     */     //   156: iand
/*     */     //   157: ior
/*     */     //   158: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   161: astore #9
/*     */     //   163: bipush #112
/*     */     //   165: iload #7
/*     */     //   167: iconst_3
/*     */     //   168: ishl
/*     */     //   169: iand
/*     */     //   170: istore #10
/*     */     //   172: nop
/*     */     //   173: iconst_0
/*     */     //   174: istore #11
/*     */     //   176: aload_1
/*     */     //   177: ldc -1323940314
/*     */     //   179: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   181: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   184: aload_1
/*     */     //   185: iconst_0
/*     */     //   186: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   189: istore #12
/*     */     //   191: aload_1
/*     */     //   192: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   197: astore #13
/*     */     //   199: aload_1
/*     */     //   200: aload #4
/*     */     //   202: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   205: astore #14
/*     */     //   207: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   210: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   213: astore #15
/*     */     //   215: bipush #6
/*     */     //   217: sipush #896
/*     */     //   220: iload #10
/*     */     //   222: bipush #6
/*     */     //   224: ishl
/*     */     //   225: iand
/*     */     //   226: ior
/*     */     //   227: istore #16
/*     */     //   229: nop
/*     */     //   230: iconst_0
/*     */     //   231: istore #17
/*     */     //   233: aload_1
/*     */     //   234: ldc -692256719
/*     */     //   236: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   238: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   241: aload_1
/*     */     //   242: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   247: instanceof androidx/compose/runtime/Applier
/*     */     //   250: ifne -> 256
/*     */     //   253: invokestatic invalidApplier : ()V
/*     */     //   256: aload_1
/*     */     //   257: invokeinterface startReusableNode : ()V
/*     */     //   262: aload_1
/*     */     //   263: invokeinterface getInserting : ()Z
/*     */     //   268: ifeq -> 282
/*     */     //   271: aload_1
/*     */     //   272: aload #15
/*     */     //   274: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   279: goto -> 288
/*     */     //   282: aload_1
/*     */     //   283: invokeinterface useNode : ()V
/*     */     //   288: aload_1
/*     */     //   289: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   292: astore #18
/*     */     //   294: iconst_0
/*     */     //   295: istore #19
/*     */     //   297: aload #18
/*     */     //   299: aload #9
/*     */     //   301: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   304: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   307: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   310: aload #18
/*     */     //   312: aload #13
/*     */     //   314: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   317: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   320: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   323: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   326: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   329: astore #20
/*     */     //   331: iconst_0
/*     */     //   332: istore #21
/*     */     //   334: aload #18
/*     */     //   336: astore #22
/*     */     //   338: iconst_0
/*     */     //   339: istore #23
/*     */     //   341: aload #22
/*     */     //   343: invokeinterface getInserting : ()Z
/*     */     //   348: ifne -> 369
/*     */     //   351: aload #22
/*     */     //   353: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   358: iload #12
/*     */     //   360: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   363: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   366: ifne -> 395
/*     */     //   369: aload #22
/*     */     //   371: iload #12
/*     */     //   373: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   376: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   381: aload #18
/*     */     //   383: iload #12
/*     */     //   385: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   388: aload #20
/*     */     //   390: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   395: nop
/*     */     //   396: nop
/*     */     //   397: nop
/*     */     //   398: aload #18
/*     */     //   400: aload #14
/*     */     //   402: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   405: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   408: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   411: nop
/*     */     //   412: nop
/*     */     //   413: aload_1
/*     */     //   414: bipush #14
/*     */     //   416: iload #16
/*     */     //   418: bipush #6
/*     */     //   420: ishr
/*     */     //   421: iand
/*     */     //   422: istore #24
/*     */     //   424: astore #25
/*     */     //   426: iconst_0
/*     */     //   427: istore #26
/*     */     //   429: aload #25
/*     */     //   431: ldc -384784025
/*     */     //   433: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   435: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   438: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   441: aload #25
/*     */     //   443: bipush #6
/*     */     //   445: bipush #112
/*     */     //   447: iload #7
/*     */     //   449: bipush #6
/*     */     //   451: ishr
/*     */     //   452: iand
/*     */     //   453: ior
/*     */     //   454: istore #27
/*     */     //   456: astore #28
/*     */     //   458: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   461: astore #29
/*     */     //   463: iconst_0
/*     */     //   464: istore #30
/*     */     //   466: aload_0
/*     */     //   467: invokevirtual getLlm : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   470: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;)Ljava/lang/String;
/*     */     //   475: aconst_null
/*     */     //   476: lconst_0
/*     */     //   477: lconst_0
/*     */     //   478: aconst_null
/*     */     //   479: aconst_null
/*     */     //   480: aconst_null
/*     */     //   481: lconst_0
/*     */     //   482: aconst_null
/*     */     //   483: iconst_0
/*     */     //   484: lconst_0
/*     */     //   485: iconst_0
/*     */     //   486: iconst_0
/*     */     //   487: iconst_0
/*     */     //   488: aconst_null
/*     */     //   489: aconst_null
/*     */     //   490: aload #28
/*     */     //   492: iconst_0
/*     */     //   493: iconst_0
/*     */     //   494: ldc 65534
/*     */     //   496: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   499: aload_0
/*     */     //   500: invokevirtual getCached : ()Z
/*     */     //   503: <illegal opcode> makeConcatWithConstants : (Z)Ljava/lang/String;
/*     */     //   508: aconst_null
/*     */     //   509: lconst_0
/*     */     //   510: lconst_0
/*     */     //   511: aconst_null
/*     */     //   512: aconst_null
/*     */     //   513: aconst_null
/*     */     //   514: lconst_0
/*     */     //   515: aconst_null
/*     */     //   516: iconst_0
/*     */     //   517: lconst_0
/*     */     //   518: iconst_0
/*     */     //   519: iconst_0
/*     */     //   520: iconst_0
/*     */     //   521: aconst_null
/*     */     //   522: aconst_null
/*     */     //   523: aload #28
/*     */     //   525: iconst_0
/*     */     //   526: iconst_0
/*     */     //   527: ldc 65534
/*     */     //   529: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   532: aload_0
/*     */     //   533: invokevirtual getInputTokens : ()J
/*     */     //   536: <illegal opcode> makeConcatWithConstants : (J)Ljava/lang/String;
/*     */     //   541: aconst_null
/*     */     //   542: lconst_0
/*     */     //   543: lconst_0
/*     */     //   544: aconst_null
/*     */     //   545: aconst_null
/*     */     //   546: aconst_null
/*     */     //   547: lconst_0
/*     */     //   548: aconst_null
/*     */     //   549: iconst_0
/*     */     //   550: lconst_0
/*     */     //   551: iconst_0
/*     */     //   552: iconst_0
/*     */     //   553: iconst_0
/*     */     //   554: aconst_null
/*     */     //   555: aconst_null
/*     */     //   556: aload #28
/*     */     //   558: iconst_0
/*     */     //   559: iconst_0
/*     */     //   560: ldc 65534
/*     */     //   562: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   565: aload_0
/*     */     //   566: invokevirtual getOutputTokens : ()J
/*     */     //   569: <illegal opcode> makeConcatWithConstants : (J)Ljava/lang/String;
/*     */     //   574: aconst_null
/*     */     //   575: lconst_0
/*     */     //   576: lconst_0
/*     */     //   577: aconst_null
/*     */     //   578: aconst_null
/*     */     //   579: aconst_null
/*     */     //   580: lconst_0
/*     */     //   581: aconst_null
/*     */     //   582: iconst_0
/*     */     //   583: lconst_0
/*     */     //   584: iconst_0
/*     */     //   585: iconst_0
/*     */     //   586: iconst_0
/*     */     //   587: aconst_null
/*     */     //   588: aconst_null
/*     */     //   589: aload #28
/*     */     //   591: iconst_0
/*     */     //   592: iconst_0
/*     */     //   593: ldc 65534
/*     */     //   595: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   598: aload_0
/*     */     //   599: invokevirtual getCacheInputTokens : ()J
/*     */     //   602: <illegal opcode> makeConcatWithConstants : (J)Ljava/lang/String;
/*     */     //   607: aconst_null
/*     */     //   608: lconst_0
/*     */     //   609: lconst_0
/*     */     //   610: aconst_null
/*     */     //   611: aconst_null
/*     */     //   612: aconst_null
/*     */     //   613: lconst_0
/*     */     //   614: aconst_null
/*     */     //   615: iconst_0
/*     */     //   616: lconst_0
/*     */     //   617: iconst_0
/*     */     //   618: iconst_0
/*     */     //   619: iconst_0
/*     */     //   620: aconst_null
/*     */     //   621: aconst_null
/*     */     //   622: aload #28
/*     */     //   624: iconst_0
/*     */     //   625: iconst_0
/*     */     //   626: ldc 65534
/*     */     //   628: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   631: aload_0
/*     */     //   632: invokevirtual getCacheCreateInputTokens : ()J
/*     */     //   635: <illegal opcode> makeConcatWithConstants : (J)Ljava/lang/String;
/*     */     //   640: aconst_null
/*     */     //   641: lconst_0
/*     */     //   642: lconst_0
/*     */     //   643: aconst_null
/*     */     //   644: aconst_null
/*     */     //   645: aconst_null
/*     */     //   646: lconst_0
/*     */     //   647: aconst_null
/*     */     //   648: iconst_0
/*     */     //   649: lconst_0
/*     */     //   650: iconst_0
/*     */     //   651: iconst_0
/*     */     //   652: iconst_0
/*     */     //   653: aconst_null
/*     */     //   654: aconst_null
/*     */     //   655: aload #28
/*     */     //   657: iconst_0
/*     */     //   658: iconst_0
/*     */     //   659: ldc 65534
/*     */     //   661: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   664: aload_0
/*     */     //   665: invokevirtual getCost : ()D
/*     */     //   668: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*     */     //   673: aconst_null
/*     */     //   674: lconst_0
/*     */     //   675: lconst_0
/*     */     //   676: aconst_null
/*     */     //   677: aconst_null
/*     */     //   678: aconst_null
/*     */     //   679: lconst_0
/*     */     //   680: aconst_null
/*     */     //   681: iconst_0
/*     */     //   682: lconst_0
/*     */     //   683: iconst_0
/*     */     //   684: iconst_0
/*     */     //   685: iconst_0
/*     */     //   686: aconst_null
/*     */     //   687: aconst_null
/*     */     //   688: aload #28
/*     */     //   690: iconst_0
/*     */     //   691: iconst_0
/*     */     //   692: ldc 65534
/*     */     //   694: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   697: aload_0
/*     */     //   698: invokevirtual getTime : ()J
/*     */     //   701: invokestatic valueOf : (J)Ljava/lang/Long;
/*     */     //   704: invokestatic formatTimestamp : (Ljava/lang/Long;)Ljava/lang/String;
/*     */     //   707: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   712: aconst_null
/*     */     //   713: lconst_0
/*     */     //   714: lconst_0
/*     */     //   715: aconst_null
/*     */     //   716: aconst_null
/*     */     //   717: aconst_null
/*     */     //   718: lconst_0
/*     */     //   719: aconst_null
/*     */     //   720: iconst_0
/*     */     //   721: lconst_0
/*     */     //   722: iconst_0
/*     */     //   723: iconst_0
/*     */     //   724: iconst_0
/*     */     //   725: aconst_null
/*     */     //   726: aconst_null
/*     */     //   727: aload #28
/*     */     //   729: iconst_0
/*     */     //   730: iconst_0
/*     */     //   731: ldc 65534
/*     */     //   733: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   736: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   739: checkcast androidx/compose/ui/Modifier
/*     */     //   742: bipush #8
/*     */     //   744: istore #31
/*     */     //   746: iconst_0
/*     */     //   747: istore #32
/*     */     //   749: iload #31
/*     */     //   751: i2f
/*     */     //   752: invokestatic constructor-impl : (F)F
/*     */     //   755: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   758: aload #28
/*     */     //   760: bipush #6
/*     */     //   762: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   765: aload #28
/*     */     //   767: ldc_w 2139084401
/*     */     //   770: invokeinterface startReplaceGroup : (I)V
/*     */     //   775: aload_0
/*     */     //   776: invokevirtual getContentChoices : ()Ljava/util/List;
/*     */     //   779: checkcast java/util/Collection
/*     */     //   782: invokeinterface isEmpty : ()Z
/*     */     //   787: ifne -> 794
/*     */     //   790: iconst_1
/*     */     //   791: goto -> 795
/*     */     //   794: iconst_0
/*     */     //   795: ifeq -> 843
/*     */     //   798: ldc_w 'Content Choices:'
/*     */     //   801: aconst_null
/*     */     //   802: lconst_0
/*     */     //   803: lconst_0
/*     */     //   804: aconst_null
/*     */     //   805: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   808: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   811: aconst_null
/*     */     //   812: lconst_0
/*     */     //   813: aconst_null
/*     */     //   814: iconst_0
/*     */     //   815: lconst_0
/*     */     //   816: iconst_0
/*     */     //   817: iconst_0
/*     */     //   818: iconst_0
/*     */     //   819: aconst_null
/*     */     //   820: aconst_null
/*     */     //   821: aload #28
/*     */     //   823: ldc_w 196614
/*     */     //   826: iconst_0
/*     */     //   827: ldc_w 65502
/*     */     //   830: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   833: aload_0
/*     */     //   834: invokevirtual getContentChoices : ()Ljava/util/List;
/*     */     //   837: aload #28
/*     */     //   839: iconst_0
/*     */     //   840: invokestatic ContentChoicesView : (Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
/*     */     //   843: aload #28
/*     */     //   845: invokeinterface endReplaceGroup : ()V
/*     */     //   850: nop
/*     */     //   851: aload #25
/*     */     //   853: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   856: aload_1
/*     */     //   857: invokeinterface endNode : ()V
/*     */     //   862: aload_1
/*     */     //   863: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   866: nop
/*     */     //   867: aload_1
/*     */     //   868: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   871: nop
/*     */     //   872: aload_1
/*     */     //   873: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   876: nop
/*     */     //   877: invokestatic isTraceInProgress : ()Z
/*     */     //   880: ifeq -> 895
/*     */     //   883: invokestatic traceEventEnd : ()V
/*     */     //   886: goto -> 895
/*     */     //   889: aload_1
/*     */     //   890: invokeinterface skipToGroupEnd : ()V
/*     */     //   895: aload_1
/*     */     //   896: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   901: dup
/*     */     //   902: ifnull -> 920
/*     */     //   905: aload_0
/*     */     //   906: iload_2
/*     */     //   907: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;I)Lkotlin/jvm/functions/Function2;
/*     */     //   912: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   917: goto -> 921
/*     */     //   920: pop
/*     */     //   921: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #245	-> 7
/*     */     //   #246	-> 77
/*     */     //   #527	-> 90
/*     */     //   #246	-> 96
/*     */     //   #528	-> 119
/*     */     //   #529	-> 122
/*     */     //   #530	-> 130
/*     */     //   #533	-> 138
/*     */     //   #534	-> 172
/*     */     //   #535	-> 181
/*     */     //   #536	-> 186
/*     */     //   #537	-> 192
/*     */     //   #538	-> 200
/*     */     //   #540	-> 207
/*     */     //   #539	-> 229
/*     */     //   #541	-> 238
/*     */     //   #542	-> 241
/*     */     //   #543	-> 257
/*     */     //   #544	-> 262
/*     */     //   #545	-> 272
/*     */     //   #547	-> 283
/*     */     //   #549	-> 288
/*     */     //   #550	-> 297
/*     */     //   #551	-> 310
/*     */     //   #553	-> 323
/*     */     //   #554	-> 334
/*     */     //   #555	-> 341
/*     */     //   #556	-> 369
/*     */     //   #557	-> 381
/*     */     //   #559	-> 395
/*     */     //   #554	-> 396
/*     */     //   #559	-> 397
/*     */     //   #560	-> 398
/*     */     //   #561	-> 411
/*     */     //   #549	-> 412
/*     */     //   #562	-> 413
/*     */     //   #563	-> 435
/*     */     //   #247	-> 466
/*     */     //   #248	-> 499
/*     */     //   #249	-> 532
/*     */     //   #250	-> 565
/*     */     //   #251	-> 598
/*     */     //   #252	-> 631
/*     */     //   #253	-> 664
/*     */     //   #254	-> 697
/*     */     //   #256	-> 736
/*     */     //   #564	-> 749
/*     */     //   #256	-> 755
/*     */     //   #257	-> 775
/*     */     //   #257	-> 795
/*     */     //   #258	-> 798
/*     */     //   #259	-> 833
/*     */     //   #261	-> 850
/*     */     //   #563	-> 851
/*     */     //   #562	-> 856
/*     */     //   #565	-> 857
/*     */     //   #541	-> 863
/*     */     //   #566	-> 866
/*     */     //   #535	-> 868
/*     */     //   #567	-> 871
/*     */     //   #528	-> 873
/*     */     //   #568	-> 876
/*     */     //   #262	-> 889
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   90	6	5	$i$f$getDp	I
/*     */     //   87	9	4	$this$dp$iv	I
/*     */     //   749	6	32	$i$f$getDp	I
/*     */     //   746	9	31	$this$dp$iv	I
/*     */     //   466	385	30	$i$a$-Column-EventDetailsKt$AIAnswerView$1	I
/*     */     //   463	388	29	$this$AIAnswerView_u24lambda_u2415	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   463	388	28	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   463	388	27	$changed	I
/*     */     //   429	427	26	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   426	430	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   426	430	24	$changed$iv	I
/*     */     //   341	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   338	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   334	64	21	$i$f$set-impl	I
/*     */     //   331	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   297	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   294	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   233	634	17	$i$f$ReusableComposeNode	I
/*     */     //   230	637	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   230	637	16	$changed$iv$iv$iv	I
/*     */     //   176	696	11	$i$f$Layout	I
/*     */     //   191	681	12	compositeKeyHash$iv$iv	I
/*     */     //   199	673	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   207	665	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   173	699	10	$changed$iv$iv	I
/*     */     //   114	763	8	$i$f$Column	I
/*     */     //   163	714	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   111	766	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   130	747	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   138	739	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   111	766	7	$changed$iv	I
/*     */     //   19	903	3	$dirty	I
/*     */     //   0	922	0	answer	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   0	922	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	922	2	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void ContentChoicesView(@NotNull List contentChoices, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'contentChoices'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w -929330958
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_1
/*     */     //   17: iload_2
/*     */     //   18: istore_3
/*     */     //   19: iload_2
/*     */     //   20: bipush #6
/*     */     //   22: iand
/*     */     //   23: ifne -> 44
/*     */     //   26: iload_3
/*     */     //   27: aload_1
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: iconst_3
/*     */     //   46: iand
/*     */     //   47: iconst_2
/*     */     //   48: if_icmpne -> 60
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getSkipping : ()Z
/*     */     //   57: ifne -> 630
/*     */     //   60: invokestatic isTraceInProgress : ()Z
/*     */     //   63: ifeq -> 77
/*     */     //   66: ldc_w -929330958
/*     */     //   69: iload_3
/*     */     //   70: iconst_m1
/*     */     //   71: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.ContentChoicesView (EventDetails.kt:264)'
/*     */     //   74: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   77: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   80: checkcast androidx/compose/ui/Modifier
/*     */     //   83: bipush #8
/*     */     //   85: istore #4
/*     */     //   87: iconst_0
/*     */     //   88: istore #5
/*     */     //   90: iload #4
/*     */     //   92: i2f
/*     */     //   93: invokestatic constructor-impl : (F)F
/*     */     //   96: fconst_0
/*     */     //   97: fconst_0
/*     */     //   98: fconst_0
/*     */     //   99: bipush #14
/*     */     //   101: aconst_null
/*     */     //   102: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   105: astore #4
/*     */     //   107: bipush #6
/*     */     //   109: istore #7
/*     */     //   111: iconst_0
/*     */     //   112: istore #8
/*     */     //   114: aload_1
/*     */     //   115: ldc -483455358
/*     */     //   117: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   119: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   122: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   125: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   128: astore #5
/*     */     //   130: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   133: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   136: astore #6
/*     */     //   138: aload #5
/*     */     //   140: aload #6
/*     */     //   142: aload_1
/*     */     //   143: bipush #14
/*     */     //   145: iload #7
/*     */     //   147: iconst_3
/*     */     //   148: ishr
/*     */     //   149: iand
/*     */     //   150: bipush #112
/*     */     //   152: iload #7
/*     */     //   154: iconst_3
/*     */     //   155: ishr
/*     */     //   156: iand
/*     */     //   157: ior
/*     */     //   158: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   161: astore #9
/*     */     //   163: bipush #112
/*     */     //   165: iload #7
/*     */     //   167: iconst_3
/*     */     //   168: ishl
/*     */     //   169: iand
/*     */     //   170: istore #10
/*     */     //   172: nop
/*     */     //   173: iconst_0
/*     */     //   174: istore #11
/*     */     //   176: aload_1
/*     */     //   177: ldc -1323940314
/*     */     //   179: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   181: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   184: aload_1
/*     */     //   185: iconst_0
/*     */     //   186: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   189: istore #12
/*     */     //   191: aload_1
/*     */     //   192: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   197: astore #13
/*     */     //   199: aload_1
/*     */     //   200: aload #4
/*     */     //   202: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   205: astore #14
/*     */     //   207: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   210: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   213: astore #15
/*     */     //   215: bipush #6
/*     */     //   217: sipush #896
/*     */     //   220: iload #10
/*     */     //   222: bipush #6
/*     */     //   224: ishl
/*     */     //   225: iand
/*     */     //   226: ior
/*     */     //   227: istore #16
/*     */     //   229: nop
/*     */     //   230: iconst_0
/*     */     //   231: istore #17
/*     */     //   233: aload_1
/*     */     //   234: ldc -692256719
/*     */     //   236: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   238: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   241: aload_1
/*     */     //   242: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   247: instanceof androidx/compose/runtime/Applier
/*     */     //   250: ifne -> 256
/*     */     //   253: invokestatic invalidApplier : ()V
/*     */     //   256: aload_1
/*     */     //   257: invokeinterface startReusableNode : ()V
/*     */     //   262: aload_1
/*     */     //   263: invokeinterface getInserting : ()Z
/*     */     //   268: ifeq -> 282
/*     */     //   271: aload_1
/*     */     //   272: aload #15
/*     */     //   274: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   279: goto -> 288
/*     */     //   282: aload_1
/*     */     //   283: invokeinterface useNode : ()V
/*     */     //   288: aload_1
/*     */     //   289: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   292: astore #18
/*     */     //   294: iconst_0
/*     */     //   295: istore #19
/*     */     //   297: aload #18
/*     */     //   299: aload #9
/*     */     //   301: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   304: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   307: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   310: aload #18
/*     */     //   312: aload #13
/*     */     //   314: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   317: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   320: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   323: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   326: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   329: astore #20
/*     */     //   331: iconst_0
/*     */     //   332: istore #21
/*     */     //   334: aload #18
/*     */     //   336: astore #22
/*     */     //   338: iconst_0
/*     */     //   339: istore #23
/*     */     //   341: aload #22
/*     */     //   343: invokeinterface getInserting : ()Z
/*     */     //   348: ifne -> 369
/*     */     //   351: aload #22
/*     */     //   353: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   358: iload #12
/*     */     //   360: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   363: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   366: ifne -> 395
/*     */     //   369: aload #22
/*     */     //   371: iload #12
/*     */     //   373: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   376: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   381: aload #18
/*     */     //   383: iload #12
/*     */     //   385: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   388: aload #20
/*     */     //   390: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   395: nop
/*     */     //   396: nop
/*     */     //   397: nop
/*     */     //   398: aload #18
/*     */     //   400: aload #14
/*     */     //   402: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   405: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   408: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   411: nop
/*     */     //   412: nop
/*     */     //   413: aload_1
/*     */     //   414: bipush #14
/*     */     //   416: iload #16
/*     */     //   418: bipush #6
/*     */     //   420: ishr
/*     */     //   421: iand
/*     */     //   422: istore #24
/*     */     //   424: astore #25
/*     */     //   426: iconst_0
/*     */     //   427: istore #26
/*     */     //   429: aload #25
/*     */     //   431: ldc -384784025
/*     */     //   433: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   435: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   438: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   441: aload #25
/*     */     //   443: bipush #6
/*     */     //   445: bipush #112
/*     */     //   447: iload #7
/*     */     //   449: bipush #6
/*     */     //   451: ishr
/*     */     //   452: iand
/*     */     //   453: ior
/*     */     //   454: istore #27
/*     */     //   456: astore #28
/*     */     //   458: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   461: astore #29
/*     */     //   463: iconst_0
/*     */     //   464: istore #30
/*     */     //   466: aload #28
/*     */     //   468: ldc_w -1081246407
/*     */     //   471: invokeinterface startReplaceGroup : (I)V
/*     */     //   476: aload_0
/*     */     //   477: checkcast java/lang/Iterable
/*     */     //   480: astore #31
/*     */     //   482: iconst_0
/*     */     //   483: istore #32
/*     */     //   485: iconst_0
/*     */     //   486: istore #33
/*     */     //   488: aload #31
/*     */     //   490: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   495: astore #34
/*     */     //   497: aload #34
/*     */     //   499: invokeinterface hasNext : ()Z
/*     */     //   504: ifeq -> 583
/*     */     //   507: aload #34
/*     */     //   509: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   514: astore #35
/*     */     //   516: iload #33
/*     */     //   518: iinc #33, 1
/*     */     //   521: istore #36
/*     */     //   523: iload #36
/*     */     //   525: ifge -> 531
/*     */     //   528: invokestatic throwIndexOverflow : ()V
/*     */     //   531: iload #36
/*     */     //   533: aload #35
/*     */     //   535: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswerChoice
/*     */     //   538: astore #37
/*     */     //   540: istore #38
/*     */     //   542: iconst_0
/*     */     //   543: istore #39
/*     */     //   545: iload #38
/*     */     //   547: aload #37
/*     */     //   549: <illegal opcode> makeConcatWithConstants : (ILcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;)Ljava/lang/String;
/*     */     //   554: aconst_null
/*     */     //   555: lconst_0
/*     */     //   556: lconst_0
/*     */     //   557: aconst_null
/*     */     //   558: aconst_null
/*     */     //   559: aconst_null
/*     */     //   560: lconst_0
/*     */     //   561: aconst_null
/*     */     //   562: iconst_0
/*     */     //   563: lconst_0
/*     */     //   564: iconst_0
/*     */     //   565: iconst_0
/*     */     //   566: iconst_0
/*     */     //   567: aconst_null
/*     */     //   568: aconst_null
/*     */     //   569: aload #28
/*     */     //   571: iconst_0
/*     */     //   572: iconst_0
/*     */     //   573: ldc 65534
/*     */     //   575: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   578: nop
/*     */     //   579: nop
/*     */     //   580: goto -> 497
/*     */     //   583: nop
/*     */     //   584: aload #28
/*     */     //   586: invokeinterface endReplaceGroup : ()V
/*     */     //   591: nop
/*     */     //   592: aload #25
/*     */     //   594: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   597: aload_1
/*     */     //   598: invokeinterface endNode : ()V
/*     */     //   603: aload_1
/*     */     //   604: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   607: nop
/*     */     //   608: aload_1
/*     */     //   609: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   612: nop
/*     */     //   613: aload_1
/*     */     //   614: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   617: nop
/*     */     //   618: invokestatic isTraceInProgress : ()Z
/*     */     //   621: ifeq -> 636
/*     */     //   624: invokestatic traceEventEnd : ()V
/*     */     //   627: goto -> 636
/*     */     //   630: aload_1
/*     */     //   631: invokeinterface skipToGroupEnd : ()V
/*     */     //   636: aload_1
/*     */     //   637: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   642: dup
/*     */     //   643: ifnull -> 661
/*     */     //   646: aload_0
/*     */     //   647: iload_2
/*     */     //   648: <illegal opcode> invoke : (Ljava/util/List;I)Lkotlin/jvm/functions/Function2;
/*     */     //   653: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   658: goto -> 662
/*     */     //   661: pop
/*     */     //   662: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #265	-> 7
/*     */     //   #266	-> 77
/*     */     //   #569	-> 90
/*     */     //   #266	-> 96
/*     */     //   #570	-> 119
/*     */     //   #571	-> 122
/*     */     //   #572	-> 130
/*     */     //   #575	-> 138
/*     */     //   #576	-> 172
/*     */     //   #577	-> 181
/*     */     //   #578	-> 186
/*     */     //   #579	-> 192
/*     */     //   #580	-> 200
/*     */     //   #582	-> 207
/*     */     //   #581	-> 229
/*     */     //   #583	-> 238
/*     */     //   #584	-> 241
/*     */     //   #585	-> 257
/*     */     //   #586	-> 262
/*     */     //   #587	-> 272
/*     */     //   #589	-> 283
/*     */     //   #591	-> 288
/*     */     //   #592	-> 297
/*     */     //   #593	-> 310
/*     */     //   #595	-> 323
/*     */     //   #596	-> 334
/*     */     //   #597	-> 341
/*     */     //   #598	-> 369
/*     */     //   #599	-> 381
/*     */     //   #601	-> 395
/*     */     //   #596	-> 396
/*     */     //   #601	-> 397
/*     */     //   #602	-> 398
/*     */     //   #603	-> 411
/*     */     //   #591	-> 412
/*     */     //   #604	-> 413
/*     */     //   #605	-> 435
/*     */     //   #267	-> 476
/*     */     //   #606	-> 485
/*     */     //   #607	-> 488
/*     */     //   #607	-> 533
/*     */     //   #268	-> 545
/*     */     //   #269	-> 578
/*     */     //   #607	-> 579
/*     */     //   #608	-> 583
/*     */     //   #270	-> 591
/*     */     //   #605	-> 592
/*     */     //   #604	-> 597
/*     */     //   #609	-> 598
/*     */     //   #583	-> 604
/*     */     //   #610	-> 607
/*     */     //   #577	-> 609
/*     */     //   #611	-> 612
/*     */     //   #570	-> 614
/*     */     //   #612	-> 617
/*     */     //   #271	-> 630
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   90	6	5	$i$f$getDp	I
/*     */     //   87	9	4	$this$dp$iv	I
/*     */     //   545	34	39	$i$a$-forEachIndexed-EventDetailsKt$ContentChoicesView$1$1	I
/*     */     //   542	37	38	index	I
/*     */     //   542	37	37	choice	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;
/*     */     //   516	64	35	item$iv	Ljava/lang/Object;
/*     */     //   485	99	32	$i$f$forEachIndexed	I
/*     */     //   488	96	33	index$iv	I
/*     */     //   482	102	31	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */     //   466	126	30	$i$a$-Column-EventDetailsKt$ContentChoicesView$1	I
/*     */     //   463	129	29	$this$ContentChoicesView_u24lambda_u2418	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   463	129	28	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   463	129	27	$changed	I
/*     */     //   429	168	26	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   426	171	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   426	171	24	$changed$iv	I
/*     */     //   341	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   338	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   334	64	21	$i$f$set-impl	I
/*     */     //   331	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   297	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   294	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   233	375	17	$i$f$ReusableComposeNode	I
/*     */     //   230	378	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   230	378	16	$changed$iv$iv$iv	I
/*     */     //   176	437	11	$i$f$Layout	I
/*     */     //   191	422	12	compositeKeyHash$iv$iv	I
/*     */     //   199	414	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   207	406	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   173	440	10	$changed$iv$iv	I
/*     */     //   114	504	8	$i$f$Column	I
/*     */     //   163	455	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   111	507	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   130	488	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   138	480	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   111	507	7	$changed$iv	I
/*     */     //   19	644	3	$dirty	I
/*     */     //   0	663	0	contentChoices	Ljava/util/List;
/*     */     //   0	663	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	663	2	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void ModelParametersView(@NotNull ModelParameters modelParameters, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'modelParameters'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 1937285015
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_1
/*     */     //   17: iload_2
/*     */     //   18: istore_3
/*     */     //   19: iload_2
/*     */     //   20: bipush #6
/*     */     //   22: iand
/*     */     //   23: ifne -> 44
/*     */     //   26: iload_3
/*     */     //   27: aload_1
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: iconst_3
/*     */     //   46: iand
/*     */     //   47: iconst_2
/*     */     //   48: if_icmpne -> 60
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getSkipping : ()Z
/*     */     //   57: ifne -> 1596
/*     */     //   60: invokestatic isTraceInProgress : ()Z
/*     */     //   63: ifeq -> 77
/*     */     //   66: ldc_w 1937285015
/*     */     //   69: iload_3
/*     */     //   70: iconst_m1
/*     */     //   71: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.debug.ModelParametersView (EventDetails.kt:274)'
/*     */     //   74: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   77: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   80: checkcast androidx/compose/ui/Modifier
/*     */     //   83: bipush #8
/*     */     //   85: istore #4
/*     */     //   87: iconst_0
/*     */     //   88: istore #5
/*     */     //   90: iload #4
/*     */     //   92: i2f
/*     */     //   93: invokestatic constructor-impl : (F)F
/*     */     //   96: fconst_0
/*     */     //   97: fconst_0
/*     */     //   98: fconst_0
/*     */     //   99: bipush #14
/*     */     //   101: aconst_null
/*     */     //   102: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   105: astore #4
/*     */     //   107: bipush #6
/*     */     //   109: istore #7
/*     */     //   111: iconst_0
/*     */     //   112: istore #8
/*     */     //   114: aload_1
/*     */     //   115: ldc -483455358
/*     */     //   117: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   119: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   122: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   125: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   128: astore #5
/*     */     //   130: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   133: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   136: astore #6
/*     */     //   138: aload #5
/*     */     //   140: aload #6
/*     */     //   142: aload_1
/*     */     //   143: bipush #14
/*     */     //   145: iload #7
/*     */     //   147: iconst_3
/*     */     //   148: ishr
/*     */     //   149: iand
/*     */     //   150: bipush #112
/*     */     //   152: iload #7
/*     */     //   154: iconst_3
/*     */     //   155: ishr
/*     */     //   156: iand
/*     */     //   157: ior
/*     */     //   158: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   161: astore #9
/*     */     //   163: bipush #112
/*     */     //   165: iload #7
/*     */     //   167: iconst_3
/*     */     //   168: ishl
/*     */     //   169: iand
/*     */     //   170: istore #10
/*     */     //   172: nop
/*     */     //   173: iconst_0
/*     */     //   174: istore #11
/*     */     //   176: aload_1
/*     */     //   177: ldc -1323940314
/*     */     //   179: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   181: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   184: aload_1
/*     */     //   185: iconst_0
/*     */     //   186: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   189: istore #12
/*     */     //   191: aload_1
/*     */     //   192: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   197: astore #13
/*     */     //   199: aload_1
/*     */     //   200: aload #4
/*     */     //   202: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   205: astore #14
/*     */     //   207: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   210: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   213: astore #15
/*     */     //   215: bipush #6
/*     */     //   217: sipush #896
/*     */     //   220: iload #10
/*     */     //   222: bipush #6
/*     */     //   224: ishl
/*     */     //   225: iand
/*     */     //   226: ior
/*     */     //   227: istore #16
/*     */     //   229: nop
/*     */     //   230: iconst_0
/*     */     //   231: istore #17
/*     */     //   233: aload_1
/*     */     //   234: ldc -692256719
/*     */     //   236: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   238: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   241: aload_1
/*     */     //   242: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   247: instanceof androidx/compose/runtime/Applier
/*     */     //   250: ifne -> 256
/*     */     //   253: invokestatic invalidApplier : ()V
/*     */     //   256: aload_1
/*     */     //   257: invokeinterface startReusableNode : ()V
/*     */     //   262: aload_1
/*     */     //   263: invokeinterface getInserting : ()Z
/*     */     //   268: ifeq -> 282
/*     */     //   271: aload_1
/*     */     //   272: aload #15
/*     */     //   274: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   279: goto -> 288
/*     */     //   282: aload_1
/*     */     //   283: invokeinterface useNode : ()V
/*     */     //   288: aload_1
/*     */     //   289: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   292: astore #18
/*     */     //   294: iconst_0
/*     */     //   295: istore #19
/*     */     //   297: aload #18
/*     */     //   299: aload #9
/*     */     //   301: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   304: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   307: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   310: aload #18
/*     */     //   312: aload #13
/*     */     //   314: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   317: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   320: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   323: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   326: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   329: astore #20
/*     */     //   331: iconst_0
/*     */     //   332: istore #21
/*     */     //   334: aload #18
/*     */     //   336: astore #22
/*     */     //   338: iconst_0
/*     */     //   339: istore #23
/*     */     //   341: aload #22
/*     */     //   343: invokeinterface getInserting : ()Z
/*     */     //   348: ifne -> 369
/*     */     //   351: aload #22
/*     */     //   353: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   358: iload #12
/*     */     //   360: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   363: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   366: ifne -> 395
/*     */     //   369: aload #22
/*     */     //   371: iload #12
/*     */     //   373: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   376: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   381: aload #18
/*     */     //   383: iload #12
/*     */     //   385: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   388: aload #20
/*     */     //   390: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   395: nop
/*     */     //   396: nop
/*     */     //   397: nop
/*     */     //   398: aload #18
/*     */     //   400: aload #14
/*     */     //   402: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   405: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   408: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   411: nop
/*     */     //   412: nop
/*     */     //   413: aload_1
/*     */     //   414: bipush #14
/*     */     //   416: iload #16
/*     */     //   418: bipush #6
/*     */     //   420: ishr
/*     */     //   421: iand
/*     */     //   422: istore #24
/*     */     //   424: astore #25
/*     */     //   426: iconst_0
/*     */     //   427: istore #26
/*     */     //   429: aload #25
/*     */     //   431: ldc -384784025
/*     */     //   433: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   435: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   438: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   441: aload #25
/*     */     //   443: bipush #6
/*     */     //   445: bipush #112
/*     */     //   447: iload #7
/*     */     //   449: bipush #6
/*     */     //   451: ishr
/*     */     //   452: iand
/*     */     //   453: ior
/*     */     //   454: istore #27
/*     */     //   456: astore #28
/*     */     //   458: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   461: astore #29
/*     */     //   463: iconst_0
/*     */     //   464: istore #30
/*     */     //   466: aload_0
/*     */     //   467: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   470: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;)Ljava/lang/String;
/*     */     //   475: aconst_null
/*     */     //   476: lconst_0
/*     */     //   477: lconst_0
/*     */     //   478: aconst_null
/*     */     //   479: aconst_null
/*     */     //   480: aconst_null
/*     */     //   481: lconst_0
/*     */     //   482: aconst_null
/*     */     //   483: iconst_0
/*     */     //   484: lconst_0
/*     */     //   485: iconst_0
/*     */     //   486: iconst_0
/*     */     //   487: iconst_0
/*     */     //   488: aconst_null
/*     */     //   489: aconst_null
/*     */     //   490: aload #28
/*     */     //   492: iconst_0
/*     */     //   493: iconst_0
/*     */     //   494: ldc 65534
/*     */     //   496: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   499: aload_0
/*     */     //   500: invokevirtual getPromptCacheEnabled : ()Z
/*     */     //   503: <illegal opcode> makeConcatWithConstants : (Z)Ljava/lang/String;
/*     */     //   508: aconst_null
/*     */     //   509: lconst_0
/*     */     //   510: lconst_0
/*     */     //   511: aconst_null
/*     */     //   512: aconst_null
/*     */     //   513: aconst_null
/*     */     //   514: lconst_0
/*     */     //   515: aconst_null
/*     */     //   516: iconst_0
/*     */     //   517: lconst_0
/*     */     //   518: iconst_0
/*     */     //   519: iconst_0
/*     */     //   520: iconst_0
/*     */     //   521: aconst_null
/*     */     //   522: aconst_null
/*     */     //   523: aload #28
/*     */     //   525: iconst_0
/*     */     //   526: iconst_0
/*     */     //   527: ldc 65534
/*     */     //   529: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   532: aload_0
/*     */     //   533: invokevirtual getTemperature : ()Ljava/lang/Double;
/*     */     //   536: astore #31
/*     */     //   538: aload #28
/*     */     //   540: ldc_w 2013757361
/*     */     //   543: invokeinterface startReplaceGroup : (I)V
/*     */     //   548: aload #31
/*     */     //   550: dup
/*     */     //   551: ifnonnull -> 559
/*     */     //   554: pop
/*     */     //   555: aconst_null
/*     */     //   556: goto -> 609
/*     */     //   559: checkcast java/lang/Number
/*     */     //   562: invokevirtual doubleValue : ()D
/*     */     //   565: dstore #32
/*     */     //   567: iconst_0
/*     */     //   568: istore #34
/*     */     //   570: dload #32
/*     */     //   572: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*     */     //   577: aconst_null
/*     */     //   578: lconst_0
/*     */     //   579: lconst_0
/*     */     //   580: aconst_null
/*     */     //   581: aconst_null
/*     */     //   582: aconst_null
/*     */     //   583: lconst_0
/*     */     //   584: aconst_null
/*     */     //   585: iconst_0
/*     */     //   586: lconst_0
/*     */     //   587: iconst_0
/*     */     //   588: iconst_0
/*     */     //   589: iconst_0
/*     */     //   590: aconst_null
/*     */     //   591: aconst_null
/*     */     //   592: aload #28
/*     */     //   594: iconst_0
/*     */     //   595: iconst_0
/*     */     //   596: ldc 65534
/*     */     //   598: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   601: nop
/*     */     //   602: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   605: pop
/*     */     //   606: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   609: pop
/*     */     //   610: aload #28
/*     */     //   612: invokeinterface endReplaceGroup : ()V
/*     */     //   617: aload_0
/*     */     //   618: invokevirtual getTopP : ()Ljava/lang/Double;
/*     */     //   621: astore #31
/*     */     //   623: aload #28
/*     */     //   625: ldc_w 2013759563
/*     */     //   628: invokeinterface startReplaceGroup : (I)V
/*     */     //   633: aload #31
/*     */     //   635: dup
/*     */     //   636: ifnonnull -> 644
/*     */     //   639: pop
/*     */     //   640: aconst_null
/*     */     //   641: goto -> 694
/*     */     //   644: checkcast java/lang/Number
/*     */     //   647: invokevirtual doubleValue : ()D
/*     */     //   650: dstore #32
/*     */     //   652: iconst_0
/*     */     //   653: istore #34
/*     */     //   655: dload #32
/*     */     //   657: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*     */     //   662: aconst_null
/*     */     //   663: lconst_0
/*     */     //   664: lconst_0
/*     */     //   665: aconst_null
/*     */     //   666: aconst_null
/*     */     //   667: aconst_null
/*     */     //   668: lconst_0
/*     */     //   669: aconst_null
/*     */     //   670: iconst_0
/*     */     //   671: lconst_0
/*     */     //   672: iconst_0
/*     */     //   673: iconst_0
/*     */     //   674: iconst_0
/*     */     //   675: aconst_null
/*     */     //   676: aconst_null
/*     */     //   677: aload #28
/*     */     //   679: iconst_0
/*     */     //   680: iconst_0
/*     */     //   681: ldc 65534
/*     */     //   683: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   686: nop
/*     */     //   687: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   690: pop
/*     */     //   691: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   694: pop
/*     */     //   695: aload #28
/*     */     //   697: invokeinterface endReplaceGroup : ()V
/*     */     //   702: aload_0
/*     */     //   703: invokevirtual getNumberOfSuggestions : ()Ljava/lang/Integer;
/*     */     //   706: astore #31
/*     */     //   708: aload #28
/*     */     //   710: ldc_w 2013762075
/*     */     //   713: invokeinterface startReplaceGroup : (I)V
/*     */     //   718: aload #31
/*     */     //   720: dup
/*     */     //   721: ifnonnull -> 729
/*     */     //   724: pop
/*     */     //   725: aconst_null
/*     */     //   726: goto -> 779
/*     */     //   729: checkcast java/lang/Number
/*     */     //   732: invokevirtual intValue : ()I
/*     */     //   735: istore #35
/*     */     //   737: iconst_0
/*     */     //   738: istore #36
/*     */     //   740: iload #35
/*     */     //   742: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   747: aconst_null
/*     */     //   748: lconst_0
/*     */     //   749: lconst_0
/*     */     //   750: aconst_null
/*     */     //   751: aconst_null
/*     */     //   752: aconst_null
/*     */     //   753: lconst_0
/*     */     //   754: aconst_null
/*     */     //   755: iconst_0
/*     */     //   756: lconst_0
/*     */     //   757: iconst_0
/*     */     //   758: iconst_0
/*     */     //   759: iconst_0
/*     */     //   760: aconst_null
/*     */     //   761: aconst_null
/*     */     //   762: aload #28
/*     */     //   764: iconst_0
/*     */     //   765: iconst_0
/*     */     //   766: ldc 65534
/*     */     //   768: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   771: nop
/*     */     //   772: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   775: pop
/*     */     //   776: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   779: pop
/*     */     //   780: aload #28
/*     */     //   782: invokeinterface endReplaceGroup : ()V
/*     */     //   787: aload_0
/*     */     //   788: invokevirtual getStream : ()Ljava/lang/Boolean;
/*     */     //   791: astore #31
/*     */     //   793: aload #28
/*     */     //   795: ldc_w 2013764652
/*     */     //   798: invokeinterface startReplaceGroup : (I)V
/*     */     //   803: aload #31
/*     */     //   805: dup
/*     */     //   806: ifnonnull -> 814
/*     */     //   809: pop
/*     */     //   810: aconst_null
/*     */     //   811: goto -> 861
/*     */     //   814: invokevirtual booleanValue : ()Z
/*     */     //   817: istore #35
/*     */     //   819: iconst_0
/*     */     //   820: istore #36
/*     */     //   822: iload #35
/*     */     //   824: <illegal opcode> makeConcatWithConstants : (Z)Ljava/lang/String;
/*     */     //   829: aconst_null
/*     */     //   830: lconst_0
/*     */     //   831: lconst_0
/*     */     //   832: aconst_null
/*     */     //   833: aconst_null
/*     */     //   834: aconst_null
/*     */     //   835: lconst_0
/*     */     //   836: aconst_null
/*     */     //   837: iconst_0
/*     */     //   838: lconst_0
/*     */     //   839: iconst_0
/*     */     //   840: iconst_0
/*     */     //   841: iconst_0
/*     */     //   842: aconst_null
/*     */     //   843: aconst_null
/*     */     //   844: aload #28
/*     */     //   846: iconst_0
/*     */     //   847: iconst_0
/*     */     //   848: ldc 65534
/*     */     //   850: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   853: nop
/*     */     //   854: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   857: pop
/*     */     //   858: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   861: pop
/*     */     //   862: aload #28
/*     */     //   864: invokeinterface endReplaceGroup : ()V
/*     */     //   869: aload_0
/*     */     //   870: invokevirtual getStop : ()Ljava/util/Map;
/*     */     //   873: astore #31
/*     */     //   875: aload #28
/*     */     //   877: ldc_w 2013766734
/*     */     //   880: invokeinterface startReplaceGroup : (I)V
/*     */     //   885: aload #31
/*     */     //   887: dup
/*     */     //   888: ifnonnull -> 896
/*     */     //   891: pop
/*     */     //   892: aconst_null
/*     */     //   893: goto -> 965
/*     */     //   896: astore #35
/*     */     //   898: iconst_0
/*     */     //   899: istore #36
/*     */     //   901: aload #35
/*     */     //   903: invokeinterface keySet : ()Ljava/util/Set;
/*     */     //   908: checkcast java/lang/Iterable
/*     */     //   911: ldc_w ', '
/*     */     //   914: checkcast java/lang/CharSequence
/*     */     //   917: aconst_null
/*     */     //   918: aconst_null
/*     */     //   919: iconst_0
/*     */     //   920: aconst_null
/*     */     //   921: aconst_null
/*     */     //   922: bipush #62
/*     */     //   924: aconst_null
/*     */     //   925: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   928: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   933: aconst_null
/*     */     //   934: lconst_0
/*     */     //   935: lconst_0
/*     */     //   936: aconst_null
/*     */     //   937: aconst_null
/*     */     //   938: aconst_null
/*     */     //   939: lconst_0
/*     */     //   940: aconst_null
/*     */     //   941: iconst_0
/*     */     //   942: lconst_0
/*     */     //   943: iconst_0
/*     */     //   944: iconst_0
/*     */     //   945: iconst_0
/*     */     //   946: aconst_null
/*     */     //   947: aconst_null
/*     */     //   948: aload #28
/*     */     //   950: iconst_0
/*     */     //   951: iconst_0
/*     */     //   952: ldc 65534
/*     */     //   954: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   957: nop
/*     */     //   958: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   961: pop
/*     */     //   962: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   965: pop
/*     */     //   966: aload #28
/*     */     //   968: invokeinterface endReplaceGroup : ()V
/*     */     //   973: aload_0
/*     */     //   974: invokevirtual getMaxTokens : ()Ljava/lang/Integer;
/*     */     //   977: astore #31
/*     */     //   979: aload #28
/*     */     //   981: ldc_w 2013770000
/*     */     //   984: invokeinterface startReplaceGroup : (I)V
/*     */     //   989: aload #31
/*     */     //   991: dup
/*     */     //   992: ifnonnull -> 1000
/*     */     //   995: pop
/*     */     //   996: aconst_null
/*     */     //   997: goto -> 1050
/*     */     //   1000: checkcast java/lang/Number
/*     */     //   1003: invokevirtual intValue : ()I
/*     */     //   1006: istore #35
/*     */     //   1008: iconst_0
/*     */     //   1009: istore #36
/*     */     //   1011: iload #35
/*     */     //   1013: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   1018: aconst_null
/*     */     //   1019: lconst_0
/*     */     //   1020: lconst_0
/*     */     //   1021: aconst_null
/*     */     //   1022: aconst_null
/*     */     //   1023: aconst_null
/*     */     //   1024: lconst_0
/*     */     //   1025: aconst_null
/*     */     //   1026: iconst_0
/*     */     //   1027: lconst_0
/*     */     //   1028: iconst_0
/*     */     //   1029: iconst_0
/*     */     //   1030: iconst_0
/*     */     //   1031: aconst_null
/*     */     //   1032: aconst_null
/*     */     //   1033: aload #28
/*     */     //   1035: iconst_0
/*     */     //   1036: iconst_0
/*     */     //   1037: ldc 65534
/*     */     //   1039: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1042: nop
/*     */     //   1043: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1046: pop
/*     */     //   1047: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1050: pop
/*     */     //   1051: aload #28
/*     */     //   1053: invokeinterface endReplaceGroup : ()V
/*     */     //   1058: aload_0
/*     */     //   1059: invokevirtual getPresencePenalty : ()Ljava/lang/Double;
/*     */     //   1062: astore #31
/*     */     //   1064: aload #28
/*     */     //   1066: ldc_w 2013772534
/*     */     //   1069: invokeinterface startReplaceGroup : (I)V
/*     */     //   1074: aload #31
/*     */     //   1076: dup
/*     */     //   1077: ifnonnull -> 1085
/*     */     //   1080: pop
/*     */     //   1081: aconst_null
/*     */     //   1082: goto -> 1135
/*     */     //   1085: checkcast java/lang/Number
/*     */     //   1088: invokevirtual doubleValue : ()D
/*     */     //   1091: dstore #32
/*     */     //   1093: iconst_0
/*     */     //   1094: istore #34
/*     */     //   1096: dload #32
/*     */     //   1098: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*     */     //   1103: aconst_null
/*     */     //   1104: lconst_0
/*     */     //   1105: lconst_0
/*     */     //   1106: aconst_null
/*     */     //   1107: aconst_null
/*     */     //   1108: aconst_null
/*     */     //   1109: lconst_0
/*     */     //   1110: aconst_null
/*     */     //   1111: iconst_0
/*     */     //   1112: lconst_0
/*     */     //   1113: iconst_0
/*     */     //   1114: iconst_0
/*     */     //   1115: iconst_0
/*     */     //   1116: aconst_null
/*     */     //   1117: aconst_null
/*     */     //   1118: aload #28
/*     */     //   1120: iconst_0
/*     */     //   1121: iconst_0
/*     */     //   1122: ldc 65534
/*     */     //   1124: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1127: nop
/*     */     //   1128: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1131: pop
/*     */     //   1132: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1135: pop
/*     */     //   1136: aload #28
/*     */     //   1138: invokeinterface endReplaceGroup : ()V
/*     */     //   1143: aload_0
/*     */     //   1144: invokevirtual getFrequencyPenalty : ()Ljava/lang/Double;
/*     */     //   1147: astore #31
/*     */     //   1149: aload #28
/*     */     //   1151: ldc_w 2013775287
/*     */     //   1154: invokeinterface startReplaceGroup : (I)V
/*     */     //   1159: aload #31
/*     */     //   1161: dup
/*     */     //   1162: ifnonnull -> 1170
/*     */     //   1165: pop
/*     */     //   1166: aconst_null
/*     */     //   1167: goto -> 1220
/*     */     //   1170: checkcast java/lang/Number
/*     */     //   1173: invokevirtual doubleValue : ()D
/*     */     //   1176: dstore #32
/*     */     //   1178: iconst_0
/*     */     //   1179: istore #34
/*     */     //   1181: dload #32
/*     */     //   1183: <illegal opcode> makeConcatWithConstants : (D)Ljava/lang/String;
/*     */     //   1188: aconst_null
/*     */     //   1189: lconst_0
/*     */     //   1190: lconst_0
/*     */     //   1191: aconst_null
/*     */     //   1192: aconst_null
/*     */     //   1193: aconst_null
/*     */     //   1194: lconst_0
/*     */     //   1195: aconst_null
/*     */     //   1196: iconst_0
/*     */     //   1197: lconst_0
/*     */     //   1198: iconst_0
/*     */     //   1199: iconst_0
/*     */     //   1200: iconst_0
/*     */     //   1201: aconst_null
/*     */     //   1202: aconst_null
/*     */     //   1203: aload #28
/*     */     //   1205: iconst_0
/*     */     //   1206: iconst_0
/*     */     //   1207: ldc 65534
/*     */     //   1209: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1212: nop
/*     */     //   1213: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1216: pop
/*     */     //   1217: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1220: pop
/*     */     //   1221: aload #28
/*     */     //   1223: invokeinterface endReplaceGroup : ()V
/*     */     //   1228: aload_0
/*     */     //   1229: invokevirtual getLogitBias : ()Ljava/util/Map;
/*     */     //   1232: astore #31
/*     */     //   1234: aload #28
/*     */     //   1236: ldc_w 2013777892
/*     */     //   1239: invokeinterface startReplaceGroup : (I)V
/*     */     //   1244: aload #31
/*     */     //   1246: dup
/*     */     //   1247: ifnonnull -> 1255
/*     */     //   1250: pop
/*     */     //   1251: aconst_null
/*     */     //   1252: goto -> 1437
/*     */     //   1255: astore #35
/*     */     //   1257: iconst_0
/*     */     //   1258: istore #36
/*     */     //   1260: aload #35
/*     */     //   1262: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   1267: checkcast java/lang/Iterable
/*     */     //   1270: ldc_w ', '
/*     */     //   1273: checkcast java/lang/CharSequence
/*     */     //   1276: aconst_null
/*     */     //   1277: aconst_null
/*     */     //   1278: iconst_0
/*     */     //   1279: aconst_null
/*     */     //   1280: aload #28
/*     */     //   1282: ldc_w -703912228
/*     */     //   1285: invokeinterface startReplaceGroup : (I)V
/*     */     //   1290: aload #28
/*     */     //   1292: astore #34
/*     */     //   1294: iconst_0
/*     */     //   1295: istore #37
/*     */     //   1297: iconst_0
/*     */     //   1298: istore #38
/*     */     //   1300: aload #34
/*     */     //   1302: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1307: astore #39
/*     */     //   1309: iconst_0
/*     */     //   1310: istore #40
/*     */     //   1312: aload #39
/*     */     //   1314: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1317: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1320: if_acmpne -> 1375
/*     */     //   1323: astore #41
/*     */     //   1325: istore #42
/*     */     //   1327: astore #43
/*     */     //   1329: astore #44
/*     */     //   1331: astore #45
/*     */     //   1333: astore #46
/*     */     //   1335: iconst_0
/*     */     //   1336: istore #47
/*     */     //   1338: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1343: astore #48
/*     */     //   1345: aload #46
/*     */     //   1347: aload #45
/*     */     //   1349: aload #44
/*     */     //   1351: aload #43
/*     */     //   1353: iload #42
/*     */     //   1355: aload #41
/*     */     //   1357: aload #48
/*     */     //   1359: astore #47
/*     */     //   1361: aload #34
/*     */     //   1363: aload #47
/*     */     //   1365: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1370: aload #47
/*     */     //   1372: goto -> 1377
/*     */     //   1375: aload #39
/*     */     //   1377: nop
/*     */     //   1378: nop
/*     */     //   1379: nop
/*     */     //   1380: checkcast kotlin/jvm/functions/Function1
/*     */     //   1383: astore #49
/*     */     //   1385: aload #28
/*     */     //   1387: invokeinterface endReplaceGroup : ()V
/*     */     //   1392: aload #49
/*     */     //   1394: bipush #30
/*     */     //   1396: aconst_null
/*     */     //   1397: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1400: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1405: aconst_null
/*     */     //   1406: lconst_0
/*     */     //   1407: lconst_0
/*     */     //   1408: aconst_null
/*     */     //   1409: aconst_null
/*     */     //   1410: aconst_null
/*     */     //   1411: lconst_0
/*     */     //   1412: aconst_null
/*     */     //   1413: iconst_0
/*     */     //   1414: lconst_0
/*     */     //   1415: iconst_0
/*     */     //   1416: iconst_0
/*     */     //   1417: iconst_0
/*     */     //   1418: aconst_null
/*     */     //   1419: aconst_null
/*     */     //   1420: aload #28
/*     */     //   1422: iconst_0
/*     */     //   1423: iconst_0
/*     */     //   1424: ldc 65534
/*     */     //   1426: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1429: nop
/*     */     //   1430: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1433: pop
/*     */     //   1434: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1437: pop
/*     */     //   1438: aload #28
/*     */     //   1440: invokeinterface endReplaceGroup : ()V
/*     */     //   1445: aload_0
/*     */     //   1446: invokevirtual getUser : ()Ljava/lang/String;
/*     */     //   1449: astore #31
/*     */     //   1451: aload #28
/*     */     //   1453: ldc_w 2013781674
/*     */     //   1456: invokeinterface startReplaceGroup : (I)V
/*     */     //   1461: aload #31
/*     */     //   1463: dup
/*     */     //   1464: ifnonnull -> 1472
/*     */     //   1467: pop
/*     */     //   1468: aconst_null
/*     */     //   1469: goto -> 1516
/*     */     //   1472: astore #35
/*     */     //   1474: iconst_0
/*     */     //   1475: istore #36
/*     */     //   1477: aload #35
/*     */     //   1479: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1484: aconst_null
/*     */     //   1485: lconst_0
/*     */     //   1486: lconst_0
/*     */     //   1487: aconst_null
/*     */     //   1488: aconst_null
/*     */     //   1489: aconst_null
/*     */     //   1490: lconst_0
/*     */     //   1491: aconst_null
/*     */     //   1492: iconst_0
/*     */     //   1493: lconst_0
/*     */     //   1494: iconst_0
/*     */     //   1495: iconst_0
/*     */     //   1496: iconst_0
/*     */     //   1497: aconst_null
/*     */     //   1498: aconst_null
/*     */     //   1499: aload #28
/*     */     //   1501: iconst_0
/*     */     //   1502: iconst_0
/*     */     //   1503: ldc 65534
/*     */     //   1505: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1508: nop
/*     */     //   1509: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1512: pop
/*     */     //   1513: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1516: pop
/*     */     //   1517: aload #28
/*     */     //   1519: invokeinterface endReplaceGroup : ()V
/*     */     //   1524: aload_0
/*     */     //   1525: invokevirtual getSeed : ()I
/*     */     //   1528: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   1533: aconst_null
/*     */     //   1534: lconst_0
/*     */     //   1535: lconst_0
/*     */     //   1536: aconst_null
/*     */     //   1537: aconst_null
/*     */     //   1538: aconst_null
/*     */     //   1539: lconst_0
/*     */     //   1540: aconst_null
/*     */     //   1541: iconst_0
/*     */     //   1542: lconst_0
/*     */     //   1543: iconst_0
/*     */     //   1544: iconst_0
/*     */     //   1545: iconst_0
/*     */     //   1546: aconst_null
/*     */     //   1547: aconst_null
/*     */     //   1548: aload #28
/*     */     //   1550: iconst_0
/*     */     //   1551: iconst_0
/*     */     //   1552: ldc 65534
/*     */     //   1554: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1557: nop
/*     */     //   1558: aload #25
/*     */     //   1560: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1563: aload_1
/*     */     //   1564: invokeinterface endNode : ()V
/*     */     //   1569: aload_1
/*     */     //   1570: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1573: nop
/*     */     //   1574: aload_1
/*     */     //   1575: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1578: nop
/*     */     //   1579: aload_1
/*     */     //   1580: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1583: nop
/*     */     //   1584: invokestatic isTraceInProgress : ()Z
/*     */     //   1587: ifeq -> 1602
/*     */     //   1590: invokestatic traceEventEnd : ()V
/*     */     //   1593: goto -> 1602
/*     */     //   1596: aload_1
/*     */     //   1597: invokeinterface skipToGroupEnd : ()V
/*     */     //   1602: aload_1
/*     */     //   1603: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1608: dup
/*     */     //   1609: ifnull -> 1627
/*     */     //   1612: aload_0
/*     */     //   1613: iload_2
/*     */     //   1614: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1619: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1624: goto -> 1628
/*     */     //   1627: pop
/*     */     //   1628: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #275	-> 7
/*     */     //   #276	-> 77
/*     */     //   #613	-> 90
/*     */     //   #276	-> 96
/*     */     //   #614	-> 119
/*     */     //   #615	-> 122
/*     */     //   #616	-> 130
/*     */     //   #619	-> 138
/*     */     //   #620	-> 172
/*     */     //   #621	-> 181
/*     */     //   #622	-> 186
/*     */     //   #623	-> 192
/*     */     //   #624	-> 200
/*     */     //   #626	-> 207
/*     */     //   #625	-> 229
/*     */     //   #627	-> 238
/*     */     //   #628	-> 241
/*     */     //   #629	-> 257
/*     */     //   #630	-> 262
/*     */     //   #631	-> 272
/*     */     //   #633	-> 283
/*     */     //   #635	-> 288
/*     */     //   #636	-> 297
/*     */     //   #637	-> 310
/*     */     //   #639	-> 323
/*     */     //   #640	-> 334
/*     */     //   #641	-> 341
/*     */     //   #642	-> 369
/*     */     //   #643	-> 381
/*     */     //   #645	-> 395
/*     */     //   #640	-> 396
/*     */     //   #645	-> 397
/*     */     //   #646	-> 398
/*     */     //   #647	-> 411
/*     */     //   #635	-> 412
/*     */     //   #648	-> 413
/*     */     //   #649	-> 435
/*     */     //   #277	-> 466
/*     */     //   #278	-> 499
/*     */     //   #279	-> 532
/*     */     //   #280	-> 570
/*     */     //   #281	-> 601
/*     */     //   #279	-> 605
/*     */     //   #279	-> 609
/*     */     //   #282	-> 617
/*     */     //   #283	-> 655
/*     */     //   #284	-> 686
/*     */     //   #282	-> 690
/*     */     //   #282	-> 694
/*     */     //   #285	-> 702
/*     */     //   #286	-> 740
/*     */     //   #287	-> 771
/*     */     //   #285	-> 775
/*     */     //   #285	-> 779
/*     */     //   #288	-> 787
/*     */     //   #289	-> 822
/*     */     //   #290	-> 853
/*     */     //   #288	-> 857
/*     */     //   #288	-> 861
/*     */     //   #291	-> 869
/*     */     //   #292	-> 901
/*     */     //   #293	-> 957
/*     */     //   #291	-> 961
/*     */     //   #291	-> 965
/*     */     //   #294	-> 973
/*     */     //   #295	-> 1011
/*     */     //   #296	-> 1042
/*     */     //   #294	-> 1046
/*     */     //   #294	-> 1050
/*     */     //   #297	-> 1058
/*     */     //   #298	-> 1096
/*     */     //   #299	-> 1127
/*     */     //   #297	-> 1131
/*     */     //   #297	-> 1135
/*     */     //   #300	-> 1143
/*     */     //   #301	-> 1181
/*     */     //   #302	-> 1212
/*     */     //   #300	-> 1216
/*     */     //   #300	-> 1220
/*     */     //   #303	-> 1228
/*     */     //   #304	-> 1260
/*     */     //   #650	-> 1300
/*     */     //   #651	-> 1312
/*     */     //   #652	-> 1323
/*     */     //   #652	-> 1359
/*     */     //   #653	-> 1361
/*     */     //   #654	-> 1370
/*     */     //   #655	-> 1375
/*     */     //   #651	-> 1377
/*     */     //   #650	-> 1378
/*     */     //   #650	-> 1379
/*     */     //   #304	-> 1380
/*     */     //   #305	-> 1429
/*     */     //   #303	-> 1433
/*     */     //   #303	-> 1437
/*     */     //   #306	-> 1445
/*     */     //   #307	-> 1477
/*     */     //   #308	-> 1508
/*     */     //   #306	-> 1512
/*     */     //   #306	-> 1516
/*     */     //   #309	-> 1524
/*     */     //   #310	-> 1557
/*     */     //   #649	-> 1558
/*     */     //   #648	-> 1563
/*     */     //   #656	-> 1564
/*     */     //   #627	-> 1570
/*     */     //   #657	-> 1573
/*     */     //   #621	-> 1575
/*     */     //   #658	-> 1578
/*     */     //   #614	-> 1580
/*     */     //   #659	-> 1583
/*     */     //   #311	-> 1596
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   90	6	5	$i$f$getDp	I
/*     */     //   87	9	4	$this$dp$iv	I
/*     */     //   570	32	34	$i$a$-let-EventDetailsKt$ModelParametersView$1$1	I
/*     */     //   567	35	32	it	D
/*     */     //   655	32	34	$i$a$-let-EventDetailsKt$ModelParametersView$1$2	I
/*     */     //   652	35	32	it	D
/*     */     //   740	32	36	$i$a$-let-EventDetailsKt$ModelParametersView$1$3	I
/*     */     //   737	35	35	it	I
/*     */     //   822	32	36	$i$a$-let-EventDetailsKt$ModelParametersView$1$4	I
/*     */     //   819	35	35	it	Z
/*     */     //   901	57	36	$i$a$-let-EventDetailsKt$ModelParametersView$1$5	I
/*     */     //   898	60	35	it	Ljava/util/Map;
/*     */     //   1011	32	36	$i$a$-let-EventDetailsKt$ModelParametersView$1$6	I
/*     */     //   1008	35	35	it	I
/*     */     //   1096	32	34	$i$a$-let-EventDetailsKt$ModelParametersView$1$7	I
/*     */     //   1093	35	32	it	D
/*     */     //   1181	32	34	$i$a$-let-EventDetailsKt$ModelParametersView$1$8	I
/*     */     //   1178	35	32	it	D
/*     */     //   1338	5	47	$i$a$-cache-EventDetailsKt$ModelParametersView$1$9$1	I
/*     */     //   1361	11	47	value$iv	Ljava/lang/Object;
/*     */     //   1312	66	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1309	69	39	it$iv	Ljava/lang/Object;
/*     */     //   1300	80	38	$i$f$cache	I
/*     */     //   1297	83	34	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1297	83	37	invalid$iv	Z
/*     */     //   1260	170	36	$i$a$-let-EventDetailsKt$ModelParametersView$1$9	I
/*     */     //   1257	173	35	it	Ljava/util/Map;
/*     */     //   1477	32	36	$i$a$-let-EventDetailsKt$ModelParametersView$1$10	I
/*     */     //   1474	35	35	it	Ljava/lang/String;
/*     */     //   466	1092	30	$i$a$-Column-EventDetailsKt$ModelParametersView$1	I
/*     */     //   463	1095	29	$this$ModelParametersView_u24lambda_u2432	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   463	1095	28	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   463	1095	27	$changed	I
/*     */     //   429	1134	26	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   426	1137	25	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   426	1137	24	$changed$iv	I
/*     */     //   341	55	23	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   338	58	22	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   334	64	21	$i$f$set-impl	I
/*     */     //   331	67	20	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   297	115	19	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   294	118	18	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   233	1341	17	$i$f$ReusableComposeNode	I
/*     */     //   230	1344	15	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   230	1344	16	$changed$iv$iv$iv	I
/*     */     //   176	1403	11	$i$f$Layout	I
/*     */     //   191	1388	12	compositeKeyHash$iv$iv	I
/*     */     //   199	1380	13	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   207	1372	14	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   173	1406	10	$changed$iv$iv	I
/*     */     //   114	1470	8	$i$f$Column	I
/*     */     //   163	1421	9	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   111	1473	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   130	1454	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   138	1446	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   111	1473	7	$changed$iv	I
/*     */     //   19	1610	3	$dirty	I
/*     */     //   0	1629	0	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   0	1629	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1629	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit EventDetailView$lambda$1(EventNode $node, int $$changed, Composer $composer, int $force) {
/*     */     EventDetailView($node, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit MatterhornChatView$lambda$5(MatterhornChat $chat, int $$changed, Composer $composer, int $force) {
/*     */     MatterhornChatView($chat, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit MatterhornToolView$lambda$11(MatterhornTool $tool, int $$changed, Composer $composer, int $force) {
/*     */     MatterhornToolView($tool, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit MatterhornChatElementView$lambda$13(int $index, MatterhornChatElement $element, int $$changed, Composer $composer, int $force) {
/*     */     MatterhornChatElementView($index, $element, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EventDetails$lambda$14(CustomArtifactEvent $event, int $$changed, Composer $composer, int $force) {
/*     */     EventDetails($event, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit AIAnswerView$lambda$16(AIAnswer $answer, int $$changed, Composer $composer, int $force) {
/*     */     AIAnswerView($answer, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ContentChoicesView$lambda$19(List<? extends AIAnswerChoice> $contentChoices, int $$changed, Composer $composer, int $force) {
/*     */     ContentChoicesView($contentChoices, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final CharSequence ModelParametersView$lambda$32$lambda$30$lambda$29$lambda$28(Map.Entry paramEntry) {
/*     */     Intrinsics.checkNotNullParameter(paramEntry, "<destruct>");
/*     */     String k = (String)paramEntry.getKey();
/*     */     int v = ((Number)paramEntry.getValue()).intValue();
/*     */     return k + ": " + k;
/*     */   }
/*     */   
/*     */   private static final Unit ModelParametersView$lambda$33(ModelParameters $modelParameters, int $$changed, Composer $composer, int $force) {
/*     */     ModelParametersView($modelParameters, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\EventDetailsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */