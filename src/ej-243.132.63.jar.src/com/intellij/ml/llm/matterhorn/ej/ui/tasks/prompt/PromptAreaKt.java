/*      */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*      */ 
/*      */ import androidx.compose.foundation.layout.FlowRowScope;
/*      */ import androidx.compose.foundation.layout.RowScope;
/*      */ import androidx.compose.foundation.text.input.TextFieldBuffer;
/*      */ import androidx.compose.foundation.text.input.TextFieldState;
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.ComposableTarget;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.MutableState;
/*      */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*      */ import androidx.compose.runtime.State;
/*      */ import androidx.compose.ui.Modifier;
/*      */ import androidx.compose.ui.focus.FocusState;
/*      */ import androidx.compose.ui.graphics.Color;
/*      */ import androidx.compose.ui.input.key.Key;
/*      */ import androidx.compose.ui.input.key.KeyEventType;
/*      */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*      */ import androidx.compose.ui.layout.LayoutCoordinates;
/*      */ import androidx.compose.ui.unit.Dp;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.components.FileListEntry;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.statistics.CompositeUiAction;
/*      */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*      */ import com.intellij.ml.llm.matterhorn.settings.MatterhornModelPersistentStateComponent;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ResultKt;
/*      */ import kotlin.Unit;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.reflect.KProperty;
/*      */ import kotlinx.coroutines.CoroutineScope;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ import org.jetbrains.jewel.foundation.actionSystem.DataProviderContext;
/*      */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*      */ import org.jetbrains.jewel.ui.component.TextKt;
/*      */ import org.jetbrains.jewel.ui.component.styling.LinkColors;
/*      */ import org.jetbrains.jewel.ui.component.styling.LinkMetrics;
/*      */ import org.jetbrains.jewel.ui.component.styling.LinkStyle;
/*      */ import org.jetbrains.jewel.ui.component.styling.LinkUnderlineBehavior;
/*      */ import org.jetbrains.jewel.ui.icon.IntelliJIconKey;
/*      */ import org.jetbrains.jewel.ui.theme.JewelThemeKt;
/*      */ 
/*      */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\020\000\n\002\b\b\n\002\030\002\n\002\b\f\n\002\030\002\n\000\032W\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\022\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\t2\006\020\f\032\0020\n2\022\020\r\032\016\022\004\022\0020\n\022\004\022\0020\0010\tH\007¢\006\002\020\016\032\037\020\017\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\006\032\0020\020H\007¢\006\002\020\021\032\035\020\022\032\0020\0012\006\020\023\032\0020\0242\006\020\006\032\0020\020H\003¢\006\002\020\025\032A\020\026\032\0020\0012\006\020\006\032\0020\0072\006\020\027\032\0020\0302\006\020\004\032\0020\0052\006\020\031\032\0020\n2\022\020\032\032\016\022\004\022\0020\n\022\004\022\0020\0010\tH\003¢\006\002\020\033\032P\020\034\032\0020\0012\006\020\006\032\0020\0072\006\020\035\032\0020\0052\006\020\036\032\0020\0372\006\020 \032\0020\0052\006\020\004\032\0020\0052\006\020\031\032\0020\n2\021\020!\032\r\022\004\022\0020\0010\"¢\006\002\b#H\003¢\006\002\020$\032¯\001\020%\032\0020\0012\022\020&\032\016\022\n\022\b\022\004\022\0020(0'0\"2\016\020)\032\n\022\006\022\004\030\0010*0\"2\022\020+\032\016\022\004\022\0020\024\022\004\022\0020\0010\t2\f\020,\032\b\022\004\022\0020\0010\"2\f\020-\032\b\022\004\022\0020\0010\"2\022\020.\032\016\022\004\022\0020*\022\004\022\0020\0010\t2\f\020/\032\b\022\004\022\0020\0010\"2\f\0200\032\b\022\004\022\0020\0010\"2\034\0201\032\030\b\001\022\n\022\b\022\004\022\0020\00502\022\006\022\004\030\001030\tH\003¢\006\002\0204\032)\0205\032\0020\0012\006\0206\032\0020\n2\022\0207\032\016\022\004\022\0020\n\022\004\022\0020\0010\tH\007¢\006\002\0208\0323\0209\032\0020\0012\006\0206\032\0020\n2\b\b\002\020\002\032\0020\0032\022\0207\032\016\022\004\022\0020\n\022\004\022\0020\0010\tH\007¢\006\002\020:\"\024\020;\032\0020<8CX\004¢\006\006\032\004\b=\020>¨\006?²\006\n\020@\032\0020\005X\002²\006\n\020A\032\0020\005X\002²\006\n\020B\032\0020\005X\002²\006\020\020C\032\b\022\004\022\0020\0240'X\002²\006\n\020 \032\0020\005X\002²\006\n\020\035\032\0020\005X\002²\006\n\020D\032\0020\005X\002²\006\n\020E\032\0020\005X\002²\006\n\020F\032\0020\005X\002²\006\n\020G\032\0020\005X\002²\006\n\020H\032\0020IX\002²\006\n\020J\032\0020IX\002"}, d2 = {"PromptArea", "", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;", "placeholder", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;", "", "currentPromptMode", "onPromptModeChange", "(Landroidx/compose/ui/Modifier;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PromptFiles", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;Landroidx/compose/runtime/Composer;II)V", "FileLine", "file", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;Landroidx/compose/runtime/Composer;I)V", "PromptButtons", "textAreaState", "Landroidx/compose/foundation/text/input/TextFieldState;", "promptMode", "onPromptModeChanged", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Landroidx/compose/foundation/text/input/TextFieldState;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PromptRow", "braveMode", "settings", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;", "textAreaContentState", "promptSelectorContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;ZLcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;ZZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "JunieFilePickerButton", "getRecentFiles", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;", "getGuidelines", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;", "onFileChosen", "openProjectFilePicker", "onCreateNewGuidelines", "onSelectGuidelines", "onCreateAiIgnoreFile", "onOpenAiIgnoreFile", "hasAIIgnoreFile", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "WidePromptModeSelector", "selectedMode", "onSelected", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CompactPromptModeSelector", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CompactPromptModeSelectorLinkStyle", "Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;", "getCompactPromptModeSelectorLinkStyle", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;", "ej-ui", "hasFocus", "hasFocusEventSent", "hasInputEventSent", "attachedFiles", "isCompact", "shouldShowFilePickerDialog", "codeHovered", "askHovered", "codeTextColor", "Landroidx/compose/ui/graphics/Color;", "askTextColor"})
/*      */ @SourceDebugExtension({"SMAP\nPromptArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,472:1\n1225#2,6:473\n1225#2,6:479\n1225#2,6:485\n1225#2,6:491\n1225#2,6:540\n1225#2,6:546\n1225#2,6:552\n1225#2,6:558\n1225#2,6:564\n1225#2,6:651\n1225#2,6:668\n1225#2,6:674\n1225#2,6:790\n1225#2,6:796\n1225#2,6:802\n1225#2,6:808\n1225#2,6:814\n1225#2,6:820\n1225#2,6:826\n1225#2,6:832\n1225#2,6:838\n1225#2,6:844\n1225#2,6:856\n1225#2,6:866\n1225#2,6:873\n1225#2,6:879\n1225#2,6:925\n1225#2,6:931\n1225#2,6:937\n1225#2,6:943\n1225#2,6:949\n1225#2,6:993\n1225#2,6:999\n1225#2,6:1005\n1225#2,6:1011\n1225#2,6:1021\n149#3:497\n149#3:498\n149#3:499\n149#3:500\n149#3:539\n149#3:570\n149#3:575\n149#3:576\n149#3:613\n149#3:650\n149#3:667\n149#3:752\n149#3:854\n149#3:855\n149#3:872\n149#3:955\n149#3:1027\n86#4:501\n83#4,6:502\n89#4:536\n93#4:574\n79#5,6:508\n86#5,4:523\n90#5,2:533\n94#5:573\n79#5,6:584\n86#5,4:599\n90#5,2:609\n79#5,6:621\n86#5,4:636\n90#5,2:646\n94#5:659\n94#5:663\n79#5,6:687\n86#5,4:702\n90#5,2:712\n94#5:718\n79#5,6:723\n86#5,4:738\n90#5,2:748\n79#5,6:761\n86#5,4:776\n90#5,2:786\n94#5:852\n94#5:864\n79#5,6:892\n86#5,4:907\n90#5,2:917\n94#5:923\n79#5,6:964\n86#5,4:979\n90#5,2:989\n94#5:1019\n368#6,9:514\n377#6:535\n378#6,2:571\n368#6,9:590\n377#6:611\n368#6,9:627\n377#6:648\n378#6,2:657\n378#6,2:661\n368#6,9:693\n377#6:714\n378#6,2:716\n368#6,9:729\n377#6:750\n368#6,9:767\n377#6:788\n378#6,2:850\n378#6,2:862\n368#6,9:898\n377#6:919\n378#6,2:921\n368#6,9:970\n377#6:991\n378#6,2:1017\n4034#7,6:527\n4034#7,6:603\n4034#7,6:640\n4034#7,6:706\n4034#7,6:742\n4034#7,6:780\n4034#7,6:911\n4034#7,6:983\n77#8:537\n87#9:538\n71#10:577\n68#10,6:578\n74#10:612\n78#10:664\n71#10:680\n68#10,6:681\n74#10:715\n78#10:719\n71#10:885\n68#10,6:886\n74#10:920\n78#10:924\n99#11:614\n96#11,6:615\n102#11:649\n106#11:660\n99#11,3:720\n102#11:751\n99#11:753\n95#11,7:754\n102#11:789\n106#11:853\n106#11:865\n99#11:956\n95#11,7:957\n102#11:992\n106#11:1020\n31#12,2:665\n81#13:1028\n107#13,2:1029\n81#13:1031\n107#13,2:1032\n81#13:1034\n107#13,2:1035\n81#13:1037\n81#13:1038\n81#13:1039\n81#13:1040\n107#13,2:1041\n81#13:1043\n107#13,2:1044\n81#13:1046\n107#13,2:1047\n81#13:1049\n107#13,2:1050\n81#13:1052\n81#13:1053\n1863#14,2:1054\n*S KotlinDebug\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt\n*L\n61#1:473,6\n62#1:479,6\n63#1:485,6\n69#1:491,6\n85#1:540,6\n86#1:546,6\n93#1:552,6\n96#1:558,6\n102#1:564,6\n189#1:651,6\n216#1:668,6\n222#1:674,6\n273#1:790,6\n274#1:796,6\n275#1:802,6\n276#1:808,6\n277#1:814,6\n278#1:820,6\n279#1:826,6\n280#1:832,6\n281#1:838,6\n290#1:844,6\n325#1:856,6\n353#1:866,6\n362#1:873,6\n357#1:879,6\n367#1:925,6\n391#1:931,6\n392#1:937,6\n395#1:943,6\n401#1:949,6\n413#1:993,6\n415#1:999,6\n421#1:1005,6\n423#1:1011,6\n440#1:1021,6\n70#1:497\n73#1:498\n75#1:499\n78#1:500\n84#1:539\n143#1:570\n160#1:575\n172#1:576\n173#1:613\n187#1:650\n214#1:667\n270#1:752\n321#1:854\n322#1:855\n355#1:872\n409#1:955\n466#1:1027\n66#1:501\n66#1:502,6\n66#1:536\n66#1:574\n66#1:508,6\n66#1:523,4\n66#1:533,2\n66#1:573\n172#1:584,6\n172#1:599,4\n172#1:609,2\n173#1:621,6\n173#1:636,4\n173#1:646,2\n173#1:659\n172#1:663\n218#1:687,6\n218#1:702,4\n218#1:712,2\n218#1:718\n263#1:723,6\n263#1:738,4\n263#1:748,2\n268#1:761,6\n268#1:776,4\n268#1:786,2\n268#1:852\n263#1:864\n354#1:892,6\n354#1:907,4\n354#1:917,2\n354#1:923\n407#1:964,6\n407#1:979,4\n407#1:989,2\n407#1:1019\n66#1:514,9\n66#1:535\n66#1:571,2\n172#1:590,9\n172#1:611\n173#1:627,9\n173#1:648\n173#1:657,2\n172#1:661,2\n218#1:693,9\n218#1:714\n218#1:716,2\n263#1:729,9\n263#1:750\n268#1:767,9\n268#1:788\n268#1:850,2\n263#1:862,2\n354#1:898,9\n354#1:919\n354#1:921,2\n407#1:970,9\n407#1:991\n407#1:1017,2\n66#1:527,6\n172#1:603,6\n173#1:640,6\n218#1:706,6\n263#1:742,6\n268#1:780,6\n354#1:911,6\n407#1:983,6\n81#1:537\n81#1:538\n172#1:577\n172#1:578,6\n172#1:612\n172#1:664\n218#1:680\n218#1:681,6\n218#1:715\n218#1:719\n354#1:885\n354#1:886,6\n354#1:920\n354#1:924\n173#1:614\n173#1:615,6\n173#1:649\n173#1:660\n263#1:720,3\n263#1:751\n268#1:753\n268#1:754,7\n268#1:789\n268#1:853\n263#1:865\n407#1:956\n407#1:957,7\n407#1:992\n407#1:1020\n210#1:665,2\n61#1:1028\n61#1:1029,2\n85#1:1031\n85#1:1032,2\n86#1:1034\n86#1:1035,2\n155#1:1037\n209#1:1038\n212#1:1039\n216#1:1040\n216#1:1041,2\n353#1:1043\n353#1:1044,2\n391#1:1046\n391#1:1047,2\n392#1:1049\n392#1:1050,2\n395#1:1052\n401#1:1053\n443#1:1054,2\n*E\n"})
/*      */ public final class PromptAreaKt {
/*      */   @Composable
/*      */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */   public static final void PromptArea(@Nullable Modifier modifier, boolean enabled, @NotNull PromptOwnerViewModel model, @NotNull Function1 placeholder, @NotNull PromptMode currentPromptMode, @NotNull Function1 onPromptModeChange, @Nullable Composer $composer, int $changed, int paramInt1) {
/*      */     // Byte code:
/*      */     //   0: aload_2
/*      */     //   1: ldc 'model'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_3
/*      */     //   7: ldc 'placeholder'
/*      */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   12: aload #4
/*      */     //   14: ldc 'currentPromptMode'
/*      */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   19: aload #5
/*      */     //   21: ldc 'onPromptModeChange'
/*      */     //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   26: aload #6
/*      */     //   28: ldc -2097088580
/*      */     //   30: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   35: astore #6
/*      */     //   37: iload #7
/*      */     //   39: istore #9
/*      */     //   41: iload #8
/*      */     //   43: iconst_1
/*      */     //   44: iand
/*      */     //   45: ifeq -> 58
/*      */     //   48: iload #9
/*      */     //   50: bipush #6
/*      */     //   52: ior
/*      */     //   53: istore #9
/*      */     //   55: goto -> 87
/*      */     //   58: iload #7
/*      */     //   60: bipush #6
/*      */     //   62: iand
/*      */     //   63: ifne -> 87
/*      */     //   66: iload #9
/*      */     //   68: aload #6
/*      */     //   70: aload_0
/*      */     //   71: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   76: ifeq -> 83
/*      */     //   79: iconst_4
/*      */     //   80: goto -> 84
/*      */     //   83: iconst_2
/*      */     //   84: ior
/*      */     //   85: istore #9
/*      */     //   87: iload #8
/*      */     //   89: iconst_2
/*      */     //   90: iand
/*      */     //   91: ifeq -> 104
/*      */     //   94: iload #9
/*      */     //   96: bipush #48
/*      */     //   98: ior
/*      */     //   99: istore #9
/*      */     //   101: goto -> 135
/*      */     //   104: iload #7
/*      */     //   106: bipush #48
/*      */     //   108: iand
/*      */     //   109: ifne -> 135
/*      */     //   112: iload #9
/*      */     //   114: aload #6
/*      */     //   116: iload_1
/*      */     //   117: invokeinterface changed : (Z)Z
/*      */     //   122: ifeq -> 130
/*      */     //   125: bipush #32
/*      */     //   127: goto -> 132
/*      */     //   130: bipush #16
/*      */     //   132: ior
/*      */     //   133: istore #9
/*      */     //   135: iload #8
/*      */     //   137: iconst_4
/*      */     //   138: iand
/*      */     //   139: ifeq -> 153
/*      */     //   142: iload #9
/*      */     //   144: sipush #384
/*      */     //   147: ior
/*      */     //   148: istore #9
/*      */     //   150: goto -> 207
/*      */     //   153: iload #7
/*      */     //   155: sipush #384
/*      */     //   158: iand
/*      */     //   159: ifne -> 207
/*      */     //   162: iload #9
/*      */     //   164: iload #7
/*      */     //   166: sipush #512
/*      */     //   169: iand
/*      */     //   170: ifne -> 184
/*      */     //   173: aload #6
/*      */     //   175: aload_2
/*      */     //   176: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   181: goto -> 192
/*      */     //   184: aload #6
/*      */     //   186: aload_2
/*      */     //   187: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   192: ifeq -> 201
/*      */     //   195: sipush #256
/*      */     //   198: goto -> 204
/*      */     //   201: sipush #128
/*      */     //   204: ior
/*      */     //   205: istore #9
/*      */     //   207: iload #8
/*      */     //   209: bipush #8
/*      */     //   211: iand
/*      */     //   212: ifeq -> 226
/*      */     //   215: iload #9
/*      */     //   217: sipush #3072
/*      */     //   220: ior
/*      */     //   221: istore #9
/*      */     //   223: goto -> 260
/*      */     //   226: iload #7
/*      */     //   228: sipush #3072
/*      */     //   231: iand
/*      */     //   232: ifne -> 260
/*      */     //   235: iload #9
/*      */     //   237: aload #6
/*      */     //   239: aload_3
/*      */     //   240: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   245: ifeq -> 254
/*      */     //   248: sipush #2048
/*      */     //   251: goto -> 257
/*      */     //   254: sipush #1024
/*      */     //   257: ior
/*      */     //   258: istore #9
/*      */     //   260: iload #8
/*      */     //   262: bipush #16
/*      */     //   264: iand
/*      */     //   265: ifeq -> 279
/*      */     //   268: iload #9
/*      */     //   270: sipush #24576
/*      */     //   273: ior
/*      */     //   274: istore #9
/*      */     //   276: goto -> 314
/*      */     //   279: iload #7
/*      */     //   281: sipush #24576
/*      */     //   284: iand
/*      */     //   285: ifne -> 314
/*      */     //   288: iload #9
/*      */     //   290: aload #6
/*      */     //   292: aload #4
/*      */     //   294: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   299: ifeq -> 308
/*      */     //   302: sipush #16384
/*      */     //   305: goto -> 311
/*      */     //   308: sipush #8192
/*      */     //   311: ior
/*      */     //   312: istore #9
/*      */     //   314: iload #8
/*      */     //   316: bipush #32
/*      */     //   318: iand
/*      */     //   319: ifeq -> 332
/*      */     //   322: iload #9
/*      */     //   324: ldc 196608
/*      */     //   326: ior
/*      */     //   327: istore #9
/*      */     //   329: goto -> 364
/*      */     //   332: iload #7
/*      */     //   334: ldc 196608
/*      */     //   336: iand
/*      */     //   337: ifne -> 364
/*      */     //   340: iload #9
/*      */     //   342: aload #6
/*      */     //   344: aload #5
/*      */     //   346: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   351: ifeq -> 359
/*      */     //   354: ldc 131072
/*      */     //   356: goto -> 361
/*      */     //   359: ldc 65536
/*      */     //   361: ior
/*      */     //   362: istore #9
/*      */     //   364: iload #9
/*      */     //   366: ldc 74899
/*      */     //   368: iand
/*      */     //   369: ldc 74898
/*      */     //   371: if_icmpne -> 384
/*      */     //   374: aload #6
/*      */     //   376: invokeinterface getSkipping : ()Z
/*      */     //   381: ifne -> 2300
/*      */     //   384: iload #8
/*      */     //   386: iconst_1
/*      */     //   387: iand
/*      */     //   388: ifeq -> 398
/*      */     //   391: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   394: checkcast androidx/compose/ui/Modifier
/*      */     //   397: astore_0
/*      */     //   398: invokestatic isTraceInProgress : ()Z
/*      */     //   401: ifeq -> 414
/*      */     //   404: ldc -2097088580
/*      */     //   406: iload #9
/*      */     //   408: iconst_m1
/*      */     //   409: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptArea (PromptArea.kt:59)'
/*      */     //   411: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   414: aload #6
/*      */     //   416: ldc -985206040
/*      */     //   418: invokeinterface startReplaceGroup : (I)V
/*      */     //   423: aload #6
/*      */     //   425: astore #12
/*      */     //   427: iconst_0
/*      */     //   428: istore #13
/*      */     //   430: nop
/*      */     //   431: iconst_0
/*      */     //   432: istore #14
/*      */     //   434: aload #12
/*      */     //   436: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   441: astore #15
/*      */     //   443: iconst_0
/*      */     //   444: istore #16
/*      */     //   446: aload #15
/*      */     //   448: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   451: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   454: if_acmpne -> 486
/*      */     //   457: iconst_0
/*      */     //   458: istore #17
/*      */     //   460: iconst_0
/*      */     //   461: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   464: aconst_null
/*      */     //   465: iconst_2
/*      */     //   466: aconst_null
/*      */     //   467: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   470: astore #17
/*      */     //   472: aload #12
/*      */     //   474: aload #17
/*      */     //   476: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   481: aload #17
/*      */     //   483: goto -> 488
/*      */     //   486: aload #15
/*      */     //   488: nop
/*      */     //   489: nop
/*      */     //   490: nop
/*      */     //   491: checkcast androidx/compose/runtime/MutableState
/*      */     //   494: astore #11
/*      */     //   496: aload #6
/*      */     //   498: invokeinterface endReplaceGroup : ()V
/*      */     //   503: aload #11
/*      */     //   505: astore #10
/*      */     //   507: aload #6
/*      */     //   509: ldc -985204189
/*      */     //   511: invokeinterface startReplaceGroup : (I)V
/*      */     //   516: aload #6
/*      */     //   518: astore #13
/*      */     //   520: iconst_0
/*      */     //   521: istore #14
/*      */     //   523: nop
/*      */     //   524: iconst_0
/*      */     //   525: istore #15
/*      */     //   527: aload #13
/*      */     //   529: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   534: astore #16
/*      */     //   536: iconst_0
/*      */     //   537: istore #17
/*      */     //   539: aload #16
/*      */     //   541: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   544: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   547: if_acmpne -> 576
/*      */     //   550: iconst_0
/*      */     //   551: istore #18
/*      */     //   553: new androidx/compose/ui/focus/FocusRequester
/*      */     //   556: dup
/*      */     //   557: invokespecial <init> : ()V
/*      */     //   560: astore #18
/*      */     //   562: aload #13
/*      */     //   564: aload #18
/*      */     //   566: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   571: aload #18
/*      */     //   573: goto -> 578
/*      */     //   576: aload #16
/*      */     //   578: nop
/*      */     //   579: nop
/*      */     //   580: nop
/*      */     //   581: checkcast androidx/compose/ui/focus/FocusRequester
/*      */     //   584: astore #12
/*      */     //   586: aload #6
/*      */     //   588: invokeinterface endReplaceGroup : ()V
/*      */     //   593: aload #12
/*      */     //   595: astore #11
/*      */     //   597: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   600: aload #6
/*      */     //   602: ldc -985202483
/*      */     //   604: invokeinterface startReplaceGroup : (I)V
/*      */     //   609: aload #6
/*      */     //   611: astore #13
/*      */     //   613: iconst_0
/*      */     //   614: istore #14
/*      */     //   616: iconst_0
/*      */     //   617: istore #15
/*      */     //   619: aload #13
/*      */     //   621: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   626: astore #16
/*      */     //   628: iconst_0
/*      */     //   629: istore #17
/*      */     //   631: aload #16
/*      */     //   633: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   636: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   639: if_acmpne -> 679
/*      */     //   642: astore #56
/*      */     //   644: iconst_0
/*      */     //   645: istore #18
/*      */     //   647: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptArea$1$1
/*      */     //   650: dup
/*      */     //   651: aload #11
/*      */     //   653: aconst_null
/*      */     //   654: invokespecial <init> : (Landroidx/compose/ui/focus/FocusRequester;Lkotlin/coroutines/Continuation;)V
/*      */     //   657: checkcast kotlin/jvm/functions/Function2
/*      */     //   660: aload #56
/*      */     //   662: swap
/*      */     //   663: astore #19
/*      */     //   665: aload #13
/*      */     //   667: aload #19
/*      */     //   669: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   674: aload #19
/*      */     //   676: goto -> 681
/*      */     //   679: aload #16
/*      */     //   681: nop
/*      */     //   682: nop
/*      */     //   683: nop
/*      */     //   684: checkcast kotlin/jvm/functions/Function2
/*      */     //   687: astore #12
/*      */     //   689: aload #6
/*      */     //   691: invokeinterface endReplaceGroup : ()V
/*      */     //   696: aload #12
/*      */     //   698: aload #6
/*      */     //   700: bipush #6
/*      */     //   702: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   705: aload_0
/*      */     //   706: aload #11
/*      */     //   708: invokestatic focusRequester : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;
/*      */     //   711: aload #6
/*      */     //   713: ldc -985198538
/*      */     //   715: invokeinterface startReplaceGroup : (I)V
/*      */     //   720: aload #6
/*      */     //   722: astore #13
/*      */     //   724: iconst_0
/*      */     //   725: istore #14
/*      */     //   727: nop
/*      */     //   728: iconst_0
/*      */     //   729: istore #15
/*      */     //   731: aload #13
/*      */     //   733: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   738: astore #16
/*      */     //   740: iconst_0
/*      */     //   741: istore #17
/*      */     //   743: aload #16
/*      */     //   745: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   748: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   751: if_acmpne -> 785
/*      */     //   754: astore #56
/*      */     //   756: iconst_0
/*      */     //   757: istore #18
/*      */     //   759: aload #10
/*      */     //   761: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   766: aload #56
/*      */     //   768: swap
/*      */     //   769: astore #19
/*      */     //   771: aload #13
/*      */     //   773: aload #19
/*      */     //   775: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   780: aload #19
/*      */     //   782: goto -> 787
/*      */     //   785: aload #16
/*      */     //   787: nop
/*      */     //   788: nop
/*      */     //   789: nop
/*      */     //   790: checkcast kotlin/jvm/functions/Function1
/*      */     //   793: astore #12
/*      */     //   795: aload #6
/*      */     //   797: invokeinterface endReplaceGroup : ()V
/*      */     //   802: aload #12
/*      */     //   804: invokestatic onFocusChanged : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   807: aload #6
/*      */     //   809: iconst_0
/*      */     //   810: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*      */     //   813: invokevirtual getPromptAreaBackgroundColor-0d7_KjU : ()J
/*      */     //   816: bipush #6
/*      */     //   818: istore #12
/*      */     //   820: iconst_0
/*      */     //   821: istore #13
/*      */     //   823: iload #12
/*      */     //   825: i2f
/*      */     //   826: invokestatic constructor-impl : (F)F
/*      */     //   829: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*      */     //   832: checkcast androidx/compose/ui/graphics/Shape
/*      */     //   835: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*      */     //   838: aload #6
/*      */     //   840: ldc -985193381
/*      */     //   842: invokeinterface startReplaceGroup : (I)V
/*      */     //   847: aload #10
/*      */     //   849: invokestatic PromptArea$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*      */     //   852: ifeq -> 914
/*      */     //   855: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   858: checkcast androidx/compose/ui/Modifier
/*      */     //   861: iconst_2
/*      */     //   862: istore #13
/*      */     //   864: iconst_0
/*      */     //   865: istore #14
/*      */     //   867: iload #13
/*      */     //   869: i2f
/*      */     //   870: invokestatic constructor-impl : (F)F
/*      */     //   873: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   876: aload #6
/*      */     //   878: bipush #6
/*      */     //   880: invokevirtual getGlobalColors : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/GlobalColors;
/*      */     //   883: invokevirtual getOutlines : ()Lorg/jetbrains/jewel/foundation/OutlineColors;
/*      */     //   886: invokevirtual getFocused-0d7_KjU : ()J
/*      */     //   889: bipush #6
/*      */     //   891: istore #13
/*      */     //   893: iconst_0
/*      */     //   894: istore #14
/*      */     //   896: iload #13
/*      */     //   898: i2f
/*      */     //   899: invokestatic constructor-impl : (F)F
/*      */     //   902: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*      */     //   905: checkcast androidx/compose/ui/graphics/Shape
/*      */     //   908: invokestatic border-xT4_qwU : (Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*      */     //   911: goto -> 920
/*      */     //   914: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   917: checkcast androidx/compose/ui/Modifier
/*      */     //   920: astore #12
/*      */     //   922: aload #6
/*      */     //   924: invokeinterface endReplaceGroup : ()V
/*      */     //   929: aload #12
/*      */     //   931: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   936: bipush #12
/*      */     //   938: istore #12
/*      */     //   940: iconst_0
/*      */     //   941: istore #13
/*      */     //   943: iload #12
/*      */     //   945: i2f
/*      */     //   946: invokestatic constructor-impl : (F)F
/*      */     //   949: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*      */     //   952: astore #12
/*      */     //   954: iconst_0
/*      */     //   955: istore #15
/*      */     //   957: nop
/*      */     //   958: iconst_0
/*      */     //   959: istore #16
/*      */     //   961: aload #6
/*      */     //   963: ldc -483455358
/*      */     //   965: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*      */     //   967: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   970: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*      */     //   973: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*      */     //   976: astore #13
/*      */     //   978: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   981: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*      */     //   984: astore #14
/*      */     //   986: aload #13
/*      */     //   988: aload #14
/*      */     //   990: aload #6
/*      */     //   992: bipush #14
/*      */     //   994: iload #15
/*      */     //   996: iconst_3
/*      */     //   997: ishr
/*      */     //   998: iand
/*      */     //   999: bipush #112
/*      */     //   1001: iload #15
/*      */     //   1003: iconst_3
/*      */     //   1004: ishr
/*      */     //   1005: iand
/*      */     //   1006: ior
/*      */     //   1007: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1010: astore #17
/*      */     //   1012: bipush #112
/*      */     //   1014: iload #15
/*      */     //   1016: iconst_3
/*      */     //   1017: ishl
/*      */     //   1018: iand
/*      */     //   1019: istore #18
/*      */     //   1021: nop
/*      */     //   1022: iconst_0
/*      */     //   1023: istore #19
/*      */     //   1025: aload #6
/*      */     //   1027: ldc_w -1323940314
/*      */     //   1030: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   1033: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1036: aload #6
/*      */     //   1038: iconst_0
/*      */     //   1039: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   1042: istore #20
/*      */     //   1044: aload #6
/*      */     //   1046: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1051: astore #21
/*      */     //   1053: aload #6
/*      */     //   1055: aload #12
/*      */     //   1057: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   1060: astore #22
/*      */     //   1062: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1065: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   1068: astore #23
/*      */     //   1070: bipush #6
/*      */     //   1072: sipush #896
/*      */     //   1075: iload #18
/*      */     //   1077: bipush #6
/*      */     //   1079: ishl
/*      */     //   1080: iand
/*      */     //   1081: ior
/*      */     //   1082: istore #24
/*      */     //   1084: nop
/*      */     //   1085: iconst_0
/*      */     //   1086: istore #25
/*      */     //   1088: aload #6
/*      */     //   1090: ldc_w -692256719
/*      */     //   1093: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   1096: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1099: aload #6
/*      */     //   1101: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   1106: instanceof androidx/compose/runtime/Applier
/*      */     //   1109: ifne -> 1115
/*      */     //   1112: invokestatic invalidApplier : ()V
/*      */     //   1115: aload #6
/*      */     //   1117: invokeinterface startReusableNode : ()V
/*      */     //   1122: aload #6
/*      */     //   1124: invokeinterface getInserting : ()Z
/*      */     //   1129: ifeq -> 1144
/*      */     //   1132: aload #6
/*      */     //   1134: aload #23
/*      */     //   1136: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   1141: goto -> 1151
/*      */     //   1144: aload #6
/*      */     //   1146: invokeinterface useNode : ()V
/*      */     //   1151: aload #6
/*      */     //   1153: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   1156: astore #26
/*      */     //   1158: iconst_0
/*      */     //   1159: istore #27
/*      */     //   1161: aload #26
/*      */     //   1163: aload #17
/*      */     //   1165: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1168: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1171: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1174: aload #26
/*      */     //   1176: aload #21
/*      */     //   1178: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1181: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1184: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1187: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1190: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1193: astore #28
/*      */     //   1195: iconst_0
/*      */     //   1196: istore #29
/*      */     //   1198: aload #26
/*      */     //   1200: astore #30
/*      */     //   1202: iconst_0
/*      */     //   1203: istore #31
/*      */     //   1205: aload #30
/*      */     //   1207: invokeinterface getInserting : ()Z
/*      */     //   1212: ifne -> 1233
/*      */     //   1215: aload #30
/*      */     //   1217: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1222: iload #20
/*      */     //   1224: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1227: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   1230: ifne -> 1259
/*      */     //   1233: aload #30
/*      */     //   1235: iload #20
/*      */     //   1237: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1240: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1245: aload #26
/*      */     //   1247: iload #20
/*      */     //   1249: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1252: aload #28
/*      */     //   1254: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1259: nop
/*      */     //   1260: nop
/*      */     //   1261: nop
/*      */     //   1262: aload #26
/*      */     //   1264: aload #22
/*      */     //   1266: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1269: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1272: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1275: nop
/*      */     //   1276: nop
/*      */     //   1277: aload #6
/*      */     //   1279: bipush #14
/*      */     //   1281: iload #24
/*      */     //   1283: bipush #6
/*      */     //   1285: ishr
/*      */     //   1286: iand
/*      */     //   1287: istore #32
/*      */     //   1289: astore #33
/*      */     //   1291: iconst_0
/*      */     //   1292: istore #34
/*      */     //   1294: aload #33
/*      */     //   1296: ldc_w -384784025
/*      */     //   1299: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*      */     //   1302: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1305: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*      */     //   1308: aload #33
/*      */     //   1310: bipush #6
/*      */     //   1312: bipush #112
/*      */     //   1314: iload #15
/*      */     //   1316: bipush #6
/*      */     //   1318: ishr
/*      */     //   1319: iand
/*      */     //   1320: ior
/*      */     //   1321: istore #35
/*      */     //   1323: astore #36
/*      */     //   1325: checkcast androidx/compose/foundation/layout/ColumnScope
/*      */     //   1328: astore #37
/*      */     //   1330: iconst_0
/*      */     //   1331: istore #38
/*      */     //   1333: aload_2
/*      */     //   1334: invokeinterface getTextState : ()Landroidx/compose/foundation/text/input/TextFieldState;
/*      */     //   1339: astore #39
/*      */     //   1341: invokestatic getLocalTextAreaStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*      */     //   1344: checkcast androidx/compose/runtime/CompositionLocal
/*      */     //   1347: astore #40
/*      */     //   1349: iconst_0
/*      */     //   1350: istore #41
/*      */     //   1352: iconst_0
/*      */     //   1353: istore #42
/*      */     //   1355: aload #36
/*      */     //   1357: ldc_w 2023513938
/*      */     //   1360: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*      */     //   1363: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1366: aload #36
/*      */     //   1368: aload #40
/*      */     //   1370: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*      */     //   1375: astore #43
/*      */     //   1377: aload #36
/*      */     //   1379: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1382: aload #43
/*      */     //   1384: checkcast org/jetbrains/jewel/ui/component/styling/TextAreaStyle
/*      */     //   1387: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TextAreaMetrics;
/*      */     //   1390: invokevirtual getMinSize-MYxV2XQ : ()J
/*      */     //   1393: invokestatic getHeight-D9Ej5fM : (J)F
/*      */     //   1396: fstore #40
/*      */     //   1398: iconst_2
/*      */     //   1399: istore #41
/*      */     //   1401: iconst_0
/*      */     //   1402: istore #42
/*      */     //   1404: fload #40
/*      */     //   1406: iload #41
/*      */     //   1408: i2f
/*      */     //   1409: fmul
/*      */     //   1410: invokestatic constructor-impl : (F)F
/*      */     //   1413: fstore #44
/*      */     //   1415: sipush #350
/*      */     //   1418: istore #41
/*      */     //   1420: iconst_0
/*      */     //   1421: istore #42
/*      */     //   1423: iload #41
/*      */     //   1425: i2f
/*      */     //   1426: invokestatic constructor-impl : (F)F
/*      */     //   1429: fstore #40
/*      */     //   1431: aload #36
/*      */     //   1433: ldc_w 959342087
/*      */     //   1436: invokeinterface startReplaceGroup : (I)V
/*      */     //   1441: aload #36
/*      */     //   1443: astore #43
/*      */     //   1445: iconst_0
/*      */     //   1446: istore #45
/*      */     //   1448: nop
/*      */     //   1449: iconst_0
/*      */     //   1450: istore #46
/*      */     //   1452: aload #43
/*      */     //   1454: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1459: astore #47
/*      */     //   1461: iconst_0
/*      */     //   1462: istore #48
/*      */     //   1464: aload #47
/*      */     //   1466: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1469: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1472: if_acmpne -> 1504
/*      */     //   1475: iconst_0
/*      */     //   1476: istore #49
/*      */     //   1478: iconst_0
/*      */     //   1479: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   1482: aconst_null
/*      */     //   1483: iconst_2
/*      */     //   1484: aconst_null
/*      */     //   1485: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   1488: astore #49
/*      */     //   1490: aload #43
/*      */     //   1492: aload #49
/*      */     //   1494: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1499: aload #49
/*      */     //   1501: goto -> 1506
/*      */     //   1504: aload #47
/*      */     //   1506: nop
/*      */     //   1507: nop
/*      */     //   1508: nop
/*      */     //   1509: checkcast androidx/compose/runtime/MutableState
/*      */     //   1512: astore #42
/*      */     //   1514: aload #36
/*      */     //   1516: invokeinterface endReplaceGroup : ()V
/*      */     //   1521: aload #42
/*      */     //   1523: astore #41
/*      */     //   1525: aload #36
/*      */     //   1527: ldc_w 959344135
/*      */     //   1530: invokeinterface startReplaceGroup : (I)V
/*      */     //   1535: aload #36
/*      */     //   1537: astore #45
/*      */     //   1539: iconst_0
/*      */     //   1540: istore #46
/*      */     //   1542: nop
/*      */     //   1543: iconst_0
/*      */     //   1544: istore #47
/*      */     //   1546: aload #45
/*      */     //   1548: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1553: astore #48
/*      */     //   1555: iconst_0
/*      */     //   1556: istore #49
/*      */     //   1558: aload #48
/*      */     //   1560: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1563: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1566: if_acmpne -> 1598
/*      */     //   1569: iconst_0
/*      */     //   1570: istore #50
/*      */     //   1572: iconst_0
/*      */     //   1573: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   1576: aconst_null
/*      */     //   1577: iconst_2
/*      */     //   1578: aconst_null
/*      */     //   1579: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   1582: astore #50
/*      */     //   1584: aload #45
/*      */     //   1586: aload #50
/*      */     //   1588: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1593: aload #50
/*      */     //   1595: goto -> 1600
/*      */     //   1598: aload #48
/*      */     //   1600: nop
/*      */     //   1601: nop
/*      */     //   1602: nop
/*      */     //   1603: checkcast androidx/compose/runtime/MutableState
/*      */     //   1606: astore #43
/*      */     //   1608: aload #36
/*      */     //   1610: invokeinterface endReplaceGroup : ()V
/*      */     //   1615: aload #43
/*      */     //   1617: astore #42
/*      */     //   1619: aload #39
/*      */     //   1621: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   1624: aload #36
/*      */     //   1626: bipush #6
/*      */     //   1628: invokestatic getTextAreaStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;
/*      */     //   1631: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   1634: aload #36
/*      */     //   1636: bipush #6
/*      */     //   1638: invokevirtual getGlobalColors : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/foundation/GlobalColors;
/*      */     //   1641: invokevirtual getText : ()Lorg/jetbrains/jewel/foundation/TextColors;
/*      */     //   1644: invokevirtual getNormal-0d7_KjU : ()J
/*      */     //   1647: invokestatic copy-4WTKRHQ : (Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;J)Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;
/*      */     //   1650: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   1653: checkcast androidx/compose/ui/Modifier
/*      */     //   1656: fload #44
/*      */     //   1658: fload #40
/*      */     //   1660: invokestatic heightIn-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*      */     //   1663: aload #36
/*      */     //   1665: ldc_w 959353564
/*      */     //   1668: invokeinterface startReplaceGroup : (I)V
/*      */     //   1673: aload #36
/*      */     //   1675: astore #45
/*      */     //   1677: aload #36
/*      */     //   1679: aload #39
/*      */     //   1681: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   1686: istore #46
/*      */     //   1688: nop
/*      */     //   1689: iconst_0
/*      */     //   1690: istore #47
/*      */     //   1692: aload #45
/*      */     //   1694: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1699: astore #48
/*      */     //   1701: iconst_0
/*      */     //   1702: istore #49
/*      */     //   1704: iload #46
/*      */     //   1706: ifne -> 1720
/*      */     //   1709: aload #48
/*      */     //   1711: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1714: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1717: if_acmpne -> 1762
/*      */     //   1720: astore #51
/*      */     //   1722: astore #52
/*      */     //   1724: astore #53
/*      */     //   1726: iconst_0
/*      */     //   1727: istore #50
/*      */     //   1729: aload #39
/*      */     //   1731: <illegal opcode> invoke : (Landroidx/compose/foundation/text/input/TextFieldState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1736: astore #54
/*      */     //   1738: aload #53
/*      */     //   1740: aload #52
/*      */     //   1742: aload #51
/*      */     //   1744: aload #54
/*      */     //   1746: astore #55
/*      */     //   1748: aload #45
/*      */     //   1750: aload #55
/*      */     //   1752: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1757: aload #55
/*      */     //   1759: goto -> 1764
/*      */     //   1762: aload #48
/*      */     //   1764: nop
/*      */     //   1765: nop
/*      */     //   1766: nop
/*      */     //   1767: checkcast kotlin/jvm/functions/Function1
/*      */     //   1770: astore #43
/*      */     //   1772: aload #36
/*      */     //   1774: invokeinterface endReplaceGroup : ()V
/*      */     //   1779: aload #43
/*      */     //   1781: invokestatic provideData : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1784: aload #36
/*      */     //   1786: ldc_w 959358177
/*      */     //   1789: invokeinterface startReplaceGroup : (I)V
/*      */     //   1794: aload #36
/*      */     //   1796: astore #45
/*      */     //   1798: iload #9
/*      */     //   1800: sipush #896
/*      */     //   1803: iand
/*      */     //   1804: sipush #256
/*      */     //   1807: if_icmpeq -> 1830
/*      */     //   1810: iload #9
/*      */     //   1812: sipush #512
/*      */     //   1815: iand
/*      */     //   1816: ifeq -> 1834
/*      */     //   1819: aload #6
/*      */     //   1821: aload_2
/*      */     //   1822: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1827: ifeq -> 1834
/*      */     //   1830: iconst_1
/*      */     //   1831: goto -> 1835
/*      */     //   1834: iconst_0
/*      */     //   1835: istore #46
/*      */     //   1837: nop
/*      */     //   1838: iconst_0
/*      */     //   1839: istore #47
/*      */     //   1841: aload #45
/*      */     //   1843: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1848: astore #48
/*      */     //   1850: iconst_0
/*      */     //   1851: istore #49
/*      */     //   1853: iload #46
/*      */     //   1855: ifne -> 1869
/*      */     //   1858: aload #48
/*      */     //   1860: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1863: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1866: if_acmpne -> 1912
/*      */     //   1869: astore #51
/*      */     //   1871: astore #52
/*      */     //   1873: astore #53
/*      */     //   1875: iconst_0
/*      */     //   1876: istore #50
/*      */     //   1878: aload_2
/*      */     //   1879: aload #41
/*      */     //   1881: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1886: astore #54
/*      */     //   1888: aload #53
/*      */     //   1890: aload #52
/*      */     //   1892: aload #51
/*      */     //   1894: aload #54
/*      */     //   1896: astore #55
/*      */     //   1898: aload #45
/*      */     //   1900: aload #55
/*      */     //   1902: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1907: aload #55
/*      */     //   1909: goto -> 1914
/*      */     //   1912: aload #48
/*      */     //   1914: nop
/*      */     //   1915: nop
/*      */     //   1916: nop
/*      */     //   1917: checkcast kotlin/jvm/functions/Function1
/*      */     //   1920: astore #43
/*      */     //   1922: aload #36
/*      */     //   1924: invokeinterface endReplaceGroup : ()V
/*      */     //   1929: aload #43
/*      */     //   1931: invokestatic onFocusEvent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1934: aload #36
/*      */     //   1936: ldc_w 959366110
/*      */     //   1939: invokeinterface startReplaceGroup : (I)V
/*      */     //   1944: aload #36
/*      */     //   1946: astore #45
/*      */     //   1948: iload #9
/*      */     //   1950: sipush #896
/*      */     //   1953: iand
/*      */     //   1954: sipush #256
/*      */     //   1957: if_icmpeq -> 1980
/*      */     //   1960: iload #9
/*      */     //   1962: sipush #512
/*      */     //   1965: iand
/*      */     //   1966: ifeq -> 1984
/*      */     //   1969: aload #6
/*      */     //   1971: aload_2
/*      */     //   1972: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1977: ifeq -> 1984
/*      */     //   1980: iconst_1
/*      */     //   1981: goto -> 1985
/*      */     //   1984: iconst_0
/*      */     //   1985: iload #9
/*      */     //   1987: bipush #112
/*      */     //   1989: iand
/*      */     //   1990: bipush #32
/*      */     //   1992: if_icmpne -> 1999
/*      */     //   1995: iconst_1
/*      */     //   1996: goto -> 2000
/*      */     //   1999: iconst_0
/*      */     //   2000: ior
/*      */     //   2001: aload #6
/*      */     //   2003: aload #39
/*      */     //   2005: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   2010: ior
/*      */     //   2011: iload #9
/*      */     //   2013: ldc_w 57344
/*      */     //   2016: iand
/*      */     //   2017: sipush #16384
/*      */     //   2020: if_icmpne -> 2027
/*      */     //   2023: iconst_1
/*      */     //   2024: goto -> 2028
/*      */     //   2027: iconst_0
/*      */     //   2028: ior
/*      */     //   2029: istore #46
/*      */     //   2031: nop
/*      */     //   2032: iconst_0
/*      */     //   2033: istore #47
/*      */     //   2035: aload #45
/*      */     //   2037: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   2042: astore #48
/*      */     //   2044: iconst_0
/*      */     //   2045: istore #49
/*      */     //   2047: iload #46
/*      */     //   2049: ifne -> 2063
/*      */     //   2052: aload #48
/*      */     //   2054: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   2057: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   2060: if_acmpne -> 2116
/*      */     //   2063: astore #51
/*      */     //   2065: astore #52
/*      */     //   2067: astore #53
/*      */     //   2069: iconst_0
/*      */     //   2070: istore #50
/*      */     //   2072: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptArea$3$3$1
/*      */     //   2075: dup
/*      */     //   2076: aload_2
/*      */     //   2077: iload_1
/*      */     //   2078: aload #39
/*      */     //   2080: aload #4
/*      */     //   2082: aload #42
/*      */     //   2084: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;ZLandroidx/compose/foundation/text/input/TextFieldState;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Landroidx/compose/runtime/MutableState;)V
/*      */     //   2087: checkcast kotlin/jvm/functions/Function1
/*      */     //   2090: astore #54
/*      */     //   2092: aload #53
/*      */     //   2094: aload #52
/*      */     //   2096: aload #51
/*      */     //   2098: aload #54
/*      */     //   2100: astore #55
/*      */     //   2102: aload #45
/*      */     //   2104: aload #55
/*      */     //   2106: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   2111: aload #55
/*      */     //   2113: goto -> 2118
/*      */     //   2116: aload #48
/*      */     //   2118: nop
/*      */     //   2119: nop
/*      */     //   2120: nop
/*      */     //   2121: checkcast kotlin/jvm/functions/Function1
/*      */     //   2124: astore #43
/*      */     //   2126: aload #36
/*      */     //   2128: invokeinterface endReplaceGroup : ()V
/*      */     //   2133: aload #43
/*      */     //   2135: invokestatic onPreviewKeyEvent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   2138: ldc_w -1303348208
/*      */     //   2141: iconst_1
/*      */     //   2142: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptArea$3$4
/*      */     //   2145: dup
/*      */     //   2146: aload_3
/*      */     //   2147: aload #4
/*      */     //   2149: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;)V
/*      */     //   2152: aload #36
/*      */     //   2154: bipush #54
/*      */     //   2156: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   2159: checkcast kotlin/jvm/functions/Function2
/*      */     //   2162: aload #36
/*      */     //   2164: sipush #3072
/*      */     //   2167: invokestatic HeightAutoSizingTextArea : (Landroidx/compose/foundation/text/input/TextFieldState;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   2170: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   2173: checkcast androidx/compose/ui/Modifier
/*      */     //   2176: fconst_0
/*      */     //   2177: bipush #16
/*      */     //   2179: istore #43
/*      */     //   2181: iconst_0
/*      */     //   2182: istore #45
/*      */     //   2184: iload #43
/*      */     //   2186: i2f
/*      */     //   2187: invokestatic constructor-impl : (F)F
/*      */     //   2190: iconst_1
/*      */     //   2191: aconst_null
/*      */     //   2192: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   2195: aload_2
/*      */     //   2196: invokeinterface getAttachedFiles : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*      */     //   2201: aload #36
/*      */     //   2203: bipush #6
/*      */     //   2205: iconst_0
/*      */     //   2206: invokestatic PromptFiles : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;Landroidx/compose/runtime/Composer;II)V
/*      */     //   2209: aload_2
/*      */     //   2210: aload #39
/*      */     //   2212: iload_1
/*      */     //   2213: aload #4
/*      */     //   2215: aload #5
/*      */     //   2217: aload #36
/*      */     //   2219: bipush #14
/*      */     //   2221: iload #9
/*      */     //   2223: bipush #6
/*      */     //   2225: ishr
/*      */     //   2226: iand
/*      */     //   2227: sipush #896
/*      */     //   2230: iload #9
/*      */     //   2232: iconst_3
/*      */     //   2233: ishl
/*      */     //   2234: iand
/*      */     //   2235: ior
/*      */     //   2236: sipush #7168
/*      */     //   2239: iload #9
/*      */     //   2241: iconst_3
/*      */     //   2242: ishr
/*      */     //   2243: iand
/*      */     //   2244: ior
/*      */     //   2245: ldc_w 57344
/*      */     //   2248: iload #9
/*      */     //   2250: iconst_3
/*      */     //   2251: ishr
/*      */     //   2252: iand
/*      */     //   2253: ior
/*      */     //   2254: invokestatic PromptButtons : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Landroidx/compose/foundation/text/input/TextFieldState;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*      */     //   2257: nop
/*      */     //   2258: aload #33
/*      */     //   2260: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2263: aload #6
/*      */     //   2265: invokeinterface endNode : ()V
/*      */     //   2270: aload #6
/*      */     //   2272: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2275: nop
/*      */     //   2276: aload #6
/*      */     //   2278: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2281: nop
/*      */     //   2282: aload #6
/*      */     //   2284: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2287: nop
/*      */     //   2288: invokestatic isTraceInProgress : ()Z
/*      */     //   2291: ifeq -> 2307
/*      */     //   2294: invokestatic traceEventEnd : ()V
/*      */     //   2297: goto -> 2307
/*      */     //   2300: aload #6
/*      */     //   2302: invokeinterface skipToGroupEnd : ()V
/*      */     //   2307: aload #6
/*      */     //   2309: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   2314: dup
/*      */     //   2315: ifnull -> 2343
/*      */     //   2318: aload_0
/*      */     //   2319: iload_1
/*      */     //   2320: aload_2
/*      */     //   2321: aload_3
/*      */     //   2322: aload #4
/*      */     //   2324: aload #5
/*      */     //   2326: iload #7
/*      */     //   2328: iload #8
/*      */     //   2330: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*      */     //   2335: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   2340: goto -> 2344
/*      */     //   2343: pop
/*      */     //   2344: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #60	-> 26
/*      */     //   #54	-> 391
/*      */     //   #60	-> 411
/*      */     //   #61	-> 430
/*      */     //   #473	-> 434
/*      */     //   #474	-> 446
/*      */     //   #475	-> 457
/*      */     //   #61	-> 460
/*      */     //   #475	-> 470
/*      */     //   #476	-> 472
/*      */     //   #477	-> 481
/*      */     //   #478	-> 486
/*      */     //   #474	-> 488
/*      */     //   #473	-> 489
/*      */     //   #473	-> 490
/*      */     //   #61	-> 491
/*      */     //   #62	-> 523
/*      */     //   #479	-> 527
/*      */     //   #480	-> 539
/*      */     //   #481	-> 550
/*      */     //   #62	-> 553
/*      */     //   #481	-> 560
/*      */     //   #482	-> 562
/*      */     //   #483	-> 571
/*      */     //   #484	-> 576
/*      */     //   #480	-> 578
/*      */     //   #479	-> 579
/*      */     //   #479	-> 580
/*      */     //   #62	-> 581
/*      */     //   #63	-> 597
/*      */     //   #485	-> 619
/*      */     //   #486	-> 631
/*      */     //   #487	-> 642
/*      */     //   #63	-> 647
/*      */     //   #487	-> 663
/*      */     //   #488	-> 665
/*      */     //   #489	-> 674
/*      */     //   #490	-> 679
/*      */     //   #486	-> 681
/*      */     //   #485	-> 682
/*      */     //   #485	-> 683
/*      */     //   #63	-> 684
/*      */     //   #67	-> 705
/*      */     //   #68	-> 706
/*      */     //   #69	-> 727
/*      */     //   #491	-> 731
/*      */     //   #492	-> 743
/*      */     //   #493	-> 754
/*      */     //   #69	-> 759
/*      */     //   #493	-> 769
/*      */     //   #494	-> 771
/*      */     //   #495	-> 780
/*      */     //   #496	-> 785
/*      */     //   #492	-> 787
/*      */     //   #491	-> 788
/*      */     //   #491	-> 789
/*      */     //   #69	-> 790
/*      */     //   #70	-> 810
/*      */     //   #497	-> 823
/*      */     //   #70	-> 829
/*      */     //   #72	-> 847
/*      */     //   #73	-> 861
/*      */     //   #498	-> 867
/*      */     //   #74	-> 873
/*      */     //   #75	-> 889
/*      */     //   #499	-> 896
/*      */     //   #75	-> 902
/*      */     //   #72	-> 908
/*      */     //   #76	-> 914
/*      */     //   #72	-> 920
/*      */     //   #71	-> 931
/*      */     //   #78	-> 936
/*      */     //   #500	-> 943
/*      */     //   #78	-> 949
/*      */     //   #66	-> 957
/*      */     //   #501	-> 967
/*      */     //   #502	-> 970
/*      */     //   #503	-> 978
/*      */     //   #506	-> 986
/*      */     //   #507	-> 1021
/*      */     //   #508	-> 1033
/*      */     //   #509	-> 1039
/*      */     //   #510	-> 1046
/*      */     //   #511	-> 1055
/*      */     //   #513	-> 1062
/*      */     //   #512	-> 1084
/*      */     //   #514	-> 1096
/*      */     //   #515	-> 1099
/*      */     //   #516	-> 1117
/*      */     //   #517	-> 1122
/*      */     //   #518	-> 1134
/*      */     //   #520	-> 1146
/*      */     //   #522	-> 1151
/*      */     //   #523	-> 1161
/*      */     //   #524	-> 1174
/*      */     //   #526	-> 1187
/*      */     //   #527	-> 1198
/*      */     //   #528	-> 1205
/*      */     //   #529	-> 1233
/*      */     //   #530	-> 1245
/*      */     //   #532	-> 1259
/*      */     //   #527	-> 1260
/*      */     //   #532	-> 1261
/*      */     //   #533	-> 1262
/*      */     //   #534	-> 1275
/*      */     //   #522	-> 1276
/*      */     //   #535	-> 1277
/*      */     //   #536	-> 1302
/*      */     //   #80	-> 1333
/*      */     //   #81	-> 1341
/*      */     //   #537	-> 1363
/*      */     //   #81	-> 1387
/*      */     //   #538	-> 1404
/*      */     //   #81	-> 1413
/*      */     //   #84	-> 1415
/*      */     //   #539	-> 1423
/*      */     //   #84	-> 1429
/*      */     //   #85	-> 1448
/*      */     //   #540	-> 1452
/*      */     //   #541	-> 1464
/*      */     //   #542	-> 1475
/*      */     //   #85	-> 1478
/*      */     //   #542	-> 1488
/*      */     //   #543	-> 1490
/*      */     //   #544	-> 1499
/*      */     //   #545	-> 1504
/*      */     //   #541	-> 1506
/*      */     //   #540	-> 1507
/*      */     //   #540	-> 1508
/*      */     //   #85	-> 1509
/*      */     //   #86	-> 1542
/*      */     //   #546	-> 1546
/*      */     //   #547	-> 1558
/*      */     //   #548	-> 1569
/*      */     //   #86	-> 1572
/*      */     //   #548	-> 1582
/*      */     //   #549	-> 1584
/*      */     //   #550	-> 1593
/*      */     //   #551	-> 1598
/*      */     //   #547	-> 1600
/*      */     //   #546	-> 1601
/*      */     //   #546	-> 1602
/*      */     //   #86	-> 1603
/*      */     //   #89	-> 1619
/*      */     //   #90	-> 1621
/*      */     //   #91	-> 1650
/*      */     //   #92	-> 1656
/*      */     //   #93	-> 1688
/*      */     //   #552	-> 1692
/*      */     //   #553	-> 1704
/*      */     //   #554	-> 1720
/*      */     //   #93	-> 1729
/*      */     //   #554	-> 1746
/*      */     //   #555	-> 1748
/*      */     //   #556	-> 1757
/*      */     //   #557	-> 1762
/*      */     //   #553	-> 1764
/*      */     //   #552	-> 1765
/*      */     //   #552	-> 1766
/*      */     //   #93	-> 1767
/*      */     //   #96	-> 1837
/*      */     //   #558	-> 1841
/*      */     //   #559	-> 1853
/*      */     //   #560	-> 1869
/*      */     //   #96	-> 1878
/*      */     //   #560	-> 1896
/*      */     //   #561	-> 1898
/*      */     //   #562	-> 1907
/*      */     //   #563	-> 1912
/*      */     //   #559	-> 1914
/*      */     //   #558	-> 1915
/*      */     //   #558	-> 1916
/*      */     //   #96	-> 1917
/*      */     //   #102	-> 2031
/*      */     //   #564	-> 2035
/*      */     //   #565	-> 2047
/*      */     //   #566	-> 2063
/*      */     //   #102	-> 2072
/*      */     //   #566	-> 2100
/*      */     //   #567	-> 2102
/*      */     //   #568	-> 2111
/*      */     //   #569	-> 2116
/*      */     //   #565	-> 2118
/*      */     //   #564	-> 2119
/*      */     //   #564	-> 2120
/*      */     //   #102	-> 2121
/*      */     //   #130	-> 2138
/*      */     //   #88	-> 2167
/*      */     //   #143	-> 2170
/*      */     //   #570	-> 2184
/*      */     //   #143	-> 2190
/*      */     //   #144	-> 2209
/*      */     //   #145	-> 2257
/*      */     //   #536	-> 2258
/*      */     //   #535	-> 2263
/*      */     //   #571	-> 2265
/*      */     //   #514	-> 2272
/*      */     //   #572	-> 2275
/*      */     //   #508	-> 2278
/*      */     //   #573	-> 2281
/*      */     //   #501	-> 2284
/*      */     //   #574	-> 2287
/*      */     //   #146	-> 2300
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   460	10	17	$i$a$-cache-PromptAreaKt$PromptArea$hasFocus$2	I
/*      */     //   472	11	17	value$iv	Ljava/lang/Object;
/*      */     //   446	43	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   443	46	15	it$iv	Ljava/lang/Object;
/*      */     //   434	57	14	$i$f$cache	I
/*      */     //   431	60	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   431	60	13	invalid$iv	Z
/*      */     //   553	7	18	$i$a$-cache-PromptAreaKt$PromptArea$focusRequester$1	I
/*      */     //   562	11	18	value$iv	Ljava/lang/Object;
/*      */     //   539	40	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   536	43	16	it$iv	Ljava/lang/Object;
/*      */     //   527	54	15	$i$f$cache	I
/*      */     //   524	57	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   524	57	14	invalid$iv	Z
/*      */     //   647	13	18	$i$a$-cache-PromptAreaKt$PromptArea$1	I
/*      */     //   665	11	19	value$iv	Ljava/lang/Object;
/*      */     //   631	51	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   628	54	16	it$iv	Ljava/lang/Object;
/*      */     //   619	65	15	$i$f$cache	I
/*      */     //   616	68	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   616	68	14	invalid$iv	Z
/*      */     //   759	7	18	$i$a$-cache-PromptAreaKt$PromptArea$2	I
/*      */     //   771	11	19	value$iv	Ljava/lang/Object;
/*      */     //   743	45	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   740	48	16	it$iv	Ljava/lang/Object;
/*      */     //   731	59	15	$i$f$cache	I
/*      */     //   728	62	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   728	62	14	invalid$iv	Z
/*      */     //   823	6	13	$i$f$getDp	I
/*      */     //   820	9	12	$this$dp$iv	I
/*      */     //   867	6	14	$i$f$getDp	I
/*      */     //   864	9	13	$this$dp$iv	I
/*      */     //   896	6	14	$i$f$getDp	I
/*      */     //   893	9	13	$this$dp$iv	I
/*      */     //   943	6	13	$i$f$getDp	I
/*      */     //   940	9	12	$this$dp$iv	I
/*      */     //   1355	29	42	$i$f$getCurrent	I
/*      */     //   1352	32	40	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*      */     //   1352	32	41	$changed$iv	I
/*      */     //   1404	9	42	$i$f$times-u2uoSUM	I
/*      */     //   1401	12	40	arg0$iv	F
/*      */     //   1401	12	41	other$iv	I
/*      */     //   1423	6	42	$i$f$getDp	I
/*      */     //   1420	9	41	$this$dp$iv	I
/*      */     //   1478	10	49	$i$a$-cache-PromptAreaKt$PromptArea$3$hasFocusEventSent$2	I
/*      */     //   1490	11	49	value$iv	Ljava/lang/Object;
/*      */     //   1464	43	48	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1461	46	47	it$iv	Ljava/lang/Object;
/*      */     //   1452	57	46	$i$f$cache	I
/*      */     //   1449	60	43	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1449	60	45	invalid$iv	Z
/*      */     //   1572	10	50	$i$a$-cache-PromptAreaKt$PromptArea$3$hasInputEventSent$2	I
/*      */     //   1584	11	50	value$iv	Ljava/lang/Object;
/*      */     //   1558	43	49	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1555	46	48	it$iv	Ljava/lang/Object;
/*      */     //   1546	57	47	$i$f$cache	I
/*      */     //   1543	60	45	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1543	60	46	invalid$iv	Z
/*      */     //   1729	7	50	$i$a$-cache-PromptAreaKt$PromptArea$3$1	I
/*      */     //   1748	11	55	value$iv	Ljava/lang/Object;
/*      */     //   1704	61	49	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1701	64	48	it$iv	Ljava/lang/Object;
/*      */     //   1692	75	47	$i$f$cache	I
/*      */     //   1689	78	45	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1689	78	46	invalid$iv	Z
/*      */     //   1878	8	50	$i$a$-cache-PromptAreaKt$PromptArea$3$2	I
/*      */     //   1898	11	55	value$iv	Ljava/lang/Object;
/*      */     //   1853	62	49	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1850	65	48	it$iv	Ljava/lang/Object;
/*      */     //   1841	76	47	$i$f$cache	I
/*      */     //   1838	79	45	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1838	79	46	invalid$iv	Z
/*      */     //   2072	18	50	$i$a$-cache-PromptAreaKt$PromptArea$3$3	I
/*      */     //   2102	11	55	value$iv	Ljava/lang/Object;
/*      */     //   2047	72	49	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   2044	75	48	it$iv	Ljava/lang/Object;
/*      */     //   2035	86	47	$i$f$cache	I
/*      */     //   2032	89	45	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   2032	89	46	invalid$iv	Z
/*      */     //   2184	6	45	$i$f$getDp	I
/*      */     //   2181	9	43	$this$dp$iv	I
/*      */     //   1333	925	38	$i$a$-Column-PromptAreaKt$PromptArea$3	I
/*      */     //   1341	917	39	textAreaState	Landroidx/compose/foundation/text/input/TextFieldState;
/*      */     //   1415	843	44	minTextAreaHeight	F
/*      */     //   1431	827	40	maxTextAreaHeight	F
/*      */     //   1525	733	41	hasFocusEventSent$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   1619	639	42	hasInputEventSent$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   1330	928	37	$this$PromptArea_u24lambda_u2418	Landroidx/compose/foundation/layout/ColumnScope;
/*      */     //   1330	928	36	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   1330	928	35	$changed	I
/*      */     //   1294	969	34	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*      */     //   1291	972	33	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1291	972	32	$changed$iv	I
/*      */     //   1205	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   1202	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1198	64	29	$i$f$set-impl	I
/*      */     //   1195	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   1161	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   1158	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1088	1188	25	$i$f$ReusableComposeNode	I
/*      */     //   1085	1191	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   1085	1191	24	$changed$iv$iv$iv	I
/*      */     //   1025	1257	19	$i$f$Layout	I
/*      */     //   1044	1238	20	compositeKeyHash$iv$iv	I
/*      */     //   1053	1229	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1062	1220	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1022	1260	18	$changed$iv$iv	I
/*      */     //   961	1327	16	$i$f$Column	I
/*      */     //   1012	1276	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   958	1330	12	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   978	1310	13	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*      */     //   986	1302	14	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*      */     //   958	1330	15	$changed$iv	I
/*      */     //   507	1790	10	hasFocus$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   597	1700	11	focusRequester	Landroidx/compose/ui/focus/FocusRequester;
/*      */     //   41	2304	9	$dirty	I
/*      */     //   0	2345	0	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	2345	1	enabled	Z
/*      */     //   0	2345	2	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;
/*      */     //   0	2345	3	placeholder	Lkotlin/jvm/functions/Function1;
/*      */     //   0	2345	4	currentPromptMode	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;
/*      */     //   0	2345	5	onPromptModeChange	Lkotlin/jvm/functions/Function1;
/*      */     //   0	2345	6	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	2345	7	$changed	I
/*      */   }
/*      */   
/*   61 */   private static final boolean PromptArea$lambda$1(MutableState $hasFocus$delegate) { State state = (State)$hasFocus$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1028 */       (Boolean)state.getValue()).booleanValue(); } private static final void PromptArea$lambda$2(MutableState $hasFocus$delegate, boolean <set-?>) { MutableState mutableState = $hasFocus$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 1029 */     mutableState.setValue(value$iv); } @DebugMetadata(f = "PromptArea.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptAreaKt$PromptArea$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class PromptAreaKt$PromptArea$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label; PromptAreaKt$PromptArea$1$1(FocusRequester $focusRequester, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.$focusRequester.requestFocus(); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super PromptAreaKt$PromptArea$1$1> $completion) { return (Continuation<Unit>)new PromptAreaKt$PromptArea$1$1(this.$focusRequester, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((PromptAreaKt$PromptArea$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final Unit PromptArea$lambda$6$lambda$5(MutableState<Boolean> $hasFocus$delegate, FocusState focusState) { Intrinsics.checkNotNullParameter(focusState, "focusState"); PromptArea$lambda$2($hasFocus$delegate, focusState.getHasFocus()); return Unit.INSTANCE; }
/* 1031 */   private static final boolean PromptArea$lambda$18$lambda$8(MutableState $hasFocusEventSent$delegate) { State state = (State)$hasFocusEventSent$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void PromptArea$lambda$18$lambda$9(MutableState $hasFocusEventSent$delegate, boolean <set-?>) { MutableState mutableState = $hasFocusEventSent$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 1032 */     mutableState.setValue(value$iv); } private static final boolean PromptArea$lambda$18$lambda$11(MutableState $hasInputEventSent$delegate) { State state = (State)$hasInputEventSent$delegate; Object object = null; KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 1034 */     return ((Boolean)state.getValue()).booleanValue(); } private static final Unit PromptArea$lambda$18$lambda$14$lambda$13(TextFieldState $textAreaState, DataProviderContext $this$provideData) { Intrinsics.checkNotNullParameter($this$provideData, "$this$provideData"); $this$provideData.set(PlatformDataKeys.PREDEFINED_TEXT.getName(), UtilsKt.substring-72CqOWE($textAreaState.getSelection-d9O1mEE(), $textAreaState.getText())); return Unit.INSTANCE; } private static final Unit PromptArea$lambda$18$lambda$16$lambda$15(PromptOwnerViewModel $model, MutableState<Boolean> $hasFocusEventSent$delegate, FocusState state) { Intrinsics.checkNotNullParameter(state, "state"); if (state.isFocused() && !PromptArea$lambda$18$lambda$8($hasFocusEventSent$delegate)) { CompositeUiAction.INSTANCE.logTaskDescriptionFocus($model instanceof com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowupViewModel); PromptArea$lambda$18$lambda$9($hasFocusEventSent$delegate, true); }  return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nPromptArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptArea$3$3$1\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,472:1\n175#2,8:473\n*S KotlinDebug\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptArea$3$3$1\n*L\n112#1:473,8\n*E\n"}) static final class PromptAreaKt$PromptArea$3$3$1 implements Function1<KeyEvent, Boolean> {
/* 1035 */     public final Boolean invoke-ZmokQxo(Object keyEvent) { Intrinsics.checkNotNullParameter(keyEvent, "keyEvent"); if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(keyEvent), KeyEventType.Companion.getKeyDown-CS__XNY()) && !PromptAreaKt.PromptArea$lambda$18$lambda$11(this.$hasInputEventSent$delegate)) { CompositeUiAction.INSTANCE.logTaskDescriptionInput(this.$model instanceof com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowupViewModel); PromptAreaKt.PromptArea$lambda$18$lambda$12(this.$hasInputEventSent$delegate, true); }  if (!this.$enabled) return Boolean.valueOf(false);  if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(keyEvent), KeyEventType.Companion.getKeyDown-CS__XNY())) { if (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(keyEvent), Key.Companion.getEnter-EK5gGoQ()) && KeyEvent_desktopKt.isShiftPressed-ZmokQxo(keyEvent)) { TextFieldState textFieldState1 = this.$textAreaState, textFieldState2 = this.$textAreaState; int $i$f$edit = 0; TextFieldBuffer mutableValue$iv = textFieldState1.startEdit(); try { TextFieldBuffer $this$invoke_ZmokQxo_u24lambda_u240 = mutableValue$iv; int $i$a$-edit-PromptAreaKt$PromptArea$3$3$1$1 = 0; int start = TextRange.getStart-impl($this$invoke_ZmokQxo_u24lambda_u240.getSelection-d9O1mEE()); int end = TextRange.getEnd-impl($this$invoke_ZmokQxo_u24lambda_u240.getSelection-d9O1mEE()); $this$invoke_ZmokQxo_u24lambda_u240.replace(start, end, "\n"); $this$invoke_ZmokQxo_u24lambda_u240.placeCursorAfterCharAt(RangesKt.coerceIn(start, (ClosedRange)new IntRange(0, textFieldState2.getText().length()))); textFieldState1.commitEdit(mutableValue$iv); } finally { textFieldState1.finishEditing(); }  return Boolean.valueOf(true); }  if (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(keyEvent), Key.Companion.getEnter-EK5gGoQ())) { this.$model.submitTask(this.$currentPromptMode); return Boolean.valueOf(true); }  }  return Boolean.valueOf(false); } PromptAreaKt$PromptArea$3$3$1(PromptOwnerViewModel $model, boolean $enabled, TextFieldState $textAreaState, PromptMode $currentPromptMode, MutableState<Boolean> $hasInputEventSent$delegate) {} } private static final void PromptArea$lambda$18$lambda$12(MutableState $hasInputEventSent$delegate, boolean <set-?>) { MutableState mutableState = $hasInputEventSent$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); }
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class PromptAreaKt$PromptArea$3$4 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1303348208, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptArea.<anonymous>.<anonymous> (PromptArea.kt:130)");  String text = (String)this.$placeholder.invoke(this.$currentPromptMode); if ((((CharSequence)text).length() > 0)) { TextAreaStyle style = JewelThemeKt.getTextAreaStyle(JewelTheme.Companion, $composer, 6); TextKt.Text-bAzTDeA(text, null, style.getColors().getPlaceholder-0d7_KjU(), 0L, null, null, MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable), 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65466); }  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } PromptAreaKt$PromptArea$3$4(Function1<PromptMode, String> $placeholder, PromptMode $currentPromptMode) {} } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void PromptFiles(@Nullable Modifier modifier, @NotNull AttachedFilesViewModel model, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc 'model'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_2
/*      */     //   7: ldc_w -120396047
/*      */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   15: astore_2
/*      */     //   16: iload_3
/*      */     //   17: istore #5
/*      */     //   19: iload #4
/*      */     //   21: iconst_1
/*      */     //   22: iand
/*      */     //   23: ifeq -> 36
/*      */     //   26: iload #5
/*      */     //   28: bipush #6
/*      */     //   30: ior
/*      */     //   31: istore #5
/*      */     //   33: goto -> 63
/*      */     //   36: iload_3
/*      */     //   37: bipush #6
/*      */     //   39: iand
/*      */     //   40: ifne -> 63
/*      */     //   43: iload #5
/*      */     //   45: aload_2
/*      */     //   46: aload_0
/*      */     //   47: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   52: ifeq -> 59
/*      */     //   55: iconst_4
/*      */     //   56: goto -> 60
/*      */     //   59: iconst_2
/*      */     //   60: ior
/*      */     //   61: istore #5
/*      */     //   63: iload #4
/*      */     //   65: iconst_2
/*      */     //   66: iand
/*      */     //   67: ifeq -> 80
/*      */     //   70: iload #5
/*      */     //   72: bipush #48
/*      */     //   74: ior
/*      */     //   75: istore #5
/*      */     //   77: goto -> 109
/*      */     //   80: iload_3
/*      */     //   81: bipush #48
/*      */     //   83: iand
/*      */     //   84: ifne -> 109
/*      */     //   87: iload #5
/*      */     //   89: aload_2
/*      */     //   90: aload_1
/*      */     //   91: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   96: ifeq -> 104
/*      */     //   99: bipush #32
/*      */     //   101: goto -> 106
/*      */     //   104: bipush #16
/*      */     //   106: ior
/*      */     //   107: istore #5
/*      */     //   109: iload #5
/*      */     //   111: bipush #19
/*      */     //   113: iand
/*      */     //   114: bipush #18
/*      */     //   116: if_icmpne -> 128
/*      */     //   119: aload_2
/*      */     //   120: invokeinterface getSkipping : ()Z
/*      */     //   125: ifne -> 310
/*      */     //   128: iload #4
/*      */     //   130: iconst_1
/*      */     //   131: iand
/*      */     //   132: ifeq -> 142
/*      */     //   135: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   138: checkcast androidx/compose/ui/Modifier
/*      */     //   141: astore_0
/*      */     //   142: invokestatic isTraceInProgress : ()Z
/*      */     //   145: ifeq -> 160
/*      */     //   148: ldc_w -120396047
/*      */     //   151: iload #5
/*      */     //   153: iconst_m1
/*      */     //   154: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptFiles (PromptArea.kt:153)'
/*      */     //   157: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   160: aload_1
/*      */     //   161: invokevirtual getAttachedFiles : ()Lkotlinx/coroutines/flow/StateFlow;
/*      */     //   164: aconst_null
/*      */     //   165: aload_2
/*      */     //   166: iconst_0
/*      */     //   167: iconst_1
/*      */     //   168: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*      */     //   171: astore #6
/*      */     //   173: aload #6
/*      */     //   175: invokestatic PromptFiles$lambda$20 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*      */     //   178: invokeinterface isEmpty : ()Z
/*      */     //   183: ifeq -> 225
/*      */     //   186: invokestatic isTraceInProgress : ()Z
/*      */     //   189: ifeq -> 195
/*      */     //   192: invokestatic traceEventEnd : ()V
/*      */     //   195: aload_2
/*      */     //   196: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   201: dup
/*      */     //   202: ifnull -> 223
/*      */     //   205: aload_0
/*      */     //   206: aload_1
/*      */     //   207: iload_3
/*      */     //   208: iload #4
/*      */     //   210: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;II)Lkotlin/jvm/functions/Function2;
/*      */     //   215: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   220: goto -> 224
/*      */     //   223: pop
/*      */     //   224: return
/*      */     //   225: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*      */     //   228: bipush #12
/*      */     //   230: istore #8
/*      */     //   232: iconst_0
/*      */     //   233: istore #9
/*      */     //   235: iload #8
/*      */     //   237: i2f
/*      */     //   238: invokestatic constructor-impl : (F)F
/*      */     //   241: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*      */     //   244: astore #7
/*      */     //   246: aload_0
/*      */     //   247: aload #7
/*      */     //   249: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*      */     //   252: aload #7
/*      */     //   254: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*      */     //   257: iconst_0
/*      */     //   258: iconst_0
/*      */     //   259: aconst_null
/*      */     //   260: ldc_w -2139235754
/*      */     //   263: iconst_1
/*      */     //   264: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptFiles$2
/*      */     //   267: dup
/*      */     //   268: aload_1
/*      */     //   269: aload #6
/*      */     //   271: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;Landroidx/compose/runtime/State;)V
/*      */     //   274: aload_2
/*      */     //   275: bipush #54
/*      */     //   277: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   280: checkcast kotlin/jvm/functions/Function3
/*      */     //   283: aload_2
/*      */     //   284: ldc_w 1573296
/*      */     //   287: bipush #14
/*      */     //   289: iload #5
/*      */     //   291: iand
/*      */     //   292: ior
/*      */     //   293: bipush #56
/*      */     //   295: invokestatic FlowRow : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*      */     //   298: invokestatic isTraceInProgress : ()Z
/*      */     //   301: ifeq -> 316
/*      */     //   304: invokestatic traceEventEnd : ()V
/*      */     //   307: goto -> 316
/*      */     //   310: aload_2
/*      */     //   311: invokeinterface skipToGroupEnd : ()V
/*      */     //   316: aload_2
/*      */     //   317: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   322: dup
/*      */     //   323: ifnull -> 344
/*      */     //   326: aload_0
/*      */     //   327: aload_1
/*      */     //   328: iload_3
/*      */     //   329: iload #4
/*      */     //   331: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;II)Lkotlin/jvm/functions/Function2;
/*      */     //   336: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   341: goto -> 345
/*      */     //   344: pop
/*      */     //   345: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #154	-> 6
/*      */     //   #152	-> 135
/*      */     //   #154	-> 157
/*      */     //   #155	-> 160
/*      */     //   #156	-> 173
/*      */     //   #157	-> 224
/*      */     //   #160	-> 225
/*      */     //   #575	-> 235
/*      */     //   #160	-> 241
/*      */     //   #162	-> 246
/*      */     //   #167	-> 310
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   235	6	9	$i$f$getDp	I
/*      */     //   232	9	8	$this$dp$iv	I
/*      */     //   173	134	6	attachedFiles$delegate	Landroidx/compose/runtime/State;
/*      */     //   246	61	7	gap	Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*      */     //   19	327	5	$dirty	I
/*      */     //   0	346	0	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	346	1	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*      */     //   0	346	2	$composer	Landroidx/compose/runtime/Composer;
/* 1037 */     //   0	346	3	$changed	I } private static final List<AttachedFile> PromptFiles$lambda$20(State $attachedFiles$delegate) { State state = $attachedFiles$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (List<AttachedFile>)state.getValue(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class PromptAreaKt$PromptFiles$2 implements Function3<FlowRowScope, Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(FlowRowScope $this$FlowRow, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$FlowRow, "$this$FlowRow"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2139235754, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptFiles.<anonymous> (PromptArea.kt:162)");  for (AttachedFile file : PromptAreaKt.PromptFiles$lambda$20(this.$attachedFiles$delegate)) PromptAreaKt.FileLine(file, this.$model, $composer, 0);  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } PromptAreaKt$PromptFiles$2(AttachedFilesViewModel $model, State<List<AttachedFile>> $attachedFiles$delegate) {} } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void FileLine(AttachedFile file, AttachedFilesViewModel model, Composer $composer, int $changed) { // Byte code:
/*      */     //   0: aload_2
/*      */     //   1: ldc_w 899231649
/*      */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   9: astore_2
/*      */     //   10: iload_3
/*      */     //   11: istore #4
/*      */     //   13: iload_3
/*      */     //   14: bipush #6
/*      */     //   16: iand
/*      */     //   17: ifne -> 40
/*      */     //   20: iload #4
/*      */     //   22: aload_2
/*      */     //   23: aload_0
/*      */     //   24: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   29: ifeq -> 36
/*      */     //   32: iconst_4
/*      */     //   33: goto -> 37
/*      */     //   36: iconst_2
/*      */     //   37: ior
/*      */     //   38: istore #4
/*      */     //   40: iload_3
/*      */     //   41: bipush #48
/*      */     //   43: iand
/*      */     //   44: ifne -> 69
/*      */     //   47: iload #4
/*      */     //   49: aload_2
/*      */     //   50: aload_1
/*      */     //   51: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   56: ifeq -> 64
/*      */     //   59: bipush #32
/*      */     //   61: goto -> 66
/*      */     //   64: bipush #16
/*      */     //   66: ior
/*      */     //   67: istore #4
/*      */     //   69: iload #4
/*      */     //   71: bipush #19
/*      */     //   73: iand
/*      */     //   74: bipush #18
/*      */     //   76: if_icmpne -> 88
/*      */     //   79: aload_2
/*      */     //   80: invokeinterface getSkipping : ()Z
/*      */     //   85: ifne -> 1264
/*      */     //   88: invokestatic isTraceInProgress : ()Z
/*      */     //   91: ifeq -> 106
/*      */     //   94: ldc_w 899231649
/*      */     //   97: iload #4
/*      */     //   99: iconst_m1
/*      */     //   100: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.FileLine (PromptArea.kt:170)'
/*      */     //   103: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   106: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   109: checkcast androidx/compose/ui/Modifier
/*      */     //   112: bipush #10
/*      */     //   114: istore #5
/*      */     //   116: iconst_0
/*      */     //   117: istore #6
/*      */     //   119: iload #5
/*      */     //   121: i2f
/*      */     //   122: invokestatic constructor-impl : (F)F
/*      */     //   125: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*      */     //   128: checkcast androidx/compose/ui/graphics/Shape
/*      */     //   131: invokestatic clip : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*      */     //   134: aload_2
/*      */     //   135: iconst_0
/*      */     //   136: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*      */     //   139: invokevirtual getFileComponentBackground-0d7_KjU : ()J
/*      */     //   142: aconst_null
/*      */     //   143: iconst_2
/*      */     //   144: aconst_null
/*      */     //   145: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   148: astore #5
/*      */     //   150: iconst_0
/*      */     //   151: istore #8
/*      */     //   153: iconst_0
/*      */     //   154: istore #9
/*      */     //   156: aload_2
/*      */     //   157: ldc_w 733328855
/*      */     //   160: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   163: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   166: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   169: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   172: astore #6
/*      */     //   174: iconst_0
/*      */     //   175: istore #7
/*      */     //   177: aload #6
/*      */     //   179: iload #7
/*      */     //   181: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   184: astore #10
/*      */     //   186: bipush #112
/*      */     //   188: iload #8
/*      */     //   190: iconst_3
/*      */     //   191: ishl
/*      */     //   192: iand
/*      */     //   193: istore #11
/*      */     //   195: nop
/*      */     //   196: iconst_0
/*      */     //   197: istore #12
/*      */     //   199: aload_2
/*      */     //   200: ldc_w -1323940314
/*      */     //   203: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   206: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   209: aload_2
/*      */     //   210: iconst_0
/*      */     //   211: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   214: istore #13
/*      */     //   216: aload_2
/*      */     //   217: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   222: astore #14
/*      */     //   224: aload_2
/*      */     //   225: aload #5
/*      */     //   227: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   230: astore #15
/*      */     //   232: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   235: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   238: astore #16
/*      */     //   240: bipush #6
/*      */     //   242: sipush #896
/*      */     //   245: iload #11
/*      */     //   247: bipush #6
/*      */     //   249: ishl
/*      */     //   250: iand
/*      */     //   251: ior
/*      */     //   252: istore #17
/*      */     //   254: nop
/*      */     //   255: iconst_0
/*      */     //   256: istore #18
/*      */     //   258: aload_2
/*      */     //   259: ldc_w -692256719
/*      */     //   262: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   265: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   268: aload_2
/*      */     //   269: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   274: instanceof androidx/compose/runtime/Applier
/*      */     //   277: ifne -> 283
/*      */     //   280: invokestatic invalidApplier : ()V
/*      */     //   283: aload_2
/*      */     //   284: invokeinterface startReusableNode : ()V
/*      */     //   289: aload_2
/*      */     //   290: invokeinterface getInserting : ()Z
/*      */     //   295: ifeq -> 309
/*      */     //   298: aload_2
/*      */     //   299: aload #16
/*      */     //   301: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   306: goto -> 315
/*      */     //   309: aload_2
/*      */     //   310: invokeinterface useNode : ()V
/*      */     //   315: aload_2
/*      */     //   316: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   319: astore #19
/*      */     //   321: iconst_0
/*      */     //   322: istore #20
/*      */     //   324: aload #19
/*      */     //   326: aload #10
/*      */     //   328: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   331: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   334: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   337: aload #19
/*      */     //   339: aload #14
/*      */     //   341: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   344: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   347: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   350: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   353: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   356: astore #21
/*      */     //   358: iconst_0
/*      */     //   359: istore #22
/*      */     //   361: aload #19
/*      */     //   363: astore #23
/*      */     //   365: iconst_0
/*      */     //   366: istore #24
/*      */     //   368: aload #23
/*      */     //   370: invokeinterface getInserting : ()Z
/*      */     //   375: ifne -> 396
/*      */     //   378: aload #23
/*      */     //   380: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   385: iload #13
/*      */     //   387: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   390: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   393: ifne -> 422
/*      */     //   396: aload #23
/*      */     //   398: iload #13
/*      */     //   400: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   403: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   408: aload #19
/*      */     //   410: iload #13
/*      */     //   412: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   415: aload #21
/*      */     //   417: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   422: nop
/*      */     //   423: nop
/*      */     //   424: nop
/*      */     //   425: aload #19
/*      */     //   427: aload #15
/*      */     //   429: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   432: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   435: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   438: nop
/*      */     //   439: nop
/*      */     //   440: aload_2
/*      */     //   441: bipush #14
/*      */     //   443: iload #17
/*      */     //   445: bipush #6
/*      */     //   447: ishr
/*      */     //   448: iand
/*      */     //   449: istore #25
/*      */     //   451: astore #26
/*      */     //   453: iconst_0
/*      */     //   454: istore #27
/*      */     //   456: aload #26
/*      */     //   458: ldc_w -2146769399
/*      */     //   461: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   464: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   467: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   470: aload #26
/*      */     //   472: bipush #6
/*      */     //   474: bipush #112
/*      */     //   476: iload #8
/*      */     //   478: bipush #6
/*      */     //   480: ishr
/*      */     //   481: iand
/*      */     //   482: ior
/*      */     //   483: istore #28
/*      */     //   485: astore #29
/*      */     //   487: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   490: astore #30
/*      */     //   492: iconst_0
/*      */     //   493: istore #31
/*      */     //   495: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   498: checkcast androidx/compose/ui/Modifier
/*      */     //   501: bipush #7
/*      */     //   503: istore #32
/*      */     //   505: iconst_0
/*      */     //   506: istore #33
/*      */     //   508: iload #32
/*      */     //   510: i2f
/*      */     //   511: invokestatic constructor-impl : (F)F
/*      */     //   514: iconst_2
/*      */     //   515: istore #32
/*      */     //   517: iconst_0
/*      */     //   518: istore #33
/*      */     //   520: iload #32
/*      */     //   522: i2f
/*      */     //   523: invokestatic constructor-impl : (F)F
/*      */     //   526: invokestatic padding-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*      */     //   529: astore #32
/*      */     //   531: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   534: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*      */     //   537: astore #34
/*      */     //   539: sipush #390
/*      */     //   542: istore #35
/*      */     //   544: iconst_0
/*      */     //   545: istore #36
/*      */     //   547: aload #29
/*      */     //   549: ldc_w 693286680
/*      */     //   552: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*      */     //   555: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   558: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*      */     //   561: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*      */     //   564: astore #33
/*      */     //   566: aload #33
/*      */     //   568: aload #34
/*      */     //   570: aload #29
/*      */     //   572: bipush #14
/*      */     //   574: iload #35
/*      */     //   576: iconst_3
/*      */     //   577: ishr
/*      */     //   578: iand
/*      */     //   579: bipush #112
/*      */     //   581: iload #35
/*      */     //   583: iconst_3
/*      */     //   584: ishr
/*      */     //   585: iand
/*      */     //   586: ior
/*      */     //   587: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   590: astore #37
/*      */     //   592: bipush #112
/*      */     //   594: iload #35
/*      */     //   596: iconst_3
/*      */     //   597: ishl
/*      */     //   598: iand
/*      */     //   599: istore #38
/*      */     //   601: nop
/*      */     //   602: iconst_0
/*      */     //   603: istore #39
/*      */     //   605: aload #29
/*      */     //   607: ldc_w -1323940314
/*      */     //   610: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   613: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   616: aload #29
/*      */     //   618: iconst_0
/*      */     //   619: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   622: istore #40
/*      */     //   624: aload #29
/*      */     //   626: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   631: astore #41
/*      */     //   633: aload #29
/*      */     //   635: aload #32
/*      */     //   637: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   640: astore #42
/*      */     //   642: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   645: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   648: astore #43
/*      */     //   650: bipush #6
/*      */     //   652: sipush #896
/*      */     //   655: iload #38
/*      */     //   657: bipush #6
/*      */     //   659: ishl
/*      */     //   660: iand
/*      */     //   661: ior
/*      */     //   662: istore #44
/*      */     //   664: nop
/*      */     //   665: iconst_0
/*      */     //   666: istore #45
/*      */     //   668: aload #29
/*      */     //   670: ldc_w -692256719
/*      */     //   673: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   676: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   679: aload #29
/*      */     //   681: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   686: instanceof androidx/compose/runtime/Applier
/*      */     //   689: ifne -> 695
/*      */     //   692: invokestatic invalidApplier : ()V
/*      */     //   695: aload #29
/*      */     //   697: invokeinterface startReusableNode : ()V
/*      */     //   702: aload #29
/*      */     //   704: invokeinterface getInserting : ()Z
/*      */     //   709: ifeq -> 724
/*      */     //   712: aload #29
/*      */     //   714: aload #43
/*      */     //   716: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   721: goto -> 731
/*      */     //   724: aload #29
/*      */     //   726: invokeinterface useNode : ()V
/*      */     //   731: aload #29
/*      */     //   733: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   736: astore #46
/*      */     //   738: iconst_0
/*      */     //   739: istore #47
/*      */     //   741: aload #46
/*      */     //   743: aload #37
/*      */     //   745: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   748: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   751: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   754: aload #46
/*      */     //   756: aload #41
/*      */     //   758: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   761: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   764: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   767: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   770: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   773: astore #48
/*      */     //   775: iconst_0
/*      */     //   776: istore #49
/*      */     //   778: aload #46
/*      */     //   780: astore #50
/*      */     //   782: iconst_0
/*      */     //   783: istore #51
/*      */     //   785: aload #50
/*      */     //   787: invokeinterface getInserting : ()Z
/*      */     //   792: ifne -> 813
/*      */     //   795: aload #50
/*      */     //   797: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   802: iload #40
/*      */     //   804: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   807: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   810: ifne -> 839
/*      */     //   813: aload #50
/*      */     //   815: iload #40
/*      */     //   817: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   820: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   825: aload #46
/*      */     //   827: iload #40
/*      */     //   829: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   832: aload #48
/*      */     //   834: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   839: nop
/*      */     //   840: nop
/*      */     //   841: nop
/*      */     //   842: aload #46
/*      */     //   844: aload #42
/*      */     //   846: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   849: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   852: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   855: nop
/*      */     //   856: nop
/*      */     //   857: aload #29
/*      */     //   859: bipush #14
/*      */     //   861: iload #44
/*      */     //   863: bipush #6
/*      */     //   865: ishr
/*      */     //   866: iand
/*      */     //   867: istore #52
/*      */     //   869: astore #53
/*      */     //   871: iconst_0
/*      */     //   872: istore #54
/*      */     //   874: aload #53
/*      */     //   876: ldc_w -407840262
/*      */     //   879: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*      */     //   882: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   885: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*      */     //   888: aload #53
/*      */     //   890: bipush #6
/*      */     //   892: bipush #112
/*      */     //   894: iload #35
/*      */     //   896: bipush #6
/*      */     //   898: ishr
/*      */     //   899: iand
/*      */     //   900: ior
/*      */     //   901: istore #55
/*      */     //   903: astore #56
/*      */     //   905: checkcast androidx/compose/foundation/layout/RowScope
/*      */     //   908: astore #57
/*      */     //   910: iconst_0
/*      */     //   911: istore #58
/*      */     //   913: ldc_w -1095491681
/*      */     //   916: iconst_1
/*      */     //   917: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$FileLine$1$1$1
/*      */     //   920: dup
/*      */     //   921: aload_0
/*      */     //   922: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;)V
/*      */     //   925: aload #56
/*      */     //   927: bipush #54
/*      */     //   929: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   932: checkcast kotlin/jvm/functions/Function2
/*      */     //   935: aconst_null
/*      */     //   936: iconst_0
/*      */     //   937: aconst_null
/*      */     //   938: aconst_null
/*      */     //   939: ldc_w -249233756
/*      */     //   942: iconst_1
/*      */     //   943: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$FileLine$1$1$2
/*      */     //   946: dup
/*      */     //   947: aload_0
/*      */     //   948: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;)V
/*      */     //   951: aload #56
/*      */     //   953: bipush #54
/*      */     //   955: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   958: checkcast kotlin/jvm/functions/Function2
/*      */     //   961: aload #56
/*      */     //   963: ldc_w 196614
/*      */     //   966: bipush #30
/*      */     //   968: invokestatic Tooltip : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/TooltipStyle;Landroidx/compose/foundation/TooltipPlacement;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*      */     //   971: aload #56
/*      */     //   973: ldc_w 429455587
/*      */     //   976: invokeinterface startReplaceGroup : (I)V
/*      */     //   981: aload_1
/*      */     //   982: invokevirtual isEditable : ()Z
/*      */     //   985: ifeq -> 1187
/*      */     //   988: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   991: checkcast androidx/compose/ui/Modifier
/*      */     //   994: iconst_4
/*      */     //   995: istore #59
/*      */     //   997: iconst_0
/*      */     //   998: istore #60
/*      */     //   1000: iload #59
/*      */     //   1002: i2f
/*      */     //   1003: invokestatic constructor-impl : (F)F
/*      */     //   1006: fconst_0
/*      */     //   1007: fconst_0
/*      */     //   1008: fconst_0
/*      */     //   1009: bipush #14
/*      */     //   1011: aconst_null
/*      */     //   1012: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1015: iconst_0
/*      */     //   1016: aconst_null
/*      */     //   1017: aconst_null
/*      */     //   1018: aload #56
/*      */     //   1020: ldc_w 429460145
/*      */     //   1023: invokeinterface startReplaceGroup : (I)V
/*      */     //   1028: aload #56
/*      */     //   1030: astore #60
/*      */     //   1032: aload_2
/*      */     //   1033: aload_1
/*      */     //   1034: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1039: aload_2
/*      */     //   1040: aload_0
/*      */     //   1041: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1046: ior
/*      */     //   1047: istore #61
/*      */     //   1049: nop
/*      */     //   1050: iconst_0
/*      */     //   1051: istore #62
/*      */     //   1053: aload #60
/*      */     //   1055: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1060: astore #63
/*      */     //   1062: iconst_0
/*      */     //   1063: istore #64
/*      */     //   1065: iload #61
/*      */     //   1067: ifne -> 1081
/*      */     //   1070: aload #63
/*      */     //   1072: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1075: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1078: if_acmpne -> 1127
/*      */     //   1081: astore #65
/*      */     //   1083: astore #66
/*      */     //   1085: istore #67
/*      */     //   1087: astore #68
/*      */     //   1089: iconst_0
/*      */     //   1090: istore #69
/*      */     //   1092: aload_1
/*      */     //   1093: aload_0
/*      */     //   1094: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;)Lkotlin/jvm/functions/Function0;
/*      */     //   1099: astore #70
/*      */     //   1101: aload #68
/*      */     //   1103: iload #67
/*      */     //   1105: aload #66
/*      */     //   1107: aload #65
/*      */     //   1109: aload #70
/*      */     //   1111: astore #71
/*      */     //   1113: aload #60
/*      */     //   1115: aload #71
/*      */     //   1117: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1122: aload #71
/*      */     //   1124: goto -> 1129
/*      */     //   1127: aload #63
/*      */     //   1129: nop
/*      */     //   1130: nop
/*      */     //   1131: nop
/*      */     //   1132: checkcast kotlin/jvm/functions/Function0
/*      */     //   1135: astore #59
/*      */     //   1137: aload #56
/*      */     //   1139: invokeinterface endReplaceGroup : ()V
/*      */     //   1144: aload #59
/*      */     //   1146: bipush #7
/*      */     //   1148: aconst_null
/*      */     //   1149: invokestatic clickable-XHw0xAI$default : (Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1152: astore #72
/*      */     //   1154: getstatic org/jetbrains/jewel/ui/icons/AllIconsKeys$Windows.INSTANCE : Lorg/jetbrains/jewel/ui/icons/AllIconsKeys$Windows;
/*      */     //   1157: invokevirtual getClose : ()Lorg/jetbrains/jewel/ui/icon/IntelliJIconKey;
/*      */     //   1160: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*      */     //   1163: ldc_w 'Delete File'
/*      */     //   1166: aload #72
/*      */     //   1168: aconst_null
/*      */     //   1169: lconst_0
/*      */     //   1170: iconst_0
/*      */     //   1171: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*      */     //   1174: aload #56
/*      */     //   1176: bipush #48
/*      */     //   1178: getstatic org/jetbrains/jewel/ui/icon/IntelliJIconKey.$stable : I
/*      */     //   1181: ior
/*      */     //   1182: bipush #24
/*      */     //   1184: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*      */     //   1187: aload #56
/*      */     //   1189: invokeinterface endReplaceGroup : ()V
/*      */     //   1194: nop
/*      */     //   1195: aload #53
/*      */     //   1197: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1200: aload #29
/*      */     //   1202: invokeinterface endNode : ()V
/*      */     //   1207: aload #29
/*      */     //   1209: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1212: nop
/*      */     //   1213: aload #29
/*      */     //   1215: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1218: nop
/*      */     //   1219: aload #29
/*      */     //   1221: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1224: nop
/*      */     //   1225: nop
/*      */     //   1226: aload #26
/*      */     //   1228: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1231: aload_2
/*      */     //   1232: invokeinterface endNode : ()V
/*      */     //   1237: aload_2
/*      */     //   1238: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1241: nop
/*      */     //   1242: aload_2
/*      */     //   1243: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1246: nop
/*      */     //   1247: aload_2
/*      */     //   1248: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1251: nop
/*      */     //   1252: invokestatic isTraceInProgress : ()Z
/*      */     //   1255: ifeq -> 1270
/*      */     //   1258: invokestatic traceEventEnd : ()V
/*      */     //   1261: goto -> 1270
/*      */     //   1264: aload_2
/*      */     //   1265: invokeinterface skipToGroupEnd : ()V
/*      */     //   1270: aload_2
/*      */     //   1271: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1276: dup
/*      */     //   1277: ifnull -> 1296
/*      */     //   1280: aload_0
/*      */     //   1281: aload_1
/*      */     //   1282: iload_3
/*      */     //   1283: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;I)Lkotlin/jvm/functions/Function2;
/*      */     //   1288: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1293: goto -> 1297
/*      */     //   1296: pop
/*      */     //   1297: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #171	-> 0
/*      */     //   #172	-> 106
/*      */     //   #576	-> 119
/*      */     //   #172	-> 125
/*      */     //   #577	-> 163
/*      */     //   #578	-> 166
/*      */     //   #579	-> 174
/*      */     //   #582	-> 177
/*      */     //   #583	-> 195
/*      */     //   #584	-> 206
/*      */     //   #585	-> 211
/*      */     //   #586	-> 217
/*      */     //   #587	-> 225
/*      */     //   #589	-> 232
/*      */     //   #588	-> 254
/*      */     //   #590	-> 265
/*      */     //   #591	-> 268
/*      */     //   #592	-> 284
/*      */     //   #593	-> 289
/*      */     //   #594	-> 299
/*      */     //   #596	-> 310
/*      */     //   #598	-> 315
/*      */     //   #599	-> 324
/*      */     //   #600	-> 337
/*      */     //   #602	-> 350
/*      */     //   #603	-> 361
/*      */     //   #604	-> 368
/*      */     //   #605	-> 396
/*      */     //   #606	-> 408
/*      */     //   #608	-> 422
/*      */     //   #603	-> 423
/*      */     //   #608	-> 424
/*      */     //   #609	-> 425
/*      */     //   #610	-> 438
/*      */     //   #598	-> 439
/*      */     //   #611	-> 440
/*      */     //   #612	-> 464
/*      */     //   #173	-> 495
/*      */     //   #613	-> 508
/*      */     //   #173	-> 514
/*      */     //   #613	-> 520
/*      */     //   #173	-> 526
/*      */     //   #614	-> 555
/*      */     //   #615	-> 558
/*      */     //   #619	-> 566
/*      */     //   #620	-> 601
/*      */     //   #621	-> 613
/*      */     //   #622	-> 619
/*      */     //   #623	-> 626
/*      */     //   #624	-> 635
/*      */     //   #626	-> 642
/*      */     //   #625	-> 664
/*      */     //   #627	-> 676
/*      */     //   #628	-> 679
/*      */     //   #629	-> 697
/*      */     //   #630	-> 702
/*      */     //   #631	-> 714
/*      */     //   #633	-> 726
/*      */     //   #635	-> 731
/*      */     //   #636	-> 741
/*      */     //   #637	-> 754
/*      */     //   #639	-> 767
/*      */     //   #640	-> 778
/*      */     //   #641	-> 785
/*      */     //   #642	-> 813
/*      */     //   #643	-> 825
/*      */     //   #645	-> 839
/*      */     //   #640	-> 840
/*      */     //   #645	-> 841
/*      */     //   #646	-> 842
/*      */     //   #647	-> 855
/*      */     //   #635	-> 856
/*      */     //   #648	-> 857
/*      */     //   #649	-> 882
/*      */     //   #174	-> 913
/*      */     //   #184	-> 981
/*      */     //   #186	-> 988
/*      */     //   #187	-> 994
/*      */     //   #650	-> 1000
/*      */     //   #187	-> 1006
/*      */     //   #188	-> 1015
/*      */     //   #189	-> 1049
/*      */     //   #651	-> 1053
/*      */     //   #652	-> 1065
/*      */     //   #653	-> 1081
/*      */     //   #189	-> 1092
/*      */     //   #653	-> 1111
/*      */     //   #654	-> 1113
/*      */     //   #655	-> 1122
/*      */     //   #656	-> 1127
/*      */     //   #652	-> 1129
/*      */     //   #651	-> 1130
/*      */     //   #651	-> 1131
/*      */     //   #189	-> 1132
/*      */     //   #188	-> 1146
/*      */     //   #191	-> 1154
/*      */     //   #192	-> 1163
/*      */     //   #188	-> 1166
/*      */     //   #185	-> 1184
/*      */     //   #195	-> 1194
/*      */     //   #649	-> 1195
/*      */     //   #648	-> 1200
/*      */     //   #657	-> 1202
/*      */     //   #627	-> 1209
/*      */     //   #658	-> 1212
/*      */     //   #621	-> 1215
/*      */     //   #659	-> 1218
/*      */     //   #614	-> 1221
/*      */     //   #660	-> 1224
/*      */     //   #196	-> 1225
/*      */     //   #612	-> 1226
/*      */     //   #611	-> 1231
/*      */     //   #661	-> 1232
/*      */     //   #590	-> 1238
/*      */     //   #662	-> 1241
/*      */     //   #584	-> 1243
/*      */     //   #663	-> 1246
/*      */     //   #577	-> 1248
/*      */     //   #664	-> 1251
/*      */     //   #197	-> 1264
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   119	6	6	$i$f$getDp	I
/*      */     //   116	9	5	$this$dp$iv	I
/*      */     //   508	6	33	$i$f$getDp	I
/*      */     //   505	9	32	$this$dp$iv	I
/*      */     //   520	6	33	$i$f$getDp	I
/*      */     //   517	9	32	$this$dp$iv	I
/*      */     //   1000	6	60	$i$f$getDp	I
/*      */     //   997	9	59	$this$dp$iv	I
/*      */     //   1092	7	69	$i$a$-cache-PromptAreaKt$FileLine$1$1$3	I
/*      */     //   1113	11	71	value$iv	Ljava/lang/Object;
/*      */     //   1065	65	64	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1062	68	63	it$iv	Ljava/lang/Object;
/*      */     //   1053	79	62	$i$f$cache	I
/*      */     //   1050	82	60	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1050	82	61	invalid$iv	Z
/*      */     //   913	282	58	$i$a$-Row-PromptAreaKt$FileLine$1$1	I
/*      */     //   910	285	57	$this$FileLine_u24lambda_u2426_u24lambda_u2425	Landroidx/compose/foundation/layout/RowScope;
/*      */     //   910	285	56	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   910	285	55	$changed	I
/*      */     //   874	326	54	$i$a$-Layout-RowKt$Row$1$iv	I
/*      */     //   871	329	53	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   871	329	52	$changed$iv	I
/*      */     //   785	55	51	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   782	58	50	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   778	64	49	$i$f$set-impl	I
/*      */     //   775	67	48	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   741	115	47	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   738	118	46	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   668	545	45	$i$f$ReusableComposeNode	I
/*      */     //   665	548	43	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   665	548	44	$changed$iv$iv$iv	I
/*      */     //   605	614	39	$i$f$Layout	I
/*      */     //   624	595	40	compositeKeyHash$iv$iv	I
/*      */     //   633	586	41	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   642	577	42	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   602	617	38	$changed$iv$iv	I
/*      */     //   547	678	36	$i$f$Row	I
/*      */     //   592	633	37	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   544	681	32	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   566	659	33	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*      */     //   544	681	34	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*      */     //   544	681	35	$changed$iv	I
/*      */     //   495	731	31	$i$a$-Box-PromptAreaKt$FileLine$1	I
/*      */     //   492	734	30	$this$FileLine_u24lambda_u2426	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   492	734	29	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   492	734	28	$changed	I
/*      */     //   456	775	27	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   453	778	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   453	778	25	$changed$iv	I
/*      */     //   368	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   365	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   361	64	22	$i$f$set-impl	I
/*      */     //   358	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   324	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   321	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   258	984	18	$i$f$ReusableComposeNode	I
/*      */     //   255	987	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   255	987	17	$changed$iv$iv$iv	I
/*      */     //   199	1048	12	$i$f$Layout	I
/*      */     //   216	1031	13	compositeKeyHash$iv$iv	I
/*      */     //   224	1023	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   232	1015	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   196	1051	11	$changed$iv$iv	I
/*      */     //   156	1096	9	$i$f$Box	I
/*      */     //   186	1066	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   153	1099	5	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   174	1078	6	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   177	1075	7	propagateMinConstraints$iv	Z
/*      */     //   153	1099	8	$changed$iv	I
/*      */     //   13	1285	4	$dirty	I
/*      */     //   0	1298	0	file	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;
/*      */     //   0	1298	1	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*      */     //   0	1298	2	$composer	Landroidx/compose/runtime/Composer;
/* 1038 */     //   0	1298	3	$changed	I } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class PromptAreaKt$FileLine$1$1$1 implements Function2<Composer, Integer, Unit> { PromptAreaKt$FileLine$1$1$1(AttachedFile $file) {} @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1095491681, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.FileLine.<anonymous>.<anonymous>.<anonymous> (PromptArea.kt:173)");  TextKt.Text-bAzTDeA(this.$file.getPath().toAbsolutePath().toString(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } } private static final boolean PromptButtons$lambda$28(MutableState $textAreaContentState$delegate) { State state = (State)$textAreaContentState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nPromptArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$FileLine$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,472:1\n149#2:473\n*S KotlinDebug\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$FileLine$1$1$2\n*L\n176#1:473\n*E\n"}) static final class PromptAreaKt$FileLine$1$1$2 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-249233756, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.FileLine.<anonymous>.<anonymous>.<anonymous> (PromptArea.kt:174)");  int $this$dp$iv = 0, $i$f$getDp = 0; $this$dp$iv = 200; $i$f$getDp = 0; Modifier modifier = SizeKt.widthIn-VpY3zN4((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv)); if (this.$file.getShortName() == null) this.$file.getShortName();  String str = ""; FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable); int i = TextOverflow.Companion.getEllipsis-gIe3tQ8(); TextKt.Text-bAzTDeA(str, modifier, 0L, 0L, null, null, fontFamily, 0L, null, 0, 0L, i, false, 1, null, null, $composer, 48, 3120, 55228); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } PromptAreaKt$FileLine$1$1$2(AttachedFile $file) {} } private static final Unit FileLine$lambda$26$lambda$25$lambda$24$lambda$23(AttachedFilesViewModel $model, AttachedFile $file) { $model.removeSelectedContextFile($file.getPath()); return Unit.INSTANCE; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void PromptButtons(PromptOwnerViewModel model, TextFieldState textAreaState, boolean enabled, PromptMode promptMode, Function1 onPromptModeChanged, Composer $composer, int $changed) { // Byte code:
/*      */     //   0: aload #5
/*      */     //   2: ldc_w 2001867728
/*      */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   10: astore #5
/*      */     //   12: iload #6
/*      */     //   14: istore #7
/*      */     //   16: iload #6
/*      */     //   18: bipush #6
/*      */     //   20: iand
/*      */     //   21: ifne -> 64
/*      */     //   24: iload #7
/*      */     //   26: iload #6
/*      */     //   28: bipush #8
/*      */     //   30: iand
/*      */     //   31: ifne -> 45
/*      */     //   34: aload #5
/*      */     //   36: aload_0
/*      */     //   37: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   42: goto -> 53
/*      */     //   45: aload #5
/*      */     //   47: aload_0
/*      */     //   48: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   53: ifeq -> 60
/*      */     //   56: iconst_4
/*      */     //   57: goto -> 61
/*      */     //   60: iconst_2
/*      */     //   61: ior
/*      */     //   62: istore #7
/*      */     //   64: iload #6
/*      */     //   66: bipush #48
/*      */     //   68: iand
/*      */     //   69: ifne -> 95
/*      */     //   72: iload #7
/*      */     //   74: aload #5
/*      */     //   76: aload_1
/*      */     //   77: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   82: ifeq -> 90
/*      */     //   85: bipush #32
/*      */     //   87: goto -> 92
/*      */     //   90: bipush #16
/*      */     //   92: ior
/*      */     //   93: istore #7
/*      */     //   95: iload #6
/*      */     //   97: sipush #384
/*      */     //   100: iand
/*      */     //   101: ifne -> 129
/*      */     //   104: iload #7
/*      */     //   106: aload #5
/*      */     //   108: iload_2
/*      */     //   109: invokeinterface changed : (Z)Z
/*      */     //   114: ifeq -> 123
/*      */     //   117: sipush #256
/*      */     //   120: goto -> 126
/*      */     //   123: sipush #128
/*      */     //   126: ior
/*      */     //   127: istore #7
/*      */     //   129: iload #6
/*      */     //   131: sipush #3072
/*      */     //   134: iand
/*      */     //   135: ifne -> 163
/*      */     //   138: iload #7
/*      */     //   140: aload #5
/*      */     //   142: aload_3
/*      */     //   143: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   148: ifeq -> 157
/*      */     //   151: sipush #2048
/*      */     //   154: goto -> 160
/*      */     //   157: sipush #1024
/*      */     //   160: ior
/*      */     //   161: istore #7
/*      */     //   163: iload #6
/*      */     //   165: sipush #24576
/*      */     //   168: iand
/*      */     //   169: ifne -> 198
/*      */     //   172: iload #7
/*      */     //   174: aload #5
/*      */     //   176: aload #4
/*      */     //   178: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   183: ifeq -> 192
/*      */     //   186: sipush #16384
/*      */     //   189: goto -> 195
/*      */     //   192: sipush #8192
/*      */     //   195: ior
/*      */     //   196: istore #7
/*      */     //   198: iload #7
/*      */     //   200: sipush #9363
/*      */     //   203: iand
/*      */     //   204: sipush #9362
/*      */     //   207: if_icmpne -> 220
/*      */     //   210: aload #5
/*      */     //   212: invokeinterface getSkipping : ()Z
/*      */     //   217: ifne -> 1160
/*      */     //   220: invokestatic isTraceInProgress : ()Z
/*      */     //   223: ifeq -> 238
/*      */     //   226: ldc_w 2001867728
/*      */     //   229: iload #7
/*      */     //   231: iconst_m1
/*      */     //   232: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptButtons (PromptArea.kt:207)'
/*      */     //   235: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   238: aload_1
/*      */     //   239: invokevirtual getText : ()Ljava/lang/CharSequence;
/*      */     //   242: invokeinterface length : ()I
/*      */     //   247: ifle -> 254
/*      */     //   250: iconst_1
/*      */     //   251: goto -> 255
/*      */     //   254: iconst_0
/*      */     //   255: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   258: aconst_null
/*      */     //   259: iconst_2
/*      */     //   260: aconst_null
/*      */     //   261: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   264: astore #8
/*      */     //   266: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*      */     //   269: checkcast com/intellij/openapi/components/ComponentManager
/*      */     //   272: astore #10
/*      */     //   274: iconst_0
/*      */     //   275: istore #11
/*      */     //   277: ldc_w com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*      */     //   280: astore #12
/*      */     //   282: aload #10
/*      */     //   284: aload #12
/*      */     //   286: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*      */     //   291: dup
/*      */     //   292: ifnonnull -> 304
/*      */     //   295: pop
/*      */     //   296: aload #10
/*      */     //   298: aload #12
/*      */     //   300: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*      */     //   303: athrow
/*      */     //   304: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*      */     //   307: astore #9
/*      */     //   309: aload #9
/*      */     //   311: invokevirtual getBraveModeFlow : ()Lkotlinx/coroutines/flow/StateFlow;
/*      */     //   314: aconst_null
/*      */     //   315: aload #5
/*      */     //   317: iconst_0
/*      */     //   318: iconst_1
/*      */     //   319: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*      */     //   322: astore #10
/*      */     //   324: sipush #300
/*      */     //   327: istore #12
/*      */     //   329: iconst_0
/*      */     //   330: istore #13
/*      */     //   332: iload #12
/*      */     //   334: i2f
/*      */     //   335: invokestatic constructor-impl : (F)F
/*      */     //   338: aload #5
/*      */     //   340: bipush #6
/*      */     //   342: invokestatic getPixels : (FLandroidx/compose/runtime/Composer;I)I
/*      */     //   345: istore #11
/*      */     //   347: aload #5
/*      */     //   349: ldc_w -1002739254
/*      */     //   352: invokeinterface startReplaceGroup : (I)V
/*      */     //   357: aload #5
/*      */     //   359: astore #14
/*      */     //   361: iconst_0
/*      */     //   362: istore #15
/*      */     //   364: nop
/*      */     //   365: iconst_0
/*      */     //   366: istore #16
/*      */     //   368: aload #14
/*      */     //   370: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   375: astore #17
/*      */     //   377: iconst_0
/*      */     //   378: istore #18
/*      */     //   380: aload #17
/*      */     //   382: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   385: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   388: if_acmpne -> 420
/*      */     //   391: iconst_0
/*      */     //   392: istore #19
/*      */     //   394: iconst_0
/*      */     //   395: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   398: aconst_null
/*      */     //   399: iconst_2
/*      */     //   400: aconst_null
/*      */     //   401: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   404: astore #19
/*      */     //   406: aload #14
/*      */     //   408: aload #19
/*      */     //   410: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   415: aload #19
/*      */     //   417: goto -> 422
/*      */     //   420: aload #17
/*      */     //   422: nop
/*      */     //   423: nop
/*      */     //   424: nop
/*      */     //   425: checkcast androidx/compose/runtime/MutableState
/*      */     //   428: astore #13
/*      */     //   430: aload #5
/*      */     //   432: invokeinterface endReplaceGroup : ()V
/*      */     //   437: aload #13
/*      */     //   439: astore #12
/*      */     //   441: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   444: checkcast androidx/compose/ui/Modifier
/*      */     //   447: fconst_0
/*      */     //   448: iconst_1
/*      */     //   449: aconst_null
/*      */     //   450: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   453: aload #5
/*      */     //   455: ldc_w -1002735172
/*      */     //   458: invokeinterface startReplaceGroup : (I)V
/*      */     //   463: aload #5
/*      */     //   465: astore #14
/*      */     //   467: aload #5
/*      */     //   469: iload #11
/*      */     //   471: invokeinterface changed : (I)Z
/*      */     //   476: istore #15
/*      */     //   478: nop
/*      */     //   479: iconst_0
/*      */     //   480: istore #16
/*      */     //   482: aload #14
/*      */     //   484: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   489: astore #17
/*      */     //   491: iconst_0
/*      */     //   492: istore #18
/*      */     //   494: iload #15
/*      */     //   496: ifne -> 510
/*      */     //   499: aload #17
/*      */     //   501: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   504: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   507: if_acmpne -> 543
/*      */     //   510: astore #40
/*      */     //   512: iconst_0
/*      */     //   513: istore #19
/*      */     //   515: iload #11
/*      */     //   517: aload #12
/*      */     //   519: <illegal opcode> invoke : (ILandroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   524: aload #40
/*      */     //   526: swap
/*      */     //   527: astore #20
/*      */     //   529: aload #14
/*      */     //   531: aload #20
/*      */     //   533: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   538: aload #20
/*      */     //   540: goto -> 545
/*      */     //   543: aload #17
/*      */     //   545: nop
/*      */     //   546: nop
/*      */     //   547: nop
/*      */     //   548: checkcast kotlin/jvm/functions/Function1
/*      */     //   551: astore #13
/*      */     //   553: aload #5
/*      */     //   555: invokeinterface endReplaceGroup : ()V
/*      */     //   560: aload #13
/*      */     //   562: invokestatic onGloballyPositioned : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   565: astore #13
/*      */     //   567: iconst_0
/*      */     //   568: istore #16
/*      */     //   570: nop
/*      */     //   571: iconst_0
/*      */     //   572: istore #17
/*      */     //   574: aload #5
/*      */     //   576: ldc_w 733328855
/*      */     //   579: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   582: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   585: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   588: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   591: astore #14
/*      */     //   593: iconst_0
/*      */     //   594: istore #15
/*      */     //   596: aload #14
/*      */     //   598: iload #15
/*      */     //   600: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   603: astore #18
/*      */     //   605: bipush #112
/*      */     //   607: iload #16
/*      */     //   609: iconst_3
/*      */     //   610: ishl
/*      */     //   611: iand
/*      */     //   612: istore #19
/*      */     //   614: nop
/*      */     //   615: iconst_0
/*      */     //   616: istore #20
/*      */     //   618: aload #5
/*      */     //   620: ldc_w -1323940314
/*      */     //   623: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   626: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   629: aload #5
/*      */     //   631: iconst_0
/*      */     //   632: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   635: istore #21
/*      */     //   637: aload #5
/*      */     //   639: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   644: astore #22
/*      */     //   646: aload #5
/*      */     //   648: aload #13
/*      */     //   650: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   653: astore #23
/*      */     //   655: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   658: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   661: astore #24
/*      */     //   663: bipush #6
/*      */     //   665: sipush #896
/*      */     //   668: iload #19
/*      */     //   670: bipush #6
/*      */     //   672: ishl
/*      */     //   673: iand
/*      */     //   674: ior
/*      */     //   675: istore #25
/*      */     //   677: nop
/*      */     //   678: iconst_0
/*      */     //   679: istore #26
/*      */     //   681: aload #5
/*      */     //   683: ldc_w -692256719
/*      */     //   686: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   689: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   692: aload #5
/*      */     //   694: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   699: instanceof androidx/compose/runtime/Applier
/*      */     //   702: ifne -> 708
/*      */     //   705: invokestatic invalidApplier : ()V
/*      */     //   708: aload #5
/*      */     //   710: invokeinterface startReusableNode : ()V
/*      */     //   715: aload #5
/*      */     //   717: invokeinterface getInserting : ()Z
/*      */     //   722: ifeq -> 737
/*      */     //   725: aload #5
/*      */     //   727: aload #24
/*      */     //   729: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   734: goto -> 744
/*      */     //   737: aload #5
/*      */     //   739: invokeinterface useNode : ()V
/*      */     //   744: aload #5
/*      */     //   746: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   749: astore #27
/*      */     //   751: iconst_0
/*      */     //   752: istore #28
/*      */     //   754: aload #27
/*      */     //   756: aload #18
/*      */     //   758: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   761: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   764: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   767: aload #27
/*      */     //   769: aload #22
/*      */     //   771: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   774: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   777: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   780: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   783: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   786: astore #29
/*      */     //   788: iconst_0
/*      */     //   789: istore #30
/*      */     //   791: aload #27
/*      */     //   793: astore #31
/*      */     //   795: iconst_0
/*      */     //   796: istore #32
/*      */     //   798: aload #31
/*      */     //   800: invokeinterface getInserting : ()Z
/*      */     //   805: ifne -> 826
/*      */     //   808: aload #31
/*      */     //   810: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   815: iload #21
/*      */     //   817: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   820: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   823: ifne -> 852
/*      */     //   826: aload #31
/*      */     //   828: iload #21
/*      */     //   830: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   833: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   838: aload #27
/*      */     //   840: iload #21
/*      */     //   842: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   845: aload #29
/*      */     //   847: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   852: nop
/*      */     //   853: nop
/*      */     //   854: nop
/*      */     //   855: aload #27
/*      */     //   857: aload #23
/*      */     //   859: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   862: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   865: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   868: nop
/*      */     //   869: nop
/*      */     //   870: aload #5
/*      */     //   872: bipush #14
/*      */     //   874: iload #25
/*      */     //   876: bipush #6
/*      */     //   878: ishr
/*      */     //   879: iand
/*      */     //   880: istore #33
/*      */     //   882: astore #34
/*      */     //   884: iconst_0
/*      */     //   885: istore #35
/*      */     //   887: aload #34
/*      */     //   889: ldc_w -2146769399
/*      */     //   892: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   895: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   898: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   901: aload #34
/*      */     //   903: bipush #6
/*      */     //   905: bipush #112
/*      */     //   907: iload #16
/*      */     //   909: bipush #6
/*      */     //   911: ishr
/*      */     //   912: iand
/*      */     //   913: ior
/*      */     //   914: istore #36
/*      */     //   916: astore #37
/*      */     //   918: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   921: astore #38
/*      */     //   923: iconst_0
/*      */     //   924: istore #39
/*      */     //   926: aload #12
/*      */     //   928: invokestatic PromptButtons$lambda$31 : (Landroidx/compose/runtime/MutableState;)Z
/*      */     //   931: ifeq -> 1027
/*      */     //   934: aload #37
/*      */     //   936: ldc_w 938066086
/*      */     //   939: invokeinterface startReplaceGroup : (I)V
/*      */     //   944: aload_0
/*      */     //   945: aload #10
/*      */     //   947: invokestatic PromptButtons$lambda$29 : (Landroidx/compose/runtime/State;)Z
/*      */     //   950: aload #9
/*      */     //   952: aload #8
/*      */     //   954: invokestatic PromptButtons$lambda$28 : (Landroidx/compose/runtime/MutableState;)Z
/*      */     //   957: iload_2
/*      */     //   958: aload_3
/*      */     //   959: ldc_w 214771402
/*      */     //   962: iconst_1
/*      */     //   963: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptButtons$2$1
/*      */     //   966: dup
/*      */     //   967: aload_3
/*      */     //   968: aload #4
/*      */     //   970: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;)V
/*      */     //   973: aload #37
/*      */     //   975: bipush #54
/*      */     //   977: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   980: checkcast kotlin/jvm/functions/Function2
/*      */     //   983: aload #37
/*      */     //   985: ldc_w 1572864
/*      */     //   988: bipush #14
/*      */     //   990: iload #7
/*      */     //   992: iand
/*      */     //   993: ior
/*      */     //   994: ldc_w 57344
/*      */     //   997: iload #7
/*      */     //   999: bipush #6
/*      */     //   1001: ishl
/*      */     //   1002: iand
/*      */     //   1003: ior
/*      */     //   1004: ldc_w 458752
/*      */     //   1007: iload #7
/*      */     //   1009: bipush #6
/*      */     //   1011: ishl
/*      */     //   1012: iand
/*      */     //   1013: ior
/*      */     //   1014: invokestatic PromptRow : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;ZLcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;ZZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1017: aload #37
/*      */     //   1019: invokeinterface endReplaceGroup : ()V
/*      */     //   1024: goto -> 1117
/*      */     //   1027: aload #37
/*      */     //   1029: ldc_w 938472031
/*      */     //   1032: invokeinterface startReplaceGroup : (I)V
/*      */     //   1037: aload_0
/*      */     //   1038: aload #10
/*      */     //   1040: invokestatic PromptButtons$lambda$29 : (Landroidx/compose/runtime/State;)Z
/*      */     //   1043: aload #9
/*      */     //   1045: aload #8
/*      */     //   1047: invokestatic PromptButtons$lambda$28 : (Landroidx/compose/runtime/MutableState;)Z
/*      */     //   1050: iload_2
/*      */     //   1051: aload_3
/*      */     //   1052: ldc_w -475709087
/*      */     //   1055: iconst_1
/*      */     //   1056: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptButtons$2$2
/*      */     //   1059: dup
/*      */     //   1060: aload_3
/*      */     //   1061: aload #4
/*      */     //   1063: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;)V
/*      */     //   1066: aload #37
/*      */     //   1068: bipush #54
/*      */     //   1070: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1073: checkcast kotlin/jvm/functions/Function2
/*      */     //   1076: aload #37
/*      */     //   1078: ldc_w 1572864
/*      */     //   1081: bipush #14
/*      */     //   1083: iload #7
/*      */     //   1085: iand
/*      */     //   1086: ior
/*      */     //   1087: ldc_w 57344
/*      */     //   1090: iload #7
/*      */     //   1092: bipush #6
/*      */     //   1094: ishl
/*      */     //   1095: iand
/*      */     //   1096: ior
/*      */     //   1097: ldc_w 458752
/*      */     //   1100: iload #7
/*      */     //   1102: bipush #6
/*      */     //   1104: ishl
/*      */     //   1105: iand
/*      */     //   1106: ior
/*      */     //   1107: invokestatic PromptRow : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;ZLcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;ZZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1110: aload #37
/*      */     //   1112: invokeinterface endReplaceGroup : ()V
/*      */     //   1117: nop
/*      */     //   1118: aload #34
/*      */     //   1120: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1123: aload #5
/*      */     //   1125: invokeinterface endNode : ()V
/*      */     //   1130: aload #5
/*      */     //   1132: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1135: nop
/*      */     //   1136: aload #5
/*      */     //   1138: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1141: nop
/*      */     //   1142: aload #5
/*      */     //   1144: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1147: nop
/*      */     //   1148: invokestatic isTraceInProgress : ()Z
/*      */     //   1151: ifeq -> 1167
/*      */     //   1154: invokestatic traceEventEnd : ()V
/*      */     //   1157: goto -> 1167
/*      */     //   1160: aload #5
/*      */     //   1162: invokeinterface skipToGroupEnd : ()V
/*      */     //   1167: aload #5
/*      */     //   1169: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1174: dup
/*      */     //   1175: ifnull -> 1199
/*      */     //   1178: aload_0
/*      */     //   1179: aload_1
/*      */     //   1180: iload_2
/*      */     //   1181: aload_3
/*      */     //   1182: aload #4
/*      */     //   1184: iload #6
/*      */     //   1186: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Landroidx/compose/foundation/text/input/TextFieldState;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;I)Lkotlin/jvm/functions/Function2;
/*      */     //   1191: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1196: goto -> 1200
/*      */     //   1199: pop
/*      */     //   1200: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #208	-> 0
/*      */     //   #209	-> 238
/*      */     //   #209	-> 258
/*      */     //   #210	-> 266
/*      */     //   #665	-> 277
/*      */     //   #666	-> 282
/*      */     //   #210	-> 304
/*      */     //   #212	-> 309
/*      */     //   #214	-> 324
/*      */     //   #667	-> 332
/*      */     //   #214	-> 342
/*      */     //   #216	-> 364
/*      */     //   #668	-> 368
/*      */     //   #669	-> 380
/*      */     //   #670	-> 391
/*      */     //   #216	-> 394
/*      */     //   #670	-> 404
/*      */     //   #671	-> 406
/*      */     //   #672	-> 415
/*      */     //   #673	-> 420
/*      */     //   #669	-> 422
/*      */     //   #668	-> 423
/*      */     //   #668	-> 424
/*      */     //   #216	-> 425
/*      */     //   #220	-> 441
/*      */     //   #221	-> 447
/*      */     //   #222	-> 478
/*      */     //   #674	-> 482
/*      */     //   #675	-> 494
/*      */     //   #676	-> 510
/*      */     //   #222	-> 515
/*      */     //   #676	-> 527
/*      */     //   #677	-> 529
/*      */     //   #678	-> 538
/*      */     //   #679	-> 543
/*      */     //   #675	-> 545
/*      */     //   #674	-> 546
/*      */     //   #674	-> 547
/*      */     //   #222	-> 548
/*      */     //   #218	-> 570
/*      */     //   #680	-> 582
/*      */     //   #681	-> 585
/*      */     //   #682	-> 593
/*      */     //   #685	-> 596
/*      */     //   #686	-> 614
/*      */     //   #687	-> 626
/*      */     //   #688	-> 632
/*      */     //   #689	-> 639
/*      */     //   #690	-> 648
/*      */     //   #692	-> 655
/*      */     //   #691	-> 677
/*      */     //   #693	-> 689
/*      */     //   #694	-> 692
/*      */     //   #695	-> 710
/*      */     //   #696	-> 715
/*      */     //   #697	-> 727
/*      */     //   #699	-> 739
/*      */     //   #701	-> 744
/*      */     //   #702	-> 754
/*      */     //   #703	-> 767
/*      */     //   #705	-> 780
/*      */     //   #706	-> 791
/*      */     //   #707	-> 798
/*      */     //   #708	-> 826
/*      */     //   #709	-> 838
/*      */     //   #711	-> 852
/*      */     //   #706	-> 853
/*      */     //   #711	-> 854
/*      */     //   #712	-> 855
/*      */     //   #713	-> 868
/*      */     //   #701	-> 869
/*      */     //   #714	-> 870
/*      */     //   #715	-> 895
/*      */     //   #224	-> 926
/*      */     //   #226	-> 944
/*      */     //   #227	-> 945
/*      */     //   #228	-> 950
/*      */     //   #229	-> 952
/*      */     //   #230	-> 957
/*      */     //   #231	-> 958
/*      */     //   #232	-> 959
/*      */     //   #225	-> 1014
/*      */     //   #224	-> 1017
/*      */     //   #239	-> 1027
/*      */     //   #241	-> 1037
/*      */     //   #242	-> 1038
/*      */     //   #243	-> 1043
/*      */     //   #244	-> 1045
/*      */     //   #245	-> 1050
/*      */     //   #246	-> 1051
/*      */     //   #247	-> 1052
/*      */     //   #240	-> 1107
/*      */     //   #239	-> 1110
/*      */     //   #250	-> 1117
/*      */     //   #715	-> 1118
/*      */     //   #714	-> 1123
/*      */     //   #716	-> 1125
/*      */     //   #693	-> 1132
/*      */     //   #717	-> 1135
/*      */     //   #687	-> 1138
/*      */     //   #718	-> 1141
/*      */     //   #680	-> 1144
/*      */     //   #719	-> 1147
/*      */     //   #251	-> 1160
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   277	27	11	$i$f$service	I
/*      */     //   282	22	12	serviceClass$iv	Ljava/lang/Class;
/*      */     //   274	30	10	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*      */     //   332	6	13	$i$f$getDp	I
/*      */     //   329	9	12	$this$dp$iv	I
/*      */     //   394	10	19	$i$a$-cache-PromptAreaKt$PromptButtons$isCompact$2	I
/*      */     //   406	11	19	value$iv	Ljava/lang/Object;
/*      */     //   380	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   377	46	17	it$iv	Ljava/lang/Object;
/*      */     //   368	57	16	$i$f$cache	I
/*      */     //   365	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   365	60	15	invalid$iv	Z
/*      */     //   515	9	19	$i$a$-cache-PromptAreaKt$PromptButtons$1	I
/*      */     //   529	11	20	value$iv	Ljava/lang/Object;
/*      */     //   494	52	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   491	55	17	it$iv	Ljava/lang/Object;
/*      */     //   482	66	16	$i$f$cache	I
/*      */     //   479	69	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   479	69	15	invalid$iv	Z
/*      */     //   926	192	39	$i$a$-Box-PromptAreaKt$PromptButtons$2	I
/*      */     //   923	195	38	$this$PromptButtons_u24lambda_u2435	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   923	195	37	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   923	195	36	$changed	I
/*      */     //   887	236	35	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   884	239	34	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   884	239	33	$changed$iv	I
/*      */     //   798	55	32	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   795	58	31	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   791	64	30	$i$f$set-impl	I
/*      */     //   788	67	29	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   754	115	28	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   751	118	27	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   681	455	26	$i$f$ReusableComposeNode	I
/*      */     //   678	458	24	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   678	458	25	$changed$iv$iv$iv	I
/*      */     //   618	524	20	$i$f$Layout	I
/*      */     //   637	505	21	compositeKeyHash$iv$iv	I
/*      */     //   646	496	22	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   655	487	23	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   615	527	19	$changed$iv$iv	I
/*      */     //   574	574	17	$i$f$Box	I
/*      */     //   605	543	18	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   571	577	13	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   593	555	14	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   596	552	15	propagateMinConstraints$iv	Z
/*      */     //   571	577	16	$changed$iv	I
/*      */     //   266	891	8	textAreaContentState$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   309	848	9	settings	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
/*      */     //   324	833	10	braveMode$delegate	Landroidx/compose/runtime/State;
/*      */     //   347	810	11	shortLayoutThreshold	I
/*      */     //   441	716	12	isCompact$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   16	1185	7	$dirty	I
/*      */     //   0	1201	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;
/*      */     //   0	1201	1	textAreaState	Landroidx/compose/foundation/text/input/TextFieldState;
/*      */     //   0	1201	2	enabled	Z
/*      */     //   0	1201	3	promptMode	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;
/*      */     //   0	1201	4	onPromptModeChanged	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1201	5	$composer	Landroidx/compose/runtime/Composer;
/* 1039 */     //   0	1201	6	$changed	I } private static final boolean PromptButtons$lambda$29(State $braveMode$delegate) { State state = $braveMode$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final boolean PromptButtons$lambda$31(MutableState $isCompact$delegate) { State state = (State)$isCompact$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 1040 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void PromptButtons$lambda$32(MutableState $isCompact$delegate, boolean <set-?>) { MutableState mutableState = $isCompact$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 1041 */     mutableState.setValue(value$iv); } private static final Unit PromptButtons$lambda$34$lambda$33(int $shortLayoutThreshold, MutableState<Boolean> $isCompact$delegate, LayoutCoordinates it) { Intrinsics.checkNotNullParameter(it, "it"); PromptButtons$lambda$32($isCompact$delegate, (IntSize.getWidth-impl(it.getSize-YbymL2g()) < $shortLayoutThreshold)); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class PromptAreaKt$PromptButtons$2$1 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(214771402, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptButtons.<anonymous>.<anonymous> (PromptArea.kt:232)");  PromptAreaKt.CompactPromptModeSelector(this.$promptMode, null, this.$onPromptModeChanged, $composer, 0, 2); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } PromptAreaKt$PromptButtons$2$1(PromptMode $promptMode, Function1<PromptMode, Unit> $onPromptModeChanged) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class PromptAreaKt$PromptButtons$2$2 implements Function2<Composer, Integer, Unit> {
/*      */     PromptAreaKt$PromptButtons$2$2(PromptMode $promptMode, Function1<PromptMode, Unit> $onPromptModeChanged) {} @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-475709087, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptButtons.<anonymous>.<anonymous> (PromptArea.kt:246)");  PromptAreaKt.WidePromptModeSelector(this.$promptMode, this.$onPromptModeChanged, $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") private static final void PromptRow(PromptOwnerViewModel model, boolean braveMode, MatterhornModelPersistentStateComponent settings, boolean textAreaContentState, boolean enabled, PromptMode promptMode, Function2 promptSelectorContent, Composer $composer, int $changed) { // Byte code:
/*      */     //   0: aload #7
/*      */     //   2: ldc_w 1364275419
/*      */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   10: astore #7
/*      */     //   12: iload #8
/*      */     //   14: istore #9
/*      */     //   16: iload #8
/*      */     //   18: bipush #6
/*      */     //   20: iand
/*      */     //   21: ifne -> 64
/*      */     //   24: iload #9
/*      */     //   26: iload #8
/*      */     //   28: bipush #8
/*      */     //   30: iand
/*      */     //   31: ifne -> 45
/*      */     //   34: aload #7
/*      */     //   36: aload_0
/*      */     //   37: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   42: goto -> 53
/*      */     //   45: aload #7
/*      */     //   47: aload_0
/*      */     //   48: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   53: ifeq -> 60
/*      */     //   56: iconst_4
/*      */     //   57: goto -> 61
/*      */     //   60: iconst_2
/*      */     //   61: ior
/*      */     //   62: istore #9
/*      */     //   64: iload #8
/*      */     //   66: bipush #48
/*      */     //   68: iand
/*      */     //   69: ifne -> 95
/*      */     //   72: iload #9
/*      */     //   74: aload #7
/*      */     //   76: iload_1
/*      */     //   77: invokeinterface changed : (Z)Z
/*      */     //   82: ifeq -> 90
/*      */     //   85: bipush #32
/*      */     //   87: goto -> 92
/*      */     //   90: bipush #16
/*      */     //   92: ior
/*      */     //   93: istore #9
/*      */     //   95: iload #8
/*      */     //   97: sipush #384
/*      */     //   100: iand
/*      */     //   101: ifne -> 129
/*      */     //   104: iload #9
/*      */     //   106: aload #7
/*      */     //   108: aload_2
/*      */     //   109: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   114: ifeq -> 123
/*      */     //   117: sipush #256
/*      */     //   120: goto -> 126
/*      */     //   123: sipush #128
/*      */     //   126: ior
/*      */     //   127: istore #9
/*      */     //   129: iload #8
/*      */     //   131: sipush #3072
/*      */     //   134: iand
/*      */     //   135: ifne -> 163
/*      */     //   138: iload #9
/*      */     //   140: aload #7
/*      */     //   142: iload_3
/*      */     //   143: invokeinterface changed : (Z)Z
/*      */     //   148: ifeq -> 157
/*      */     //   151: sipush #2048
/*      */     //   154: goto -> 160
/*      */     //   157: sipush #1024
/*      */     //   160: ior
/*      */     //   161: istore #9
/*      */     //   163: iload #8
/*      */     //   165: sipush #24576
/*      */     //   168: iand
/*      */     //   169: ifne -> 198
/*      */     //   172: iload #9
/*      */     //   174: aload #7
/*      */     //   176: iload #4
/*      */     //   178: invokeinterface changed : (Z)Z
/*      */     //   183: ifeq -> 192
/*      */     //   186: sipush #16384
/*      */     //   189: goto -> 195
/*      */     //   192: sipush #8192
/*      */     //   195: ior
/*      */     //   196: istore #9
/*      */     //   198: iload #8
/*      */     //   200: ldc 196608
/*      */     //   202: iand
/*      */     //   203: ifne -> 230
/*      */     //   206: iload #9
/*      */     //   208: aload #7
/*      */     //   210: aload #5
/*      */     //   212: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   217: ifeq -> 225
/*      */     //   220: ldc 131072
/*      */     //   222: goto -> 227
/*      */     //   225: ldc 65536
/*      */     //   227: ior
/*      */     //   228: istore #9
/*      */     //   230: iload #8
/*      */     //   232: ldc_w 1572864
/*      */     //   235: iand
/*      */     //   236: ifne -> 265
/*      */     //   239: iload #9
/*      */     //   241: aload #7
/*      */     //   243: aload #6
/*      */     //   245: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   250: ifeq -> 259
/*      */     //   253: ldc_w 1048576
/*      */     //   256: goto -> 262
/*      */     //   259: ldc_w 524288
/*      */     //   262: ior
/*      */     //   263: istore #9
/*      */     //   265: iload #9
/*      */     //   267: ldc_w 599187
/*      */     //   270: iand
/*      */     //   271: ldc_w 599186
/*      */     //   274: if_icmpne -> 287
/*      */     //   277: aload #7
/*      */     //   279: invokeinterface getSkipping : ()Z
/*      */     //   284: ifne -> 2890
/*      */     //   287: invokestatic isTraceInProgress : ()Z
/*      */     //   290: ifeq -> 305
/*      */     //   293: ldc_w 1364275419
/*      */     //   296: iload #9
/*      */     //   298: iconst_m1
/*      */     //   299: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptRow (PromptArea.kt:261)'
/*      */     //   302: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   305: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   308: checkcast androidx/compose/ui/Modifier
/*      */     //   311: aconst_null
/*      */     //   312: aconst_null
/*      */     //   313: iconst_3
/*      */     //   314: aconst_null
/*      */     //   315: invokestatic animateContentSize$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   318: fconst_0
/*      */     //   319: iconst_1
/*      */     //   320: aconst_null
/*      */     //   321: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   324: astore #10
/*      */     //   326: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   329: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*      */     //   332: astore #11
/*      */     //   334: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*      */     //   337: invokevirtual getSpaceBetween : ()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*      */     //   340: astore #12
/*      */     //   342: sipush #432
/*      */     //   345: istore #13
/*      */     //   347: nop
/*      */     //   348: iconst_0
/*      */     //   349: istore #14
/*      */     //   351: aload #7
/*      */     //   353: ldc_w 693286680
/*      */     //   356: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*      */     //   359: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   362: aload #12
/*      */     //   364: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*      */     //   367: aload #11
/*      */     //   369: aload #7
/*      */     //   371: bipush #14
/*      */     //   373: iload #13
/*      */     //   375: iconst_3
/*      */     //   376: ishr
/*      */     //   377: iand
/*      */     //   378: bipush #112
/*      */     //   380: iload #13
/*      */     //   382: iconst_3
/*      */     //   383: ishr
/*      */     //   384: iand
/*      */     //   385: ior
/*      */     //   386: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   389: astore #15
/*      */     //   391: bipush #112
/*      */     //   393: iload #13
/*      */     //   395: iconst_3
/*      */     //   396: ishl
/*      */     //   397: iand
/*      */     //   398: istore #16
/*      */     //   400: nop
/*      */     //   401: iconst_0
/*      */     //   402: istore #17
/*      */     //   404: aload #7
/*      */     //   406: ldc_w -1323940314
/*      */     //   409: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   412: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   415: aload #7
/*      */     //   417: iconst_0
/*      */     //   418: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   421: istore #18
/*      */     //   423: aload #7
/*      */     //   425: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   430: astore #19
/*      */     //   432: aload #7
/*      */     //   434: aload #10
/*      */     //   436: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   439: astore #20
/*      */     //   441: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   444: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   447: astore #21
/*      */     //   449: bipush #6
/*      */     //   451: sipush #896
/*      */     //   454: iload #16
/*      */     //   456: bipush #6
/*      */     //   458: ishl
/*      */     //   459: iand
/*      */     //   460: ior
/*      */     //   461: istore #22
/*      */     //   463: nop
/*      */     //   464: iconst_0
/*      */     //   465: istore #23
/*      */     //   467: aload #7
/*      */     //   469: ldc_w -692256719
/*      */     //   472: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   475: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   478: aload #7
/*      */     //   480: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   485: instanceof androidx/compose/runtime/Applier
/*      */     //   488: ifne -> 494
/*      */     //   491: invokestatic invalidApplier : ()V
/*      */     //   494: aload #7
/*      */     //   496: invokeinterface startReusableNode : ()V
/*      */     //   501: aload #7
/*      */     //   503: invokeinterface getInserting : ()Z
/*      */     //   508: ifeq -> 523
/*      */     //   511: aload #7
/*      */     //   513: aload #21
/*      */     //   515: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   520: goto -> 530
/*      */     //   523: aload #7
/*      */     //   525: invokeinterface useNode : ()V
/*      */     //   530: aload #7
/*      */     //   532: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   535: astore #24
/*      */     //   537: iconst_0
/*      */     //   538: istore #25
/*      */     //   540: aload #24
/*      */     //   542: aload #15
/*      */     //   544: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   547: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   550: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   553: aload #24
/*      */     //   555: aload #19
/*      */     //   557: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   560: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   563: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   566: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   569: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   572: astore #26
/*      */     //   574: iconst_0
/*      */     //   575: istore #27
/*      */     //   577: aload #24
/*      */     //   579: astore #28
/*      */     //   581: iconst_0
/*      */     //   582: istore #29
/*      */     //   584: aload #28
/*      */     //   586: invokeinterface getInserting : ()Z
/*      */     //   591: ifne -> 612
/*      */     //   594: aload #28
/*      */     //   596: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   601: iload #18
/*      */     //   603: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   606: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   609: ifne -> 638
/*      */     //   612: aload #28
/*      */     //   614: iload #18
/*      */     //   616: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   619: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   624: aload #24
/*      */     //   626: iload #18
/*      */     //   628: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   631: aload #26
/*      */     //   633: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   638: nop
/*      */     //   639: nop
/*      */     //   640: nop
/*      */     //   641: aload #24
/*      */     //   643: aload #20
/*      */     //   645: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   648: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   651: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   654: nop
/*      */     //   655: nop
/*      */     //   656: aload #7
/*      */     //   658: bipush #14
/*      */     //   660: iload #22
/*      */     //   662: bipush #6
/*      */     //   664: ishr
/*      */     //   665: iand
/*      */     //   666: istore #30
/*      */     //   668: astore #31
/*      */     //   670: iconst_0
/*      */     //   671: istore #32
/*      */     //   673: aload #31
/*      */     //   675: ldc_w -407840262
/*      */     //   678: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*      */     //   681: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   684: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*      */     //   687: aload #31
/*      */     //   689: bipush #6
/*      */     //   691: bipush #112
/*      */     //   693: iload #13
/*      */     //   695: bipush #6
/*      */     //   697: ishr
/*      */     //   698: iand
/*      */     //   699: ior
/*      */     //   700: istore #33
/*      */     //   702: astore #34
/*      */     //   704: checkcast androidx/compose/foundation/layout/RowScope
/*      */     //   707: astore #35
/*      */     //   709: iconst_0
/*      */     //   710: istore #36
/*      */     //   712: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   715: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*      */     //   718: astore #37
/*      */     //   720: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*      */     //   723: bipush #16
/*      */     //   725: istore #38
/*      */     //   727: iconst_0
/*      */     //   728: istore #39
/*      */     //   730: iload #38
/*      */     //   732: i2f
/*      */     //   733: invokestatic constructor-impl : (F)F
/*      */     //   736: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*      */     //   739: astore #40
/*      */     //   741: sipush #432
/*      */     //   744: istore #39
/*      */     //   746: nop
/*      */     //   747: iconst_0
/*      */     //   748: istore #41
/*      */     //   750: aload #34
/*      */     //   752: ldc_w 693286680
/*      */     //   755: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*      */     //   758: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   761: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   764: checkcast androidx/compose/ui/Modifier
/*      */     //   767: astore #38
/*      */     //   769: aload #40
/*      */     //   771: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*      */     //   774: aload #37
/*      */     //   776: aload #34
/*      */     //   778: bipush #14
/*      */     //   780: iload #39
/*      */     //   782: iconst_3
/*      */     //   783: ishr
/*      */     //   784: iand
/*      */     //   785: bipush #112
/*      */     //   787: iload #39
/*      */     //   789: iconst_3
/*      */     //   790: ishr
/*      */     //   791: iand
/*      */     //   792: ior
/*      */     //   793: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   796: astore #42
/*      */     //   798: bipush #112
/*      */     //   800: iload #39
/*      */     //   802: iconst_3
/*      */     //   803: ishl
/*      */     //   804: iand
/*      */     //   805: istore #43
/*      */     //   807: nop
/*      */     //   808: iconst_0
/*      */     //   809: istore #44
/*      */     //   811: aload #34
/*      */     //   813: ldc_w -1323940314
/*      */     //   816: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   819: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   822: aload #34
/*      */     //   824: iconst_0
/*      */     //   825: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   828: istore #45
/*      */     //   830: aload #34
/*      */     //   832: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   837: astore #46
/*      */     //   839: aload #34
/*      */     //   841: aload #38
/*      */     //   843: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   846: astore #47
/*      */     //   848: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   851: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   854: astore #48
/*      */     //   856: bipush #6
/*      */     //   858: sipush #896
/*      */     //   861: iload #43
/*      */     //   863: bipush #6
/*      */     //   865: ishl
/*      */     //   866: iand
/*      */     //   867: ior
/*      */     //   868: istore #49
/*      */     //   870: nop
/*      */     //   871: iconst_0
/*      */     //   872: istore #50
/*      */     //   874: aload #34
/*      */     //   876: ldc_w -692256719
/*      */     //   879: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   882: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   885: aload #34
/*      */     //   887: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   892: instanceof androidx/compose/runtime/Applier
/*      */     //   895: ifne -> 901
/*      */     //   898: invokestatic invalidApplier : ()V
/*      */     //   901: aload #34
/*      */     //   903: invokeinterface startReusableNode : ()V
/*      */     //   908: aload #34
/*      */     //   910: invokeinterface getInserting : ()Z
/*      */     //   915: ifeq -> 930
/*      */     //   918: aload #34
/*      */     //   920: aload #48
/*      */     //   922: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   927: goto -> 937
/*      */     //   930: aload #34
/*      */     //   932: invokeinterface useNode : ()V
/*      */     //   937: aload #34
/*      */     //   939: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   942: astore #51
/*      */     //   944: iconst_0
/*      */     //   945: istore #52
/*      */     //   947: aload #51
/*      */     //   949: aload #42
/*      */     //   951: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   954: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   957: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   960: aload #51
/*      */     //   962: aload #46
/*      */     //   964: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   967: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   970: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   973: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   976: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   979: astore #53
/*      */     //   981: iconst_0
/*      */     //   982: istore #54
/*      */     //   984: aload #51
/*      */     //   986: astore #55
/*      */     //   988: iconst_0
/*      */     //   989: istore #56
/*      */     //   991: aload #55
/*      */     //   993: invokeinterface getInserting : ()Z
/*      */     //   998: ifne -> 1019
/*      */     //   1001: aload #55
/*      */     //   1003: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1008: iload #45
/*      */     //   1010: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1013: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   1016: ifne -> 1045
/*      */     //   1019: aload #55
/*      */     //   1021: iload #45
/*      */     //   1023: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1026: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1031: aload #51
/*      */     //   1033: iload #45
/*      */     //   1035: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1038: aload #53
/*      */     //   1040: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1045: nop
/*      */     //   1046: nop
/*      */     //   1047: nop
/*      */     //   1048: aload #51
/*      */     //   1050: aload #47
/*      */     //   1052: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1055: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1058: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1061: nop
/*      */     //   1062: nop
/*      */     //   1063: aload #34
/*      */     //   1065: bipush #14
/*      */     //   1067: iload #49
/*      */     //   1069: bipush #6
/*      */     //   1071: ishr
/*      */     //   1072: iand
/*      */     //   1073: istore #57
/*      */     //   1075: astore #58
/*      */     //   1077: iconst_0
/*      */     //   1078: istore #59
/*      */     //   1080: aload #58
/*      */     //   1082: ldc_w -407840262
/*      */     //   1085: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*      */     //   1088: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1091: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*      */     //   1094: aload #58
/*      */     //   1096: bipush #6
/*      */     //   1098: bipush #112
/*      */     //   1100: iload #39
/*      */     //   1102: bipush #6
/*      */     //   1104: ishr
/*      */     //   1105: iand
/*      */     //   1106: ior
/*      */     //   1107: istore #60
/*      */     //   1109: astore #61
/*      */     //   1111: checkcast androidx/compose/foundation/layout/RowScope
/*      */     //   1114: astore #62
/*      */     //   1116: iconst_0
/*      */     //   1117: istore #63
/*      */     //   1119: aload_0
/*      */     //   1120: invokeinterface getAttachedFiles : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*      */     //   1125: astore #64
/*      */     //   1127: aload #61
/*      */     //   1129: ldc_w -1368932158
/*      */     //   1132: invokeinterface startReplaceGroup : (I)V
/*      */     //   1137: aload #61
/*      */     //   1139: astore #65
/*      */     //   1141: aload #61
/*      */     //   1143: aload #64
/*      */     //   1145: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1150: istore #66
/*      */     //   1152: iconst_0
/*      */     //   1153: istore #67
/*      */     //   1155: aload #65
/*      */     //   1157: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1162: astore #68
/*      */     //   1164: iconst_0
/*      */     //   1165: istore #69
/*      */     //   1167: iload #66
/*      */     //   1169: ifne -> 1183
/*      */     //   1172: aload #68
/*      */     //   1174: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1177: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1180: if_acmpne -> 1214
/*      */     //   1183: iconst_0
/*      */     //   1184: istore #70
/*      */     //   1186: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptRow$1$1$1$1
/*      */     //   1189: dup
/*      */     //   1190: aload #64
/*      */     //   1192: invokespecial <init> : (Ljava/lang/Object;)V
/*      */     //   1195: checkcast kotlin/reflect/KFunction
/*      */     //   1198: astore #71
/*      */     //   1200: aload #65
/*      */     //   1202: aload #71
/*      */     //   1204: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1209: aload #71
/*      */     //   1211: goto -> 1216
/*      */     //   1214: aload #68
/*      */     //   1216: nop
/*      */     //   1217: nop
/*      */     //   1218: nop
/*      */     //   1219: checkcast kotlin/reflect/KFunction
/*      */     //   1222: astore #72
/*      */     //   1224: aload #61
/*      */     //   1226: invokeinterface endReplaceGroup : ()V
/*      */     //   1231: aload #72
/*      */     //   1233: astore #73
/*      */     //   1235: aload_0
/*      */     //   1236: invokeinterface getAttachedFiles : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*      */     //   1241: astore #72
/*      */     //   1243: aload #61
/*      */     //   1245: ldc_w -1368930207
/*      */     //   1248: invokeinterface startReplaceGroup : (I)V
/*      */     //   1253: aload #61
/*      */     //   1255: astore #66
/*      */     //   1257: aload #61
/*      */     //   1259: aload #72
/*      */     //   1261: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1266: istore #67
/*      */     //   1268: iconst_0
/*      */     //   1269: istore #68
/*      */     //   1271: aload #66
/*      */     //   1273: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1278: astore #69
/*      */     //   1280: iconst_0
/*      */     //   1281: istore #70
/*      */     //   1283: iload #67
/*      */     //   1285: ifne -> 1299
/*      */     //   1288: aload #69
/*      */     //   1290: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1293: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1296: if_acmpne -> 1330
/*      */     //   1299: iconst_0
/*      */     //   1300: istore #71
/*      */     //   1302: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptRow$1$1$2$1
/*      */     //   1305: dup
/*      */     //   1306: aload #72
/*      */     //   1308: invokespecial <init> : (Ljava/lang/Object;)V
/*      */     //   1311: checkcast kotlin/reflect/KFunction
/*      */     //   1314: astore #74
/*      */     //   1316: aload #66
/*      */     //   1318: aload #74
/*      */     //   1320: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1325: aload #74
/*      */     //   1327: goto -> 1332
/*      */     //   1330: aload #69
/*      */     //   1332: nop
/*      */     //   1333: nop
/*      */     //   1334: nop
/*      */     //   1335: checkcast kotlin/reflect/KFunction
/*      */     //   1338: astore #65
/*      */     //   1340: aload #61
/*      */     //   1342: invokeinterface endReplaceGroup : ()V
/*      */     //   1347: aload #65
/*      */     //   1349: astore #64
/*      */     //   1351: aload_0
/*      */     //   1352: invokeinterface getAttachedFiles : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*      */     //   1357: astore #65
/*      */     //   1359: aload #61
/*      */     //   1361: ldc_w -1368928314
/*      */     //   1364: invokeinterface startReplaceGroup : (I)V
/*      */     //   1369: aload #61
/*      */     //   1371: astore #67
/*      */     //   1373: aload #61
/*      */     //   1375: aload #65
/*      */     //   1377: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1382: istore #68
/*      */     //   1384: iconst_0
/*      */     //   1385: istore #69
/*      */     //   1387: aload #67
/*      */     //   1389: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1394: astore #70
/*      */     //   1396: iconst_0
/*      */     //   1397: istore #71
/*      */     //   1399: iload #68
/*      */     //   1401: ifne -> 1415
/*      */     //   1404: aload #70
/*      */     //   1406: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1409: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1412: if_acmpne -> 1446
/*      */     //   1415: iconst_0
/*      */     //   1416: istore #74
/*      */     //   1418: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptRow$1$1$3$1
/*      */     //   1421: dup
/*      */     //   1422: aload #65
/*      */     //   1424: invokespecial <init> : (Ljava/lang/Object;)V
/*      */     //   1427: checkcast kotlin/reflect/KFunction
/*      */     //   1430: astore #75
/*      */     //   1432: aload #67
/*      */     //   1434: aload #75
/*      */     //   1436: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1441: aload #75
/*      */     //   1443: goto -> 1448
/*      */     //   1446: aload #70
/*      */     //   1448: nop
/*      */     //   1449: nop
/*      */     //   1450: nop
/*      */     //   1451: checkcast kotlin/reflect/KFunction
/*      */     //   1454: astore #66
/*      */     //   1456: aload #61
/*      */     //   1458: invokeinterface endReplaceGroup : ()V
/*      */     //   1463: aload #66
/*      */     //   1465: astore #72
/*      */     //   1467: aload_0
/*      */     //   1468: invokeinterface getAttachedFiles : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*      */     //   1473: astore #66
/*      */     //   1475: aload #61
/*      */     //   1477: ldc_w -1368925974
/*      */     //   1480: invokeinterface startReplaceGroup : (I)V
/*      */     //   1485: aload #61
/*      */     //   1487: astore #68
/*      */     //   1489: aload #61
/*      */     //   1491: aload #66
/*      */     //   1493: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1498: istore #69
/*      */     //   1500: iconst_0
/*      */     //   1501: istore #70
/*      */     //   1503: aload #68
/*      */     //   1505: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1510: astore #71
/*      */     //   1512: iconst_0
/*      */     //   1513: istore #74
/*      */     //   1515: iload #69
/*      */     //   1517: ifne -> 1531
/*      */     //   1520: aload #71
/*      */     //   1522: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1525: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1528: if_acmpne -> 1562
/*      */     //   1531: iconst_0
/*      */     //   1532: istore #75
/*      */     //   1534: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptRow$1$1$4$1
/*      */     //   1537: dup
/*      */     //   1538: aload #66
/*      */     //   1540: invokespecial <init> : (Ljava/lang/Object;)V
/*      */     //   1543: checkcast kotlin/reflect/KFunction
/*      */     //   1546: astore #76
/*      */     //   1548: aload #68
/*      */     //   1550: aload #76
/*      */     //   1552: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1557: aload #76
/*      */     //   1559: goto -> 1564
/*      */     //   1562: aload #71
/*      */     //   1564: nop
/*      */     //   1565: nop
/*      */     //   1566: nop
/*      */     //   1567: checkcast kotlin/reflect/KFunction
/*      */     //   1570: astore #67
/*      */     //   1572: aload #61
/*      */     //   1574: invokeinterface endReplaceGroup : ()V
/*      */     //   1579: aload #67
/*      */     //   1581: astore #65
/*      */     //   1583: aload_0
/*      */     //   1584: invokeinterface getAttachedFiles : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;
/*      */     //   1589: astore #67
/*      */     //   1591: aload #61
/*      */     //   1593: ldc_w -1368923611
/*      */     //   1596: invokeinterface startReplaceGroup : (I)V
/*      */     //   1601: aload #61
/*      */     //   1603: astore #69
/*      */     //   1605: aload #61
/*      */     //   1607: aload #67
/*      */     //   1609: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1614: istore #70
/*      */     //   1616: iconst_0
/*      */     //   1617: istore #71
/*      */     //   1619: aload #69
/*      */     //   1621: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1626: astore #74
/*      */     //   1628: iconst_0
/*      */     //   1629: istore #75
/*      */     //   1631: iload #70
/*      */     //   1633: ifne -> 1647
/*      */     //   1636: aload #74
/*      */     //   1638: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1641: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1644: if_acmpne -> 1678
/*      */     //   1647: iconst_0
/*      */     //   1648: istore #76
/*      */     //   1650: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptRow$1$1$5$1
/*      */     //   1653: dup
/*      */     //   1654: aload #67
/*      */     //   1656: invokespecial <init> : (Ljava/lang/Object;)V
/*      */     //   1659: checkcast kotlin/reflect/KFunction
/*      */     //   1662: astore #77
/*      */     //   1664: aload #69
/*      */     //   1666: aload #77
/*      */     //   1668: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1673: aload #77
/*      */     //   1675: goto -> 1680
/*      */     //   1678: aload #74
/*      */     //   1680: nop
/*      */     //   1681: nop
/*      */     //   1682: nop
/*      */     //   1683: checkcast kotlin/reflect/KFunction
/*      */     //   1686: astore #68
/*      */     //   1688: aload #61
/*      */     //   1690: invokeinterface endReplaceGroup : ()V
/*      */     //   1695: aload #68
/*      */     //   1697: astore #66
/*      */     //   1699: aload #73
/*      */     //   1701: checkcast kotlin/jvm/functions/Function0
/*      */     //   1704: aload #64
/*      */     //   1706: checkcast kotlin/jvm/functions/Function0
/*      */     //   1709: aload #72
/*      */     //   1711: checkcast kotlin/jvm/functions/Function1
/*      */     //   1714: aload #65
/*      */     //   1716: checkcast kotlin/jvm/functions/Function0
/*      */     //   1719: aload #61
/*      */     //   1721: ldc_w -1368921274
/*      */     //   1724: invokeinterface startReplaceGroup : (I)V
/*      */     //   1729: aload #61
/*      */     //   1731: astore #68
/*      */     //   1733: iload #9
/*      */     //   1735: bipush #14
/*      */     //   1737: iand
/*      */     //   1738: iconst_4
/*      */     //   1739: if_icmpeq -> 1761
/*      */     //   1742: iload #9
/*      */     //   1744: bipush #8
/*      */     //   1746: iand
/*      */     //   1747: ifeq -> 1765
/*      */     //   1750: aload #7
/*      */     //   1752: aload_0
/*      */     //   1753: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1758: ifeq -> 1765
/*      */     //   1761: iconst_1
/*      */     //   1762: goto -> 1766
/*      */     //   1765: iconst_0
/*      */     //   1766: istore #69
/*      */     //   1768: nop
/*      */     //   1769: iconst_0
/*      */     //   1770: istore #70
/*      */     //   1772: aload #68
/*      */     //   1774: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1779: astore #71
/*      */     //   1781: iconst_0
/*      */     //   1782: istore #74
/*      */     //   1784: iload #69
/*      */     //   1786: ifne -> 1800
/*      */     //   1789: aload #71
/*      */     //   1791: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1794: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1797: if_acmpne -> 1845
/*      */     //   1800: astore #78
/*      */     //   1802: astore #79
/*      */     //   1804: astore #80
/*      */     //   1806: astore #81
/*      */     //   1808: iconst_0
/*      */     //   1809: istore #75
/*      */     //   1811: aload_0
/*      */     //   1812: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;)Lkotlin/jvm/functions/Function0;
/*      */     //   1817: astore #82
/*      */     //   1819: aload #81
/*      */     //   1821: aload #80
/*      */     //   1823: aload #79
/*      */     //   1825: aload #78
/*      */     //   1827: aload #82
/*      */     //   1829: astore #76
/*      */     //   1831: aload #68
/*      */     //   1833: aload #76
/*      */     //   1835: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1840: aload #76
/*      */     //   1842: goto -> 1847
/*      */     //   1845: aload #71
/*      */     //   1847: nop
/*      */     //   1848: nop
/*      */     //   1849: nop
/*      */     //   1850: checkcast kotlin/jvm/functions/Function0
/*      */     //   1853: astore #67
/*      */     //   1855: aload #61
/*      */     //   1857: invokeinterface endReplaceGroup : ()V
/*      */     //   1862: aload #67
/*      */     //   1864: aload #66
/*      */     //   1866: checkcast kotlin/jvm/functions/Function1
/*      */     //   1869: aload #61
/*      */     //   1871: ldc_w -1368917958
/*      */     //   1874: invokeinterface startReplaceGroup : (I)V
/*      */     //   1879: aload #61
/*      */     //   1881: astore #68
/*      */     //   1883: iload #9
/*      */     //   1885: bipush #14
/*      */     //   1887: iand
/*      */     //   1888: iconst_4
/*      */     //   1889: if_icmpeq -> 1911
/*      */     //   1892: iload #9
/*      */     //   1894: bipush #8
/*      */     //   1896: iand
/*      */     //   1897: ifeq -> 1915
/*      */     //   1900: aload #7
/*      */     //   1902: aload_0
/*      */     //   1903: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1908: ifeq -> 1915
/*      */     //   1911: iconst_1
/*      */     //   1912: goto -> 1916
/*      */     //   1915: iconst_0
/*      */     //   1916: istore #69
/*      */     //   1918: nop
/*      */     //   1919: iconst_0
/*      */     //   1920: istore #70
/*      */     //   1922: aload #68
/*      */     //   1924: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1929: astore #71
/*      */     //   1931: iconst_0
/*      */     //   1932: istore #74
/*      */     //   1934: iload #69
/*      */     //   1936: ifne -> 1950
/*      */     //   1939: aload #71
/*      */     //   1941: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1944: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1947: if_acmpne -> 2003
/*      */     //   1950: astore #83
/*      */     //   1952: astore #82
/*      */     //   1954: astore #78
/*      */     //   1956: astore #79
/*      */     //   1958: astore #80
/*      */     //   1960: astore #81
/*      */     //   1962: iconst_0
/*      */     //   1963: istore #75
/*      */     //   1965: aload_0
/*      */     //   1966: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;)Lkotlin/jvm/functions/Function0;
/*      */     //   1971: astore #84
/*      */     //   1973: aload #81
/*      */     //   1975: aload #80
/*      */     //   1977: aload #79
/*      */     //   1979: aload #78
/*      */     //   1981: aload #82
/*      */     //   1983: aload #83
/*      */     //   1985: aload #84
/*      */     //   1987: astore #76
/*      */     //   1989: aload #68
/*      */     //   1991: aload #76
/*      */     //   1993: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1998: aload #76
/*      */     //   2000: goto -> 2005
/*      */     //   2003: aload #71
/*      */     //   2005: nop
/*      */     //   2006: nop
/*      */     //   2007: nop
/*      */     //   2008: checkcast kotlin/jvm/functions/Function0
/*      */     //   2011: astore #67
/*      */     //   2013: aload #61
/*      */     //   2015: invokeinterface endReplaceGroup : ()V
/*      */     //   2020: aload #67
/*      */     //   2022: aload #61
/*      */     //   2024: ldc_w -1368915095
/*      */     //   2027: invokeinterface startReplaceGroup : (I)V
/*      */     //   2032: aload #61
/*      */     //   2034: astore #68
/*      */     //   2036: iload #9
/*      */     //   2038: bipush #14
/*      */     //   2040: iand
/*      */     //   2041: iconst_4
/*      */     //   2042: if_icmpeq -> 2064
/*      */     //   2045: iload #9
/*      */     //   2047: bipush #8
/*      */     //   2049: iand
/*      */     //   2050: ifeq -> 2068
/*      */     //   2053: aload #7
/*      */     //   2055: aload_0
/*      */     //   2056: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   2061: ifeq -> 2068
/*      */     //   2064: iconst_1
/*      */     //   2065: goto -> 2069
/*      */     //   2068: iconst_0
/*      */     //   2069: istore #69
/*      */     //   2071: nop
/*      */     //   2072: iconst_0
/*      */     //   2073: istore #70
/*      */     //   2075: aload #68
/*      */     //   2077: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   2082: astore #71
/*      */     //   2084: iconst_0
/*      */     //   2085: istore #74
/*      */     //   2087: iload #69
/*      */     //   2089: ifne -> 2103
/*      */     //   2092: aload #71
/*      */     //   2094: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   2097: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   2100: if_acmpne -> 2160
/*      */     //   2103: astore #84
/*      */     //   2105: astore #83
/*      */     //   2107: astore #82
/*      */     //   2109: astore #78
/*      */     //   2111: astore #79
/*      */     //   2113: astore #80
/*      */     //   2115: astore #81
/*      */     //   2117: iconst_0
/*      */     //   2118: istore #75
/*      */     //   2120: aload_0
/*      */     //   2121: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;)Lkotlin/jvm/functions/Function0;
/*      */     //   2126: astore #85
/*      */     //   2128: aload #81
/*      */     //   2130: aload #80
/*      */     //   2132: aload #79
/*      */     //   2134: aload #78
/*      */     //   2136: aload #82
/*      */     //   2138: aload #83
/*      */     //   2140: aload #84
/*      */     //   2142: aload #85
/*      */     //   2144: astore #76
/*      */     //   2146: aload #68
/*      */     //   2148: aload #76
/*      */     //   2150: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   2155: aload #76
/*      */     //   2157: goto -> 2162
/*      */     //   2160: aload #71
/*      */     //   2162: nop
/*      */     //   2163: nop
/*      */     //   2164: nop
/*      */     //   2165: checkcast kotlin/jvm/functions/Function0
/*      */     //   2168: astore #67
/*      */     //   2170: aload #61
/*      */     //   2172: invokeinterface endReplaceGroup : ()V
/*      */     //   2177: aload #67
/*      */     //   2179: aload #61
/*      */     //   2181: ldc_w -1368912856
/*      */     //   2184: invokeinterface startReplaceGroup : (I)V
/*      */     //   2189: aload #61
/*      */     //   2191: astore #68
/*      */     //   2193: iload #9
/*      */     //   2195: bipush #14
/*      */     //   2197: iand
/*      */     //   2198: iconst_4
/*      */     //   2199: if_icmpeq -> 2221
/*      */     //   2202: iload #9
/*      */     //   2204: bipush #8
/*      */     //   2206: iand
/*      */     //   2207: ifeq -> 2225
/*      */     //   2210: aload #7
/*      */     //   2212: aload_0
/*      */     //   2213: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   2218: ifeq -> 2225
/*      */     //   2221: iconst_1
/*      */     //   2222: goto -> 2226
/*      */     //   2225: iconst_0
/*      */     //   2226: istore #69
/*      */     //   2228: nop
/*      */     //   2229: iconst_0
/*      */     //   2230: istore #70
/*      */     //   2232: aload #68
/*      */     //   2234: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   2239: astore #71
/*      */     //   2241: iconst_0
/*      */     //   2242: istore #74
/*      */     //   2244: iload #69
/*      */     //   2246: ifne -> 2260
/*      */     //   2249: aload #71
/*      */     //   2251: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   2254: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   2257: if_acmpne -> 2327
/*      */     //   2260: astore #85
/*      */     //   2262: astore #84
/*      */     //   2264: astore #83
/*      */     //   2266: astore #82
/*      */     //   2268: astore #78
/*      */     //   2270: astore #79
/*      */     //   2272: astore #80
/*      */     //   2274: astore #81
/*      */     //   2276: iconst_0
/*      */     //   2277: istore #75
/*      */     //   2279: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptRow$1$1$9$1
/*      */     //   2282: dup
/*      */     //   2283: aload_0
/*      */     //   2284: aconst_null
/*      */     //   2285: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Lkotlin/coroutines/Continuation;)V
/*      */     //   2288: checkcast kotlin/jvm/functions/Function1
/*      */     //   2291: astore #86
/*      */     //   2293: aload #81
/*      */     //   2295: aload #80
/*      */     //   2297: aload #79
/*      */     //   2299: aload #78
/*      */     //   2301: aload #82
/*      */     //   2303: aload #83
/*      */     //   2305: aload #84
/*      */     //   2307: aload #85
/*      */     //   2309: aload #86
/*      */     //   2311: astore #76
/*      */     //   2313: aload #68
/*      */     //   2315: aload #76
/*      */     //   2317: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   2322: aload #76
/*      */     //   2324: goto -> 2329
/*      */     //   2327: aload #71
/*      */     //   2329: nop
/*      */     //   2330: nop
/*      */     //   2331: nop
/*      */     //   2332: checkcast kotlin/jvm/functions/Function1
/*      */     //   2335: astore #67
/*      */     //   2337: aload #61
/*      */     //   2339: invokeinterface endReplaceGroup : ()V
/*      */     //   2344: aload #67
/*      */     //   2346: aload #61
/*      */     //   2348: iconst_0
/*      */     //   2349: invokestatic JunieFilePickerButton : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*      */     //   2352: aload #61
/*      */     //   2354: ldc_w -1368910967
/*      */     //   2357: invokeinterface startReplaceGroup : (I)V
/*      */     //   2362: aload_0
/*      */     //   2363: invokeinterface getPerplexityModeEnabled : ()Z
/*      */     //   2368: ifeq -> 2392
/*      */     //   2371: aload #6
/*      */     //   2373: aload #61
/*      */     //   2375: bipush #14
/*      */     //   2377: iload #9
/*      */     //   2379: bipush #18
/*      */     //   2381: ishr
/*      */     //   2382: iand
/*      */     //   2383: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   2386: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   2391: pop
/*      */     //   2392: aload #61
/*      */     //   2394: invokeinterface endReplaceGroup : ()V
/*      */     //   2399: iload_1
/*      */     //   2400: aload #61
/*      */     //   2402: ldc_w -1368906135
/*      */     //   2405: invokeinterface startReplaceGroup : (I)V
/*      */     //   2410: aload #61
/*      */     //   2412: astore #64
/*      */     //   2414: aload #7
/*      */     //   2416: aload_2
/*      */     //   2417: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   2422: istore #72
/*      */     //   2424: nop
/*      */     //   2425: iconst_0
/*      */     //   2426: istore #65
/*      */     //   2428: aload #64
/*      */     //   2430: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   2435: astore #66
/*      */     //   2437: iconst_0
/*      */     //   2438: istore #67
/*      */     //   2440: iload #72
/*      */     //   2442: ifne -> 2456
/*      */     //   2445: aload #66
/*      */     //   2447: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   2450: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   2453: if_acmpne -> 2489
/*      */     //   2456: istore #81
/*      */     //   2458: iconst_0
/*      */     //   2459: istore #68
/*      */     //   2461: aload_2
/*      */     //   2462: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;)Lkotlin/jvm/functions/Function1;
/*      */     //   2467: astore #80
/*      */     //   2469: iload #81
/*      */     //   2471: aload #80
/*      */     //   2473: astore #69
/*      */     //   2475: aload #64
/*      */     //   2477: aload #69
/*      */     //   2479: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   2484: aload #69
/*      */     //   2486: goto -> 2491
/*      */     //   2489: aload #66
/*      */     //   2491: nop
/*      */     //   2492: nop
/*      */     //   2493: nop
/*      */     //   2494: checkcast kotlin/jvm/functions/Function1
/*      */     //   2497: astore #73
/*      */     //   2499: aload #61
/*      */     //   2501: invokeinterface endReplaceGroup : ()V
/*      */     //   2506: aload #73
/*      */     //   2508: aconst_null
/*      */     //   2509: iconst_0
/*      */     //   2510: aconst_null
/*      */     //   2511: aconst_null
/*      */     //   2512: aconst_null
/*      */     //   2513: aconst_null
/*      */     //   2514: aconst_null
/*      */     //   2515: aconst_null
/*      */     //   2516: aconst_null
/*      */     //   2517: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/ComposableSingletons$PromptAreaKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/ComposableSingletons$PromptAreaKt;
/*      */     //   2520: invokevirtual getLambda-3$ej_ui : ()Lkotlin/jvm/functions/Function3;
/*      */     //   2523: aload #61
/*      */     //   2525: bipush #14
/*      */     //   2527: iload #9
/*      */     //   2529: iconst_3
/*      */     //   2530: ishr
/*      */     //   2531: iand
/*      */     //   2532: bipush #48
/*      */     //   2534: sipush #2044
/*      */     //   2537: invokestatic CheckboxRow : (ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
/*      */     //   2540: nop
/*      */     //   2541: aload #58
/*      */     //   2543: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2546: aload #34
/*      */     //   2548: invokeinterface endNode : ()V
/*      */     //   2553: aload #34
/*      */     //   2555: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2558: nop
/*      */     //   2559: aload #34
/*      */     //   2561: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2564: nop
/*      */     //   2565: aload #34
/*      */     //   2567: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2570: nop
/*      */     //   2571: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   2574: checkcast androidx/compose/ui/Modifier
/*      */     //   2577: bipush #54
/*      */     //   2579: istore #40
/*      */     //   2581: iconst_0
/*      */     //   2582: istore #38
/*      */     //   2584: iload #40
/*      */     //   2586: i2f
/*      */     //   2587: invokestatic constructor-impl : (F)F
/*      */     //   2590: bipush #42
/*      */     //   2592: istore #40
/*      */     //   2594: iconst_0
/*      */     //   2595: istore #38
/*      */     //   2597: iload #40
/*      */     //   2599: i2f
/*      */     //   2600: invokestatic constructor-impl : (F)F
/*      */     //   2603: invokestatic requiredSize-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*      */     //   2606: bipush #8
/*      */     //   2608: istore #40
/*      */     //   2610: iconst_0
/*      */     //   2611: istore #38
/*      */     //   2613: iload #40
/*      */     //   2615: i2f
/*      */     //   2616: invokestatic constructor-impl : (F)F
/*      */     //   2619: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*      */     //   2622: astore #37
/*      */     //   2624: iload_3
/*      */     //   2625: ifeq -> 2637
/*      */     //   2628: iload #4
/*      */     //   2630: ifeq -> 2637
/*      */     //   2633: iconst_1
/*      */     //   2634: goto -> 2638
/*      */     //   2637: iconst_0
/*      */     //   2638: istore #40
/*      */     //   2640: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   2643: aload #34
/*      */     //   2645: bipush #6
/*      */     //   2647: invokestatic getDefaultButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*      */     //   2650: aconst_null
/*      */     //   2651: iconst_0
/*      */     //   2652: aload #34
/*      */     //   2654: iconst_0
/*      */     //   2655: iconst_3
/*      */     //   2656: invokestatic withRoundedCornerShape : (Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/foundation/shape/CornerSize;ZLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;
/*      */     //   2659: astore #38
/*      */     //   2661: aload #34
/*      */     //   2663: ldc_w -126091008
/*      */     //   2666: invokeinterface startReplaceGroup : (I)V
/*      */     //   2671: aload #34
/*      */     //   2673: astore #41
/*      */     //   2675: iload #9
/*      */     //   2677: bipush #14
/*      */     //   2679: iand
/*      */     //   2680: iconst_4
/*      */     //   2681: if_icmpeq -> 2703
/*      */     //   2684: iload #9
/*      */     //   2686: bipush #8
/*      */     //   2688: iand
/*      */     //   2689: ifeq -> 2707
/*      */     //   2692: aload #7
/*      */     //   2694: aload_0
/*      */     //   2695: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   2700: ifeq -> 2707
/*      */     //   2703: iconst_1
/*      */     //   2704: goto -> 2708
/*      */     //   2707: iconst_0
/*      */     //   2708: iload #9
/*      */     //   2710: ldc_w 458752
/*      */     //   2713: iand
/*      */     //   2714: ldc 131072
/*      */     //   2716: if_icmpne -> 2723
/*      */     //   2719: iconst_1
/*      */     //   2720: goto -> 2724
/*      */     //   2723: iconst_0
/*      */     //   2724: ior
/*      */     //   2725: istore #42
/*      */     //   2727: nop
/*      */     //   2728: iconst_0
/*      */     //   2729: istore #43
/*      */     //   2731: aload #41
/*      */     //   2733: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   2738: astore #44
/*      */     //   2740: iconst_0
/*      */     //   2741: istore #45
/*      */     //   2743: iload #42
/*      */     //   2745: ifne -> 2759
/*      */     //   2748: aload #44
/*      */     //   2750: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   2753: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   2756: if_acmpne -> 2786
/*      */     //   2759: iconst_0
/*      */     //   2760: istore #46
/*      */     //   2762: aload_0
/*      */     //   2763: aload #5
/*      */     //   2765: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;)Lkotlin/jvm/functions/Function0;
/*      */     //   2770: astore #47
/*      */     //   2772: aload #41
/*      */     //   2774: aload #47
/*      */     //   2776: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   2781: aload #47
/*      */     //   2783: goto -> 2788
/*      */     //   2786: aload #44
/*      */     //   2788: nop
/*      */     //   2789: nop
/*      */     //   2790: nop
/*      */     //   2791: checkcast kotlin/jvm/functions/Function0
/*      */     //   2794: astore #39
/*      */     //   2796: aload #34
/*      */     //   2798: invokeinterface endReplaceGroup : ()V
/*      */     //   2803: aload #39
/*      */     //   2805: aload #37
/*      */     //   2807: iload #40
/*      */     //   2809: aconst_null
/*      */     //   2810: aload #38
/*      */     //   2812: aconst_null
/*      */     //   2813: ldc_w -423650055
/*      */     //   2816: iconst_1
/*      */     //   2817: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptRow$1$3
/*      */     //   2820: dup
/*      */     //   2821: iload_3
/*      */     //   2822: iload #4
/*      */     //   2824: invokespecial <init> : (ZZ)V
/*      */     //   2827: aload #34
/*      */     //   2829: bipush #54
/*      */     //   2831: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   2834: checkcast kotlin/jvm/functions/Function3
/*      */     //   2837: aload #34
/*      */     //   2839: ldc_w 1572912
/*      */     //   2842: bipush #40
/*      */     //   2844: invokestatic DefaultButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*      */     //   2847: nop
/*      */     //   2848: aload #31
/*      */     //   2850: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2853: aload #7
/*      */     //   2855: invokeinterface endNode : ()V
/*      */     //   2860: aload #7
/*      */     //   2862: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2865: nop
/*      */     //   2866: aload #7
/*      */     //   2868: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2871: nop
/*      */     //   2872: aload #7
/*      */     //   2874: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2877: nop
/*      */     //   2878: invokestatic isTraceInProgress : ()Z
/*      */     //   2881: ifeq -> 2897
/*      */     //   2884: invokestatic traceEventEnd : ()V
/*      */     //   2887: goto -> 2897
/*      */     //   2890: aload #7
/*      */     //   2892: invokeinterface skipToGroupEnd : ()V
/*      */     //   2897: aload #7
/*      */     //   2899: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   2904: dup
/*      */     //   2905: ifnull -> 2933
/*      */     //   2908: aload_0
/*      */     //   2909: iload_1
/*      */     //   2910: aload_2
/*      */     //   2911: iload_3
/*      */     //   2912: iload #4
/*      */     //   2914: aload #5
/*      */     //   2916: aload #6
/*      */     //   2918: iload #8
/*      */     //   2920: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;ZLcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;ZZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*      */     //   2925: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   2930: goto -> 2934
/*      */     //   2933: pop
/*      */     //   2934: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #262	-> 0
/*      */     //   #264	-> 305
/*      */     //   #265	-> 326
/*      */     //   #266	-> 334
/*      */     //   #263	-> 347
/*      */     //   #720	-> 359
/*      */     //   #721	-> 362
/*      */     //   #722	-> 400
/*      */     //   #723	-> 412
/*      */     //   #724	-> 418
/*      */     //   #725	-> 425
/*      */     //   #726	-> 434
/*      */     //   #728	-> 441
/*      */     //   #727	-> 463
/*      */     //   #729	-> 475
/*      */     //   #730	-> 478
/*      */     //   #731	-> 496
/*      */     //   #732	-> 501
/*      */     //   #733	-> 513
/*      */     //   #735	-> 525
/*      */     //   #737	-> 530
/*      */     //   #738	-> 540
/*      */     //   #739	-> 553
/*      */     //   #741	-> 566
/*      */     //   #742	-> 577
/*      */     //   #743	-> 584
/*      */     //   #744	-> 612
/*      */     //   #745	-> 624
/*      */     //   #747	-> 638
/*      */     //   #742	-> 639
/*      */     //   #747	-> 640
/*      */     //   #748	-> 641
/*      */     //   #749	-> 654
/*      */     //   #737	-> 655
/*      */     //   #750	-> 656
/*      */     //   #751	-> 681
/*      */     //   #269	-> 712
/*      */     //   #270	-> 720
/*      */     //   #752	-> 730
/*      */     //   #270	-> 736
/*      */     //   #268	-> 746
/*      */     //   #753	-> 758
/*      */     //   #754	-> 761
/*      */     //   #759	-> 769
/*      */     //   #760	-> 807
/*      */     //   #761	-> 819
/*      */     //   #762	-> 825
/*      */     //   #763	-> 832
/*      */     //   #764	-> 841
/*      */     //   #766	-> 848
/*      */     //   #765	-> 870
/*      */     //   #767	-> 882
/*      */     //   #768	-> 885
/*      */     //   #769	-> 903
/*      */     //   #770	-> 908
/*      */     //   #771	-> 920
/*      */     //   #773	-> 932
/*      */     //   #775	-> 937
/*      */     //   #776	-> 947
/*      */     //   #777	-> 960
/*      */     //   #779	-> 973
/*      */     //   #780	-> 984
/*      */     //   #781	-> 991
/*      */     //   #782	-> 1019
/*      */     //   #783	-> 1031
/*      */     //   #785	-> 1045
/*      */     //   #780	-> 1046
/*      */     //   #785	-> 1047
/*      */     //   #786	-> 1048
/*      */     //   #787	-> 1061
/*      */     //   #775	-> 1062
/*      */     //   #788	-> 1063
/*      */     //   #789	-> 1088
/*      */     //   #273	-> 1119
/*      */     //   #790	-> 1155
/*      */     //   #791	-> 1167
/*      */     //   #792	-> 1183
/*      */     //   #273	-> 1186
/*      */     //   #792	-> 1198
/*      */     //   #793	-> 1200
/*      */     //   #794	-> 1209
/*      */     //   #795	-> 1214
/*      */     //   #791	-> 1216
/*      */     //   #790	-> 1217
/*      */     //   #790	-> 1218
/*      */     //   #273	-> 1219
/*      */     //   #274	-> 1235
/*      */     //   #796	-> 1271
/*      */     //   #797	-> 1283
/*      */     //   #798	-> 1299
/*      */     //   #274	-> 1302
/*      */     //   #798	-> 1314
/*      */     //   #799	-> 1316
/*      */     //   #800	-> 1325
/*      */     //   #801	-> 1330
/*      */     //   #797	-> 1332
/*      */     //   #796	-> 1333
/*      */     //   #796	-> 1334
/*      */     //   #274	-> 1335
/*      */     //   #275	-> 1351
/*      */     //   #802	-> 1387
/*      */     //   #803	-> 1399
/*      */     //   #804	-> 1415
/*      */     //   #275	-> 1418
/*      */     //   #804	-> 1430
/*      */     //   #805	-> 1432
/*      */     //   #806	-> 1441
/*      */     //   #807	-> 1446
/*      */     //   #803	-> 1448
/*      */     //   #802	-> 1449
/*      */     //   #802	-> 1450
/*      */     //   #275	-> 1451
/*      */     //   #276	-> 1467
/*      */     //   #808	-> 1503
/*      */     //   #809	-> 1515
/*      */     //   #810	-> 1531
/*      */     //   #276	-> 1534
/*      */     //   #810	-> 1546
/*      */     //   #811	-> 1548
/*      */     //   #812	-> 1557
/*      */     //   #813	-> 1562
/*      */     //   #809	-> 1564
/*      */     //   #808	-> 1565
/*      */     //   #808	-> 1566
/*      */     //   #276	-> 1567
/*      */     //   #277	-> 1583
/*      */     //   #814	-> 1619
/*      */     //   #815	-> 1631
/*      */     //   #816	-> 1647
/*      */     //   #277	-> 1650
/*      */     //   #816	-> 1662
/*      */     //   #817	-> 1664
/*      */     //   #818	-> 1673
/*      */     //   #819	-> 1678
/*      */     //   #815	-> 1680
/*      */     //   #814	-> 1681
/*      */     //   #814	-> 1682
/*      */     //   #277	-> 1683
/*      */     //   #273	-> 1699
/*      */     //   #274	-> 1704
/*      */     //   #275	-> 1709
/*      */     //   #276	-> 1714
/*      */     //   #278	-> 1768
/*      */     //   #820	-> 1772
/*      */     //   #821	-> 1784
/*      */     //   #822	-> 1800
/*      */     //   #278	-> 1811
/*      */     //   #822	-> 1829
/*      */     //   #823	-> 1831
/*      */     //   #824	-> 1840
/*      */     //   #825	-> 1845
/*      */     //   #821	-> 1847
/*      */     //   #820	-> 1848
/*      */     //   #820	-> 1849
/*      */     //   #278	-> 1850
/*      */     //   #277	-> 1864
/*      */     //   #279	-> 1918
/*      */     //   #826	-> 1922
/*      */     //   #827	-> 1934
/*      */     //   #828	-> 1950
/*      */     //   #279	-> 1965
/*      */     //   #828	-> 1987
/*      */     //   #829	-> 1989
/*      */     //   #830	-> 1998
/*      */     //   #831	-> 2003
/*      */     //   #827	-> 2005
/*      */     //   #826	-> 2006
/*      */     //   #826	-> 2007
/*      */     //   #279	-> 2008
/*      */     //   #280	-> 2071
/*      */     //   #832	-> 2075
/*      */     //   #833	-> 2087
/*      */     //   #834	-> 2103
/*      */     //   #280	-> 2120
/*      */     //   #834	-> 2144
/*      */     //   #835	-> 2146
/*      */     //   #836	-> 2155
/*      */     //   #837	-> 2160
/*      */     //   #833	-> 2162
/*      */     //   #832	-> 2163
/*      */     //   #832	-> 2164
/*      */     //   #280	-> 2165
/*      */     //   #281	-> 2228
/*      */     //   #838	-> 2232
/*      */     //   #839	-> 2244
/*      */     //   #840	-> 2260
/*      */     //   #281	-> 2279
/*      */     //   #840	-> 2311
/*      */     //   #841	-> 2313
/*      */     //   #842	-> 2322
/*      */     //   #843	-> 2327
/*      */     //   #839	-> 2329
/*      */     //   #838	-> 2330
/*      */     //   #838	-> 2331
/*      */     //   #281	-> 2332
/*      */     //   #272	-> 2349
/*      */     //   #284	-> 2362
/*      */     //   #285	-> 2371
/*      */     //   #289	-> 2399
/*      */     //   #290	-> 2424
/*      */     //   #844	-> 2428
/*      */     //   #845	-> 2440
/*      */     //   #846	-> 2456
/*      */     //   #290	-> 2461
/*      */     //   #846	-> 2473
/*      */     //   #847	-> 2475
/*      */     //   #848	-> 2484
/*      */     //   #849	-> 2489
/*      */     //   #845	-> 2491
/*      */     //   #844	-> 2492
/*      */     //   #844	-> 2493
/*      */     //   #290	-> 2494
/*      */     //   #288	-> 2537
/*      */     //   #316	-> 2540
/*      */     //   #789	-> 2541
/*      */     //   #788	-> 2546
/*      */     //   #850	-> 2548
/*      */     //   #767	-> 2555
/*      */     //   #851	-> 2558
/*      */     //   #761	-> 2561
/*      */     //   #852	-> 2564
/*      */     //   #753	-> 2567
/*      */     //   #853	-> 2570
/*      */     //   #320	-> 2571
/*      */     //   #321	-> 2577
/*      */     //   #854	-> 2584
/*      */     //   #321	-> 2590
/*      */     //   #854	-> 2597
/*      */     //   #321	-> 2603
/*      */     //   #322	-> 2606
/*      */     //   #855	-> 2613
/*      */     //   #322	-> 2619
/*      */     //   #323	-> 2624
/*      */     //   #324	-> 2640
/*      */     //   #325	-> 2727
/*      */     //   #856	-> 2731
/*      */     //   #857	-> 2743
/*      */     //   #858	-> 2759
/*      */     //   #325	-> 2762
/*      */     //   #858	-> 2770
/*      */     //   #859	-> 2772
/*      */     //   #860	-> 2781
/*      */     //   #861	-> 2786
/*      */     //   #857	-> 2788
/*      */     //   #856	-> 2789
/*      */     //   #856	-> 2790
/*      */     //   #325	-> 2791
/*      */     //   #322	-> 2805
/*      */     //   #323	-> 2807
/*      */     //   #324	-> 2810
/*      */     //   #326	-> 2813
/*      */     //   #318	-> 2844
/*      */     //   #338	-> 2847
/*      */     //   #751	-> 2848
/*      */     //   #750	-> 2853
/*      */     //   #862	-> 2855
/*      */     //   #729	-> 2862
/*      */     //   #863	-> 2865
/*      */     //   #723	-> 2868
/*      */     //   #864	-> 2871
/*      */     //   #720	-> 2874
/*      */     //   #865	-> 2877
/*      */     //   #339	-> 2890
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   730	6	39	$i$f$getDp	I
/*      */     //   727	9	38	$this$dp$iv	I
/*      */     //   1186	12	70	$i$a$-cache-PromptAreaKt$PromptRow$1$1$1	I
/*      */     //   1200	11	71	value$iv	Ljava/lang/Object;
/*      */     //   1167	50	69	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1164	53	68	it$iv	Ljava/lang/Object;
/*      */     //   1155	64	67	$i$f$cache	I
/*      */     //   1152	67	65	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1152	67	66	invalid$iv	Z
/*      */     //   1302	12	71	$i$a$-cache-PromptAreaKt$PromptRow$1$1$2	I
/*      */     //   1316	11	74	value$iv	Ljava/lang/Object;
/*      */     //   1283	50	70	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1280	53	69	it$iv	Ljava/lang/Object;
/*      */     //   1271	64	68	$i$f$cache	I
/*      */     //   1268	67	66	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1268	67	67	invalid$iv	Z
/*      */     //   1418	12	74	$i$a$-cache-PromptAreaKt$PromptRow$1$1$3	I
/*      */     //   1432	11	75	value$iv	Ljava/lang/Object;
/*      */     //   1399	50	71	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1396	53	70	it$iv	Ljava/lang/Object;
/*      */     //   1387	64	69	$i$f$cache	I
/*      */     //   1384	67	67	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1384	67	68	invalid$iv	Z
/*      */     //   1534	12	75	$i$a$-cache-PromptAreaKt$PromptRow$1$1$4	I
/*      */     //   1548	11	76	value$iv	Ljava/lang/Object;
/*      */     //   1515	50	74	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1512	53	71	it$iv	Ljava/lang/Object;
/*      */     //   1503	64	70	$i$f$cache	I
/*      */     //   1500	67	68	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1500	67	69	invalid$iv	Z
/*      */     //   1650	12	76	$i$a$-cache-PromptAreaKt$PromptRow$1$1$5	I
/*      */     //   1664	11	77	value$iv	Ljava/lang/Object;
/*      */     //   1631	50	75	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1628	53	74	it$iv	Ljava/lang/Object;
/*      */     //   1619	64	71	$i$f$cache	I
/*      */     //   1616	67	69	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1616	67	70	invalid$iv	Z
/*      */     //   1811	6	75	$i$a$-cache-PromptAreaKt$PromptRow$1$1$6	I
/*      */     //   1831	11	76	value$iv	Ljava/lang/Object;
/*      */     //   1784	64	74	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1781	67	71	it$iv	Ljava/lang/Object;
/*      */     //   1772	78	70	$i$f$cache	I
/*      */     //   1769	81	68	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1769	81	69	invalid$iv	Z
/*      */     //   1965	6	75	$i$a$-cache-PromptAreaKt$PromptRow$1$1$7	I
/*      */     //   1989	11	76	value$iv	Ljava/lang/Object;
/*      */     //   1934	72	74	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1931	75	71	it$iv	Ljava/lang/Object;
/*      */     //   1922	86	70	$i$f$cache	I
/*      */     //   1919	89	68	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1919	89	69	invalid$iv	Z
/*      */     //   2120	6	75	$i$a$-cache-PromptAreaKt$PromptRow$1$1$8	I
/*      */     //   2146	11	76	value$iv	Ljava/lang/Object;
/*      */     //   2087	76	74	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   2084	79	71	it$iv	Ljava/lang/Object;
/*      */     //   2075	90	70	$i$f$cache	I
/*      */     //   2072	93	68	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   2072	93	69	invalid$iv	Z
/*      */     //   2279	12	75	$i$a$-cache-PromptAreaKt$PromptRow$1$1$9	I
/*      */     //   2313	11	76	value$iv	Ljava/lang/Object;
/*      */     //   2244	86	74	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   2241	89	71	it$iv	Ljava/lang/Object;
/*      */     //   2232	100	70	$i$f$cache	I
/*      */     //   2229	103	68	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   2229	103	69	invalid$iv	Z
/*      */     //   2461	6	68	$i$a$-cache-PromptAreaKt$PromptRow$1$1$10	I
/*      */     //   2475	11	69	value$iv	Ljava/lang/Object;
/*      */     //   2440	52	67	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   2437	55	66	it$iv	Ljava/lang/Object;
/*      */     //   2428	66	65	$i$f$cache	I
/*      */     //   2425	69	64	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   2425	69	72	invalid$iv	Z
/*      */     //   1119	1422	63	$i$a$-Row-PromptAreaKt$PromptRow$1$1	I
/*      */     //   1116	1425	62	$this$PromptRow_u24lambda_u2454_u24lambda_u2451	Landroidx/compose/foundation/layout/RowScope;
/*      */     //   1116	1425	61	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   1116	1425	60	$changed	I
/*      */     //   1080	1466	59	$i$a$-Layout-RowKt$Row$1$iv	I
/*      */     //   1077	1469	58	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1077	1469	57	$changed$iv	I
/*      */     //   991	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   988	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   984	64	54	$i$f$set-impl	I
/*      */     //   981	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   947	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   944	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   874	1685	50	$i$f$ReusableComposeNode	I
/*      */     //   871	1688	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   871	1688	49	$changed$iv$iv$iv	I
/*      */     //   811	1754	44	$i$f$Layout	I
/*      */     //   830	1735	45	compositeKeyHash$iv$iv	I
/*      */     //   839	1726	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   848	1717	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   808	1757	43	$changed$iv$iv	I
/*      */     //   750	1821	41	$i$f$Row	I
/*      */     //   798	1773	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   769	1802	38	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   747	1824	39	$changed$iv	I
/*      */     //   2584	6	38	$i$f$getDp	I
/*      */     //   2581	9	40	$this$dp$iv	I
/*      */     //   2597	6	38	$i$f$getDp	I
/*      */     //   2594	9	40	$this$dp$iv	I
/*      */     //   2613	6	38	$i$f$getDp	I
/*      */     //   2610	9	40	$this$dp$iv	I
/*      */     //   2762	8	46	$i$a$-cache-PromptAreaKt$PromptRow$1$2	I
/*      */     //   2772	11	47	value$iv	Ljava/lang/Object;
/*      */     //   2743	46	45	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   2740	49	44	it$iv	Ljava/lang/Object;
/*      */     //   2731	60	43	$i$f$cache	I
/*      */     //   2728	63	41	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   2728	63	42	invalid$iv	Z
/*      */     //   712	2136	36	$i$a$-Row-PromptAreaKt$PromptRow$1	I
/*      */     //   709	2139	35	$this$PromptRow_u24lambda_u2454	Landroidx/compose/foundation/layout/RowScope;
/*      */     //   709	2139	34	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   709	2139	33	$changed	I
/*      */     //   673	2180	32	$i$a$-Layout-RowKt$Row$1$iv	I
/*      */     //   670	2183	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   670	2183	30	$changed$iv	I
/*      */     //   584	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   581	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   577	64	27	$i$f$set-impl	I
/*      */     //   574	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   540	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   537	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   467	2399	23	$i$f$ReusableComposeNode	I
/*      */     //   464	2402	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   464	2402	22	$changed$iv$iv$iv	I
/*      */     //   404	2468	17	$i$f$Layout	I
/*      */     //   423	2449	18	compositeKeyHash$iv$iv	I
/*      */     //   432	2440	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   441	2431	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   401	2471	16	$changed$iv$iv	I
/*      */     //   351	2527	14	$i$f$Row	I
/*      */     //   391	2487	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   348	2530	13	$changed$iv	I
/*      */     //   16	2919	9	$dirty	I
/*      */     //   0	2935	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;
/*      */     //   0	2935	1	braveMode	Z
/*      */     //   0	2935	2	settings	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
/*      */     //   0	2935	3	textAreaContentState	Z
/*      */     //   0	2935	4	enabled	Z
/*      */     //   0	2935	5	promptMode	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;
/*      */     //   0	2935	6	promptSelectorContent	Lkotlin/jvm/functions/Function2;
/*      */     //   0	2935	7	$composer	Landroidx/compose/runtime/Composer;
/* 1043 */     //   0	2935	8	$changed	I } private static final Unit PromptRow$lambda$54$lambda$51$lambda$43$lambda$42(PromptOwnerViewModel $model) { $model.getAttachedFiles().createPlaceholderGuidelineFile$ej_ui($model.getTextState()); return Unit.INSTANCE; } private static final Unit PromptRow$lambda$54$lambda$51$lambda$45$lambda$44(PromptOwnerViewModel $model) { $model.getAttachedFiles().createAIIgnoreFile$ej_ui($model.getTextState()); return Unit.INSTANCE; } private static final boolean JunieFilePickerButton$lambda$57(MutableState $shouldShowFilePickerDialog$delegate) { State state = (State)$shouldShowFilePickerDialog$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final Unit PromptRow$lambda$54$lambda$51$lambda$47$lambda$46(PromptOwnerViewModel $model) { $model.getAttachedFiles().openAIIgnoreFile$ej_ui(); return Unit.INSTANCE; } @DebugMetadata(f = "PromptArea.kt", l = {281}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptAreaKt$PromptRow$1$1$9$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class PromptAreaKt$PromptRow$1$1$9$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
/* 1044 */     int label; PromptAreaKt$PromptRow$1$1$9$1(PromptOwnerViewModel $model, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$model.getAttachedFiles().hasAIIgnoreFile$ej_ui((Continuation<? super Boolean>)this) == object) ? object : this.$model.getAttachedFiles().hasAIIgnoreFile$ej_ui((Continuation<? super Boolean>)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super PromptAreaKt$PromptRow$1$1$9$1> $completion) { return (Continuation<Unit>)new PromptAreaKt$PromptRow$1$1$9$1(this.$model, $completion); } public final Object invoke(Continuation<?> p1) { return ((PromptAreaKt$PromptRow$1$1$9$1)create(p1)).invokeSuspend(Unit.INSTANCE); } } private static final Unit PromptRow$lambda$54$lambda$51$lambda$50$lambda$49(MatterhornModelPersistentStateComponent $settings, boolean it) { $settings.setBraveMode(it); CompositeUiAction.INSTANCE.logCommandAutoApproveChecked(it); return Unit.INSTANCE; } private static final void JunieFilePickerButton$lambda$58(MutableState $shouldShowFilePickerDialog$delegate, boolean <set-?>) { MutableState mutableState = $shouldShowFilePickerDialog$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } private static final Unit PromptRow$lambda$54$lambda$53$lambda$52(PromptOwnerViewModel $model, PromptMode $promptMode) { $model.submitTask($promptMode); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nPromptArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptRow$1$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,472:1\n149#2:473\n*S KotlinDebug\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$PromptRow$1$3\n*L\n328#1:473\n*E\n"}) static final class PromptAreaKt$PromptRow$1$3 implements Function3<RowScope, Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(RowScope $this$DefaultButton, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$DefaultButton, "$this$DefaultButton"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-423650055, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptRow.<anonymous>.<anonymous> (PromptArea.kt:326)");  int $this$dp$iv = 16, $i$f$getDp = 0; Modifier modifier = SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)); IntelliJIconKey intelliJIconKey = AllIconsKeys.Actions.INSTANCE.getForward(); $composer.startReplaceGroup(-1368861103); long l2 = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getArrowRightIconTint-0d7_KjU(); $composer.endReplaceGroup(); $composer.startReplaceGroup(-1368859335); l2 = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getArrowRightInactiveIconTint-0d7_KjU(); $composer.endReplaceGroup(); long l1 = (this.$textAreaContentState && this.$enabled) ? l2 : l2; IconKt.Icon-FHprtrg((IconKey)intelliJIconKey, "Submit", modifier, null, l1, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 0x1B0 | IntelliJIconKey.$stable, 8); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } PromptAreaKt$PromptRow$1$3(boolean $textAreaContentState, boolean $enabled) {} } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void JunieFilePickerButton(Function0 getRecentFiles, Function0 getGuidelines, Function1 onFileChosen, Function0 openProjectFilePicker, Function0 onCreateNewGuidelines, Function1 onSelectGuidelines, Function0 onCreateAiIgnoreFile, Function0 onOpenAiIgnoreFile, Function1 hasAIIgnoreFile, Composer $composer, int $changed) { // Byte code:
/*      */     //   0: aload #9
/*      */     //   2: ldc_w 114356099
/*      */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   10: astore #9
/*      */     //   12: iload #10
/*      */     //   14: istore #11
/*      */     //   16: iload #10
/*      */     //   18: bipush #6
/*      */     //   20: iand
/*      */     //   21: ifne -> 45
/*      */     //   24: iload #11
/*      */     //   26: aload #9
/*      */     //   28: aload_0
/*      */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   34: ifeq -> 41
/*      */     //   37: iconst_4
/*      */     //   38: goto -> 42
/*      */     //   41: iconst_2
/*      */     //   42: ior
/*      */     //   43: istore #11
/*      */     //   45: iload #10
/*      */     //   47: bipush #48
/*      */     //   49: iand
/*      */     //   50: ifne -> 76
/*      */     //   53: iload #11
/*      */     //   55: aload #9
/*      */     //   57: aload_1
/*      */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   63: ifeq -> 71
/*      */     //   66: bipush #32
/*      */     //   68: goto -> 73
/*      */     //   71: bipush #16
/*      */     //   73: ior
/*      */     //   74: istore #11
/*      */     //   76: iload #10
/*      */     //   78: sipush #384
/*      */     //   81: iand
/*      */     //   82: ifne -> 110
/*      */     //   85: iload #11
/*      */     //   87: aload #9
/*      */     //   89: aload_2
/*      */     //   90: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   95: ifeq -> 104
/*      */     //   98: sipush #256
/*      */     //   101: goto -> 107
/*      */     //   104: sipush #128
/*      */     //   107: ior
/*      */     //   108: istore #11
/*      */     //   110: iload #10
/*      */     //   112: sipush #3072
/*      */     //   115: iand
/*      */     //   116: ifne -> 144
/*      */     //   119: iload #11
/*      */     //   121: aload #9
/*      */     //   123: aload_3
/*      */     //   124: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   129: ifeq -> 138
/*      */     //   132: sipush #2048
/*      */     //   135: goto -> 141
/*      */     //   138: sipush #1024
/*      */     //   141: ior
/*      */     //   142: istore #11
/*      */     //   144: iload #10
/*      */     //   146: sipush #24576
/*      */     //   149: iand
/*      */     //   150: ifne -> 179
/*      */     //   153: iload #11
/*      */     //   155: aload #9
/*      */     //   157: aload #4
/*      */     //   159: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   164: ifeq -> 173
/*      */     //   167: sipush #16384
/*      */     //   170: goto -> 176
/*      */     //   173: sipush #8192
/*      */     //   176: ior
/*      */     //   177: istore #11
/*      */     //   179: iload #10
/*      */     //   181: ldc 196608
/*      */     //   183: iand
/*      */     //   184: ifne -> 211
/*      */     //   187: iload #11
/*      */     //   189: aload #9
/*      */     //   191: aload #5
/*      */     //   193: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   198: ifeq -> 206
/*      */     //   201: ldc 131072
/*      */     //   203: goto -> 208
/*      */     //   206: ldc 65536
/*      */     //   208: ior
/*      */     //   209: istore #11
/*      */     //   211: iload #10
/*      */     //   213: ldc_w 1572864
/*      */     //   216: iand
/*      */     //   217: ifne -> 246
/*      */     //   220: iload #11
/*      */     //   222: aload #9
/*      */     //   224: aload #6
/*      */     //   226: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   231: ifeq -> 240
/*      */     //   234: ldc_w 1048576
/*      */     //   237: goto -> 243
/*      */     //   240: ldc_w 524288
/*      */     //   243: ior
/*      */     //   244: istore #11
/*      */     //   246: iload #10
/*      */     //   248: ldc_w 12582912
/*      */     //   251: iand
/*      */     //   252: ifne -> 281
/*      */     //   255: iload #11
/*      */     //   257: aload #9
/*      */     //   259: aload #7
/*      */     //   261: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   266: ifeq -> 275
/*      */     //   269: ldc_w 8388608
/*      */     //   272: goto -> 278
/*      */     //   275: ldc_w 4194304
/*      */     //   278: ior
/*      */     //   279: istore #11
/*      */     //   281: iload #10
/*      */     //   283: ldc_w 100663296
/*      */     //   286: iand
/*      */     //   287: ifne -> 316
/*      */     //   290: iload #11
/*      */     //   292: aload #9
/*      */     //   294: aload #8
/*      */     //   296: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   301: ifeq -> 310
/*      */     //   304: ldc_w 67108864
/*      */     //   307: goto -> 313
/*      */     //   310: ldc_w 33554432
/*      */     //   313: ior
/*      */     //   314: istore #11
/*      */     //   316: iload #11
/*      */     //   318: ldc_w 38347923
/*      */     //   321: iand
/*      */     //   322: ldc_w 38347922
/*      */     //   325: if_icmpne -> 338
/*      */     //   328: aload #9
/*      */     //   330: invokeinterface getSkipping : ()Z
/*      */     //   335: ifne -> 1295
/*      */     //   338: invokestatic isTraceInProgress : ()Z
/*      */     //   341: ifeq -> 356
/*      */     //   344: ldc_w 114356099
/*      */     //   347: iload #11
/*      */     //   349: iconst_m1
/*      */     //   350: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.JunieFilePickerButton (PromptArea.kt:351)'
/*      */     //   353: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   356: aload #9
/*      */     //   358: ldc_w -1509266456
/*      */     //   361: invokeinterface startReplaceGroup : (I)V
/*      */     //   366: aload #9
/*      */     //   368: astore #14
/*      */     //   370: iconst_0
/*      */     //   371: istore #15
/*      */     //   373: nop
/*      */     //   374: iconst_0
/*      */     //   375: istore #16
/*      */     //   377: aload #14
/*      */     //   379: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   384: astore #17
/*      */     //   386: iconst_0
/*      */     //   387: istore #18
/*      */     //   389: aload #17
/*      */     //   391: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   394: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   397: if_acmpne -> 429
/*      */     //   400: iconst_0
/*      */     //   401: istore #19
/*      */     //   403: iconst_0
/*      */     //   404: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   407: aconst_null
/*      */     //   408: iconst_2
/*      */     //   409: aconst_null
/*      */     //   410: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   413: astore #19
/*      */     //   415: aload #14
/*      */     //   417: aload #19
/*      */     //   419: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   424: aload #19
/*      */     //   426: goto -> 431
/*      */     //   429: aload #17
/*      */     //   431: nop
/*      */     //   432: nop
/*      */     //   433: nop
/*      */     //   434: checkcast androidx/compose/runtime/MutableState
/*      */     //   437: astore #13
/*      */     //   439: aload #9
/*      */     //   441: invokeinterface endReplaceGroup : ()V
/*      */     //   446: aload #13
/*      */     //   448: astore #12
/*      */     //   450: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   453: checkcast androidx/compose/ui/Modifier
/*      */     //   456: iconst_4
/*      */     //   457: istore #14
/*      */     //   459: iconst_0
/*      */     //   460: istore #15
/*      */     //   462: iload #14
/*      */     //   464: i2f
/*      */     //   465: invokestatic constructor-impl : (F)F
/*      */     //   468: fconst_0
/*      */     //   469: fconst_0
/*      */     //   470: fconst_0
/*      */     //   471: bipush #14
/*      */     //   473: aconst_null
/*      */     //   474: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   477: astore #13
/*      */     //   479: aload #9
/*      */     //   481: ldc_w -1509257843
/*      */     //   484: invokeinterface startReplaceGroup : (I)V
/*      */     //   489: aload #9
/*      */     //   491: astore #16
/*      */     //   493: iconst_0
/*      */     //   494: istore #17
/*      */     //   496: nop
/*      */     //   497: iconst_0
/*      */     //   498: istore #18
/*      */     //   500: aload #16
/*      */     //   502: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   507: astore #19
/*      */     //   509: iconst_0
/*      */     //   510: istore #20
/*      */     //   512: aload #19
/*      */     //   514: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   517: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   520: if_acmpne -> 545
/*      */     //   523: iconst_0
/*      */     //   524: istore #21
/*      */     //   526: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   529: astore #21
/*      */     //   531: aload #16
/*      */     //   533: aload #21
/*      */     //   535: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   540: aload #21
/*      */     //   542: goto -> 547
/*      */     //   545: aload #19
/*      */     //   547: nop
/*      */     //   548: nop
/*      */     //   549: nop
/*      */     //   550: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   553: astore #15
/*      */     //   555: aload #9
/*      */     //   557: invokeinterface endReplaceGroup : ()V
/*      */     //   562: aload #15
/*      */     //   564: astore #14
/*      */     //   566: aload #13
/*      */     //   568: aload #14
/*      */     //   570: aconst_null
/*      */     //   571: iconst_0
/*      */     //   572: aconst_null
/*      */     //   573: aconst_null
/*      */     //   574: aload #9
/*      */     //   576: ldc_w -1509262775
/*      */     //   579: invokeinterface startReplaceGroup : (I)V
/*      */     //   584: aload #9
/*      */     //   586: astore #16
/*      */     //   588: iconst_0
/*      */     //   589: istore #17
/*      */     //   591: nop
/*      */     //   592: iconst_0
/*      */     //   593: istore #18
/*      */     //   595: aload #16
/*      */     //   597: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   602: astore #19
/*      */     //   604: iconst_0
/*      */     //   605: istore #20
/*      */     //   607: aload #19
/*      */     //   609: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   612: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   615: if_acmpne -> 672
/*      */     //   618: astore #45
/*      */     //   620: astore #44
/*      */     //   622: istore #43
/*      */     //   624: astore #42
/*      */     //   626: astore #41
/*      */     //   628: astore #40
/*      */     //   630: iconst_0
/*      */     //   631: istore #21
/*      */     //   633: aload #12
/*      */     //   635: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*      */     //   640: astore #46
/*      */     //   642: aload #40
/*      */     //   644: aload #41
/*      */     //   646: aload #42
/*      */     //   648: iload #43
/*      */     //   650: aload #44
/*      */     //   652: aload #45
/*      */     //   654: aload #46
/*      */     //   656: astore #22
/*      */     //   658: aload #16
/*      */     //   660: aload #22
/*      */     //   662: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   667: aload #22
/*      */     //   669: goto -> 674
/*      */     //   672: aload #19
/*      */     //   674: nop
/*      */     //   675: nop
/*      */     //   676: nop
/*      */     //   677: checkcast kotlin/jvm/functions/Function0
/*      */     //   680: astore #15
/*      */     //   682: aload #9
/*      */     //   684: invokeinterface endReplaceGroup : ()V
/*      */     //   689: aload #15
/*      */     //   691: bipush #28
/*      */     //   693: aconst_null
/*      */     //   694: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   697: astore #13
/*      */     //   699: iconst_0
/*      */     //   700: istore #16
/*      */     //   702: nop
/*      */     //   703: iconst_0
/*      */     //   704: istore #17
/*      */     //   706: aload #9
/*      */     //   708: ldc_w 733328855
/*      */     //   711: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   714: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   717: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   720: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   723: astore #14
/*      */     //   725: iconst_0
/*      */     //   726: istore #15
/*      */     //   728: aload #14
/*      */     //   730: iload #15
/*      */     //   732: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   735: astore #18
/*      */     //   737: bipush #112
/*      */     //   739: iload #16
/*      */     //   741: iconst_3
/*      */     //   742: ishl
/*      */     //   743: iand
/*      */     //   744: istore #19
/*      */     //   746: nop
/*      */     //   747: iconst_0
/*      */     //   748: istore #20
/*      */     //   750: aload #9
/*      */     //   752: ldc_w -1323940314
/*      */     //   755: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   758: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   761: aload #9
/*      */     //   763: iconst_0
/*      */     //   764: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   767: istore #21
/*      */     //   769: aload #9
/*      */     //   771: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   776: astore #22
/*      */     //   778: aload #9
/*      */     //   780: aload #13
/*      */     //   782: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   785: astore #23
/*      */     //   787: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   790: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   793: astore #24
/*      */     //   795: bipush #6
/*      */     //   797: sipush #896
/*      */     //   800: iload #19
/*      */     //   802: bipush #6
/*      */     //   804: ishl
/*      */     //   805: iand
/*      */     //   806: ior
/*      */     //   807: istore #25
/*      */     //   809: nop
/*      */     //   810: iconst_0
/*      */     //   811: istore #26
/*      */     //   813: aload #9
/*      */     //   815: ldc_w -692256719
/*      */     //   818: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   821: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   824: aload #9
/*      */     //   826: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   831: instanceof androidx/compose/runtime/Applier
/*      */     //   834: ifne -> 840
/*      */     //   837: invokestatic invalidApplier : ()V
/*      */     //   840: aload #9
/*      */     //   842: invokeinterface startReusableNode : ()V
/*      */     //   847: aload #9
/*      */     //   849: invokeinterface getInserting : ()Z
/*      */     //   854: ifeq -> 869
/*      */     //   857: aload #9
/*      */     //   859: aload #24
/*      */     //   861: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   866: goto -> 876
/*      */     //   869: aload #9
/*      */     //   871: invokeinterface useNode : ()V
/*      */     //   876: aload #9
/*      */     //   878: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   881: astore #27
/*      */     //   883: iconst_0
/*      */     //   884: istore #28
/*      */     //   886: aload #27
/*      */     //   888: aload #18
/*      */     //   890: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   893: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   896: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   899: aload #27
/*      */     //   901: aload #22
/*      */     //   903: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   906: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   909: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   912: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   915: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   918: astore #29
/*      */     //   920: iconst_0
/*      */     //   921: istore #30
/*      */     //   923: aload #27
/*      */     //   925: astore #31
/*      */     //   927: iconst_0
/*      */     //   928: istore #32
/*      */     //   930: aload #31
/*      */     //   932: invokeinterface getInserting : ()Z
/*      */     //   937: ifne -> 958
/*      */     //   940: aload #31
/*      */     //   942: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   947: iload #21
/*      */     //   949: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   952: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   955: ifne -> 984
/*      */     //   958: aload #31
/*      */     //   960: iload #21
/*      */     //   962: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   965: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   970: aload #27
/*      */     //   972: iload #21
/*      */     //   974: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   977: aload #29
/*      */     //   979: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   984: nop
/*      */     //   985: nop
/*      */     //   986: nop
/*      */     //   987: aload #27
/*      */     //   989: aload #23
/*      */     //   991: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   994: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   997: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1000: nop
/*      */     //   1001: nop
/*      */     //   1002: aload #9
/*      */     //   1004: bipush #14
/*      */     //   1006: iload #25
/*      */     //   1008: bipush #6
/*      */     //   1010: ishr
/*      */     //   1011: iand
/*      */     //   1012: istore #33
/*      */     //   1014: astore #34
/*      */     //   1016: iconst_0
/*      */     //   1017: istore #35
/*      */     //   1019: aload #34
/*      */     //   1021: ldc_w -2146769399
/*      */     //   1024: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   1027: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1030: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   1033: aload #34
/*      */     //   1035: bipush #6
/*      */     //   1037: bipush #112
/*      */     //   1039: iload #16
/*      */     //   1041: bipush #6
/*      */     //   1043: ishr
/*      */     //   1044: iand
/*      */     //   1045: ior
/*      */     //   1046: istore #36
/*      */     //   1048: astore #37
/*      */     //   1050: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   1053: astore #38
/*      */     //   1055: iconst_0
/*      */     //   1056: istore #39
/*      */     //   1058: aload #37
/*      */     //   1060: iconst_0
/*      */     //   1061: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*      */     //   1064: invokevirtual getAttachedIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*      */     //   1067: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*      */     //   1070: ldc_w 'Add File'
/*      */     //   1073: aconst_null
/*      */     //   1074: aconst_null
/*      */     //   1075: lconst_0
/*      */     //   1076: iconst_0
/*      */     //   1077: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*      */     //   1080: aload #37
/*      */     //   1082: bipush #48
/*      */     //   1084: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*      */     //   1087: ior
/*      */     //   1088: bipush #28
/*      */     //   1090: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*      */     //   1093: nop
/*      */     //   1094: aload #34
/*      */     //   1096: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1099: aload #9
/*      */     //   1101: invokeinterface endNode : ()V
/*      */     //   1106: aload #9
/*      */     //   1108: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1111: nop
/*      */     //   1112: aload #9
/*      */     //   1114: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1117: nop
/*      */     //   1118: aload #9
/*      */     //   1120: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1123: nop
/*      */     //   1124: aload #12
/*      */     //   1126: invokestatic JunieFilePickerButton$lambda$57 : (Landroidx/compose/runtime/MutableState;)Z
/*      */     //   1129: ifeq -> 1283
/*      */     //   1132: aconst_null
/*      */     //   1133: lconst_0
/*      */     //   1134: aload #9
/*      */     //   1136: ldc_w -1509252372
/*      */     //   1139: invokeinterface startReplaceGroup : (I)V
/*      */     //   1144: aload #9
/*      */     //   1146: astore #14
/*      */     //   1148: iconst_0
/*      */     //   1149: istore #15
/*      */     //   1151: nop
/*      */     //   1152: iconst_0
/*      */     //   1153: istore #16
/*      */     //   1155: aload #14
/*      */     //   1157: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1162: astore #17
/*      */     //   1164: iconst_0
/*      */     //   1165: istore #18
/*      */     //   1167: aload #17
/*      */     //   1169: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1172: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1175: if_acmpne -> 1216
/*      */     //   1178: lstore #41
/*      */     //   1180: astore #40
/*      */     //   1182: iconst_0
/*      */     //   1183: istore #19
/*      */     //   1185: aload #12
/*      */     //   1187: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*      */     //   1192: astore #43
/*      */     //   1194: aload #40
/*      */     //   1196: lload #41
/*      */     //   1198: aload #43
/*      */     //   1200: astore #20
/*      */     //   1202: aload #14
/*      */     //   1204: aload #20
/*      */     //   1206: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1211: aload #20
/*      */     //   1213: goto -> 1218
/*      */     //   1216: aload #17
/*      */     //   1218: nop
/*      */     //   1219: nop
/*      */     //   1220: nop
/*      */     //   1221: checkcast kotlin/jvm/functions/Function0
/*      */     //   1224: astore #13
/*      */     //   1226: aload #9
/*      */     //   1228: invokeinterface endReplaceGroup : ()V
/*      */     //   1233: aload #13
/*      */     //   1235: aconst_null
/*      */     //   1236: ldc_w -1355594709
/*      */     //   1239: iconst_1
/*      */     //   1240: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$JunieFilePickerButton$5
/*      */     //   1243: dup
/*      */     //   1244: aload_0
/*      */     //   1245: aload_1
/*      */     //   1246: aload_2
/*      */     //   1247: aload_3
/*      */     //   1248: aload #4
/*      */     //   1250: aload #5
/*      */     //   1252: aload #6
/*      */     //   1254: aload #7
/*      */     //   1256: aload #8
/*      */     //   1258: aload #12
/*      */     //   1260: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)V
/*      */     //   1263: aload #9
/*      */     //   1265: bipush #54
/*      */     //   1267: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1270: checkcast kotlin/jvm/functions/Function2
/*      */     //   1273: aload #9
/*      */     //   1275: sipush #24960
/*      */     //   1278: bipush #11
/*      */     //   1280: invokestatic Popup-K5zGePQ : (Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*      */     //   1283: invokestatic isTraceInProgress : ()Z
/*      */     //   1286: ifeq -> 1302
/*      */     //   1289: invokestatic traceEventEnd : ()V
/*      */     //   1292: goto -> 1302
/*      */     //   1295: aload #9
/*      */     //   1297: invokeinterface skipToGroupEnd : ()V
/*      */     //   1302: aload #9
/*      */     //   1304: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1309: dup
/*      */     //   1310: ifnull -> 1342
/*      */     //   1313: aload_0
/*      */     //   1314: aload_1
/*      */     //   1315: aload_2
/*      */     //   1316: aload_3
/*      */     //   1317: aload #4
/*      */     //   1319: aload #5
/*      */     //   1321: aload #6
/*      */     //   1323: aload #7
/*      */     //   1325: aload #8
/*      */     //   1327: iload #10
/*      */     //   1329: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)Lkotlin/jvm/functions/Function2;
/*      */     //   1334: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1339: goto -> 1343
/*      */     //   1342: pop
/*      */     //   1343: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #352	-> 0
/*      */     //   #353	-> 373
/*      */     //   #866	-> 377
/*      */     //   #867	-> 389
/*      */     //   #868	-> 400
/*      */     //   #353	-> 403
/*      */     //   #868	-> 413
/*      */     //   #869	-> 415
/*      */     //   #870	-> 424
/*      */     //   #871	-> 429
/*      */     //   #867	-> 431
/*      */     //   #866	-> 432
/*      */     //   #866	-> 433
/*      */     //   #353	-> 434
/*      */     //   #355	-> 450
/*      */     //   #872	-> 462
/*      */     //   #355	-> 468
/*      */     //   #362	-> 496
/*      */     //   #873	-> 500
/*      */     //   #874	-> 512
/*      */     //   #875	-> 523
/*      */     //   #362	-> 526
/*      */     //   #875	-> 529
/*      */     //   #876	-> 531
/*      */     //   #877	-> 540
/*      */     //   #878	-> 545
/*      */     //   #874	-> 547
/*      */     //   #873	-> 548
/*      */     //   #873	-> 549
/*      */     //   #362	-> 550
/*      */     //   #355	-> 566
/*      */     //   #362	-> 568
/*      */     //   #361	-> 570
/*      */     //   #356	-> 571
/*      */     //   #357	-> 591
/*      */     //   #879	-> 595
/*      */     //   #880	-> 607
/*      */     //   #881	-> 618
/*      */     //   #357	-> 633
/*      */     //   #881	-> 656
/*      */     //   #882	-> 658
/*      */     //   #883	-> 667
/*      */     //   #884	-> 672
/*      */     //   #880	-> 674
/*      */     //   #879	-> 675
/*      */     //   #879	-> 676
/*      */     //   #357	-> 677
/*      */     //   #356	-> 691
/*      */     //   #354	-> 702
/*      */     //   #885	-> 714
/*      */     //   #886	-> 717
/*      */     //   #887	-> 725
/*      */     //   #890	-> 728
/*      */     //   #891	-> 746
/*      */     //   #892	-> 758
/*      */     //   #893	-> 764
/*      */     //   #894	-> 771
/*      */     //   #895	-> 780
/*      */     //   #897	-> 787
/*      */     //   #896	-> 809
/*      */     //   #898	-> 821
/*      */     //   #899	-> 824
/*      */     //   #900	-> 842
/*      */     //   #901	-> 847
/*      */     //   #902	-> 859
/*      */     //   #904	-> 871
/*      */     //   #906	-> 876
/*      */     //   #907	-> 886
/*      */     //   #908	-> 899
/*      */     //   #910	-> 912
/*      */     //   #911	-> 923
/*      */     //   #912	-> 930
/*      */     //   #913	-> 958
/*      */     //   #914	-> 970
/*      */     //   #916	-> 984
/*      */     //   #911	-> 985
/*      */     //   #916	-> 986
/*      */     //   #917	-> 987
/*      */     //   #918	-> 1000
/*      */     //   #906	-> 1001
/*      */     //   #919	-> 1002
/*      */     //   #920	-> 1027
/*      */     //   #364	-> 1061
/*      */     //   #365	-> 1093
/*      */     //   #920	-> 1094
/*      */     //   #919	-> 1099
/*      */     //   #921	-> 1101
/*      */     //   #898	-> 1108
/*      */     //   #922	-> 1111
/*      */     //   #892	-> 1114
/*      */     //   #923	-> 1117
/*      */     //   #885	-> 1120
/*      */     //   #924	-> 1123
/*      */     //   #366	-> 1124
/*      */     //   #367	-> 1151
/*      */     //   #925	-> 1155
/*      */     //   #926	-> 1167
/*      */     //   #927	-> 1178
/*      */     //   #367	-> 1185
/*      */     //   #927	-> 1200
/*      */     //   #928	-> 1202
/*      */     //   #929	-> 1211
/*      */     //   #930	-> 1216
/*      */     //   #926	-> 1218
/*      */     //   #925	-> 1219
/*      */     //   #925	-> 1220
/*      */     //   #367	-> 1221
/*      */     //   #382	-> 1295
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   403	10	19	$i$a$-cache-PromptAreaKt$JunieFilePickerButton$shouldShowFilePickerDialog$2	I
/*      */     //   415	11	19	value$iv	Ljava/lang/Object;
/*      */     //   389	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   386	46	17	it$iv	Ljava/lang/Object;
/*      */     //   377	57	16	$i$f$cache	I
/*      */     //   374	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   374	60	15	invalid$iv	Z
/*      */     //   462	6	15	$i$f$getDp	I
/*      */     //   459	9	14	$this$dp$iv	I
/*      */     //   526	3	21	$i$a$-cache-PromptAreaKt$JunieFilePickerButton$1	I
/*      */     //   531	11	21	value$iv	Ljava/lang/Object;
/*      */     //   512	36	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   509	39	19	it$iv	Ljava/lang/Object;
/*      */     //   500	50	18	$i$f$cache	I
/*      */     //   497	53	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   497	53	17	invalid$iv	Z
/*      */     //   633	7	21	$i$a$-cache-PromptAreaKt$JunieFilePickerButton$2	I
/*      */     //   658	11	22	value$iv	Ljava/lang/Object;
/*      */     //   607	68	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   604	71	19	it$iv	Ljava/lang/Object;
/*      */     //   595	82	18	$i$f$cache	I
/*      */     //   592	85	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   592	85	17	invalid$iv	Z
/*      */     //   1058	36	39	$i$a$-Box-PromptAreaKt$JunieFilePickerButton$3	I
/*      */     //   1055	39	38	$this$JunieFilePickerButton_u24lambda_u2462	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   1055	39	37	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   1055	39	36	$changed	I
/*      */     //   1019	80	35	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   1016	83	34	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1016	83	33	$changed$iv	I
/*      */     //   930	55	32	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   927	58	31	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   923	64	30	$i$f$set-impl	I
/*      */     //   920	67	29	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   886	115	28	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   883	118	27	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   813	299	26	$i$f$ReusableComposeNode	I
/*      */     //   810	302	24	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   810	302	25	$changed$iv$iv$iv	I
/*      */     //   750	368	20	$i$f$Layout	I
/*      */     //   769	349	21	compositeKeyHash$iv$iv	I
/*      */     //   778	340	22	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   787	331	23	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   747	371	19	$changed$iv$iv	I
/*      */     //   706	418	17	$i$f$Box	I
/*      */     //   737	387	18	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   703	421	13	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   725	399	14	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   728	396	15	propagateMinConstraints$iv	Z
/*      */     //   703	421	16	$changed$iv	I
/*      */     //   1185	7	19	$i$a$-cache-PromptAreaKt$JunieFilePickerButton$4	I
/*      */     //   1202	11	20	value$iv	Ljava/lang/Object;
/*      */     //   1167	52	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1164	55	17	it$iv	Ljava/lang/Object;
/*      */     //   1155	66	16	$i$f$cache	I
/*      */     //   1152	69	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1152	69	15	invalid$iv	Z
/*      */     //   450	842	12	shouldShowFilePickerDialog$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   16	1328	11	$dirty	I
/*      */     //   0	1344	0	getRecentFiles	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1344	1	getGuidelines	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1344	2	onFileChosen	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1344	3	openProjectFilePicker	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1344	4	onCreateNewGuidelines	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1344	5	onSelectGuidelines	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1344	6	onCreateAiIgnoreFile	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1344	7	onOpenAiIgnoreFile	Lkotlin/jvm/functions/Function0;
/*      */     //   0	1344	8	hasAIIgnoreFile	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1344	9	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	1344	10	$changed	I } private static final Unit JunieFilePickerButton$lambda$61$lambda$60(MutableState<Boolean> $shouldShowFilePickerDialog$delegate) { CompositeUiAction.INSTANCE.logTaskRecentFilesButtonClicked(); JunieFilePickerButton$lambda$58($shouldShowFilePickerDialog$delegate, true); return Unit.INSTANCE; } private static final Unit JunieFilePickerButton$lambda$64$lambda$63(MutableState<Boolean> $shouldShowFilePickerDialog$delegate) { JunieFilePickerButton$lambda$58($shouldShowFilePickerDialog$delegate, false); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nPromptArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$JunieFilePickerButton$5\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,472:1\n1225#2,6:473\n*S KotlinDebug\n*F\n+ 1 PromptArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$JunieFilePickerButton$5\n*L\n371#1:473,6\n*E\n"}) static final class PromptAreaKt$JunieFilePickerButton$5 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { // Byte code:
/*      */       //   0: iload_2
/*      */       //   1: iconst_3
/*      */       //   2: iand
/*      */       //   3: iconst_2
/*      */       //   4: if_icmpne -> 16
/*      */       //   7: aload_1
/*      */       //   8: invokeinterface getSkipping : ()Z
/*      */       //   13: ifne -> 225
/*      */       //   16: invokestatic isTraceInProgress : ()Z
/*      */       //   19: ifeq -> 31
/*      */       //   22: ldc -1355594709
/*      */       //   24: iload_2
/*      */       //   25: iconst_m1
/*      */       //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.JunieFilePickerButton.<anonymous> (PromptArea.kt:367)'
/*      */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */       //   31: aload_0
/*      */       //   32: getfield $getRecentFiles : Lkotlin/jvm/functions/Function0;
/*      */       //   35: invokeinterface invoke : ()Ljava/lang/Object;
/*      */       //   40: checkcast java/util/List
/*      */       //   43: astore_3
/*      */       //   44: aload_0
/*      */       //   45: getfield $getGuidelines : Lkotlin/jvm/functions/Function0;
/*      */       //   48: invokeinterface invoke : ()Ljava/lang/Object;
/*      */       //   53: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry
/*      */       //   56: astore #4
/*      */       //   58: aload_3
/*      */       //   59: aload #4
/*      */       //   61: aload_0
/*      */       //   62: getfield $onFileChosen : Lkotlin/jvm/functions/Function1;
/*      */       //   65: aload_0
/*      */       //   66: getfield $openProjectFilePicker : Lkotlin/jvm/functions/Function0;
/*      */       //   69: aload_0
/*      */       //   70: getfield $onCreateNewGuidelines : Lkotlin/jvm/functions/Function0;
/*      */       //   73: aload_0
/*      */       //   74: getfield $onSelectGuidelines : Lkotlin/jvm/functions/Function1;
/*      */       //   77: aload_1
/*      */       //   78: ldc 1034469803
/*      */       //   80: invokeinterface startReplaceGroup : (I)V
/*      */       //   85: aload_1
/*      */       //   86: astore #6
/*      */       //   88: iconst_0
/*      */       //   89: istore #7
/*      */       //   91: aload_0
/*      */       //   92: getfield $shouldShowFilePickerDialog$delegate : Landroidx/compose/runtime/MutableState;
/*      */       //   95: astore #8
/*      */       //   97: iconst_0
/*      */       //   98: istore #9
/*      */       //   100: aload #6
/*      */       //   102: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */       //   107: astore #10
/*      */       //   109: iconst_0
/*      */       //   110: istore #11
/*      */       //   112: aload #10
/*      */       //   114: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */       //   117: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */       //   120: if_acmpne -> 177
/*      */       //   123: astore #19
/*      */       //   125: astore #18
/*      */       //   127: astore #17
/*      */       //   129: astore #16
/*      */       //   131: astore #15
/*      */       //   133: astore #14
/*      */       //   135: iconst_0
/*      */       //   136: istore #12
/*      */       //   138: aload #8
/*      */       //   140: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*      */       //   145: astore #20
/*      */       //   147: aload #14
/*      */       //   149: aload #15
/*      */       //   151: aload #16
/*      */       //   153: aload #17
/*      */       //   155: aload #18
/*      */       //   157: aload #19
/*      */       //   159: aload #20
/*      */       //   161: astore #13
/*      */       //   163: aload #6
/*      */       //   165: aload #13
/*      */       //   167: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */       //   172: aload #13
/*      */       //   174: goto -> 179
/*      */       //   177: aload #10
/*      */       //   179: nop
/*      */       //   180: nop
/*      */       //   181: nop
/*      */       //   182: checkcast kotlin/jvm/functions/Function0
/*      */       //   185: astore #5
/*      */       //   187: aload_1
/*      */       //   188: invokeinterface endReplaceGroup : ()V
/*      */       //   193: aload #5
/*      */       //   195: aload_0
/*      */       //   196: getfield $onCreateAiIgnoreFile : Lkotlin/jvm/functions/Function0;
/*      */       //   199: aload_0
/*      */       //   200: getfield $onOpenAiIgnoreFile : Lkotlin/jvm/functions/Function0;
/*      */       //   203: aload_0
/*      */       //   204: getfield $hasAIIgnoreFile : Lkotlin/jvm/functions/Function1;
/*      */       //   207: aload_1
/*      */       //   208: ldc 1572864
/*      */       //   210: invokestatic JunieFilePickerDialog : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*      */       //   213: invokestatic isTraceInProgress : ()Z
/*      */       //   216: ifeq -> 231
/*      */       //   219: invokestatic traceEventEnd : ()V
/*      */       //   222: goto -> 231
/*      */       //   225: aload_1
/*      */       //   226: invokeinterface skipToGroupEnd : ()V
/*      */       //   231: return
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #368	-> 0
/*      */       //   #369	-> 31
/*      */       //   #370	-> 44
/*      */       //   #369	-> 58
/*      */       //   #370	-> 59
/*      */       //   #372	-> 61
/*      */       //   #373	-> 65
/*      */       //   #374	-> 69
/*      */       //   #375	-> 73
/*      */       //   #371	-> 91
/*      */       //   #473	-> 100
/*      */       //   #474	-> 112
/*      */       //   #475	-> 123
/*      */       //   #371	-> 138
/*      */       //   #475	-> 161
/*      */       //   #476	-> 163
/*      */       //   #477	-> 172
/*      */       //   #478	-> 177
/*      */       //   #474	-> 179
/*      */       //   #473	-> 180
/*      */       //   #473	-> 181
/*      */       //   #371	-> 182
/*      */       //   #376	-> 195
/*      */       //   #377	-> 199
/*      */       //   #378	-> 203
/*      */       //   #368	-> 210
/*      */       //   #379	-> 225
/*      */       //   #380	-> 231
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   138	7	12	$i$a$-cache-PromptAreaKt$JunieFilePickerButton$5$1	I
/*      */       //   163	11	13	value$iv	Ljava/lang/Object;
/*      */       //   112	68	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */       //   109	71	10	it$iv	Ljava/lang/Object;
/*      */       //   100	82	9	$i$f$cache	I
/*      */       //   97	85	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */       //   97	85	7	invalid$iv	Z
/*      */       //   0	232	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$JunieFilePickerButton$5;
/*      */       //   0	232	1	$composer	Landroidx/compose/runtime/Composer;
/*      */       //   0	232	2	$changed	I } private static final Unit invoke$lambda$1$lambda$0(MutableState $shouldShowFilePickerDialog$delegate) { PromptAreaKt.JunieFilePickerButton$lambda$58($shouldShowFilePickerDialog$delegate, false); return Unit.INSTANCE; } PromptAreaKt$JunieFilePickerButton$5(Function0<List<FileListEntry>> $getRecentFiles, Function0<GuidelinesEntry> $getGuidelines, Function1<AttachedFile, Unit> $onFileChosen, Function0<Unit> $openProjectFilePicker, Function0<Unit> $onCreateNewGuidelines, Function1<GuidelinesEntry, Unit> $onSelectGuidelines, Function0<Unit> $onCreateAiIgnoreFile, Function0<Unit> $onOpenAiIgnoreFile, Function1<Continuation<? super Boolean>, Object> $hasAIIgnoreFile, MutableState<Boolean> $shouldShowFilePickerDialog$delegate) {} } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void WidePromptModeSelector(@NotNull PromptMode selectedMode, @NotNull Function1 onSelected, @Nullable Composer $composer, int $changed) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'selectedMode'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_1
/*      */     //   8: ldc_w 'onSelected'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload_2
/*      */     //   15: ldc_w 382125475
/*      */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   23: astore_2
/*      */     //   24: iload_3
/*      */     //   25: istore #4
/*      */     //   27: iload_3
/*      */     //   28: bipush #6
/*      */     //   30: iand
/*      */     //   31: ifne -> 54
/*      */     //   34: iload #4
/*      */     //   36: aload_2
/*      */     //   37: aload_0
/*      */     //   38: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   43: ifeq -> 50
/*      */     //   46: iconst_4
/*      */     //   47: goto -> 51
/*      */     //   50: iconst_2
/*      */     //   51: ior
/*      */     //   52: istore #4
/*      */     //   54: iload_3
/*      */     //   55: bipush #48
/*      */     //   57: iand
/*      */     //   58: ifne -> 83
/*      */     //   61: iload #4
/*      */     //   63: aload_2
/*      */     //   64: aload_1
/*      */     //   65: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   70: ifeq -> 78
/*      */     //   73: bipush #32
/*      */     //   75: goto -> 80
/*      */     //   78: bipush #16
/*      */     //   80: ior
/*      */     //   81: istore #4
/*      */     //   83: iload #4
/*      */     //   85: bipush #19
/*      */     //   87: iand
/*      */     //   88: bipush #18
/*      */     //   90: if_icmpne -> 102
/*      */     //   93: aload_2
/*      */     //   94: invokeinterface getSkipping : ()Z
/*      */     //   99: ifne -> 1612
/*      */     //   102: invokestatic isTraceInProgress : ()Z
/*      */     //   105: ifeq -> 120
/*      */     //   108: ldc_w 382125475
/*      */     //   111: iload #4
/*      */     //   113: iconst_m1
/*      */     //   114: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.WidePromptModeSelector (PromptArea.kt:389)'
/*      */     //   117: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   120: aload_2
/*      */     //   121: ldc_w -1455300976
/*      */     //   124: invokeinterface startReplaceGroup : (I)V
/*      */     //   129: aload_2
/*      */     //   130: astore #7
/*      */     //   132: iconst_0
/*      */     //   133: istore #8
/*      */     //   135: nop
/*      */     //   136: iconst_0
/*      */     //   137: istore #9
/*      */     //   139: aload #7
/*      */     //   141: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   146: astore #10
/*      */     //   148: iconst_0
/*      */     //   149: istore #11
/*      */     //   151: aload #10
/*      */     //   153: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   156: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   159: if_acmpne -> 191
/*      */     //   162: iconst_0
/*      */     //   163: istore #12
/*      */     //   165: iconst_0
/*      */     //   166: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   169: aconst_null
/*      */     //   170: iconst_2
/*      */     //   171: aconst_null
/*      */     //   172: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   175: astore #12
/*      */     //   177: aload #7
/*      */     //   179: aload #12
/*      */     //   181: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   186: aload #12
/*      */     //   188: goto -> 193
/*      */     //   191: aload #10
/*      */     //   193: nop
/*      */     //   194: nop
/*      */     //   195: nop
/*      */     //   196: checkcast androidx/compose/runtime/MutableState
/*      */     //   199: astore #6
/*      */     //   201: aload_2
/*      */     //   202: invokeinterface endReplaceGroup : ()V
/*      */     //   207: aload #6
/*      */     //   209: astore #5
/*      */     //   211: aload_2
/*      */     //   212: ldc_w -1455299216
/*      */     //   215: invokeinterface startReplaceGroup : (I)V
/*      */     //   220: aload_2
/*      */     //   221: astore #8
/*      */     //   223: iconst_0
/*      */     //   224: istore #9
/*      */     //   226: nop
/*      */     //   227: iconst_0
/*      */     //   228: istore #10
/*      */     //   230: aload #8
/*      */     //   232: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   237: astore #11
/*      */     //   239: iconst_0
/*      */     //   240: istore #12
/*      */     //   242: aload #11
/*      */     //   244: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   247: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   250: if_acmpne -> 282
/*      */     //   253: iconst_0
/*      */     //   254: istore #13
/*      */     //   256: iconst_0
/*      */     //   257: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   260: aconst_null
/*      */     //   261: iconst_2
/*      */     //   262: aconst_null
/*      */     //   263: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   266: astore #13
/*      */     //   268: aload #8
/*      */     //   270: aload #13
/*      */     //   272: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   277: aload #13
/*      */     //   279: goto -> 284
/*      */     //   282: aload #11
/*      */     //   284: nop
/*      */     //   285: nop
/*      */     //   286: nop
/*      */     //   287: checkcast androidx/compose/runtime/MutableState
/*      */     //   290: astore #7
/*      */     //   292: aload_2
/*      */     //   293: invokeinterface endReplaceGroup : ()V
/*      */     //   298: aload #7
/*      */     //   300: astore #6
/*      */     //   302: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*      */     //   305: invokevirtual getUnspecified-0d7_KjU : ()J
/*      */     //   308: lstore #7
/*      */     //   310: aload_2
/*      */     //   311: iconst_0
/*      */     //   312: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*      */     //   315: aload_2
/*      */     //   316: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*      */     //   319: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
/*      */     //   322: lstore #9
/*      */     //   324: aload_2
/*      */     //   325: ldc_w -1455293655
/*      */     //   328: invokeinterface startReplaceGroup : (I)V
/*      */     //   333: aload_2
/*      */     //   334: astore #13
/*      */     //   336: iload #4
/*      */     //   338: bipush #14
/*      */     //   340: iand
/*      */     //   341: iconst_4
/*      */     //   342: if_icmpne -> 349
/*      */     //   345: iconst_1
/*      */     //   346: goto -> 350
/*      */     //   349: iconst_0
/*      */     //   350: aload_2
/*      */     //   351: lload #9
/*      */     //   353: invokeinterface changed : (J)Z
/*      */     //   358: ior
/*      */     //   359: istore #14
/*      */     //   361: nop
/*      */     //   362: iconst_0
/*      */     //   363: istore #15
/*      */     //   365: aload #13
/*      */     //   367: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   372: astore #16
/*      */     //   374: iconst_0
/*      */     //   375: istore #17
/*      */     //   377: iload #14
/*      */     //   379: ifne -> 393
/*      */     //   382: aload #16
/*      */     //   384: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   387: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   390: if_acmpne -> 429
/*      */     //   393: iconst_0
/*      */     //   394: istore #18
/*      */     //   396: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$WidePromptModeSelector$codeTextColor$2$1
/*      */     //   399: dup
/*      */     //   400: aload_0
/*      */     //   401: lload #7
/*      */     //   403: lload #9
/*      */     //   405: aload #5
/*      */     //   407: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;JJLandroidx/compose/runtime/MutableState;)V
/*      */     //   410: checkcast kotlin/jvm/functions/Function0
/*      */     //   413: astore #19
/*      */     //   415: aload #13
/*      */     //   417: aload #19
/*      */     //   419: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   424: aload #19
/*      */     //   426: goto -> 431
/*      */     //   429: aload #16
/*      */     //   431: nop
/*      */     //   432: nop
/*      */     //   433: nop
/*      */     //   434: checkcast kotlin/jvm/functions/Function0
/*      */     //   437: astore #12
/*      */     //   439: aload_2
/*      */     //   440: invokeinterface endReplaceGroup : ()V
/*      */     //   445: aload #12
/*      */     //   447: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*      */     //   450: astore #11
/*      */     //   452: aload_2
/*      */     //   453: ldc_w -1455288505
/*      */     //   456: invokeinterface startReplaceGroup : (I)V
/*      */     //   461: aload_2
/*      */     //   462: astore #14
/*      */     //   464: iload #4
/*      */     //   466: bipush #14
/*      */     //   468: iand
/*      */     //   469: iconst_4
/*      */     //   470: if_icmpne -> 477
/*      */     //   473: iconst_1
/*      */     //   474: goto -> 478
/*      */     //   477: iconst_0
/*      */     //   478: aload_2
/*      */     //   479: lload #9
/*      */     //   481: invokeinterface changed : (J)Z
/*      */     //   486: ior
/*      */     //   487: istore #15
/*      */     //   489: nop
/*      */     //   490: iconst_0
/*      */     //   491: istore #16
/*      */     //   493: aload #14
/*      */     //   495: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   500: astore #17
/*      */     //   502: iconst_0
/*      */     //   503: istore #18
/*      */     //   505: iload #15
/*      */     //   507: ifne -> 521
/*      */     //   510: aload #17
/*      */     //   512: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   515: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   518: if_acmpne -> 557
/*      */     //   521: iconst_0
/*      */     //   522: istore #19
/*      */     //   524: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptAreaKt$WidePromptModeSelector$askTextColor$2$1
/*      */     //   527: dup
/*      */     //   528: aload_0
/*      */     //   529: lload #7
/*      */     //   531: lload #9
/*      */     //   533: aload #6
/*      */     //   535: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;JJLandroidx/compose/runtime/MutableState;)V
/*      */     //   538: checkcast kotlin/jvm/functions/Function0
/*      */     //   541: astore #20
/*      */     //   543: aload #14
/*      */     //   545: aload #20
/*      */     //   547: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   552: aload #20
/*      */     //   554: goto -> 559
/*      */     //   557: aload #17
/*      */     //   559: nop
/*      */     //   560: nop
/*      */     //   561: nop
/*      */     //   562: checkcast kotlin/jvm/functions/Function0
/*      */     //   565: astore #13
/*      */     //   567: aload_2
/*      */     //   568: invokeinterface endReplaceGroup : ()V
/*      */     //   573: aload #13
/*      */     //   575: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*      */     //   578: astore #12
/*      */     //   580: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   583: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*      */     //   586: astore #13
/*      */     //   588: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*      */     //   591: bipush #8
/*      */     //   593: istore #15
/*      */     //   595: iconst_0
/*      */     //   596: istore #16
/*      */     //   598: iload #15
/*      */     //   600: i2f
/*      */     //   601: invokestatic constructor-impl : (F)F
/*      */     //   604: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*      */     //   607: astore #14
/*      */     //   609: sipush #432
/*      */     //   612: istore #16
/*      */     //   614: nop
/*      */     //   615: iconst_0
/*      */     //   616: istore #17
/*      */     //   618: aload_2
/*      */     //   619: ldc_w 693286680
/*      */     //   622: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*      */     //   625: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   628: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   631: checkcast androidx/compose/ui/Modifier
/*      */     //   634: astore #15
/*      */     //   636: aload #14
/*      */     //   638: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*      */     //   641: aload #13
/*      */     //   643: aload_2
/*      */     //   644: bipush #14
/*      */     //   646: iload #16
/*      */     //   648: iconst_3
/*      */     //   649: ishr
/*      */     //   650: iand
/*      */     //   651: bipush #112
/*      */     //   653: iload #16
/*      */     //   655: iconst_3
/*      */     //   656: ishr
/*      */     //   657: iand
/*      */     //   658: ior
/*      */     //   659: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   662: astore #18
/*      */     //   664: bipush #112
/*      */     //   666: iload #16
/*      */     //   668: iconst_3
/*      */     //   669: ishl
/*      */     //   670: iand
/*      */     //   671: istore #19
/*      */     //   673: nop
/*      */     //   674: iconst_0
/*      */     //   675: istore #20
/*      */     //   677: aload_2
/*      */     //   678: ldc_w -1323940314
/*      */     //   681: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   684: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   687: aload_2
/*      */     //   688: iconst_0
/*      */     //   689: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   692: istore #21
/*      */     //   694: aload_2
/*      */     //   695: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   700: astore #22
/*      */     //   702: aload_2
/*      */     //   703: aload #15
/*      */     //   705: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   708: astore #23
/*      */     //   710: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   713: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   716: astore #24
/*      */     //   718: bipush #6
/*      */     //   720: sipush #896
/*      */     //   723: iload #19
/*      */     //   725: bipush #6
/*      */     //   727: ishl
/*      */     //   728: iand
/*      */     //   729: ior
/*      */     //   730: istore #25
/*      */     //   732: nop
/*      */     //   733: iconst_0
/*      */     //   734: istore #26
/*      */     //   736: aload_2
/*      */     //   737: ldc_w -692256719
/*      */     //   740: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   743: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   746: aload_2
/*      */     //   747: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   752: instanceof androidx/compose/runtime/Applier
/*      */     //   755: ifne -> 761
/*      */     //   758: invokestatic invalidApplier : ()V
/*      */     //   761: aload_2
/*      */     //   762: invokeinterface startReusableNode : ()V
/*      */     //   767: aload_2
/*      */     //   768: invokeinterface getInserting : ()Z
/*      */     //   773: ifeq -> 787
/*      */     //   776: aload_2
/*      */     //   777: aload #24
/*      */     //   779: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   784: goto -> 793
/*      */     //   787: aload_2
/*      */     //   788: invokeinterface useNode : ()V
/*      */     //   793: aload_2
/*      */     //   794: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   797: astore #27
/*      */     //   799: iconst_0
/*      */     //   800: istore #28
/*      */     //   802: aload #27
/*      */     //   804: aload #18
/*      */     //   806: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   809: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   812: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   815: aload #27
/*      */     //   817: aload #22
/*      */     //   819: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   822: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   825: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   828: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   831: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   834: astore #29
/*      */     //   836: iconst_0
/*      */     //   837: istore #30
/*      */     //   839: aload #27
/*      */     //   841: astore #31
/*      */     //   843: iconst_0
/*      */     //   844: istore #32
/*      */     //   846: aload #31
/*      */     //   848: invokeinterface getInserting : ()Z
/*      */     //   853: ifne -> 874
/*      */     //   856: aload #31
/*      */     //   858: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   863: iload #21
/*      */     //   865: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   868: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   871: ifne -> 900
/*      */     //   874: aload #31
/*      */     //   876: iload #21
/*      */     //   878: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   881: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   886: aload #27
/*      */     //   888: iload #21
/*      */     //   890: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   893: aload #29
/*      */     //   895: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   900: nop
/*      */     //   901: nop
/*      */     //   902: nop
/*      */     //   903: aload #27
/*      */     //   905: aload #23
/*      */     //   907: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   910: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   913: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   916: nop
/*      */     //   917: nop
/*      */     //   918: aload_2
/*      */     //   919: bipush #14
/*      */     //   921: iload #25
/*      */     //   923: bipush #6
/*      */     //   925: ishr
/*      */     //   926: iand
/*      */     //   927: istore #33
/*      */     //   929: astore #34
/*      */     //   931: iconst_0
/*      */     //   932: istore #35
/*      */     //   934: aload #34
/*      */     //   936: ldc_w -407840262
/*      */     //   939: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*      */     //   942: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   945: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*      */     //   948: aload #34
/*      */     //   950: bipush #6
/*      */     //   952: bipush #112
/*      */     //   954: iload #16
/*      */     //   956: bipush #6
/*      */     //   958: ishr
/*      */     //   959: iand
/*      */     //   960: ior
/*      */     //   961: istore #36
/*      */     //   963: astore #37
/*      */     //   965: checkcast androidx/compose/foundation/layout/RowScope
/*      */     //   968: astore #38
/*      */     //   970: iconst_0
/*      */     //   971: istore #39
/*      */     //   973: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   976: checkcast androidx/compose/ui/Modifier
/*      */     //   979: aload #37
/*      */     //   981: ldc_w 66863297
/*      */     //   984: invokeinterface startReplaceGroup : (I)V
/*      */     //   989: aload #37
/*      */     //   991: astore #40
/*      */     //   993: iconst_0
/*      */     //   994: istore #41
/*      */     //   996: nop
/*      */     //   997: iconst_0
/*      */     //   998: istore #42
/*      */     //   1000: aload #40
/*      */     //   1002: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1007: astore #43
/*      */     //   1009: iconst_0
/*      */     //   1010: istore #44
/*      */     //   1012: aload #43
/*      */     //   1014: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1017: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1020: if_acmpne -> 1054
/*      */     //   1023: astore #45
/*      */     //   1025: iconst_0
/*      */     //   1026: istore #46
/*      */     //   1028: aload #5
/*      */     //   1030: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1035: aload #45
/*      */     //   1037: swap
/*      */     //   1038: astore #47
/*      */     //   1040: aload #40
/*      */     //   1042: aload #47
/*      */     //   1044: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1049: aload #47
/*      */     //   1051: goto -> 1056
/*      */     //   1054: aload #43
/*      */     //   1056: nop
/*      */     //   1057: nop
/*      */     //   1058: nop
/*      */     //   1059: checkcast kotlin/jvm/functions/Function1
/*      */     //   1062: astore #48
/*      */     //   1064: aload #37
/*      */     //   1066: invokeinterface endReplaceGroup : ()V
/*      */     //   1071: aload #48
/*      */     //   1073: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1076: getstatic androidx/compose/ui/input/pointer/PointerIcon.Companion : Landroidx/compose/ui/input/pointer/PointerIcon$Companion;
/*      */     //   1079: invokevirtual getHand : ()Landroidx/compose/ui/input/pointer/PointerIcon;
/*      */     //   1082: iconst_0
/*      */     //   1083: iconst_2
/*      */     //   1084: aconst_null
/*      */     //   1085: invokestatic pointerHoverIcon$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1088: iconst_0
/*      */     //   1089: aconst_null
/*      */     //   1090: aconst_null
/*      */     //   1091: aconst_null
/*      */     //   1092: aconst_null
/*      */     //   1093: aload #37
/*      */     //   1095: ldc_w 66865933
/*      */     //   1098: invokeinterface startReplaceGroup : (I)V
/*      */     //   1103: aload #37
/*      */     //   1105: astore #40
/*      */     //   1107: iload #4
/*      */     //   1109: bipush #112
/*      */     //   1111: iand
/*      */     //   1112: bipush #32
/*      */     //   1114: if_icmpne -> 1121
/*      */     //   1117: iconst_1
/*      */     //   1118: goto -> 1122
/*      */     //   1121: iconst_0
/*      */     //   1122: istore #41
/*      */     //   1124: iconst_0
/*      */     //   1125: istore #42
/*      */     //   1127: aload #40
/*      */     //   1129: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1134: astore #43
/*      */     //   1136: iconst_0
/*      */     //   1137: istore #44
/*      */     //   1139: iload #41
/*      */     //   1141: ifne -> 1155
/*      */     //   1144: aload #43
/*      */     //   1146: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1149: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1152: if_acmpne -> 1208
/*      */     //   1155: astore #49
/*      */     //   1157: astore #50
/*      */     //   1159: astore #51
/*      */     //   1161: astore #52
/*      */     //   1163: istore #53
/*      */     //   1165: astore #45
/*      */     //   1167: iconst_0
/*      */     //   1168: istore #46
/*      */     //   1170: aload_1
/*      */     //   1171: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*      */     //   1176: astore #54
/*      */     //   1178: aload #45
/*      */     //   1180: iload #53
/*      */     //   1182: aload #52
/*      */     //   1184: aload #51
/*      */     //   1186: aload #50
/*      */     //   1188: aload #49
/*      */     //   1190: aload #54
/*      */     //   1192: astore #47
/*      */     //   1194: aload #40
/*      */     //   1196: aload #47
/*      */     //   1198: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1203: aload #47
/*      */     //   1205: goto -> 1210
/*      */     //   1208: aload #43
/*      */     //   1210: nop
/*      */     //   1211: nop
/*      */     //   1212: nop
/*      */     //   1213: checkcast kotlin/jvm/functions/Function0
/*      */     //   1216: astore #48
/*      */     //   1218: aload #37
/*      */     //   1220: invokeinterface endReplaceGroup : ()V
/*      */     //   1225: aload #48
/*      */     //   1227: bipush #31
/*      */     //   1229: aconst_null
/*      */     //   1230: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1233: astore #55
/*      */     //   1235: aload #11
/*      */     //   1237: invokestatic WidePromptModeSelector$lambda$73 : (Landroidx/compose/runtime/State;)J
/*      */     //   1240: lstore #56
/*      */     //   1242: ldc_w 'Code'
/*      */     //   1245: aload #55
/*      */     //   1247: lload #56
/*      */     //   1249: lconst_0
/*      */     //   1250: aconst_null
/*      */     //   1251: aconst_null
/*      */     //   1252: aconst_null
/*      */     //   1253: lconst_0
/*      */     //   1254: aconst_null
/*      */     //   1255: iconst_0
/*      */     //   1256: lconst_0
/*      */     //   1257: iconst_0
/*      */     //   1258: iconst_0
/*      */     //   1259: iconst_0
/*      */     //   1260: aconst_null
/*      */     //   1261: aconst_null
/*      */     //   1262: aload #37
/*      */     //   1264: bipush #6
/*      */     //   1266: iconst_0
/*      */     //   1267: ldc_w 65528
/*      */     //   1270: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*      */     //   1273: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   1276: checkcast androidx/compose/ui/Modifier
/*      */     //   1279: aload #37
/*      */     //   1281: ldc_w 66870496
/*      */     //   1284: invokeinterface startReplaceGroup : (I)V
/*      */     //   1289: aload #37
/*      */     //   1291: astore #40
/*      */     //   1293: iconst_0
/*      */     //   1294: istore #41
/*      */     //   1296: nop
/*      */     //   1297: iconst_0
/*      */     //   1298: istore #42
/*      */     //   1300: aload #40
/*      */     //   1302: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1307: astore #43
/*      */     //   1309: iconst_0
/*      */     //   1310: istore #44
/*      */     //   1312: aload #43
/*      */     //   1314: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1317: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1320: if_acmpne -> 1354
/*      */     //   1323: astore #45
/*      */     //   1325: iconst_0
/*      */     //   1326: istore #46
/*      */     //   1328: aload #6
/*      */     //   1330: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1335: aload #45
/*      */     //   1337: swap
/*      */     //   1338: astore #47
/*      */     //   1340: aload #40
/*      */     //   1342: aload #47
/*      */     //   1344: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1349: aload #47
/*      */     //   1351: goto -> 1356
/*      */     //   1354: aload #43
/*      */     //   1356: nop
/*      */     //   1357: nop
/*      */     //   1358: nop
/*      */     //   1359: checkcast kotlin/jvm/functions/Function1
/*      */     //   1362: astore #48
/*      */     //   1364: aload #37
/*      */     //   1366: invokeinterface endReplaceGroup : ()V
/*      */     //   1371: aload #48
/*      */     //   1373: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1376: getstatic androidx/compose/ui/input/pointer/PointerIcon.Companion : Landroidx/compose/ui/input/pointer/PointerIcon$Companion;
/*      */     //   1379: invokevirtual getHand : ()Landroidx/compose/ui/input/pointer/PointerIcon;
/*      */     //   1382: iconst_0
/*      */     //   1383: iconst_2
/*      */     //   1384: aconst_null
/*      */     //   1385: invokestatic pointerHoverIcon$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1388: iconst_0
/*      */     //   1389: aconst_null
/*      */     //   1390: aconst_null
/*      */     //   1391: aconst_null
/*      */     //   1392: aconst_null
/*      */     //   1393: aload #37
/*      */     //   1395: ldc_w 66873100
/*      */     //   1398: invokeinterface startReplaceGroup : (I)V
/*      */     //   1403: aload #37
/*      */     //   1405: astore #40
/*      */     //   1407: iload #4
/*      */     //   1409: bipush #112
/*      */     //   1411: iand
/*      */     //   1412: bipush #32
/*      */     //   1414: if_icmpne -> 1421
/*      */     //   1417: iconst_1
/*      */     //   1418: goto -> 1422
/*      */     //   1421: iconst_0
/*      */     //   1422: istore #41
/*      */     //   1424: iconst_0
/*      */     //   1425: istore #42
/*      */     //   1427: aload #40
/*      */     //   1429: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1434: astore #43
/*      */     //   1436: iconst_0
/*      */     //   1437: istore #44
/*      */     //   1439: iload #41
/*      */     //   1441: ifne -> 1455
/*      */     //   1444: aload #43
/*      */     //   1446: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1449: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1452: if_acmpne -> 1508
/*      */     //   1455: astore #49
/*      */     //   1457: astore #50
/*      */     //   1459: astore #51
/*      */     //   1461: astore #52
/*      */     //   1463: istore #53
/*      */     //   1465: astore #45
/*      */     //   1467: iconst_0
/*      */     //   1468: istore #46
/*      */     //   1470: aload_1
/*      */     //   1471: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*      */     //   1476: astore #54
/*      */     //   1478: aload #45
/*      */     //   1480: iload #53
/*      */     //   1482: aload #52
/*      */     //   1484: aload #51
/*      */     //   1486: aload #50
/*      */     //   1488: aload #49
/*      */     //   1490: aload #54
/*      */     //   1492: astore #47
/*      */     //   1494: aload #40
/*      */     //   1496: aload #47
/*      */     //   1498: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1503: aload #47
/*      */     //   1505: goto -> 1510
/*      */     //   1508: aload #43
/*      */     //   1510: nop
/*      */     //   1511: nop
/*      */     //   1512: nop
/*      */     //   1513: checkcast kotlin/jvm/functions/Function0
/*      */     //   1516: astore #48
/*      */     //   1518: aload #37
/*      */     //   1520: invokeinterface endReplaceGroup : ()V
/*      */     //   1525: aload #48
/*      */     //   1527: bipush #31
/*      */     //   1529: aconst_null
/*      */     //   1530: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1533: astore #55
/*      */     //   1535: aload #12
/*      */     //   1537: invokestatic WidePromptModeSelector$lambda$75 : (Landroidx/compose/runtime/State;)J
/*      */     //   1540: lstore #56
/*      */     //   1542: ldc_w 'Ask'
/*      */     //   1545: aload #55
/*      */     //   1547: lload #56
/*      */     //   1549: lconst_0
/*      */     //   1550: aconst_null
/*      */     //   1551: aconst_null
/*      */     //   1552: aconst_null
/*      */     //   1553: lconst_0
/*      */     //   1554: aconst_null
/*      */     //   1555: iconst_0
/*      */     //   1556: lconst_0
/*      */     //   1557: iconst_0
/*      */     //   1558: iconst_0
/*      */     //   1559: iconst_0
/*      */     //   1560: aconst_null
/*      */     //   1561: aconst_null
/*      */     //   1562: aload #37
/*      */     //   1564: bipush #6
/*      */     //   1566: iconst_0
/*      */     //   1567: ldc_w 65528
/*      */     //   1570: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*      */     //   1573: nop
/*      */     //   1574: aload #34
/*      */     //   1576: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1579: aload_2
/*      */     //   1580: invokeinterface endNode : ()V
/*      */     //   1585: aload_2
/*      */     //   1586: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1589: nop
/*      */     //   1590: aload_2
/*      */     //   1591: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1594: nop
/*      */     //   1595: aload_2
/*      */     //   1596: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1599: nop
/*      */     //   1600: invokestatic isTraceInProgress : ()Z
/*      */     //   1603: ifeq -> 1618
/*      */     //   1606: invokestatic traceEventEnd : ()V
/*      */     //   1609: goto -> 1618
/*      */     //   1612: aload_2
/*      */     //   1613: invokeinterface skipToGroupEnd : ()V
/*      */     //   1618: aload_2
/*      */     //   1619: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1624: dup
/*      */     //   1625: ifnull -> 1644
/*      */     //   1628: aload_0
/*      */     //   1629: aload_1
/*      */     //   1630: iload_3
/*      */     //   1631: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;I)Lkotlin/jvm/functions/Function2;
/*      */     //   1636: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1641: goto -> 1645
/*      */     //   1644: pop
/*      */     //   1645: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #390	-> 14
/*      */     //   #391	-> 135
/*      */     //   #931	-> 139
/*      */     //   #932	-> 151
/*      */     //   #933	-> 162
/*      */     //   #391	-> 165
/*      */     //   #933	-> 175
/*      */     //   #934	-> 177
/*      */     //   #935	-> 186
/*      */     //   #936	-> 191
/*      */     //   #932	-> 193
/*      */     //   #931	-> 194
/*      */     //   #931	-> 195
/*      */     //   #391	-> 196
/*      */     //   #392	-> 226
/*      */     //   #937	-> 230
/*      */     //   #938	-> 242
/*      */     //   #939	-> 253
/*      */     //   #392	-> 256
/*      */     //   #939	-> 266
/*      */     //   #940	-> 268
/*      */     //   #941	-> 277
/*      */     //   #942	-> 282
/*      */     //   #938	-> 284
/*      */     //   #937	-> 285
/*      */     //   #937	-> 286
/*      */     //   #392	-> 287
/*      */     //   #393	-> 302
/*      */     //   #394	-> 312
/*      */     //   #395	-> 361
/*      */     //   #943	-> 365
/*      */     //   #944	-> 377
/*      */     //   #945	-> 393
/*      */     //   #395	-> 396
/*      */     //   #945	-> 413
/*      */     //   #946	-> 415
/*      */     //   #947	-> 424
/*      */     //   #948	-> 429
/*      */     //   #944	-> 431
/*      */     //   #943	-> 432
/*      */     //   #943	-> 433
/*      */     //   #395	-> 434
/*      */     //   #401	-> 489
/*      */     //   #949	-> 493
/*      */     //   #950	-> 505
/*      */     //   #951	-> 521
/*      */     //   #401	-> 524
/*      */     //   #951	-> 541
/*      */     //   #952	-> 543
/*      */     //   #953	-> 552
/*      */     //   #954	-> 557
/*      */     //   #950	-> 559
/*      */     //   #949	-> 560
/*      */     //   #949	-> 561
/*      */     //   #401	-> 562
/*      */     //   #408	-> 580
/*      */     //   #409	-> 588
/*      */     //   #955	-> 598
/*      */     //   #409	-> 604
/*      */     //   #407	-> 614
/*      */     //   #956	-> 625
/*      */     //   #957	-> 628
/*      */     //   #962	-> 636
/*      */     //   #963	-> 673
/*      */     //   #964	-> 684
/*      */     //   #965	-> 689
/*      */     //   #966	-> 695
/*      */     //   #967	-> 703
/*      */     //   #969	-> 710
/*      */     //   #968	-> 732
/*      */     //   #970	-> 743
/*      */     //   #971	-> 746
/*      */     //   #972	-> 762
/*      */     //   #973	-> 767
/*      */     //   #974	-> 777
/*      */     //   #976	-> 788
/*      */     //   #978	-> 793
/*      */     //   #979	-> 802
/*      */     //   #980	-> 815
/*      */     //   #982	-> 828
/*      */     //   #983	-> 839
/*      */     //   #984	-> 846
/*      */     //   #985	-> 874
/*      */     //   #986	-> 886
/*      */     //   #988	-> 900
/*      */     //   #983	-> 901
/*      */     //   #988	-> 902
/*      */     //   #989	-> 903
/*      */     //   #990	-> 916
/*      */     //   #978	-> 917
/*      */     //   #991	-> 918
/*      */     //   #992	-> 942
/*      */     //   #412	-> 973
/*      */     //   #413	-> 996
/*      */     //   #993	-> 1000
/*      */     //   #994	-> 1012
/*      */     //   #995	-> 1023
/*      */     //   #413	-> 1028
/*      */     //   #995	-> 1038
/*      */     //   #996	-> 1040
/*      */     //   #997	-> 1049
/*      */     //   #998	-> 1054
/*      */     //   #994	-> 1056
/*      */     //   #993	-> 1057
/*      */     //   #993	-> 1058
/*      */     //   #413	-> 1059
/*      */     //   #414	-> 1076
/*      */     //   #415	-> 1088
/*      */     //   #999	-> 1127
/*      */     //   #1000	-> 1139
/*      */     //   #1001	-> 1155
/*      */     //   #415	-> 1170
/*      */     //   #1001	-> 1192
/*      */     //   #1002	-> 1194
/*      */     //   #1003	-> 1203
/*      */     //   #1004	-> 1208
/*      */     //   #1000	-> 1210
/*      */     //   #999	-> 1211
/*      */     //   #999	-> 1212
/*      */     //   #415	-> 1213
/*      */     //   #416	-> 1235
/*      */     //   #417	-> 1242
/*      */     //   #415	-> 1245
/*      */     //   #416	-> 1247
/*      */     //   #411	-> 1270
/*      */     //   #420	-> 1273
/*      */     //   #421	-> 1296
/*      */     //   #1005	-> 1300
/*      */     //   #1006	-> 1312
/*      */     //   #1007	-> 1323
/*      */     //   #421	-> 1328
/*      */     //   #1007	-> 1338
/*      */     //   #1008	-> 1340
/*      */     //   #1009	-> 1349
/*      */     //   #1010	-> 1354
/*      */     //   #1006	-> 1356
/*      */     //   #1005	-> 1357
/*      */     //   #1005	-> 1358
/*      */     //   #421	-> 1359
/*      */     //   #422	-> 1376
/*      */     //   #423	-> 1388
/*      */     //   #1011	-> 1427
/*      */     //   #1012	-> 1439
/*      */     //   #1013	-> 1455
/*      */     //   #423	-> 1470
/*      */     //   #1013	-> 1492
/*      */     //   #1014	-> 1494
/*      */     //   #1015	-> 1503
/*      */     //   #1016	-> 1508
/*      */     //   #1012	-> 1510
/*      */     //   #1011	-> 1511
/*      */     //   #1011	-> 1512
/*      */     //   #423	-> 1513
/*      */     //   #424	-> 1535
/*      */     //   #425	-> 1542
/*      */     //   #423	-> 1545
/*      */     //   #424	-> 1547
/*      */     //   #419	-> 1570
/*      */     //   #427	-> 1573
/*      */     //   #992	-> 1574
/*      */     //   #991	-> 1579
/*      */     //   #1017	-> 1580
/*      */     //   #970	-> 1586
/*      */     //   #1018	-> 1589
/*      */     //   #964	-> 1591
/*      */     //   #1019	-> 1594
/*      */     //   #956	-> 1596
/*      */     //   #1020	-> 1599
/*      */     //   #428	-> 1612
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   165	10	12	$i$a$-cache-PromptAreaKt$WidePromptModeSelector$codeHovered$2	I
/*      */     //   177	11	12	value$iv	Ljava/lang/Object;
/*      */     //   151	43	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   148	46	10	it$iv	Ljava/lang/Object;
/*      */     //   139	57	9	$i$f$cache	I
/*      */     //   136	60	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   136	60	8	invalid$iv	Z
/*      */     //   256	10	13	$i$a$-cache-PromptAreaKt$WidePromptModeSelector$askHovered$2	I
/*      */     //   268	11	13	value$iv	Ljava/lang/Object;
/*      */     //   242	43	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   239	46	11	it$iv	Ljava/lang/Object;
/*      */     //   230	57	10	$i$f$cache	I
/*      */     //   227	60	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   227	60	9	invalid$iv	Z
/*      */     //   396	17	18	$i$a$-cache-PromptAreaKt$WidePromptModeSelector$codeTextColor$2	I
/*      */     //   415	11	19	value$iv	Ljava/lang/Object;
/*      */     //   377	55	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   374	58	16	it$iv	Ljava/lang/Object;
/*      */     //   365	69	15	$i$f$cache	I
/*      */     //   362	72	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   362	72	14	invalid$iv	Z
/*      */     //   524	17	19	$i$a$-cache-PromptAreaKt$WidePromptModeSelector$askTextColor$2	I
/*      */     //   543	11	20	value$iv	Ljava/lang/Object;
/*      */     //   505	55	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   502	58	17	it$iv	Ljava/lang/Object;
/*      */     //   493	69	16	$i$f$cache	I
/*      */     //   490	72	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   490	72	15	invalid$iv	Z
/*      */     //   598	6	16	$i$f$getDp	I
/*      */     //   595	9	15	$this$dp$iv	I
/*      */     //   1028	7	46	$i$a$-cache-PromptAreaKt$WidePromptModeSelector$1$1	I
/*      */     //   1040	11	47	value$iv	Ljava/lang/Object;
/*      */     //   1012	45	44	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1009	48	43	it$iv	Ljava/lang/Object;
/*      */     //   1000	59	42	$i$f$cache	I
/*      */     //   997	62	40	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   997	62	41	invalid$iv	Z
/*      */     //   1170	6	46	$i$a$-cache-PromptAreaKt$WidePromptModeSelector$1$2	I
/*      */     //   1194	11	47	value$iv	Ljava/lang/Object;
/*      */     //   1139	72	44	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1136	75	43	it$iv	Ljava/lang/Object;
/*      */     //   1127	86	42	$i$f$cache	I
/*      */     //   1124	89	40	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1124	89	41	invalid$iv	Z
/*      */     //   1328	7	46	$i$a$-cache-PromptAreaKt$WidePromptModeSelector$1$3	I
/*      */     //   1340	11	47	value$iv	Ljava/lang/Object;
/*      */     //   1312	45	44	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1309	48	43	it$iv	Ljava/lang/Object;
/*      */     //   1300	59	42	$i$f$cache	I
/*      */     //   1297	62	40	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1297	62	41	invalid$iv	Z
/*      */     //   1470	6	46	$i$a$-cache-PromptAreaKt$WidePromptModeSelector$1$4	I
/*      */     //   1494	11	47	value$iv	Ljava/lang/Object;
/*      */     //   1439	72	44	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1436	75	43	it$iv	Ljava/lang/Object;
/*      */     //   1427	86	42	$i$f$cache	I
/*      */     //   1424	89	40	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1424	89	41	invalid$iv	Z
/*      */     //   973	601	39	$i$a$-Row-PromptAreaKt$WidePromptModeSelector$1	I
/*      */     //   970	604	38	$this$WidePromptModeSelector_u24lambda_u2484	Landroidx/compose/foundation/layout/RowScope;
/*      */     //   970	604	37	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   970	604	36	$changed	I
/*      */     //   934	645	35	$i$a$-Layout-RowKt$Row$1$iv	I
/*      */     //   931	648	34	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   931	648	33	$changed$iv	I
/*      */     //   846	55	32	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   843	58	31	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   839	64	30	$i$f$set-impl	I
/*      */     //   836	67	29	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   802	115	28	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   799	118	27	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   736	854	26	$i$f$ReusableComposeNode	I
/*      */     //   733	857	24	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   733	857	25	$changed$iv$iv$iv	I
/*      */     //   677	918	20	$i$f$Layout	I
/*      */     //   694	901	21	compositeKeyHash$iv$iv	I
/*      */     //   702	893	22	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   710	885	23	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   674	921	19	$changed$iv$iv	I
/*      */     //   618	982	17	$i$f$Row	I
/*      */     //   664	936	18	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   636	964	15	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   615	985	16	$changed$iv	I
/*      */     //   211	1398	5	codeHovered$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   302	1307	6	askHovered$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   310	1299	7	activeTextColor	J
/*      */     //   324	1285	9	inactiveColor	J
/*      */     //   452	1157	11	codeTextColor$delegate	Landroidx/compose/runtime/State;
/*      */     //   580	1029	12	askTextColor$delegate	Landroidx/compose/runtime/State;
/*      */     //   27	1619	4	$dirty	I
/*      */     //   0	1646	0	selectedMode	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;
/*      */     //   0	1646	1	onSelected	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1646	2	$composer	Landroidx/compose/runtime/Composer;
/* 1046 */     //   0	1646	3	$changed	I } private static final boolean WidePromptModeSelector$lambda$67(MutableState $codeHovered$delegate) { State state = (State)$codeHovered$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void WidePromptModeSelector$lambda$68(MutableState $codeHovered$delegate, boolean <set-?>) { MutableState mutableState = $codeHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 1047 */     mutableState.setValue(value$iv); } private static final boolean WidePromptModeSelector$lambda$70(MutableState $askHovered$delegate) { State state = (State)$askHovered$delegate; Object object = null; KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 1049 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void WidePromptModeSelector$lambda$71(MutableState $askHovered$delegate, boolean <set-?>) { MutableState mutableState = $askHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 1050 */     mutableState.setValue(value$iv); } private static final long WidePromptModeSelector$lambda$73(State $codeTextColor$delegate) { State state = $codeTextColor$delegate; Object object = null; KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 1052 */     return ((Color)state.getValue()).unbox-impl(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class PromptAreaKt$WidePromptModeSelector$codeTextColor$2$1 implements Function0<Color> {
/* 1053 */     public final long invoke-0d7_KjU() { return (this.$selectedMode == PromptMode.Agent || PromptAreaKt.WidePromptModeSelector$lambda$67(this.$codeHovered$delegate)) ? this.$activeTextColor : this.$inactiveColor; } PromptAreaKt$WidePromptModeSelector$codeTextColor$2$1(PromptMode $selectedMode, long $activeTextColor, long $inactiveColor, MutableState<Boolean> $codeHovered$delegate) {} } private static final long WidePromptModeSelector$lambda$75(State $askTextColor$delegate) { State state = $askTextColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class PromptAreaKt$WidePromptModeSelector$askTextColor$2$1 implements Function0<Color> {
/*      */     public final long invoke-0d7_KjU() { return (this.$selectedMode == PromptMode.Chat || PromptAreaKt.WidePromptModeSelector$lambda$70(this.$askHovered$delegate)) ? this.$activeTextColor : this.$inactiveColor; } PromptAreaKt$WidePromptModeSelector$askTextColor$2$1(PromptMode $selectedMode, long $activeTextColor, long $inactiveColor, MutableState<Boolean> $askHovered$delegate) {} } private static final Unit WidePromptModeSelector$lambda$84$lambda$77$lambda$76(MutableState<Boolean> $codeHovered$delegate, boolean it) { WidePromptModeSelector$lambda$68($codeHovered$delegate, it); return Unit.INSTANCE; } private static final Unit WidePromptModeSelector$lambda$84$lambda$79$lambda$78(Function1 $onSelected) { $onSelected.invoke(PromptMode.Agent); return Unit.INSTANCE; } private static final Unit WidePromptModeSelector$lambda$84$lambda$81$lambda$80(MutableState<Boolean> $askHovered$delegate, boolean it) { WidePromptModeSelector$lambda$71($askHovered$delegate, it); return Unit.INSTANCE; } private static final Unit WidePromptModeSelector$lambda$84$lambda$83$lambda$82(Function1 $onSelected) { $onSelected.invoke(PromptMode.Chat); return Unit.INSTANCE; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void CompactPromptModeSelector(@NotNull PromptMode selectedMode, @Nullable Modifier modifier, @NotNull Function1 onSelected, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'selectedMode'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_2
/*      */     //   8: ldc_w 'onSelected'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload_3
/*      */     //   15: ldc_w 950245098
/*      */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   23: astore_3
/*      */     //   24: iload #4
/*      */     //   26: istore #6
/*      */     //   28: iload #5
/*      */     //   30: iconst_1
/*      */     //   31: iand
/*      */     //   32: ifeq -> 45
/*      */     //   35: iload #6
/*      */     //   37: bipush #6
/*      */     //   39: ior
/*      */     //   40: istore #6
/*      */     //   42: goto -> 73
/*      */     //   45: iload #4
/*      */     //   47: bipush #6
/*      */     //   49: iand
/*      */     //   50: ifne -> 73
/*      */     //   53: iload #6
/*      */     //   55: aload_3
/*      */     //   56: aload_0
/*      */     //   57: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   62: ifeq -> 69
/*      */     //   65: iconst_4
/*      */     //   66: goto -> 70
/*      */     //   69: iconst_2
/*      */     //   70: ior
/*      */     //   71: istore #6
/*      */     //   73: iload #5
/*      */     //   75: iconst_2
/*      */     //   76: iand
/*      */     //   77: ifeq -> 90
/*      */     //   80: iload #6
/*      */     //   82: bipush #48
/*      */     //   84: ior
/*      */     //   85: istore #6
/*      */     //   87: goto -> 120
/*      */     //   90: iload #4
/*      */     //   92: bipush #48
/*      */     //   94: iand
/*      */     //   95: ifne -> 120
/*      */     //   98: iload #6
/*      */     //   100: aload_3
/*      */     //   101: aload_1
/*      */     //   102: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   107: ifeq -> 115
/*      */     //   110: bipush #32
/*      */     //   112: goto -> 117
/*      */     //   115: bipush #16
/*      */     //   117: ior
/*      */     //   118: istore #6
/*      */     //   120: iload #5
/*      */     //   122: iconst_4
/*      */     //   123: iand
/*      */     //   124: ifeq -> 138
/*      */     //   127: iload #6
/*      */     //   129: sipush #384
/*      */     //   132: ior
/*      */     //   133: istore #6
/*      */     //   135: goto -> 171
/*      */     //   138: iload #4
/*      */     //   140: sipush #384
/*      */     //   143: iand
/*      */     //   144: ifne -> 171
/*      */     //   147: iload #6
/*      */     //   149: aload_3
/*      */     //   150: aload_2
/*      */     //   151: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   156: ifeq -> 165
/*      */     //   159: sipush #256
/*      */     //   162: goto -> 168
/*      */     //   165: sipush #128
/*      */     //   168: ior
/*      */     //   169: istore #6
/*      */     //   171: iload #6
/*      */     //   173: sipush #147
/*      */     //   176: iand
/*      */     //   177: sipush #146
/*      */     //   180: if_icmpne -> 192
/*      */     //   183: aload_3
/*      */     //   184: invokeinterface getSkipping : ()Z
/*      */     //   189: ifne -> 430
/*      */     //   192: iload #5
/*      */     //   194: iconst_2
/*      */     //   195: iand
/*      */     //   196: ifeq -> 206
/*      */     //   199: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   202: checkcast androidx/compose/ui/Modifier
/*      */     //   205: astore_1
/*      */     //   206: invokestatic isTraceInProgress : ()Z
/*      */     //   209: ifeq -> 224
/*      */     //   212: ldc_w 950245098
/*      */     //   215: iload #6
/*      */     //   217: iconst_m1
/*      */     //   218: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.CompactPromptModeSelector (PromptArea.kt:434)'
/*      */     //   221: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   224: aload_3
/*      */     //   225: iconst_0
/*      */     //   226: invokestatic getCompactPromptModeSelectorLinkStyle : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;
/*      */     //   229: astore #7
/*      */     //   231: aload_0
/*      */     //   232: invokevirtual getDisplayText : ()Ljava/lang/String;
/*      */     //   235: aload_1
/*      */     //   236: iconst_0
/*      */     //   237: aconst_null
/*      */     //   238: iconst_0
/*      */     //   239: aconst_null
/*      */     //   240: aload #7
/*      */     //   242: aconst_null
/*      */     //   243: aconst_null
/*      */     //   244: aload_3
/*      */     //   245: ldc_w 1943839225
/*      */     //   248: invokeinterface startReplaceGroup : (I)V
/*      */     //   253: aload_3
/*      */     //   254: astore #9
/*      */     //   256: iload #6
/*      */     //   258: bipush #14
/*      */     //   260: iand
/*      */     //   261: iconst_4
/*      */     //   262: if_icmpne -> 269
/*      */     //   265: iconst_1
/*      */     //   266: goto -> 270
/*      */     //   269: iconst_0
/*      */     //   270: iload #6
/*      */     //   272: sipush #896
/*      */     //   275: iand
/*      */     //   276: sipush #256
/*      */     //   279: if_icmpne -> 286
/*      */     //   282: iconst_1
/*      */     //   283: goto -> 287
/*      */     //   286: iconst_0
/*      */     //   287: ior
/*      */     //   288: istore #10
/*      */     //   290: nop
/*      */     //   291: iconst_0
/*      */     //   292: istore #11
/*      */     //   294: aload #9
/*      */     //   296: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   301: astore #12
/*      */     //   303: iconst_0
/*      */     //   304: istore #13
/*      */     //   306: iload #10
/*      */     //   308: ifne -> 322
/*      */     //   311: aload #12
/*      */     //   313: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   316: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   319: if_acmpne -> 388
/*      */     //   322: astore #24
/*      */     //   324: astore #23
/*      */     //   326: astore #22
/*      */     //   328: astore #21
/*      */     //   330: istore #20
/*      */     //   332: astore #19
/*      */     //   334: istore #18
/*      */     //   336: astore #17
/*      */     //   338: astore #16
/*      */     //   340: iconst_0
/*      */     //   341: istore #14
/*      */     //   343: aload_0
/*      */     //   344: aload_2
/*      */     //   345: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*      */     //   350: astore #25
/*      */     //   352: aload #16
/*      */     //   354: aload #17
/*      */     //   356: iload #18
/*      */     //   358: aload #19
/*      */     //   360: iload #20
/*      */     //   362: aload #21
/*      */     //   364: aload #22
/*      */     //   366: aload #23
/*      */     //   368: aload #24
/*      */     //   370: aload #25
/*      */     //   372: astore #15
/*      */     //   374: aload #9
/*      */     //   376: aload #15
/*      */     //   378: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   383: aload #15
/*      */     //   385: goto -> 390
/*      */     //   388: aload #12
/*      */     //   390: nop
/*      */     //   391: nop
/*      */     //   392: nop
/*      */     //   393: checkcast kotlin/jvm/functions/Function1
/*      */     //   396: astore #8
/*      */     //   398: aload_3
/*      */     //   399: invokeinterface endReplaceGroup : ()V
/*      */     //   404: aload #8
/*      */     //   406: aload_3
/*      */     //   407: bipush #112
/*      */     //   409: iload #6
/*      */     //   411: iand
/*      */     //   412: sipush #444
/*      */     //   415: invokestatic DropdownLink-RWo7tUw : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*      */     //   418: invokestatic isTraceInProgress : ()Z
/*      */     //   421: ifeq -> 436
/*      */     //   424: invokestatic traceEventEnd : ()V
/*      */     //   427: goto -> 436
/*      */     //   430: aload_3
/*      */     //   431: invokeinterface skipToGroupEnd : ()V
/*      */     //   436: aload_3
/*      */     //   437: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   442: dup
/*      */     //   443: ifnull -> 466
/*      */     //   446: aload_0
/*      */     //   447: aload_1
/*      */     //   448: aload_2
/*      */     //   449: iload #4
/*      */     //   451: iload #5
/*      */     //   453: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*      */     //   458: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   463: goto -> 467
/*      */     //   466: pop
/*      */     //   467: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #435	-> 14
/*      */     //   #433	-> 199
/*      */     //   #435	-> 221
/*      */     //   #437	-> 226
/*      */     //   #439	-> 231
/*      */     //   #438	-> 235
/*      */     //   #437	-> 240
/*      */     //   #440	-> 290
/*      */     //   #1021	-> 294
/*      */     //   #1022	-> 306
/*      */     //   #1023	-> 322
/*      */     //   #440	-> 343
/*      */     //   #1023	-> 372
/*      */     //   #1024	-> 374
/*      */     //   #1025	-> 383
/*      */     //   #1026	-> 388
/*      */     //   #1022	-> 390
/*      */     //   #1021	-> 391
/*      */     //   #1021	-> 392
/*      */     //   #440	-> 393
/*      */     //   #436	-> 415
/*      */     //   #452	-> 430
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   343	7	14	$i$a$-cache-PromptAreaKt$CompactPromptModeSelector$1	I
/*      */     //   374	11	15	value$iv	Ljava/lang/Object;
/*      */     //   306	85	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   303	88	12	it$iv	Ljava/lang/Object;
/*      */     //   294	99	11	$i$f$cache	I
/*      */     //   291	102	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   291	102	10	invalid$iv	Z
/*      */     //   28	440	6	$dirty	I
/*      */     //   0	468	0	selectedMode	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;
/*      */     //   0	468	1	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	468	2	onSelected	Lkotlin/jvm/functions/Function1;
/*      */     //   0	468	3	$composer	Landroidx/compose/runtime/Composer;
/* 1054 */     //   0	468	4	$changed	I } private static final Unit CompactPromptModeSelector$lambda$89$lambda$88(PromptMode $selectedMode, Function1 $onSelected, MenuScope $this$DropdownLink) { Intrinsics.checkNotNullParameter($this$DropdownLink, "$this$DropdownLink"); Iterable iterable = (Iterable)PromptMode.getEntries(); int $i$f$forEach = 0; Iterator iterator = iterable.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); PromptMode mode = (PromptMode)element$iv; int $i$a$-forEach-PromptAreaKt$CompactPromptModeSelector$1$1$1 = 0; }
/*      */     
/*      */     return Unit.INSTANCE; }
/*      */ 
/*      */   
/*      */   private static final Unit CompactPromptModeSelector$lambda$89$lambda$88$lambda$87$lambda$86(Function1 $onSelected, PromptMode $mode) {
/*      */     $onSelected.invoke($mode);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*      */   static final class PromptAreaKt$CompactPromptModeSelector$1$1$1$2 implements Function2<Composer, Integer, Unit> {
/*      */     PromptAreaKt$CompactPromptModeSelector$1$1$1$2(PromptMode $mode) {}
/*      */     
/*      */     @Composable
/*      */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */     public final void invoke(Composer $composer, int $changed) {
/*      */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventStart(1962264989, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.CompactPromptModeSelector.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PromptArea.kt:446)"); 
/*      */         TextKt.Text-bAzTDeA(this.$mode.getDisplayText(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534);
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventEnd(); 
/*      */       } else {
/*      */         $composer.skipToGroupEnd();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   @Composable
/*      */   @JvmName(name = "getCompactPromptModeSelectorLinkStyle")
/*      */   private static final LinkStyle getCompactPromptModeSelectorLinkStyle(Composer $composer, int $changed) {
/*      */     $composer.startReplaceGroup(-2038656858);
/*      */     if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventStart(-2038656858, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.<get-CompactPromptModeSelectorLinkStyle> (PromptArea.kt:454)"); 
/*      */     long l1 = Color.Companion.getUnspecified-0d7_KjU();
/*      */     long l2 = Color.Companion.getUnspecified-0d7_KjU();
/*      */     long l3 = Color.Companion.getUnspecified-0d7_KjU();
/*      */     long l4 = Color.Companion.getUnspecified-0d7_KjU();
/*      */     long l5 = Color.Companion.getUnspecified-0d7_KjU();
/*      */     long l6 = Color.Companion.getUnspecified-0d7_KjU();
/*      */     LinkColors linkColors = new LinkColors(l1, l6, l2, l4, l3, l5, null);
/*      */     int $this$dp$iv = 1, $i$f$getDp = 0;
/*      */     LinkMetrics linkMetrics = new LinkMetrics(JewelThemeKt.getLinkStyle(JewelTheme.Companion, $composer, 6).getMetrics().getFocusHaloCornerSize(), Dp.constructor-impl($this$dp$iv), JewelThemeKt.getLinkStyle(JewelTheme.Companion, $composer, 6).getMetrics().getIconSize-MYxV2XQ(), null);
/*      */     LinkUnderlineBehavior linkUnderlineBehavior = LinkUnderlineBehavior.ShowOnHover;
/*      */     LinkIcons linkIcons = JewelThemeKt.getLinkStyle(JewelTheme.Companion, $composer, 6).getIcons();
/*      */     LinkStyle linkStyle = new LinkStyle(linkColors, linkMetrics, linkIcons, linkUnderlineBehavior);
/*      */     if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventEnd(); 
/*      */     $composer.endReplaceGroup();
/*      */     return linkStyle;
/*      */   }
/*      */   
/*      */   private static final Unit PromptArea$lambda$19(Modifier $modifier, boolean $enabled, PromptOwnerViewModel $model, Function1<? super PromptMode, String> $placeholder, PromptMode $currentPromptMode, Function1<? super PromptMode, Unit> $onPromptModeChange, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     PromptArea($modifier, $enabled, $model, $placeholder, $currentPromptMode, $onPromptModeChange, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit PromptFiles$lambda$21(Modifier $modifier, AttachedFilesViewModel $model, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     PromptFiles($modifier, $model, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit PromptFiles$lambda$22(Modifier $modifier, AttachedFilesViewModel $model, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     PromptFiles($modifier, $model, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit FileLine$lambda$27(AttachedFile $file, AttachedFilesViewModel $model, int $$changed, Composer $composer, int $force) {
/*      */     FileLine($file, $model, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit PromptButtons$lambda$36(PromptOwnerViewModel $model, TextFieldState $textAreaState, boolean $enabled, PromptMode $promptMode, Function1<? super PromptMode, Unit> $onPromptModeChanged, int $$changed, Composer $composer, int $force) {
/*      */     PromptButtons($model, $textAreaState, $enabled, $promptMode, $onPromptModeChanged, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit PromptRow$lambda$55(PromptOwnerViewModel $model, boolean $braveMode, MatterhornModelPersistentStateComponent $settings, boolean $textAreaContentState, boolean $enabled, PromptMode $promptMode, Function2<? super Composer, ? super Integer, Unit> $promptSelectorContent, int $$changed, Composer $composer, int $force) {
/*      */     PromptRow($model, $braveMode, $settings, $textAreaContentState, $enabled, $promptMode, $promptSelectorContent, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit JunieFilePickerButton$lambda$65(Function0<? extends List<FileListEntry>> $getRecentFiles, Function0<GuidelinesEntry> $getGuidelines, Function1<? super AttachedFile, Unit> $onFileChosen, Function0<Unit> $openProjectFilePicker, Function0<Unit> $onCreateNewGuidelines, Function1<? super GuidelinesEntry, Unit> $onSelectGuidelines, Function0<Unit> $onCreateAiIgnoreFile, Function0<Unit> $onOpenAiIgnoreFile, Function1<? super Continuation<? super Boolean>, ? extends Object> $hasAIIgnoreFile, int $$changed, Composer $composer, int $force) {
/*      */     JunieFilePickerButton($getRecentFiles, $getGuidelines, $onFileChosen, $openProjectFilePicker, $onCreateNewGuidelines, $onSelectGuidelines, $onCreateAiIgnoreFile, $onOpenAiIgnoreFile, $hasAIIgnoreFile, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit WidePromptModeSelector$lambda$85(PromptMode $selectedMode, Function1<? super PromptMode, Unit> $onSelected, int $$changed, Composer $composer, int $force) {
/*      */     WidePromptModeSelector($selectedMode, $onSelected, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit CompactPromptModeSelector$lambda$90(PromptMode $selectedMode, Modifier $modifier, Function1<? super PromptMode, Unit> $onSelected, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     CompactPromptModeSelector($selectedMode, $modifier, $onSelected, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\PromptAreaKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */