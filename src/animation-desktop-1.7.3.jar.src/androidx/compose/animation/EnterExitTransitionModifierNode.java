/*      */ package androidx.compose.animation;
/*      */ 
/*      */ import androidx.compose.animation.core.AnimationVector2D;
/*      */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*      */ import androidx.compose.animation.core.Transition;
/*      */ import androidx.compose.ui.Alignment;
/*      */ import androidx.compose.ui.graphics.GraphicsLayerScope;
/*      */ import androidx.compose.ui.layout.Measurable;
/*      */ import androidx.compose.ui.layout.MeasureResult;
/*      */ import androidx.compose.ui.layout.MeasureScope;
/*      */ import androidx.compose.ui.layout.Placeable;
/*      */ import androidx.compose.ui.unit.ConstraintsKt;
/*      */ import androidx.compose.ui.unit.IntOffset;
/*      */ import androidx.compose.ui.unit.IntSize;
/*      */ import androidx.compose.ui.unit.LayoutDirection;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.NoWhenBranchMatchedException;
/*      */ import kotlin.Unit;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\026\n\002\030\002\n\002\b\r\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\013\n\002\020\002\n\002\b\n\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\002\030\0002\0020\001B\001\022\f\020\002\032\b\022\004\022\0020\0040\003\022\036\020\005\032\032\022\004\022\0020\007\022\004\022\0020\b\030\0010\006R\b\022\004\022\0020\0040\003\022\036\020\t\032\032\022\004\022\0020\n\022\004\022\0020\b\030\0010\006R\b\022\004\022\0020\0040\003\022\036\020\013\032\032\022\004\022\0020\n\022\004\022\0020\b\030\0010\006R\b\022\004\022\0020\0040\003\022\006\020\f\032\0020\r\022\006\020\016\032\0020\017\022\f\020\020\032\b\022\004\022\0020\0220\021\022\006\020\023\032\0020\024¢\006\002\020\025J\b\020J\032\0020KH\026J \020L\032\0020\0072\006\020M\032\0020\0042\006\020N\032\0020\007ø\001\000¢\006\004\bO\020PJ \020Q\032\0020\n2\006\020M\032\0020\0042\006\020N\032\0020\007ø\001\000¢\006\004\bR\020PJ \020S\032\0020\n2\006\020M\032\0020\0042\006\020N\032\0020\007ø\001\000¢\006\004\bT\020PJ&\020U\032\0020V*\0020W2\006\020X\032\0020Y2\006\020Z\032\0020.H\026ø\001\000¢\006\004\b[\020\\R\023\020\026\032\004\030\0010\0278F¢\006\006\032\004\b\030\020\031R\034\020\032\032\004\030\0010\027X\016¢\006\016\n\000\032\004\b\033\020\031\"\004\b\034\020\035R\032\020\f\032\0020\rX\016¢\006\016\n\000\032\004\b\036\020\037\"\004\b \020!R\032\020\016\032\0020\017X\016¢\006\016\n\000\032\004\b\"\020#\"\004\b$\020%R\032\020\023\032\0020\024X\016¢\006\016\n\000\032\004\b&\020'\"\004\b(\020)R \020\020\032\b\022\004\022\0020\0220\021X\016¢\006\016\n\000\032\004\b\020\020*\"\004\b+\020,R&\020/\032\0020.2\006\020-\032\0020.@BX\016ø\001\000ø\001\001¢\006\n\n\002\0202\"\004\b0\0201R\016\0203\032\0020\022X\016¢\006\002\n\000R\026\0204\032\0020\007X\016ø\001\000ø\001\001¢\006\004\n\002\0202R2\020\t\032\032\022\004\022\0020\n\022\004\022\0020\b\030\0010\006R\b\022\004\022\0020\0040\003X\016¢\006\016\n\000\032\004\b5\0206\"\004\b7\0208R2\020\005\032\032\022\004\022\0020\007\022\004\022\0020\b\030\0010\006R\b\022\004\022\0020\0040\003X\016¢\006\016\n\000\032\004\b9\0206\"\004\b:\0208R.\020;\032\037\022\n\022\b\022\004\022\0020\0040=\022\n\022\b\022\004\022\0020\0070>0<¢\006\002\b?¢\006\b\n\000\032\004\b@\020AR2\020\013\032\032\022\004\022\0020\n\022\004\022\0020\b\030\0010\006R\b\022\004\022\0020\0040\003X\016¢\006\016\n\000\032\004\bB\0206\"\004\bC\0208R.\020D\032\037\022\n\022\b\022\004\022\0020\0040=\022\n\022\b\022\004\022\0020\n0>0<¢\006\002\b?¢\006\b\n\000\032\004\bE\020AR \020\002\032\b\022\004\022\0020\0040\003X\016¢\006\016\n\000\032\004\bF\020G\"\004\bH\020I\002\013\n\005\b¡\0360\001\n\002\b!¨\006]"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "slideAnimation", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "isEnabled", "Lkotlin/Function0;", "", "graphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "currentAlignment", "getCurrentAlignment", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", "setLookaheadConstraints-BRTryo0", "(J)V", "J", "lookaheadConstraintsAvailable", "lookaheadSize", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setOffsetAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getSizeAnimation", "setSizeAnimation", "sizeTransitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "getSlideAnimation", "setSlideAnimation", "slideSpec", "getSlideSpec", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "(Landroidx/compose/animation/core/Transition;)V", "onAttach", "", "sizeByState", "targetState", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "slideTargetValueByState", "slideTargetValueByState-oFUgxo0", "targetOffsetByState", "targetOffsetByState-oFUgxo0", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation"})
/*      */ final class EnterExitTransitionModifierNode
/*      */   extends LayoutModifierNodeWithPassThroughIntrinsics
/*      */ {
/*      */   @NotNull
/*      */   private Transition<EnterExitState> transition;
/*      */   @Nullable
/*      */   private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
/*      */   @Nullable
/*      */   private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;
/*      */   @Nullable
/*      */   private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;
/*      */   @NotNull
/*      */   private EnterTransition enter;
/*      */   @NotNull
/*      */   private ExitTransition exit;
/*      */   @NotNull
/*      */   private Function0<Boolean> isEnabled;
/*      */   @NotNull
/*      */   private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
/*      */   private boolean lookaheadConstraintsAvailable;
/*      */   private long lookaheadSize;
/*      */   private long lookaheadConstraints;
/*      */   @Nullable
/*      */   private Alignment currentAlignment;
/*      */   @NotNull
/*      */   private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec;
/*      */   @NotNull
/*      */   private final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> slideSpec;
/*      */   
/*      */   @NotNull
/*      */   public final Transition<EnterExitState> getTransition() {
/* 1068 */     return this.transition; } public final void setTransition(@NotNull Transition<EnterExitState> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.transition = <set-?>; } @Nullable
/* 1069 */   public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() { return this.sizeAnimation; } public final void setSizeAnimation(@Nullable Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> <set-?>) { this.sizeAnimation = <set-?>; } @Nullable
/* 1070 */   public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() { return this.offsetAnimation; } public final void setOffsetAnimation(@Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> <set-?>) { this.offsetAnimation = <set-?>; }
/*      */   @Nullable
/* 1072 */   public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() { return this.slideAnimation; } public final void setSlideAnimation(@Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> <set-?>) { this.slideAnimation = <set-?>; } @NotNull
/* 1073 */   public final EnterTransition getEnter() { return this.enter; } public final void setEnter(@NotNull EnterTransition <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.enter = <set-?>; } @NotNull
/* 1074 */   public final ExitTransition getExit() { return this.exit; } public final void setExit(@NotNull ExitTransition <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.exit = <set-?>; } @NotNull
/* 1075 */   public final Function0<Boolean> isEnabled() { return this.isEnabled; } public final void setEnabled(@NotNull Function0<Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.isEnabled = <set-?>; } @NotNull
/* 1076 */   public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() { return this.graphicsLayerBlock; } public final void setGraphicsLayerBlock(@NotNull GraphicsLayerBlockForEnterExit <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.graphicsLayerBlock = <set-?>; } public EnterExitTransitionModifierNode(@NotNull Transition<EnterExitState> transition, @Nullable Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull Function0<Boolean> isEnabled, @NotNull GraphicsLayerBlockForEnterExit graphicsLayerBlock) { this.transition = transition; this.sizeAnimation = sizeAnimation; this.offsetAnimation = offsetAnimation; this.slideAnimation = slideAnimation; this.enter = enter; this.exit = exit; this.isEnabled = isEnabled; this.graphicsLayerBlock = graphicsLayerBlock;
/*      */ 
/*      */ 
/*      */     
/* 1080 */     this.lookaheadSize = AnimationModifierKt.getInvalidSize();
/* 1081 */     this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1097 */     this.sizeTransitionSpec = new EnterExitTransitionModifierNode$sizeTransitionSpec$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1204 */     this.slideSpec = new EnterExitTransitionModifierNode$slideSpec$1(); } private final void setLookaheadConstraints-BRTryo0(long value) { this.lookaheadConstraintsAvailable = true; this.lookaheadConstraints = value; } @Nullable public final Alignment getCurrentAlignment() { return this.currentAlignment; } public final void setCurrentAlignment(@Nullable Alignment <set-?>) { this.currentAlignment = <set-?>; } @Nullable public final Alignment getAlignment() { Transition.Segment $this$_get_alignment__u24lambda_u240 = this.transition.getSegment(); int $i$a$-with-EnterExitTransitionModifierNode$alignment$1 = 0; if ($this$_get_alignment__u24lambda_u240.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) { if (this.enter.getData$animation().getChangeSize() == null || this.enter.getData$animation().getChangeSize().getAlignment() == null) { this.enter.getData$animation().getChangeSize().getAlignment(); this.exit.getData$animation().getChangeSize(); }  } else if (this.exit.getData$animation().getChangeSize() == null || this.exit.getData$animation().getChangeSize().getAlignment() == null) { this.exit.getData$animation().getChangeSize().getAlignment(); this.enter.getData$animation().getChangeSize(); }  return (this.enter.getData$animation().getChangeSize() != null) ? this.enter.getData$animation().getChangeSize().getAlignment() : null; } @NotNull public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() { return this.sizeTransitionSpec; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001*\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"}) static final class EnterExitTransitionModifierNode$sizeTransitionSpec$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> { @NotNull public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment $this$null) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); EnterExitTransitionModifierNode.this.getEnter().getData$animation().getChangeSize(); EnterExitTransitionModifierNode.this.getExit().getData$animation().getChangeSize(); if (($this$null.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible) ? ((EnterExitTransitionModifierNode.this.getEnter().getData$animation().getChangeSize() != null) ? EnterExitTransitionModifierNode.this.getEnter().getData$animation().getChangeSize().getAnimationSpec() : null) : ($this$null.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit) ? ((EnterExitTransitionModifierNode.this.getExit().getData$animation().getChangeSize() != null) ? EnterExitTransitionModifierNode.this.getExit().getData$animation().getChangeSize().getAnimationSpec() : null) : EnterExitTransitionKt.access$getDefaultSizeAnimationSpec$p())) == null) $this$null.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible) ? ((EnterExitTransitionModifierNode.this.getEnter().getData$animation().getChangeSize() != null) ? EnterExitTransitionModifierNode.this.getEnter().getData$animation().getChangeSize().getAnimationSpec() : null) : ($this$null.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit) ? ((EnterExitTransitionModifierNode.this.getExit().getData$animation().getChangeSize() != null) ? EnterExitTransitionModifierNode.this.getExit().getData$animation().getChangeSize().getAnimationSpec() : null) : EnterExitTransitionKt.access$getDefaultSizeAnimationSpec$p());  return (FiniteAnimationSpec<IntSize>)EnterExitTransitionKt.access$getDefaultSizeAnimationSpec$p(); } EnterExitTransitionModifierNode$sizeTransitionSpec$1() { super(1); } } public final long sizeByState-Uzc_VyU(@NotNull EnterExitState targetState, long fullSize) { Intrinsics.checkNotNullParameter(targetState, "targetState"); switch (WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()]) { case 1: case 2: this.enter.getData$animation().getChangeSize().getSize(); return (this.enter.getData$animation().getChangeSize() != null && this.enter.getData$animation().getChangeSize().getSize() != null) ? ((IntSize)this.enter.getData$animation().getChangeSize().getSize().invoke(IntSize.box-impl(fullSize))).unbox-impl() : fullSize;case 3: this.exit.getData$animation().getChangeSize().getSize(); return (this.exit.getData$animation().getChangeSize() != null && this.exit.getData$animation().getChangeSize().getSize() != null) ? ((IntSize)this.exit.getData$animation().getChangeSize().getSize().invoke(IntSize.box-impl(fullSize))).unbox-impl() : fullSize; }  throw new NoWhenBranchMatchedException(); } public void onAttach() { super.onAttach(); this.lookaheadConstraintsAvailable = false; this.lookaheadSize = AnimationModifierKt.getInvalidSize(); } public final long targetOffsetByState-oFUgxo0(@NotNull EnterExitState targetState, long fullSize) { Intrinsics.checkNotNullParameter(targetState, "targetState"); if (Intrinsics.areEqual(this.currentAlignment, getAlignment())) {  } else { ChangeSize it; int $i$a$-let-EnterExitTransitionModifierNode$targetOffsetByState$1; long endSize; long targetOffset; long currentOffset; switch (WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()]) { case 1: case 2: case 3: it = this.exit.getData$animation().getChangeSize(); $i$a$-let-EnterExitTransitionModifierNode$targetOffsetByState$1 = 0; endSize = ((IntSize)it.getSize().invoke(IntSize.box-impl(fullSize))).unbox-impl(); Intrinsics.checkNotNull(getAlignment()); targetOffset = getAlignment().align-KFBX0sM(fullSize, endSize, LayoutDirection.Ltr); Intrinsics.checkNotNull(this.currentAlignment); currentOffset = this.currentAlignment.align-KFBX0sM(fullSize, endSize, LayoutDirection.Ltr); this.exit.getData$animation().getChangeSize(); return (this.exit.getData$animation().getChangeSize() != null) ? IntOffset.minus-qkQi6aY(targetOffset, currentOffset) : IntOffset.Companion.getZero-nOcc-ac(); }  throw new NoWhenBranchMatchedException(); }  return (this.currentAlignment == null) ? IntOffset.Companion.getZero-nOcc-ac() : ((getAlignment() == null) ? IntOffset.Companion.getZero-nOcc-ac() : "JD-Core does not support Kotlin"); } @NotNull public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) { // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc_w '$this$measure'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_2
/*      */     //   8: ldc_w 'measurable'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload_0
/*      */     //   15: getfield transition : Landroidx/compose/animation/core/Transition;
/*      */     //   18: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*      */     //   21: aload_0
/*      */     //   22: getfield transition : Landroidx/compose/animation/core/Transition;
/*      */     //   25: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */     //   28: if_acmpne -> 39
/*      */     //   31: aload_0
/*      */     //   32: aconst_null
/*      */     //   33: putfield currentAlignment : Landroidx/compose/ui/Alignment;
/*      */     //   36: goto -> 65
/*      */     //   39: aload_0
/*      */     //   40: getfield currentAlignment : Landroidx/compose/ui/Alignment;
/*      */     //   43: ifnonnull -> 65
/*      */     //   46: aload_0
/*      */     //   47: aload_0
/*      */     //   48: invokevirtual getAlignment : ()Landroidx/compose/ui/Alignment;
/*      */     //   51: dup
/*      */     //   52: ifnonnull -> 62
/*      */     //   55: pop
/*      */     //   56: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   59: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   62: putfield currentAlignment : Landroidx/compose/ui/Alignment;
/*      */     //   65: aload_1
/*      */     //   66: invokeinterface isLookingAhead : ()Z
/*      */     //   71: ifeq -> 139
/*      */     //   74: aload_2
/*      */     //   75: lload_3
/*      */     //   76: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*      */     //   81: astore #5
/*      */     //   83: aload #5
/*      */     //   85: invokevirtual getWidth : ()I
/*      */     //   88: aload #5
/*      */     //   90: invokevirtual getHeight : ()I
/*      */     //   93: invokestatic IntSize : (II)J
/*      */     //   96: lstore #6
/*      */     //   98: aload_0
/*      */     //   99: lload #6
/*      */     //   101: putfield lookaheadSize : J
/*      */     //   104: aload_0
/*      */     //   105: lload_3
/*      */     //   106: invokespecial setLookaheadConstraints-BRTryo0 : (J)V
/*      */     //   109: aload_1
/*      */     //   110: lload #6
/*      */     //   112: invokestatic getWidth-impl : (J)I
/*      */     //   115: lload #6
/*      */     //   117: invokestatic getHeight-impl : (J)I
/*      */     //   120: aconst_null
/*      */     //   121: new androidx/compose/animation/EnterExitTransitionModifierNode$measure$1
/*      */     //   124: dup
/*      */     //   125: aload #5
/*      */     //   127: invokespecial <init> : (Landroidx/compose/ui/layout/Placeable;)V
/*      */     //   130: checkcast kotlin/jvm/functions/Function1
/*      */     //   133: iconst_4
/*      */     //   134: aconst_null
/*      */     //   135: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*      */     //   138: areturn
/*      */     //   139: aload_0
/*      */     //   140: getfield isEnabled : Lkotlin/jvm/functions/Function0;
/*      */     //   143: invokeinterface invoke : ()Ljava/lang/Object;
/*      */     //   148: checkcast java/lang/Boolean
/*      */     //   151: invokevirtual booleanValue : ()Z
/*      */     //   154: ifeq -> 480
/*      */     //   157: aload_0
/*      */     //   158: getfield graphicsLayerBlock : Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;
/*      */     //   161: invokeinterface init : ()Lkotlin/jvm/functions/Function1;
/*      */     //   166: astore #5
/*      */     //   168: aload_2
/*      */     //   169: lload_3
/*      */     //   170: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*      */     //   175: astore #6
/*      */     //   177: aload #6
/*      */     //   179: invokevirtual getWidth : ()I
/*      */     //   182: aload #6
/*      */     //   184: invokevirtual getHeight : ()I
/*      */     //   187: invokestatic IntSize : (II)J
/*      */     //   190: lstore #7
/*      */     //   192: aload_0
/*      */     //   193: getfield lookaheadSize : J
/*      */     //   196: invokestatic isValid-ozmzZPI : (J)Z
/*      */     //   199: ifeq -> 209
/*      */     //   202: aload_0
/*      */     //   203: getfield lookaheadSize : J
/*      */     //   206: goto -> 211
/*      */     //   209: lload #7
/*      */     //   211: lstore #9
/*      */     //   213: aload_0
/*      */     //   214: getfield sizeAnimation : Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   217: dup
/*      */     //   218: ifnull -> 244
/*      */     //   221: aload_0
/*      */     //   222: getfield sizeTransitionSpec : Lkotlin/jvm/functions/Function1;
/*      */     //   225: new androidx/compose/animation/EnterExitTransitionModifierNode$measure$animSize$1
/*      */     //   228: dup
/*      */     //   229: aload_0
/*      */     //   230: lload #9
/*      */     //   232: invokespecial <init> : (Landroidx/compose/animation/EnterExitTransitionModifierNode;J)V
/*      */     //   235: checkcast kotlin/jvm/functions/Function1
/*      */     //   238: invokevirtual animate : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;
/*      */     //   241: goto -> 246
/*      */     //   244: pop
/*      */     //   245: aconst_null
/*      */     //   246: astore #11
/*      */     //   248: lload_3
/*      */     //   249: aload #11
/*      */     //   251: dup
/*      */     //   252: ifnull -> 269
/*      */     //   255: invokeinterface getValue : ()Ljava/lang/Object;
/*      */     //   260: checkcast androidx/compose/ui/unit/IntSize
/*      */     //   263: invokevirtual unbox-impl : ()J
/*      */     //   266: goto -> 272
/*      */     //   269: pop
/*      */     //   270: lload #7
/*      */     //   272: invokestatic constrain-4WqzIAM : (JJ)J
/*      */     //   275: lstore #12
/*      */     //   277: aload_0
/*      */     //   278: getfield offsetAnimation : Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   281: astore #16
/*      */     //   283: aload #16
/*      */     //   285: ifnull -> 335
/*      */     //   288: aload #16
/*      */     //   290: getstatic androidx/compose/animation/EnterExitTransitionModifierNode$measure$offsetDelta$1.INSTANCE : Landroidx/compose/animation/EnterExitTransitionModifierNode$measure$offsetDelta$1;
/*      */     //   293: checkcast kotlin/jvm/functions/Function1
/*      */     //   296: new androidx/compose/animation/EnterExitTransitionModifierNode$measure$offsetDelta$2
/*      */     //   299: dup
/*      */     //   300: aload_0
/*      */     //   301: lload #9
/*      */     //   303: invokespecial <init> : (Landroidx/compose/animation/EnterExitTransitionModifierNode;J)V
/*      */     //   306: checkcast kotlin/jvm/functions/Function1
/*      */     //   309: invokevirtual animate : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;
/*      */     //   312: astore #17
/*      */     //   314: aload #17
/*      */     //   316: ifnull -> 335
/*      */     //   319: aload #17
/*      */     //   321: invokeinterface getValue : ()Ljava/lang/Object;
/*      */     //   326: checkcast androidx/compose/ui/unit/IntOffset
/*      */     //   329: invokevirtual unbox-impl : ()J
/*      */     //   332: goto -> 341
/*      */     //   335: getstatic androidx/compose/ui/unit/IntOffset.Companion : Landroidx/compose/ui/unit/IntOffset$Companion;
/*      */     //   338: invokevirtual getZero-nOcc-ac : ()J
/*      */     //   341: lstore #14
/*      */     //   343: aload_0
/*      */     //   344: getfield slideAnimation : Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */     //   347: astore #18
/*      */     //   349: aload #18
/*      */     //   351: ifnull -> 399
/*      */     //   354: aload #18
/*      */     //   356: aload_0
/*      */     //   357: getfield slideSpec : Lkotlin/jvm/functions/Function1;
/*      */     //   360: new androidx/compose/animation/EnterExitTransitionModifierNode$measure$slideOffset$1
/*      */     //   363: dup
/*      */     //   364: aload_0
/*      */     //   365: lload #9
/*      */     //   367: invokespecial <init> : (Landroidx/compose/animation/EnterExitTransitionModifierNode;J)V
/*      */     //   370: checkcast kotlin/jvm/functions/Function1
/*      */     //   373: invokevirtual animate : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;
/*      */     //   376: astore #19
/*      */     //   378: aload #19
/*      */     //   380: ifnull -> 399
/*      */     //   383: aload #19
/*      */     //   385: invokeinterface getValue : ()Ljava/lang/Object;
/*      */     //   390: checkcast androidx/compose/ui/unit/IntOffset
/*      */     //   393: invokevirtual unbox-impl : ()J
/*      */     //   396: goto -> 405
/*      */     //   399: getstatic androidx/compose/ui/unit/IntOffset.Companion : Landroidx/compose/ui/unit/IntOffset$Companion;
/*      */     //   402: invokevirtual getZero-nOcc-ac : ()J
/*      */     //   405: lstore #16
/*      */     //   407: aload_0
/*      */     //   408: getfield currentAlignment : Landroidx/compose/ui/Alignment;
/*      */     //   411: dup
/*      */     //   412: ifnull -> 430
/*      */     //   415: lload #9
/*      */     //   417: lload #12
/*      */     //   419: getstatic androidx/compose/ui/unit/LayoutDirection.Ltr : Landroidx/compose/ui/unit/LayoutDirection;
/*      */     //   422: invokeinterface align-KFBX0sM : (JJLandroidx/compose/ui/unit/LayoutDirection;)J
/*      */     //   427: goto -> 437
/*      */     //   430: pop
/*      */     //   431: getstatic androidx/compose/ui/unit/IntOffset.Companion : Landroidx/compose/ui/unit/IntOffset$Companion;
/*      */     //   434: invokevirtual getZero-nOcc-ac : ()J
/*      */     //   437: lload #16
/*      */     //   439: invokestatic plus-qkQi6aY : (JJ)J
/*      */     //   442: lstore #18
/*      */     //   444: aload_1
/*      */     //   445: lload #12
/*      */     //   447: invokestatic getWidth-impl : (J)I
/*      */     //   450: lload #12
/*      */     //   452: invokestatic getHeight-impl : (J)I
/*      */     //   455: aconst_null
/*      */     //   456: new androidx/compose/animation/EnterExitTransitionModifierNode$measure$2
/*      */     //   459: dup
/*      */     //   460: aload #6
/*      */     //   462: lload #18
/*      */     //   464: lload #14
/*      */     //   466: aload #5
/*      */     //   468: invokespecial <init> : (Landroidx/compose/ui/layout/Placeable;JJLkotlin/jvm/functions/Function1;)V
/*      */     //   471: checkcast kotlin/jvm/functions/Function1
/*      */     //   474: iconst_4
/*      */     //   475: aconst_null
/*      */     //   476: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*      */     //   479: areturn
/*      */     //   480: aload_2
/*      */     //   481: lload_3
/*      */     //   482: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*      */     //   487: astore #6
/*      */     //   489: iconst_0
/*      */     //   490: istore #7
/*      */     //   492: aload_1
/*      */     //   493: aload #6
/*      */     //   495: invokevirtual getWidth : ()I
/*      */     //   498: aload #6
/*      */     //   500: invokevirtual getHeight : ()I
/*      */     //   503: aconst_null
/*      */     //   504: new androidx/compose/animation/EnterExitTransitionModifierNode$measure$3$1
/*      */     //   507: dup
/*      */     //   508: aload #6
/*      */     //   510: invokespecial <init> : (Landroidx/compose/ui/layout/Placeable;)V
/*      */     //   513: checkcast kotlin/jvm/functions/Function1
/*      */     //   516: iconst_4
/*      */     //   517: aconst_null
/*      */     //   518: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*      */     //   521: nop
/*      */     //   522: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1154	-> 14
/*      */     //   #1155	-> 31
/*      */     //   #1156	-> 39
/*      */     //   #1157	-> 46
/*      */     //   #1159	-> 65
/*      */     //   #1160	-> 74
/*      */     //   #1161	-> 83
/*      */     //   #1162	-> 98
/*      */     //   #1163	-> 104
/*      */     //   #1164	-> 109
/*      */     //   #1167	-> 139
/*      */     //   #1168	-> 157
/*      */     //   #1173	-> 168
/*      */     //   #1174	-> 177
/*      */     //   #1175	-> 192
/*      */     //   #1176	-> 213
/*      */     //   #1180	-> 248
/*      */     //   #1181	-> 277
/*      */     //   #1183	-> 314
/*      */     //   #1181	-> 319
/*      */     //   #1183	-> 321
/*      */     //   #1181	-> 332
/*      */     //   #1183	-> 335
/*      */     //   #1181	-> 341
/*      */     //   #1184	-> 343
/*      */     //   #1186	-> 378
/*      */     //   #1184	-> 383
/*      */     //   #1186	-> 385
/*      */     //   #1184	-> 396
/*      */     //   #1186	-> 399
/*      */     //   #1184	-> 405
/*      */     //   #1187	-> 407
/*      */     //   #1188	-> 431
/*      */     //   #1187	-> 439
/*      */     //   #1189	-> 444
/*      */     //   #1196	-> 480
/*      */     //   #1197	-> 492
/*      */     //   #1196	-> 521
/*      */     //   #1196	-> 522
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   83	56	5	placeable	Landroidx/compose/ui/layout/Placeable;
/*      */     //   98	41	6	measuredSize	J
/*      */     //   168	312	5	layerBlock	Lkotlin/jvm/functions/Function1;
/*      */     //   177	303	6	placeable	Landroidx/compose/ui/layout/Placeable;
/*      */     //   192	288	7	measuredSize	J
/*      */     //   213	267	9	target	J
/*      */     //   248	232	11	animSize	Landroidx/compose/runtime/State;
/*      */     //   277	203	12	currentSize	J
/*      */     //   343	137	14	offsetDelta	J
/*      */     //   407	73	16	slideOffset	J
/*      */     //   444	36	18	offset	J
/*      */     //   492	29	7	$i$a$-run-EnterExitTransitionModifierNode$measure$3	I
/*      */     //   489	32	6	$this$measure_3p2s80s_u24lambda_u242	Landroidx/compose/ui/layout/Placeable;
/*      */     //   0	523	0	this	Landroidx/compose/animation/EnterExitTransitionModifierNode;
/*      */     //   0	523	1	$this$measure_u2d3p2s80s	Landroidx/compose/ui/layout/MeasureScope;
/*      */     //   0	523	2	measurable	Landroidx/compose/ui/layout/Measurable;
/* 1204 */     //   0	523	3	constraints	J } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}) static final class EnterExitTransitionModifierNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); Placeable.PlacementScope.place$default($this$layout, this.$placeable, 0, 0, 0.0F, 4, null); } EnterExitTransitionModifierNode$measure$1(Placeable $placeable) { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-YEO4UFw", "(Landroidx/compose/animation/EnterExitState;)J"}) static final class EnterExitTransitionModifierNode$measure$animSize$1 extends Lambda implements Function1<EnterExitState, IntSize> { EnterExitTransitionModifierNode$measure$animSize$1(long $target) { super(1); } public final long invoke-YEO4UFw(@NotNull EnterExitState it) { Intrinsics.checkNotNullParameter(it, "it"); return EnterExitTransitionModifierNode.this.sizeByState-Uzc_VyU(it, this.$target); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001*\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"}) static final class EnterExitTransitionModifierNode$measure$offsetDelta$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> { public static final EnterExitTransitionModifierNode$measure$offsetDelta$1 INSTANCE = new EnterExitTransitionModifierNode$measure$offsetDelta$1(); EnterExitTransitionModifierNode$measure$offsetDelta$1() { super(1); } @NotNull public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment $this$animate) { Intrinsics.checkNotNullParameter($this$animate, "$this$animate"); return (FiniteAnimationSpec<IntOffset>)EnterExitTransitionKt.access$getDefaultOffsetAnimationSpec$p(); } } @NotNull public final Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getSlideSpec() { return this.slideSpec; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-Bjo55l4", "(Landroidx/compose/animation/EnterExitState;)J"}) static final class EnterExitTransitionModifierNode$measure$offsetDelta$2 extends Lambda implements Function1<EnterExitState, IntOffset> {
/* 1205 */     public final long invoke-Bjo55l4(@NotNull EnterExitState it) { Intrinsics.checkNotNullParameter(it, "it"); return EnterExitTransitionModifierNode.this.targetOffsetByState-oFUgxo0(it, this.$target); } EnterExitTransitionModifierNode$measure$offsetDelta$2(long $target) { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-Bjo55l4", "(Landroidx/compose/animation/EnterExitState;)J"}) static final class EnterExitTransitionModifierNode$measure$slideOffset$1 extends Lambda implements Function1<EnterExitState, IntOffset> { public final long invoke-Bjo55l4(@NotNull EnterExitState it) { Intrinsics.checkNotNullParameter(it, "it"); return EnterExitTransitionModifierNode.this.slideTargetValueByState-oFUgxo0(it, this.$target); } EnterExitTransitionModifierNode$measure$slideOffset$1(long $target) { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}) static final class EnterExitTransitionModifierNode$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); $this$layout.placeWithLayer(this.$placeable, IntOffset.getX-impl(this.$offset) + IntOffset.getX-impl(this.$offsetDelta), IntOffset.getY-impl(this.$offset) + IntOffset.getY-impl(this.$offsetDelta), 0.0F, this.$layerBlock); } EnterExitTransitionModifierNode$measure$2(Placeable $placeable, long $offset, long $offsetDelta, Function1<GraphicsLayerScope, Unit> $layerBlock) { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}) static final class EnterExitTransitionModifierNode$measure$3$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); Placeable.PlacementScope.place$default($this$layout, this.$this_run, 0, 0, 0.0F, 4, null); } EnterExitTransitionModifierNode$measure$3$1(Placeable $receiver) { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\001*\b\022\004\022\0020\0040\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"}) static final class EnterExitTransitionModifierNode$slideSpec$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> { @NotNull public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment $this$null) { Intrinsics.checkNotNullParameter($this$null, "$this$null");
/* 1206 */       if ($this$null.isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
/* 1207 */         if (EnterExitTransitionModifierNode.this.getEnter().getData$animation().getSlide() == null || EnterExitTransitionModifierNode.this.getEnter().getData$animation().getSlide().getAnimationSpec() == null) EnterExitTransitionModifierNode.this.getEnter().getData$animation().getSlide().getAnimationSpec();
/*      */       
/*      */       }
/* 1210 */       else if ($this$null.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
/* 1211 */         if (EnterExitTransitionModifierNode.this.getExit().getData$animation().getSlide() == null || EnterExitTransitionModifierNode.this.getExit().getData$animation().getSlide().getAnimationSpec() == null) EnterExitTransitionModifierNode.this.getExit().getData$animation().getSlide().getAnimationSpec(); 
/*      */       } else {
/*      */       
/* 1214 */       }  return (FiniteAnimationSpec<IntOffset>)EnterExitTransitionKt.access$getDefaultOffsetAnimationSpec$p(); }
/*      */      EnterExitTransitionModifierNode$slideSpec$1() {
/*      */       super(1);
/*      */     } }
/*      */   public final long slideTargetValueByState-oFUgxo0(@NotNull EnterExitState targetState, long fullSize) {
/* 1219 */     Intrinsics.checkNotNullParameter(targetState, "targetState"); this.enter.getData$animation().getSlide().getSlideOffset(); long preEnter = (this.enter.getData$animation().getSlide() != null && this.enter.getData$animation().getSlide().getSlideOffset() != null) ? ((IntOffset)this.enter.getData$animation().getSlide().getSlideOffset().invoke(IntSize.box-impl(fullSize))).unbox-impl() : IntOffset.Companion.getZero-nOcc-ac();
/* 1220 */     this.exit.getData$animation().getSlide().getSlideOffset(); long postExit = (this.exit.getData$animation().getSlide() != null && this.exit.getData$animation().getSlide().getSlideOffset() != null) ? ((IntOffset)this.exit.getData$animation().getSlide().getSlideOffset().invoke(IntSize.box-impl(fullSize))).unbox-impl() : IntOffset.Companion.getZero-nOcc-ac();
/* 1221 */     switch (WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()]) { case 1: 
/*      */       case 2: 
/*      */       case 3:
/* 1224 */        }  throw new NoWhenBranchMatchedException();
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\EnterExitTransitionModifierNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */