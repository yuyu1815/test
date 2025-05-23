/*     */ package androidx.compose.ui.graphics.vector;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000@\n\000\n\002\020\f\n\002\b\006\n\002\020\b\n\002\b\027\n\002\020\002\n\000\n\002\020!\n\002\030\002\n\000\n\002\020\024\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\000\032&\020\037\032\0020 2\f\020!\032\b\022\004\022\0020#0\"2\006\020$\032\0020%2\006\020&\032\0020\bH\002\032i\020'\032\0020 2\f\020!\032\b\022\004\022\0020#0\"2\006\020$\032\0020%2\006\020&\032\0020\b2\006\020(\032\0020\b28\b\004\020)\0322\022\023\022\0210%¢\006\f\b+\022\b\b,\022\004\b\b(-\022\023\022\0210\b¢\006\f\b+\022\b\b,\022\004\b\b(.\022\004\022\0020#0*H\b\032&\020/\032\0020 2\f\020!\032\b\022\004\022\0020#0\"2\006\020$\032\0020%2\006\020&\032\0020\bH\002\0324\0200\032\0020 *\0020\0012\026\020!\032\022\022\004\022\0020#01j\b\022\004\022\0020#`22\006\020$\032\0020%2\006\020&\032\0020\bH\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\bXT¢\006\002\n\000\"\016\020\t\032\0020\bXT¢\006\002\n\000\"\016\020\n\032\0020\bXT¢\006\002\n\000\"\016\020\013\032\0020\bXT¢\006\002\n\000\"\016\020\f\032\0020\bXT¢\006\002\n\000\"\016\020\r\032\0020\bXT¢\006\002\n\000\"\016\020\016\032\0020\bXT¢\006\002\n\000\"\016\020\017\032\0020\bXT¢\006\002\n\000\"\016\020\020\032\0020\bXT¢\006\002\n\000\"\016\020\021\032\0020\001XT¢\006\002\n\000\"\016\020\022\032\0020\001XT¢\006\002\n\000\"\016\020\023\032\0020\001XT¢\006\002\n\000\"\016\020\024\032\0020\001XT¢\006\002\n\000\"\016\020\025\032\0020\001XT¢\006\002\n\000\"\016\020\026\032\0020\001XT¢\006\002\n\000\"\016\020\027\032\0020\001XT¢\006\002\n\000\"\016\020\030\032\0020\001XT¢\006\002\n\000\"\016\020\031\032\0020\001XT¢\006\002\n\000\"\016\020\032\032\0020\001XT¢\006\002\n\000\"\016\020\033\032\0020\001XT¢\006\002\n\000\"\016\020\034\032\0020\001XT¢\006\002\n\000\"\016\020\035\032\0020\001XT¢\006\002\n\000\"\016\020\036\032\0020\001XT¢\006\002\n\000¨\0063"}, d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathMoveNodeFromArgs", "", "nodes", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", "count", "pathNodesFromArgs", "numArgs", "nodeFor", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "subArray", "start", "pathRelativeMoveNodeFromArgs", "addPathNodes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n1#1,419:1\n338#1,7:420\n338#1,7:427\n338#1,7:434\n338#1,7:441\n338#1,7:448\n338#1,7:455\n338#1,7:462\n338#1,7:469\n338#1,7:476\n338#1,7:483\n338#1,7:490\n338#1,7:497\n338#1,7:504\n338#1,7:511\n338#1,7:518\n338#1,7:525\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n158#1:420,7\n167#1:427,7\n171#1:434,7\n180#1:441,7\n189#1:448,7\n198#1:455,7\n207#1:462,7\n223#1:469,7\n234#1:476,7\n248#1:483,7\n262#1:490,7\n276#1:497,7\n285#1:504,7\n294#1:511,7\n303#1:518,7\n315#1:525,7\n*E\n"})
/*     */ public final class PathNodeKt
/*     */ {
/*     */   private static final char RelativeCloseKey = 'z';
/*     */   private static final char CloseKey = 'Z';
/*     */   private static final char RelativeMoveToKey = 'm';
/*     */   private static final char MoveToKey = 'M';
/*     */   private static final char RelativeLineToKey = 'l';
/*     */   private static final char LineToKey = 'L';
/*     */   private static final char RelativeHorizontalToKey = 'h';
/*     */   private static final char HorizontalToKey = 'H';
/*     */   private static final char RelativeVerticalToKey = 'v';
/*     */   private static final char VerticalToKey = 'V';
/*     */   private static final char RelativeCurveToKey = 'c';
/*     */   private static final char CurveToKey = 'C';
/*     */   private static final char RelativeReflectiveCurveToKey = 's';
/*     */   private static final char ReflectiveCurveToKey = 'S';
/*     */   private static final char RelativeQuadToKey = 'q';
/*     */   private static final char QuadToKey = 'Q';
/*     */   private static final char RelativeReflectiveQuadToKey = 't';
/*     */   private static final char ReflectiveQuadToKey = 'T';
/*     */   private static final char RelativeArcToKey = 'a';
/*     */   private static final char ArcToKey = 'A';
/*     */   private static final int NUM_MOVE_TO_ARGS = 2;
/*     */   private static final int NUM_LINE_TO_ARGS = 2;
/*     */   private static final int NUM_HORIZONTAL_TO_ARGS = 1;
/*     */   private static final int NUM_VERTICAL_TO_ARGS = 1;
/*     */   private static final int NUM_CURVE_TO_ARGS = 6;
/*     */   private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
/*     */   private static final int NUM_QUAD_TO_ARGS = 4;
/*     */   private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
/*     */   private static final int NUM_ARC_TO_ARGS = 7;
/*     */   
/*     */   public static final void addPathNodes(char $this$addPathNodes, @NotNull ArrayList<PathNode.Close> nodes, @NotNull float[] args, int count) {
/* 151 */     Intrinsics.checkNotNullParameter(nodes, "nodes"); Intrinsics.checkNotNullParameter(args, "args"); char c = $this$addPathNodes;
/* 152 */     if ((c == 'z') ? true : ((c == 'Z'))) { nodes.add(PathNode.Close.INSTANCE); }
/*     */     
/* 154 */     else if (c == 'm') { pathRelativeMoveNodeFromArgs((List)nodes, args, count); }
/*     */     
/* 156 */     else if (c == 'M') { pathMoveNodeFromArgs((List)nodes, args, count);
/*     */        }
/*     */     
/*     */     else
/*     */     
/*     */     { 
/* 162 */       int numArgs$iv = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       int $i$f$pathNodesFromArgs = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 420 */       int end$iv = count - numArgs$iv;
/* 421 */       int index$iv = 0;
/* 422 */       while (index$iv <= end$iv) {
/* 423 */         int i = index$iv; float[] arrayOfFloat = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$1 = 0; arrayList.add(new PathNode.RelativeLineTo(arrayOfFloat[i], arrayOfFloat[i + 1]));
/* 424 */         index$iv += numArgs$iv;
/*     */       }  numArgs$iv = 2;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 427 */       end$iv = count - numArgs$iv;
/* 428 */       index$iv = 0;
/* 429 */       while (index$iv <= end$iv) {
/* 430 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$2 = 0; arrayList.add(new PathNode.LineTo(array[start], array[start + 1]));
/* 431 */         index$iv += numArgs$iv;
/*     */       }  numArgs$iv = 1;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 434 */       end$iv = count - numArgs$iv;
/* 435 */       index$iv = 0;
/* 436 */       while (index$iv <= end$iv) {
/* 437 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$3 = 0; arrayList.add(new PathNode.RelativeHorizontalTo(array[start]));
/* 438 */         index$iv += numArgs$iv;
/*     */       }  numArgs$iv = 1;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 441 */       end$iv = count - numArgs$iv;
/* 442 */       index$iv = 0;
/* 443 */       while (index$iv <= end$iv) {
/* 444 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$4 = 0; arrayList.add(new PathNode.HorizontalTo(array[start]));
/* 445 */         index$iv += numArgs$iv;
/*     */       }  numArgs$iv = 1;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 448 */       end$iv = count - numArgs$iv;
/* 449 */       index$iv = 0;
/* 450 */       while (index$iv <= end$iv) {
/* 451 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$5 = 0; arrayList.add(new PathNode.RelativeVerticalTo(array[start]));
/* 452 */         index$iv += numArgs$iv;
/*     */       }  numArgs$iv = 1;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 455 */       end$iv = count - numArgs$iv;
/* 456 */       index$iv = 0;
/* 457 */       while (index$iv <= end$iv) {
/* 458 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$6 = 0; arrayList.add(new PathNode.VerticalTo(array[start]));
/* 459 */         index$iv += numArgs$iv;
/*     */       }  numArgs$iv = 6;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 462 */       end$iv = count - numArgs$iv;
/* 463 */       index$iv = 0;
/* 464 */       while (index$iv <= end$iv) {
/* 465 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$7 = 0;
/*     */       } 
/*     */       numArgs$iv = 6;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 469 */       end$iv = count - numArgs$iv;
/* 470 */       index$iv = 0;
/* 471 */       while (index$iv <= end$iv) {
/* 472 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$8 = 0;
/*     */       } 
/*     */       numArgs$iv = 4;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 476 */       end$iv = count - numArgs$iv;
/* 477 */       index$iv = 0;
/* 478 */       while (index$iv <= end$iv) {
/* 479 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$9 = 0;
/*     */       } 
/*     */       numArgs$iv = 4;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 483 */       end$iv = count - numArgs$iv;
/* 484 */       index$iv = 0;
/* 485 */       while (index$iv <= end$iv) {
/* 486 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$10 = 0;
/*     */       } 
/*     */       numArgs$iv = 4;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 490 */       end$iv = count - numArgs$iv;
/* 491 */       index$iv = 0;
/* 492 */       while (index$iv <= end$iv) {
/* 493 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$11 = 0;
/*     */       } 
/*     */       numArgs$iv = 4;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 497 */       end$iv = count - numArgs$iv;
/* 498 */       index$iv = 0;
/* 499 */       while (index$iv <= end$iv) {
/* 500 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$12 = 0;
/*     */       } 
/*     */       numArgs$iv = 2;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 504 */       end$iv = count - numArgs$iv;
/* 505 */       index$iv = 0;
/* 506 */       while (index$iv <= end$iv) {
/* 507 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$13 = 0; arrayList.add(new PathNode.RelativeReflectiveQuadTo(array[start], array[start + 1]));
/* 508 */         index$iv += numArgs$iv;
/*     */       }  numArgs$iv = 2;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 511 */       end$iv = count - numArgs$iv;
/* 512 */       index$iv = 0;
/* 513 */       while (index$iv <= end$iv) {
/* 514 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$14 = 0; arrayList.add(new PathNode.ReflectiveQuadTo(array[start], array[start + 1]));
/* 515 */         index$iv += numArgs$iv;
/*     */       }  numArgs$iv = 7;
/*     */       $i$f$pathNodesFromArgs = 0;
/* 518 */       end$iv = count - numArgs$iv;
/* 519 */       index$iv = 0;
/* 520 */       while (index$iv <= end$iv) {
/* 521 */         int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$15 = 0;
/*     */       }  if (c == 'A') {
/*     */         numArgs$iv = 7;
/*     */         $i$f$pathNodesFromArgs = 0;
/* 525 */         end$iv = count - numArgs$iv;
/* 526 */         index$iv = 0;
/* 527 */         while (index$iv <= end$iv) {
/* 528 */           int start = index$iv; float[] array = args; ArrayList<PathNode.Close> arrayList = nodes; int $i$a$-pathNodesFromArgs-PathNodeKt$addPathNodes$16 = 0;
/*     */         } 
/*     */       } else {
/*     */         throw new IllegalArgumentException("Unknown command for: " + $this$addPathNodes);
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   private static final void pathNodesFromArgs(List<Object> nodes, float[] args, int count, int numArgs, Function2 nodeFor) {
/*     */     int $i$f$pathNodesFromArgs = 0, end = count - numArgs;
/*     */     int index = 0;
/*     */     while (index <= end) {
/*     */       nodes.add(nodeFor.invoke(args, Integer.valueOf(index)));
/*     */       index += numArgs;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final void pathMoveNodeFromArgs(List<PathNode.MoveTo> nodes, float[] args, int count) {
/*     */     int end = count - 2;
/*     */     if (end >= 0) {
/*     */       nodes.add(new PathNode.MoveTo(args[0], args[1]));
/*     */       int index = 2;
/*     */       while (index <= end) {
/*     */         nodes.add(new PathNode.LineTo(args[index], args[index + 1]));
/*     */         index += 2;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final void pathRelativeMoveNodeFromArgs(List<PathNode.RelativeMoveTo> nodes, float[] args, int count) {
/*     */     int end = count - 2;
/*     */     if (end >= 0) {
/*     */       nodes.add(new PathNode.RelativeMoveTo(args[0], args[1]));
/*     */       int index = 2;
/*     */       while (index <= end) {
/*     */         nodes.add(new PathNode.RelativeLineTo(args[index], args[index + 1]));
/*     */         index += 2;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\vector\PathNodeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */