/*     */ package androidx.compose.ui.text.input;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\006\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\020\020\t\032\0020\n2\006\020\013\032\0020\fH\026J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020H\002J\b\020\021\032\0020\003H\026J\b\020\022\032\0020\023H\026R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\007¨\006\024"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingRegionCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "start", "", "end", "(II)V", "getEnd", "()I", "getStart", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class SetComposingRegionCommand
/*     */   implements EditCommand
/*     */ {
/*     */   private final int start;
/*     */   private final int end;
/*     */   public static final int $stable;
/*     */   
/*     */   public SetComposingRegionCommand(int start, int end) {
/* 116 */     this.start = start;
/* 117 */     this.end = end; } public final int getEnd() { return this.end; }
/*     */   
/*     */   public final int getStart() {
/*     */     return this.start;
/*     */   }
/*     */   public void applyTo(@NotNull EditingBuffer buffer) {
/* 123 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); if (buffer.hasComposition$ui_text()) {
/* 124 */       buffer.commitComposition$ui_text();
/*     */     }
/*     */ 
/*     */     
/* 128 */     int clampedStart = RangesKt.coerceIn(this.start, 0, buffer.getLength$ui_text());
/* 129 */     int clampedEnd = RangesKt.coerceIn(this.end, 0, buffer.getLength$ui_text());
/* 130 */     if (clampedStart != clampedEnd)
/*     */     {
/* 132 */       if (clampedStart < clampedEnd) {
/* 133 */         buffer.setComposition$ui_text(clampedStart, clampedEnd);
/*     */       } else {
/* 135 */         buffer.setComposition$ui_text(clampedEnd, clampedStart);
/*     */       }  } 
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 140 */     if (this == other) return true; 
/* 141 */     if (!(other instanceof SetComposingRegionCommand)) return false;
/*     */     
/* 143 */     if (this.start != ((SetComposingRegionCommand)other).start) return false; 
/* 144 */     if (this.end != ((SetComposingRegionCommand)other).end) return false;
/*     */     
/* 146 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 150 */     int result = this.start;
/* 151 */     result = 31 * result + this.end;
/* 152 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 156 */     return "SetComposingRegionCommand(start=" + this.start + ", end=" + this.end + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\SetComposingRegionCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */