/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*     */ 
/*     */ import com.intellij.build.FilePosition;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\013\020\r\032\004\030\0010\005HÆ\003J\037\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;", "message", "", "position", "Lcom/intellij/build/FilePosition;", "<init>", "(Ljava/lang/String;Lcom/intellij/build/FilePosition;)V", "getMessage", "()Ljava/lang/String;", "getPosition", "()Lcom/intellij/build/FilePosition;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-idea"})
/*     */ public final class BuildErrorEvent
/*     */   extends RunEvent
/*     */ {
/*     */   @NotNull
/*     */   private final String message;
/*     */   @Nullable
/*     */   private final FilePosition position;
/*     */   
/*     */   public BuildErrorEvent(@NotNull String message, @Nullable FilePosition position) {
/* 232 */     super(null); this.message = message; this.position = position; } @NotNull public final String getMessage() { return this.message; } @Nullable public final FilePosition getPosition() { return this.position; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.message;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final FilePosition component2() {
/*     */     return this.position;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BuildErrorEvent copy(@NotNull String message, @Nullable FilePosition position) {
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     return new BuildErrorEvent(message, position);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "BuildErrorEvent(message=" + this.message + ", position=" + this.position + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.message.hashCode();
/*     */     return result * 31 + ((this.position == null) ? 0 : this.position.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof BuildErrorEvent))
/*     */       return false; 
/*     */     BuildErrorEvent buildErrorEvent = (BuildErrorEvent)other;
/*     */     return !Intrinsics.areEqual(this.message, buildErrorEvent.message) ? false : (!!Intrinsics.areEqual(this.position, buildErrorEvent.position));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\BuildErrorEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */