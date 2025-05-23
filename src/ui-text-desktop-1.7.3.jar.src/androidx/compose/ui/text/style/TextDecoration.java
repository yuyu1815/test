/*     */ package androidx.compose.ui.text.style;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.util.ListUtilsKt;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\002\b\007\030\000 \0202\0020\001:\001\020B\017\b\000\022\006\020\002\032\0020\003¢\006\002\020\004J\021\020\007\032\0020\b2\006\020\t\032\0020\000H\002J\023\020\n\032\0020\b2\b\020\t\032\004\030\0010\001H\002J\b\020\013\032\0020\003H\026J\021\020\f\032\0020\0002\006\020\r\032\0020\000H\002J\b\020\016\032\0020\017H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "mask", "", "(I)V", "getMask", "()I", "contains", "", "other", "equals", "hashCode", "plus", "decoration", "toString", "", "Companion", "ui-text"})
/*     */ @Immutable
/*     */ public final class TextDecoration
/*     */ {
/*     */   public TextDecoration(int mask) {
/*  27 */     this.mask = mask; } public final int getMask() { return this.mask; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020 \n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\024\020\016\032\0020\0042\f\020\017\032\b\022\004\022\0020\0040\020R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007R\034\020\013\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\f\020\002\032\004\b\r\020\007¨\006\021"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "()V", "LineThrough", "Landroidx/compose/ui/text/style/TextDecoration;", "getLineThrough$annotations", "getLineThrough", "()Landroidx/compose/ui/text/style/TextDecoration;", "None", "getNone$annotations", "getNone", "Underline", "getUnderline$annotations", "getUnderline", "combine", "decorations", "", "ui-text"})
/*     */   @SourceDebugExtension({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n256#2,3:112\n33#2,4:115\n259#2,2:119\n38#2:121\n261#2:122\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:115,4\n57#1:119,2\n57#1:121\n57#1:122\n*E\n"})
/*     */   public static final class Companion { @NotNull
/*     */     public final TextDecoration getNone() {
/*  31 */       return TextDecoration.None;
/*     */     }
/*     */ 
/*     */     
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final TextDecoration getUnderline() {
/*  39 */       return TextDecoration.Underline;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final TextDecoration getLineThrough() {
/*  47 */       return TextDecoration.LineThrough;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final TextDecoration combine(@NotNull List decorations) {
/*  57 */       Intrinsics.checkNotNullParameter(decorations, "decorations"); List list1 = decorations; Object initial$iv = Integer.valueOf(0); int $i$f$fastFold = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 113 */       Object accumulator$iv = null; accumulator$iv = initial$iv;
/* 114 */       List $this$fastForEach$iv$iv = list1; int $i$f$fastForEach = 0;
/*     */       
/* 116 */       int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 117 */         Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 118 */         Object e$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFold$2$iv = 0;
/* 119 */         TextDecoration textDecoration = (TextDecoration)e$iv; int acc = ((Number)accumulator$iv).intValue(), $i$a$-fastFold-TextDecoration$Companion$combine$mask$1 = 0; accumulator$iv = Integer.valueOf(acc | textDecoration.getMask());
/*     */       } 
/*     */       
/* 122 */       int mask = ((Number)accumulator$iv).intValue();
/*     */       return new TextDecoration(mask);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final int mask;
/*     */   public static final int $stable;
/*     */   @NotNull
/*     */   private static final TextDecoration None = new TextDecoration(0);
/*     */   @NotNull
/*     */   private static final TextDecoration Underline = new TextDecoration(1);
/*     */   @NotNull
/*     */   private static final TextDecoration LineThrough = new TextDecoration(2);
/*     */   
/*     */   @NotNull
/*     */   public final TextDecoration plus(@NotNull TextDecoration decoration) {
/*     */     Intrinsics.checkNotNullParameter(decoration, "decoration");
/*     */     return new TextDecoration(this.mask | decoration.mask);
/*     */   }
/*     */   
/*     */   public final boolean contains(@NotNull TextDecoration other) {
/*     */     Intrinsics.checkNotNullParameter(other, "other");
/*     */     return ((this.mask | other.mask) == this.mask);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     if (this.mask == 0)
/*     */       return "TextDecoration.None"; 
/*     */     List<String> values = new ArrayList();
/*     */     if ((this.mask & Underline.mask) != 0)
/*     */       values.add("Underline"); 
/*     */     if ((this.mask & LineThrough.mask) != 0)
/*     */       values.add("LineThrough"); 
/*     */     if (values.size() == 1)
/*     */       return "TextDecoration." + (String)values.get(0); 
/*     */     return "TextDecoration[" + ListUtilsKt.fastJoinToString$default(values, ", ", null, null, 0, null, null, 62, null) + ']';
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof TextDecoration))
/*     */       return false; 
/*     */     if (this.mask != ((TextDecoration)other).mask)
/*     */       return false; 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.mask;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\TextDecoration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */