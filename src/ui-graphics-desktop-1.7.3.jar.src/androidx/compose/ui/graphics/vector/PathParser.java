/*     */ package androidx.compose.ui.graphics.vector;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import androidx.compose.ui.graphics.SkiaBackedPath_skikoKt;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\024\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\024\020\t\032\0020\0002\f\020\005\032\b\022\004\022\0020\0070\nJ\006\020\013\032\0020\fJ\016\020\r\032\0020\0002\006\020\016\032\0020\017J8\020\020\032\022\022\004\022\0020\0070\006j\b\022\004\022\0020\007`\b2\006\020\016\032\0020\0172\030\b\002\020\005\032\022\022\004\022\0020\0070\006j\b\022\004\022\0020\007`\bJ\021\020\021\032\0020\f2\006\020\022\032\0020\023H\bJ\f\020\024\032\b\022\004\022\0020\0070\nJ\020\020\025\032\0020\0262\b\b\002\020\027\032\0020\026R\016\020\003\032\0020\004X\016¢\006\002\n\000R\"\020\005\032\026\022\004\022\0020\007\030\0010\006j\n\022\004\022\0020\007\030\001`\bX\016¢\006\002\n\000¨\006\030"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "()V", "nodeData", "", "nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "addPathNodes", "", "clear", "", "parsePathString", "pathData", "", "pathStringToNodes", "resizeNodeData", "dataCount", "", "toNodes", "toPath", "Landroidx/compose/ui/graphics/Path;", "target", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,589:1\n155#1,6:593\n43#2:590\n44#2:591\n22#3:592\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n138#1:593,6\n132#1:590\n133#1:591\n133#1:592\n*E\n"})
/*     */ public final class PathParser
/*     */ {
/*     */   @Nullable
/*     */   private ArrayList<PathNode> nodes;
/*     */   @NotNull
/*  53 */   private float[] nodeData = new float[64];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void clear() {
/*  59 */     if (this.nodes != null) { this.nodes.clear(); }
/*     */     else
/*     */     {  }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final PathParser parsePathString(@NotNull String pathData) {
/*  69 */     Intrinsics.checkNotNullParameter(pathData, "pathData"); ArrayList<PathNode> dstNodes = this.nodes;
/*  70 */     if (dstNodes == null) {
/*  71 */       dstNodes = new ArrayList<>();
/*  72 */       this.nodes = dstNodes;
/*     */     } else {
/*  74 */       dstNodes.clear();
/*     */     } 
/*  76 */     pathStringToNodes(pathData, dstNodes);
/*  77 */     return this;
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
/*     */   @NotNull
/*     */   public final ArrayList<PathNode> pathStringToNodes(@NotNull String pathData, @NotNull ArrayList<PathNode> nodes) {
/*  90 */     Intrinsics.checkNotNullParameter(pathData, "pathData"); Intrinsics.checkNotNullParameter(nodes, "nodes"); int start = 0;
/*  91 */     int end = pathData.length();
/*     */ 
/*     */     
/*  94 */     int dataCount = 0;
/*     */ 
/*     */     
/*  97 */     for (; start < end && Intrinsics.compare(pathData.charAt(start), 32) <= 0; start++);
/*  98 */     for (; end > start && Intrinsics.compare(pathData.charAt(end - 1), 32) <= 0; end--);
/*     */     
/* 100 */     int index = start;
/* 101 */     while (index < end) {
/* 102 */       char c = Character.MIN_VALUE;
/* 103 */       char command = Character.MIN_VALUE;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       do {
/* 109 */         c = pathData.charAt(index++);
/* 110 */         int lowerChar = c | 0x20;
/* 111 */         if ((lowerChar - 97) * (lowerChar - 122) <= 0 && lowerChar != 101) {
/* 112 */           command = c;
/*     */           break;
/*     */         } 
/* 115 */       } while (index < end);
/*     */ 
/*     */       
/* 118 */       if (command != '\000') {
/*     */ 
/*     */         
/* 121 */         if ((command | 0x20) != 122) {
/* 122 */           dataCount = 0;
/*     */ 
/*     */           
/*     */           while (true) {
/* 126 */             if (index < end && Intrinsics.compare(pathData.charAt(index), 32) <= 0) { index++;
/*     */               
/*     */               continue; }
/*     */ 
/*     */             
/* 131 */             long result = FastFloatParserKt.nextFloat(pathData, index, end);
/* 132 */             long $this$index$iv = result; int $i$f$getIndex = 0; index = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 590 */               (int)($this$index$iv >>> 32L); long $this$floatValue$iv = result; int $i$f$getFloatValue = 0;
/* 591 */             int bits$iv$iv = (int)($this$floatValue$iv & 0xFFFFFFFFL), $i$f$floatFromBits = 0;
/* 592 */             float value = Float.intBitsToFloat(bits$iv$iv); if (!Float.isNaN(value)) {
/* 593 */               this.nodeData[dataCount++] = value; PathParser this_$iv = this; int $i$f$resizeNodeData = 0; if (dataCount >= this_$iv.nodeData.length) {
/* 594 */                 float[] src$iv = this_$iv.nodeData;
/* 595 */                 this_$iv.nodeData = new float[dataCount * 2];
/* 596 */                 ArraysKt.copyInto(src$iv, this_$iv.nodeData, 0, 0, src$iv.length);
/*     */               } 
/*     */             } 
/*     */             for (; index < end && pathData.charAt(index) == ','; index++);
/*     */             if (index >= end || Float.isNaN(value))
/*     */               break; 
/*     */           } 
/*     */         } 
/*     */         PathNodeKt.addPathNodes(command, nodes, this.nodeData, dataCount);
/*     */       } 
/*     */     } 
/*     */     return nodes;
/*     */   }
/*     */   
/*     */   private final void resizeNodeData(int dataCount) {
/*     */     int $i$f$resizeNodeData = 0;
/*     */     if (dataCount >= this.nodeData.length) {
/*     */       float[] src = this.nodeData;
/*     */       this.nodeData = new float[dataCount * 2];
/*     */       ArraysKt.copyInto(src, this.nodeData, 0, 0, src.length);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PathParser addPathNodes(@NotNull List<? extends PathNode> nodes) {
/*     */     Intrinsics.checkNotNullParameter(nodes, "nodes");
/*     */     ArrayList<PathNode> dstNodes = this.nodes;
/*     */     if (dstNodes == null) {
/*     */       dstNodes = new ArrayList<>();
/*     */       this.nodes = dstNodes;
/*     */     } 
/*     */     dstNodes.addAll(nodes);
/*     */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<PathNode> toNodes() {
/*     */     return (this.nodes != null) ? this.nodes : CollectionsKt.emptyList();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path toPath(@NotNull Path target) {
/*     */     Intrinsics.checkNotNullParameter(target, "target");
/*     */     if (this.nodes == null || PathParserKt.toPath(this.nodes, target) == null)
/*     */       PathParserKt.toPath(this.nodes, target); 
/*     */     return SkiaBackedPath_skikoKt.Path();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\vector\PathParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */