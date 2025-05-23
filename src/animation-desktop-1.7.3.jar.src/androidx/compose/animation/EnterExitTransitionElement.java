/*      */ package androidx.compose.animation;
/*      */ 
/*      */ import androidx.compose.animation.core.AnimationVector2D;
/*      */ import androidx.compose.animation.core.Transition;
/*      */ import androidx.compose.ui.Modifier;
/*      */ import androidx.compose.ui.node.ModifierNodeElement;
/*      */ import androidx.compose.ui.platform.InspectorInfo;
/*      */ import androidx.compose.ui.unit.IntOffset;
/*      */ import androidx.compose.ui.unit.IntSize;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.internal.Intrinsics;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000l\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\b&\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\b\030\0002\b\022\004\022\0020\0020\001B\001\022\f\020\003\032\b\022\004\022\0020\0050\004\022\036\020\006\032\032\022\004\022\0020\b\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\004\022\036\020\n\032\032\022\004\022\0020\013\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\004\022\036\020\f\032\032\022\004\022\0020\013\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\004\022\006\020\r\032\0020\016\022\006\020\017\032\0020\020\022\f\020\021\032\b\022\004\022\0020\0230\022\022\006\020\024\032\0020\025¢\006\002\020\026J\017\0200\032\b\022\004\022\0020\0050\004HÆ\003J!\0201\032\032\022\004\022\0020\b\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\004HÆ\003J!\0202\032\032\022\004\022\0020\013\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\004HÆ\003J!\0203\032\032\022\004\022\0020\013\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\004HÆ\003J\t\0204\032\0020\016HÆ\003J\t\0205\032\0020\020HÆ\003J\017\0206\032\b\022\004\022\0020\0230\022HÆ\003J\t\0207\032\0020\025HÆ\003J­\001\0208\032\0020\0002\016\b\002\020\003\032\b\022\004\022\0020\0050\0042 \b\002\020\006\032\032\022\004\022\0020\b\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\0042 \b\002\020\n\032\032\022\004\022\0020\013\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\0042 \b\002\020\f\032\032\022\004\022\0020\013\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\0042\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\016\b\002\020\021\032\b\022\004\022\0020\0230\0222\b\b\002\020\024\032\0020\025HÆ\001J\b\0209\032\0020\002H\026J\023\020:\032\0020\0232\b\020;\032\004\030\0010<HÖ\003J\t\020=\032\0020>HÖ\001J\t\020?\032\0020@HÖ\001J\020\020A\032\0020B2\006\020C\032\0020\002H\026J\f\020D\032\0020B*\0020EH\026R\032\020\r\032\0020\016X\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032R\032\020\017\032\0020\020X\016¢\006\016\n\000\032\004\b\033\020\034\"\004\b\035\020\036R\032\020\024\032\0020\025X\016¢\006\016\n\000\032\004\b\037\020 \"\004\b!\020\"R \020\021\032\b\022\004\022\0020\0230\022X\016¢\006\016\n\000\032\004\b\021\020#\"\004\b$\020%R2\020\n\032\032\022\004\022\0020\013\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\004X\016¢\006\016\n\000\032\004\b&\020'\"\004\b(\020)R2\020\006\032\032\022\004\022\0020\b\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\004X\016¢\006\016\n\000\032\004\b*\020'\"\004\b+\020)R2\020\f\032\032\022\004\022\0020\013\022\004\022\0020\t\030\0010\007R\b\022\004\022\0020\0050\004X\016¢\006\016\n\000\032\004\b,\020'\"\004\b-\020)R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b.\020/¨\006F"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/EnterExitTransitionModifierNode;", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "offsetAnimation", "Landroidx/compose/ui/unit/IntOffset;", "slideAnimation", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "isEnabled", "Lkotlin/Function0;", "", "graphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "getOffsetAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setOffsetAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getSizeAnimation", "setSizeAnimation", "getSlideAnimation", "setSlideAnimation", "getTransition", "()Landroidx/compose/animation/core/Transition;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "animation"})
/*      */ final class EnterExitTransitionElement
/*      */   extends ModifierNodeElement<EnterExitTransitionModifierNode>
/*      */ {
/*      */   @NotNull
/*      */   private final Transition<EnterExitState> transition;
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
/*      */   
/*      */   @NotNull
/*      */   public final Transition<EnterExitState> getTransition() {
/* 1234 */     return this.transition; } @Nullable
/* 1235 */   public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() { return this.sizeAnimation; } public final void setSizeAnimation(@Nullable Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> <set-?>) { this.sizeAnimation = <set-?>; } @Nullable
/* 1236 */   public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() { return this.offsetAnimation; } public final void setOffsetAnimation(@Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> <set-?>) { this.offsetAnimation = <set-?>; }
/*      */   @Nullable
/* 1238 */   public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() { return this.slideAnimation; } public final void setSlideAnimation(@Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> <set-?>) { this.slideAnimation = <set-?>; } @NotNull
/* 1239 */   public final EnterTransition getEnter() { return this.enter; } public final void setEnter(@NotNull EnterTransition <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.enter = <set-?>; } @NotNull
/* 1240 */   public final ExitTransition getExit() { return this.exit; } public final void setExit(@NotNull ExitTransition <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.exit = <set-?>; } @NotNull
/* 1241 */   public final Function0<Boolean> isEnabled() { return this.isEnabled; } public final void setEnabled(@NotNull Function0<Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.isEnabled = <set-?>; } @NotNull
/* 1242 */   public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() { return this.graphicsLayerBlock; } public final void setGraphicsLayerBlock(@NotNull GraphicsLayerBlockForEnterExit <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.graphicsLayerBlock = <set-?>; } public EnterExitTransitionElement(@NotNull Transition<EnterExitState> transition, @Nullable Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull Function0<Boolean> isEnabled, @NotNull GraphicsLayerBlockForEnterExit graphicsLayerBlock) { this.transition = transition; this.sizeAnimation = sizeAnimation; this.offsetAnimation = offsetAnimation; this.slideAnimation = slideAnimation; this.enter = enter; this.exit = exit; this.isEnabled = isEnabled; this.graphicsLayerBlock = graphicsLayerBlock; }
/*      */    @NotNull
/*      */   public EnterExitTransitionModifierNode create() {
/* 1245 */     return new EnterExitTransitionModifierNode(
/* 1246 */         this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, 
/* 1247 */         this.isEnabled, this.graphicsLayerBlock);
/*      */   }
/*      */   
/*      */   public void update(@NotNull EnterExitTransitionModifierNode node) {
/* 1251 */     Intrinsics.checkNotNullParameter(node, "node"); node.setTransition(this.transition);
/* 1252 */     node.setSizeAnimation(this.sizeAnimation);
/* 1253 */     node.setOffsetAnimation(this.offsetAnimation);
/* 1254 */     node.setSlideAnimation(this.slideAnimation);
/* 1255 */     node.setEnter(this.enter);
/* 1256 */     node.setExit(this.exit);
/* 1257 */     node.setEnabled(this.isEnabled);
/* 1258 */     node.setGraphicsLayerBlock(this.graphicsLayerBlock);
/*      */   }
/*      */   
/*      */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 1262 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); $this$inspectableProperties.setName("enterExitTransition");
/* 1263 */     $this$inspectableProperties.getProperties().set("transition", this.transition);
/* 1264 */     $this$inspectableProperties.getProperties().set("sizeAnimation", this.sizeAnimation);
/* 1265 */     $this$inspectableProperties.getProperties().set("offsetAnimation", this.offsetAnimation);
/* 1266 */     $this$inspectableProperties.getProperties().set("slideAnimation", this.slideAnimation);
/* 1267 */     $this$inspectableProperties.getProperties().set("enter", this.enter);
/* 1268 */     $this$inspectableProperties.getProperties().set("exit", this.exit);
/* 1269 */     $this$inspectableProperties.getProperties().set("graphicsLayerBlock", this.graphicsLayerBlock);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final Transition<EnterExitState> component1() {
/*      */     return this.transition;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> component2() {
/*      */     return this.sizeAnimation;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component3() {
/*      */     return this.offsetAnimation;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component4() {
/*      */     return this.slideAnimation;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final EnterTransition component5() {
/*      */     return this.enter;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final ExitTransition component6() {
/*      */     return this.exit;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final Function0<Boolean> component7() {
/*      */     return this.isEnabled;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final GraphicsLayerBlockForEnterExit component8() {
/*      */     return this.graphicsLayerBlock;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final EnterExitTransitionElement copy(@NotNull Transition<EnterExitState> transition, @Nullable Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation, @Nullable Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull Function0<Boolean> isEnabled, @NotNull GraphicsLayerBlockForEnterExit graphicsLayerBlock) {
/*      */     Intrinsics.checkNotNullParameter(transition, "transition");
/*      */     Intrinsics.checkNotNullParameter(enter, "enter");
/*      */     Intrinsics.checkNotNullParameter(exit, "exit");
/*      */     Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
/*      */     Intrinsics.checkNotNullParameter(graphicsLayerBlock, "graphicsLayerBlock");
/*      */     return new EnterExitTransitionElement(transition, sizeAnimation, offsetAnimation, slideAnimation, enter, exit, isEnabled, graphicsLayerBlock);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public String toString() {
/*      */     return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
/*      */   }
/*      */   
/*      */   public int hashCode() {
/*      */     result = this.transition.hashCode();
/*      */     result = result * 31 + ((this.sizeAnimation == null) ? 0 : this.sizeAnimation.hashCode());
/*      */     result = result * 31 + ((this.offsetAnimation == null) ? 0 : this.offsetAnimation.hashCode());
/*      */     result = result * 31 + ((this.slideAnimation == null) ? 0 : this.slideAnimation.hashCode());
/*      */     result = result * 31 + this.enter.hashCode();
/*      */     result = result * 31 + this.exit.hashCode();
/*      */     result = result * 31 + this.isEnabled.hashCode();
/*      */     return result * 31 + this.graphicsLayerBlock.hashCode();
/*      */   }
/*      */   
/*      */   public boolean equals(@Nullable Object other) {
/*      */     if (this == other)
/*      */       return true; 
/*      */     if (!(other instanceof EnterExitTransitionElement))
/*      */       return false; 
/*      */     EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement)other;
/*      */     return !Intrinsics.areEqual(this.transition, enterExitTransitionElement.transition) ? false : (!Intrinsics.areEqual(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) ? false : (!Intrinsics.areEqual(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) ? false : (!Intrinsics.areEqual(this.slideAnimation, enterExitTransitionElement.slideAnimation) ? false : (!Intrinsics.areEqual(this.enter, enterExitTransitionElement.enter) ? false : (!Intrinsics.areEqual(this.exit, enterExitTransitionElement.exit) ? false : (!Intrinsics.areEqual(this.isEnabled, enterExitTransitionElement.isEnabled) ? false : (!!Intrinsics.areEqual(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock))))))));
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\EnterExitTransitionElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */