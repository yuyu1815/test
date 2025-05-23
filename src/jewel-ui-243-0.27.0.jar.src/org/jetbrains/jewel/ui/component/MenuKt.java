/*      */ package org.jetbrains.jewel.ui.component;
/*      */ 
/*      */ import androidx.compose.foundation.interaction.Interaction;
/*      */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*      */ import androidx.compose.foundation.layout.Arrangement;
/*      */ import androidx.compose.foundation.layout.BoxKt;
/*      */ import androidx.compose.foundation.layout.BoxScope;
/*      */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*      */ import androidx.compose.foundation.layout.PaddingKt;
/*      */ import androidx.compose.foundation.layout.PaddingValues;
/*      */ import androidx.compose.foundation.layout.RowKt;
/*      */ import androidx.compose.foundation.layout.RowScope;
/*      */ import androidx.compose.foundation.layout.RowScopeInstance;
/*      */ import androidx.compose.foundation.layout.SizeKt;
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.ComposableInferredTarget;
/*      */ import androidx.compose.runtime.ComposableTarget;
/*      */ import androidx.compose.runtime.ComposablesKt;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.CompositionLocal;
/*      */ import androidx.compose.runtime.CompositionLocalKt;
/*      */ import androidx.compose.runtime.CompositionLocalMap;
/*      */ import androidx.compose.runtime.DisposableEffectResult;
/*      */ import androidx.compose.runtime.DisposableEffectScope;
/*      */ import androidx.compose.runtime.MutableState;
/*      */ import androidx.compose.runtime.ProvidedValue;
/*      */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*      */ import androidx.compose.runtime.State;
/*      */ import androidx.compose.runtime.Updater;
/*      */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*      */ import androidx.compose.ui.Alignment;
/*      */ import androidx.compose.ui.ComposedModifierKt;
/*      */ import androidx.compose.ui.Modifier;
/*      */ import androidx.compose.ui.focus.FocusManager;
/*      */ import androidx.compose.ui.focus.FocusRequester;
/*      */ import androidx.compose.ui.geometry.CornerRadiusKt;
/*      */ import androidx.compose.ui.geometry.OffsetKt;
/*      */ import androidx.compose.ui.geometry.Size;
/*      */ import androidx.compose.ui.geometry.SizeKt;
/*      */ import androidx.compose.ui.graphics.Color;
/*      */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*      */ import androidx.compose.ui.input.InputMode;
/*      */ import androidx.compose.ui.input.InputModeManager;
/*      */ import androidx.compose.ui.input.key.Key;
/*      */ import androidx.compose.ui.input.key.KeyEvent;
/*      */ import androidx.compose.ui.input.key.KeyEventType;
/*      */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*      */ import androidx.compose.ui.layout.MeasurePolicy;
/*      */ import androidx.compose.ui.node.ComposeUiNode;
/*      */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*      */ import androidx.compose.ui.unit.Density;
/*      */ import androidx.compose.ui.unit.Dp;
/*      */ import androidx.compose.ui.unit.LayoutDirection;
/*      */ import androidx.compose.ui.window.PopupProperties;
/*      */ import java.util.List;
/*      */ import java.util.Set;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ReplaceWith;
/*      */ import kotlin.ResultKt;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.reflect.KProperty;
/*      */ import kotlinx.coroutines.CoroutineScope;
/*      */ import kotlinx.coroutines.flow.FlowCollector;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ import org.jetbrains.jewel.foundation.state.InteractiveComponentState;
/*      */ import org.jetbrains.jewel.foundation.theme.JewelThemeKt;
/*      */ import org.jetbrains.jewel.ui.component.styling.MenuItemColors;
/*      */ import org.jetbrains.jewel.ui.component.styling.MenuItemMetrics;
/*      */ import org.jetbrains.jewel.ui.component.styling.MenuMetrics;
/*      */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*      */ import org.jetbrains.jewel.ui.component.styling.MenuStylingKt;
/*      */ import org.jetbrains.jewel.ui.icon.IconKey;
/*      */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*      */ import org.jetbrains.jewel.ui.painter.hints.StatefulKt;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000Â\001\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\032`\020\000\032\0020\0012\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\027\020\016\032\023\022\004\022\0020\017\022\004\022\0020\0010\003¢\006\002\b\020H\007¢\006\002\020\021\032:\020\022\032\0020\0012\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\027\020\016\032\023\022\004\022\0020\017\022\004\022\0020\0010\003¢\006\002\b\020H\001¢\006\002\020\023\032)\020\024\032\0020\0012\006\020\025\032\0020\0262\b\b\002\020\027\032\0020\0052\b\b\002\020\030\032\0020\005H\003¢\006\002\020\031\032\n\020\032\032\0020\001*\0020\017\032X\020\033\032\0020\001*\0020\0172\006\020\034\032\0020\0352\022\020\036\032\016\022\004\022\0020\035\022\004\022\0020\0050\0032\022\020\037\032\016\022\004\022\0020\035\022\004\022\0020\0010\0032\027\020\016\032\023\022\004\022\0020\035\022\004\022\0020\0010\003¢\006\002\b ¢\006\002\020!\032d\020\033\032\0020\001\"\004\b\000\020\"*\0020\0172\f\020\033\032\b\022\004\022\002H\"0#2\022\020\036\032\016\022\004\022\002H\"\022\004\022\0020\0050\0032\022\020\037\032\016\022\004\022\002H\"\022\004\022\0020\0010\0032\027\020\016\032\023\022\004\022\002H\"\022\004\022\0020\0010\003¢\006\002\b ¢\006\002\020$\032#\020%\032\b\022\004\022\0020\0260#*\023\022\004\022\0020\017\022\004\022\0020\0010\003¢\006\002\b\020H\002\032+\020&\032\0020\0012\b\b\002\020\b\032\0020\t2\b\b\002\020'\032\0020(2\b\b\002\020)\032\0020*H\007¢\006\002\020+\032\001\020,\032\0020\0012\006\020-\032\0020\0052\f\020.\032\b\022\004\022\0020\0010/2\b\b\002\020\b\032\0020\t2\b\b\002\0200\032\0020\0052\b\0201\032\004\030\001022\016\0203\032\n\022\004\022\00205\030\001042\006\020\027\032\0020\0052\006\020\030\032\0020\0052\b\b\002\0206\032\002072\b\b\002\020\n\032\0020\0132\021\020\016\032\r\022\004\022\0020\0010/¢\006\002\b H\001¢\006\002\0208\032\0209\032\0020\0012\b\b\002\020\b\032\0020\t2\b\b\002\0200\032\0020\0052\006\020\027\032\0020\0052\b\020:\032\004\030\001052\n\020;\032\006\022\002\b\0030<2\b\b\002\0206\032\002072\b\b\002\020\n\032\0020\0132\027\020=\032\023\022\004\022\0020\017\022\004\022\0020\0010\003¢\006\002\b\0202\021\020\016\032\r\022\004\022\0020\0010/¢\006\002\b H\007¢\006\002\020>\032s\0209\032\0020\0012\b\b\002\020\b\032\0020\t2\b\b\002\0200\032\0020\0052\006\020\027\032\0020\0052\b\0201\032\004\030\001022\b\b\002\0206\032\002072\b\b\002\020\n\032\0020\0132\027\020=\032\023\022\004\022\0020\017\022\004\022\0020\0010\003¢\006\002\b\0202\021\020\016\032\r\022\004\022\0020\0010/¢\006\002\b H\007¢\006\002\020?\032#\020@\032\0020\t*\0020\t2\006\020A\032\0020(2\006\020B\032\0020CH\002¢\006\004\bD\020E\032+\020F\032\0020G*\0020G2\006\020H\032\0020I2\006\020J\032\0020K2\006\020L\032\0020MH\002¢\006\004\bN\020O\032N\020P\032\0020\0012\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\027\020\016\032\023\022\004\022\0020\017\022\004\022\0020\0010\003¢\006\002\b\020H\001¢\006\002\020Q¨\006R²\006\f\020S\032\004\030\0010TX\002²\006\f\020U\032\004\030\0010VX\002²\006\020\020\033\032\b\022\004\022\0020\0260#X\002²\006\n\020W\032\0020XX\002²\006\n\020B\032\0020CX\002²\006\n\020W\032\0020XX\002²\006\n\020B\032\0020CX\002²\006\f\020S\032\004\030\0010TX\002²\006\f\020U\032\004\030\0010VX\002"}, d2 = {"PopupMenu", "", "onDismissRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/input/InputMode;", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "popupProperties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Lorg/jetbrains/jewel/ui/component/MenuScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MenuContent", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ShowMenuItem", "item", "Lorg/jetbrains/jewel/ui/component/MenuItem;", "canShowIcon", "canShowKeybinding", "(Lorg/jetbrains/jewel/ui/component/MenuItem;ZZLandroidx/compose/runtime/Composer;II)V", "separator", "items", "count", "", "isSelected", "onItemClick", "Landroidx/compose/runtime/Composable;", "(Lorg/jetbrains/jewel/ui/component/MenuScope;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "T", "", "(Lorg/jetbrains/jewel/ui/component/MenuScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "asList", "MenuSeparator", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;", "colors", "Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;Landroidx/compose/runtime/Composer;II)V", "MenuItem", "selected", "onClick", "Lkotlin/Function0;", "enabled", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "keybinding", "", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "MenuSubmenuItem", "iconResource", "iconClass", "Ljava/lang/Class;", "submenu", "(Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Ljava/lang/Class;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/icon/IconKey;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "drawItemBackground", "itemMetrics", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawItemBackground-mxwnekA", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;J)Landroidx/compose/ui/Modifier;", "subtract", "Landroidx/compose/ui/geometry/Size;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "subtract-Cqks5Fs", "(JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)J", "Submenu", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ui", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "itemState", "Lorg/jetbrains/jewel/ui/component/MenuItemState;"})
/*      */ @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 12 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,706:1\n77#2:707\n77#2:785\n77#2:985\n77#2:986\n77#2:1139\n77#2:1152\n1225#3,6:708\n1225#3,6:714\n1225#3,6:720\n1225#3,6:726\n1225#3,6:732\n1225#3,6:738\n1225#3,6:744\n1225#3,3:750\n1228#3,3:764\n1225#3,3:767\n1228#3,3:773\n1225#3,3:776\n1228#3,3:782\n1225#3,6:786\n1225#3,6:955\n1225#3,6:961\n1225#3,6:967\n1225#3,6:973\n1225#3,6:979\n1225#3,6:987\n1225#3,6:1029\n1225#3,6:1039\n1225#3,6:1045\n1225#3,6:1051\n1225#3,6:1057\n1225#3,6:1063\n1225#3,6:1069\n1225#3,6:1075\n1225#3,6:1081\n1225#3,6:1087\n1225#3,6:1129\n1225#3,6:1140\n1225#3,6:1146\n1225#3,6:1153\n1225#3,6:1159\n1225#3,6:1165\n1225#3,6:1171\n800#4,11:753\n1747#4,3:770\n1747#4,3:779\n1855#4,2:864\n71#5:792\n68#5,6:793\n74#5:827\n71#5:870\n68#5,6:871\n74#5:905\n78#5:909\n78#5:913\n71#5:915\n68#5,6:916\n74#5:950\n78#5:954\n71#5:993\n68#5,6:994\n74#5:1028\n78#5:1038\n71#5:1093\n68#5,6:1094\n74#5:1128\n78#5:1138\n79#6,6:799\n86#6,4:814\n90#6,2:824\n79#6,6:835\n86#6,4:850\n90#6,2:860\n94#6:868\n79#6,6:877\n86#6,4:892\n90#6,2:902\n94#6:908\n94#6:912\n79#6,6:922\n86#6,4:937\n90#6,2:947\n94#6:953\n79#6,6:1000\n86#6,4:1015\n90#6,2:1025\n94#6:1037\n79#6,6:1100\n86#6,4:1115\n90#6,2:1125\n94#6:1137\n368#7,9:805\n377#7:826\n368#7,9:841\n377#7:862\n378#7,2:866\n368#7,9:883\n377#7:904\n378#7,2:906\n378#7,2:910\n368#7,9:928\n377#7:949\n378#7,2:951\n368#7,9:1006\n377#7:1027\n378#7,2:1035\n368#7,9:1106\n377#7:1127\n378#7,2:1135\n4034#8,6:818\n4034#8,6:854\n4034#8,6:896\n4034#8,6:941\n4034#8,6:1019\n4034#8,6:1119\n86#9:828\n83#9,6:829\n89#9:863\n93#9:869\n1#10:914\n81#11:1177\n107#11,2:1178\n81#11:1180\n107#11,2:1181\n81#11:1183\n81#11:1184\n107#11,2:1185\n81#11:1192\n107#11,2:1193\n81#11:1195\n81#11:1196\n107#11,2:1197\n81#11:1199\n107#11,2:1200\n63#12,5:1187\n*S KotlinDebug\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt\n*L\n99#1:707\n148#1:785\n369#1:985\n370#1:986\n608#1:1139\n620#1:1152\n109#1:708,6\n110#1:714,6\n111#1:720,6\n115#1:726,6\n117#1:732,6\n118#1:738,6\n141#1:744,6\n143#1:750,3\n143#1:764,3\n145#1:767,3\n145#1:773,3\n146#1:776,3\n146#1:782,3\n165#1:786,6\n339#1:955,6\n344#1:961,6\n346#1:967,6\n348#1:973,6\n350#1:979,6\n378#1:987,6\n389#1:1029,6\n458#1:1039,6\n463#1:1045,6\n473#1:1051,6\n479#1:1057,6\n481#1:1063,6\n483#1:1069,6\n485#1:1075,6\n515#1:1081,6\n521#1:1087,6\n558#1:1129,6\n618#1:1140,6\n619#1:1146,6\n622#1:1153,6\n626#1:1159,6\n628#1:1165,6\n629#1:1171,6\n143#1:753,11\n145#1:770,3\n146#1:779,3\n168#1:864,2\n153#1:792\n153#1:793,6\n153#1:827\n171#1:870\n171#1:871,6\n171#1:905\n171#1:909\n153#1:913\n319#1:915\n319#1:916,6\n319#1:950\n319#1:954\n372#1:993\n372#1:994,6\n372#1:1028\n372#1:1038\n508#1:1093\n508#1:1094,6\n508#1:1128\n508#1:1138\n153#1:799,6\n153#1:814,4\n153#1:824,2\n167#1:835,6\n167#1:850,4\n167#1:860,2\n167#1:868\n171#1:877,6\n171#1:892,4\n171#1:902,2\n171#1:908\n153#1:912\n319#1:922,6\n319#1:937,4\n319#1:947,2\n319#1:953\n372#1:1000,6\n372#1:1015,4\n372#1:1025,2\n372#1:1037\n508#1:1100,6\n508#1:1115,4\n508#1:1125,2\n508#1:1137\n153#1:805,9\n153#1:826\n167#1:841,9\n167#1:862\n167#1:866,2\n171#1:883,9\n171#1:904\n171#1:906,2\n153#1:910,2\n319#1:928,9\n319#1:949\n319#1:951,2\n372#1:1006,9\n372#1:1027\n372#1:1035,2\n508#1:1106,9\n508#1:1127\n508#1:1135,2\n153#1:818,6\n167#1:854,6\n171#1:896,6\n319#1:941,6\n372#1:1019,6\n508#1:1119,6\n167#1:828\n167#1:829,6\n167#1:863\n167#1:869\n109#1:1177\n109#1:1178,2\n110#1:1180\n110#1:1181,2\n141#1:1183\n344#1:1184\n344#1:1185,2\n479#1:1192\n479#1:1193,2\n507#1:1195\n618#1:1196\n618#1:1197,2\n619#1:1199\n619#1:1200,2\n394#1:1187,5\n*E\n"})
/*      */ public final class MenuKt
/*      */ {
/*      */   @Composable
/*      */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */   public static final void PopupMenu(@NotNull Function1 onDismissRequest, @NotNull Alignment.Horizontal horizontalAlignment, @Nullable Modifier modifier, @Nullable MenuStyle style, @Nullable PopupProperties popupProperties, @NotNull Function1 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 'onDismissRequest'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_1
/*      */     //   7: ldc 'horizontalAlignment'
/*      */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   12: aload #5
/*      */     //   14: ldc 'content'
/*      */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   19: aload #6
/*      */     //   21: ldc 1537282076
/*      */     //   23: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   28: astore #6
/*      */     //   30: iload #7
/*      */     //   32: istore #9
/*      */     //   34: iload #8
/*      */     //   36: iconst_1
/*      */     //   37: iand
/*      */     //   38: ifeq -> 51
/*      */     //   41: iload #9
/*      */     //   43: bipush #6
/*      */     //   45: ior
/*      */     //   46: istore #9
/*      */     //   48: goto -> 80
/*      */     //   51: iload #7
/*      */     //   53: bipush #6
/*      */     //   55: iand
/*      */     //   56: ifne -> 80
/*      */     //   59: iload #9
/*      */     //   61: aload #6
/*      */     //   63: aload_0
/*      */     //   64: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   69: ifeq -> 76
/*      */     //   72: iconst_4
/*      */     //   73: goto -> 77
/*      */     //   76: iconst_2
/*      */     //   77: ior
/*      */     //   78: istore #9
/*      */     //   80: iload #8
/*      */     //   82: iconst_2
/*      */     //   83: iand
/*      */     //   84: ifeq -> 97
/*      */     //   87: iload #9
/*      */     //   89: bipush #48
/*      */     //   91: ior
/*      */     //   92: istore #9
/*      */     //   94: goto -> 128
/*      */     //   97: iload #7
/*      */     //   99: bipush #48
/*      */     //   101: iand
/*      */     //   102: ifne -> 128
/*      */     //   105: iload #9
/*      */     //   107: aload #6
/*      */     //   109: aload_1
/*      */     //   110: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   115: ifeq -> 123
/*      */     //   118: bipush #32
/*      */     //   120: goto -> 125
/*      */     //   123: bipush #16
/*      */     //   125: ior
/*      */     //   126: istore #9
/*      */     //   128: iload #8
/*      */     //   130: iconst_4
/*      */     //   131: iand
/*      */     //   132: ifeq -> 146
/*      */     //   135: iload #9
/*      */     //   137: sipush #384
/*      */     //   140: ior
/*      */     //   141: istore #9
/*      */     //   143: goto -> 180
/*      */     //   146: iload #7
/*      */     //   148: sipush #384
/*      */     //   151: iand
/*      */     //   152: ifne -> 180
/*      */     //   155: iload #9
/*      */     //   157: aload #6
/*      */     //   159: aload_2
/*      */     //   160: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   165: ifeq -> 174
/*      */     //   168: sipush #256
/*      */     //   171: goto -> 177
/*      */     //   174: sipush #128
/*      */     //   177: ior
/*      */     //   178: istore #9
/*      */     //   180: iload #7
/*      */     //   182: sipush #3072
/*      */     //   185: iand
/*      */     //   186: ifne -> 222
/*      */     //   189: iload #9
/*      */     //   191: iload #8
/*      */     //   193: bipush #8
/*      */     //   195: iand
/*      */     //   196: ifne -> 216
/*      */     //   199: aload #6
/*      */     //   201: aload_3
/*      */     //   202: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   207: ifeq -> 216
/*      */     //   210: sipush #2048
/*      */     //   213: goto -> 219
/*      */     //   216: sipush #1024
/*      */     //   219: ior
/*      */     //   220: istore #9
/*      */     //   222: iload #8
/*      */     //   224: bipush #16
/*      */     //   226: iand
/*      */     //   227: ifeq -> 241
/*      */     //   230: iload #9
/*      */     //   232: sipush #24576
/*      */     //   235: ior
/*      */     //   236: istore #9
/*      */     //   238: goto -> 276
/*      */     //   241: iload #7
/*      */     //   243: sipush #24576
/*      */     //   246: iand
/*      */     //   247: ifne -> 276
/*      */     //   250: iload #9
/*      */     //   252: aload #6
/*      */     //   254: aload #4
/*      */     //   256: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   261: ifeq -> 270
/*      */     //   264: sipush #16384
/*      */     //   267: goto -> 273
/*      */     //   270: sipush #8192
/*      */     //   273: ior
/*      */     //   274: istore #9
/*      */     //   276: iload #8
/*      */     //   278: bipush #32
/*      */     //   280: iand
/*      */     //   281: ifeq -> 294
/*      */     //   284: iload #9
/*      */     //   286: ldc 196608
/*      */     //   288: ior
/*      */     //   289: istore #9
/*      */     //   291: goto -> 326
/*      */     //   294: iload #7
/*      */     //   296: ldc 196608
/*      */     //   298: iand
/*      */     //   299: ifne -> 326
/*      */     //   302: iload #9
/*      */     //   304: aload #6
/*      */     //   306: aload #5
/*      */     //   308: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   313: ifeq -> 321
/*      */     //   316: ldc 131072
/*      */     //   318: goto -> 323
/*      */     //   321: ldc 65536
/*      */     //   323: ior
/*      */     //   324: istore #9
/*      */     //   326: iload #9
/*      */     //   328: ldc 74899
/*      */     //   330: iand
/*      */     //   331: ldc 74898
/*      */     //   333: if_icmpne -> 346
/*      */     //   336: aload #6
/*      */     //   338: invokeinterface getSkipping : ()Z
/*      */     //   343: ifne -> 1259
/*      */     //   346: aload #6
/*      */     //   348: invokeinterface startDefaults : ()V
/*      */     //   353: iload #7
/*      */     //   355: iconst_1
/*      */     //   356: iand
/*      */     //   357: ifeq -> 370
/*      */     //   360: aload #6
/*      */     //   362: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   367: ifeq -> 438
/*      */     //   370: iload #8
/*      */     //   372: iconst_4
/*      */     //   373: iand
/*      */     //   374: ifeq -> 384
/*      */     //   377: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   380: checkcast androidx/compose/ui/Modifier
/*      */     //   383: astore_2
/*      */     //   384: iload #8
/*      */     //   386: bipush #8
/*      */     //   388: iand
/*      */     //   389: ifeq -> 411
/*      */     //   392: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   395: aload #6
/*      */     //   397: bipush #6
/*      */     //   399: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   402: astore_3
/*      */     //   403: iload #9
/*      */     //   405: sipush #-7169
/*      */     //   408: iand
/*      */     //   409: istore #9
/*      */     //   411: iload #8
/*      */     //   413: bipush #16
/*      */     //   415: iand
/*      */     //   416: ifeq -> 461
/*      */     //   419: new androidx/compose/ui/window/PopupProperties
/*      */     //   422: dup
/*      */     //   423: iconst_1
/*      */     //   424: iconst_0
/*      */     //   425: iconst_0
/*      */     //   426: iconst_0
/*      */     //   427: bipush #14
/*      */     //   429: aconst_null
/*      */     //   430: invokespecial <init> : (ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   433: astore #4
/*      */     //   435: goto -> 461
/*      */     //   438: aload #6
/*      */     //   440: invokeinterface skipToGroupEnd : ()V
/*      */     //   445: iload #8
/*      */     //   447: bipush #8
/*      */     //   449: iand
/*      */     //   450: ifeq -> 461
/*      */     //   453: iload #9
/*      */     //   455: sipush #-7169
/*      */     //   458: iand
/*      */     //   459: istore #9
/*      */     //   461: aload #6
/*      */     //   463: invokeinterface endDefaults : ()V
/*      */     //   468: invokestatic isTraceInProgress : ()Z
/*      */     //   471: ifeq -> 484
/*      */     //   474: ldc 1537282076
/*      */     //   476: iload #9
/*      */     //   478: iconst_m1
/*      */     //   479: ldc 'org.jetbrains.jewel.ui.component.PopupMenu (Menu.kt:97)'
/*      */     //   481: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   484: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*      */     //   487: checkcast androidx/compose/runtime/CompositionLocal
/*      */     //   490: astore #11
/*      */     //   492: iconst_0
/*      */     //   493: istore #12
/*      */     //   495: iconst_0
/*      */     //   496: istore #13
/*      */     //   498: aload #6
/*      */     //   500: ldc 2023513938
/*      */     //   502: ldc 'CC:CompositionLocal.kt#9igjgp'
/*      */     //   504: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   507: aload #6
/*      */     //   509: aload #11
/*      */     //   511: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*      */     //   516: astore #14
/*      */     //   518: aload #6
/*      */     //   520: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   523: aload #14
/*      */     //   525: checkcast androidx/compose/ui/unit/Density
/*      */     //   528: astore #10
/*      */     //   530: new org/jetbrains/jewel/ui/component/AnchorVerticalMenuPositionProvider
/*      */     //   533: dup
/*      */     //   534: aload_3
/*      */     //   535: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   538: invokevirtual getOffset-RKDOV3M : ()J
/*      */     //   541: aload_3
/*      */     //   542: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   545: invokevirtual getMenuMargin : ()Landroidx/compose/foundation/layout/PaddingValues;
/*      */     //   548: aload_1
/*      */     //   549: aload #10
/*      */     //   551: aconst_null
/*      */     //   552: invokespecial <init> : (JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   555: astore #11
/*      */     //   557: aload #6
/*      */     //   559: ldc 1358341038
/*      */     //   561: invokeinterface startReplaceGroup : (I)V
/*      */     //   566: aload #6
/*      */     //   568: astore #14
/*      */     //   570: iconst_0
/*      */     //   571: istore #15
/*      */     //   573: nop
/*      */     //   574: iconst_0
/*      */     //   575: istore #16
/*      */     //   577: aload #14
/*      */     //   579: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   584: astore #17
/*      */     //   586: iconst_0
/*      */     //   587: istore #18
/*      */     //   589: aload #17
/*      */     //   591: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   594: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   597: if_acmpne -> 626
/*      */     //   600: iconst_0
/*      */     //   601: istore #19
/*      */     //   603: aconst_null
/*      */     //   604: aconst_null
/*      */     //   605: iconst_2
/*      */     //   606: aconst_null
/*      */     //   607: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   610: astore #19
/*      */     //   612: aload #14
/*      */     //   614: aload #19
/*      */     //   616: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   621: aload #19
/*      */     //   623: goto -> 628
/*      */     //   626: aload #17
/*      */     //   628: nop
/*      */     //   629: nop
/*      */     //   630: nop
/*      */     //   631: checkcast androidx/compose/runtime/MutableState
/*      */     //   634: astore #13
/*      */     //   636: aload #6
/*      */     //   638: invokeinterface endReplaceGroup : ()V
/*      */     //   643: aload #13
/*      */     //   645: astore #12
/*      */     //   647: aload #6
/*      */     //   649: ldc 1358343630
/*      */     //   651: invokeinterface startReplaceGroup : (I)V
/*      */     //   656: aload #6
/*      */     //   658: astore #15
/*      */     //   660: iconst_0
/*      */     //   661: istore #16
/*      */     //   663: nop
/*      */     //   664: iconst_0
/*      */     //   665: istore #17
/*      */     //   667: aload #15
/*      */     //   669: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   674: astore #18
/*      */     //   676: iconst_0
/*      */     //   677: istore #19
/*      */     //   679: aload #18
/*      */     //   681: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   684: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   687: if_acmpne -> 716
/*      */     //   690: iconst_0
/*      */     //   691: istore #20
/*      */     //   693: aconst_null
/*      */     //   694: aconst_null
/*      */     //   695: iconst_2
/*      */     //   696: aconst_null
/*      */     //   697: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   700: astore #20
/*      */     //   702: aload #15
/*      */     //   704: aload #20
/*      */     //   706: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   711: aload #20
/*      */     //   713: goto -> 718
/*      */     //   716: aload #18
/*      */     //   718: nop
/*      */     //   719: nop
/*      */     //   720: nop
/*      */     //   721: checkcast androidx/compose/runtime/MutableState
/*      */     //   724: astore #14
/*      */     //   726: aload #6
/*      */     //   728: invokeinterface endReplaceGroup : ()V
/*      */     //   733: aload #14
/*      */     //   735: astore #13
/*      */     //   737: aload #6
/*      */     //   739: ldc 1358345468
/*      */     //   741: invokeinterface startReplaceGroup : (I)V
/*      */     //   746: aload #6
/*      */     //   748: astore #16
/*      */     //   750: iload #9
/*      */     //   752: bipush #14
/*      */     //   754: iand
/*      */     //   755: iconst_4
/*      */     //   756: if_icmpne -> 763
/*      */     //   759: iconst_1
/*      */     //   760: goto -> 764
/*      */     //   763: iconst_0
/*      */     //   764: istore #17
/*      */     //   766: nop
/*      */     //   767: iconst_0
/*      */     //   768: istore #18
/*      */     //   770: aload #16
/*      */     //   772: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   777: astore #19
/*      */     //   779: iconst_0
/*      */     //   780: istore #20
/*      */     //   782: iload #17
/*      */     //   784: ifne -> 798
/*      */     //   787: aload #19
/*      */     //   789: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   792: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   795: if_acmpne -> 828
/*      */     //   798: iconst_0
/*      */     //   799: istore #21
/*      */     //   801: new org/jetbrains/jewel/ui/component/MenuManager
/*      */     //   804: dup
/*      */     //   805: aload_0
/*      */     //   806: aconst_null
/*      */     //   807: iconst_2
/*      */     //   808: aconst_null
/*      */     //   809: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/MenuManager;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   812: astore #22
/*      */     //   814: aload #16
/*      */     //   816: aload #22
/*      */     //   818: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   823: aload #22
/*      */     //   825: goto -> 830
/*      */     //   828: aload #19
/*      */     //   830: nop
/*      */     //   831: nop
/*      */     //   832: nop
/*      */     //   833: checkcast org/jetbrains/jewel/ui/component/MenuManager
/*      */     //   836: astore #15
/*      */     //   838: aload #6
/*      */     //   840: invokeinterface endReplaceGroup : ()V
/*      */     //   845: aload #15
/*      */     //   847: astore #14
/*      */     //   849: aload #11
/*      */     //   851: checkcast androidx/compose/ui/window/PopupPositionProvider
/*      */     //   854: aload #6
/*      */     //   856: ldc 1358350994
/*      */     //   858: invokeinterface startReplaceGroup : (I)V
/*      */     //   863: aload #6
/*      */     //   865: astore #16
/*      */     //   867: iload #9
/*      */     //   869: bipush #14
/*      */     //   871: iand
/*      */     //   872: iconst_4
/*      */     //   873: if_icmpne -> 880
/*      */     //   876: iconst_1
/*      */     //   877: goto -> 881
/*      */     //   880: iconst_0
/*      */     //   881: istore #17
/*      */     //   883: nop
/*      */     //   884: iconst_0
/*      */     //   885: istore #18
/*      */     //   887: aload #16
/*      */     //   889: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   894: astore #19
/*      */     //   896: iconst_0
/*      */     //   897: istore #20
/*      */     //   899: iload #17
/*      */     //   901: ifne -> 915
/*      */     //   904: aload #19
/*      */     //   906: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   909: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   912: if_acmpne -> 945
/*      */     //   915: astore #23
/*      */     //   917: iconst_0
/*      */     //   918: istore #21
/*      */     //   920: aload_0
/*      */     //   921: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*      */     //   926: aload #23
/*      */     //   928: swap
/*      */     //   929: astore #22
/*      */     //   931: aload #16
/*      */     //   933: aload #22
/*      */     //   935: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   940: aload #22
/*      */     //   942: goto -> 947
/*      */     //   945: aload #19
/*      */     //   947: nop
/*      */     //   948: nop
/*      */     //   949: nop
/*      */     //   950: checkcast kotlin/jvm/functions/Function0
/*      */     //   953: astore #15
/*      */     //   955: aload #6
/*      */     //   957: invokeinterface endReplaceGroup : ()V
/*      */     //   962: aload #15
/*      */     //   964: aload #4
/*      */     //   966: aload #6
/*      */     //   968: ldc 1358354326
/*      */     //   970: invokeinterface startReplaceGroup : (I)V
/*      */     //   975: aload #6
/*      */     //   977: astore #16
/*      */     //   979: iconst_0
/*      */     //   980: istore #17
/*      */     //   982: nop
/*      */     //   983: iconst_0
/*      */     //   984: istore #18
/*      */     //   986: aload #16
/*      */     //   988: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   993: astore #19
/*      */     //   995: iconst_0
/*      */     //   996: istore #20
/*      */     //   998: aload #19
/*      */     //   1000: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1003: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1006: if_acmpne -> 1050
/*      */     //   1009: astore #25
/*      */     //   1011: astore #24
/*      */     //   1013: astore #23
/*      */     //   1015: iconst_0
/*      */     //   1016: istore #21
/*      */     //   1018: getstatic org/jetbrains/jewel/ui/component/MenuKt$PopupMenu$2$1.INSTANCE : Lorg/jetbrains/jewel/ui/component/MenuKt$PopupMenu$2$1;
/*      */     //   1021: checkcast kotlin/jvm/functions/Function1
/*      */     //   1024: astore #26
/*      */     //   1026: aload #23
/*      */     //   1028: aload #24
/*      */     //   1030: aload #25
/*      */     //   1032: aload #26
/*      */     //   1034: astore #21
/*      */     //   1036: aload #16
/*      */     //   1038: aload #21
/*      */     //   1040: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1045: aload #21
/*      */     //   1047: goto -> 1052
/*      */     //   1050: aload #19
/*      */     //   1052: nop
/*      */     //   1053: nop
/*      */     //   1054: nop
/*      */     //   1055: checkcast kotlin/jvm/functions/Function1
/*      */     //   1058: astore #15
/*      */     //   1060: aload #6
/*      */     //   1062: invokeinterface endReplaceGroup : ()V
/*      */     //   1067: aload #15
/*      */     //   1069: aload #6
/*      */     //   1071: ldc 1358355667
/*      */     //   1073: invokeinterface startReplaceGroup : (I)V
/*      */     //   1078: aload #6
/*      */     //   1080: astore #16
/*      */     //   1082: aload #6
/*      */     //   1084: aload #14
/*      */     //   1086: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1091: istore #17
/*      */     //   1093: nop
/*      */     //   1094: iconst_0
/*      */     //   1095: istore #18
/*      */     //   1097: aload #16
/*      */     //   1099: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1104: astore #19
/*      */     //   1106: iconst_0
/*      */     //   1107: istore #20
/*      */     //   1109: iload #17
/*      */     //   1111: ifne -> 1125
/*      */     //   1114: aload #19
/*      */     //   1116: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1119: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1122: if_acmpne -> 1180
/*      */     //   1125: astore #26
/*      */     //   1127: astore #25
/*      */     //   1129: astore #24
/*      */     //   1131: astore #23
/*      */     //   1133: iconst_0
/*      */     //   1134: istore #21
/*      */     //   1136: new org/jetbrains/jewel/ui/component/MenuKt$PopupMenu$3$1
/*      */     //   1139: dup
/*      */     //   1140: aload #14
/*      */     //   1142: aload #12
/*      */     //   1144: aload #13
/*      */     //   1146: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/MenuManager;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
/*      */     //   1149: checkcast kotlin/jvm/functions/Function1
/*      */     //   1152: astore #27
/*      */     //   1154: aload #23
/*      */     //   1156: aload #24
/*      */     //   1158: aload #25
/*      */     //   1160: aload #26
/*      */     //   1162: aload #27
/*      */     //   1164: astore #22
/*      */     //   1166: aload #16
/*      */     //   1168: aload #22
/*      */     //   1170: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1175: aload #22
/*      */     //   1177: goto -> 1182
/*      */     //   1180: aload #19
/*      */     //   1182: nop
/*      */     //   1183: nop
/*      */     //   1184: nop
/*      */     //   1185: checkcast kotlin/jvm/functions/Function1
/*      */     //   1188: astore #15
/*      */     //   1190: aload #6
/*      */     //   1192: invokeinterface endReplaceGroup : ()V
/*      */     //   1197: aload #15
/*      */     //   1199: ldc 1986748224
/*      */     //   1201: iconst_1
/*      */     //   1202: new org/jetbrains/jewel/ui/component/MenuKt$PopupMenu$4
/*      */     //   1205: dup
/*      */     //   1206: aload_3
/*      */     //   1207: aload #12
/*      */     //   1209: aload #13
/*      */     //   1211: aload #14
/*      */     //   1213: aload_2
/*      */     //   1214: aload #5
/*      */     //   1216: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lorg/jetbrains/jewel/ui/component/MenuManager;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)V
/*      */     //   1219: aload #6
/*      */     //   1221: bipush #54
/*      */     //   1223: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1226: checkcast kotlin/jvm/functions/Function2
/*      */     //   1229: aload #6
/*      */     //   1231: ldc 199680
/*      */     //   1233: sipush #896
/*      */     //   1236: iload #9
/*      */     //   1238: bipush #6
/*      */     //   1240: ishr
/*      */     //   1241: iand
/*      */     //   1242: ior
/*      */     //   1243: iconst_0
/*      */     //   1244: invokestatic Popup : (Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*      */     //   1247: invokestatic isTraceInProgress : ()Z
/*      */     //   1250: ifeq -> 1266
/*      */     //   1253: invokestatic traceEventEnd : ()V
/*      */     //   1256: goto -> 1266
/*      */     //   1259: aload #6
/*      */     //   1261: invokeinterface skipToGroupEnd : ()V
/*      */     //   1266: aload #6
/*      */     //   1268: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1273: dup
/*      */     //   1274: ifnull -> 1302
/*      */     //   1277: aload_0
/*      */     //   1278: aload_1
/*      */     //   1279: aload_2
/*      */     //   1280: aload_3
/*      */     //   1281: aload #4
/*      */     //   1283: aload #5
/*      */     //   1285: iload #7
/*      */     //   1287: iload #8
/*      */     //   1289: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*      */     //   1294: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1299: goto -> 1303
/*      */     //   1302: pop
/*      */     //   1303: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #98	-> 19
/*      */     //   #94	-> 377
/*      */     //   #95	-> 392
/*      */     //   #96	-> 419
/*      */     //   #98	-> 481
/*      */     //   #99	-> 484
/*      */     //   #707	-> 504
/*      */     //   #99	-> 525
/*      */     //   #102	-> 530
/*      */     //   #103	-> 534
/*      */     //   #104	-> 541
/*      */     //   #105	-> 548
/*      */     //   #106	-> 549
/*      */     //   #102	-> 552
/*      */     //   #101	-> 555
/*      */     //   #109	-> 573
/*      */     //   #708	-> 577
/*      */     //   #709	-> 589
/*      */     //   #710	-> 600
/*      */     //   #109	-> 603
/*      */     //   #710	-> 610
/*      */     //   #711	-> 612
/*      */     //   #712	-> 621
/*      */     //   #713	-> 626
/*      */     //   #709	-> 628
/*      */     //   #708	-> 629
/*      */     //   #708	-> 630
/*      */     //   #109	-> 631
/*      */     //   #110	-> 663
/*      */     //   #714	-> 667
/*      */     //   #715	-> 679
/*      */     //   #716	-> 690
/*      */     //   #110	-> 693
/*      */     //   #716	-> 700
/*      */     //   #717	-> 702
/*      */     //   #718	-> 711
/*      */     //   #719	-> 716
/*      */     //   #715	-> 718
/*      */     //   #714	-> 719
/*      */     //   #714	-> 720
/*      */     //   #110	-> 721
/*      */     //   #111	-> 766
/*      */     //   #720	-> 770
/*      */     //   #721	-> 782
/*      */     //   #722	-> 798
/*      */     //   #111	-> 801
/*      */     //   #722	-> 812
/*      */     //   #723	-> 814
/*      */     //   #724	-> 823
/*      */     //   #725	-> 828
/*      */     //   #721	-> 830
/*      */     //   #720	-> 831
/*      */     //   #720	-> 832
/*      */     //   #111	-> 833
/*      */     //   #114	-> 849
/*      */     //   #115	-> 883
/*      */     //   #726	-> 887
/*      */     //   #727	-> 899
/*      */     //   #728	-> 915
/*      */     //   #115	-> 920
/*      */     //   #728	-> 929
/*      */     //   #729	-> 931
/*      */     //   #730	-> 940
/*      */     //   #731	-> 945
/*      */     //   #727	-> 947
/*      */     //   #726	-> 948
/*      */     //   #726	-> 949
/*      */     //   #115	-> 950
/*      */     //   #116	-> 964
/*      */     //   #117	-> 982
/*      */     //   #732	-> 986
/*      */     //   #733	-> 998
/*      */     //   #734	-> 1009
/*      */     //   #117	-> 1018
/*      */     //   #734	-> 1034
/*      */     //   #735	-> 1036
/*      */     //   #736	-> 1045
/*      */     //   #737	-> 1050
/*      */     //   #733	-> 1052
/*      */     //   #732	-> 1053
/*      */     //   #732	-> 1054
/*      */     //   #117	-> 1055
/*      */     //   #118	-> 1093
/*      */     //   #738	-> 1097
/*      */     //   #739	-> 1109
/*      */     //   #740	-> 1125
/*      */     //   #118	-> 1136
/*      */     //   #740	-> 1164
/*      */     //   #741	-> 1166
/*      */     //   #742	-> 1175
/*      */     //   #743	-> 1180
/*      */     //   #739	-> 1182
/*      */     //   #738	-> 1183
/*      */     //   #738	-> 1184
/*      */     //   #118	-> 1185
/*      */     //   #123	-> 1199
/*      */     //   #113	-> 1244
/*      */     //   #133	-> 1259
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   498	27	13	$i$f$getCurrent	I
/*      */     //   495	30	11	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*      */     //   495	30	12	$changed$iv	I
/*      */     //   603	7	19	$i$a$-cache-MenuKt$PopupMenu$focusManager$2	I
/*      */     //   612	11	19	value$iv	Ljava/lang/Object;
/*      */     //   589	40	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   586	43	17	it$iv	Ljava/lang/Object;
/*      */     //   577	54	16	$i$f$cache	I
/*      */     //   574	57	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   574	57	15	invalid$iv	Z
/*      */     //   693	7	20	$i$a$-cache-MenuKt$PopupMenu$inputModeManager$2	I
/*      */     //   702	11	20	value$iv	Ljava/lang/Object;
/*      */     //   679	40	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   676	43	18	it$iv	Ljava/lang/Object;
/*      */     //   667	54	17	$i$f$cache	I
/*      */     //   664	57	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   664	57	16	invalid$iv	Z
/*      */     //   801	11	21	$i$a$-cache-MenuKt$PopupMenu$menuManager$1	I
/*      */     //   814	11	22	value$iv	Ljava/lang/Object;
/*      */     //   782	49	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   779	52	19	it$iv	Ljava/lang/Object;
/*      */     //   770	63	18	$i$f$cache	I
/*      */     //   767	66	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   767	66	17	invalid$iv	Z
/*      */     //   920	6	21	$i$a$-cache-MenuKt$PopupMenu$1	I
/*      */     //   931	11	22	value$iv	Ljava/lang/Object;
/*      */     //   899	49	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   896	52	19	it$iv	Ljava/lang/Object;
/*      */     //   887	63	18	$i$f$cache	I
/*      */     //   884	66	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   884	66	17	invalid$iv	Z
/*      */     //   1018	6	21	$i$a$-cache-MenuKt$PopupMenu$2	I
/*      */     //   1036	11	21	value$iv	Ljava/lang/Object;
/*      */     //   998	55	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   995	58	19	it$iv	Ljava/lang/Object;
/*      */     //   986	69	18	$i$f$cache	I
/*      */     //   983	72	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   983	72	17	invalid$iv	Z
/*      */     //   1136	16	21	$i$a$-cache-MenuKt$PopupMenu$3	I
/*      */     //   1166	11	22	value$iv	Ljava/lang/Object;
/*      */     //   1109	74	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1106	77	19	it$iv	Ljava/lang/Object;
/*      */     //   1097	88	18	$i$f$cache	I
/*      */     //   1094	91	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1094	91	17	invalid$iv	Z
/*      */     //   530	726	10	density	Landroidx/compose/ui/unit/Density;
/*      */     //   557	699	11	popupPositionProvider	Lorg/jetbrains/jewel/ui/component/AnchorVerticalMenuPositionProvider;
/*      */     //   647	609	12	focusManager$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   737	519	13	inputModeManager$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   849	407	14	menuManager	Lorg/jetbrains/jewel/ui/component/MenuManager;
/*      */     //   34	1270	9	$dirty	I
/*      */     //   0	1304	0	onDismissRequest	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1304	1	horizontalAlignment	Landroidx/compose/ui/Alignment$Horizontal;
/*      */     //   0	1304	2	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1304	3	style	Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   0	1304	4	popupProperties	Landroidx/compose/ui/window/PopupProperties;
/*      */     //   0	1304	5	content	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1304	6	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	1304	7	$changed	I
/*      */   }
/*      */   
/*      */   private static final FocusManager PopupMenu$lambda$1(MutableState $focusManager$delegate) {
/*  109 */     State state = (State)$focusManager$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1177 */       (FocusManager)state.getValue(); } private static final void PopupMenu$lambda$2(MutableState $focusManager$delegate, FocusManager <set-?>) { MutableState mutableState = $focusManager$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 1178 */     mutableState.setValue(<set-?>); } private static final InputModeManager PopupMenu$lambda$4(MutableState $inputModeManager$delegate) { State state = (State)$inputModeManager$delegate; Object object = null; KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 1180 */     return (InputModeManager)state.getValue(); } private static final void PopupMenu$lambda$5(MutableState $inputModeManager$delegate, InputModeManager <set-?>) { MutableState mutableState = $inputModeManager$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 1181 */     mutableState.setValue(<set-?>); } private static final Unit PopupMenu$lambda$8$lambda$7(Function1 $onDismissRequest) { $onDismissRequest.invoke(InputMode.box-impl(InputMode.Companion.getTouch-aOaMEAU())); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class MenuKt$PopupMenu$2$1 implements Function1<KeyEvent, Boolean> {
/*      */     public static final MenuKt$PopupMenu$2$1 INSTANCE = new MenuKt$PopupMenu$2$1(); public final Boolean invoke-ZmokQxo(Object it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(false); } } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$PopupMenu$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,706:1\n1#2:707\n*E\n"}) static final class MenuKt$PopupMenu$3$1 implements Function1<KeyEvent, Boolean> {
/*      */     public final Boolean invoke-ZmokQxo(Object it) { FocusManager currentFocusManager; InputModeManager currentInputModeManager; Intrinsics.checkNotNullParameter(it, "it"); if (MenuKt.PopupMenu$lambda$1(this.$focusManager$delegate) == null) { MenuKt.PopupMenu$lambda$1(this.$focusManager$delegate); int $i$a$-checkNotNull-MenuKt$PopupMenu$3$1$currentFocusManager$1 = 0; String str = "FocusManager must not be null"; throw new IllegalStateException(str.toString()); }  if (MenuKt.PopupMenu$lambda$4(this.$inputModeManager$delegate) == null) { MenuKt.PopupMenu$lambda$4(this.$inputModeManager$delegate); int $i$a$-checkNotNull-MenuKt$PopupMenu$3$1$currentInputModeManager$1 = 0; String str = "InputModeManager must not be null"; throw new IllegalStateException(str.toString()); }  return Boolean.valueOf(PopupKt.handlePopupMenuOnKeyEvent-jhbQyNo(it, currentFocusManager, currentInputModeManager, this.$menuManager)); } MenuKt$PopupMenu$3$1(MenuManager $menuManager, MutableState<FocusManager> $focusManager$delegate, MutableState<InputModeManager> $inputModeManager$delegate) {} } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$PopupMenu$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,706:1\n77#2:707\n77#2:708\n*S KotlinDebug\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$PopupMenu$4\n*L\n124#1:707\n125#1:708\n*E\n"}) static final class MenuKt$PopupMenu$4 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1986748224, $changed, -1, "org.jetbrains.jewel.ui.component.PopupMenu.<anonymous> (Menu.kt:123)");  CompositionLocal compositionLocal1 = (CompositionLocal)CompositionLocalsKt.getLocalFocusManager(); int $changed$iv = 0, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal1); ComposerKt.sourceInformationMarkerEnd($composer); MenuKt.PopupMenu$lambda$2(this.$focusManager$delegate, (FocusManager)object); CompositionLocal this_$iv = (CompositionLocal)CompositionLocalsKt.getLocalInputModeManager(); $changed$iv = 0; $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); object = $composer.consume(this_$iv); ComposerKt.sourceInformationMarkerEnd($composer); MenuKt.PopupMenu$lambda$5(this.$inputModeManager$delegate, (InputModeManager)object); JewelThemeKt.OverrideDarkMode(this.$style.isDark(), (Function2)ComposableLambdaKt.rememberComposableLambda(278338803, true, new Function2<Composer, Integer, Unit>(this.$menuManager, this.$style, this.$modifier, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(278338803, $changed, -1, "org.jetbrains.jewel.ui.component.PopupMenu.<anonymous>.<anonymous> (Menu.kt:127)");  ProvidedValue[] arrayOfProvidedValue = new ProvidedValue[2]; arrayOfProvidedValue[0] = MenuManagerKt.getLocalMenuManager().provides(this.$menuManager); arrayOfProvidedValue[1] = MenuStylingKt.getLocalMenuStyle().provides(this.$style); CompositionLocalKt.CompositionLocalProvider(arrayOfProvidedValue, (Function2)ComposableLambdaKt.rememberComposableLambda(2024047027, true, new Function2<Composer, Integer, Unit>(this.$modifier, this.$content) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2024047027, $changed, -1, "org.jetbrains.jewel.ui.component.PopupMenu.<anonymous>.<anonymous>.<anonymous> (Menu.kt:128)");  MenuKt.MenuContent(this.$modifier, null, this.$content, $composer, 0, 2); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }$composer, 54), $composer, 0x30 | ProvidedValue.$stable); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } }$composer, 54), $composer, 48); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } MenuKt$PopupMenu$4(MenuStyle $style, MutableState<FocusManager> $focusManager$delegate, MutableState<InputModeManager> $inputModeManager$delegate, MenuManager $menuManager, Modifier $modifier, Function1<MenuScope, Unit> $content) {} } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void MenuContent(@Nullable Modifier modifier, @Nullable MenuStyle style, @NotNull Function1 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_2
/*      */     //   1: ldc 'content'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_3
/*      */     //   7: ldc_w -1876861571
/*      */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   15: astore_3
/*      */     //   16: iload #4
/*      */     //   18: istore #6
/*      */     //   20: iload #5
/*      */     //   22: iconst_1
/*      */     //   23: iand
/*      */     //   24: ifeq -> 37
/*      */     //   27: iload #6
/*      */     //   29: bipush #6
/*      */     //   31: ior
/*      */     //   32: istore #6
/*      */     //   34: goto -> 65
/*      */     //   37: iload #4
/*      */     //   39: bipush #6
/*      */     //   41: iand
/*      */     //   42: ifne -> 65
/*      */     //   45: iload #6
/*      */     //   47: aload_3
/*      */     //   48: aload_0
/*      */     //   49: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   54: ifeq -> 61
/*      */     //   57: iconst_4
/*      */     //   58: goto -> 62
/*      */     //   61: iconst_2
/*      */     //   62: ior
/*      */     //   63: istore #6
/*      */     //   65: iload #4
/*      */     //   67: bipush #48
/*      */     //   69: iand
/*      */     //   70: ifne -> 102
/*      */     //   73: iload #6
/*      */     //   75: iload #5
/*      */     //   77: iconst_2
/*      */     //   78: iand
/*      */     //   79: ifne -> 97
/*      */     //   82: aload_3
/*      */     //   83: aload_1
/*      */     //   84: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   89: ifeq -> 97
/*      */     //   92: bipush #32
/*      */     //   94: goto -> 99
/*      */     //   97: bipush #16
/*      */     //   99: ior
/*      */     //   100: istore #6
/*      */     //   102: iload #5
/*      */     //   104: iconst_4
/*      */     //   105: iand
/*      */     //   106: ifeq -> 120
/*      */     //   109: iload #6
/*      */     //   111: sipush #384
/*      */     //   114: ior
/*      */     //   115: istore #6
/*      */     //   117: goto -> 153
/*      */     //   120: iload #4
/*      */     //   122: sipush #384
/*      */     //   125: iand
/*      */     //   126: ifne -> 153
/*      */     //   129: iload #6
/*      */     //   131: aload_3
/*      */     //   132: aload_2
/*      */     //   133: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   138: ifeq -> 147
/*      */     //   141: sipush #256
/*      */     //   144: goto -> 150
/*      */     //   147: sipush #128
/*      */     //   150: ior
/*      */     //   151: istore #6
/*      */     //   153: iload #6
/*      */     //   155: sipush #147
/*      */     //   158: iand
/*      */     //   159: sipush #146
/*      */     //   162: if_icmpne -> 174
/*      */     //   165: aload_3
/*      */     //   166: invokeinterface getSkipping : ()Z
/*      */     //   171: ifne -> 2540
/*      */     //   174: aload_3
/*      */     //   175: invokeinterface startDefaults : ()V
/*      */     //   180: iload #4
/*      */     //   182: iconst_1
/*      */     //   183: iand
/*      */     //   184: ifeq -> 196
/*      */     //   187: aload_3
/*      */     //   188: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   193: ifeq -> 237
/*      */     //   196: iload #5
/*      */     //   198: iconst_1
/*      */     //   199: iand
/*      */     //   200: ifeq -> 210
/*      */     //   203: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   206: checkcast androidx/compose/ui/Modifier
/*      */     //   209: astore_0
/*      */     //   210: iload #5
/*      */     //   212: iconst_2
/*      */     //   213: iand
/*      */     //   214: ifeq -> 257
/*      */     //   217: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   220: aload_3
/*      */     //   221: bipush #6
/*      */     //   223: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   226: astore_1
/*      */     //   227: iload #6
/*      */     //   229: bipush #-113
/*      */     //   231: iand
/*      */     //   232: istore #6
/*      */     //   234: goto -> 257
/*      */     //   237: aload_3
/*      */     //   238: invokeinterface skipToGroupEnd : ()V
/*      */     //   243: iload #5
/*      */     //   245: iconst_2
/*      */     //   246: iand
/*      */     //   247: ifeq -> 257
/*      */     //   250: iload #6
/*      */     //   252: bipush #-113
/*      */     //   254: iand
/*      */     //   255: istore #6
/*      */     //   257: aload_3
/*      */     //   258: invokeinterface endDefaults : ()V
/*      */     //   263: invokestatic isTraceInProgress : ()Z
/*      */     //   266: ifeq -> 281
/*      */     //   269: ldc_w -1876861571
/*      */     //   272: iload #6
/*      */     //   274: iconst_m1
/*      */     //   275: ldc_w 'org.jetbrains.jewel.ui.component.MenuContent (Menu.kt:139)'
/*      */     //   278: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   281: aload_3
/*      */     //   282: ldc_w 1136355829
/*      */     //   285: invokeinterface startReplaceGroup : (I)V
/*      */     //   290: aload_3
/*      */     //   291: astore #9
/*      */     //   293: iload #6
/*      */     //   295: sipush #896
/*      */     //   298: iand
/*      */     //   299: sipush #256
/*      */     //   302: if_icmpne -> 309
/*      */     //   305: iconst_1
/*      */     //   306: goto -> 310
/*      */     //   309: iconst_0
/*      */     //   310: istore #10
/*      */     //   312: nop
/*      */     //   313: iconst_0
/*      */     //   314: istore #11
/*      */     //   316: aload #9
/*      */     //   318: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   323: astore #12
/*      */     //   325: iconst_0
/*      */     //   326: istore #13
/*      */     //   328: iload #10
/*      */     //   330: ifne -> 344
/*      */     //   333: aload #12
/*      */     //   335: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   338: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   341: if_acmpne -> 372
/*      */     //   344: iconst_0
/*      */     //   345: istore #14
/*      */     //   347: aload_2
/*      */     //   348: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*      */     //   353: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*      */     //   356: astore #15
/*      */     //   358: aload #9
/*      */     //   360: aload #15
/*      */     //   362: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   367: aload #15
/*      */     //   369: goto -> 374
/*      */     //   372: aload #12
/*      */     //   374: nop
/*      */     //   375: nop
/*      */     //   376: nop
/*      */     //   377: checkcast androidx/compose/runtime/State
/*      */     //   380: astore #8
/*      */     //   382: aload_3
/*      */     //   383: invokeinterface endReplaceGroup : ()V
/*      */     //   388: aload #8
/*      */     //   390: astore #7
/*      */     //   392: aload_3
/*      */     //   393: ldc_w 1136358549
/*      */     //   396: invokeinterface startReplaceGroup : (I)V
/*      */     //   401: aload_3
/*      */     //   402: astore #10
/*      */     //   404: iconst_0
/*      */     //   405: istore #11
/*      */     //   407: nop
/*      */     //   408: iconst_0
/*      */     //   409: istore #12
/*      */     //   411: aload #10
/*      */     //   413: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   418: astore #13
/*      */     //   420: iconst_0
/*      */     //   421: istore #14
/*      */     //   423: aload #13
/*      */     //   425: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   428: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   431: if_acmpne -> 541
/*      */     //   434: iconst_0
/*      */     //   435: istore #15
/*      */     //   437: aload #7
/*      */     //   439: invokestatic MenuContent$lambda$14 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*      */     //   442: checkcast java/lang/Iterable
/*      */     //   445: astore #16
/*      */     //   447: iconst_0
/*      */     //   448: istore #17
/*      */     //   450: aload #16
/*      */     //   452: astore #18
/*      */     //   454: new java/util/ArrayList
/*      */     //   457: dup
/*      */     //   458: invokespecial <init> : ()V
/*      */     //   461: checkcast java/util/Collection
/*      */     //   464: astore #19
/*      */     //   466: iconst_0
/*      */     //   467: istore #20
/*      */     //   469: aload #18
/*      */     //   471: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   476: astore #21
/*      */     //   478: aload #21
/*      */     //   480: invokeinterface hasNext : ()Z
/*      */     //   485: ifeq -> 518
/*      */     //   488: aload #21
/*      */     //   490: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   495: astore #22
/*      */     //   497: aload #22
/*      */     //   499: instanceof org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   502: ifeq -> 478
/*      */     //   505: aload #19
/*      */     //   507: aload #22
/*      */     //   509: invokeinterface add : (Ljava/lang/Object;)Z
/*      */     //   514: pop
/*      */     //   515: goto -> 478
/*      */     //   518: aload #19
/*      */     //   520: checkcast java/util/List
/*      */     //   523: nop
/*      */     //   524: nop
/*      */     //   525: astore #23
/*      */     //   527: aload #10
/*      */     //   529: aload #23
/*      */     //   531: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   536: aload #23
/*      */     //   538: goto -> 543
/*      */     //   541: aload #13
/*      */     //   543: nop
/*      */     //   544: nop
/*      */     //   545: nop
/*      */     //   546: checkcast java/util/List
/*      */     //   549: astore #9
/*      */     //   551: aload_3
/*      */     //   552: invokeinterface endReplaceGroup : ()V
/*      */     //   557: aload #9
/*      */     //   559: astore #8
/*      */     //   561: aload_3
/*      */     //   562: ldc_w 1136361235
/*      */     //   565: invokeinterface startReplaceGroup : (I)V
/*      */     //   570: aload_3
/*      */     //   571: astore #11
/*      */     //   573: iconst_0
/*      */     //   574: istore #12
/*      */     //   576: nop
/*      */     //   577: iconst_0
/*      */     //   578: istore #13
/*      */     //   580: aload #11
/*      */     //   582: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   587: astore #14
/*      */     //   589: iconst_0
/*      */     //   590: istore #15
/*      */     //   592: aload #14
/*      */     //   594: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   597: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   600: if_acmpne -> 720
/*      */     //   603: iconst_0
/*      */     //   604: istore #16
/*      */     //   606: aload #8
/*      */     //   608: checkcast java/lang/Iterable
/*      */     //   611: astore #17
/*      */     //   613: iconst_0
/*      */     //   614: istore #18
/*      */     //   616: aload #17
/*      */     //   618: instanceof java/util/Collection
/*      */     //   621: ifeq -> 641
/*      */     //   624: aload #17
/*      */     //   626: checkcast java/util/Collection
/*      */     //   629: invokeinterface isEmpty : ()Z
/*      */     //   634: ifeq -> 641
/*      */     //   637: iconst_0
/*      */     //   638: goto -> 700
/*      */     //   641: aload #17
/*      */     //   643: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   648: astore #19
/*      */     //   650: aload #19
/*      */     //   652: invokeinterface hasNext : ()Z
/*      */     //   657: ifeq -> 699
/*      */     //   660: aload #19
/*      */     //   662: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   667: astore #20
/*      */     //   669: aload #20
/*      */     //   671: checkcast org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   674: astore #21
/*      */     //   676: iconst_0
/*      */     //   677: istore #22
/*      */     //   679: aload #21
/*      */     //   681: invokevirtual getIconKey : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*      */     //   684: ifnull -> 691
/*      */     //   687: iconst_1
/*      */     //   688: goto -> 692
/*      */     //   691: iconst_0
/*      */     //   692: ifeq -> 650
/*      */     //   695: iconst_1
/*      */     //   696: goto -> 700
/*      */     //   699: iconst_0
/*      */     //   700: nop
/*      */     //   701: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   704: astore #23
/*      */     //   706: aload #11
/*      */     //   708: aload #23
/*      */     //   710: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   715: aload #23
/*      */     //   717: goto -> 722
/*      */     //   720: aload #14
/*      */     //   722: nop
/*      */     //   723: nop
/*      */     //   724: nop
/*      */     //   725: checkcast java/lang/Boolean
/*      */     //   728: invokevirtual booleanValue : ()Z
/*      */     //   731: istore #10
/*      */     //   733: aload_3
/*      */     //   734: invokeinterface endReplaceGroup : ()V
/*      */     //   739: iload #10
/*      */     //   741: istore #9
/*      */     //   743: aload_3
/*      */     //   744: ldc_w 1136364022
/*      */     //   747: invokeinterface startReplaceGroup : (I)V
/*      */     //   752: aload_3
/*      */     //   753: astore #12
/*      */     //   755: iconst_0
/*      */     //   756: istore #13
/*      */     //   758: nop
/*      */     //   759: iconst_0
/*      */     //   760: istore #14
/*      */     //   762: aload #12
/*      */     //   764: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   769: astore #15
/*      */     //   771: iconst_0
/*      */     //   772: istore #16
/*      */     //   774: aload #15
/*      */     //   776: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   779: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   782: if_acmpne -> 902
/*      */     //   785: iconst_0
/*      */     //   786: istore #17
/*      */     //   788: aload #8
/*      */     //   790: checkcast java/lang/Iterable
/*      */     //   793: astore #18
/*      */     //   795: iconst_0
/*      */     //   796: istore #19
/*      */     //   798: aload #18
/*      */     //   800: instanceof java/util/Collection
/*      */     //   803: ifeq -> 823
/*      */     //   806: aload #18
/*      */     //   808: checkcast java/util/Collection
/*      */     //   811: invokeinterface isEmpty : ()Z
/*      */     //   816: ifeq -> 823
/*      */     //   819: iconst_0
/*      */     //   820: goto -> 882
/*      */     //   823: aload #18
/*      */     //   825: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   830: astore #20
/*      */     //   832: aload #20
/*      */     //   834: invokeinterface hasNext : ()Z
/*      */     //   839: ifeq -> 881
/*      */     //   842: aload #20
/*      */     //   844: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   849: astore #21
/*      */     //   851: aload #21
/*      */     //   853: checkcast org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   856: astore #22
/*      */     //   858: iconst_0
/*      */     //   859: istore #23
/*      */     //   861: aload #22
/*      */     //   863: invokevirtual getKeybinding : ()Ljava/util/Set;
/*      */     //   866: ifnull -> 873
/*      */     //   869: iconst_1
/*      */     //   870: goto -> 874
/*      */     //   873: iconst_0
/*      */     //   874: ifeq -> 832
/*      */     //   877: iconst_1
/*      */     //   878: goto -> 882
/*      */     //   881: iconst_0
/*      */     //   882: nop
/*      */     //   883: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   886: astore #24
/*      */     //   888: aload #12
/*      */     //   890: aload #24
/*      */     //   892: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   897: aload #24
/*      */     //   899: goto -> 904
/*      */     //   902: aload #15
/*      */     //   904: nop
/*      */     //   905: nop
/*      */     //   906: nop
/*      */     //   907: checkcast java/lang/Boolean
/*      */     //   910: invokevirtual booleanValue : ()Z
/*      */     //   913: istore #11
/*      */     //   915: aload_3
/*      */     //   916: invokeinterface endReplaceGroup : ()V
/*      */     //   921: iload #11
/*      */     //   923: istore #10
/*      */     //   925: invokestatic getLocalMenuManager : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*      */     //   928: checkcast androidx/compose/runtime/CompositionLocal
/*      */     //   931: astore #12
/*      */     //   933: bipush #6
/*      */     //   935: istore #13
/*      */     //   937: iconst_0
/*      */     //   938: istore #14
/*      */     //   940: aload_3
/*      */     //   941: ldc 2023513938
/*      */     //   943: ldc 'CC:CompositionLocal.kt#9igjgp'
/*      */     //   945: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   948: aload_3
/*      */     //   949: aload #12
/*      */     //   951: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*      */     //   956: astore #15
/*      */     //   958: aload_3
/*      */     //   959: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   962: aload #15
/*      */     //   964: checkcast org/jetbrains/jewel/ui/component/MenuManager
/*      */     //   967: astore #11
/*      */     //   969: iconst_0
/*      */     //   970: aload_3
/*      */     //   971: iconst_0
/*      */     //   972: iconst_1
/*      */     //   973: invokestatic rememberScrollState : (ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;
/*      */     //   976: astore #12
/*      */     //   978: aload_1
/*      */     //   979: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/MenuColors;
/*      */     //   982: astore #13
/*      */     //   984: aload_1
/*      */     //   985: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   988: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*      */     //   991: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*      */     //   994: astore #14
/*      */     //   996: aload_0
/*      */     //   997: aload_1
/*      */     //   998: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   1001: invokevirtual getShadowSize-D9Ej5fM : ()F
/*      */     //   1004: aload #14
/*      */     //   1006: checkcast androidx/compose/ui/graphics/Shape
/*      */     //   1009: iconst_0
/*      */     //   1010: aload #13
/*      */     //   1012: invokevirtual getShadow-0d7_KjU : ()J
/*      */     //   1015: aload #13
/*      */     //   1017: invokevirtual getShadow-0d7_KjU : ()J
/*      */     //   1020: iconst_4
/*      */     //   1021: aconst_null
/*      */     //   1022: invokestatic shadow-s4CzXII$default : (Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1025: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Inside : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*      */     //   1028: aload_1
/*      */     //   1029: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   1032: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*      */     //   1035: aload #13
/*      */     //   1037: invokevirtual getBorder-0d7_KjU : ()J
/*      */     //   1040: aload #14
/*      */     //   1042: checkcast androidx/compose/ui/graphics/Shape
/*      */     //   1045: fconst_0
/*      */     //   1046: bipush #16
/*      */     //   1048: aconst_null
/*      */     //   1049: invokestatic border-QWjY48E$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FJLandroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1052: aload #13
/*      */     //   1054: invokevirtual getBackground-0d7_KjU : ()J
/*      */     //   1057: aload #14
/*      */     //   1059: checkcast androidx/compose/ui/graphics/Shape
/*      */     //   1062: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*      */     //   1065: getstatic androidx/compose/foundation/layout/IntrinsicSize.Max : Landroidx/compose/foundation/layout/IntrinsicSize;
/*      */     //   1068: invokestatic width : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/IntrinsicSize;)Landroidx/compose/ui/Modifier;
/*      */     //   1071: aload_3
/*      */     //   1072: ldc_w 1136388484
/*      */     //   1075: invokeinterface startReplaceGroup : (I)V
/*      */     //   1080: aload_3
/*      */     //   1081: astore #16
/*      */     //   1083: aload_3
/*      */     //   1084: aload #11
/*      */     //   1086: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1091: istore #17
/*      */     //   1093: nop
/*      */     //   1094: iconst_0
/*      */     //   1095: istore #18
/*      */     //   1097: aload #16
/*      */     //   1099: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1104: astore #19
/*      */     //   1106: iconst_0
/*      */     //   1107: istore #20
/*      */     //   1109: iload #17
/*      */     //   1111: ifne -> 1125
/*      */     //   1114: aload #19
/*      */     //   1116: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1119: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1122: if_acmpne -> 1156
/*      */     //   1125: astore #75
/*      */     //   1127: iconst_0
/*      */     //   1128: istore #21
/*      */     //   1130: aload #11
/*      */     //   1132: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/MenuManager;)Lkotlin/jvm/functions/Function1;
/*      */     //   1137: aload #75
/*      */     //   1139: swap
/*      */     //   1140: astore #22
/*      */     //   1142: aload #16
/*      */     //   1144: aload #22
/*      */     //   1146: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1151: aload #22
/*      */     //   1153: goto -> 1158
/*      */     //   1156: aload #19
/*      */     //   1158: nop
/*      */     //   1159: nop
/*      */     //   1160: nop
/*      */     //   1161: checkcast kotlin/jvm/functions/Function1
/*      */     //   1164: astore #15
/*      */     //   1166: aload_3
/*      */     //   1167: invokeinterface endReplaceGroup : ()V
/*      */     //   1172: aload #15
/*      */     //   1174: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1177: astore #15
/*      */     //   1179: iconst_0
/*      */     //   1180: istore #18
/*      */     //   1182: nop
/*      */     //   1183: iconst_0
/*      */     //   1184: istore #19
/*      */     //   1186: aload_3
/*      */     //   1187: ldc_w 733328855
/*      */     //   1190: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   1193: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1196: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   1199: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   1202: astore #16
/*      */     //   1204: iconst_0
/*      */     //   1205: istore #17
/*      */     //   1207: aload #16
/*      */     //   1209: iload #17
/*      */     //   1211: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1214: astore #20
/*      */     //   1216: bipush #112
/*      */     //   1218: iload #18
/*      */     //   1220: iconst_3
/*      */     //   1221: ishl
/*      */     //   1222: iand
/*      */     //   1223: istore #21
/*      */     //   1225: nop
/*      */     //   1226: iconst_0
/*      */     //   1227: istore #22
/*      */     //   1229: aload_3
/*      */     //   1230: ldc_w -1323940314
/*      */     //   1233: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   1236: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1239: aload_3
/*      */     //   1240: iconst_0
/*      */     //   1241: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   1244: istore #23
/*      */     //   1246: aload_3
/*      */     //   1247: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1252: astore #24
/*      */     //   1254: aload_3
/*      */     //   1255: aload #15
/*      */     //   1257: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   1260: astore #25
/*      */     //   1262: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1265: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   1268: astore #26
/*      */     //   1270: bipush #6
/*      */     //   1272: sipush #896
/*      */     //   1275: iload #21
/*      */     //   1277: bipush #6
/*      */     //   1279: ishl
/*      */     //   1280: iand
/*      */     //   1281: ior
/*      */     //   1282: istore #27
/*      */     //   1284: nop
/*      */     //   1285: iconst_0
/*      */     //   1286: istore #28
/*      */     //   1288: aload_3
/*      */     //   1289: ldc_w -692256719
/*      */     //   1292: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   1295: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1298: aload_3
/*      */     //   1299: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   1304: instanceof androidx/compose/runtime/Applier
/*      */     //   1307: ifne -> 1313
/*      */     //   1310: invokestatic invalidApplier : ()V
/*      */     //   1313: aload_3
/*      */     //   1314: invokeinterface startReusableNode : ()V
/*      */     //   1319: aload_3
/*      */     //   1320: invokeinterface getInserting : ()Z
/*      */     //   1325: ifeq -> 1339
/*      */     //   1328: aload_3
/*      */     //   1329: aload #26
/*      */     //   1331: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   1336: goto -> 1345
/*      */     //   1339: aload_3
/*      */     //   1340: invokeinterface useNode : ()V
/*      */     //   1345: aload_3
/*      */     //   1346: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   1349: astore #29
/*      */     //   1351: iconst_0
/*      */     //   1352: istore #30
/*      */     //   1354: aload #29
/*      */     //   1356: aload #20
/*      */     //   1358: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1361: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1364: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1367: aload #29
/*      */     //   1369: aload #24
/*      */     //   1371: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1374: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1377: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1380: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1383: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1386: astore #31
/*      */     //   1388: iconst_0
/*      */     //   1389: istore #32
/*      */     //   1391: aload #29
/*      */     //   1393: astore #33
/*      */     //   1395: iconst_0
/*      */     //   1396: istore #34
/*      */     //   1398: aload #33
/*      */     //   1400: invokeinterface getInserting : ()Z
/*      */     //   1405: ifne -> 1426
/*      */     //   1408: aload #33
/*      */     //   1410: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1415: iload #23
/*      */     //   1417: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1420: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   1423: ifne -> 1452
/*      */     //   1426: aload #33
/*      */     //   1428: iload #23
/*      */     //   1430: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1433: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1438: aload #29
/*      */     //   1440: iload #23
/*      */     //   1442: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1445: aload #31
/*      */     //   1447: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1452: nop
/*      */     //   1453: nop
/*      */     //   1454: nop
/*      */     //   1455: aload #29
/*      */     //   1457: aload #25
/*      */     //   1459: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1462: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1465: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1468: nop
/*      */     //   1469: nop
/*      */     //   1470: aload_3
/*      */     //   1471: bipush #14
/*      */     //   1473: iload #27
/*      */     //   1475: bipush #6
/*      */     //   1477: ishr
/*      */     //   1478: iand
/*      */     //   1479: istore #35
/*      */     //   1481: astore #36
/*      */     //   1483: iconst_0
/*      */     //   1484: istore #37
/*      */     //   1486: aload #36
/*      */     //   1488: ldc_w -2146769399
/*      */     //   1491: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   1494: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1497: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   1500: aload #36
/*      */     //   1502: bipush #6
/*      */     //   1504: bipush #112
/*      */     //   1506: iload #18
/*      */     //   1508: bipush #6
/*      */     //   1510: ishr
/*      */     //   1511: iand
/*      */     //   1512: ior
/*      */     //   1513: istore #38
/*      */     //   1515: astore #39
/*      */     //   1517: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   1520: astore #40
/*      */     //   1522: iconst_0
/*      */     //   1523: istore #41
/*      */     //   1525: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   1528: checkcast androidx/compose/ui/Modifier
/*      */     //   1531: aload #12
/*      */     //   1533: iconst_0
/*      */     //   1534: aconst_null
/*      */     //   1535: iconst_0
/*      */     //   1536: bipush #14
/*      */     //   1538: aconst_null
/*      */     //   1539: invokestatic verticalScroll$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1542: aload_1
/*      */     //   1543: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   1546: invokevirtual getContentPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*      */     //   1549: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*      */     //   1552: astore #42
/*      */     //   1554: iconst_0
/*      */     //   1555: istore #43
/*      */     //   1557: iconst_0
/*      */     //   1558: istore #44
/*      */     //   1560: aload #39
/*      */     //   1562: ldc_w -483455358
/*      */     //   1565: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*      */     //   1568: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1571: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*      */     //   1574: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*      */     //   1577: astore #45
/*      */     //   1579: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   1582: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*      */     //   1585: astore #46
/*      */     //   1587: aload #45
/*      */     //   1589: aload #46
/*      */     //   1591: aload #39
/*      */     //   1593: bipush #14
/*      */     //   1595: iload #43
/*      */     //   1597: iconst_3
/*      */     //   1598: ishr
/*      */     //   1599: iand
/*      */     //   1600: bipush #112
/*      */     //   1602: iload #43
/*      */     //   1604: iconst_3
/*      */     //   1605: ishr
/*      */     //   1606: iand
/*      */     //   1607: ior
/*      */     //   1608: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1611: astore #47
/*      */     //   1613: bipush #112
/*      */     //   1615: iload #43
/*      */     //   1617: iconst_3
/*      */     //   1618: ishl
/*      */     //   1619: iand
/*      */     //   1620: istore #48
/*      */     //   1622: nop
/*      */     //   1623: iconst_0
/*      */     //   1624: istore #49
/*      */     //   1626: aload #39
/*      */     //   1628: ldc_w -1323940314
/*      */     //   1631: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   1634: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1637: aload #39
/*      */     //   1639: iconst_0
/*      */     //   1640: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   1643: istore #50
/*      */     //   1645: aload #39
/*      */     //   1647: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1652: astore #51
/*      */     //   1654: aload #39
/*      */     //   1656: aload #42
/*      */     //   1658: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   1661: astore #52
/*      */     //   1663: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1666: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   1669: astore #53
/*      */     //   1671: bipush #6
/*      */     //   1673: sipush #896
/*      */     //   1676: iload #48
/*      */     //   1678: bipush #6
/*      */     //   1680: ishl
/*      */     //   1681: iand
/*      */     //   1682: ior
/*      */     //   1683: istore #54
/*      */     //   1685: nop
/*      */     //   1686: iconst_0
/*      */     //   1687: istore #55
/*      */     //   1689: aload #39
/*      */     //   1691: ldc_w -692256719
/*      */     //   1694: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   1697: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1700: aload #39
/*      */     //   1702: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   1707: instanceof androidx/compose/runtime/Applier
/*      */     //   1710: ifne -> 1716
/*      */     //   1713: invokestatic invalidApplier : ()V
/*      */     //   1716: aload #39
/*      */     //   1718: invokeinterface startReusableNode : ()V
/*      */     //   1723: aload #39
/*      */     //   1725: invokeinterface getInserting : ()Z
/*      */     //   1730: ifeq -> 1745
/*      */     //   1733: aload #39
/*      */     //   1735: aload #53
/*      */     //   1737: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   1742: goto -> 1752
/*      */     //   1745: aload #39
/*      */     //   1747: invokeinterface useNode : ()V
/*      */     //   1752: aload #39
/*      */     //   1754: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   1757: astore #56
/*      */     //   1759: iconst_0
/*      */     //   1760: istore #57
/*      */     //   1762: aload #56
/*      */     //   1764: aload #47
/*      */     //   1766: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1769: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1772: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1775: aload #56
/*      */     //   1777: aload #51
/*      */     //   1779: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1782: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1785: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1788: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1791: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1794: astore #58
/*      */     //   1796: iconst_0
/*      */     //   1797: istore #59
/*      */     //   1799: aload #56
/*      */     //   1801: astore #60
/*      */     //   1803: iconst_0
/*      */     //   1804: istore #61
/*      */     //   1806: aload #60
/*      */     //   1808: invokeinterface getInserting : ()Z
/*      */     //   1813: ifne -> 1834
/*      */     //   1816: aload #60
/*      */     //   1818: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1823: iload #50
/*      */     //   1825: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1828: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   1831: ifne -> 1860
/*      */     //   1834: aload #60
/*      */     //   1836: iload #50
/*      */     //   1838: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1841: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1846: aload #56
/*      */     //   1848: iload #50
/*      */     //   1850: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1853: aload #58
/*      */     //   1855: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1860: nop
/*      */     //   1861: nop
/*      */     //   1862: nop
/*      */     //   1863: aload #56
/*      */     //   1865: aload #52
/*      */     //   1867: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1870: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1873: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1876: nop
/*      */     //   1877: nop
/*      */     //   1878: aload #39
/*      */     //   1880: bipush #14
/*      */     //   1882: iload #54
/*      */     //   1884: bipush #6
/*      */     //   1886: ishr
/*      */     //   1887: iand
/*      */     //   1888: istore #62
/*      */     //   1890: astore #63
/*      */     //   1892: iconst_0
/*      */     //   1893: istore #64
/*      */     //   1895: aload #63
/*      */     //   1897: ldc_w -384784025
/*      */     //   1900: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*      */     //   1903: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1906: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*      */     //   1909: aload #63
/*      */     //   1911: bipush #6
/*      */     //   1913: bipush #112
/*      */     //   1915: iload #43
/*      */     //   1917: bipush #6
/*      */     //   1919: ishr
/*      */     //   1920: iand
/*      */     //   1921: ior
/*      */     //   1922: istore #65
/*      */     //   1924: astore #66
/*      */     //   1926: checkcast androidx/compose/foundation/layout/ColumnScope
/*      */     //   1929: astore #67
/*      */     //   1931: iconst_0
/*      */     //   1932: istore #68
/*      */     //   1934: aload #66
/*      */     //   1936: ldc_w -590452964
/*      */     //   1939: invokeinterface startReplaceGroup : (I)V
/*      */     //   1944: aload #7
/*      */     //   1946: invokestatic MenuContent$lambda$14 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*      */     //   1949: checkcast java/lang/Iterable
/*      */     //   1952: astore #69
/*      */     //   1954: iconst_0
/*      */     //   1955: istore #70
/*      */     //   1957: aload #69
/*      */     //   1959: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   1964: astore #71
/*      */     //   1966: aload #71
/*      */     //   1968: invokeinterface hasNext : ()Z
/*      */     //   1973: ifeq -> 2014
/*      */     //   1976: aload #71
/*      */     //   1978: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   1983: astore #72
/*      */     //   1985: aload #72
/*      */     //   1987: checkcast org/jetbrains/jewel/ui/component/MenuItem
/*      */     //   1990: astore #73
/*      */     //   1992: iconst_0
/*      */     //   1993: istore #74
/*      */     //   1995: aload #73
/*      */     //   1997: iload #9
/*      */     //   1999: iload #10
/*      */     //   2001: aload #66
/*      */     //   2003: sipush #432
/*      */     //   2006: iconst_0
/*      */     //   2007: invokestatic ShowMenuItem : (Lorg/jetbrains/jewel/ui/component/MenuItem;ZZLandroidx/compose/runtime/Composer;II)V
/*      */     //   2010: nop
/*      */     //   2011: goto -> 1966
/*      */     //   2014: nop
/*      */     //   2015: aload #66
/*      */     //   2017: invokeinterface endReplaceGroup : ()V
/*      */     //   2022: nop
/*      */     //   2023: aload #63
/*      */     //   2025: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2028: aload #39
/*      */     //   2030: invokeinterface endNode : ()V
/*      */     //   2035: aload #39
/*      */     //   2037: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2040: nop
/*      */     //   2041: aload #39
/*      */     //   2043: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2046: nop
/*      */     //   2047: aload #39
/*      */     //   2049: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2052: nop
/*      */     //   2053: aload #40
/*      */     //   2055: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   2058: checkcast androidx/compose/ui/Modifier
/*      */     //   2061: invokeinterface matchParentSize : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   2066: astore #42
/*      */     //   2068: iconst_0
/*      */     //   2069: istore #43
/*      */     //   2071: iconst_0
/*      */     //   2072: istore #44
/*      */     //   2074: aload #39
/*      */     //   2076: ldc_w 733328855
/*      */     //   2079: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   2082: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   2085: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   2088: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   2091: astore #45
/*      */     //   2093: iconst_0
/*      */     //   2094: istore #46
/*      */     //   2096: aload #45
/*      */     //   2098: iload #46
/*      */     //   2100: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   2103: astore #47
/*      */     //   2105: bipush #112
/*      */     //   2107: iload #43
/*      */     //   2109: iconst_3
/*      */     //   2110: ishl
/*      */     //   2111: iand
/*      */     //   2112: istore #48
/*      */     //   2114: nop
/*      */     //   2115: iconst_0
/*      */     //   2116: istore #49
/*      */     //   2118: aload #39
/*      */     //   2120: ldc_w -1323940314
/*      */     //   2123: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   2126: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   2129: aload #39
/*      */     //   2131: iconst_0
/*      */     //   2132: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   2135: istore #50
/*      */     //   2137: aload #39
/*      */     //   2139: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   2144: astore #51
/*      */     //   2146: aload #39
/*      */     //   2148: aload #42
/*      */     //   2150: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   2153: astore #52
/*      */     //   2155: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   2158: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   2161: astore #53
/*      */     //   2163: bipush #6
/*      */     //   2165: sipush #896
/*      */     //   2168: iload #48
/*      */     //   2170: bipush #6
/*      */     //   2172: ishl
/*      */     //   2173: iand
/*      */     //   2174: ior
/*      */     //   2175: istore #54
/*      */     //   2177: nop
/*      */     //   2178: iconst_0
/*      */     //   2179: istore #55
/*      */     //   2181: aload #39
/*      */     //   2183: ldc_w -692256719
/*      */     //   2186: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   2189: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   2192: aload #39
/*      */     //   2194: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   2199: instanceof androidx/compose/runtime/Applier
/*      */     //   2202: ifne -> 2208
/*      */     //   2205: invokestatic invalidApplier : ()V
/*      */     //   2208: aload #39
/*      */     //   2210: invokeinterface startReusableNode : ()V
/*      */     //   2215: aload #39
/*      */     //   2217: invokeinterface getInserting : ()Z
/*      */     //   2222: ifeq -> 2237
/*      */     //   2225: aload #39
/*      */     //   2227: aload #53
/*      */     //   2229: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   2234: goto -> 2244
/*      */     //   2237: aload #39
/*      */     //   2239: invokeinterface useNode : ()V
/*      */     //   2244: aload #39
/*      */     //   2246: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   2249: astore #56
/*      */     //   2251: iconst_0
/*      */     //   2252: istore #57
/*      */     //   2254: aload #56
/*      */     //   2256: aload #47
/*      */     //   2258: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   2261: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   2264: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   2267: aload #56
/*      */     //   2269: aload #51
/*      */     //   2271: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   2274: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   2277: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   2280: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   2283: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   2286: astore #58
/*      */     //   2288: iconst_0
/*      */     //   2289: istore #59
/*      */     //   2291: aload #56
/*      */     //   2293: astore #60
/*      */     //   2295: iconst_0
/*      */     //   2296: istore #61
/*      */     //   2298: aload #60
/*      */     //   2300: invokeinterface getInserting : ()Z
/*      */     //   2305: ifne -> 2326
/*      */     //   2308: aload #60
/*      */     //   2310: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   2315: iload #50
/*      */     //   2317: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   2320: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   2323: ifne -> 2352
/*      */     //   2326: aload #60
/*      */     //   2328: iload #50
/*      */     //   2330: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   2333: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   2338: aload #56
/*      */     //   2340: iload #50
/*      */     //   2342: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   2345: aload #58
/*      */     //   2347: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   2352: nop
/*      */     //   2353: nop
/*      */     //   2354: nop
/*      */     //   2355: aload #56
/*      */     //   2357: aload #52
/*      */     //   2359: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   2362: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   2365: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   2368: nop
/*      */     //   2369: nop
/*      */     //   2370: aload #39
/*      */     //   2372: bipush #14
/*      */     //   2374: iload #54
/*      */     //   2376: bipush #6
/*      */     //   2378: ishr
/*      */     //   2379: iand
/*      */     //   2380: istore #62
/*      */     //   2382: astore #63
/*      */     //   2384: iconst_0
/*      */     //   2385: istore #64
/*      */     //   2387: aload #63
/*      */     //   2389: ldc_w -2146769399
/*      */     //   2392: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   2395: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   2398: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   2401: aload #63
/*      */     //   2403: bipush #6
/*      */     //   2405: bipush #112
/*      */     //   2407: iload #43
/*      */     //   2409: bipush #6
/*      */     //   2411: ishr
/*      */     //   2412: iand
/*      */     //   2413: ior
/*      */     //   2414: istore #65
/*      */     //   2416: astore #66
/*      */     //   2418: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   2421: astore #67
/*      */     //   2423: iconst_0
/*      */     //   2424: istore #68
/*      */     //   2426: aload #12
/*      */     //   2428: aload #66
/*      */     //   2430: iconst_0
/*      */     //   2431: invokestatic rememberScrollbarAdapter2 : (Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/v2/ScrollbarAdapter;
/*      */     //   2434: aload #67
/*      */     //   2436: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   2439: checkcast androidx/compose/ui/Modifier
/*      */     //   2442: fconst_0
/*      */     //   2443: iconst_1
/*      */     //   2444: aconst_null
/*      */     //   2445: invokestatic fillMaxHeight$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   2448: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   2451: invokevirtual getCenterEnd : ()Landroidx/compose/ui/Alignment;
/*      */     //   2454: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*      */     //   2459: iconst_0
/*      */     //   2460: aconst_null
/*      */     //   2461: aconst_null
/*      */     //   2462: aload #66
/*      */     //   2464: iconst_0
/*      */     //   2465: bipush #28
/*      */     //   2467: invokestatic VerticalScrollbar : (Landroidx/compose/foundation/v2/ScrollbarAdapter;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/ScrollbarStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
/*      */     //   2470: nop
/*      */     //   2471: aload #63
/*      */     //   2473: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2476: aload #39
/*      */     //   2478: invokeinterface endNode : ()V
/*      */     //   2483: aload #39
/*      */     //   2485: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2488: nop
/*      */     //   2489: aload #39
/*      */     //   2491: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2494: nop
/*      */     //   2495: aload #39
/*      */     //   2497: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2500: nop
/*      */     //   2501: nop
/*      */     //   2502: aload #36
/*      */     //   2504: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2507: aload_3
/*      */     //   2508: invokeinterface endNode : ()V
/*      */     //   2513: aload_3
/*      */     //   2514: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2517: nop
/*      */     //   2518: aload_3
/*      */     //   2519: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2522: nop
/*      */     //   2523: aload_3
/*      */     //   2524: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2527: nop
/*      */     //   2528: invokestatic isTraceInProgress : ()Z
/*      */     //   2531: ifeq -> 2546
/*      */     //   2534: invokestatic traceEventEnd : ()V
/*      */     //   2537: goto -> 2546
/*      */     //   2540: aload_3
/*      */     //   2541: invokeinterface skipToGroupEnd : ()V
/*      */     //   2546: aload_3
/*      */     //   2547: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   2552: dup
/*      */     //   2553: ifnull -> 2576
/*      */     //   2556: aload_0
/*      */     //   2557: aload_1
/*      */     //   2558: aload_2
/*      */     //   2559: iload #4
/*      */     //   2561: iload #5
/*      */     //   2563: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*      */     //   2568: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   2573: goto -> 2577
/*      */     //   2576: pop
/*      */     //   2577: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #140	-> 6
/*      */     //   #137	-> 203
/*      */     //   #138	-> 217
/*      */     //   #140	-> 278
/*      */     //   #141	-> 312
/*      */     //   #744	-> 316
/*      */     //   #745	-> 328
/*      */     //   #746	-> 344
/*      */     //   #141	-> 347
/*      */     //   #746	-> 356
/*      */     //   #747	-> 358
/*      */     //   #748	-> 367
/*      */     //   #749	-> 372
/*      */     //   #745	-> 374
/*      */     //   #744	-> 375
/*      */     //   #744	-> 376
/*      */     //   #141	-> 377
/*      */     //   #143	-> 407
/*      */     //   #750	-> 411
/*      */     //   #751	-> 423
/*      */     //   #752	-> 434
/*      */     //   #143	-> 437
/*      */     //   #753	-> 450
/*      */     //   #762	-> 469
/*      */     //   #763	-> 518
/*      */     //   #753	-> 523
/*      */     //   #143	-> 524
/*      */     //   #752	-> 525
/*      */     //   #764	-> 527
/*      */     //   #765	-> 536
/*      */     //   #766	-> 541
/*      */     //   #751	-> 543
/*      */     //   #750	-> 544
/*      */     //   #750	-> 545
/*      */     //   #143	-> 546
/*      */     //   #145	-> 576
/*      */     //   #767	-> 580
/*      */     //   #768	-> 592
/*      */     //   #769	-> 603
/*      */     //   #145	-> 606
/*      */     //   #770	-> 616
/*      */     //   #771	-> 641
/*      */     //   #145	-> 679
/*      */     //   #771	-> 692
/*      */     //   #772	-> 699
/*      */     //   #145	-> 700
/*      */     //   #769	-> 704
/*      */     //   #773	-> 706
/*      */     //   #774	-> 715
/*      */     //   #775	-> 720
/*      */     //   #768	-> 722
/*      */     //   #767	-> 723
/*      */     //   #767	-> 724
/*      */     //   #145	-> 725
/*      */     //   #146	-> 758
/*      */     //   #776	-> 762
/*      */     //   #777	-> 774
/*      */     //   #778	-> 785
/*      */     //   #146	-> 788
/*      */     //   #779	-> 798
/*      */     //   #780	-> 823
/*      */     //   #146	-> 861
/*      */     //   #780	-> 874
/*      */     //   #781	-> 881
/*      */     //   #146	-> 882
/*      */     //   #778	-> 886
/*      */     //   #782	-> 888
/*      */     //   #783	-> 897
/*      */     //   #784	-> 902
/*      */     //   #777	-> 904
/*      */     //   #776	-> 905
/*      */     //   #776	-> 906
/*      */     //   #146	-> 907
/*      */     //   #148	-> 925
/*      */     //   #785	-> 945
/*      */     //   #148	-> 964
/*      */     //   #149	-> 973
/*      */     //   #150	-> 978
/*      */     //   #151	-> 984
/*      */     //   #155	-> 996
/*      */     //   #157	-> 997
/*      */     //   #158	-> 1004
/*      */     //   #156	-> 1009
/*      */     //   #159	-> 1010
/*      */     //   #160	-> 1015
/*      */     //   #156	-> 1020
/*      */     //   #162	-> 1025
/*      */     //   #163	-> 1052
/*      */     //   #164	-> 1065
/*      */     //   #165	-> 1093
/*      */     //   #786	-> 1097
/*      */     //   #787	-> 1109
/*      */     //   #788	-> 1125
/*      */     //   #165	-> 1130
/*      */     //   #788	-> 1140
/*      */     //   #789	-> 1142
/*      */     //   #790	-> 1151
/*      */     //   #791	-> 1156
/*      */     //   #787	-> 1158
/*      */     //   #786	-> 1159
/*      */     //   #786	-> 1160
/*      */     //   #165	-> 1161
/*      */     //   #153	-> 1182
/*      */     //   #792	-> 1193
/*      */     //   #793	-> 1196
/*      */     //   #794	-> 1204
/*      */     //   #797	-> 1207
/*      */     //   #798	-> 1225
/*      */     //   #799	-> 1236
/*      */     //   #800	-> 1241
/*      */     //   #801	-> 1247
/*      */     //   #802	-> 1255
/*      */     //   #804	-> 1262
/*      */     //   #803	-> 1284
/*      */     //   #805	-> 1295
/*      */     //   #806	-> 1298
/*      */     //   #807	-> 1314
/*      */     //   #808	-> 1319
/*      */     //   #809	-> 1329
/*      */     //   #811	-> 1340
/*      */     //   #813	-> 1345
/*      */     //   #814	-> 1354
/*      */     //   #815	-> 1367
/*      */     //   #817	-> 1380
/*      */     //   #818	-> 1391
/*      */     //   #819	-> 1398
/*      */     //   #820	-> 1426
/*      */     //   #821	-> 1438
/*      */     //   #823	-> 1452
/*      */     //   #818	-> 1453
/*      */     //   #823	-> 1454
/*      */     //   #824	-> 1455
/*      */     //   #825	-> 1468
/*      */     //   #813	-> 1469
/*      */     //   #826	-> 1470
/*      */     //   #827	-> 1494
/*      */     //   #167	-> 1525
/*      */     //   #828	-> 1568
/*      */     //   #829	-> 1571
/*      */     //   #830	-> 1579
/*      */     //   #833	-> 1587
/*      */     //   #834	-> 1622
/*      */     //   #835	-> 1634
/*      */     //   #836	-> 1640
/*      */     //   #837	-> 1647
/*      */     //   #838	-> 1656
/*      */     //   #840	-> 1663
/*      */     //   #839	-> 1685
/*      */     //   #841	-> 1697
/*      */     //   #842	-> 1700
/*      */     //   #843	-> 1718
/*      */     //   #844	-> 1723
/*      */     //   #845	-> 1735
/*      */     //   #847	-> 1747
/*      */     //   #849	-> 1752
/*      */     //   #850	-> 1762
/*      */     //   #851	-> 1775
/*      */     //   #853	-> 1788
/*      */     //   #854	-> 1799
/*      */     //   #855	-> 1806
/*      */     //   #856	-> 1834
/*      */     //   #857	-> 1846
/*      */     //   #859	-> 1860
/*      */     //   #854	-> 1861
/*      */     //   #859	-> 1862
/*      */     //   #860	-> 1863
/*      */     //   #861	-> 1876
/*      */     //   #849	-> 1877
/*      */     //   #862	-> 1878
/*      */     //   #863	-> 1903
/*      */     //   #168	-> 1944
/*      */     //   #864	-> 1957
/*      */     //   #168	-> 1995
/*      */     //   #864	-> 2010
/*      */     //   #865	-> 2014
/*      */     //   #169	-> 2022
/*      */     //   #863	-> 2023
/*      */     //   #862	-> 2028
/*      */     //   #866	-> 2030
/*      */     //   #841	-> 2037
/*      */     //   #867	-> 2040
/*      */     //   #835	-> 2043
/*      */     //   #868	-> 2046
/*      */     //   #828	-> 2049
/*      */     //   #869	-> 2052
/*      */     //   #171	-> 2053
/*      */     //   #870	-> 2082
/*      */     //   #871	-> 2085
/*      */     //   #872	-> 2093
/*      */     //   #875	-> 2096
/*      */     //   #876	-> 2114
/*      */     //   #877	-> 2126
/*      */     //   #878	-> 2132
/*      */     //   #879	-> 2139
/*      */     //   #880	-> 2148
/*      */     //   #882	-> 2155
/*      */     //   #881	-> 2177
/*      */     //   #883	-> 2189
/*      */     //   #884	-> 2192
/*      */     //   #885	-> 2210
/*      */     //   #886	-> 2215
/*      */     //   #887	-> 2227
/*      */     //   #889	-> 2239
/*      */     //   #891	-> 2244
/*      */     //   #892	-> 2254
/*      */     //   #893	-> 2267
/*      */     //   #895	-> 2280
/*      */     //   #896	-> 2291
/*      */     //   #897	-> 2298
/*      */     //   #898	-> 2326
/*      */     //   #899	-> 2338
/*      */     //   #901	-> 2352
/*      */     //   #896	-> 2353
/*      */     //   #901	-> 2354
/*      */     //   #902	-> 2355
/*      */     //   #903	-> 2368
/*      */     //   #891	-> 2369
/*      */     //   #904	-> 2370
/*      */     //   #905	-> 2395
/*      */     //   #173	-> 2426
/*      */     //   #174	-> 2434
/*      */     //   #172	-> 2467
/*      */     //   #176	-> 2470
/*      */     //   #905	-> 2471
/*      */     //   #904	-> 2476
/*      */     //   #906	-> 2478
/*      */     //   #883	-> 2485
/*      */     //   #907	-> 2488
/*      */     //   #877	-> 2491
/*      */     //   #908	-> 2494
/*      */     //   #870	-> 2497
/*      */     //   #909	-> 2500
/*      */     //   #177	-> 2501
/*      */     //   #827	-> 2502
/*      */     //   #826	-> 2507
/*      */     //   #910	-> 2508
/*      */     //   #805	-> 2514
/*      */     //   #911	-> 2517
/*      */     //   #799	-> 2519
/*      */     //   #912	-> 2522
/*      */     //   #792	-> 2524
/*      */     //   #913	-> 2527
/*      */     //   #178	-> 2540
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   347	9	14	$i$a$-cache-MenuKt$MenuContent$items$2	I
/*      */     //   358	11	15	value$iv	Ljava/lang/Object;
/*      */     //   328	47	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   325	50	12	it$iv	Ljava/lang/Object;
/*      */     //   316	61	11	$i$f$cache	I
/*      */     //   313	64	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   313	64	10	invalid$iv	Z
/*      */     //   497	18	22	element$iv$iv	Ljava/lang/Object;
/*      */     //   469	51	20	$i$f$filterIsInstanceTo	I
/*      */     //   466	54	18	$this$filterIsInstanceTo$iv$iv	Ljava/lang/Iterable;
/*      */     //   466	54	19	destination$iv$iv	Ljava/util/Collection;
/*      */     //   450	74	17	$i$f$filterIsInstance	I
/*      */     //   447	77	16	$this$filterIsInstance$iv	Ljava/lang/Iterable;
/*      */     //   437	88	15	$i$a$-cache-MenuKt$MenuContent$selectableItems$1	I
/*      */     //   527	11	23	value$iv	Ljava/lang/Object;
/*      */     //   423	121	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   420	124	13	it$iv	Ljava/lang/Object;
/*      */     //   411	135	12	$i$f$cache	I
/*      */     //   408	138	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   408	138	11	invalid$iv	Z
/*      */     //   679	13	22	$i$a$-any-MenuKt$MenuContent$anyItemHasIcon$1$1	I
/*      */     //   676	16	21	it	Lorg/jetbrains/jewel/ui/component/MenuSelectableItem;
/*      */     //   669	30	20	element$iv	Ljava/lang/Object;
/*      */     //   616	84	18	$i$f$any	I
/*      */     //   613	87	17	$this$any$iv	Ljava/lang/Iterable;
/*      */     //   606	95	16	$i$a$-cache-MenuKt$MenuContent$anyItemHasIcon$1	I
/*      */     //   706	11	23	value$iv	Ljava/lang/Object;
/*      */     //   592	131	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   589	134	14	it$iv	Ljava/lang/Object;
/*      */     //   580	145	13	$i$f$cache	I
/*      */     //   577	148	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   577	148	12	invalid$iv	Z
/*      */     //   861	13	23	$i$a$-any-MenuKt$MenuContent$anyItemHasKeybinding$1$1	I
/*      */     //   858	16	22	it	Lorg/jetbrains/jewel/ui/component/MenuSelectableItem;
/*      */     //   851	30	21	element$iv	Ljava/lang/Object;
/*      */     //   798	84	19	$i$f$any	I
/*      */     //   795	87	18	$this$any$iv	Ljava/lang/Iterable;
/*      */     //   788	95	17	$i$a$-cache-MenuKt$MenuContent$anyItemHasKeybinding$1	I
/*      */     //   888	11	24	value$iv	Ljava/lang/Object;
/*      */     //   774	131	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   771	134	15	it$iv	Ljava/lang/Object;
/*      */     //   762	145	14	$i$f$cache	I
/*      */     //   759	148	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   759	148	13	invalid$iv	Z
/*      */     //   940	24	14	$i$f$getCurrent	I
/*      */     //   937	27	12	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*      */     //   937	27	13	$changed$iv	I
/*      */     //   1130	7	21	$i$a$-cache-MenuKt$MenuContent$1	I
/*      */     //   1142	11	22	value$iv	Ljava/lang/Object;
/*      */     //   1109	50	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1106	53	19	it$iv	Ljava/lang/Object;
/*      */     //   1097	64	18	$i$f$cache	I
/*      */     //   1094	67	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1094	67	17	invalid$iv	Z
/*      */     //   1995	15	74	$i$a$-forEach-MenuKt$MenuContent$2$1$1	I
/*      */     //   1992	18	73	it	Lorg/jetbrains/jewel/ui/component/MenuItem;
/*      */     //   1985	26	72	element$iv	Ljava/lang/Object;
/*      */     //   1957	58	70	$i$f$forEach	I
/*      */     //   1954	61	69	$this$forEach$iv	Ljava/lang/Iterable;
/*      */     //   1934	89	68	$i$a$-Column-MenuKt$MenuContent$2$1	I
/*      */     //   1931	92	67	$this$MenuContent_u24lambda_u2425_u24lambda_u2423	Landroidx/compose/foundation/layout/ColumnScope;
/*      */     //   1931	92	66	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   1931	92	65	$changed	I
/*      */     //   1895	133	64	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*      */     //   1892	136	63	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1892	136	62	$changed$iv	I
/*      */     //   1806	55	61	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   1803	58	60	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1799	64	59	$i$f$set-impl	I
/*      */     //   1796	67	58	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   1762	115	57	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   1759	118	56	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1689	352	55	$i$f$ReusableComposeNode	I
/*      */     //   1686	355	53	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   1686	355	54	$changed$iv$iv$iv	I
/*      */     //   1626	421	49	$i$f$Layout	I
/*      */     //   1645	402	50	compositeKeyHash$iv$iv	I
/*      */     //   1654	393	51	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1663	384	52	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1623	424	48	$changed$iv$iv	I
/*      */     //   1560	493	44	$i$f$Column	I
/*      */     //   1613	440	47	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1557	496	42	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1579	474	45	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*      */     //   1587	466	46	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*      */     //   1557	496	43	$changed$iv	I
/*      */     //   2426	45	68	$i$a$-Box-MenuKt$MenuContent$2$2	I
/*      */     //   2423	48	67	$this$MenuContent_u24lambda_u2425_u24lambda_u2424	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   2423	48	66	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   2423	48	65	$changed	I
/*      */     //   2387	89	64	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   2384	92	63	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   2384	92	62	$changed$iv	I
/*      */     //   2298	55	61	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   2295	58	60	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   2291	64	59	$i$f$set-impl	I
/*      */     //   2288	67	58	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   2254	115	57	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   2251	118	56	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   2181	308	55	$i$f$ReusableComposeNode	I
/*      */     //   2178	311	53	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   2178	311	54	$changed$iv$iv$iv	I
/*      */     //   2118	377	49	$i$f$Layout	I
/*      */     //   2137	358	50	compositeKeyHash$iv$iv	I
/*      */     //   2146	349	51	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   2155	340	52	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   2115	380	48	$changed$iv$iv	I
/*      */     //   2074	427	44	$i$f$Box	I
/*      */     //   2105	396	47	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   2071	430	42	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   2093	408	45	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   2096	405	46	propagateMinConstraints$iv	Z
/*      */     //   2071	430	43	$changed$iv	I
/*      */     //   1525	977	41	$i$a$-Box-MenuKt$MenuContent$2	I
/*      */     //   1522	980	40	$this$MenuContent_u24lambda_u2425	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   1522	980	39	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   1522	980	38	$changed	I
/*      */     //   1486	1021	37	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   1483	1024	36	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1483	1024	35	$changed$iv	I
/*      */     //   1398	55	34	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   1395	58	33	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1391	64	32	$i$f$set-impl	I
/*      */     //   1388	67	31	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   1354	115	30	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   1351	118	29	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1288	1230	28	$i$f$ReusableComposeNode	I
/*      */     //   1285	1233	26	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   1285	1233	27	$changed$iv$iv$iv	I
/*      */     //   1229	1294	22	$i$f$Layout	I
/*      */     //   1246	1277	23	compositeKeyHash$iv$iv	I
/*      */     //   1254	1269	24	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1262	1261	25	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1226	1297	21	$changed$iv$iv	I
/*      */     //   1186	1342	19	$i$f$Box	I
/*      */     //   1216	1312	20	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1183	1345	15	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1204	1324	16	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   1207	1321	17	propagateMinConstraints$iv	Z
/*      */     //   1183	1345	18	$changed$iv	I
/*      */     //   392	2145	7	items$delegate	Landroidx/compose/runtime/State;
/*      */     //   561	1976	8	selectableItems	Ljava/util/List;
/*      */     //   743	1794	9	anyItemHasIcon	Z
/*      */     //   925	1612	10	anyItemHasKeybinding	Z
/*      */     //   969	1568	11	localMenuManager	Lorg/jetbrains/jewel/ui/component/MenuManager;
/*      */     //   978	1559	12	scrollState	Landroidx/compose/foundation/ScrollState;
/*      */     //   984	1553	13	colors	Lorg/jetbrains/jewel/ui/component/styling/MenuColors;
/*      */     //   996	1541	14	menuShape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*      */     //   20	2558	6	$dirty	I
/*      */     //   0	2578	0	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	2578	1	style	Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   0	2578	2	content	Lkotlin/jvm/functions/Function1;
/*      */     //   0	2578	3	$composer	Landroidx/compose/runtime/Composer;
/* 1183 */     //   0	2578	4	$changed	I } private static final List MenuContent$lambda$13$lambda$12(Function1<? super MenuScope, Unit> $content) { return asList($content); } private static final List<MenuItem> MenuContent$lambda$14(State $items$delegate) { State state = $items$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (List<MenuItem>)state.getValue(); } private static final Unit MenuContent$lambda$21$lambda$20(MenuManager $localMenuManager, boolean it) { $localMenuManager.onHoveredChange$ui(it); return Unit.INSTANCE; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void ShowMenuItem(MenuItem item, boolean canShowIcon, boolean canShowKeybinding, Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_3
/*      */     //   1: ldc_w -1909573362
/*      */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   9: astore_3
/*      */     //   10: iload #4
/*      */     //   12: istore #6
/*      */     //   14: iload #5
/*      */     //   16: iconst_1
/*      */     //   17: iand
/*      */     //   18: ifeq -> 31
/*      */     //   21: iload #6
/*      */     //   23: bipush #6
/*      */     //   25: ior
/*      */     //   26: istore #6
/*      */     //   28: goto -> 77
/*      */     //   31: iload #4
/*      */     //   33: bipush #6
/*      */     //   35: iand
/*      */     //   36: ifne -> 77
/*      */     //   39: iload #6
/*      */     //   41: iload #4
/*      */     //   43: bipush #8
/*      */     //   45: iand
/*      */     //   46: ifne -> 59
/*      */     //   49: aload_3
/*      */     //   50: aload_0
/*      */     //   51: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   56: goto -> 66
/*      */     //   59: aload_3
/*      */     //   60: aload_0
/*      */     //   61: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   66: ifeq -> 73
/*      */     //   69: iconst_4
/*      */     //   70: goto -> 74
/*      */     //   73: iconst_2
/*      */     //   74: ior
/*      */     //   75: istore #6
/*      */     //   77: iload #5
/*      */     //   79: iconst_2
/*      */     //   80: iand
/*      */     //   81: ifeq -> 94
/*      */     //   84: iload #6
/*      */     //   86: bipush #48
/*      */     //   88: ior
/*      */     //   89: istore #6
/*      */     //   91: goto -> 124
/*      */     //   94: iload #4
/*      */     //   96: bipush #48
/*      */     //   98: iand
/*      */     //   99: ifne -> 124
/*      */     //   102: iload #6
/*      */     //   104: aload_3
/*      */     //   105: iload_1
/*      */     //   106: invokeinterface changed : (Z)Z
/*      */     //   111: ifeq -> 119
/*      */     //   114: bipush #32
/*      */     //   116: goto -> 121
/*      */     //   119: bipush #16
/*      */     //   121: ior
/*      */     //   122: istore #6
/*      */     //   124: iload #5
/*      */     //   126: iconst_4
/*      */     //   127: iand
/*      */     //   128: ifeq -> 142
/*      */     //   131: iload #6
/*      */     //   133: sipush #384
/*      */     //   136: ior
/*      */     //   137: istore #6
/*      */     //   139: goto -> 175
/*      */     //   142: iload #4
/*      */     //   144: sipush #384
/*      */     //   147: iand
/*      */     //   148: ifne -> 175
/*      */     //   151: iload #6
/*      */     //   153: aload_3
/*      */     //   154: iload_2
/*      */     //   155: invokeinterface changed : (Z)Z
/*      */     //   160: ifeq -> 169
/*      */     //   163: sipush #256
/*      */     //   166: goto -> 172
/*      */     //   169: sipush #128
/*      */     //   172: ior
/*      */     //   173: istore #6
/*      */     //   175: iload #6
/*      */     //   177: sipush #147
/*      */     //   180: iand
/*      */     //   181: sipush #146
/*      */     //   184: if_icmpne -> 196
/*      */     //   187: aload_3
/*      */     //   188: invokeinterface getSkipping : ()Z
/*      */     //   193: ifne -> 491
/*      */     //   196: iload #5
/*      */     //   198: iconst_2
/*      */     //   199: iand
/*      */     //   200: ifeq -> 205
/*      */     //   203: iconst_0
/*      */     //   204: istore_1
/*      */     //   205: iload #5
/*      */     //   207: iconst_4
/*      */     //   208: iand
/*      */     //   209: ifeq -> 214
/*      */     //   212: iconst_0
/*      */     //   213: istore_2
/*      */     //   214: invokestatic isTraceInProgress : ()Z
/*      */     //   217: ifeq -> 232
/*      */     //   220: ldc_w -1909573362
/*      */     //   223: iload #6
/*      */     //   225: iconst_m1
/*      */     //   226: ldc_w 'org.jetbrains.jewel.ui.component.ShowMenuItem (Menu.kt:180)'
/*      */     //   229: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   232: aload_0
/*      */     //   233: astore #7
/*      */     //   235: aload #7
/*      */     //   237: instanceof org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   240: ifeq -> 359
/*      */     //   243: aload_3
/*      */     //   244: ldc_w -466359008
/*      */     //   247: invokeinterface startReplaceGroup : (I)V
/*      */     //   252: aload_0
/*      */     //   253: checkcast org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   256: invokevirtual isSelected : ()Z
/*      */     //   259: istore #8
/*      */     //   261: aload_0
/*      */     //   262: checkcast org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   265: invokevirtual getOnClick : ()Lkotlin/jvm/functions/Function0;
/*      */     //   268: astore #9
/*      */     //   270: aload_0
/*      */     //   271: checkcast org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   274: invokevirtual isEnabled : ()Z
/*      */     //   277: istore #10
/*      */     //   279: aload_0
/*      */     //   280: checkcast org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   283: invokevirtual getIconKey : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*      */     //   286: astore #11
/*      */     //   288: aload_0
/*      */     //   289: checkcast org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   292: invokevirtual getKeybinding : ()Ljava/util/Set;
/*      */     //   295: astore #12
/*      */     //   297: aload_0
/*      */     //   298: checkcast org/jetbrains/jewel/ui/component/MenuSelectableItem
/*      */     //   301: invokevirtual getContent : ()Lkotlin/jvm/functions/Function2;
/*      */     //   304: astore #13
/*      */     //   306: iload #8
/*      */     //   308: aload #9
/*      */     //   310: aconst_null
/*      */     //   311: iload #10
/*      */     //   313: aload #11
/*      */     //   315: aload #12
/*      */     //   317: iload_1
/*      */     //   318: iload_2
/*      */     //   319: aconst_null
/*      */     //   320: aconst_null
/*      */     //   321: aload #13
/*      */     //   323: aload_3
/*      */     //   324: ldc_w 3670016
/*      */     //   327: iload #6
/*      */     //   329: bipush #15
/*      */     //   331: ishl
/*      */     //   332: iand
/*      */     //   333: ldc_w 29360128
/*      */     //   336: iload #6
/*      */     //   338: bipush #15
/*      */     //   340: ishl
/*      */     //   341: iand
/*      */     //   342: ior
/*      */     //   343: iconst_0
/*      */     //   344: sipush #772
/*      */     //   347: invokestatic MenuItem : (ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V
/*      */     //   350: aload_3
/*      */     //   351: invokeinterface endReplaceGroup : ()V
/*      */     //   356: goto -> 479
/*      */     //   359: aload #7
/*      */     //   361: instanceof org/jetbrains/jewel/ui/component/SubmenuItem
/*      */     //   364: ifeq -> 447
/*      */     //   367: aload_3
/*      */     //   368: ldc_w -465953590
/*      */     //   371: invokeinterface startReplaceGroup : (I)V
/*      */     //   376: aload_0
/*      */     //   377: checkcast org/jetbrains/jewel/ui/component/SubmenuItem
/*      */     //   380: invokevirtual isEnabled : ()Z
/*      */     //   383: istore #8
/*      */     //   385: aload_0
/*      */     //   386: checkcast org/jetbrains/jewel/ui/component/SubmenuItem
/*      */     //   389: invokevirtual getSubmenu : ()Lkotlin/jvm/functions/Function1;
/*      */     //   392: astore #9
/*      */     //   394: aload_0
/*      */     //   395: checkcast org/jetbrains/jewel/ui/component/SubmenuItem
/*      */     //   398: invokevirtual getIconKey : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*      */     //   401: astore #10
/*      */     //   403: aload_0
/*      */     //   404: checkcast org/jetbrains/jewel/ui/component/SubmenuItem
/*      */     //   407: invokevirtual getContent : ()Lkotlin/jvm/functions/Function2;
/*      */     //   410: astore #11
/*      */     //   412: aconst_null
/*      */     //   413: iload #8
/*      */     //   415: iload_1
/*      */     //   416: aload #10
/*      */     //   418: aconst_null
/*      */     //   419: aconst_null
/*      */     //   420: aload #9
/*      */     //   422: aload #11
/*      */     //   424: aload_3
/*      */     //   425: sipush #896
/*      */     //   428: iload #6
/*      */     //   430: iconst_3
/*      */     //   431: ishl
/*      */     //   432: iand
/*      */     //   433: bipush #49
/*      */     //   435: invokestatic MenuSubmenuItem : (Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/icon/IconKey;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*      */     //   438: aload_3
/*      */     //   439: invokeinterface endReplaceGroup : ()V
/*      */     //   444: goto -> 479
/*      */     //   447: aload_3
/*      */     //   448: ldc_w 1093355926
/*      */     //   451: invokeinterface startReplaceGroup : (I)V
/*      */     //   456: aload_0
/*      */     //   457: invokeinterface getContent : ()Lkotlin/jvm/functions/Function2;
/*      */     //   462: aload_3
/*      */     //   463: iconst_0
/*      */     //   464: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   467: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   472: pop
/*      */     //   473: aload_3
/*      */     //   474: invokeinterface endReplaceGroup : ()V
/*      */     //   479: invokestatic isTraceInProgress : ()Z
/*      */     //   482: ifeq -> 497
/*      */     //   485: invokestatic traceEventEnd : ()V
/*      */     //   488: goto -> 497
/*      */     //   491: aload_3
/*      */     //   492: invokeinterface skipToGroupEnd : ()V
/*      */     //   497: aload_3
/*      */     //   498: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   503: dup
/*      */     //   504: ifnull -> 527
/*      */     //   507: aload_0
/*      */     //   508: iload_1
/*      */     //   509: iload_2
/*      */     //   510: iload #4
/*      */     //   512: iload #5
/*      */     //   514: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/MenuItem;ZZII)Lkotlin/jvm/functions/Function2;
/*      */     //   519: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   524: goto -> 528
/*      */     //   527: pop
/*      */     //   528: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #181	-> 0
/*      */     //   #182	-> 232
/*      */     //   #183	-> 235
/*      */     //   #184	-> 243
/*      */     //   #185	-> 252
/*      */     //   #186	-> 261
/*      */     //   #187	-> 270
/*      */     //   #190	-> 279
/*      */     //   #191	-> 288
/*      */     //   #192	-> 297
/*      */     //   #185	-> 306
/*      */     //   #186	-> 308
/*      */     //   #187	-> 311
/*      */     //   #190	-> 313
/*      */     //   #191	-> 315
/*      */     //   #188	-> 317
/*      */     //   #189	-> 318
/*      */     //   #192	-> 321
/*      */     //   #184	-> 347
/*      */     //   #195	-> 359
/*      */     //   #196	-> 367
/*      */     //   #197	-> 376
/*      */     //   #198	-> 385
/*      */     //   #200	-> 394
/*      */     //   #201	-> 403
/*      */     //   #197	-> 413
/*      */     //   #199	-> 415
/*      */     //   #200	-> 416
/*      */     //   #198	-> 420
/*      */     //   #201	-> 422
/*      */     //   #196	-> 435
/*      */     //   #204	-> 447
/*      */     //   #206	-> 491
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   14	515	6	$dirty	I
/*      */     //   0	529	0	item	Lorg/jetbrains/jewel/ui/component/MenuItem;
/*      */     //   0	529	1	canShowIcon	Z
/*      */     //   0	529	2	canShowKeybinding	Z
/*      */     //   0	529	3	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	529	4	$changed	I } public static final void separator(@NotNull MenuScope $this$separator) { Intrinsics.checkNotNullParameter($this$separator, "<this>"); $this$separator.passiveItem(ComposableSingletons$MenuKt.INSTANCE.getLambda-1$ui()); } @ComposableInferredTarget(scheme = "[0[0]]") public static final void items(@NotNull MenuScope $this$items, int count, @NotNull Function1 isSelected, @NotNull Function1 onItemClick, @NotNull Function3 content) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w '<this>'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_2
/*      */     //   8: ldc_w 'isSelected'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload_3
/*      */     //   15: ldc_w 'onItemClick'
/*      */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   21: aload #4
/*      */     //   23: ldc 'content'
/*      */     //   25: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   28: iconst_0
/*      */     //   29: istore #5
/*      */     //   31: iload #5
/*      */     //   33: iload_1
/*      */     //   34: if_icmpge -> 106
/*      */     //   37: iload #5
/*      */     //   39: istore #6
/*      */     //   41: iconst_0
/*      */     //   42: istore #7
/*      */     //   44: aload_0
/*      */     //   45: aload_2
/*      */     //   46: iload #6
/*      */     //   48: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   51: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   56: checkcast java/lang/Boolean
/*      */     //   59: invokevirtual booleanValue : ()Z
/*      */     //   62: aconst_null
/*      */     //   63: aconst_null
/*      */     //   64: aload_3
/*      */     //   65: iload #6
/*      */     //   67: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;I)Lkotlin/jvm/functions/Function0;
/*      */     //   72: iconst_0
/*      */     //   73: ldc_w 286280692
/*      */     //   76: iconst_1
/*      */     //   77: new org/jetbrains/jewel/ui/component/MenuKt$items$1$2
/*      */     //   80: dup
/*      */     //   81: aload #4
/*      */     //   83: iload #6
/*      */     //   85: invokespecial <init> : (Lkotlin/jvm/functions/Function3;I)V
/*      */     //   88: invokestatic composableLambdaInstance : (IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   91: checkcast kotlin/jvm/functions/Function2
/*      */     //   94: bipush #22
/*      */     //   96: aconst_null
/*      */     //   97: invokestatic selectableItem$default : (Lorg/jetbrains/jewel/ui/component/MenuScope;ZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V
/*      */     //   100: iinc #5, 1
/*      */     //   103: goto -> 31
/*      */     //   106: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #238	-> 28
/*      */     //   #914	-> 41
/*      */     //   #238	-> 44
/*      */     //   #238	-> 100
/*      */     //   #239	-> 106
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   44	56	7	$i$a$-repeat-MenuKt$items$1	I
/*      */     //   41	59	6	it	I
/*      */     //   0	107	0	$this$items	Lorg/jetbrains/jewel/ui/component/MenuScope;
/*      */     //   0	107	1	count	I
/*      */     //   0	107	2	isSelected	Lkotlin/jvm/functions/Function1;
/*      */     //   0	107	3	onItemClick	Lkotlin/jvm/functions/Function1;
/*      */     //   0	107	4	content	Lkotlin/jvm/functions/Function3; } private static final Unit items$lambda$29$lambda$28(Function1 $onItemClick, int $it) { $onItemClick.invoke(Integer.valueOf($it)); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class MenuKt$items$1$2 implements Function2<Composer, Integer, Unit> {
/*      */     MenuKt$items$1$2(Function3<Integer, Composer, Integer, Unit> $content, int $it) {} @Composable public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(286280692, $changed, -1, "org.jetbrains.jewel.ui.component.items.<anonymous>.<anonymous> (Menu.kt:237)");  this.$content.invoke(Integer.valueOf(this.$it), $composer, Integer.valueOf(0)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } } @ComposableInferredTarget(scheme = "[0[0]]") public static final <T> void items(@NotNull MenuScope $this$items, @NotNull List items, @NotNull Function1 isSelected, @NotNull Function1 onItemClick, @NotNull Function3 content) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w '<this>'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_1
/*      */     //   8: ldc_w 'items'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload_2
/*      */     //   15: ldc_w 'isSelected'
/*      */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   21: aload_3
/*      */     //   22: ldc_w 'onItemClick'
/*      */     //   25: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   28: aload #4
/*      */     //   30: ldc 'content'
/*      */     //   32: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   35: aload_1
/*      */     //   36: checkcast java/util/Collection
/*      */     //   39: invokeinterface size : ()I
/*      */     //   44: istore #5
/*      */     //   46: iconst_0
/*      */     //   47: istore #6
/*      */     //   49: iload #6
/*      */     //   51: iload #5
/*      */     //   53: if_icmpge -> 131
/*      */     //   56: iload #6
/*      */     //   58: istore #7
/*      */     //   60: iconst_0
/*      */     //   61: istore #8
/*      */     //   63: aload_0
/*      */     //   64: aload_2
/*      */     //   65: aload_1
/*      */     //   66: iload #7
/*      */     //   68: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   73: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   78: checkcast java/lang/Boolean
/*      */     //   81: invokevirtual booleanValue : ()Z
/*      */     //   84: aconst_null
/*      */     //   85: aconst_null
/*      */     //   86: aload_3
/*      */     //   87: aload_1
/*      */     //   88: iload #7
/*      */     //   90: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Ljava/util/List;I)Lkotlin/jvm/functions/Function0;
/*      */     //   95: iconst_0
/*      */     //   96: ldc_w -354919951
/*      */     //   99: iconst_1
/*      */     //   100: new org/jetbrains/jewel/ui/component/MenuKt$items$2$2
/*      */     //   103: dup
/*      */     //   104: aload #4
/*      */     //   106: aload_1
/*      */     //   107: iload #7
/*      */     //   109: invokespecial <init> : (Lkotlin/jvm/functions/Function3;Ljava/util/List;I)V
/*      */     //   112: invokestatic composableLambdaInstance : (IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   115: checkcast kotlin/jvm/functions/Function2
/*      */     //   118: bipush #22
/*      */     //   120: aconst_null
/*      */     //   121: invokestatic selectableItem$default : (Lorg/jetbrains/jewel/ui/component/MenuScope;ZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V
/*      */     //   124: nop
/*      */     //   125: iinc #6, 1
/*      */     //   128: goto -> 49
/*      */     //   131: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #247	-> 35
/*      */     //   #247	-> 46
/*      */     //   #248	-> 63
/*      */     //   #249	-> 124
/*      */     //   #247	-> 125
/*      */     //   #250	-> 131
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   63	62	8	$i$a$-repeat-MenuKt$items$2	I
/*      */     //   60	65	7	it	I
/*      */     //   0	132	0	$this$items	Lorg/jetbrains/jewel/ui/component/MenuScope;
/*      */     //   0	132	1	items	Ljava/util/List;
/*      */     //   0	132	2	isSelected	Lkotlin/jvm/functions/Function1;
/*      */     //   0	132	3	onItemClick	Lkotlin/jvm/functions/Function1;
/*      */     //   0	132	4	content	Lkotlin/jvm/functions/Function3; } private static final Unit items$lambda$31$lambda$30(Function1 $onItemClick, List $items, int $it) { $onItemClick.invoke($items.get($it)); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class MenuKt$items$2$2 implements Function2<Composer, Integer, Unit> { MenuKt$items$2$2(Function3<T, Composer, Integer, Unit> $content, List<T> $items, int $it) {} @Composable public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-354919951, $changed, -1, "org.jetbrains.jewel.ui.component.items.<anonymous>.<anonymous> (Menu.kt:247)");  this.$content.invoke(this.$items.get(this.$it), $composer, Integer.valueOf(0)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } } private static final List<MenuItem> asList(Function1 $this$asList) { List<MenuItem> list1 = CollectionsKt.createListBuilder(), $this$asList_u24lambda_u2432 = list1; int $i$a$-buildList-MenuKt$asList$1 = 0; $this$asList.invoke(new MenuKt$asList$1$1($this$asList_u24lambda_u2432)); return CollectionsKt.build(list1); } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000C\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001JX\020\002\032\0020\0032\006\020\004\032\0020\0052\b\020\006\032\004\030\0010\0072\016\020\b\032\n\022\004\022\0020\n\030\0010\t2\f\020\013\032\b\022\004\022\0020\0030\f2\006\020\r\032\0020\0052\021\020\016\032\r\022\004\022\0020\0030\f¢\006\002\b\017H\026¢\006\002\020\020J \020\021\032\0020\0032\021\020\016\032\r\022\004\022\0020\0030\f¢\006\002\b\017H\026¢\006\002\020\022JK\020\023\032\0020\0032\006\020\r\032\0020\0052\b\020\006\032\004\030\0010\0072\027\020\023\032\023\022\004\022\0020\001\022\004\022\0020\0030\024¢\006\002\b\0252\021\020\016\032\r\022\004\022\0020\0030\f¢\006\002\b\017H\026¢\006\002\020\026¨\006\027"}, d2 = {"org/jetbrains/jewel/ui/component/MenuKt$asList$1$1", "Lorg/jetbrains/jewel/ui/component/MenuScope;", "selectableItem", "", "selected", "", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "keybinding", "", "", "onClick", "Lkotlin/Function0;", "enabled", "content", "Landroidx/compose/runtime/Composable;", "(ZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;)V", "passiveItem", "(Lkotlin/jvm/functions/Function2;)V", "submenu", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(ZLorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "ui"}) public static final class MenuKt$asList$1$1 implements MenuScope { MenuKt$asList$1$1(List<MenuItem> $receiver) {} public void selectableItem(boolean selected, IconKey iconKey, Set<String> keybinding, Function0<Unit> onClick, boolean enabled, Function2<? super Composer, ? super Integer, Unit> content) { Intrinsics.checkNotNullParameter(onClick, "onClick"); Intrinsics.checkNotNullParameter(content, "content"); this.$this_buildList.add(new MenuSelectableItem(selected, enabled, iconKey, keybinding, onClick, content)); } public void passiveItem(Function2<? super Composer, ? super Integer, Unit> content) { Intrinsics.checkNotNullParameter(content, "content"); this.$this_buildList.add(new MenuPassiveItem(content)); } public void submenu(boolean enabled, IconKey iconKey, Function1<? super MenuScope, Unit> submenu, Function2<? super Composer, ? super Integer, Unit> content) { Intrinsics.checkNotNullParameter(submenu, "submenu"); Intrinsics.checkNotNullParameter(content, "content"); this.$this_buildList.add(new SubmenuItem(enabled, iconKey, submenu, content)); } } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void MenuSeparator(@Nullable Modifier modifier, @Nullable MenuItemMetrics metrics, @Nullable MenuItemColors colors, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_3
/*      */     //   1: ldc_w 1775713441
/*      */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   9: astore_3
/*      */     //   10: iload #4
/*      */     //   12: istore #6
/*      */     //   14: iload #5
/*      */     //   16: iconst_1
/*      */     //   17: iand
/*      */     //   18: ifeq -> 31
/*      */     //   21: iload #6
/*      */     //   23: bipush #6
/*      */     //   25: ior
/*      */     //   26: istore #6
/*      */     //   28: goto -> 59
/*      */     //   31: iload #4
/*      */     //   33: bipush #6
/*      */     //   35: iand
/*      */     //   36: ifne -> 59
/*      */     //   39: iload #6
/*      */     //   41: aload_3
/*      */     //   42: aload_0
/*      */     //   43: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   48: ifeq -> 55
/*      */     //   51: iconst_4
/*      */     //   52: goto -> 56
/*      */     //   55: iconst_2
/*      */     //   56: ior
/*      */     //   57: istore #6
/*      */     //   59: iload #4
/*      */     //   61: bipush #48
/*      */     //   63: iand
/*      */     //   64: ifne -> 96
/*      */     //   67: iload #6
/*      */     //   69: iload #5
/*      */     //   71: iconst_2
/*      */     //   72: iand
/*      */     //   73: ifne -> 91
/*      */     //   76: aload_3
/*      */     //   77: aload_1
/*      */     //   78: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   83: ifeq -> 91
/*      */     //   86: bipush #32
/*      */     //   88: goto -> 93
/*      */     //   91: bipush #16
/*      */     //   93: ior
/*      */     //   94: istore #6
/*      */     //   96: iload #4
/*      */     //   98: sipush #384
/*      */     //   101: iand
/*      */     //   102: ifne -> 136
/*      */     //   105: iload #6
/*      */     //   107: iload #5
/*      */     //   109: iconst_4
/*      */     //   110: iand
/*      */     //   111: ifne -> 130
/*      */     //   114: aload_3
/*      */     //   115: aload_2
/*      */     //   116: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   121: ifeq -> 130
/*      */     //   124: sipush #256
/*      */     //   127: goto -> 133
/*      */     //   130: sipush #128
/*      */     //   133: ior
/*      */     //   134: istore #6
/*      */     //   136: iload #6
/*      */     //   138: sipush #147
/*      */     //   141: iand
/*      */     //   142: sipush #146
/*      */     //   145: if_icmpne -> 157
/*      */     //   148: aload_3
/*      */     //   149: invokeinterface getSkipping : ()Z
/*      */     //   154: ifne -> 751
/*      */     //   157: aload_3
/*      */     //   158: invokeinterface startDefaults : ()V
/*      */     //   163: iload #4
/*      */     //   165: iconst_1
/*      */     //   166: iand
/*      */     //   167: ifeq -> 179
/*      */     //   170: aload_3
/*      */     //   171: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   176: ifeq -> 257
/*      */     //   179: iload #5
/*      */     //   181: iconst_1
/*      */     //   182: iand
/*      */     //   183: ifeq -> 193
/*      */     //   186: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   189: checkcast androidx/compose/ui/Modifier
/*      */     //   192: astore_0
/*      */     //   193: iload #5
/*      */     //   195: iconst_2
/*      */     //   196: iand
/*      */     //   197: ifeq -> 223
/*      */     //   200: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   203: aload_3
/*      */     //   204: bipush #6
/*      */     //   206: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   209: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   212: invokevirtual getItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */     //   215: astore_1
/*      */     //   216: iload #6
/*      */     //   218: bipush #-113
/*      */     //   220: iand
/*      */     //   221: istore #6
/*      */     //   223: iload #5
/*      */     //   225: iconst_4
/*      */     //   226: iand
/*      */     //   227: ifeq -> 292
/*      */     //   230: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   233: aload_3
/*      */     //   234: bipush #6
/*      */     //   236: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   239: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/MenuColors;
/*      */     //   242: invokevirtual getItemColors : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*      */     //   245: astore_2
/*      */     //   246: iload #6
/*      */     //   248: sipush #-897
/*      */     //   251: iand
/*      */     //   252: istore #6
/*      */     //   254: goto -> 292
/*      */     //   257: aload_3
/*      */     //   258: invokeinterface skipToGroupEnd : ()V
/*      */     //   263: iload #5
/*      */     //   265: iconst_2
/*      */     //   266: iand
/*      */     //   267: ifeq -> 277
/*      */     //   270: iload #6
/*      */     //   272: bipush #-113
/*      */     //   274: iand
/*      */     //   275: istore #6
/*      */     //   277: iload #5
/*      */     //   279: iconst_4
/*      */     //   280: iand
/*      */     //   281: ifeq -> 292
/*      */     //   284: iload #6
/*      */     //   286: sipush #-897
/*      */     //   289: iand
/*      */     //   290: istore #6
/*      */     //   292: aload_3
/*      */     //   293: invokeinterface endDefaults : ()V
/*      */     //   298: invokestatic isTraceInProgress : ()Z
/*      */     //   301: ifeq -> 316
/*      */     //   304: ldc_w 1775713441
/*      */     //   307: iload #6
/*      */     //   309: iconst_m1
/*      */     //   310: ldc_w 'org.jetbrains.jewel.ui.component.MenuSeparator (Menu.kt:317)'
/*      */     //   313: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   316: aload_0
/*      */     //   317: aload_1
/*      */     //   318: invokevirtual getSeparatorHeight-D9Ej5fM : ()F
/*      */     //   321: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*      */     //   324: astore #7
/*      */     //   326: iconst_0
/*      */     //   327: istore #10
/*      */     //   329: iconst_0
/*      */     //   330: istore #11
/*      */     //   332: aload_3
/*      */     //   333: ldc_w 733328855
/*      */     //   336: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   339: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   342: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   345: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   348: astore #8
/*      */     //   350: iconst_0
/*      */     //   351: istore #9
/*      */     //   353: aload #8
/*      */     //   355: iload #9
/*      */     //   357: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   360: astore #12
/*      */     //   362: bipush #112
/*      */     //   364: iload #10
/*      */     //   366: iconst_3
/*      */     //   367: ishl
/*      */     //   368: iand
/*      */     //   369: istore #13
/*      */     //   371: nop
/*      */     //   372: iconst_0
/*      */     //   373: istore #14
/*      */     //   375: aload_3
/*      */     //   376: ldc_w -1323940314
/*      */     //   379: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   382: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   385: aload_3
/*      */     //   386: iconst_0
/*      */     //   387: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   390: istore #15
/*      */     //   392: aload_3
/*      */     //   393: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   398: astore #16
/*      */     //   400: aload_3
/*      */     //   401: aload #7
/*      */     //   403: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   406: astore #17
/*      */     //   408: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   411: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   414: astore #18
/*      */     //   416: bipush #6
/*      */     //   418: sipush #896
/*      */     //   421: iload #13
/*      */     //   423: bipush #6
/*      */     //   425: ishl
/*      */     //   426: iand
/*      */     //   427: ior
/*      */     //   428: istore #19
/*      */     //   430: nop
/*      */     //   431: iconst_0
/*      */     //   432: istore #20
/*      */     //   434: aload_3
/*      */     //   435: ldc_w -692256719
/*      */     //   438: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   441: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   444: aload_3
/*      */     //   445: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   450: instanceof androidx/compose/runtime/Applier
/*      */     //   453: ifne -> 459
/*      */     //   456: invokestatic invalidApplier : ()V
/*      */     //   459: aload_3
/*      */     //   460: invokeinterface startReusableNode : ()V
/*      */     //   465: aload_3
/*      */     //   466: invokeinterface getInserting : ()Z
/*      */     //   471: ifeq -> 485
/*      */     //   474: aload_3
/*      */     //   475: aload #18
/*      */     //   477: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   482: goto -> 491
/*      */     //   485: aload_3
/*      */     //   486: invokeinterface useNode : ()V
/*      */     //   491: aload_3
/*      */     //   492: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   495: astore #21
/*      */     //   497: iconst_0
/*      */     //   498: istore #22
/*      */     //   500: aload #21
/*      */     //   502: aload #12
/*      */     //   504: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   507: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   510: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   513: aload #21
/*      */     //   515: aload #16
/*      */     //   517: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   520: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   523: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   526: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   529: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   532: astore #23
/*      */     //   534: iconst_0
/*      */     //   535: istore #24
/*      */     //   537: aload #21
/*      */     //   539: astore #25
/*      */     //   541: iconst_0
/*      */     //   542: istore #26
/*      */     //   544: aload #25
/*      */     //   546: invokeinterface getInserting : ()Z
/*      */     //   551: ifne -> 572
/*      */     //   554: aload #25
/*      */     //   556: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   561: iload #15
/*      */     //   563: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   566: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   569: ifne -> 598
/*      */     //   572: aload #25
/*      */     //   574: iload #15
/*      */     //   576: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   579: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   584: aload #21
/*      */     //   586: iload #15
/*      */     //   588: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   591: aload #23
/*      */     //   593: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   598: nop
/*      */     //   599: nop
/*      */     //   600: nop
/*      */     //   601: aload #21
/*      */     //   603: aload #17
/*      */     //   605: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   608: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   611: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   614: nop
/*      */     //   615: nop
/*      */     //   616: aload_3
/*      */     //   617: bipush #14
/*      */     //   619: iload #19
/*      */     //   621: bipush #6
/*      */     //   623: ishr
/*      */     //   624: iand
/*      */     //   625: istore #27
/*      */     //   627: astore #28
/*      */     //   629: iconst_0
/*      */     //   630: istore #29
/*      */     //   632: aload #28
/*      */     //   634: ldc_w -2146769399
/*      */     //   637: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   640: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   643: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   646: aload #28
/*      */     //   648: bipush #6
/*      */     //   650: bipush #112
/*      */     //   652: iload #10
/*      */     //   654: bipush #6
/*      */     //   656: ishr
/*      */     //   657: iand
/*      */     //   658: ior
/*      */     //   659: istore #30
/*      */     //   661: astore #31
/*      */     //   663: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   666: astore #32
/*      */     //   668: iconst_0
/*      */     //   669: istore #33
/*      */     //   671: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
/*      */     //   674: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   677: checkcast androidx/compose/ui/Modifier
/*      */     //   680: fconst_0
/*      */     //   681: iconst_1
/*      */     //   682: aconst_null
/*      */     //   683: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   686: aload_1
/*      */     //   687: invokevirtual getSeparatorPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*      */     //   690: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*      */     //   693: aload_2
/*      */     //   694: invokevirtual getSeparator-0d7_KjU : ()J
/*      */     //   697: aload_1
/*      */     //   698: invokevirtual getSeparatorThickness-D9Ej5fM : ()F
/*      */     //   701: fconst_0
/*      */     //   702: aconst_null
/*      */     //   703: aload #31
/*      */     //   705: bipush #6
/*      */     //   707: bipush #48
/*      */     //   709: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
/*      */     //   712: nop
/*      */     //   713: aload #28
/*      */     //   715: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   718: aload_3
/*      */     //   719: invokeinterface endNode : ()V
/*      */     //   724: aload_3
/*      */     //   725: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   728: nop
/*      */     //   729: aload_3
/*      */     //   730: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   733: nop
/*      */     //   734: aload_3
/*      */     //   735: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   738: nop
/*      */     //   739: invokestatic isTraceInProgress : ()Z
/*      */     //   742: ifeq -> 757
/*      */     //   745: invokestatic traceEventEnd : ()V
/*      */     //   748: goto -> 757
/*      */     //   751: aload_3
/*      */     //   752: invokeinterface skipToGroupEnd : ()V
/*      */     //   757: aload_3
/*      */     //   758: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   763: dup
/*      */     //   764: ifnull -> 787
/*      */     //   767: aload_0
/*      */     //   768: aload_1
/*      */     //   769: aload_2
/*      */     //   770: iload #4
/*      */     //   772: iload #5
/*      */     //   774: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;II)Lkotlin/jvm/functions/Function2;
/*      */     //   779: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   784: goto -> 788
/*      */     //   787: pop
/*      */     //   788: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #318	-> 0
/*      */     //   #315	-> 186
/*      */     //   #316	-> 200
/*      */     //   #317	-> 230
/*      */     //   #318	-> 313
/*      */     //   #319	-> 316
/*      */     //   #915	-> 339
/*      */     //   #916	-> 342
/*      */     //   #917	-> 350
/*      */     //   #920	-> 353
/*      */     //   #921	-> 371
/*      */     //   #922	-> 382
/*      */     //   #923	-> 387
/*      */     //   #924	-> 393
/*      */     //   #925	-> 401
/*      */     //   #927	-> 408
/*      */     //   #926	-> 430
/*      */     //   #928	-> 441
/*      */     //   #929	-> 444
/*      */     //   #930	-> 460
/*      */     //   #931	-> 465
/*      */     //   #932	-> 475
/*      */     //   #934	-> 486
/*      */     //   #936	-> 491
/*      */     //   #937	-> 500
/*      */     //   #938	-> 513
/*      */     //   #940	-> 526
/*      */     //   #941	-> 537
/*      */     //   #942	-> 544
/*      */     //   #943	-> 572
/*      */     //   #944	-> 584
/*      */     //   #946	-> 598
/*      */     //   #941	-> 599
/*      */     //   #946	-> 600
/*      */     //   #947	-> 601
/*      */     //   #948	-> 614
/*      */     //   #936	-> 615
/*      */     //   #949	-> 616
/*      */     //   #950	-> 640
/*      */     //   #321	-> 671
/*      */     //   #322	-> 674
/*      */     //   #323	-> 693
/*      */     //   #324	-> 697
/*      */     //   #320	-> 709
/*      */     //   #326	-> 712
/*      */     //   #950	-> 713
/*      */     //   #949	-> 718
/*      */     //   #951	-> 719
/*      */     //   #928	-> 725
/*      */     //   #952	-> 728
/*      */     //   #922	-> 730
/*      */     //   #953	-> 733
/*      */     //   #915	-> 735
/*      */     //   #954	-> 738
/*      */     //   #327	-> 751
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   671	42	33	$i$a$-Box-MenuKt$MenuSeparator$1	I
/*      */     //   668	45	32	$this$MenuSeparator_u24lambda_u2433	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   668	45	31	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   668	45	30	$changed	I
/*      */     //   632	86	29	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   629	89	28	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   629	89	27	$changed$iv	I
/*      */     //   544	55	26	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   541	58	25	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   537	64	24	$i$f$set-impl	I
/*      */     //   534	67	23	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   500	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   497	118	21	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   434	295	20	$i$f$ReusableComposeNode	I
/*      */     //   431	298	18	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   431	298	19	$changed$iv$iv$iv	I
/*      */     //   375	359	14	$i$f$Layout	I
/*      */     //   392	342	15	compositeKeyHash$iv$iv	I
/*      */     //   400	334	16	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   408	326	17	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   372	362	13	$changed$iv$iv	I
/*      */     //   332	407	11	$i$f$Box	I
/*      */     //   362	377	12	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   329	410	7	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   350	389	8	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   353	386	9	propagateMinConstraints$iv	Z
/*      */     //   329	410	10	$changed$iv	I
/*      */     //   14	775	6	$dirty	I
/*      */     //   0	789	0	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	789	1	metrics	Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */     //   0	789	2	colors	Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*      */     //   0	789	3	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	789	4	$changed	I } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void MenuItem(boolean selected, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, @Nullable IconKey iconKey, @Nullable Set keybinding, boolean canShowIcon, boolean canShowKeybinding, @Nullable MutableInteractionSource interactionSource, @Nullable MenuStyle style, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc_w 'onClick'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload #10
/*      */     //   9: ldc 'content'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload #11
/*      */     //   16: ldc_w 23090726
/*      */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   24: astore #11
/*      */     //   26: iload #12
/*      */     //   28: istore #15
/*      */     //   30: iload #13
/*      */     //   32: istore #16
/*      */     //   34: iload #14
/*      */     //   36: iconst_1
/*      */     //   37: iand
/*      */     //   38: ifeq -> 51
/*      */     //   41: iload #15
/*      */     //   43: bipush #6
/*      */     //   45: ior
/*      */     //   46: istore #15
/*      */     //   48: goto -> 80
/*      */     //   51: iload #12
/*      */     //   53: bipush #6
/*      */     //   55: iand
/*      */     //   56: ifne -> 80
/*      */     //   59: iload #15
/*      */     //   61: aload #11
/*      */     //   63: iload_0
/*      */     //   64: invokeinterface changed : (Z)Z
/*      */     //   69: ifeq -> 76
/*      */     //   72: iconst_4
/*      */     //   73: goto -> 77
/*      */     //   76: iconst_2
/*      */     //   77: ior
/*      */     //   78: istore #15
/*      */     //   80: iload #14
/*      */     //   82: iconst_2
/*      */     //   83: iand
/*      */     //   84: ifeq -> 97
/*      */     //   87: iload #15
/*      */     //   89: bipush #48
/*      */     //   91: ior
/*      */     //   92: istore #15
/*      */     //   94: goto -> 128
/*      */     //   97: iload #12
/*      */     //   99: bipush #48
/*      */     //   101: iand
/*      */     //   102: ifne -> 128
/*      */     //   105: iload #15
/*      */     //   107: aload #11
/*      */     //   109: aload_1
/*      */     //   110: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   115: ifeq -> 123
/*      */     //   118: bipush #32
/*      */     //   120: goto -> 125
/*      */     //   123: bipush #16
/*      */     //   125: ior
/*      */     //   126: istore #15
/*      */     //   128: iload #14
/*      */     //   130: iconst_4
/*      */     //   131: iand
/*      */     //   132: ifeq -> 146
/*      */     //   135: iload #15
/*      */     //   137: sipush #384
/*      */     //   140: ior
/*      */     //   141: istore #15
/*      */     //   143: goto -> 180
/*      */     //   146: iload #12
/*      */     //   148: sipush #384
/*      */     //   151: iand
/*      */     //   152: ifne -> 180
/*      */     //   155: iload #15
/*      */     //   157: aload #11
/*      */     //   159: aload_2
/*      */     //   160: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   165: ifeq -> 174
/*      */     //   168: sipush #256
/*      */     //   171: goto -> 177
/*      */     //   174: sipush #128
/*      */     //   177: ior
/*      */     //   178: istore #15
/*      */     //   180: iload #14
/*      */     //   182: bipush #8
/*      */     //   184: iand
/*      */     //   185: ifeq -> 199
/*      */     //   188: iload #15
/*      */     //   190: sipush #3072
/*      */     //   193: ior
/*      */     //   194: istore #15
/*      */     //   196: goto -> 233
/*      */     //   199: iload #12
/*      */     //   201: sipush #3072
/*      */     //   204: iand
/*      */     //   205: ifne -> 233
/*      */     //   208: iload #15
/*      */     //   210: aload #11
/*      */     //   212: iload_3
/*      */     //   213: invokeinterface changed : (Z)Z
/*      */     //   218: ifeq -> 227
/*      */     //   221: sipush #2048
/*      */     //   224: goto -> 230
/*      */     //   227: sipush #1024
/*      */     //   230: ior
/*      */     //   231: istore #15
/*      */     //   233: iload #14
/*      */     //   235: bipush #16
/*      */     //   237: iand
/*      */     //   238: ifeq -> 252
/*      */     //   241: iload #15
/*      */     //   243: sipush #24576
/*      */     //   246: ior
/*      */     //   247: istore #15
/*      */     //   249: goto -> 308
/*      */     //   252: iload #12
/*      */     //   254: sipush #24576
/*      */     //   257: iand
/*      */     //   258: ifne -> 308
/*      */     //   261: iload #15
/*      */     //   263: iload #12
/*      */     //   265: ldc_w 32768
/*      */     //   268: iand
/*      */     //   269: ifne -> 284
/*      */     //   272: aload #11
/*      */     //   274: aload #4
/*      */     //   276: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   281: goto -> 293
/*      */     //   284: aload #11
/*      */     //   286: aload #4
/*      */     //   288: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   293: ifeq -> 302
/*      */     //   296: sipush #16384
/*      */     //   299: goto -> 305
/*      */     //   302: sipush #8192
/*      */     //   305: ior
/*      */     //   306: istore #15
/*      */     //   308: iload #14
/*      */     //   310: bipush #32
/*      */     //   312: iand
/*      */     //   313: ifeq -> 326
/*      */     //   316: iload #15
/*      */     //   318: ldc 196608
/*      */     //   320: ior
/*      */     //   321: istore #15
/*      */     //   323: goto -> 358
/*      */     //   326: iload #12
/*      */     //   328: ldc 196608
/*      */     //   330: iand
/*      */     //   331: ifne -> 358
/*      */     //   334: iload #15
/*      */     //   336: aload #11
/*      */     //   338: aload #5
/*      */     //   340: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   345: ifeq -> 353
/*      */     //   348: ldc 131072
/*      */     //   350: goto -> 355
/*      */     //   353: ldc 65536
/*      */     //   355: ior
/*      */     //   356: istore #15
/*      */     //   358: iload #14
/*      */     //   360: bipush #64
/*      */     //   362: iand
/*      */     //   363: ifeq -> 377
/*      */     //   366: iload #15
/*      */     //   368: ldc_w 1572864
/*      */     //   371: ior
/*      */     //   372: istore #15
/*      */     //   374: goto -> 412
/*      */     //   377: iload #12
/*      */     //   379: ldc_w 1572864
/*      */     //   382: iand
/*      */     //   383: ifne -> 412
/*      */     //   386: iload #15
/*      */     //   388: aload #11
/*      */     //   390: iload #6
/*      */     //   392: invokeinterface changed : (Z)Z
/*      */     //   397: ifeq -> 406
/*      */     //   400: ldc_w 1048576
/*      */     //   403: goto -> 409
/*      */     //   406: ldc_w 524288
/*      */     //   409: ior
/*      */     //   410: istore #15
/*      */     //   412: iload #14
/*      */     //   414: sipush #128
/*      */     //   417: iand
/*      */     //   418: ifeq -> 432
/*      */     //   421: iload #15
/*      */     //   423: ldc_w 12582912
/*      */     //   426: ior
/*      */     //   427: istore #15
/*      */     //   429: goto -> 467
/*      */     //   432: iload #12
/*      */     //   434: ldc_w 12582912
/*      */     //   437: iand
/*      */     //   438: ifne -> 467
/*      */     //   441: iload #15
/*      */     //   443: aload #11
/*      */     //   445: iload #7
/*      */     //   447: invokeinterface changed : (Z)Z
/*      */     //   452: ifeq -> 461
/*      */     //   455: ldc_w 8388608
/*      */     //   458: goto -> 464
/*      */     //   461: ldc_w 4194304
/*      */     //   464: ior
/*      */     //   465: istore #15
/*      */     //   467: iload #14
/*      */     //   469: sipush #256
/*      */     //   472: iand
/*      */     //   473: ifeq -> 487
/*      */     //   476: iload #15
/*      */     //   478: ldc_w 100663296
/*      */     //   481: ior
/*      */     //   482: istore #15
/*      */     //   484: goto -> 522
/*      */     //   487: iload #12
/*      */     //   489: ldc_w 100663296
/*      */     //   492: iand
/*      */     //   493: ifne -> 522
/*      */     //   496: iload #15
/*      */     //   498: aload #11
/*      */     //   500: aload #8
/*      */     //   502: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   507: ifeq -> 516
/*      */     //   510: ldc_w 67108864
/*      */     //   513: goto -> 519
/*      */     //   516: ldc_w 33554432
/*      */     //   519: ior
/*      */     //   520: istore #15
/*      */     //   522: iload #12
/*      */     //   524: ldc_w 805306368
/*      */     //   527: iand
/*      */     //   528: ifne -> 566
/*      */     //   531: iload #15
/*      */     //   533: iload #14
/*      */     //   535: sipush #512
/*      */     //   538: iand
/*      */     //   539: ifne -> 560
/*      */     //   542: aload #11
/*      */     //   544: aload #9
/*      */     //   546: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   551: ifeq -> 560
/*      */     //   554: ldc_w 536870912
/*      */     //   557: goto -> 563
/*      */     //   560: ldc_w 268435456
/*      */     //   563: ior
/*      */     //   564: istore #15
/*      */     //   566: iload #14
/*      */     //   568: sipush #1024
/*      */     //   571: iand
/*      */     //   572: ifeq -> 585
/*      */     //   575: iload #16
/*      */     //   577: bipush #6
/*      */     //   579: ior
/*      */     //   580: istore #16
/*      */     //   582: goto -> 615
/*      */     //   585: iload #13
/*      */     //   587: bipush #6
/*      */     //   589: iand
/*      */     //   590: ifne -> 615
/*      */     //   593: iload #16
/*      */     //   595: aload #11
/*      */     //   597: aload #10
/*      */     //   599: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   604: ifeq -> 611
/*      */     //   607: iconst_4
/*      */     //   608: goto -> 612
/*      */     //   611: iconst_2
/*      */     //   612: ior
/*      */     //   613: istore #16
/*      */     //   615: iload #15
/*      */     //   617: ldc_w 306783379
/*      */     //   620: iand
/*      */     //   621: ldc_w 306783378
/*      */     //   624: if_icmpne -> 645
/*      */     //   627: iload #16
/*      */     //   629: iconst_3
/*      */     //   630: iand
/*      */     //   631: iconst_2
/*      */     //   632: if_icmpne -> 645
/*      */     //   635: aload #11
/*      */     //   637: invokeinterface getSkipping : ()Z
/*      */     //   642: ifne -> 2285
/*      */     //   645: aload #11
/*      */     //   647: invokeinterface startDefaults : ()V
/*      */     //   652: iload #12
/*      */     //   654: iconst_1
/*      */     //   655: iand
/*      */     //   656: ifeq -> 669
/*      */     //   659: aload #11
/*      */     //   661: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   666: ifeq -> 820
/*      */     //   669: iload #14
/*      */     //   671: iconst_4
/*      */     //   672: iand
/*      */     //   673: ifeq -> 683
/*      */     //   676: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   679: checkcast androidx/compose/ui/Modifier
/*      */     //   682: astore_2
/*      */     //   683: iload #14
/*      */     //   685: bipush #8
/*      */     //   687: iand
/*      */     //   688: ifeq -> 693
/*      */     //   691: iconst_1
/*      */     //   692: istore_3
/*      */     //   693: iload #14
/*      */     //   695: sipush #256
/*      */     //   698: iand
/*      */     //   699: ifeq -> 788
/*      */     //   702: aload #11
/*      */     //   704: ldc_w -1098048873
/*      */     //   707: invokeinterface startReplaceGroup : (I)V
/*      */     //   712: aload #11
/*      */     //   714: astore #18
/*      */     //   716: iconst_0
/*      */     //   717: istore #19
/*      */     //   719: iconst_0
/*      */     //   720: istore #20
/*      */     //   722: aload #18
/*      */     //   724: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   729: astore #21
/*      */     //   731: iconst_0
/*      */     //   732: istore #22
/*      */     //   734: aload #21
/*      */     //   736: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   739: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   742: if_acmpne -> 767
/*      */     //   745: iconst_0
/*      */     //   746: istore #23
/*      */     //   748: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   751: astore #23
/*      */     //   753: aload #18
/*      */     //   755: aload #23
/*      */     //   757: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   762: aload #23
/*      */     //   764: goto -> 769
/*      */     //   767: aload #21
/*      */     //   769: nop
/*      */     //   770: nop
/*      */     //   771: nop
/*      */     //   772: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   775: astore #17
/*      */     //   777: aload #11
/*      */     //   779: invokeinterface endReplaceGroup : ()V
/*      */     //   784: aload #17
/*      */     //   786: astore #8
/*      */     //   788: iload #14
/*      */     //   790: sipush #512
/*      */     //   793: iand
/*      */     //   794: ifeq -> 844
/*      */     //   797: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   800: aload #11
/*      */     //   802: bipush #6
/*      */     //   804: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   807: astore #9
/*      */     //   809: iload #15
/*      */     //   811: ldc_w -1879048193
/*      */     //   814: iand
/*      */     //   815: istore #15
/*      */     //   817: goto -> 844
/*      */     //   820: aload #11
/*      */     //   822: invokeinterface skipToGroupEnd : ()V
/*      */     //   827: iload #14
/*      */     //   829: sipush #512
/*      */     //   832: iand
/*      */     //   833: ifeq -> 844
/*      */     //   836: iload #15
/*      */     //   838: ldc_w -1879048193
/*      */     //   841: iand
/*      */     //   842: istore #15
/*      */     //   844: aload #11
/*      */     //   846: invokeinterface endDefaults : ()V
/*      */     //   851: invokestatic isTraceInProgress : ()Z
/*      */     //   854: ifeq -> 870
/*      */     //   857: ldc_w 23090726
/*      */     //   860: iload #15
/*      */     //   862: iload #16
/*      */     //   864: ldc_w 'org.jetbrains.jewel.ui.component.MenuItem (Menu.kt:341)'
/*      */     //   867: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   870: aload #11
/*      */     //   872: ldc_w -1098043816
/*      */     //   875: invokeinterface startReplaceGroup : (I)V
/*      */     //   880: aload #11
/*      */     //   882: astore #19
/*      */     //   884: iload #15
/*      */     //   886: ldc_w 234881024
/*      */     //   889: iand
/*      */     //   890: ldc_w 67108864
/*      */     //   893: if_icmpne -> 900
/*      */     //   896: iconst_1
/*      */     //   897: goto -> 901
/*      */     //   900: iconst_0
/*      */     //   901: istore #20
/*      */     //   903: nop
/*      */     //   904: iconst_0
/*      */     //   905: istore #21
/*      */     //   907: aload #19
/*      */     //   909: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   914: astore #22
/*      */     //   916: iconst_0
/*      */     //   917: istore #23
/*      */     //   919: iload #20
/*      */     //   921: ifne -> 935
/*      */     //   924: aload #22
/*      */     //   926: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   929: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   932: if_acmpne -> 978
/*      */     //   935: iconst_0
/*      */     //   936: istore #24
/*      */     //   938: getstatic org/jetbrains/jewel/ui/component/MenuItemState.Companion : Lorg/jetbrains/jewel/ui/component/MenuItemState$Companion;
/*      */     //   941: iload_0
/*      */     //   942: iload_3
/*      */     //   943: iconst_0
/*      */     //   944: iconst_0
/*      */     //   945: iconst_0
/*      */     //   946: iconst_0
/*      */     //   947: bipush #60
/*      */     //   949: aconst_null
/*      */     //   950: invokestatic of-moUeATs$default : (Lorg/jetbrains/jewel/ui/component/MenuItemState$Companion;ZZZZZZILjava/lang/Object;)J
/*      */     //   953: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/MenuItemState;
/*      */     //   956: aconst_null
/*      */     //   957: iconst_2
/*      */     //   958: aconst_null
/*      */     //   959: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   962: astore #25
/*      */     //   964: aload #19
/*      */     //   966: aload #25
/*      */     //   968: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   973: aload #25
/*      */     //   975: goto -> 980
/*      */     //   978: aload #22
/*      */     //   980: nop
/*      */     //   981: nop
/*      */     //   982: nop
/*      */     //   983: checkcast androidx/compose/runtime/MutableState
/*      */     //   986: astore #18
/*      */     //   988: aload #11
/*      */     //   990: invokeinterface endReplaceGroup : ()V
/*      */     //   995: aload #18
/*      */     //   997: astore #17
/*      */     //   999: aload #11
/*      */     //   1001: ldc_w -1098040302
/*      */     //   1004: invokeinterface startReplaceGroup : (I)V
/*      */     //   1009: aload #11
/*      */     //   1011: astore #18
/*      */     //   1013: iload #15
/*      */     //   1015: sipush #7168
/*      */     //   1018: iand
/*      */     //   1019: sipush #2048
/*      */     //   1022: if_icmpne -> 1029
/*      */     //   1025: iconst_1
/*      */     //   1026: goto -> 1030
/*      */     //   1029: iconst_0
/*      */     //   1030: iload #15
/*      */     //   1032: bipush #14
/*      */     //   1034: iand
/*      */     //   1035: iconst_4
/*      */     //   1036: if_icmpne -> 1043
/*      */     //   1039: iconst_1
/*      */     //   1040: goto -> 1044
/*      */     //   1043: iconst_0
/*      */     //   1044: ior
/*      */     //   1045: istore #19
/*      */     //   1047: nop
/*      */     //   1048: iconst_0
/*      */     //   1049: istore #20
/*      */     //   1051: aload #18
/*      */     //   1053: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1058: astore #21
/*      */     //   1060: iconst_0
/*      */     //   1061: istore #22
/*      */     //   1063: iload #19
/*      */     //   1065: ifne -> 1079
/*      */     //   1068: aload #21
/*      */     //   1070: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1073: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1076: if_acmpne -> 1123
/*      */     //   1079: iconst_0
/*      */     //   1080: istore #23
/*      */     //   1082: aload #17
/*      */     //   1084: aload #17
/*      */     //   1086: invokestatic MenuItem$lambda$37 : (Landroidx/compose/runtime/MutableState;)J
/*      */     //   1089: iload_0
/*      */     //   1090: iload_3
/*      */     //   1091: iconst_0
/*      */     //   1092: iconst_0
/*      */     //   1093: iconst_0
/*      */     //   1094: iconst_0
/*      */     //   1095: bipush #60
/*      */     //   1097: aconst_null
/*      */     //   1098: invokestatic copy-moUeATs$default : (JZZZZZZILjava/lang/Object;)J
/*      */     //   1101: invokestatic MenuItem$lambda$38 : (Landroidx/compose/runtime/MutableState;J)V
/*      */     //   1104: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   1107: astore #24
/*      */     //   1109: aload #18
/*      */     //   1111: aload #24
/*      */     //   1113: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1118: aload #24
/*      */     //   1120: goto -> 1125
/*      */     //   1123: aload #21
/*      */     //   1125: nop
/*      */     //   1126: nop
/*      */     //   1127: nop
/*      */     //   1128: pop
/*      */     //   1129: aload #11
/*      */     //   1131: invokeinterface endReplaceGroup : ()V
/*      */     //   1136: aload #11
/*      */     //   1138: ldc_w -1098036371
/*      */     //   1141: invokeinterface startReplaceGroup : (I)V
/*      */     //   1146: aload #11
/*      */     //   1148: astore #20
/*      */     //   1150: iconst_0
/*      */     //   1151: istore #21
/*      */     //   1153: nop
/*      */     //   1154: iconst_0
/*      */     //   1155: istore #22
/*      */     //   1157: aload #20
/*      */     //   1159: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1164: astore #23
/*      */     //   1166: iconst_0
/*      */     //   1167: istore #24
/*      */     //   1169: aload #23
/*      */     //   1171: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1174: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1177: if_acmpne -> 1206
/*      */     //   1180: iconst_0
/*      */     //   1181: istore #25
/*      */     //   1183: new androidx/compose/ui/focus/FocusRequester
/*      */     //   1186: dup
/*      */     //   1187: invokespecial <init> : ()V
/*      */     //   1190: astore #25
/*      */     //   1192: aload #20
/*      */     //   1194: aload #25
/*      */     //   1196: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1201: aload #25
/*      */     //   1203: goto -> 1208
/*      */     //   1206: aload #23
/*      */     //   1208: nop
/*      */     //   1209: nop
/*      */     //   1210: nop
/*      */     //   1211: checkcast androidx/compose/ui/focus/FocusRequester
/*      */     //   1214: astore #19
/*      */     //   1216: aload #11
/*      */     //   1218: invokeinterface endReplaceGroup : ()V
/*      */     //   1223: aload #19
/*      */     //   1225: astore #18
/*      */     //   1227: aload #8
/*      */     //   1229: aload #11
/*      */     //   1231: ldc_w -1098033394
/*      */     //   1234: invokeinterface startReplaceGroup : (I)V
/*      */     //   1239: aload #11
/*      */     //   1241: astore #20
/*      */     //   1243: iload #15
/*      */     //   1245: ldc_w 234881024
/*      */     //   1248: iand
/*      */     //   1249: ldc_w 67108864
/*      */     //   1252: if_icmpne -> 1259
/*      */     //   1255: iconst_1
/*      */     //   1256: goto -> 1260
/*      */     //   1259: iconst_0
/*      */     //   1260: aload #11
/*      */     //   1262: aload #17
/*      */     //   1264: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   1269: ior
/*      */     //   1270: istore #21
/*      */     //   1272: iconst_0
/*      */     //   1273: istore #22
/*      */     //   1275: aload #20
/*      */     //   1277: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1282: astore #23
/*      */     //   1284: iconst_0
/*      */     //   1285: istore #24
/*      */     //   1287: iload #21
/*      */     //   1289: ifne -> 1303
/*      */     //   1292: aload #23
/*      */     //   1294: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1297: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1300: if_acmpne -> 1344
/*      */     //   1303: astore #57
/*      */     //   1305: iconst_0
/*      */     //   1306: istore #25
/*      */     //   1308: new org/jetbrains/jewel/ui/component/MenuKt$MenuItem$3$1
/*      */     //   1311: dup
/*      */     //   1312: aload #8
/*      */     //   1314: aload #18
/*      */     //   1316: aload #17
/*      */     //   1318: aconst_null
/*      */     //   1319: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*      */     //   1322: checkcast kotlin/jvm/functions/Function2
/*      */     //   1325: aload #57
/*      */     //   1327: swap
/*      */     //   1328: astore #26
/*      */     //   1330: aload #20
/*      */     //   1332: aload #26
/*      */     //   1334: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1339: aload #26
/*      */     //   1341: goto -> 1346
/*      */     //   1344: aload #23
/*      */     //   1346: nop
/*      */     //   1347: nop
/*      */     //   1348: nop
/*      */     //   1349: checkcast kotlin/jvm/functions/Function2
/*      */     //   1352: astore #19
/*      */     //   1354: aload #11
/*      */     //   1356: invokeinterface endReplaceGroup : ()V
/*      */     //   1361: aload #19
/*      */     //   1363: aload #11
/*      */     //   1365: bipush #14
/*      */     //   1367: iload #15
/*      */     //   1369: bipush #24
/*      */     //   1371: ishr
/*      */     //   1372: iand
/*      */     //   1373: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1376: invokestatic getLocalMenuManager : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*      */     //   1379: checkcast androidx/compose/runtime/CompositionLocal
/*      */     //   1382: astore #20
/*      */     //   1384: bipush #6
/*      */     //   1386: istore #21
/*      */     //   1388: iconst_0
/*      */     //   1389: istore #22
/*      */     //   1391: aload #11
/*      */     //   1393: ldc 2023513938
/*      */     //   1395: ldc 'CC:CompositionLocal.kt#9igjgp'
/*      */     //   1397: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1400: aload #11
/*      */     //   1402: aload #20
/*      */     //   1404: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*      */     //   1409: astore #23
/*      */     //   1411: aload #11
/*      */     //   1413: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1416: aload #23
/*      */     //   1418: checkcast org/jetbrains/jewel/ui/component/MenuManager
/*      */     //   1421: astore #19
/*      */     //   1423: invokestatic getLocalInputModeManager : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*      */     //   1426: checkcast androidx/compose/runtime/CompositionLocal
/*      */     //   1429: astore #21
/*      */     //   1431: iconst_0
/*      */     //   1432: istore #22
/*      */     //   1434: iconst_0
/*      */     //   1435: istore #23
/*      */     //   1437: aload #11
/*      */     //   1439: ldc 2023513938
/*      */     //   1441: ldc 'CC:CompositionLocal.kt#9igjgp'
/*      */     //   1443: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1446: aload #11
/*      */     //   1448: aload #21
/*      */     //   1450: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*      */     //   1455: astore #24
/*      */     //   1457: aload #11
/*      */     //   1459: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1462: aload #24
/*      */     //   1464: checkcast androidx/compose/ui/input/InputModeManager
/*      */     //   1467: astore #20
/*      */     //   1469: aload_2
/*      */     //   1470: aload #18
/*      */     //   1472: invokestatic focusRequester : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;
/*      */     //   1475: astore #21
/*      */     //   1477: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*      */     //   1480: invokevirtual getButton-o7Vup1c : ()I
/*      */     //   1483: istore #22
/*      */     //   1485: aload #21
/*      */     //   1487: iload_0
/*      */     //   1488: aload #8
/*      */     //   1490: aconst_null
/*      */     //   1491: iload_3
/*      */     //   1492: iload #22
/*      */     //   1494: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*      */     //   1497: aload #11
/*      */     //   1499: ldc_w -1097998627
/*      */     //   1502: invokeinterface startReplaceGroup : (I)V
/*      */     //   1507: aload #11
/*      */     //   1509: astore #24
/*      */     //   1511: iload #15
/*      */     //   1513: bipush #112
/*      */     //   1515: iand
/*      */     //   1516: bipush #32
/*      */     //   1518: if_icmpne -> 1525
/*      */     //   1521: iconst_1
/*      */     //   1522: goto -> 1526
/*      */     //   1525: iconst_0
/*      */     //   1526: aload #11
/*      */     //   1528: aload #19
/*      */     //   1530: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1535: ior
/*      */     //   1536: aload #11
/*      */     //   1538: aload #20
/*      */     //   1540: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1545: ior
/*      */     //   1546: istore #25
/*      */     //   1548: nop
/*      */     //   1549: iconst_0
/*      */     //   1550: istore #26
/*      */     //   1552: aload #24
/*      */     //   1554: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1559: astore #27
/*      */     //   1561: iconst_0
/*      */     //   1562: istore #28
/*      */     //   1564: iload #25
/*      */     //   1566: ifne -> 1580
/*      */     //   1569: aload #27
/*      */     //   1571: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1574: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1577: if_acmpne -> 1637
/*      */     //   1580: astore #62
/*      */     //   1582: istore #61
/*      */     //   1584: astore #60
/*      */     //   1586: astore #59
/*      */     //   1588: istore #58
/*      */     //   1590: astore #57
/*      */     //   1592: iconst_0
/*      */     //   1593: istore #29
/*      */     //   1595: aload_1
/*      */     //   1596: aload #19
/*      */     //   1598: aload #20
/*      */     //   1600: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/component/MenuManager;Landroidx/compose/ui/input/InputModeManager;)Lkotlin/jvm/functions/Function0;
/*      */     //   1605: astore #63
/*      */     //   1607: aload #57
/*      */     //   1609: iload #58
/*      */     //   1611: aload #59
/*      */     //   1613: aload #60
/*      */     //   1615: iload #61
/*      */     //   1617: aload #62
/*      */     //   1619: aload #63
/*      */     //   1621: astore #30
/*      */     //   1623: aload #24
/*      */     //   1625: aload #30
/*      */     //   1627: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1632: aload #30
/*      */     //   1634: goto -> 1639
/*      */     //   1637: aload #27
/*      */     //   1639: nop
/*      */     //   1640: nop
/*      */     //   1641: nop
/*      */     //   1642: checkcast kotlin/jvm/functions/Function0
/*      */     //   1645: astore #23
/*      */     //   1647: aload #11
/*      */     //   1649: invokeinterface endReplaceGroup : ()V
/*      */     //   1654: aload #23
/*      */     //   1656: invokestatic selectable-O2vRcR0 : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
/*      */     //   1659: fconst_0
/*      */     //   1660: iconst_1
/*      */     //   1661: aconst_null
/*      */     //   1662: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1665: astore #21
/*      */     //   1667: iconst_0
/*      */     //   1668: istore #24
/*      */     //   1670: nop
/*      */     //   1671: iconst_0
/*      */     //   1672: istore #25
/*      */     //   1674: aload #11
/*      */     //   1676: ldc_w 733328855
/*      */     //   1679: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   1682: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1685: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   1688: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   1691: astore #22
/*      */     //   1693: iconst_0
/*      */     //   1694: istore #23
/*      */     //   1696: aload #22
/*      */     //   1698: iload #23
/*      */     //   1700: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1703: astore #26
/*      */     //   1705: bipush #112
/*      */     //   1707: iload #24
/*      */     //   1709: iconst_3
/*      */     //   1710: ishl
/*      */     //   1711: iand
/*      */     //   1712: istore #27
/*      */     //   1714: nop
/*      */     //   1715: iconst_0
/*      */     //   1716: istore #28
/*      */     //   1718: aload #11
/*      */     //   1720: ldc_w -1323940314
/*      */     //   1723: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   1726: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1729: aload #11
/*      */     //   1731: iconst_0
/*      */     //   1732: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   1735: istore #29
/*      */     //   1737: aload #11
/*      */     //   1739: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1744: astore #30
/*      */     //   1746: aload #11
/*      */     //   1748: aload #21
/*      */     //   1750: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   1753: astore #31
/*      */     //   1755: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1758: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   1761: astore #32
/*      */     //   1763: bipush #6
/*      */     //   1765: sipush #896
/*      */     //   1768: iload #27
/*      */     //   1770: bipush #6
/*      */     //   1772: ishl
/*      */     //   1773: iand
/*      */     //   1774: ior
/*      */     //   1775: istore #33
/*      */     //   1777: nop
/*      */     //   1778: iconst_0
/*      */     //   1779: istore #34
/*      */     //   1781: aload #11
/*      */     //   1783: ldc_w -692256719
/*      */     //   1786: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   1789: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1792: aload #11
/*      */     //   1794: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   1799: instanceof androidx/compose/runtime/Applier
/*      */     //   1802: ifne -> 1808
/*      */     //   1805: invokestatic invalidApplier : ()V
/*      */     //   1808: aload #11
/*      */     //   1810: invokeinterface startReusableNode : ()V
/*      */     //   1815: aload #11
/*      */     //   1817: invokeinterface getInserting : ()Z
/*      */     //   1822: ifeq -> 1837
/*      */     //   1825: aload #11
/*      */     //   1827: aload #32
/*      */     //   1829: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   1834: goto -> 1844
/*      */     //   1837: aload #11
/*      */     //   1839: invokeinterface useNode : ()V
/*      */     //   1844: aload #11
/*      */     //   1846: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   1849: astore #35
/*      */     //   1851: iconst_0
/*      */     //   1852: istore #36
/*      */     //   1854: aload #35
/*      */     //   1856: aload #26
/*      */     //   1858: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1861: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1864: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1867: aload #35
/*      */     //   1869: aload #30
/*      */     //   1871: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1874: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1877: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1880: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1883: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1886: astore #37
/*      */     //   1888: iconst_0
/*      */     //   1889: istore #38
/*      */     //   1891: aload #35
/*      */     //   1893: astore #39
/*      */     //   1895: iconst_0
/*      */     //   1896: istore #40
/*      */     //   1898: aload #39
/*      */     //   1900: invokeinterface getInserting : ()Z
/*      */     //   1905: ifne -> 1926
/*      */     //   1908: aload #39
/*      */     //   1910: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1915: iload #29
/*      */     //   1917: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1920: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   1923: ifne -> 1952
/*      */     //   1926: aload #39
/*      */     //   1928: iload #29
/*      */     //   1930: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1933: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1938: aload #35
/*      */     //   1940: iload #29
/*      */     //   1942: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1945: aload #37
/*      */     //   1947: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1952: nop
/*      */     //   1953: nop
/*      */     //   1954: nop
/*      */     //   1955: aload #35
/*      */     //   1957: aload #31
/*      */     //   1959: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1962: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1965: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1968: nop
/*      */     //   1969: nop
/*      */     //   1970: aload #11
/*      */     //   1972: bipush #14
/*      */     //   1974: iload #33
/*      */     //   1976: bipush #6
/*      */     //   1978: ishr
/*      */     //   1979: iand
/*      */     //   1980: istore #41
/*      */     //   1982: astore #42
/*      */     //   1984: iconst_0
/*      */     //   1985: istore #43
/*      */     //   1987: aload #42
/*      */     //   1989: ldc_w -2146769399
/*      */     //   1992: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   1995: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1998: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   2001: aload #42
/*      */     //   2003: bipush #6
/*      */     //   2005: bipush #112
/*      */     //   2007: iload #24
/*      */     //   2009: bipush #6
/*      */     //   2011: ishr
/*      */     //   2012: iand
/*      */     //   2013: ior
/*      */     //   2014: istore #44
/*      */     //   2016: astore #45
/*      */     //   2018: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   2021: astore #46
/*      */     //   2023: iconst_0
/*      */     //   2024: istore #47
/*      */     //   2026: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   2029: aload #45
/*      */     //   2031: ldc_w -1662772244
/*      */     //   2034: invokeinterface startReplaceGroup : (I)V
/*      */     //   2039: aload #45
/*      */     //   2041: astore #48
/*      */     //   2043: iload #15
/*      */     //   2045: bipush #14
/*      */     //   2047: iand
/*      */     //   2048: iconst_4
/*      */     //   2049: if_icmpne -> 2056
/*      */     //   2052: iconst_1
/*      */     //   2053: goto -> 2057
/*      */     //   2056: iconst_0
/*      */     //   2057: istore #49
/*      */     //   2059: iconst_0
/*      */     //   2060: istore #50
/*      */     //   2062: aload #48
/*      */     //   2064: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   2069: astore #51
/*      */     //   2071: iconst_0
/*      */     //   2072: istore #52
/*      */     //   2074: iload #49
/*      */     //   2076: ifne -> 2090
/*      */     //   2079: aload #51
/*      */     //   2081: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   2084: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   2087: if_acmpne -> 2122
/*      */     //   2090: astore #53
/*      */     //   2092: iconst_0
/*      */     //   2093: istore #54
/*      */     //   2095: iload_0
/*      */     //   2096: aload #18
/*      */     //   2098: <illegal opcode> invoke : (ZLandroidx/compose/ui/focus/FocusRequester;)Lkotlin/jvm/functions/Function1;
/*      */     //   2103: aload #53
/*      */     //   2105: swap
/*      */     //   2106: astore #55
/*      */     //   2108: aload #48
/*      */     //   2110: aload #55
/*      */     //   2112: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   2117: aload #55
/*      */     //   2119: goto -> 2124
/*      */     //   2122: aload #51
/*      */     //   2124: nop
/*      */     //   2125: nop
/*      */     //   2126: nop
/*      */     //   2127: checkcast kotlin/jvm/functions/Function1
/*      */     //   2130: astore #56
/*      */     //   2132: aload #45
/*      */     //   2134: invokeinterface endReplaceGroup : ()V
/*      */     //   2139: aload #56
/*      */     //   2141: aload #45
/*      */     //   2143: bipush #6
/*      */     //   2145: invokestatic DisposableEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*      */     //   2148: aload #9
/*      */     //   2150: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/MenuColors;
/*      */     //   2153: invokevirtual getItemColors : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*      */     //   2156: astore #56
/*      */     //   2158: aload #9
/*      */     //   2160: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   2163: invokevirtual getItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */     //   2166: astore #48
/*      */     //   2168: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*      */     //   2171: aload #56
/*      */     //   2173: aload #17
/*      */     //   2175: invokestatic MenuItem$lambda$37 : (Landroidx/compose/runtime/MutableState;)J
/*      */     //   2178: aload #45
/*      */     //   2180: iconst_0
/*      */     //   2181: invokevirtual contentFor-VIR8D2g : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*      */     //   2184: invokeinterface getValue : ()Ljava/lang/Object;
/*      */     //   2189: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*      */     //   2192: ldc_w 2016063468
/*      */     //   2195: iconst_1
/*      */     //   2196: new org/jetbrains/jewel/ui/component/MenuKt$MenuItem$5$2
/*      */     //   2199: dup
/*      */     //   2200: aload #56
/*      */     //   2202: aload #48
/*      */     //   2204: aload #17
/*      */     //   2206: iload #6
/*      */     //   2208: aload #9
/*      */     //   2210: aload #4
/*      */     //   2212: iload #7
/*      */     //   2214: aload #5
/*      */     //   2216: aload #10
/*      */     //   2218: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;Landroidx/compose/runtime/MutableState;ZLorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lorg/jetbrains/jewel/ui/icon/IconKey;ZLjava/util/Set;Lkotlin/jvm/functions/Function2;)V
/*      */     //   2221: aload #45
/*      */     //   2223: bipush #54
/*      */     //   2225: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   2228: checkcast kotlin/jvm/functions/Function2
/*      */     //   2231: aload #45
/*      */     //   2233: bipush #48
/*      */     //   2235: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*      */     //   2238: ior
/*      */     //   2239: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   2242: nop
/*      */     //   2243: aload #42
/*      */     //   2245: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2248: aload #11
/*      */     //   2250: invokeinterface endNode : ()V
/*      */     //   2255: aload #11
/*      */     //   2257: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2260: nop
/*      */     //   2261: aload #11
/*      */     //   2263: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2266: nop
/*      */     //   2267: aload #11
/*      */     //   2269: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2272: nop
/*      */     //   2273: invokestatic isTraceInProgress : ()Z
/*      */     //   2276: ifeq -> 2292
/*      */     //   2279: invokestatic traceEventEnd : ()V
/*      */     //   2282: goto -> 2292
/*      */     //   2285: aload #11
/*      */     //   2287: invokeinterface skipToGroupEnd : ()V
/*      */     //   2292: aload #11
/*      */     //   2294: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   2299: dup
/*      */     //   2300: ifnull -> 2340
/*      */     //   2303: iload_0
/*      */     //   2304: aload_1
/*      */     //   2305: aload_2
/*      */     //   2306: iload_3
/*      */     //   2307: aload #4
/*      */     //   2309: aload #5
/*      */     //   2311: iload #6
/*      */     //   2313: iload #7
/*      */     //   2315: aload #8
/*      */     //   2317: aload #9
/*      */     //   2319: aload #10
/*      */     //   2321: iload #12
/*      */     //   2323: iload #13
/*      */     //   2325: iload #14
/*      */     //   2327: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function2;III)Lkotlin/jvm/functions/Function2;
/*      */     //   2332: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   2337: goto -> 2341
/*      */     //   2340: pop
/*      */     //   2341: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #342	-> 14
/*      */     //   #333	-> 676
/*      */     //   #334	-> 691
/*      */     //   #339	-> 702
/*      */     //   #955	-> 722
/*      */     //   #956	-> 734
/*      */     //   #957	-> 745
/*      */     //   #339	-> 748
/*      */     //   #957	-> 751
/*      */     //   #958	-> 753
/*      */     //   #959	-> 762
/*      */     //   #960	-> 767
/*      */     //   #956	-> 769
/*      */     //   #955	-> 770
/*      */     //   #955	-> 771
/*      */     //   #339	-> 772
/*      */     //   #340	-> 797
/*      */     //   #342	-> 867
/*      */     //   #344	-> 903
/*      */     //   #961	-> 907
/*      */     //   #962	-> 919
/*      */     //   #963	-> 935
/*      */     //   #344	-> 938
/*      */     //   #963	-> 962
/*      */     //   #964	-> 964
/*      */     //   #965	-> 973
/*      */     //   #966	-> 978
/*      */     //   #962	-> 980
/*      */     //   #961	-> 981
/*      */     //   #961	-> 982
/*      */     //   #344	-> 983
/*      */     //   #343	-> 997
/*      */     //   #346	-> 1047
/*      */     //   #967	-> 1051
/*      */     //   #968	-> 1063
/*      */     //   #969	-> 1079
/*      */     //   #346	-> 1082
/*      */     //   #969	-> 1107
/*      */     //   #970	-> 1109
/*      */     //   #971	-> 1118
/*      */     //   #972	-> 1123
/*      */     //   #968	-> 1125
/*      */     //   #967	-> 1126
/*      */     //   #967	-> 1127
/*      */     //   #348	-> 1153
/*      */     //   #973	-> 1157
/*      */     //   #974	-> 1169
/*      */     //   #975	-> 1180
/*      */     //   #348	-> 1183
/*      */     //   #975	-> 1190
/*      */     //   #976	-> 1192
/*      */     //   #977	-> 1201
/*      */     //   #978	-> 1206
/*      */     //   #974	-> 1208
/*      */     //   #973	-> 1209
/*      */     //   #973	-> 1210
/*      */     //   #348	-> 1211
/*      */     //   #350	-> 1227
/*      */     //   #979	-> 1275
/*      */     //   #980	-> 1287
/*      */     //   #981	-> 1303
/*      */     //   #350	-> 1308
/*      */     //   #981	-> 1328
/*      */     //   #982	-> 1330
/*      */     //   #983	-> 1339
/*      */     //   #984	-> 1344
/*      */     //   #980	-> 1346
/*      */     //   #979	-> 1347
/*      */     //   #979	-> 1348
/*      */     //   #350	-> 1349
/*      */     //   #369	-> 1376
/*      */     //   #985	-> 1397
/*      */     //   #369	-> 1418
/*      */     //   #370	-> 1423
/*      */     //   #986	-> 1443
/*      */     //   #370	-> 1464
/*      */     //   #374	-> 1469
/*      */     //   #375	-> 1470
/*      */     //   #383	-> 1477
/*      */     //   #375	-> 1485
/*      */     //   #377	-> 1487
/*      */     //   #384	-> 1488
/*      */     //   #385	-> 1490
/*      */     //   #382	-> 1491
/*      */     //   #383	-> 1492
/*      */     //   #378	-> 1548
/*      */     //   #987	-> 1552
/*      */     //   #988	-> 1564
/*      */     //   #989	-> 1580
/*      */     //   #378	-> 1595
/*      */     //   #989	-> 1621
/*      */     //   #990	-> 1623
/*      */     //   #991	-> 1632
/*      */     //   #992	-> 1637
/*      */     //   #988	-> 1639
/*      */     //   #987	-> 1640
/*      */     //   #987	-> 1641
/*      */     //   #378	-> 1642
/*      */     //   #376	-> 1656
/*      */     //   #387	-> 1659
/*      */     //   #372	-> 1670
/*      */     //   #993	-> 1682
/*      */     //   #994	-> 1685
/*      */     //   #995	-> 1693
/*      */     //   #998	-> 1696
/*      */     //   #999	-> 1714
/*      */     //   #1000	-> 1726
/*      */     //   #1001	-> 1732
/*      */     //   #1002	-> 1739
/*      */     //   #1003	-> 1748
/*      */     //   #1005	-> 1755
/*      */     //   #1004	-> 1777
/*      */     //   #1006	-> 1789
/*      */     //   #1007	-> 1792
/*      */     //   #1008	-> 1810
/*      */     //   #1009	-> 1815
/*      */     //   #1010	-> 1827
/*      */     //   #1012	-> 1839
/*      */     //   #1014	-> 1844
/*      */     //   #1015	-> 1854
/*      */     //   #1016	-> 1867
/*      */     //   #1018	-> 1880
/*      */     //   #1019	-> 1891
/*      */     //   #1020	-> 1898
/*      */     //   #1021	-> 1926
/*      */     //   #1022	-> 1938
/*      */     //   #1024	-> 1952
/*      */     //   #1019	-> 1953
/*      */     //   #1024	-> 1954
/*      */     //   #1025	-> 1955
/*      */     //   #1026	-> 1968
/*      */     //   #1014	-> 1969
/*      */     //   #1027	-> 1970
/*      */     //   #1028	-> 1995
/*      */     //   #389	-> 2026
/*      */     //   #1029	-> 2062
/*      */     //   #1030	-> 2074
/*      */     //   #1031	-> 2090
/*      */     //   #389	-> 2095
/*      */     //   #1031	-> 2106
/*      */     //   #1032	-> 2108
/*      */     //   #1033	-> 2117
/*      */     //   #1034	-> 2122
/*      */     //   #1030	-> 2124
/*      */     //   #1029	-> 2125
/*      */     //   #1029	-> 2126
/*      */     //   #389	-> 2127
/*      */     //   #397	-> 2148
/*      */     //   #398	-> 2158
/*      */     //   #400	-> 2168
/*      */     //   #440	-> 2242
/*      */     //   #1028	-> 2243
/*      */     //   #1027	-> 2248
/*      */     //   #1035	-> 2250
/*      */     //   #1006	-> 2257
/*      */     //   #1036	-> 2260
/*      */     //   #1000	-> 2263
/*      */     //   #1037	-> 2266
/*      */     //   #993	-> 2269
/*      */     //   #1038	-> 2272
/*      */     //   #441	-> 2285
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   748	3	23	$i$a$-cache-MenuKt$MenuItem$1	I
/*      */     //   753	11	23	value$iv	Ljava/lang/Object;
/*      */     //   734	36	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   731	39	21	it$iv	Ljava/lang/Object;
/*      */     //   722	50	20	$i$f$cache	I
/*      */     //   719	53	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   719	53	19	invalid$iv	Z
/*      */     //   938	24	24	$i$a$-cache-MenuKt$MenuItem$itemState$2	I
/*      */     //   964	11	25	value$iv	Ljava/lang/Object;
/*      */     //   919	62	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   916	65	22	it$iv	Ljava/lang/Object;
/*      */     //   907	76	21	$i$f$cache	I
/*      */     //   904	79	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   904	79	20	invalid$iv	Z
/*      */     //   1082	22	23	$i$a$-cache-MenuKt$MenuItem$2	I
/*      */     //   1109	11	24	value$iv	Ljava/lang/Object;
/*      */     //   1063	63	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1060	66	21	it$iv	Ljava/lang/Object;
/*      */     //   1051	77	20	$i$f$cache	I
/*      */     //   1048	80	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1048	80	19	invalid$iv	Z
/*      */     //   1183	7	25	$i$a$-cache-MenuKt$MenuItem$focusRequester$1	I
/*      */     //   1192	11	25	value$iv	Ljava/lang/Object;
/*      */     //   1169	40	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1166	43	23	it$iv	Ljava/lang/Object;
/*      */     //   1157	54	22	$i$f$cache	I
/*      */     //   1154	57	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1154	57	21	invalid$iv	Z
/*      */     //   1308	17	25	$i$a$-cache-MenuKt$MenuItem$3	I
/*      */     //   1330	11	26	value$iv	Ljava/lang/Object;
/*      */     //   1287	60	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1284	63	23	it$iv	Ljava/lang/Object;
/*      */     //   1275	74	22	$i$f$cache	I
/*      */     //   1272	77	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1272	77	21	invalid$iv	Z
/*      */     //   1391	27	22	$i$f$getCurrent	I
/*      */     //   1388	30	20	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*      */     //   1388	30	21	$changed$iv	I
/*      */     //   1437	27	23	$i$f$getCurrent	I
/*      */     //   1434	30	21	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*      */     //   1434	30	22	$changed$iv	I
/*      */     //   1595	10	29	$i$a$-cache-MenuKt$MenuItem$4	I
/*      */     //   1623	11	30	value$iv	Ljava/lang/Object;
/*      */     //   1564	76	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1561	79	27	it$iv	Ljava/lang/Object;
/*      */     //   1552	90	26	$i$f$cache	I
/*      */     //   1549	93	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1549	93	25	invalid$iv	Z
/*      */     //   2095	8	54	$i$a$-cache-MenuKt$MenuItem$5$1	I
/*      */     //   2108	11	55	value$iv	Ljava/lang/Object;
/*      */     //   2074	51	52	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   2071	54	51	it$iv	Ljava/lang/Object;
/*      */     //   2062	65	50	$i$f$cache	I
/*      */     //   2059	68	48	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   2059	68	49	invalid$iv	Z
/*      */     //   2026	217	47	$i$a$-Box-MenuKt$MenuItem$5	I
/*      */     //   2158	85	56	itemColors	Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*      */     //   2168	75	48	itemMetrics	Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */     //   2023	220	46	$this$MenuItem_u24lambda_u2447	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   2023	220	45	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   2023	220	44	$changed	I
/*      */     //   1987	261	43	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   1984	264	42	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1984	264	41	$changed$iv	I
/*      */     //   1898	55	40	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   1895	58	39	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1891	64	38	$i$f$set-impl	I
/*      */     //   1888	67	37	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   1854	115	36	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   1851	118	35	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1781	480	34	$i$f$ReusableComposeNode	I
/*      */     //   1778	483	32	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   1778	483	33	$changed$iv$iv$iv	I
/*      */     //   1718	549	28	$i$f$Layout	I
/*      */     //   1737	530	29	compositeKeyHash$iv$iv	I
/*      */     //   1746	521	30	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1755	512	31	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1715	552	27	$changed$iv$iv	I
/*      */     //   1674	599	25	$i$f$Box	I
/*      */     //   1705	568	26	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1671	602	21	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1693	580	22	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   1696	577	23	propagateMinConstraints$iv	Z
/*      */     //   1671	602	24	$changed$iv	I
/*      */     //   999	1283	17	itemState$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   1227	1055	18	focusRequester	Landroidx/compose/ui/focus/FocusRequester;
/*      */     //   1423	859	19	menuManager	Lorg/jetbrains/jewel/ui/component/MenuManager;
/*      */     //   1469	813	20	localInputModeManager	Landroidx/compose/ui/input/InputModeManager;
/*      */     //   30	2312	15	$dirty	I
/*      */     //   34	2308	16	$dirty1	I
/*      */     //   0	2342	0	selected	Z
/*      */     //   0	2342	1	onClick	Lkotlin/jvm/functions/Function0;
/*      */     //   0	2342	2	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	2342	3	enabled	Z
/*      */     //   0	2342	4	iconKey	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*      */     //   0	2342	5	keybinding	Ljava/util/Set;
/*      */     //   0	2342	6	canShowIcon	Z
/*      */     //   0	2342	7	canShowKeybinding	Z
/*      */     //   0	2342	8	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   0	2342	9	style	Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   0	2342	10	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	2342	11	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	2342	12	$changed	I
/* 1184 */     //   0	2342	13	$changed1	I } private static final long MenuItem$lambda$37(MutableState $itemState$delegate) { State state = (State)$itemState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((MenuItemState)state.getValue()).unbox-impl(); } private static final void MenuItem$lambda$38(MutableState $itemState$delegate, long <set-?>) { MutableState mutableState = $itemState$delegate; Object object1 = null, object2 = null; Object value$iv = MenuItemState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 1185 */     mutableState.setValue(value$iv); } @DebugMetadata(f = "Menu.kt", l = {351}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.MenuKt$MenuItem$3$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class MenuKt$MenuItem$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label; MenuKt$MenuItem$3$1(MutableInteractionSource $interactionSource, FocusRequester $focusRequester, MutableState<MenuItemState> $itemState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusRequester, this.$itemState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, true, false, false, 55, null)); this.$focusRequester.requestFocus(); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, true, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }
/* 1187 */               (Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusRequester, this.$itemState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, true, false, false, 55, null)); this.$focusRequester.requestFocus(); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, true, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { MenuKt.MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super MenuKt$MenuItem$3$1> $completion) { return (Continuation<Unit>)new MenuKt$MenuItem$3$1(this.$interactionSource, this.$focusRequester, this.$itemState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MenuKt$MenuItem$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final Unit MenuItem$lambda$43$lambda$42(Function0 $onClick, MenuManager $menuManager, InputModeManager $localInputModeManager) { $onClick.invoke(); $menuManager.closeAll-HMVJIwE($localInputModeManager.getInputMode-aOaMEAU(), true); return Unit.INSTANCE; } private static final DisposableEffectResult MenuItem$lambda$47$lambda$46$lambda$45(boolean $selected, FocusRequester $focusRequester, DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); if ($selected) $focusRequester.requestFocus();  DisposableEffectScope this_$iv = $this$DisposableEffect; int $i$f$onDispose = 0; return new MenuKt$MenuItem$lambda$47$lambda$46$lambda$45$$inlined$onDispose$1(); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$MenuItem$5$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,706:1\n149#2:707\n99#3,3:708\n102#3:739\n106#3:789\n79#4,6:711\n86#4,4:726\n90#4,2:736\n79#4,6:747\n86#4,4:762\n90#4,2:772\n94#4:778\n94#4:788\n368#5,9:717\n377#5:738\n368#5,9:753\n377#5:774\n378#5,2:776\n378#5,2:786\n4034#6,6:730\n4034#6,6:766\n71#7:740\n68#7,6:741\n74#7:775\n78#7:779\n1225#8,6:780\n81#9:790\n*S KotlinDebug\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$MenuItem$5$2\n*L\n409#1:707\n403#1:708,3\n403#1:739\n403#1:789\n403#1:711,6\n403#1:726,4\n403#1:736,2\n421#1:747,6\n421#1:762,4\n421#1:772,2\n421#1:778\n403#1:788\n403#1:717,9\n403#1:738\n421#1:753,9\n421#1:774\n421#1:776,2\n403#1:786,2\n403#1:730,6\n421#1:766,6\n421#1:740\n421#1:741,6\n421#1:775\n421#1:779\n425#1:780,6\n401#1:790\n*E\n"}) static final class MenuKt$MenuItem$5$2 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { // Byte code:
/*      */       //   0: iload_2
/*      */       //   1: iconst_3
/*      */       //   2: iand
/*      */       //   3: iconst_2
/*      */       //   4: if_icmpne -> 16
/*      */       //   7: aload_1
/*      */       //   8: invokeinterface getSkipping : ()Z
/*      */       //   13: ifne -> 1383
/*      */       //   16: invokestatic isTraceInProgress : ()Z
/*      */       //   19: ifeq -> 31
/*      */       //   22: ldc 2016063468
/*      */       //   24: iload_2
/*      */       //   25: iconst_m1
/*      */       //   26: ldc 'org.jetbrains.jewel.ui.component.MenuItem.<anonymous>.<anonymous> (Menu.kt:400)'
/*      */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */       //   31: aload_0
/*      */       //   32: getfield $itemColors : Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*      */       //   35: aload_0
/*      */       //   36: getfield $itemState$delegate : Landroidx/compose/runtime/MutableState;
/*      */       //   39: invokestatic access$MenuItem$lambda$37 : (Landroidx/compose/runtime/MutableState;)J
/*      */       //   42: aload_1
/*      */       //   43: iconst_0
/*      */       //   44: invokevirtual backgroundFor-VIR8D2g : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*      */       //   47: astore_3
/*      */       //   48: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */       //   51: checkcast androidx/compose/ui/Modifier
/*      */       //   54: fconst_0
/*      */       //   55: iconst_1
/*      */       //   56: aconst_null
/*      */       //   57: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */       //   60: fconst_0
/*      */       //   61: aload_0
/*      */       //   62: getfield $itemMetrics : Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */       //   65: invokevirtual getMinHeight-D9Ej5fM : ()F
/*      */       //   68: iconst_1
/*      */       //   69: aconst_null
/*      */       //   70: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */       //   73: aload_0
/*      */       //   74: getfield $itemMetrics : Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */       //   77: aload_3
/*      */       //   78: invokestatic invoke$lambda$0 : (Landroidx/compose/runtime/State;)J
/*      */       //   81: invokestatic access$drawItemBackground-mxwnekA : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;J)Landroidx/compose/ui/Modifier;
/*      */       //   84: aload_0
/*      */       //   85: getfield $itemMetrics : Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */       //   88: invokevirtual getContentPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*      */       //   91: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*      */       //   94: astore #4
/*      */       //   96: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*      */       //   99: iconst_4
/*      */       //   100: istore #5
/*      */       //   102: iconst_0
/*      */       //   103: istore #6
/*      */       //   105: iload #5
/*      */       //   107: i2f
/*      */       //   108: invokestatic constructor-impl : (F)F
/*      */       //   111: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*      */       //   114: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*      */       //   117: astore #5
/*      */       //   119: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */       //   122: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*      */       //   125: astore #6
/*      */       //   127: aload_0
/*      */       //   128: getfield $canShowIcon : Z
/*      */       //   131: istore #7
/*      */       //   133: aload_0
/*      */       //   134: getfield $style : Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */       //   137: astore #8
/*      */       //   139: aload_0
/*      */       //   140: getfield $iconKey : Lorg/jetbrains/jewel/ui/icon/IconKey;
/*      */       //   143: astore #9
/*      */       //   145: aload_0
/*      */       //   146: getfield $canShowKeybinding : Z
/*      */       //   149: istore #10
/*      */       //   151: aload_0
/*      */       //   152: getfield $keybinding : Ljava/util/Set;
/*      */       //   155: astore #11
/*      */       //   157: aload_0
/*      */       //   158: getfield $itemColors : Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*      */       //   161: astore #12
/*      */       //   163: aload_0
/*      */       //   164: getfield $content : Lkotlin/jvm/functions/Function2;
/*      */       //   167: astore #13
/*      */       //   169: aload_0
/*      */       //   170: getfield $itemState$delegate : Landroidx/compose/runtime/MutableState;
/*      */       //   173: astore #14
/*      */       //   175: sipush #432
/*      */       //   178: istore #15
/*      */       //   180: iconst_0
/*      */       //   181: istore #16
/*      */       //   183: aload_1
/*      */       //   184: ldc 693286680
/*      */       //   186: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*      */       //   188: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   191: aload #5
/*      */       //   193: aload #6
/*      */       //   195: aload_1
/*      */       //   196: bipush #14
/*      */       //   198: iload #15
/*      */       //   200: iconst_3
/*      */       //   201: ishr
/*      */       //   202: iand
/*      */       //   203: bipush #112
/*      */       //   205: iload #15
/*      */       //   207: iconst_3
/*      */       //   208: ishr
/*      */       //   209: iand
/*      */       //   210: ior
/*      */       //   211: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */       //   214: astore #17
/*      */       //   216: bipush #112
/*      */       //   218: iload #15
/*      */       //   220: iconst_3
/*      */       //   221: ishl
/*      */       //   222: iand
/*      */       //   223: istore #18
/*      */       //   225: nop
/*      */       //   226: iconst_0
/*      */       //   227: istore #19
/*      */       //   229: aload_1
/*      */       //   230: ldc -1323940314
/*      */       //   232: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */       //   234: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   237: aload_1
/*      */       //   238: iconst_0
/*      */       //   239: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */       //   242: istore #20
/*      */       //   244: aload_1
/*      */       //   245: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */       //   250: astore #21
/*      */       //   252: aload_1
/*      */       //   253: aload #4
/*      */       //   255: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */       //   258: astore #22
/*      */       //   260: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   263: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */       //   266: astore #23
/*      */       //   268: bipush #6
/*      */       //   270: sipush #896
/*      */       //   273: iload #18
/*      */       //   275: bipush #6
/*      */       //   277: ishl
/*      */       //   278: iand
/*      */       //   279: ior
/*      */       //   280: istore #24
/*      */       //   282: nop
/*      */       //   283: iconst_0
/*      */       //   284: istore #25
/*      */       //   286: aload_1
/*      */       //   287: ldc -692256719
/*      */       //   289: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */       //   291: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   294: aload_1
/*      */       //   295: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */       //   300: instanceof androidx/compose/runtime/Applier
/*      */       //   303: ifne -> 309
/*      */       //   306: invokestatic invalidApplier : ()V
/*      */       //   309: aload_1
/*      */       //   310: invokeinterface startReusableNode : ()V
/*      */       //   315: aload_1
/*      */       //   316: invokeinterface getInserting : ()Z
/*      */       //   321: ifeq -> 335
/*      */       //   324: aload_1
/*      */       //   325: aload #23
/*      */       //   327: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */       //   332: goto -> 341
/*      */       //   335: aload_1
/*      */       //   336: invokeinterface useNode : ()V
/*      */       //   341: aload_1
/*      */       //   342: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */       //   345: astore #26
/*      */       //   347: iconst_0
/*      */       //   348: istore #27
/*      */       //   350: aload #26
/*      */       //   352: aload #17
/*      */       //   354: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   357: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */       //   360: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */       //   363: aload #26
/*      */       //   365: aload #21
/*      */       //   367: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   370: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */       //   373: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */       //   376: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   379: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */       //   382: astore #28
/*      */       //   384: iconst_0
/*      */       //   385: istore #29
/*      */       //   387: aload #26
/*      */       //   389: astore #30
/*      */       //   391: iconst_0
/*      */       //   392: istore #31
/*      */       //   394: aload #30
/*      */       //   396: invokeinterface getInserting : ()Z
/*      */       //   401: ifne -> 422
/*      */       //   404: aload #30
/*      */       //   406: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */       //   411: iload #20
/*      */       //   413: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */       //   416: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   419: ifne -> 448
/*      */       //   422: aload #30
/*      */       //   424: iload #20
/*      */       //   426: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */       //   429: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */       //   434: aload #26
/*      */       //   436: iload #20
/*      */       //   438: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */       //   441: aload #28
/*      */       //   443: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */       //   448: nop
/*      */       //   449: nop
/*      */       //   450: nop
/*      */       //   451: aload #26
/*      */       //   453: aload #22
/*      */       //   455: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   458: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */       //   461: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */       //   464: nop
/*      */       //   465: nop
/*      */       //   466: aload_1
/*      */       //   467: bipush #14
/*      */       //   469: iload #24
/*      */       //   471: bipush #6
/*      */       //   473: ishr
/*      */       //   474: iand
/*      */       //   475: istore #32
/*      */       //   477: astore #33
/*      */       //   479: iconst_0
/*      */       //   480: istore #34
/*      */       //   482: aload #33
/*      */       //   484: ldc_w -407840262
/*      */       //   487: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*      */       //   490: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   493: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*      */       //   496: aload #33
/*      */       //   498: bipush #6
/*      */       //   500: bipush #112
/*      */       //   502: iload #15
/*      */       //   504: bipush #6
/*      */       //   506: ishr
/*      */       //   507: iand
/*      */       //   508: ior
/*      */       //   509: istore #35
/*      */       //   511: astore #36
/*      */       //   513: checkcast androidx/compose/foundation/layout/RowScope
/*      */       //   516: astore #37
/*      */       //   518: iconst_0
/*      */       //   519: istore #38
/*      */       //   521: aload #36
/*      */       //   523: ldc_w -182433379
/*      */       //   526: invokeinterface startReplaceGroup : (I)V
/*      */       //   531: iload #7
/*      */       //   533: ifeq -> 628
/*      */       //   536: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */       //   539: checkcast androidx/compose/ui/Modifier
/*      */       //   542: aload #8
/*      */       //   544: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */       //   547: invokevirtual getItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */       //   550: invokevirtual getIconSize-D9Ej5fM : ()F
/*      */       //   553: invokestatic size-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*      */       //   556: astore #39
/*      */       //   558: aload #9
/*      */       //   560: ifnull -> 603
/*      */       //   563: aload #36
/*      */       //   565: ldc_w -1360327362
/*      */       //   568: invokeinterface startReplaceGroup : (I)V
/*      */       //   573: aload #9
/*      */       //   575: aconst_null
/*      */       //   576: aload #39
/*      */       //   578: aconst_null
/*      */       //   579: lconst_0
/*      */       //   580: iconst_0
/*      */       //   581: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*      */       //   584: aload #36
/*      */       //   586: bipush #48
/*      */       //   588: bipush #24
/*      */       //   590: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*      */       //   593: aload #36
/*      */       //   595: invokeinterface endReplaceGroup : ()V
/*      */       //   600: goto -> 628
/*      */       //   603: aload #36
/*      */       //   605: ldc_w -1360204695
/*      */       //   608: invokeinterface startReplaceGroup : (I)V
/*      */       //   613: aload #39
/*      */       //   615: aload #36
/*      */       //   617: iconst_0
/*      */       //   618: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*      */       //   621: aload #36
/*      */       //   623: invokeinterface endReplaceGroup : ()V
/*      */       //   628: aload #36
/*      */       //   630: invokeinterface endReplaceGroup : ()V
/*      */       //   635: aload #37
/*      */       //   637: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */       //   640: checkcast androidx/compose/ui/Modifier
/*      */       //   643: fconst_1
/*      */       //   644: iconst_1
/*      */       //   645: invokeinterface weight : (Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;
/*      */       //   650: astore #39
/*      */       //   652: iconst_0
/*      */       //   653: istore #40
/*      */       //   655: iconst_0
/*      */       //   656: istore #41
/*      */       //   658: aload #36
/*      */       //   660: ldc_w 733328855
/*      */       //   663: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */       //   666: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   669: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */       //   672: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */       //   675: astore #42
/*      */       //   677: iconst_0
/*      */       //   678: istore #43
/*      */       //   680: aload #42
/*      */       //   682: iload #43
/*      */       //   684: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */       //   687: astore #44
/*      */       //   689: bipush #112
/*      */       //   691: iload #40
/*      */       //   693: iconst_3
/*      */       //   694: ishl
/*      */       //   695: iand
/*      */       //   696: istore #45
/*      */       //   698: nop
/*      */       //   699: iconst_0
/*      */       //   700: istore #46
/*      */       //   702: aload #36
/*      */       //   704: ldc -1323940314
/*      */       //   706: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */       //   708: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   711: aload #36
/*      */       //   713: iconst_0
/*      */       //   714: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */       //   717: istore #47
/*      */       //   719: aload #36
/*      */       //   721: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */       //   726: astore #48
/*      */       //   728: aload #36
/*      */       //   730: aload #39
/*      */       //   732: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */       //   735: astore #49
/*      */       //   737: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   740: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */       //   743: astore #50
/*      */       //   745: bipush #6
/*      */       //   747: sipush #896
/*      */       //   750: iload #45
/*      */       //   752: bipush #6
/*      */       //   754: ishl
/*      */       //   755: iand
/*      */       //   756: ior
/*      */       //   757: istore #51
/*      */       //   759: nop
/*      */       //   760: iconst_0
/*      */       //   761: istore #52
/*      */       //   763: aload #36
/*      */       //   765: ldc -692256719
/*      */       //   767: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */       //   769: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   772: aload #36
/*      */       //   774: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */       //   779: instanceof androidx/compose/runtime/Applier
/*      */       //   782: ifne -> 788
/*      */       //   785: invokestatic invalidApplier : ()V
/*      */       //   788: aload #36
/*      */       //   790: invokeinterface startReusableNode : ()V
/*      */       //   795: aload #36
/*      */       //   797: invokeinterface getInserting : ()Z
/*      */       //   802: ifeq -> 817
/*      */       //   805: aload #36
/*      */       //   807: aload #50
/*      */       //   809: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */       //   814: goto -> 824
/*      */       //   817: aload #36
/*      */       //   819: invokeinterface useNode : ()V
/*      */       //   824: aload #36
/*      */       //   826: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */       //   829: astore #53
/*      */       //   831: iconst_0
/*      */       //   832: istore #54
/*      */       //   834: aload #53
/*      */       //   836: aload #44
/*      */       //   838: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   841: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */       //   844: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */       //   847: aload #53
/*      */       //   849: aload #48
/*      */       //   851: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   854: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */       //   857: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */       //   860: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   863: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */       //   866: astore #55
/*      */       //   868: iconst_0
/*      */       //   869: istore #56
/*      */       //   871: aload #53
/*      */       //   873: astore #57
/*      */       //   875: iconst_0
/*      */       //   876: istore #58
/*      */       //   878: aload #57
/*      */       //   880: invokeinterface getInserting : ()Z
/*      */       //   885: ifne -> 906
/*      */       //   888: aload #57
/*      */       //   890: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */       //   895: iload #47
/*      */       //   897: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */       //   900: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   903: ifne -> 932
/*      */       //   906: aload #57
/*      */       //   908: iload #47
/*      */       //   910: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */       //   913: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */       //   918: aload #53
/*      */       //   920: iload #47
/*      */       //   922: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */       //   925: aload #55
/*      */       //   927: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */       //   932: nop
/*      */       //   933: nop
/*      */       //   934: nop
/*      */       //   935: aload #53
/*      */       //   937: aload #49
/*      */       //   939: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */       //   942: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */       //   945: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */       //   948: nop
/*      */       //   949: nop
/*      */       //   950: aload #36
/*      */       //   952: bipush #14
/*      */       //   954: iload #51
/*      */       //   956: bipush #6
/*      */       //   958: ishr
/*      */       //   959: iand
/*      */       //   960: istore #59
/*      */       //   962: astore #60
/*      */       //   964: iconst_0
/*      */       //   965: istore #61
/*      */       //   967: aload #60
/*      */       //   969: ldc_w -2146769399
/*      */       //   972: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */       //   975: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   978: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */       //   981: aload #60
/*      */       //   983: bipush #6
/*      */       //   985: bipush #112
/*      */       //   987: iload #40
/*      */       //   989: bipush #6
/*      */       //   991: ishr
/*      */       //   992: iand
/*      */       //   993: ior
/*      */       //   994: istore #62
/*      */       //   996: astore #63
/*      */       //   998: checkcast androidx/compose/foundation/layout/BoxScope
/*      */       //   1001: astore #64
/*      */       //   1003: iconst_0
/*      */       //   1004: istore #65
/*      */       //   1006: aload #13
/*      */       //   1008: aload #63
/*      */       //   1010: iconst_0
/*      */       //   1011: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */       //   1014: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   1019: pop
/*      */       //   1020: aload #60
/*      */       //   1022: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   1025: aload #36
/*      */       //   1027: invokeinterface endNode : ()V
/*      */       //   1032: aload #36
/*      */       //   1034: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   1037: nop
/*      */       //   1038: aload #36
/*      */       //   1040: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   1043: nop
/*      */       //   1044: aload #36
/*      */       //   1046: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   1049: nop
/*      */       //   1050: aload #36
/*      */       //   1052: ldc_w -182418353
/*      */       //   1055: invokeinterface startReplaceGroup : (I)V
/*      */       //   1060: iload #10
/*      */       //   1062: ifeq -> 1337
/*      */       //   1065: aload #36
/*      */       //   1067: ldc_w -182415854
/*      */       //   1070: invokeinterface startReplaceGroup : (I)V
/*      */       //   1075: aload #36
/*      */       //   1077: astore #43
/*      */       //   1079: aload #36
/*      */       //   1081: aload #11
/*      */       //   1083: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */       //   1088: istore #40
/*      */       //   1090: iconst_0
/*      */       //   1091: istore #41
/*      */       //   1093: aload #43
/*      */       //   1095: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */       //   1100: astore #44
/*      */       //   1102: iconst_0
/*      */       //   1103: istore #45
/*      */       //   1105: iload #40
/*      */       //   1107: ifne -> 1121
/*      */       //   1110: aload #44
/*      */       //   1112: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */       //   1115: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */       //   1118: if_acmpne -> 1239
/*      */       //   1121: iconst_0
/*      */       //   1122: istore #46
/*      */       //   1124: invokestatic getHostOs : ()Lorg/jetbrains/skiko/OS;
/*      */       //   1127: invokevirtual isMacOS : ()Z
/*      */       //   1130: ifeq -> 1179
/*      */       //   1133: aload #11
/*      */       //   1135: dup
/*      */       //   1136: ifnull -> 1166
/*      */       //   1139: checkcast java/lang/Iterable
/*      */       //   1142: ldc_w ' '
/*      */       //   1145: checkcast java/lang/CharSequence
/*      */       //   1148: aconst_null
/*      */       //   1149: aconst_null
/*      */       //   1150: iconst_0
/*      */       //   1151: aconst_null
/*      */       //   1152: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*      */       //   1157: bipush #30
/*      */       //   1159: aconst_null
/*      */       //   1160: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*      */       //   1163: goto -> 1168
/*      */       //   1166: pop
/*      */       //   1167: aconst_null
/*      */       //   1168: dup
/*      */       //   1169: ifnonnull -> 1222
/*      */       //   1172: pop
/*      */       //   1173: ldc_w ''
/*      */       //   1176: goto -> 1222
/*      */       //   1179: aload #11
/*      */       //   1181: dup
/*      */       //   1182: ifnull -> 1212
/*      */       //   1185: checkcast java/lang/Iterable
/*      */       //   1188: ldc_w ' + '
/*      */       //   1191: checkcast java/lang/CharSequence
/*      */       //   1194: aconst_null
/*      */       //   1195: aconst_null
/*      */       //   1196: iconst_0
/*      */       //   1197: aconst_null
/*      */       //   1198: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*      */       //   1203: bipush #30
/*      */       //   1205: aconst_null
/*      */       //   1206: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*      */       //   1209: goto -> 1214
/*      */       //   1212: pop
/*      */       //   1213: aconst_null
/*      */       //   1214: dup
/*      */       //   1215: ifnonnull -> 1222
/*      */       //   1218: pop
/*      */       //   1219: ldc_w ''
/*      */       //   1222: nop
/*      */       //   1223: astore #47
/*      */       //   1225: aload #43
/*      */       //   1227: aload #47
/*      */       //   1229: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */       //   1234: aload #47
/*      */       //   1236: goto -> 1241
/*      */       //   1239: aload #44
/*      */       //   1241: nop
/*      */       //   1242: nop
/*      */       //   1243: nop
/*      */       //   1244: checkcast java/lang/String
/*      */       //   1247: astore #42
/*      */       //   1249: aload #36
/*      */       //   1251: invokeinterface endReplaceGroup : ()V
/*      */       //   1256: aload #42
/*      */       //   1258: astore #39
/*      */       //   1260: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */       //   1263: checkcast androidx/compose/ui/Modifier
/*      */       //   1266: aload #8
/*      */       //   1268: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */       //   1271: invokevirtual getItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */       //   1274: invokevirtual getKeybindingsPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*      */       //   1277: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*      */       //   1280: astore #42
/*      */       //   1282: aload #12
/*      */       //   1284: aload #14
/*      */       //   1286: invokestatic access$MenuItem$lambda$37 : (Landroidx/compose/runtime/MutableState;)J
/*      */       //   1289: aload #36
/*      */       //   1291: iconst_0
/*      */       //   1292: invokevirtual keybindingTintFor-VIR8D2g : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*      */       //   1295: invokeinterface getValue : ()Ljava/lang/Object;
/*      */       //   1300: checkcast androidx/compose/ui/graphics/Color
/*      */       //   1303: invokevirtual unbox-impl : ()J
/*      */       //   1306: lstore #66
/*      */       //   1308: aload #39
/*      */       //   1310: aload #42
/*      */       //   1312: lload #66
/*      */       //   1314: lconst_0
/*      */       //   1315: aconst_null
/*      */       //   1316: aconst_null
/*      */       //   1317: aconst_null
/*      */       //   1318: lconst_0
/*      */       //   1319: aconst_null
/*      */       //   1320: iconst_0
/*      */       //   1321: lconst_0
/*      */       //   1322: iconst_0
/*      */       //   1323: iconst_0
/*      */       //   1324: iconst_0
/*      */       //   1325: aconst_null
/*      */       //   1326: aconst_null
/*      */       //   1327: aload #36
/*      */       //   1329: iconst_0
/*      */       //   1330: iconst_0
/*      */       //   1331: ldc_w 65528
/*      */       //   1334: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*      */       //   1337: aload #36
/*      */       //   1339: invokeinterface endReplaceGroup : ()V
/*      */       //   1344: nop
/*      */       //   1345: aload #33
/*      */       //   1347: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   1350: aload_1
/*      */       //   1351: invokeinterface endNode : ()V
/*      */       //   1356: aload_1
/*      */       //   1357: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   1360: nop
/*      */       //   1361: aload_1
/*      */       //   1362: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   1365: nop
/*      */       //   1366: aload_1
/*      */       //   1367: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   1370: nop
/*      */       //   1371: invokestatic isTraceInProgress : ()Z
/*      */       //   1374: ifeq -> 1389
/*      */       //   1377: invokestatic traceEventEnd : ()V
/*      */       //   1380: goto -> 1389
/*      */       //   1383: aload_1
/*      */       //   1384: invokeinterface skipToGroupEnd : ()V
/*      */       //   1389: return
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #401	-> 0
/*      */       //   #405	-> 48
/*      */       //   #406	-> 60
/*      */       //   #407	-> 73
/*      */       //   #408	-> 84
/*      */       //   #409	-> 96
/*      */       //   #707	-> 105
/*      */       //   #409	-> 111
/*      */       //   #410	-> 119
/*      */       //   #403	-> 127
/*      */       //   #708	-> 188
/*      */       //   #709	-> 191
/*      */       //   #710	-> 225
/*      */       //   #711	-> 234
/*      */       //   #712	-> 239
/*      */       //   #713	-> 245
/*      */       //   #714	-> 253
/*      */       //   #716	-> 260
/*      */       //   #715	-> 282
/*      */       //   #717	-> 291
/*      */       //   #718	-> 294
/*      */       //   #719	-> 310
/*      */       //   #720	-> 315
/*      */       //   #721	-> 325
/*      */       //   #723	-> 336
/*      */       //   #725	-> 341
/*      */       //   #726	-> 350
/*      */       //   #727	-> 363
/*      */       //   #729	-> 376
/*      */       //   #730	-> 387
/*      */       //   #731	-> 394
/*      */       //   #732	-> 422
/*      */       //   #733	-> 434
/*      */       //   #735	-> 448
/*      */       //   #730	-> 449
/*      */       //   #735	-> 450
/*      */       //   #736	-> 451
/*      */       //   #737	-> 464
/*      */       //   #725	-> 465
/*      */       //   #738	-> 466
/*      */       //   #739	-> 490
/*      */       //   #412	-> 531
/*      */       //   #413	-> 536
/*      */       //   #414	-> 558
/*      */       //   #415	-> 573
/*      */       //   #414	-> 593
/*      */       //   #416	-> 603
/*      */       //   #417	-> 613
/*      */       //   #416	-> 621
/*      */       //   #421	-> 635
/*      */       //   #740	-> 666
/*      */       //   #741	-> 669
/*      */       //   #742	-> 677
/*      */       //   #745	-> 680
/*      */       //   #746	-> 698
/*      */       //   #747	-> 708
/*      */       //   #748	-> 714
/*      */       //   #749	-> 721
/*      */       //   #750	-> 730
/*      */       //   #752	-> 737
/*      */       //   #751	-> 759
/*      */       //   #753	-> 769
/*      */       //   #754	-> 772
/*      */       //   #755	-> 790
/*      */       //   #756	-> 795
/*      */       //   #757	-> 807
/*      */       //   #759	-> 819
/*      */       //   #761	-> 824
/*      */       //   #762	-> 834
/*      */       //   #763	-> 847
/*      */       //   #765	-> 860
/*      */       //   #766	-> 871
/*      */       //   #767	-> 878
/*      */       //   #768	-> 906
/*      */       //   #769	-> 918
/*      */       //   #771	-> 932
/*      */       //   #766	-> 933
/*      */       //   #771	-> 934
/*      */       //   #772	-> 935
/*      */       //   #773	-> 948
/*      */       //   #761	-> 949
/*      */       //   #774	-> 950
/*      */       //   #775	-> 975
/*      */       //   #421	-> 1006
/*      */       //   #775	-> 1020
/*      */       //   #774	-> 1025
/*      */       //   #776	-> 1027
/*      */       //   #753	-> 1034
/*      */       //   #777	-> 1037
/*      */       //   #747	-> 1040
/*      */       //   #778	-> 1043
/*      */       //   #740	-> 1046
/*      */       //   #779	-> 1049
/*      */       //   #423	-> 1060
/*      */       //   #425	-> 1081
/*      */       //   #780	-> 1093
/*      */       //   #781	-> 1105
/*      */       //   #782	-> 1121
/*      */       //   #426	-> 1124
/*      */       //   #427	-> 1133
/*      */       //   #429	-> 1179
/*      */       //   #430	-> 1222
/*      */       //   #782	-> 1223
/*      */       //   #783	-> 1225
/*      */       //   #784	-> 1234
/*      */       //   #785	-> 1239
/*      */       //   #781	-> 1241
/*      */       //   #780	-> 1242
/*      */       //   #780	-> 1243
/*      */       //   #425	-> 1244
/*      */       //   #424	-> 1258
/*      */       //   #433	-> 1260
/*      */       //   #435	-> 1282
/*      */       //   #434	-> 1308
/*      */       //   #433	-> 1310
/*      */       //   #435	-> 1312
/*      */       //   #432	-> 1334
/*      */       //   #438	-> 1344
/*      */       //   #739	-> 1345
/*      */       //   #738	-> 1350
/*      */       //   #786	-> 1351
/*      */       //   #717	-> 1357
/*      */       //   #787	-> 1360
/*      */       //   #711	-> 1362
/*      */       //   #788	-> 1365
/*      */       //   #708	-> 1367
/*      */       //   #789	-> 1370
/*      */       //   #438	-> 1383
/*      */       //   #439	-> 1389
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   105	6	6	$i$f$getDp	I
/*      */       //   102	9	5	$this$dp$iv	I
/*      */       //   558	70	39	iconModifier	Landroidx/compose/ui/Modifier;
/*      */       //   1006	14	65	$i$a$-Box-MenuKt$MenuItem$5$2$1$1	I
/*      */       //   1003	17	64	$this$invoke_u24lambda_u245_u24lambda_u241	Landroidx/compose/foundation/layout/BoxScope;
/*      */       //   1003	17	63	$composer	Landroidx/compose/runtime/Composer;
/*      */       //   1003	17	62	$changed	I
/*      */       //   967	58	61	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */       //   964	61	60	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */       //   964	61	59	$changed$iv	I
/*      */       //   878	55	58	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */       //   875	58	57	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */       //   871	64	56	$i$f$set-impl	I
/*      */       //   868	67	55	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */       //   834	115	54	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */       //   831	118	53	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */       //   763	275	52	$i$f$ReusableComposeNode	I
/*      */       //   760	278	50	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */       //   760	278	51	$changed$iv$iv$iv	I
/*      */       //   702	342	46	$i$f$Layout	I
/*      */       //   719	325	47	compositeKeyHash$iv$iv	I
/*      */       //   728	316	48	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */       //   737	307	49	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */       //   699	345	45	$changed$iv$iv	I
/*      */       //   658	392	41	$i$f$Box	I
/*      */       //   689	361	44	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */       //   655	395	39	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */       //   677	373	42	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */       //   680	370	43	propagateMinConstraints$iv	Z
/*      */       //   655	395	40	$changed$iv	I
/*      */       //   1124	99	46	$i$a$-cache-MenuKt$MenuItem$5$2$1$keybindingText$1	I
/*      */       //   1225	11	47	value$iv	Ljava/lang/Object;
/*      */       //   1105	137	45	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */       //   1102	140	44	it$iv	Ljava/lang/Object;
/*      */       //   1093	151	41	$i$f$cache	I
/*      */       //   1090	154	43	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */       //   1090	154	40	invalid$iv	Z
/*      */       //   1260	77	39	keybindingText	Ljava/lang/String;
/*      */       //   521	824	38	$i$a$-Row-MenuKt$MenuItem$5$2$1	I
/*      */       //   518	827	37	$this$invoke_u24lambda_u245	Landroidx/compose/foundation/layout/RowScope;
/*      */       //   518	827	36	$composer	Landroidx/compose/runtime/Composer;
/*      */       //   518	827	35	$changed	I
/*      */       //   482	868	34	$i$a$-Layout-RowKt$Row$1$iv	I
/*      */       //   479	871	33	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */       //   479	871	32	$changed$iv	I
/*      */       //   394	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */       //   391	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */       //   387	64	29	$i$f$set-impl	I
/*      */       //   384	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */       //   350	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */       //   347	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */       //   286	1075	25	$i$f$ReusableComposeNode	I
/*      */       //   283	1078	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */       //   283	1078	24	$changed$iv$iv$iv	I
/*      */       //   229	1137	19	$i$f$Layout	I
/*      */       //   244	1122	20	compositeKeyHash$iv$iv	I
/*      */       //   252	1114	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */       //   260	1106	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */       //   226	1140	18	$changed$iv$iv	I
/*      */       //   183	1188	16	$i$f$Row	I
/*      */       //   216	1155	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */       //   180	1191	4	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */       //   180	1191	5	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*      */       //   180	1191	6	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*      */       //   180	1191	15	$changed$iv	I
/*      */       //   48	1332	3	backgroundColor$delegate	Landroidx/compose/runtime/State;
/*      */       //   0	1390	0	this	Lorg/jetbrains/jewel/ui/component/MenuKt$MenuItem$5$2;
/*      */       //   0	1390	1	$composer	Landroidx/compose/runtime/Composer;
/*      */       //   0	1390	2	$changed	I } private static final long invoke$lambda$0(State $backgroundColor$delegate) { State state = $backgroundColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } private static final CharSequence invoke$lambda$5$lambda$4$lambda$2(String it) { Intrinsics.checkNotNullParameter(it, "it"); return it; } private static final CharSequence invoke$lambda$5$lambda$4$lambda$3(String it) { Intrinsics.checkNotNullParameter(it, "it"); return it; }
/*      */     MenuKt$MenuItem$5$2(MenuItemColors $itemColors, MenuItemMetrics $itemMetrics, MutableState<MenuItemState> $itemState$delegate, boolean $canShowIcon, MenuStyle $style, IconKey $iconKey, boolean $canShowKeybinding, Set<String> $keybinding, Function2<Composer, Integer, Unit> $content) {} }
/*      */   @Deprecated(message = "Use the IconKey variant", replaceWith = @ReplaceWith(expression = "MenuSubmenuItem(modifier, enabled, canShowIcon, iconResource?.let { PathIconKey(it, iconClass) }, interactionSource, style, submenu, content)", imports = {"org/jetbrains/jewel/ui/component/Menu.kt:472"})) @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void MenuSubmenuItem(@Nullable Modifier modifier, boolean enabled, boolean canShowIcon, @Nullable String iconResource, @NotNull Class iconClass, @Nullable MutableInteractionSource interactionSource, @Nullable MenuStyle style, @NotNull Function1 submenu, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload #4
/*      */     //   2: ldc_w 'iconClass'
/*      */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   8: aload #7
/*      */     //   10: ldc_w 'submenu'
/*      */     //   13: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   16: aload #8
/*      */     //   18: ldc 'content'
/*      */     //   20: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   23: aload #9
/*      */     //   25: ldc_w -40676075
/*      */     //   28: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   33: astore #9
/*      */     //   35: iload #10
/*      */     //   37: istore #12
/*      */     //   39: iload #11
/*      */     //   41: iconst_1
/*      */     //   42: iand
/*      */     //   43: ifeq -> 56
/*      */     //   46: iload #12
/*      */     //   48: bipush #6
/*      */     //   50: ior
/*      */     //   51: istore #12
/*      */     //   53: goto -> 85
/*      */     //   56: iload #10
/*      */     //   58: bipush #6
/*      */     //   60: iand
/*      */     //   61: ifne -> 85
/*      */     //   64: iload #12
/*      */     //   66: aload #9
/*      */     //   68: aload_0
/*      */     //   69: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   74: ifeq -> 81
/*      */     //   77: iconst_4
/*      */     //   78: goto -> 82
/*      */     //   81: iconst_2
/*      */     //   82: ior
/*      */     //   83: istore #12
/*      */     //   85: iload #11
/*      */     //   87: iconst_2
/*      */     //   88: iand
/*      */     //   89: ifeq -> 102
/*      */     //   92: iload #12
/*      */     //   94: bipush #48
/*      */     //   96: ior
/*      */     //   97: istore #12
/*      */     //   99: goto -> 133
/*      */     //   102: iload #10
/*      */     //   104: bipush #48
/*      */     //   106: iand
/*      */     //   107: ifne -> 133
/*      */     //   110: iload #12
/*      */     //   112: aload #9
/*      */     //   114: iload_1
/*      */     //   115: invokeinterface changed : (Z)Z
/*      */     //   120: ifeq -> 128
/*      */     //   123: bipush #32
/*      */     //   125: goto -> 130
/*      */     //   128: bipush #16
/*      */     //   130: ior
/*      */     //   131: istore #12
/*      */     //   133: iload #11
/*      */     //   135: iconst_4
/*      */     //   136: iand
/*      */     //   137: ifeq -> 151
/*      */     //   140: iload #12
/*      */     //   142: sipush #384
/*      */     //   145: ior
/*      */     //   146: istore #12
/*      */     //   148: goto -> 185
/*      */     //   151: iload #10
/*      */     //   153: sipush #384
/*      */     //   156: iand
/*      */     //   157: ifne -> 185
/*      */     //   160: iload #12
/*      */     //   162: aload #9
/*      */     //   164: iload_2
/*      */     //   165: invokeinterface changed : (Z)Z
/*      */     //   170: ifeq -> 179
/*      */     //   173: sipush #256
/*      */     //   176: goto -> 182
/*      */     //   179: sipush #128
/*      */     //   182: ior
/*      */     //   183: istore #12
/*      */     //   185: iload #11
/*      */     //   187: bipush #8
/*      */     //   189: iand
/*      */     //   190: ifeq -> 204
/*      */     //   193: iload #12
/*      */     //   195: sipush #3072
/*      */     //   198: ior
/*      */     //   199: istore #12
/*      */     //   201: goto -> 238
/*      */     //   204: iload #10
/*      */     //   206: sipush #3072
/*      */     //   209: iand
/*      */     //   210: ifne -> 238
/*      */     //   213: iload #12
/*      */     //   215: aload #9
/*      */     //   217: aload_3
/*      */     //   218: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   223: ifeq -> 232
/*      */     //   226: sipush #2048
/*      */     //   229: goto -> 235
/*      */     //   232: sipush #1024
/*      */     //   235: ior
/*      */     //   236: istore #12
/*      */     //   238: iload #11
/*      */     //   240: bipush #16
/*      */     //   242: iand
/*      */     //   243: ifeq -> 257
/*      */     //   246: iload #12
/*      */     //   248: sipush #24576
/*      */     //   251: ior
/*      */     //   252: istore #12
/*      */     //   254: goto -> 292
/*      */     //   257: iload #10
/*      */     //   259: sipush #24576
/*      */     //   262: iand
/*      */     //   263: ifne -> 292
/*      */     //   266: iload #12
/*      */     //   268: aload #9
/*      */     //   270: aload #4
/*      */     //   272: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   277: ifeq -> 286
/*      */     //   280: sipush #16384
/*      */     //   283: goto -> 289
/*      */     //   286: sipush #8192
/*      */     //   289: ior
/*      */     //   290: istore #12
/*      */     //   292: iload #11
/*      */     //   294: bipush #32
/*      */     //   296: iand
/*      */     //   297: ifeq -> 310
/*      */     //   300: iload #12
/*      */     //   302: ldc 196608
/*      */     //   304: ior
/*      */     //   305: istore #12
/*      */     //   307: goto -> 342
/*      */     //   310: iload #10
/*      */     //   312: ldc 196608
/*      */     //   314: iand
/*      */     //   315: ifne -> 342
/*      */     //   318: iload #12
/*      */     //   320: aload #9
/*      */     //   322: aload #5
/*      */     //   324: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   329: ifeq -> 337
/*      */     //   332: ldc 131072
/*      */     //   334: goto -> 339
/*      */     //   337: ldc 65536
/*      */     //   339: ior
/*      */     //   340: istore #12
/*      */     //   342: iload #10
/*      */     //   344: ldc_w 1572864
/*      */     //   347: iand
/*      */     //   348: ifne -> 385
/*      */     //   351: iload #12
/*      */     //   353: iload #11
/*      */     //   355: bipush #64
/*      */     //   357: iand
/*      */     //   358: ifne -> 379
/*      */     //   361: aload #9
/*      */     //   363: aload #6
/*      */     //   365: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   370: ifeq -> 379
/*      */     //   373: ldc_w 1048576
/*      */     //   376: goto -> 382
/*      */     //   379: ldc_w 524288
/*      */     //   382: ior
/*      */     //   383: istore #12
/*      */     //   385: iload #11
/*      */     //   387: sipush #128
/*      */     //   390: iand
/*      */     //   391: ifeq -> 405
/*      */     //   394: iload #12
/*      */     //   396: ldc_w 12582912
/*      */     //   399: ior
/*      */     //   400: istore #12
/*      */     //   402: goto -> 440
/*      */     //   405: iload #10
/*      */     //   407: ldc_w 12582912
/*      */     //   410: iand
/*      */     //   411: ifne -> 440
/*      */     //   414: iload #12
/*      */     //   416: aload #9
/*      */     //   418: aload #7
/*      */     //   420: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   425: ifeq -> 434
/*      */     //   428: ldc_w 8388608
/*      */     //   431: goto -> 437
/*      */     //   434: ldc_w 4194304
/*      */     //   437: ior
/*      */     //   438: istore #12
/*      */     //   440: iload #11
/*      */     //   442: sipush #256
/*      */     //   445: iand
/*      */     //   446: ifeq -> 460
/*      */     //   449: iload #12
/*      */     //   451: ldc_w 100663296
/*      */     //   454: ior
/*      */     //   455: istore #12
/*      */     //   457: goto -> 495
/*      */     //   460: iload #10
/*      */     //   462: ldc_w 100663296
/*      */     //   465: iand
/*      */     //   466: ifne -> 495
/*      */     //   469: iload #12
/*      */     //   471: aload #9
/*      */     //   473: aload #8
/*      */     //   475: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   480: ifeq -> 489
/*      */     //   483: ldc_w 67108864
/*      */     //   486: goto -> 492
/*      */     //   489: ldc_w 33554432
/*      */     //   492: ior
/*      */     //   493: istore #12
/*      */     //   495: iload #12
/*      */     //   497: ldc_w 38347923
/*      */     //   500: iand
/*      */     //   501: ldc_w 38347922
/*      */     //   504: if_icmpne -> 517
/*      */     //   507: aload #9
/*      */     //   509: invokeinterface getSkipping : ()Z
/*      */     //   514: ifne -> 965
/*      */     //   517: aload #9
/*      */     //   519: invokeinterface startDefaults : ()V
/*      */     //   524: iload #10
/*      */     //   526: iconst_1
/*      */     //   527: iand
/*      */     //   528: ifeq -> 541
/*      */     //   531: aload #9
/*      */     //   533: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   538: ifeq -> 689
/*      */     //   541: iload #11
/*      */     //   543: iconst_1
/*      */     //   544: iand
/*      */     //   545: ifeq -> 555
/*      */     //   548: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   551: checkcast androidx/compose/ui/Modifier
/*      */     //   554: astore_0
/*      */     //   555: iload #11
/*      */     //   557: iconst_2
/*      */     //   558: iand
/*      */     //   559: ifeq -> 564
/*      */     //   562: iconst_1
/*      */     //   563: istore_1
/*      */     //   564: iload #11
/*      */     //   566: bipush #32
/*      */     //   568: iand
/*      */     //   569: ifeq -> 658
/*      */     //   572: aload #9
/*      */     //   574: ldc_w -2044233572
/*      */     //   577: invokeinterface startReplaceGroup : (I)V
/*      */     //   582: aload #9
/*      */     //   584: astore #14
/*      */     //   586: iconst_0
/*      */     //   587: istore #15
/*      */     //   589: iconst_0
/*      */     //   590: istore #16
/*      */     //   592: aload #14
/*      */     //   594: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   599: astore #17
/*      */     //   601: iconst_0
/*      */     //   602: istore #18
/*      */     //   604: aload #17
/*      */     //   606: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   609: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   612: if_acmpne -> 637
/*      */     //   615: iconst_0
/*      */     //   616: istore #19
/*      */     //   618: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   621: astore #19
/*      */     //   623: aload #14
/*      */     //   625: aload #19
/*      */     //   627: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   632: aload #19
/*      */     //   634: goto -> 639
/*      */     //   637: aload #17
/*      */     //   639: nop
/*      */     //   640: nop
/*      */     //   641: nop
/*      */     //   642: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   645: astore #13
/*      */     //   647: aload #9
/*      */     //   649: invokeinterface endReplaceGroup : ()V
/*      */     //   654: aload #13
/*      */     //   656: astore #5
/*      */     //   658: iload #11
/*      */     //   660: bipush #64
/*      */     //   662: iand
/*      */     //   663: ifeq -> 712
/*      */     //   666: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   669: aload #9
/*      */     //   671: bipush #6
/*      */     //   673: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   676: astore #6
/*      */     //   678: iload #12
/*      */     //   680: ldc_w -3670017
/*      */     //   683: iand
/*      */     //   684: istore #12
/*      */     //   686: goto -> 712
/*      */     //   689: aload #9
/*      */     //   691: invokeinterface skipToGroupEnd : ()V
/*      */     //   696: iload #11
/*      */     //   698: bipush #64
/*      */     //   700: iand
/*      */     //   701: ifeq -> 712
/*      */     //   704: iload #12
/*      */     //   706: ldc_w -3670017
/*      */     //   709: iand
/*      */     //   710: istore #12
/*      */     //   712: aload #9
/*      */     //   714: invokeinterface endDefaults : ()V
/*      */     //   719: invokestatic isTraceInProgress : ()Z
/*      */     //   722: ifeq -> 737
/*      */     //   725: ldc_w -40676075
/*      */     //   728: iload #12
/*      */     //   730: iconst_m1
/*      */     //   731: ldc_w 'org.jetbrains.jewel.ui.component.MenuSubmenuItem (Menu.kt:461)'
/*      */     //   734: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   737: aload #9
/*      */     //   739: ldc_w -2044227765
/*      */     //   742: invokeinterface startReplaceGroup : (I)V
/*      */     //   747: aload #9
/*      */     //   749: astore #15
/*      */     //   751: iload #12
/*      */     //   753: sipush #7168
/*      */     //   756: iand
/*      */     //   757: sipush #2048
/*      */     //   760: if_icmpne -> 767
/*      */     //   763: iconst_1
/*      */     //   764: goto -> 768
/*      */     //   767: iconst_0
/*      */     //   768: aload #9
/*      */     //   770: aload #4
/*      */     //   772: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   777: ior
/*      */     //   778: istore #16
/*      */     //   780: iconst_0
/*      */     //   781: istore #17
/*      */     //   783: aload #15
/*      */     //   785: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   790: astore #18
/*      */     //   792: iconst_0
/*      */     //   793: istore #19
/*      */     //   795: iload #16
/*      */     //   797: ifne -> 811
/*      */     //   800: aload #18
/*      */     //   802: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   805: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   808: if_acmpne -> 856
/*      */     //   811: iconst_0
/*      */     //   812: istore #20
/*      */     //   814: aload_3
/*      */     //   815: dup
/*      */     //   816: ifnull -> 838
/*      */     //   819: astore #21
/*      */     //   821: iconst_0
/*      */     //   822: istore #22
/*      */     //   824: new org/jetbrains/jewel/ui/icon/PathIconKey
/*      */     //   827: dup
/*      */     //   828: aload #21
/*      */     //   830: aload #4
/*      */     //   832: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Class;)V
/*      */     //   835: goto -> 840
/*      */     //   838: pop
/*      */     //   839: aconst_null
/*      */     //   840: astore #23
/*      */     //   842: aload #15
/*      */     //   844: aload #23
/*      */     //   846: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   851: aload #23
/*      */     //   853: goto -> 858
/*      */     //   856: aload #18
/*      */     //   858: nop
/*      */     //   859: nop
/*      */     //   860: nop
/*      */     //   861: checkcast org/jetbrains/jewel/ui/icon/PathIconKey
/*      */     //   864: astore #14
/*      */     //   866: aload #9
/*      */     //   868: invokeinterface endReplaceGroup : ()V
/*      */     //   873: aload #14
/*      */     //   875: astore #13
/*      */     //   877: aload_0
/*      */     //   878: iload_1
/*      */     //   879: iload_2
/*      */     //   880: aload #13
/*      */     //   882: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*      */     //   885: aload #5
/*      */     //   887: aload #6
/*      */     //   889: aload #7
/*      */     //   891: aload #8
/*      */     //   893: aload #9
/*      */     //   895: bipush #14
/*      */     //   897: iload #12
/*      */     //   899: iand
/*      */     //   900: bipush #112
/*      */     //   902: iload #12
/*      */     //   904: iand
/*      */     //   905: ior
/*      */     //   906: sipush #896
/*      */     //   909: iload #12
/*      */     //   911: iand
/*      */     //   912: ior
/*      */     //   913: ldc_w 57344
/*      */     //   916: iload #12
/*      */     //   918: iconst_3
/*      */     //   919: ishr
/*      */     //   920: iand
/*      */     //   921: ior
/*      */     //   922: ldc_w 458752
/*      */     //   925: iload #12
/*      */     //   927: iconst_3
/*      */     //   928: ishr
/*      */     //   929: iand
/*      */     //   930: ior
/*      */     //   931: ldc_w 3670016
/*      */     //   934: iload #12
/*      */     //   936: iconst_3
/*      */     //   937: ishr
/*      */     //   938: iand
/*      */     //   939: ior
/*      */     //   940: ldc_w 29360128
/*      */     //   943: iload #12
/*      */     //   945: iconst_3
/*      */     //   946: ishr
/*      */     //   947: iand
/*      */     //   948: ior
/*      */     //   949: iconst_0
/*      */     //   950: invokestatic MenuSubmenuItem : (Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/icon/IconKey;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*      */     //   953: invokestatic isTraceInProgress : ()Z
/*      */     //   956: ifeq -> 972
/*      */     //   959: invokestatic traceEventEnd : ()V
/*      */     //   962: goto -> 972
/*      */     //   965: aload #9
/*      */     //   967: invokeinterface skipToGroupEnd : ()V
/*      */     //   972: aload #9
/*      */     //   974: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   979: dup
/*      */     //   980: ifnull -> 1014
/*      */     //   983: aload_0
/*      */     //   984: iload_1
/*      */     //   985: iload_2
/*      */     //   986: aload_3
/*      */     //   987: aload #4
/*      */     //   989: aload #5
/*      */     //   991: aload #6
/*      */     //   993: aload #7
/*      */     //   995: aload #8
/*      */     //   997: iload #10
/*      */     //   999: iload #11
/*      */     //   1001: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;ZZLjava/lang/String;Ljava/lang/Class;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*      */     //   1006: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1011: goto -> 1015
/*      */     //   1014: pop
/*      */     //   1015: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #462	-> 23
/*      */     //   #453	-> 548
/*      */     //   #454	-> 562
/*      */     //   #458	-> 572
/*      */     //   #1039	-> 592
/*      */     //   #1040	-> 604
/*      */     //   #1041	-> 615
/*      */     //   #458	-> 618
/*      */     //   #1041	-> 621
/*      */     //   #1042	-> 623
/*      */     //   #1043	-> 632
/*      */     //   #1044	-> 637
/*      */     //   #1040	-> 639
/*      */     //   #1039	-> 640
/*      */     //   #1039	-> 641
/*      */     //   #458	-> 642
/*      */     //   #459	-> 666
/*      */     //   #462	-> 734
/*      */     //   #463	-> 770
/*      */     //   #1045	-> 783
/*      */     //   #1046	-> 795
/*      */     //   #1047	-> 811
/*      */     //   #463	-> 814
/*      */     //   #914	-> 821
/*      */     //   #463	-> 824
/*      */     //   #463	-> 835
/*      */     //   #463	-> 838
/*      */     //   #1047	-> 840
/*      */     //   #1048	-> 842
/*      */     //   #1049	-> 851
/*      */     //   #1050	-> 856
/*      */     //   #1046	-> 858
/*      */     //   #1045	-> 859
/*      */     //   #1045	-> 860
/*      */     //   #463	-> 861
/*      */     //   #464	-> 877
/*      */     //   #465	-> 965
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   618	3	19	$i$a$-cache-MenuKt$MenuSubmenuItem$1	I
/*      */     //   623	11	19	value$iv	Ljava/lang/Object;
/*      */     //   604	36	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   601	39	17	it$iv	Ljava/lang/Object;
/*      */     //   592	50	16	$i$f$cache	I
/*      */     //   589	53	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   589	53	15	invalid$iv	Z
/*      */     //   824	11	22	$i$a$-let-MenuKt$MenuSubmenuItem$iconKey$1$1	I
/*      */     //   821	14	21	it	Ljava/lang/String;
/*      */     //   814	26	20	$i$a$-cache-MenuKt$MenuSubmenuItem$iconKey$1	I
/*      */     //   842	11	23	value$iv	Ljava/lang/Object;
/*      */     //   795	64	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   792	67	18	it$iv	Ljava/lang/Object;
/*      */     //   783	78	17	$i$f$cache	I
/*      */     //   780	81	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   780	81	16	invalid$iv	Z
/*      */     //   877	85	13	iconKey	Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*      */     //   39	977	12	$dirty	I
/*      */     //   0	1016	0	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1016	1	enabled	Z
/*      */     //   0	1016	2	canShowIcon	Z
/*      */     //   0	1016	3	iconResource	Ljava/lang/String;
/*      */     //   0	1016	4	iconClass	Ljava/lang/Class;
/*      */     //   0	1016	5	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   0	1016	6	style	Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   0	1016	7	submenu	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1016	8	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1016	9	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	1016	10	$changed	I }
/*      */   @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void MenuSubmenuItem(@Nullable Modifier modifier, boolean enabled, boolean canShowIcon, @Nullable IconKey iconKey, @Nullable MutableInteractionSource interactionSource, @Nullable MenuStyle style, @NotNull Function1 submenu, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload #6
/*      */     //   2: ldc_w 'submenu'
/*      */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   8: aload #7
/*      */     //   10: ldc 'content'
/*      */     //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   15: aload #8
/*      */     //   17: ldc_w -1438622518
/*      */     //   20: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   25: astore #8
/*      */     //   27: iload #9
/*      */     //   29: istore #11
/*      */     //   31: iload #10
/*      */     //   33: iconst_1
/*      */     //   34: iand
/*      */     //   35: ifeq -> 48
/*      */     //   38: iload #11
/*      */     //   40: bipush #6
/*      */     //   42: ior
/*      */     //   43: istore #11
/*      */     //   45: goto -> 77
/*      */     //   48: iload #9
/*      */     //   50: bipush #6
/*      */     //   52: iand
/*      */     //   53: ifne -> 77
/*      */     //   56: iload #11
/*      */     //   58: aload #8
/*      */     //   60: aload_0
/*      */     //   61: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   66: ifeq -> 73
/*      */     //   69: iconst_4
/*      */     //   70: goto -> 74
/*      */     //   73: iconst_2
/*      */     //   74: ior
/*      */     //   75: istore #11
/*      */     //   77: iload #10
/*      */     //   79: iconst_2
/*      */     //   80: iand
/*      */     //   81: ifeq -> 94
/*      */     //   84: iload #11
/*      */     //   86: bipush #48
/*      */     //   88: ior
/*      */     //   89: istore #11
/*      */     //   91: goto -> 125
/*      */     //   94: iload #9
/*      */     //   96: bipush #48
/*      */     //   98: iand
/*      */     //   99: ifne -> 125
/*      */     //   102: iload #11
/*      */     //   104: aload #8
/*      */     //   106: iload_1
/*      */     //   107: invokeinterface changed : (Z)Z
/*      */     //   112: ifeq -> 120
/*      */     //   115: bipush #32
/*      */     //   117: goto -> 122
/*      */     //   120: bipush #16
/*      */     //   122: ior
/*      */     //   123: istore #11
/*      */     //   125: iload #10
/*      */     //   127: iconst_4
/*      */     //   128: iand
/*      */     //   129: ifeq -> 143
/*      */     //   132: iload #11
/*      */     //   134: sipush #384
/*      */     //   137: ior
/*      */     //   138: istore #11
/*      */     //   140: goto -> 177
/*      */     //   143: iload #9
/*      */     //   145: sipush #384
/*      */     //   148: iand
/*      */     //   149: ifne -> 177
/*      */     //   152: iload #11
/*      */     //   154: aload #8
/*      */     //   156: iload_2
/*      */     //   157: invokeinterface changed : (Z)Z
/*      */     //   162: ifeq -> 171
/*      */     //   165: sipush #256
/*      */     //   168: goto -> 174
/*      */     //   171: sipush #128
/*      */     //   174: ior
/*      */     //   175: istore #11
/*      */     //   177: iload #10
/*      */     //   179: bipush #8
/*      */     //   181: iand
/*      */     //   182: ifeq -> 196
/*      */     //   185: iload #11
/*      */     //   187: sipush #3072
/*      */     //   190: ior
/*      */     //   191: istore #11
/*      */     //   193: goto -> 250
/*      */     //   196: iload #9
/*      */     //   198: sipush #3072
/*      */     //   201: iand
/*      */     //   202: ifne -> 250
/*      */     //   205: iload #11
/*      */     //   207: iload #9
/*      */     //   209: sipush #4096
/*      */     //   212: iand
/*      */     //   213: ifne -> 227
/*      */     //   216: aload #8
/*      */     //   218: aload_3
/*      */     //   219: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   224: goto -> 235
/*      */     //   227: aload #8
/*      */     //   229: aload_3
/*      */     //   230: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   235: ifeq -> 244
/*      */     //   238: sipush #2048
/*      */     //   241: goto -> 247
/*      */     //   244: sipush #1024
/*      */     //   247: ior
/*      */     //   248: istore #11
/*      */     //   250: iload #10
/*      */     //   252: bipush #16
/*      */     //   254: iand
/*      */     //   255: ifeq -> 269
/*      */     //   258: iload #11
/*      */     //   260: sipush #24576
/*      */     //   263: ior
/*      */     //   264: istore #11
/*      */     //   266: goto -> 304
/*      */     //   269: iload #9
/*      */     //   271: sipush #24576
/*      */     //   274: iand
/*      */     //   275: ifne -> 304
/*      */     //   278: iload #11
/*      */     //   280: aload #8
/*      */     //   282: aload #4
/*      */     //   284: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   289: ifeq -> 298
/*      */     //   292: sipush #16384
/*      */     //   295: goto -> 301
/*      */     //   298: sipush #8192
/*      */     //   301: ior
/*      */     //   302: istore #11
/*      */     //   304: iload #9
/*      */     //   306: ldc 196608
/*      */     //   308: iand
/*      */     //   309: ifne -> 344
/*      */     //   312: iload #11
/*      */     //   314: iload #10
/*      */     //   316: bipush #32
/*      */     //   318: iand
/*      */     //   319: ifne -> 339
/*      */     //   322: aload #8
/*      */     //   324: aload #5
/*      */     //   326: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   331: ifeq -> 339
/*      */     //   334: ldc 131072
/*      */     //   336: goto -> 341
/*      */     //   339: ldc 65536
/*      */     //   341: ior
/*      */     //   342: istore #11
/*      */     //   344: iload #10
/*      */     //   346: bipush #64
/*      */     //   348: iand
/*      */     //   349: ifeq -> 363
/*      */     //   352: iload #11
/*      */     //   354: ldc_w 1572864
/*      */     //   357: ior
/*      */     //   358: istore #11
/*      */     //   360: goto -> 398
/*      */     //   363: iload #9
/*      */     //   365: ldc_w 1572864
/*      */     //   368: iand
/*      */     //   369: ifne -> 398
/*      */     //   372: iload #11
/*      */     //   374: aload #8
/*      */     //   376: aload #6
/*      */     //   378: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   383: ifeq -> 392
/*      */     //   386: ldc_w 1048576
/*      */     //   389: goto -> 395
/*      */     //   392: ldc_w 524288
/*      */     //   395: ior
/*      */     //   396: istore #11
/*      */     //   398: iload #10
/*      */     //   400: sipush #128
/*      */     //   403: iand
/*      */     //   404: ifeq -> 418
/*      */     //   407: iload #11
/*      */     //   409: ldc_w 12582912
/*      */     //   412: ior
/*      */     //   413: istore #11
/*      */     //   415: goto -> 453
/*      */     //   418: iload #9
/*      */     //   420: ldc_w 12582912
/*      */     //   423: iand
/*      */     //   424: ifne -> 453
/*      */     //   427: iload #11
/*      */     //   429: aload #8
/*      */     //   431: aload #7
/*      */     //   433: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   438: ifeq -> 447
/*      */     //   441: ldc_w 8388608
/*      */     //   444: goto -> 450
/*      */     //   447: ldc_w 4194304
/*      */     //   450: ior
/*      */     //   451: istore #11
/*      */     //   453: iload #11
/*      */     //   455: ldc_w 4793491
/*      */     //   458: iand
/*      */     //   459: ldc_w 4793490
/*      */     //   462: if_icmpne -> 475
/*      */     //   465: aload #8
/*      */     //   467: invokeinterface getSkipping : ()Z
/*      */     //   472: ifne -> 2146
/*      */     //   475: aload #8
/*      */     //   477: invokeinterface startDefaults : ()V
/*      */     //   482: iload #9
/*      */     //   484: iconst_1
/*      */     //   485: iand
/*      */     //   486: ifeq -> 499
/*      */     //   489: aload #8
/*      */     //   491: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   496: ifeq -> 647
/*      */     //   499: iload #10
/*      */     //   501: iconst_1
/*      */     //   502: iand
/*      */     //   503: ifeq -> 513
/*      */     //   506: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   509: checkcast androidx/compose/ui/Modifier
/*      */     //   512: astore_0
/*      */     //   513: iload #10
/*      */     //   515: iconst_2
/*      */     //   516: iand
/*      */     //   517: ifeq -> 522
/*      */     //   520: iconst_1
/*      */     //   521: istore_1
/*      */     //   522: iload #10
/*      */     //   524: bipush #16
/*      */     //   526: iand
/*      */     //   527: ifeq -> 616
/*      */     //   530: aload #8
/*      */     //   532: ldc_w -2044215076
/*      */     //   535: invokeinterface startReplaceGroup : (I)V
/*      */     //   540: aload #8
/*      */     //   542: astore #13
/*      */     //   544: iconst_0
/*      */     //   545: istore #14
/*      */     //   547: iconst_0
/*      */     //   548: istore #15
/*      */     //   550: aload #13
/*      */     //   552: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   557: astore #16
/*      */     //   559: iconst_0
/*      */     //   560: istore #17
/*      */     //   562: aload #16
/*      */     //   564: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   567: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   570: if_acmpne -> 595
/*      */     //   573: iconst_0
/*      */     //   574: istore #18
/*      */     //   576: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   579: astore #18
/*      */     //   581: aload #13
/*      */     //   583: aload #18
/*      */     //   585: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   590: aload #18
/*      */     //   592: goto -> 597
/*      */     //   595: aload #16
/*      */     //   597: nop
/*      */     //   598: nop
/*      */     //   599: nop
/*      */     //   600: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   603: astore #12
/*      */     //   605: aload #8
/*      */     //   607: invokeinterface endReplaceGroup : ()V
/*      */     //   612: aload #12
/*      */     //   614: astore #4
/*      */     //   616: iload #10
/*      */     //   618: bipush #32
/*      */     //   620: iand
/*      */     //   621: ifeq -> 670
/*      */     //   624: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   627: aload #8
/*      */     //   629: bipush #6
/*      */     //   631: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   634: astore #5
/*      */     //   636: iload #11
/*      */     //   638: ldc_w -458753
/*      */     //   641: iand
/*      */     //   642: istore #11
/*      */     //   644: goto -> 670
/*      */     //   647: aload #8
/*      */     //   649: invokeinterface skipToGroupEnd : ()V
/*      */     //   654: iload #10
/*      */     //   656: bipush #32
/*      */     //   658: iand
/*      */     //   659: ifeq -> 670
/*      */     //   662: iload #11
/*      */     //   664: ldc_w -458753
/*      */     //   667: iand
/*      */     //   668: istore #11
/*      */     //   670: aload #8
/*      */     //   672: invokeinterface endDefaults : ()V
/*      */     //   677: invokestatic isTraceInProgress : ()Z
/*      */     //   680: ifeq -> 695
/*      */     //   683: ldc_w -1438622518
/*      */     //   686: iload #11
/*      */     //   688: iconst_m1
/*      */     //   689: ldc_w 'org.jetbrains.jewel.ui.component.MenuSubmenuItem (Menu.kt:476)'
/*      */     //   692: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   695: aload #8
/*      */     //   697: ldc_w -2044208902
/*      */     //   700: invokeinterface startReplaceGroup : (I)V
/*      */     //   705: aload #8
/*      */     //   707: astore #14
/*      */     //   709: iload #11
/*      */     //   711: ldc_w 57344
/*      */     //   714: iand
/*      */     //   715: sipush #16384
/*      */     //   718: if_icmpne -> 725
/*      */     //   721: iconst_1
/*      */     //   722: goto -> 726
/*      */     //   725: iconst_0
/*      */     //   726: istore #15
/*      */     //   728: nop
/*      */     //   729: iconst_0
/*      */     //   730: istore #16
/*      */     //   732: aload #14
/*      */     //   734: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   739: astore #17
/*      */     //   741: iconst_0
/*      */     //   742: istore #18
/*      */     //   744: iload #15
/*      */     //   746: ifne -> 760
/*      */     //   749: aload #17
/*      */     //   751: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   754: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   757: if_acmpne -> 803
/*      */     //   760: iconst_0
/*      */     //   761: istore #19
/*      */     //   763: getstatic org/jetbrains/jewel/ui/component/MenuItemState.Companion : Lorg/jetbrains/jewel/ui/component/MenuItemState$Companion;
/*      */     //   766: iconst_0
/*      */     //   767: iload_1
/*      */     //   768: iconst_0
/*      */     //   769: iconst_0
/*      */     //   770: iconst_0
/*      */     //   771: iconst_0
/*      */     //   772: bipush #60
/*      */     //   774: aconst_null
/*      */     //   775: invokestatic of-moUeATs$default : (Lorg/jetbrains/jewel/ui/component/MenuItemState$Companion;ZZZZZZILjava/lang/Object;)J
/*      */     //   778: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/MenuItemState;
/*      */     //   781: aconst_null
/*      */     //   782: iconst_2
/*      */     //   783: aconst_null
/*      */     //   784: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   787: astore #20
/*      */     //   789: aload #14
/*      */     //   791: aload #20
/*      */     //   793: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   798: aload #20
/*      */     //   800: goto -> 805
/*      */     //   803: aload #17
/*      */     //   805: nop
/*      */     //   806: nop
/*      */     //   807: nop
/*      */     //   808: checkcast androidx/compose/runtime/MutableState
/*      */     //   811: astore #13
/*      */     //   813: aload #8
/*      */     //   815: invokeinterface endReplaceGroup : ()V
/*      */     //   820: aload #13
/*      */     //   822: astore #12
/*      */     //   824: aload #8
/*      */     //   826: ldc_w -2044205494
/*      */     //   829: invokeinterface startReplaceGroup : (I)V
/*      */     //   834: aload #8
/*      */     //   836: astore #13
/*      */     //   838: iload #11
/*      */     //   840: bipush #112
/*      */     //   842: iand
/*      */     //   843: bipush #32
/*      */     //   845: if_icmpne -> 852
/*      */     //   848: iconst_1
/*      */     //   849: goto -> 853
/*      */     //   852: iconst_0
/*      */     //   853: istore #14
/*      */     //   855: nop
/*      */     //   856: iconst_0
/*      */     //   857: istore #15
/*      */     //   859: aload #13
/*      */     //   861: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   866: astore #16
/*      */     //   868: iconst_0
/*      */     //   869: istore #17
/*      */     //   871: iload #14
/*      */     //   873: ifne -> 887
/*      */     //   876: aload #16
/*      */     //   878: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   881: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   884: if_acmpne -> 931
/*      */     //   887: iconst_0
/*      */     //   888: istore #18
/*      */     //   890: aload #12
/*      */     //   892: aload #12
/*      */     //   894: invokestatic MenuSubmenuItem$lambda$55 : (Landroidx/compose/runtime/MutableState;)J
/*      */     //   897: iconst_0
/*      */     //   898: iload_1
/*      */     //   899: iconst_0
/*      */     //   900: iconst_0
/*      */     //   901: iconst_0
/*      */     //   902: iconst_0
/*      */     //   903: bipush #60
/*      */     //   905: aconst_null
/*      */     //   906: invokestatic copy-moUeATs$default : (JZZZZZZILjava/lang/Object;)J
/*      */     //   909: invokestatic MenuSubmenuItem$lambda$56 : (Landroidx/compose/runtime/MutableState;J)V
/*      */     //   912: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   915: astore #19
/*      */     //   917: aload #13
/*      */     //   919: aload #19
/*      */     //   921: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   926: aload #19
/*      */     //   928: goto -> 933
/*      */     //   931: aload #16
/*      */     //   933: nop
/*      */     //   934: nop
/*      */     //   935: nop
/*      */     //   936: pop
/*      */     //   937: aload #8
/*      */     //   939: invokeinterface endReplaceGroup : ()V
/*      */     //   944: aload #8
/*      */     //   946: ldc_w -2044201966
/*      */     //   949: invokeinterface startReplaceGroup : (I)V
/*      */     //   954: aload #8
/*      */     //   956: astore #15
/*      */     //   958: iconst_0
/*      */     //   959: istore #16
/*      */     //   961: nop
/*      */     //   962: iconst_0
/*      */     //   963: istore #17
/*      */     //   965: aload #15
/*      */     //   967: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   972: astore #18
/*      */     //   974: iconst_0
/*      */     //   975: istore #19
/*      */     //   977: aload #18
/*      */     //   979: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   982: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   985: if_acmpne -> 1014
/*      */     //   988: iconst_0
/*      */     //   989: istore #20
/*      */     //   991: new androidx/compose/ui/focus/FocusRequester
/*      */     //   994: dup
/*      */     //   995: invokespecial <init> : ()V
/*      */     //   998: astore #20
/*      */     //   1000: aload #15
/*      */     //   1002: aload #20
/*      */     //   1004: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1009: aload #20
/*      */     //   1011: goto -> 1016
/*      */     //   1014: aload #18
/*      */     //   1016: nop
/*      */     //   1017: nop
/*      */     //   1018: nop
/*      */     //   1019: checkcast androidx/compose/ui/focus/FocusRequester
/*      */     //   1022: astore #14
/*      */     //   1024: aload #8
/*      */     //   1026: invokeinterface endReplaceGroup : ()V
/*      */     //   1031: aload #14
/*      */     //   1033: astore #13
/*      */     //   1035: aload #4
/*      */     //   1037: aload #8
/*      */     //   1039: ldc_w -2044198972
/*      */     //   1042: invokeinterface startReplaceGroup : (I)V
/*      */     //   1047: aload #8
/*      */     //   1049: astore #15
/*      */     //   1051: iload #11
/*      */     //   1053: ldc_w 57344
/*      */     //   1056: iand
/*      */     //   1057: sipush #16384
/*      */     //   1060: if_icmpne -> 1067
/*      */     //   1063: iconst_1
/*      */     //   1064: goto -> 1068
/*      */     //   1067: iconst_0
/*      */     //   1068: aload #8
/*      */     //   1070: aload #12
/*      */     //   1072: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   1077: ior
/*      */     //   1078: istore #16
/*      */     //   1080: iconst_0
/*      */     //   1081: istore #17
/*      */     //   1083: aload #15
/*      */     //   1085: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1090: astore #18
/*      */     //   1092: iconst_0
/*      */     //   1093: istore #19
/*      */     //   1095: iload #16
/*      */     //   1097: ifne -> 1111
/*      */     //   1100: aload #18
/*      */     //   1102: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1105: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1108: if_acmpne -> 1152
/*      */     //   1111: astore #52
/*      */     //   1113: iconst_0
/*      */     //   1114: istore #20
/*      */     //   1116: new org/jetbrains/jewel/ui/component/MenuKt$MenuSubmenuItem$5$1
/*      */     //   1119: dup
/*      */     //   1120: aload #4
/*      */     //   1122: aload #13
/*      */     //   1124: aload #12
/*      */     //   1126: aconst_null
/*      */     //   1127: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*      */     //   1130: checkcast kotlin/jvm/functions/Function2
/*      */     //   1133: aload #52
/*      */     //   1135: swap
/*      */     //   1136: astore #21
/*      */     //   1138: aload #15
/*      */     //   1140: aload #21
/*      */     //   1142: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1147: aload #21
/*      */     //   1149: goto -> 1154
/*      */     //   1152: aload #18
/*      */     //   1154: nop
/*      */     //   1155: nop
/*      */     //   1156: nop
/*      */     //   1157: checkcast kotlin/jvm/functions/Function2
/*      */     //   1160: astore #14
/*      */     //   1162: aload #8
/*      */     //   1164: invokeinterface endReplaceGroup : ()V
/*      */     //   1169: aload #14
/*      */     //   1171: aload #8
/*      */     //   1173: bipush #14
/*      */     //   1175: iload #11
/*      */     //   1177: bipush #12
/*      */     //   1179: ishr
/*      */     //   1180: iand
/*      */     //   1181: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1184: aload #5
/*      */     //   1186: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/MenuColors;
/*      */     //   1189: invokevirtual getItemColors : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*      */     //   1192: astore #14
/*      */     //   1194: aload #5
/*      */     //   1196: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   1199: astore #15
/*      */     //   1201: aload #14
/*      */     //   1203: aload #12
/*      */     //   1205: invokestatic MenuSubmenuItem$lambda$55 : (Landroidx/compose/runtime/MutableState;)J
/*      */     //   1208: aload #8
/*      */     //   1210: iconst_0
/*      */     //   1211: invokevirtual backgroundFor-VIR8D2g : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*      */     //   1214: astore #16
/*      */     //   1216: aload_0
/*      */     //   1217: fconst_0
/*      */     //   1218: iconst_1
/*      */     //   1219: aconst_null
/*      */     //   1220: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1223: aload #15
/*      */     //   1225: invokevirtual getItemMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */     //   1228: aload #16
/*      */     //   1230: invokestatic MenuSubmenuItem$lambda$60 : (Landroidx/compose/runtime/State;)J
/*      */     //   1233: invokestatic drawItemBackground-mxwnekA : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;J)Landroidx/compose/ui/Modifier;
/*      */     //   1236: aload #13
/*      */     //   1238: invokestatic focusRequester : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;
/*      */     //   1241: astore #17
/*      */     //   1243: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*      */     //   1246: invokevirtual getButton-o7Vup1c : ()I
/*      */     //   1249: istore #18
/*      */     //   1251: aload #17
/*      */     //   1253: aload #4
/*      */     //   1255: aconst_null
/*      */     //   1256: iload_1
/*      */     //   1257: aconst_null
/*      */     //   1258: iload #18
/*      */     //   1260: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*      */     //   1263: aload #8
/*      */     //   1265: ldc_w -2044160459
/*      */     //   1268: invokeinterface startReplaceGroup : (I)V
/*      */     //   1273: aload #8
/*      */     //   1275: astore #20
/*      */     //   1277: aload #8
/*      */     //   1279: aload #12
/*      */     //   1281: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   1286: istore #21
/*      */     //   1288: nop
/*      */     //   1289: iconst_0
/*      */     //   1290: istore #22
/*      */     //   1292: aload #20
/*      */     //   1294: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1299: astore #23
/*      */     //   1301: iconst_0
/*      */     //   1302: istore #24
/*      */     //   1304: iload #21
/*      */     //   1306: ifne -> 1320
/*      */     //   1309: aload #23
/*      */     //   1311: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1314: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1317: if_acmpne -> 1374
/*      */     //   1320: astore #57
/*      */     //   1322: astore #56
/*      */     //   1324: istore #55
/*      */     //   1326: astore #54
/*      */     //   1328: astore #53
/*      */     //   1330: astore #52
/*      */     //   1332: iconst_0
/*      */     //   1333: istore #25
/*      */     //   1335: aload #12
/*      */     //   1337: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*      */     //   1342: astore #58
/*      */     //   1344: aload #52
/*      */     //   1346: aload #53
/*      */     //   1348: aload #54
/*      */     //   1350: iload #55
/*      */     //   1352: aload #56
/*      */     //   1354: aload #57
/*      */     //   1356: aload #58
/*      */     //   1358: astore #26
/*      */     //   1360: aload #20
/*      */     //   1362: aload #26
/*      */     //   1364: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1369: aload #26
/*      */     //   1371: goto -> 1376
/*      */     //   1374: aload #23
/*      */     //   1376: nop
/*      */     //   1377: nop
/*      */     //   1378: nop
/*      */     //   1379: checkcast kotlin/jvm/functions/Function0
/*      */     //   1382: astore #19
/*      */     //   1384: aload #8
/*      */     //   1386: invokeinterface endReplaceGroup : ()V
/*      */     //   1391: aload #19
/*      */     //   1393: bipush #8
/*      */     //   1395: aconst_null
/*      */     //   1396: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1399: aload #8
/*      */     //   1401: ldc_w -2044150987
/*      */     //   1404: invokeinterface startReplaceGroup : (I)V
/*      */     //   1409: aload #8
/*      */     //   1411: astore #18
/*      */     //   1413: aload #8
/*      */     //   1415: aload #12
/*      */     //   1417: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   1422: istore #19
/*      */     //   1424: nop
/*      */     //   1425: iconst_0
/*      */     //   1426: istore #20
/*      */     //   1428: aload #18
/*      */     //   1430: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1435: astore #21
/*      */     //   1437: iconst_0
/*      */     //   1438: istore #22
/*      */     //   1440: iload #19
/*      */     //   1442: ifne -> 1456
/*      */     //   1445: aload #21
/*      */     //   1447: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1450: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1453: if_acmpne -> 1492
/*      */     //   1456: astore #52
/*      */     //   1458: iconst_0
/*      */     //   1459: istore #23
/*      */     //   1461: new org/jetbrains/jewel/ui/component/MenuKt$MenuSubmenuItem$7$1
/*      */     //   1464: dup
/*      */     //   1465: aload #12
/*      */     //   1467: invokespecial <init> : (Landroidx/compose/runtime/MutableState;)V
/*      */     //   1470: checkcast kotlin/jvm/functions/Function1
/*      */     //   1473: aload #52
/*      */     //   1475: swap
/*      */     //   1476: astore #24
/*      */     //   1478: aload #18
/*      */     //   1480: aload #24
/*      */     //   1482: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1487: aload #24
/*      */     //   1489: goto -> 1494
/*      */     //   1492: aload #21
/*      */     //   1494: nop
/*      */     //   1495: nop
/*      */     //   1496: nop
/*      */     //   1497: checkcast kotlin/jvm/functions/Function1
/*      */     //   1500: astore #17
/*      */     //   1502: aload #8
/*      */     //   1504: invokeinterface endReplaceGroup : ()V
/*      */     //   1509: aload #17
/*      */     //   1511: invokestatic onKeyEvent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1514: astore #17
/*      */     //   1516: iconst_0
/*      */     //   1517: istore #20
/*      */     //   1519: nop
/*      */     //   1520: iconst_0
/*      */     //   1521: istore #21
/*      */     //   1523: aload #8
/*      */     //   1525: ldc_w 733328855
/*      */     //   1528: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   1531: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1534: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   1537: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   1540: astore #18
/*      */     //   1542: iconst_0
/*      */     //   1543: istore #19
/*      */     //   1545: aload #18
/*      */     //   1547: iload #19
/*      */     //   1549: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1552: astore #22
/*      */     //   1554: bipush #112
/*      */     //   1556: iload #20
/*      */     //   1558: iconst_3
/*      */     //   1559: ishl
/*      */     //   1560: iand
/*      */     //   1561: istore #23
/*      */     //   1563: nop
/*      */     //   1564: iconst_0
/*      */     //   1565: istore #24
/*      */     //   1567: aload #8
/*      */     //   1569: ldc_w -1323940314
/*      */     //   1572: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   1575: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1578: aload #8
/*      */     //   1580: iconst_0
/*      */     //   1581: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   1584: istore #25
/*      */     //   1586: aload #8
/*      */     //   1588: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1593: astore #26
/*      */     //   1595: aload #8
/*      */     //   1597: aload #17
/*      */     //   1599: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   1602: astore #27
/*      */     //   1604: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1607: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   1610: astore #28
/*      */     //   1612: bipush #6
/*      */     //   1614: sipush #896
/*      */     //   1617: iload #23
/*      */     //   1619: bipush #6
/*      */     //   1621: ishl
/*      */     //   1622: iand
/*      */     //   1623: ior
/*      */     //   1624: istore #29
/*      */     //   1626: nop
/*      */     //   1627: iconst_0
/*      */     //   1628: istore #30
/*      */     //   1630: aload #8
/*      */     //   1632: ldc_w -692256719
/*      */     //   1635: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   1638: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1641: aload #8
/*      */     //   1643: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   1648: instanceof androidx/compose/runtime/Applier
/*      */     //   1651: ifne -> 1657
/*      */     //   1654: invokestatic invalidApplier : ()V
/*      */     //   1657: aload #8
/*      */     //   1659: invokeinterface startReusableNode : ()V
/*      */     //   1664: aload #8
/*      */     //   1666: invokeinterface getInserting : ()Z
/*      */     //   1671: ifeq -> 1686
/*      */     //   1674: aload #8
/*      */     //   1676: aload #28
/*      */     //   1678: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   1683: goto -> 1693
/*      */     //   1686: aload #8
/*      */     //   1688: invokeinterface useNode : ()V
/*      */     //   1693: aload #8
/*      */     //   1695: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   1698: astore #31
/*      */     //   1700: iconst_0
/*      */     //   1701: istore #32
/*      */     //   1703: aload #31
/*      */     //   1705: aload #22
/*      */     //   1707: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1710: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1713: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1716: aload #31
/*      */     //   1718: aload #26
/*      */     //   1720: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1723: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1726: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1729: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1732: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1735: astore #33
/*      */     //   1737: iconst_0
/*      */     //   1738: istore #34
/*      */     //   1740: aload #31
/*      */     //   1742: astore #35
/*      */     //   1744: iconst_0
/*      */     //   1745: istore #36
/*      */     //   1747: aload #35
/*      */     //   1749: invokeinterface getInserting : ()Z
/*      */     //   1754: ifne -> 1775
/*      */     //   1757: aload #35
/*      */     //   1759: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1764: iload #25
/*      */     //   1766: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1769: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   1772: ifne -> 1801
/*      */     //   1775: aload #35
/*      */     //   1777: iload #25
/*      */     //   1779: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1782: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1787: aload #31
/*      */     //   1789: iload #25
/*      */     //   1791: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1794: aload #33
/*      */     //   1796: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1801: nop
/*      */     //   1802: nop
/*      */     //   1803: nop
/*      */     //   1804: aload #31
/*      */     //   1806: aload #27
/*      */     //   1808: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1811: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1814: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1817: nop
/*      */     //   1818: nop
/*      */     //   1819: aload #8
/*      */     //   1821: bipush #14
/*      */     //   1823: iload #29
/*      */     //   1825: bipush #6
/*      */     //   1827: ishr
/*      */     //   1828: iand
/*      */     //   1829: istore #37
/*      */     //   1831: astore #38
/*      */     //   1833: iconst_0
/*      */     //   1834: istore #39
/*      */     //   1836: aload #38
/*      */     //   1838: ldc_w -2146769399
/*      */     //   1841: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   1844: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1847: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   1850: aload #38
/*      */     //   1852: bipush #6
/*      */     //   1854: bipush #112
/*      */     //   1856: iload #20
/*      */     //   1858: bipush #6
/*      */     //   1860: ishr
/*      */     //   1861: iand
/*      */     //   1862: ior
/*      */     //   1863: istore #40
/*      */     //   1865: astore #41
/*      */     //   1867: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   1870: astore #42
/*      */     //   1872: iconst_0
/*      */     //   1873: istore #43
/*      */     //   1875: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*      */     //   1878: aload #14
/*      */     //   1880: aload #12
/*      */     //   1882: invokestatic MenuSubmenuItem$lambda$55 : (Landroidx/compose/runtime/MutableState;)J
/*      */     //   1885: aload #41
/*      */     //   1887: iconst_0
/*      */     //   1888: invokevirtual contentFor-VIR8D2g : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*      */     //   1891: invokeinterface getValue : ()Ljava/lang/Object;
/*      */     //   1896: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*      */     //   1899: ldc_w -519464636
/*      */     //   1902: iconst_1
/*      */     //   1903: new org/jetbrains/jewel/ui/component/MenuKt$MenuSubmenuItem$8$1
/*      */     //   1906: dup
/*      */     //   1907: aload #15
/*      */     //   1909: iload_2
/*      */     //   1910: aload_3
/*      */     //   1911: aload #5
/*      */     //   1913: aload #14
/*      */     //   1915: aload #7
/*      */     //   1917: aload #12
/*      */     //   1919: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;ZLorg/jetbrains/jewel/ui/icon/IconKey;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/MutableState;)V
/*      */     //   1922: aload #41
/*      */     //   1924: bipush #54
/*      */     //   1926: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1929: checkcast kotlin/jvm/functions/Function2
/*      */     //   1932: aload #41
/*      */     //   1934: bipush #48
/*      */     //   1936: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*      */     //   1939: ior
/*      */     //   1940: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1943: aload #41
/*      */     //   1945: ldc_w -2104409423
/*      */     //   1948: invokeinterface startReplaceGroup : (I)V
/*      */     //   1953: aload #12
/*      */     //   1955: invokestatic MenuSubmenuItem$lambda$55 : (Landroidx/compose/runtime/MutableState;)J
/*      */     //   1958: invokestatic isSelected-impl : (J)Z
/*      */     //   1961: ifeq -> 2096
/*      */     //   1964: aload #41
/*      */     //   1966: ldc_w -2104406910
/*      */     //   1969: invokeinterface startReplaceGroup : (I)V
/*      */     //   1974: aload #41
/*      */     //   1976: astore #44
/*      */     //   1978: aload #41
/*      */     //   1980: aload #12
/*      */     //   1982: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   1987: istore #45
/*      */     //   1989: nop
/*      */     //   1990: iconst_0
/*      */     //   1991: istore #46
/*      */     //   1993: aload #44
/*      */     //   1995: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   2000: astore #47
/*      */     //   2002: iconst_0
/*      */     //   2003: istore #48
/*      */     //   2005: iload #45
/*      */     //   2007: ifne -> 2021
/*      */     //   2010: aload #47
/*      */     //   2012: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   2015: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   2018: if_acmpne -> 2047
/*      */     //   2021: iconst_0
/*      */     //   2022: istore #49
/*      */     //   2024: aload #12
/*      */     //   2026: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   2031: astore #50
/*      */     //   2033: aload #44
/*      */     //   2035: aload #50
/*      */     //   2037: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   2042: aload #50
/*      */     //   2044: goto -> 2049
/*      */     //   2047: aload #47
/*      */     //   2049: nop
/*      */     //   2050: nop
/*      */     //   2051: nop
/*      */     //   2052: checkcast kotlin/jvm/functions/Function1
/*      */     //   2055: astore #51
/*      */     //   2057: aload #41
/*      */     //   2059: invokeinterface endReplaceGroup : ()V
/*      */     //   2064: aload #51
/*      */     //   2066: aconst_null
/*      */     //   2067: aload #5
/*      */     //   2069: aload #6
/*      */     //   2071: aload #41
/*      */     //   2073: sipush #896
/*      */     //   2076: iload #11
/*      */     //   2078: bipush #9
/*      */     //   2080: ishr
/*      */     //   2081: iand
/*      */     //   2082: sipush #7168
/*      */     //   2085: iload #11
/*      */     //   2087: bipush #9
/*      */     //   2089: ishr
/*      */     //   2090: iand
/*      */     //   2091: ior
/*      */     //   2092: iconst_2
/*      */     //   2093: invokestatic Submenu : (Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*      */     //   2096: aload #41
/*      */     //   2098: invokeinterface endReplaceGroup : ()V
/*      */     //   2103: nop
/*      */     //   2104: aload #38
/*      */     //   2106: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2109: aload #8
/*      */     //   2111: invokeinterface endNode : ()V
/*      */     //   2116: aload #8
/*      */     //   2118: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2121: nop
/*      */     //   2122: aload #8
/*      */     //   2124: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2127: nop
/*      */     //   2128: aload #8
/*      */     //   2130: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   2133: nop
/*      */     //   2134: invokestatic isTraceInProgress : ()Z
/*      */     //   2137: ifeq -> 2153
/*      */     //   2140: invokestatic traceEventEnd : ()V
/*      */     //   2143: goto -> 2153
/*      */     //   2146: aload #8
/*      */     //   2148: invokeinterface skipToGroupEnd : ()V
/*      */     //   2153: aload #8
/*      */     //   2155: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   2160: dup
/*      */     //   2161: ifnull -> 2193
/*      */     //   2164: aload_0
/*      */     //   2165: iload_1
/*      */     //   2166: iload_2
/*      */     //   2167: aload_3
/*      */     //   2168: aload #4
/*      */     //   2170: aload #5
/*      */     //   2172: aload #6
/*      */     //   2174: aload #7
/*      */     //   2176: iload #9
/*      */     //   2178: iload #10
/*      */     //   2180: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/icon/IconKey;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*      */     //   2185: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   2190: goto -> 2194
/*      */     //   2193: pop
/*      */     //   2194: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #477	-> 15
/*      */     //   #469	-> 506
/*      */     //   #470	-> 520
/*      */     //   #473	-> 530
/*      */     //   #1051	-> 550
/*      */     //   #1052	-> 562
/*      */     //   #1053	-> 573
/*      */     //   #473	-> 576
/*      */     //   #1053	-> 579
/*      */     //   #1054	-> 581
/*      */     //   #1055	-> 590
/*      */     //   #1056	-> 595
/*      */     //   #1052	-> 597
/*      */     //   #1051	-> 598
/*      */     //   #1051	-> 599
/*      */     //   #473	-> 600
/*      */     //   #474	-> 624
/*      */     //   #477	-> 692
/*      */     //   #479	-> 728
/*      */     //   #1057	-> 732
/*      */     //   #1058	-> 744
/*      */     //   #1059	-> 760
/*      */     //   #479	-> 763
/*      */     //   #1059	-> 787
/*      */     //   #1060	-> 789
/*      */     //   #1061	-> 798
/*      */     //   #1062	-> 803
/*      */     //   #1058	-> 805
/*      */     //   #1057	-> 806
/*      */     //   #1057	-> 807
/*      */     //   #479	-> 808
/*      */     //   #478	-> 822
/*      */     //   #481	-> 855
/*      */     //   #1063	-> 859
/*      */     //   #1064	-> 871
/*      */     //   #1065	-> 887
/*      */     //   #481	-> 890
/*      */     //   #1065	-> 915
/*      */     //   #1066	-> 917
/*      */     //   #1067	-> 926
/*      */     //   #1068	-> 931
/*      */     //   #1064	-> 933
/*      */     //   #1063	-> 934
/*      */     //   #1063	-> 935
/*      */     //   #483	-> 961
/*      */     //   #1069	-> 965
/*      */     //   #1070	-> 977
/*      */     //   #1071	-> 988
/*      */     //   #483	-> 991
/*      */     //   #1071	-> 998
/*      */     //   #1072	-> 1000
/*      */     //   #1073	-> 1009
/*      */     //   #1074	-> 1014
/*      */     //   #1070	-> 1016
/*      */     //   #1069	-> 1017
/*      */     //   #1069	-> 1018
/*      */     //   #483	-> 1019
/*      */     //   #485	-> 1035
/*      */     //   #1075	-> 1083
/*      */     //   #1076	-> 1095
/*      */     //   #1077	-> 1111
/*      */     //   #485	-> 1116
/*      */     //   #1077	-> 1136
/*      */     //   #1078	-> 1138
/*      */     //   #1079	-> 1147
/*      */     //   #1080	-> 1152
/*      */     //   #1076	-> 1154
/*      */     //   #1075	-> 1155
/*      */     //   #1075	-> 1156
/*      */     //   #485	-> 1157
/*      */     //   #504	-> 1184
/*      */     //   #505	-> 1194
/*      */     //   #507	-> 1201
/*      */     //   #510	-> 1216
/*      */     //   #511	-> 1217
/*      */     //   #512	-> 1223
/*      */     //   #513	-> 1236
/*      */     //   #517	-> 1243
/*      */     //   #513	-> 1251
/*      */     //   #518	-> 1253
/*      */     //   #519	-> 1255
/*      */     //   #516	-> 1256
/*      */     //   #514	-> 1257
/*      */     //   #517	-> 1258
/*      */     //   #515	-> 1288
/*      */     //   #1081	-> 1292
/*      */     //   #1082	-> 1304
/*      */     //   #1083	-> 1320
/*      */     //   #515	-> 1335
/*      */     //   #1083	-> 1358
/*      */     //   #1084	-> 1360
/*      */     //   #1085	-> 1369
/*      */     //   #1086	-> 1374
/*      */     //   #1082	-> 1376
/*      */     //   #1081	-> 1377
/*      */     //   #1081	-> 1378
/*      */     //   #515	-> 1379
/*      */     //   #514	-> 1393
/*      */     //   #521	-> 1424
/*      */     //   #1087	-> 1428
/*      */     //   #1088	-> 1440
/*      */     //   #1089	-> 1456
/*      */     //   #521	-> 1461
/*      */     //   #1089	-> 1476
/*      */     //   #1090	-> 1478
/*      */     //   #1091	-> 1487
/*      */     //   #1092	-> 1492
/*      */     //   #1088	-> 1494
/*      */     //   #1087	-> 1495
/*      */     //   #1087	-> 1496
/*      */     //   #521	-> 1497
/*      */     //   #508	-> 1519
/*      */     //   #1093	-> 1531
/*      */     //   #1094	-> 1534
/*      */     //   #1095	-> 1542
/*      */     //   #1098	-> 1545
/*      */     //   #1099	-> 1563
/*      */     //   #1100	-> 1575
/*      */     //   #1101	-> 1581
/*      */     //   #1102	-> 1588
/*      */     //   #1103	-> 1597
/*      */     //   #1105	-> 1604
/*      */     //   #1104	-> 1626
/*      */     //   #1106	-> 1638
/*      */     //   #1107	-> 1641
/*      */     //   #1108	-> 1659
/*      */     //   #1109	-> 1664
/*      */     //   #1110	-> 1676
/*      */     //   #1112	-> 1688
/*      */     //   #1114	-> 1693
/*      */     //   #1115	-> 1703
/*      */     //   #1116	-> 1716
/*      */     //   #1118	-> 1729
/*      */     //   #1119	-> 1740
/*      */     //   #1120	-> 1747
/*      */     //   #1121	-> 1775
/*      */     //   #1122	-> 1787
/*      */     //   #1124	-> 1801
/*      */     //   #1119	-> 1802
/*      */     //   #1124	-> 1803
/*      */     //   #1125	-> 1804
/*      */     //   #1126	-> 1817
/*      */     //   #1114	-> 1818
/*      */     //   #1127	-> 1819
/*      */     //   #1128	-> 1844
/*      */     //   #530	-> 1875
/*      */     //   #556	-> 1953
/*      */     //   #558	-> 1989
/*      */     //   #1129	-> 1993
/*      */     //   #1130	-> 2005
/*      */     //   #1131	-> 2021
/*      */     //   #558	-> 2024
/*      */     //   #1131	-> 2031
/*      */     //   #1132	-> 2033
/*      */     //   #1133	-> 2042
/*      */     //   #1134	-> 2047
/*      */     //   #1130	-> 2049
/*      */     //   #1129	-> 2050
/*      */     //   #1129	-> 2051
/*      */     //   #558	-> 2052
/*      */     //   #566	-> 2067
/*      */     //   #567	-> 2069
/*      */     //   #557	-> 2093
/*      */     //   #570	-> 2103
/*      */     //   #1128	-> 2104
/*      */     //   #1127	-> 2109
/*      */     //   #1135	-> 2111
/*      */     //   #1106	-> 2118
/*      */     //   #1136	-> 2121
/*      */     //   #1100	-> 2124
/*      */     //   #1137	-> 2127
/*      */     //   #1093	-> 2130
/*      */     //   #1138	-> 2133
/*      */     //   #571	-> 2146
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   576	3	18	$i$a$-cache-MenuKt$MenuSubmenuItem$3	I
/*      */     //   581	11	18	value$iv	Ljava/lang/Object;
/*      */     //   562	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   559	39	16	it$iv	Ljava/lang/Object;
/*      */     //   550	50	15	$i$f$cache	I
/*      */     //   547	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   547	53	14	invalid$iv	Z
/*      */     //   763	24	19	$i$a$-cache-MenuKt$MenuSubmenuItem$itemState$2	I
/*      */     //   789	11	20	value$iv	Ljava/lang/Object;
/*      */     //   744	62	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   741	65	17	it$iv	Ljava/lang/Object;
/*      */     //   732	76	16	$i$f$cache	I
/*      */     //   729	79	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   729	79	15	invalid$iv	Z
/*      */     //   890	22	18	$i$a$-cache-MenuKt$MenuSubmenuItem$4	I
/*      */     //   917	11	19	value$iv	Ljava/lang/Object;
/*      */     //   871	63	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   868	66	16	it$iv	Ljava/lang/Object;
/*      */     //   859	77	15	$i$f$cache	I
/*      */     //   856	80	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   856	80	14	invalid$iv	Z
/*      */     //   991	7	20	$i$a$-cache-MenuKt$MenuSubmenuItem$focusRequester$1	I
/*      */     //   1000	11	20	value$iv	Ljava/lang/Object;
/*      */     //   977	40	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   974	43	18	it$iv	Ljava/lang/Object;
/*      */     //   965	54	17	$i$f$cache	I
/*      */     //   962	57	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   962	57	16	invalid$iv	Z
/*      */     //   1116	17	20	$i$a$-cache-MenuKt$MenuSubmenuItem$5	I
/*      */     //   1138	11	21	value$iv	Ljava/lang/Object;
/*      */     //   1095	60	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1092	63	18	it$iv	Ljava/lang/Object;
/*      */     //   1083	74	17	$i$f$cache	I
/*      */     //   1080	77	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1080	77	16	invalid$iv	Z
/*      */     //   1335	7	25	$i$a$-cache-MenuKt$MenuSubmenuItem$6	I
/*      */     //   1360	11	26	value$iv	Ljava/lang/Object;
/*      */     //   1304	73	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1301	76	23	it$iv	Ljava/lang/Object;
/*      */     //   1292	87	22	$i$f$cache	I
/*      */     //   1289	90	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1289	90	21	invalid$iv	Z
/*      */     //   1461	12	23	$i$a$-cache-MenuKt$MenuSubmenuItem$7	I
/*      */     //   1478	11	24	value$iv	Ljava/lang/Object;
/*      */     //   1440	55	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1437	58	21	it$iv	Ljava/lang/Object;
/*      */     //   1428	69	20	$i$f$cache	I
/*      */     //   1425	72	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1425	72	19	invalid$iv	Z
/*      */     //   2024	7	49	$i$a$-cache-MenuKt$MenuSubmenuItem$8$2	I
/*      */     //   2033	11	50	value$iv	Ljava/lang/Object;
/*      */     //   2005	45	48	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   2002	48	47	it$iv	Ljava/lang/Object;
/*      */     //   1993	59	46	$i$f$cache	I
/*      */     //   1990	62	44	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1990	62	45	invalid$iv	Z
/*      */     //   1875	229	43	$i$a$-Box-MenuKt$MenuSubmenuItem$8	I
/*      */     //   1872	232	42	$this$MenuSubmenuItem_u24lambda_u2466	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   1872	232	41	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   1872	232	40	$changed	I
/*      */     //   1836	273	39	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   1833	276	38	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1833	276	37	$changed$iv	I
/*      */     //   1747	55	36	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   1744	58	35	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1740	64	34	$i$f$set-impl	I
/*      */     //   1737	67	33	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   1703	115	32	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   1700	118	31	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1630	492	30	$i$f$ReusableComposeNode	I
/*      */     //   1627	495	28	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   1627	495	29	$changed$iv$iv$iv	I
/*      */     //   1567	561	24	$i$f$Layout	I
/*      */     //   1586	542	25	compositeKeyHash$iv$iv	I
/*      */     //   1595	533	26	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1604	524	27	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1564	564	23	$changed$iv$iv	I
/*      */     //   1523	611	21	$i$f$Box	I
/*      */     //   1554	580	22	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1520	614	17	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1542	592	18	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   1545	589	19	propagateMinConstraints$iv	Z
/*      */     //   1520	614	20	$changed$iv	I
/*      */     //   824	1319	12	itemState$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   1035	1108	13	focusRequester	Landroidx/compose/ui/focus/FocusRequester;
/*      */     //   1194	949	14	itemColors	Lorg/jetbrains/jewel/ui/component/styling/MenuItemColors;
/*      */     //   1201	942	15	menuMetrics	Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   1216	927	16	backgroundColor$delegate	Landroidx/compose/runtime/State;
/*      */     //   31	2164	11	$dirty	I
/*      */     //   0	2195	0	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	2195	1	enabled	Z
/*      */     //   0	2195	2	canShowIcon	Z
/*      */     //   0	2195	3	iconKey	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*      */     //   0	2195	4	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   0	2195	5	style	Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   0	2195	6	submenu	Lkotlin/jvm/functions/Function1;
/*      */     //   0	2195	7	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	2195	8	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	2195	9	$changed	I }
/* 1192 */   private static final long MenuSubmenuItem$lambda$55(MutableState $itemState$delegate) { State state = (State)$itemState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((MenuItemState)state.getValue()).unbox-impl(); } private static final void MenuSubmenuItem$lambda$56(MutableState $itemState$delegate, long <set-?>) { MutableState mutableState = $itemState$delegate; Object object1 = null, object2 = null; Object value$iv = MenuItemState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 1193 */     mutableState.setValue(value$iv); } @DebugMetadata(f = "Menu.kt", l = {486}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.MenuKt$MenuSubmenuItem$5$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class MenuKt$MenuSubmenuItem$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label; MenuKt$MenuSubmenuItem$5$1(MutableInteractionSource $interactionSource, FocusRequester $focusRequester, MutableState<MenuItemState> $itemState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusRequester, this.$itemState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), true, false, false, true, false, false, 54, null)); this.$focusRequester.requestFocus(); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, true, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }
/* 1195 */               (Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusRequester, this.$itemState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), true, false, false, true, false, false, 54, null)); this.$focusRequester.requestFocus(); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, true, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), false, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super MenuKt$MenuSubmenuItem$5$1> $completion) { return (Continuation<Unit>)new MenuKt$MenuSubmenuItem$5$1(this.$interactionSource, this.$focusRequester, this.$itemState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MenuKt$MenuSubmenuItem$5$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final long MenuSubmenuItem$lambda$60(State $backgroundColor$delegate) { State state = $backgroundColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } private static final Unit MenuSubmenuItem$lambda$62$lambda$61(MutableState<MenuItemState> $itemState$delegate) { MenuSubmenuItem$lambda$56($itemState$delegate, MenuItemState.copy-moUeATs$default(MenuSubmenuItem$lambda$55($itemState$delegate), !MenuItemState.isSelected-impl(MenuSubmenuItem$lambda$55($itemState$delegate)), false, false, false, false, false, 62, null)); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class MenuKt$MenuSubmenuItem$7$1 implements Function1<KeyEvent, Boolean> {
/* 1196 */     public final Boolean invoke-ZmokQxo(Object it) { Intrinsics.checkNotNullParameter(it, "it"); MenuKt.MenuSubmenuItem$lambda$56(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.MenuSubmenuItem$lambda$55(this.$itemState$delegate), true, false, false, false, false, false, 62, null)); return Boolean.valueOf((KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getDirectionRight-EK5gGoQ()))); } MenuKt$MenuSubmenuItem$7$1(MutableState<MenuItemState> $itemState$delegate) {} } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$MenuSubmenuItem$8$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,706:1\n149#2:707\n99#3,3:708\n102#3:739\n106#3:783\n79#4,6:711\n86#4,4:726\n90#4,2:736\n79#4,6:747\n86#4,4:762\n90#4,2:772\n94#4:778\n94#4:782\n368#5,9:717\n377#5:738\n368#5,9:753\n377#5:774\n378#5,2:776\n378#5,2:780\n4034#6,6:730\n4034#6,6:766\n71#7:740\n68#7,6:741\n74#7:775\n78#7:779\n*S KotlinDebug\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$MenuSubmenuItem$8$1\n*L\n534#1:707\n531#1:708,3\n531#1:739\n531#1:783\n531#1:711,6\n531#1:726,4\n531#1:736,2\n544#1:747,6\n544#1:762,4\n544#1:772,2\n544#1:778\n531#1:782\n531#1:717,9\n531#1:738\n544#1:753,9\n544#1:774\n544#1:776,2\n531#1:780,2\n531#1:730,6\n544#1:766,6\n544#1:740\n544#1:741,6\n544#1:775\n544#1:779\n*E\n"}) static final class MenuKt$MenuSubmenuItem$8$1 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-519464636, $changed, -1, "org.jetbrains.jewel.ui.component.MenuSubmenuItem.<anonymous>.<anonymous> (Menu.kt:530)");  Modifier modifier1 = PaddingKt.padding(SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null), this.$menuMetrics.getItemMetrics().getContentPadding()); Alignment.Vertical vertical = Alignment.Companion.getCenterVertically(); int $this$dp$iv = 4, $i$f$getDp = 0; Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.spacedBy-0680j_4(Dp.constructor-impl($this$dp$iv)); boolean bool1 = this.$canShowIcon; IconKey iconKey1 = this.$iconKey; MenuStyle menuStyle = this.$style; MenuItemColors menuItemColors = this.$itemColors; Function2<Composer, Integer, Unit> function2 = this.$content; MutableState<MenuItemState> mutableState = this.$itemState$delegate; int $changed$iv = 432, $i$f$Row = 0; ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo"); MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function01 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function01); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u241 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-MenuKt$MenuSubmenuItem$8$1$1 = 0; composer1.startReplaceGroup(-1343092022); if (bool1) if (iconKey1 != null) { composer1.startReplaceGroup(1313874034); IconKt.Icon-FHprtrg(iconKey1, (String)null, (Modifier)null, (Class<?>)null, 0L, new PainterHint[0], composer1, 48, 28); composer1.endReplaceGroup(); } else { composer1.startReplaceGroup(1313973482); BoxKt.Box(SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, menuStyle.getMetrics().getItemMetrics().getIconSize-D9Ej5fM()), composer1, 0); composer1.endReplaceGroup(); }   composer1.endReplaceGroup(); Modifier modifier2 = RowScope.weight$default($this$invoke_u24lambda_u241, (Modifier)Modifier.Companion, 1.0F, false, 2, null); int k = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart(composer1, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int m = 0x70 & k << 3; int n = 0; ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int i1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0); CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap(); Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier2); Function0 function02 = ComposeUiNode.Companion.getConstructor(); int i2 = 0x6 | 0x380 & m << 6; int i3 = 0; ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1.startReusableNode(); if (composer1.getInserting()) { composer1.createNode(function02); } else { composer1.useNode(); }  Composer composer2 = Updater.constructor-impl(composer1); int i4 = 0; Updater.set-impl(composer2, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl(composer2, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i5 = 0; Composer composer3 = composer2; int i6 = 0; if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i1))) { composer3.updateRememberedValue(Integer.valueOf(i1)); composer2.apply(Integer.valueOf(i1), function21); }  Updater.set-impl(composer2, modifier4, ComposeUiNode.Companion.getSetModifier()); int i7 = 0xE & i2 >> 6; Composer composer4 = composer1; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int i8 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; BoxScope $this$invoke_u24lambda_u241_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-MenuKt$MenuSubmenuItem$8$1$1$1 = 0; function2.invoke(composer5, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd(composer4); composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1); ComposerKt.sourceInformationMarkerEnd(composer1); ComposerKt.sourceInformationMarkerEnd(composer1); IconKey iconKey2 = menuStyle.getIcons().getSubmenuChevron(); long l = ((Color)menuItemColors.iconTintFor-VIR8D2g(MenuKt.MenuSubmenuItem$lambda$55(mutableState), composer1, 0).getValue()).unbox-impl(); Modifier modifier3 = SizeKt.size-3ABfNKs((Modifier)Modifier.Companion, menuStyle.getMetrics().getItemMetrics().getIconSize-D9Ej5fM()); PainterHint painterHint = StatefulKt.Stateful((InteractiveComponentState)MenuItemState.box-impl(MenuKt.MenuSubmenuItem$lambda$55(mutableState))); IconKt.Icon-FHprtrg(iconKey2, (String)null, modifier3, (Class<?>)null, l, painterHint, composer1, 48, 8); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } MenuKt$MenuSubmenuItem$8$1(MenuMetrics $menuMetrics, boolean $canShowIcon, IconKey $iconKey, MenuStyle $style, MenuItemColors $itemColors, Function2<Composer, Integer, Unit> $content, MutableState<MenuItemState> $itemState$delegate) {} } private static final boolean MenuSubmenuItem$lambda$66$lambda$65$lambda$64(MutableState<MenuItemState> $itemState$delegate, InputMode it) { int i = InputMode.Companion.getTouch-aOaMEAU(); MenuSubmenuItem$lambda$56($itemState$delegate, MenuItemState.copy-moUeATs$default(MenuSubmenuItem$lambda$55($itemState$delegate), false, false, false, false, false, false, 62, null)); return !(((it == null) ? false : InputMode.equals-impl0(it.unbox-impl(), i)) && MenuItemState.isHovered-impl(MenuSubmenuItem$lambda$55($itemState$delegate))); } private static final FocusManager Submenu$lambda$71(MutableState $focusManager$delegate) { State state = (State)$focusManager$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (FocusManager)state.getValue(); }
/*      */   private static final Modifier drawItemBackground-mxwnekA(Modifier $this$drawItemBackground_u2dmxwnekA, MenuItemMetrics itemMetrics, long backgroundColor) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_1
/*      */     //   2: lload_2
/*      */     //   3: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;J)Lkotlin/jvm/functions/Function1;
/*      */     //   8: invokestatic drawBehind : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   11: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #573	-> 0
/*      */     //   #589	-> 11
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   0	12	0	$this$drawItemBackground_u2dmxwnekA	Landroidx/compose/ui/Modifier;
/*      */     //   0	12	1	itemMetrics	Lorg/jetbrains/jewel/ui/component/styling/MenuItemMetrics;
/*      */     //   0	12	2	backgroundColor	J } private static final Unit drawItemBackground_mxwnekA$lambda$68(MenuItemMetrics $itemMetrics, long $backgroundColor, DrawScope $this$drawBehind) { Intrinsics.checkNotNullParameter($this$drawBehind, "$this$drawBehind"); float cornerSizePx = $itemMetrics.getSelectionCornerSize().toPx-TmRCtEA($this$drawBehind.getSize-NH-jbRc(), (Density)$this$drawBehind); long cornerRadius = CornerRadiusKt.CornerRadius(cornerSizePx, cornerSizePx); PaddingValues outerPadding = $itemMetrics.getOuterPadding(); long offset = OffsetKt.Offset($this$drawBehind.toPx-0680j_4(outerPadding.calculateLeftPadding-u2uoSUM($this$drawBehind.getLayoutDirection())), $this$drawBehind.toPx-0680j_4(outerPadding.calculateTopPadding-D9Ej5fM())); long l1 = subtract-Cqks5Fs($this$drawBehind.getSize-NH-jbRc(), outerPadding, (Density)$this$drawBehind, $this$drawBehind.getLayoutDirection()); DrawScope.drawRoundRect-u-Aw5IA$default($this$drawBehind, $backgroundColor, offset, l1, cornerRadius, null, 0.0F, null, 0, 240, null); return Unit.INSTANCE; } private static final long subtract-Cqks5Fs(long $this$subtract_u2dCqks5Fs, PaddingValues paddingValues, Density density, LayoutDirection layoutDirection) { Density $this$subtract_Cqks5Fs_u24lambda_u2469 = density; int $i$a$-with-MenuKt$subtract$1 = 0; return SizeKt.Size(Size.getWidth-impl($this$subtract_u2dCqks5Fs) - $this$subtract_Cqks5Fs_u24lambda_u2469.toPx-0680j_4(paddingValues.calculateLeftPadding-u2uoSUM(layoutDirection)) - $this$subtract_Cqks5Fs_u24lambda_u2469.toPx-0680j_4(paddingValues.calculateRightPadding-u2uoSUM(layoutDirection)), Size.getHeight-impl($this$subtract_u2dCqks5Fs) - $this$subtract_Cqks5Fs_u24lambda_u2469.toPx-0680j_4(paddingValues.calculateTopPadding-D9Ej5fM()) - $this$subtract_Cqks5Fs_u24lambda_u2469.toPx-0680j_4(paddingValues.calculateBottomPadding-D9Ej5fM())); } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void Submenu(@NotNull Function1 onDismissRequest, @Nullable Modifier modifier, @Nullable MenuStyle style, @NotNull Function1 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 'onDismissRequest'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_3
/*      */     //   7: ldc 'content'
/*      */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   12: aload #4
/*      */     //   14: ldc_w 84801871
/*      */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   22: astore #4
/*      */     //   24: iload #5
/*      */     //   26: istore #7
/*      */     //   28: iload #6
/*      */     //   30: iconst_1
/*      */     //   31: iand
/*      */     //   32: ifeq -> 45
/*      */     //   35: iload #7
/*      */     //   37: bipush #6
/*      */     //   39: ior
/*      */     //   40: istore #7
/*      */     //   42: goto -> 74
/*      */     //   45: iload #5
/*      */     //   47: bipush #6
/*      */     //   49: iand
/*      */     //   50: ifne -> 74
/*      */     //   53: iload #7
/*      */     //   55: aload #4
/*      */     //   57: aload_0
/*      */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   63: ifeq -> 70
/*      */     //   66: iconst_4
/*      */     //   67: goto -> 71
/*      */     //   70: iconst_2
/*      */     //   71: ior
/*      */     //   72: istore #7
/*      */     //   74: iload #6
/*      */     //   76: iconst_2
/*      */     //   77: iand
/*      */     //   78: ifeq -> 91
/*      */     //   81: iload #7
/*      */     //   83: bipush #48
/*      */     //   85: ior
/*      */     //   86: istore #7
/*      */     //   88: goto -> 122
/*      */     //   91: iload #5
/*      */     //   93: bipush #48
/*      */     //   95: iand
/*      */     //   96: ifne -> 122
/*      */     //   99: iload #7
/*      */     //   101: aload #4
/*      */     //   103: aload_1
/*      */     //   104: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   109: ifeq -> 117
/*      */     //   112: bipush #32
/*      */     //   114: goto -> 119
/*      */     //   117: bipush #16
/*      */     //   119: ior
/*      */     //   120: istore #7
/*      */     //   122: iload #5
/*      */     //   124: sipush #384
/*      */     //   127: iand
/*      */     //   128: ifne -> 163
/*      */     //   131: iload #7
/*      */     //   133: iload #6
/*      */     //   135: iconst_4
/*      */     //   136: iand
/*      */     //   137: ifne -> 157
/*      */     //   140: aload #4
/*      */     //   142: aload_2
/*      */     //   143: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   148: ifeq -> 157
/*      */     //   151: sipush #256
/*      */     //   154: goto -> 160
/*      */     //   157: sipush #128
/*      */     //   160: ior
/*      */     //   161: istore #7
/*      */     //   163: iload #6
/*      */     //   165: bipush #8
/*      */     //   167: iand
/*      */     //   168: ifeq -> 182
/*      */     //   171: iload #7
/*      */     //   173: sipush #3072
/*      */     //   176: ior
/*      */     //   177: istore #7
/*      */     //   179: goto -> 216
/*      */     //   182: iload #5
/*      */     //   184: sipush #3072
/*      */     //   187: iand
/*      */     //   188: ifne -> 216
/*      */     //   191: iload #7
/*      */     //   193: aload #4
/*      */     //   195: aload_3
/*      */     //   196: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   201: ifeq -> 210
/*      */     //   204: sipush #2048
/*      */     //   207: goto -> 213
/*      */     //   210: sipush #1024
/*      */     //   213: ior
/*      */     //   214: istore #7
/*      */     //   216: iload #7
/*      */     //   218: sipush #1171
/*      */     //   221: iand
/*      */     //   222: sipush #1170
/*      */     //   225: if_icmpne -> 238
/*      */     //   228: aload #4
/*      */     //   230: invokeinterface getSkipping : ()Z
/*      */     //   235: ifne -> 1190
/*      */     //   238: aload #4
/*      */     //   240: invokeinterface startDefaults : ()V
/*      */     //   245: iload #5
/*      */     //   247: iconst_1
/*      */     //   248: iand
/*      */     //   249: ifeq -> 262
/*      */     //   252: aload #4
/*      */     //   254: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   259: ifeq -> 305
/*      */     //   262: iload #6
/*      */     //   264: iconst_2
/*      */     //   265: iand
/*      */     //   266: ifeq -> 276
/*      */     //   269: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   272: checkcast androidx/compose/ui/Modifier
/*      */     //   275: astore_1
/*      */     //   276: iload #6
/*      */     //   278: iconst_4
/*      */     //   279: iand
/*      */     //   280: ifeq -> 327
/*      */     //   283: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   286: aload #4
/*      */     //   288: bipush #6
/*      */     //   290: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   293: astore_2
/*      */     //   294: iload #7
/*      */     //   296: sipush #-897
/*      */     //   299: iand
/*      */     //   300: istore #7
/*      */     //   302: goto -> 327
/*      */     //   305: aload #4
/*      */     //   307: invokeinterface skipToGroupEnd : ()V
/*      */     //   312: iload #6
/*      */     //   314: iconst_4
/*      */     //   315: iand
/*      */     //   316: ifeq -> 327
/*      */     //   319: iload #7
/*      */     //   321: sipush #-897
/*      */     //   324: iand
/*      */     //   325: istore #7
/*      */     //   327: aload #4
/*      */     //   329: invokeinterface endDefaults : ()V
/*      */     //   334: invokestatic isTraceInProgress : ()Z
/*      */     //   337: ifeq -> 352
/*      */     //   340: ldc_w 84801871
/*      */     //   343: iload #7
/*      */     //   345: iconst_m1
/*      */     //   346: ldc_w 'org.jetbrains.jewel.ui.component.Submenu (Menu.kt:606)'
/*      */     //   349: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   352: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*      */     //   355: checkcast androidx/compose/runtime/CompositionLocal
/*      */     //   358: astore #9
/*      */     //   360: iconst_0
/*      */     //   361: istore #10
/*      */     //   363: iconst_0
/*      */     //   364: istore #11
/*      */     //   366: aload #4
/*      */     //   368: ldc 2023513938
/*      */     //   370: ldc 'CC:CompositionLocal.kt#9igjgp'
/*      */     //   372: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   375: aload #4
/*      */     //   377: aload #9
/*      */     //   379: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*      */     //   384: astore #12
/*      */     //   386: aload #4
/*      */     //   388: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   391: aload #12
/*      */     //   393: checkcast androidx/compose/ui/unit/Density
/*      */     //   396: astore #8
/*      */     //   398: new org/jetbrains/jewel/ui/component/AnchorHorizontalMenuPositionProvider
/*      */     //   401: dup
/*      */     //   402: aload_2
/*      */     //   403: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   406: invokevirtual getSubmenuMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SubmenuMetrics;
/*      */     //   409: invokevirtual getOffset-RKDOV3M : ()J
/*      */     //   412: aload_2
/*      */     //   413: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*      */     //   416: invokevirtual getMenuMargin : ()Landroidx/compose/foundation/layout/PaddingValues;
/*      */     //   419: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   422: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*      */     //   425: aload #8
/*      */     //   427: aconst_null
/*      */     //   428: invokespecial <init> : (JLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   431: astore #9
/*      */     //   433: aload #4
/*      */     //   435: ldc_w -221011678
/*      */     //   438: invokeinterface startReplaceGroup : (I)V
/*      */     //   443: aload #4
/*      */     //   445: astore #12
/*      */     //   447: iconst_0
/*      */     //   448: istore #13
/*      */     //   450: nop
/*      */     //   451: iconst_0
/*      */     //   452: istore #14
/*      */     //   454: aload #12
/*      */     //   456: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   461: astore #15
/*      */     //   463: iconst_0
/*      */     //   464: istore #16
/*      */     //   466: aload #15
/*      */     //   468: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   471: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   474: if_acmpne -> 503
/*      */     //   477: iconst_0
/*      */     //   478: istore #17
/*      */     //   480: aconst_null
/*      */     //   481: aconst_null
/*      */     //   482: iconst_2
/*      */     //   483: aconst_null
/*      */     //   484: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   487: astore #17
/*      */     //   489: aload #12
/*      */     //   491: aload #17
/*      */     //   493: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   498: aload #17
/*      */     //   500: goto -> 505
/*      */     //   503: aload #15
/*      */     //   505: nop
/*      */     //   506: nop
/*      */     //   507: nop
/*      */     //   508: checkcast androidx/compose/runtime/MutableState
/*      */     //   511: astore #11
/*      */     //   513: aload #4
/*      */     //   515: invokeinterface endReplaceGroup : ()V
/*      */     //   520: aload #11
/*      */     //   522: astore #10
/*      */     //   524: aload #4
/*      */     //   526: ldc_w -221009086
/*      */     //   529: invokeinterface startReplaceGroup : (I)V
/*      */     //   534: aload #4
/*      */     //   536: astore #13
/*      */     //   538: iconst_0
/*      */     //   539: istore #14
/*      */     //   541: nop
/*      */     //   542: iconst_0
/*      */     //   543: istore #15
/*      */     //   545: aload #13
/*      */     //   547: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   552: astore #16
/*      */     //   554: iconst_0
/*      */     //   555: istore #17
/*      */     //   557: aload #16
/*      */     //   559: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   562: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   565: if_acmpne -> 594
/*      */     //   568: iconst_0
/*      */     //   569: istore #18
/*      */     //   571: aconst_null
/*      */     //   572: aconst_null
/*      */     //   573: iconst_2
/*      */     //   574: aconst_null
/*      */     //   575: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   578: astore #18
/*      */     //   580: aload #13
/*      */     //   582: aload #18
/*      */     //   584: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   589: aload #18
/*      */     //   591: goto -> 596
/*      */     //   594: aload #16
/*      */     //   596: nop
/*      */     //   597: nop
/*      */     //   598: nop
/*      */     //   599: checkcast androidx/compose/runtime/MutableState
/*      */     //   602: astore #12
/*      */     //   604: aload #4
/*      */     //   606: invokeinterface endReplaceGroup : ()V
/*      */     //   611: aload #12
/*      */     //   613: astore #11
/*      */     //   615: invokestatic getLocalMenuManager : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*      */     //   618: checkcast androidx/compose/runtime/CompositionLocal
/*      */     //   621: astore #13
/*      */     //   623: bipush #6
/*      */     //   625: istore #14
/*      */     //   627: iconst_0
/*      */     //   628: istore #15
/*      */     //   630: aload #4
/*      */     //   632: ldc 2023513938
/*      */     //   634: ldc 'CC:CompositionLocal.kt#9igjgp'
/*      */     //   636: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   639: aload #4
/*      */     //   641: aload #13
/*      */     //   643: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*      */     //   648: astore #16
/*      */     //   650: aload #4
/*      */     //   652: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   655: aload #16
/*      */     //   657: checkcast org/jetbrains/jewel/ui/component/MenuManager
/*      */     //   660: astore #12
/*      */     //   662: aload #4
/*      */     //   664: ldc_w -221005275
/*      */     //   667: invokeinterface startReplaceGroup : (I)V
/*      */     //   672: aload #4
/*      */     //   674: astore #15
/*      */     //   676: aload #4
/*      */     //   678: aload #12
/*      */     //   680: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   685: iload #7
/*      */     //   687: bipush #14
/*      */     //   689: iand
/*      */     //   690: iconst_4
/*      */     //   691: if_icmpne -> 698
/*      */     //   694: iconst_1
/*      */     //   695: goto -> 699
/*      */     //   698: iconst_0
/*      */     //   699: ior
/*      */     //   700: istore #16
/*      */     //   702: iconst_0
/*      */     //   703: istore #17
/*      */     //   705: aload #15
/*      */     //   707: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   712: astore #18
/*      */     //   714: iconst_0
/*      */     //   715: istore #19
/*      */     //   717: iload #16
/*      */     //   719: ifne -> 733
/*      */     //   722: aload #18
/*      */     //   724: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   727: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   730: if_acmpne -> 758
/*      */     //   733: iconst_0
/*      */     //   734: istore #20
/*      */     //   736: aload #12
/*      */     //   738: aload_0
/*      */     //   739: invokevirtual submenuManager : (Lkotlin/jvm/functions/Function1;)Lorg/jetbrains/jewel/ui/component/MenuManager;
/*      */     //   742: astore #21
/*      */     //   744: aload #15
/*      */     //   746: aload #21
/*      */     //   748: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   753: aload #21
/*      */     //   755: goto -> 760
/*      */     //   758: aload #18
/*      */     //   760: nop
/*      */     //   761: nop
/*      */     //   762: nop
/*      */     //   763: checkcast org/jetbrains/jewel/ui/component/MenuManager
/*      */     //   766: astore #14
/*      */     //   768: aload #4
/*      */     //   770: invokeinterface endReplaceGroup : ()V
/*      */     //   775: aload #14
/*      */     //   777: astore #13
/*      */     //   779: aload #9
/*      */     //   781: checkcast androidx/compose/ui/window/PopupPositionProvider
/*      */     //   784: aload #4
/*      */     //   786: ldc_w -220999087
/*      */     //   789: invokeinterface startReplaceGroup : (I)V
/*      */     //   794: aload #4
/*      */     //   796: astore #15
/*      */     //   798: aload #4
/*      */     //   800: aload #13
/*      */     //   802: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   807: istore #16
/*      */     //   809: nop
/*      */     //   810: iconst_0
/*      */     //   811: istore #17
/*      */     //   813: aload #15
/*      */     //   815: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   820: astore #18
/*      */     //   822: iconst_0
/*      */     //   823: istore #19
/*      */     //   825: iload #16
/*      */     //   827: ifne -> 841
/*      */     //   830: aload #18
/*      */     //   832: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   835: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   838: if_acmpne -> 872
/*      */     //   841: astore #22
/*      */     //   843: iconst_0
/*      */     //   844: istore #20
/*      */     //   846: aload #13
/*      */     //   848: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/MenuManager;)Lkotlin/jvm/functions/Function0;
/*      */     //   853: aload #22
/*      */     //   855: swap
/*      */     //   856: astore #21
/*      */     //   858: aload #15
/*      */     //   860: aload #21
/*      */     //   862: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   867: aload #21
/*      */     //   869: goto -> 874
/*      */     //   872: aload #18
/*      */     //   874: nop
/*      */     //   875: nop
/*      */     //   876: nop
/*      */     //   877: checkcast kotlin/jvm/functions/Function0
/*      */     //   880: astore #14
/*      */     //   882: aload #4
/*      */     //   884: invokeinterface endReplaceGroup : ()V
/*      */     //   889: aload #14
/*      */     //   891: new androidx/compose/ui/window/PopupProperties
/*      */     //   894: dup
/*      */     //   895: iconst_1
/*      */     //   896: iconst_0
/*      */     //   897: iconst_0
/*      */     //   898: iconst_0
/*      */     //   899: bipush #14
/*      */     //   901: aconst_null
/*      */     //   902: invokespecial <init> : (ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   905: aload #4
/*      */     //   907: ldc_w -220994838
/*      */     //   910: invokeinterface startReplaceGroup : (I)V
/*      */     //   915: aload #4
/*      */     //   917: astore #15
/*      */     //   919: iconst_0
/*      */     //   920: istore #16
/*      */     //   922: nop
/*      */     //   923: iconst_0
/*      */     //   924: istore #17
/*      */     //   926: aload #15
/*      */     //   928: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   933: astore #18
/*      */     //   935: iconst_0
/*      */     //   936: istore #19
/*      */     //   938: aload #18
/*      */     //   940: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   943: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   946: if_acmpne -> 990
/*      */     //   949: astore #24
/*      */     //   951: astore #23
/*      */     //   953: astore #22
/*      */     //   955: iconst_0
/*      */     //   956: istore #20
/*      */     //   958: getstatic org/jetbrains/jewel/ui/component/MenuKt$Submenu$2$1.INSTANCE : Lorg/jetbrains/jewel/ui/component/MenuKt$Submenu$2$1;
/*      */     //   961: checkcast kotlin/jvm/functions/Function1
/*      */     //   964: astore #25
/*      */     //   966: aload #22
/*      */     //   968: aload #23
/*      */     //   970: aload #24
/*      */     //   972: aload #25
/*      */     //   974: astore #20
/*      */     //   976: aload #15
/*      */     //   978: aload #20
/*      */     //   980: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   985: aload #20
/*      */     //   987: goto -> 992
/*      */     //   990: aload #18
/*      */     //   992: nop
/*      */     //   993: nop
/*      */     //   994: nop
/*      */     //   995: checkcast kotlin/jvm/functions/Function1
/*      */     //   998: astore #14
/*      */     //   1000: aload #4
/*      */     //   1002: invokeinterface endReplaceGroup : ()V
/*      */     //   1007: aload #14
/*      */     //   1009: aload #4
/*      */     //   1011: ldc_w -220993497
/*      */     //   1014: invokeinterface startReplaceGroup : (I)V
/*      */     //   1019: aload #4
/*      */     //   1021: astore #15
/*      */     //   1023: aload #4
/*      */     //   1025: aload #13
/*      */     //   1027: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   1032: istore #16
/*      */     //   1034: nop
/*      */     //   1035: iconst_0
/*      */     //   1036: istore #17
/*      */     //   1038: aload #15
/*      */     //   1040: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1045: astore #18
/*      */     //   1047: iconst_0
/*      */     //   1048: istore #19
/*      */     //   1050: iload #16
/*      */     //   1052: ifne -> 1066
/*      */     //   1055: aload #18
/*      */     //   1057: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1060: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1063: if_acmpne -> 1121
/*      */     //   1066: astore #25
/*      */     //   1068: astore #24
/*      */     //   1070: astore #23
/*      */     //   1072: astore #22
/*      */     //   1074: iconst_0
/*      */     //   1075: istore #20
/*      */     //   1077: new org/jetbrains/jewel/ui/component/MenuKt$Submenu$3$1
/*      */     //   1080: dup
/*      */     //   1081: aload #13
/*      */     //   1083: aload #10
/*      */     //   1085: aload #11
/*      */     //   1087: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/MenuManager;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
/*      */     //   1090: checkcast kotlin/jvm/functions/Function1
/*      */     //   1093: astore #26
/*      */     //   1095: aload #22
/*      */     //   1097: aload #23
/*      */     //   1099: aload #24
/*      */     //   1101: aload #25
/*      */     //   1103: aload #26
/*      */     //   1105: astore #21
/*      */     //   1107: aload #15
/*      */     //   1109: aload #21
/*      */     //   1111: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1116: aload #21
/*      */     //   1118: goto -> 1123
/*      */     //   1121: aload #18
/*      */     //   1123: nop
/*      */     //   1124: nop
/*      */     //   1125: nop
/*      */     //   1126: checkcast kotlin/jvm/functions/Function1
/*      */     //   1129: astore #14
/*      */     //   1131: aload #4
/*      */     //   1133: invokeinterface endReplaceGroup : ()V
/*      */     //   1138: aload #14
/*      */     //   1140: ldc_w -1603397717
/*      */     //   1143: iconst_1
/*      */     //   1144: new org/jetbrains/jewel/ui/component/MenuKt$Submenu$4
/*      */     //   1147: dup
/*      */     //   1148: aload #13
/*      */     //   1150: aload #10
/*      */     //   1152: aload #11
/*      */     //   1154: aload_1
/*      */     //   1155: aload_3
/*      */     //   1156: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/MenuManager;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)V
/*      */     //   1159: aload #4
/*      */     //   1161: bipush #54
/*      */     //   1163: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1166: checkcast kotlin/jvm/functions/Function2
/*      */     //   1169: aload #4
/*      */     //   1171: ldc_w 200064
/*      */     //   1174: iconst_0
/*      */     //   1175: invokestatic Popup : (Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*      */     //   1178: invokestatic isTraceInProgress : ()Z
/*      */     //   1181: ifeq -> 1197
/*      */     //   1184: invokestatic traceEventEnd : ()V
/*      */     //   1187: goto -> 1197
/*      */     //   1190: aload #4
/*      */     //   1192: invokeinterface skipToGroupEnd : ()V
/*      */     //   1197: aload #4
/*      */     //   1199: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1204: dup
/*      */     //   1205: ifnull -> 1229
/*      */     //   1208: aload_0
/*      */     //   1209: aload_1
/*      */     //   1210: aload_2
/*      */     //   1211: aload_3
/*      */     //   1212: iload #5
/*      */     //   1214: iload #6
/*      */     //   1216: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*      */     //   1221: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1226: goto -> 1230
/*      */     //   1229: pop
/*      */     //   1230: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #607	-> 12
/*      */     //   #604	-> 269
/*      */     //   #605	-> 283
/*      */     //   #607	-> 349
/*      */     //   #608	-> 352
/*      */     //   #1139	-> 372
/*      */     //   #608	-> 393
/*      */     //   #611	-> 398
/*      */     //   #612	-> 402
/*      */     //   #613	-> 412
/*      */     //   #614	-> 419
/*      */     //   #615	-> 425
/*      */     //   #611	-> 428
/*      */     //   #610	-> 431
/*      */     //   #618	-> 450
/*      */     //   #1140	-> 454
/*      */     //   #1141	-> 466
/*      */     //   #1142	-> 477
/*      */     //   #618	-> 480
/*      */     //   #1142	-> 487
/*      */     //   #1143	-> 489
/*      */     //   #1144	-> 498
/*      */     //   #1145	-> 503
/*      */     //   #1141	-> 505
/*      */     //   #1140	-> 506
/*      */     //   #1140	-> 507
/*      */     //   #618	-> 508
/*      */     //   #619	-> 541
/*      */     //   #1146	-> 545
/*      */     //   #1147	-> 557
/*      */     //   #1148	-> 568
/*      */     //   #619	-> 571
/*      */     //   #1148	-> 578
/*      */     //   #1149	-> 580
/*      */     //   #1150	-> 589
/*      */     //   #1151	-> 594
/*      */     //   #1147	-> 596
/*      */     //   #1146	-> 597
/*      */     //   #1146	-> 598
/*      */     //   #619	-> 599
/*      */     //   #620	-> 615
/*      */     //   #1152	-> 636
/*      */     //   #620	-> 657
/*      */     //   #622	-> 678
/*      */     //   #1153	-> 705
/*      */     //   #1154	-> 717
/*      */     //   #1155	-> 733
/*      */     //   #622	-> 736
/*      */     //   #1155	-> 742
/*      */     //   #1156	-> 744
/*      */     //   #1157	-> 753
/*      */     //   #1158	-> 758
/*      */     //   #1154	-> 760
/*      */     //   #1153	-> 761
/*      */     //   #1153	-> 762
/*      */     //   #622	-> 763
/*      */     //   #621	-> 777
/*      */     //   #625	-> 779
/*      */     //   #626	-> 809
/*      */     //   #1159	-> 813
/*      */     //   #1160	-> 825
/*      */     //   #1161	-> 841
/*      */     //   #626	-> 846
/*      */     //   #1161	-> 856
/*      */     //   #1162	-> 858
/*      */     //   #1163	-> 867
/*      */     //   #1164	-> 872
/*      */     //   #1160	-> 874
/*      */     //   #1159	-> 875
/*      */     //   #1159	-> 876
/*      */     //   #626	-> 877
/*      */     //   #627	-> 891
/*      */     //   #628	-> 922
/*      */     //   #1165	-> 926
/*      */     //   #1166	-> 938
/*      */     //   #1167	-> 949
/*      */     //   #628	-> 958
/*      */     //   #1167	-> 974
/*      */     //   #1168	-> 976
/*      */     //   #1169	-> 985
/*      */     //   #1170	-> 990
/*      */     //   #1166	-> 992
/*      */     //   #1165	-> 993
/*      */     //   #1165	-> 994
/*      */     //   #628	-> 995
/*      */     //   #629	-> 1034
/*      */     //   #1171	-> 1038
/*      */     //   #1172	-> 1050
/*      */     //   #1173	-> 1066
/*      */     //   #629	-> 1077
/*      */     //   #1173	-> 1105
/*      */     //   #1174	-> 1107
/*      */     //   #1175	-> 1116
/*      */     //   #1176	-> 1121
/*      */     //   #1172	-> 1123
/*      */     //   #1171	-> 1124
/*      */     //   #1171	-> 1125
/*      */     //   #629	-> 1126
/*      */     //   #634	-> 1140
/*      */     //   #624	-> 1175
/*      */     //   #642	-> 1190
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   366	27	11	$i$f$getCurrent	I
/*      */     //   363	30	9	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*      */     //   363	30	10	$changed$iv	I
/*      */     //   480	7	17	$i$a$-cache-MenuKt$Submenu$focusManager$2	I
/*      */     //   489	11	17	value$iv	Ljava/lang/Object;
/*      */     //   466	40	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   463	43	15	it$iv	Ljava/lang/Object;
/*      */     //   454	54	14	$i$f$cache	I
/*      */     //   451	57	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   451	57	13	invalid$iv	Z
/*      */     //   571	7	18	$i$a$-cache-MenuKt$Submenu$inputModeManager$2	I
/*      */     //   580	11	18	value$iv	Ljava/lang/Object;
/*      */     //   557	40	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   554	43	16	it$iv	Ljava/lang/Object;
/*      */     //   545	54	15	$i$f$cache	I
/*      */     //   542	57	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   542	57	14	invalid$iv	Z
/*      */     //   630	27	15	$i$f$getCurrent	I
/*      */     //   627	30	13	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*      */     //   627	30	14	$changed$iv	I
/*      */     //   736	6	20	$i$a$-cache-MenuKt$Submenu$menuManager$1	I
/*      */     //   744	11	21	value$iv	Ljava/lang/Object;
/*      */     //   717	44	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   714	47	18	it$iv	Ljava/lang/Object;
/*      */     //   705	58	17	$i$f$cache	I
/*      */     //   702	61	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   702	61	16	invalid$iv	Z
/*      */     //   846	7	20	$i$a$-cache-MenuKt$Submenu$1	I
/*      */     //   858	11	21	value$iv	Ljava/lang/Object;
/*      */     //   825	50	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   822	53	18	it$iv	Ljava/lang/Object;
/*      */     //   813	64	17	$i$f$cache	I
/*      */     //   810	67	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   810	67	16	invalid$iv	Z
/*      */     //   958	6	20	$i$a$-cache-MenuKt$Submenu$2	I
/*      */     //   976	11	20	value$iv	Ljava/lang/Object;
/*      */     //   938	55	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   935	58	18	it$iv	Ljava/lang/Object;
/*      */     //   926	69	17	$i$f$cache	I
/*      */     //   923	72	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   923	72	16	invalid$iv	Z
/*      */     //   1077	16	20	$i$a$-cache-MenuKt$Submenu$3	I
/*      */     //   1107	11	21	value$iv	Ljava/lang/Object;
/*      */     //   1050	74	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1047	77	18	it$iv	Ljava/lang/Object;
/*      */     //   1038	88	17	$i$f$cache	I
/*      */     //   1035	91	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1035	91	16	invalid$iv	Z
/*      */     //   398	789	8	density	Landroidx/compose/ui/unit/Density;
/*      */     //   433	754	9	popupPositionProvider	Lorg/jetbrains/jewel/ui/component/AnchorHorizontalMenuPositionProvider;
/*      */     //   524	663	10	focusManager$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   615	572	11	inputModeManager$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   662	525	12	parentMenuManager	Lorg/jetbrains/jewel/ui/component/MenuManager;
/*      */     //   779	408	13	menuManager	Lorg/jetbrains/jewel/ui/component/MenuManager;
/*      */     //   28	1203	7	$dirty	I
/*      */     //   0	1231	0	onDismissRequest	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1231	1	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1231	2	style	Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*      */     //   0	1231	3	content	Lkotlin/jvm/functions/Function1;
/*      */     //   0	1231	4	$composer	Landroidx/compose/runtime/Composer;
/* 1197 */     //   0	1231	5	$changed	I } private static final void Submenu$lambda$72(MutableState $focusManager$delegate, FocusManager <set-?>) { MutableState mutableState = $focusManager$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(<set-?>); } private static final InputModeManager Submenu$lambda$74(MutableState $inputModeManager$delegate) { State state = (State)$inputModeManager$delegate; Object object = null; KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 1199 */     return (InputModeManager)state.getValue(); } private static final void Submenu$lambda$75(MutableState $inputModeManager$delegate, InputModeManager <set-?>) { MutableState mutableState = $inputModeManager$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 1200 */     mutableState.setValue(<set-?>); }
/*      */ 
/*      */   
/*      */   private static final Unit Submenu$lambda$78$lambda$77(MenuManager $menuManager) {
/*      */     $menuManager.closeAll-HMVJIwE(InputMode.Companion.getTouch-aOaMEAU(), false);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit PopupMenu$lambda$11(Function1<? super InputMode, Boolean> $onDismissRequest, Alignment.Horizontal $horizontalAlignment, Modifier $modifier, MenuStyle $style, PopupProperties $popupProperties, Function1<? super MenuScope, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     PopupMenu($onDismissRequest, $horizontalAlignment, $modifier, $style, $popupProperties, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit MenuContent$lambda$26(Modifier $modifier, MenuStyle $style, Function1<? super MenuScope, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     MenuContent($modifier, $style, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit ShowMenuItem$lambda$27(MenuItem $item, boolean $canShowIcon, boolean $canShowKeybinding, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     ShowMenuItem($item, $canShowIcon, $canShowKeybinding, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit MenuSeparator$lambda$34(Modifier $modifier, MenuItemMetrics $metrics, MenuItemColors $colors, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     MenuSeparator($modifier, $metrics, $colors, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit MenuItem$lambda$48(boolean $selected, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, IconKey $iconKey, Set<String> $keybinding, boolean $canShowIcon, boolean $canShowKeybinding, MutableInteractionSource $interactionSource, MenuStyle $style, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*      */     MenuItem($selected, $onClick, $modifier, $enabled, $iconKey, $keybinding, $canShowIcon, $canShowKeybinding, $interactionSource, $style, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit MenuSubmenuItem$lambda$52(Modifier $modifier, boolean $enabled, boolean $canShowIcon, String $iconResource, Class<?> $iconClass, MutableInteractionSource $interactionSource, MenuStyle $style, Function1<? super MenuScope, Unit> $submenu, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     MenuSubmenuItem($modifier, $enabled, $canShowIcon, $iconResource, $iconClass, $interactionSource, $style, $submenu, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit MenuSubmenuItem$lambda$67(Modifier $modifier, boolean $enabled, boolean $canShowIcon, IconKey $iconKey, MutableInteractionSource $interactionSource, MenuStyle $style, Function1<? super MenuScope, Unit> $submenu, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     MenuSubmenuItem($modifier, $enabled, $canShowIcon, $iconKey, $interactionSource, $style, $submenu, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit Submenu$lambda$81(Function1<? super InputMode, Boolean> $onDismissRequest, Modifier $modifier, MenuStyle $style, Function1<? super MenuScope, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     Submenu($onDismissRequest, $modifier, $style, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*      */   static final class MenuKt$Submenu$2$1 implements Function1<KeyEvent, Boolean> {
/*      */     public static final MenuKt$Submenu$2$1 INSTANCE = new MenuKt$Submenu$2$1();
/*      */     
/*      */     public final Boolean invoke-ZmokQxo(Object it) {
/*      */       Intrinsics.checkNotNullParameter(it, "it");
/*      */       return Boolean.valueOf(false);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*      */   @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$Submenu$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,706:1\n1#2:707\n*E\n"})
/*      */   static final class MenuKt$Submenu$3$1 implements Function1<KeyEvent, Boolean> {
/*      */     public final Boolean invoke-ZmokQxo(Object it) {
/*      */       FocusManager currentFocusManager;
/*      */       InputModeManager currentInputModeManager;
/*      */       Intrinsics.checkNotNullParameter(it, "it");
/*      */       if (MenuKt.Submenu$lambda$71(this.$focusManager$delegate) == null) {
/*      */         MenuKt.Submenu$lambda$71(this.$focusManager$delegate);
/*      */         int $i$a$-checkNotNull-MenuKt$Submenu$3$1$currentFocusManager$1 = 0;
/*      */         String str = "FocusManager must not be null";
/*      */         throw new IllegalStateException(str.toString());
/*      */       } 
/*      */       if (MenuKt.Submenu$lambda$74(this.$inputModeManager$delegate) == null) {
/*      */         MenuKt.Submenu$lambda$74(this.$inputModeManager$delegate);
/*      */         int $i$a$-checkNotNull-MenuKt$Submenu$3$1$currentInputModeManager$1 = 0;
/*      */         String str = "InputModeManager must not be null";
/*      */         throw new IllegalStateException(str.toString());
/*      */       } 
/*      */       return Boolean.valueOf(PopupKt.handlePopupMenuOnKeyEvent-jhbQyNo(it, currentFocusManager, currentInputModeManager, this.$menuManager));
/*      */     }
/*      */     
/*      */     MenuKt$Submenu$3$1(MenuManager $menuManager, MutableState<FocusManager> $focusManager$delegate, MutableState<InputModeManager> $inputModeManager$delegate) {}
/*      */   }
/*      */   
/*      */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*      */   @SourceDebugExtension({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$Submenu$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,706:1\n77#2:707\n77#2:708\n*S KotlinDebug\n*F\n+ 1 Menu.kt\norg/jetbrains/jewel/ui/component/MenuKt$Submenu$4\n*L\n635#1:707\n636#1:708\n*E\n"})
/*      */   static final class MenuKt$Submenu$4 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable
/*      */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */     public final void invoke(Composer $composer, int $changed) {
/*      */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventStart(-1603397717, $changed, -1, "org.jetbrains.jewel.ui.component.Submenu.<anonymous> (Menu.kt:634)"); 
/*      */         CompositionLocal compositionLocal1 = (CompositionLocal)CompositionLocalsKt.getLocalFocusManager();
/*      */         int $changed$iv = 0, $i$f$getCurrent = 0;
/*      */         ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*      */         Object object = $composer.consume(compositionLocal1);
/*      */         ComposerKt.sourceInformationMarkerEnd($composer);
/*      */         MenuKt.Submenu$lambda$72(this.$focusManager$delegate, (FocusManager)object);
/*      */         CompositionLocal this_$iv = (CompositionLocal)CompositionLocalsKt.getLocalInputModeManager();
/*      */         $changed$iv = 0;
/*      */         $i$f$getCurrent = 0;
/*      */         ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*      */         object = $composer.consume(this_$iv);
/*      */         ComposerKt.sourceInformationMarkerEnd($composer);
/*      */         MenuKt.Submenu$lambda$75(this.$inputModeManager$delegate, (InputModeManager)object);
/*      */         CompositionLocalKt.CompositionLocalProvider(MenuManagerKt.getLocalMenuManager().provides(this.$menuManager), (Function2)ComposableLambdaKt.rememberComposableLambda(714459883, true, new Function2<Composer, Integer, Unit>(this.$modifier, this.$content) {
/*      */                 @Composable
/*      */                 @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */                 public final void invoke(Composer $composer, int $changed) {
/*      */                   if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*      */                     if (ComposerKt.isTraceInProgress())
/*      */                       ComposerKt.traceEventStart(714459883, $changed, -1, "org.jetbrains.jewel.ui.component.Submenu.<anonymous>.<anonymous> (Menu.kt:638)"); 
/*      */                     MenuKt.MenuContent(this.$modifier, null, this.$content, $composer, 0, 2);
/*      */                     if (ComposerKt.isTraceInProgress())
/*      */                       ComposerKt.traceEventEnd(); 
/*      */                   } else {
/*      */                     $composer.skipToGroupEnd();
/*      */                   } 
/*      */                 }
/*      */               }$composer, 54), $composer, 0x30 | ProvidedValue.$stable);
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventEnd(); 
/*      */       } else {
/*      */         $composer.skipToGroupEnd();
/*      */       } 
/*      */     }
/*      */     
/*      */     MenuKt$Submenu$4(MenuManager $menuManager, MutableState<FocusManager> $focusManager$delegate, MutableState<InputModeManager> $inputModeManager$delegate, Modifier $modifier, Function1<MenuScope, Unit> $content) {}
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */