/*    */ package org.jetbrains.jewel.foundation;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\017\b\007\030\000 \0212\0020\001:\001\021B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003¢\006\004\b\b\020\tR\023\020\002\032\0020\003¢\006\n\n\002\020\f\032\004\b\n\020\013R\023\020\004\032\0020\003¢\006\n\n\002\020\f\032\004\b\r\020\013R\023\020\005\032\0020\003¢\006\n\n\002\020\f\032\004\b\016\020\013R\023\020\006\032\0020\003¢\006\n\n\002\020\f\032\004\b\017\020\013R\023\020\007\032\0020\003¢\006\n\n\002\020\f\032\004\b\020\020\013¨\006\022"}, d2 = {"Lorg/jetbrains/jewel/foundation/TextColors;", "", "normal", "Landroidx/compose/ui/graphics/Color;", "selected", "disabled", "info", "error", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getNormal-0d7_KjU", "()J", "J", "getSelected-0d7_KjU", "getDisabled-0d7_KjU", "getInfo-0d7_KjU", "getError-0d7_KjU", "Companion", "foundation"})
/*    */ @Immutable
/*    */ public final class TextColors {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long normal;
/*    */   private final long selected;
/*    */   private final long disabled;
/*    */   private final long info;
/*    */   private final long error;
/*    */   public static final int $stable;
/*    */   
/* 22 */   private TextColors(long normal, long selected, long disabled, long info, long error) { this.normal = normal;
/* 23 */     this.selected = selected;
/* 24 */     this.disabled = disabled;
/* 25 */     this.info = info;
/* 26 */     this.error = error; } public final long getError-0d7_KjU() { return this.error; }
/*    */ 
/*    */   
/*    */   public final long getNormal-0d7_KjU() {
/*    */     return this.normal;
/*    */   }
/*    */   
/*    */   public final long getSelected-0d7_KjU() {
/*    */     return this.selected;
/*    */   }
/*    */   
/*    */   public final long getDisabled-0d7_KjU() {
/*    */     return this.disabled;
/*    */   }
/*    */   
/*    */   public final long getInfo-0d7_KjU() {
/*    */     return this.info;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TextColors))
/*    */       return false; 
/*    */     TextColors textColors = (TextColors)other;
/*    */     return !Color.equals-impl0(this.normal, textColors.normal) ? false : (!Color.equals-impl0(this.selected, textColors.selected) ? false : (!Color.equals-impl0(this.disabled, textColors.disabled) ? false : (!Color.equals-impl0(this.info, textColors.info) ? false : (!!Color.equals-impl0(this.error, textColors.error)))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.normal);
/*    */     result = result * 31 + Color.hashCode-impl(this.selected);
/*    */     result = result * 31 + Color.hashCode-impl(this.disabled);
/*    */     result = result * 31 + Color.hashCode-impl(this.info);
/*    */     return result * 31 + Color.hashCode-impl(this.error);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TextColors(normal=" + Color.toString-impl(this.normal) + ", selected=" + Color.toString-impl(this.selected) + ", disabled=" + Color.toString-impl(this.disabled) + ", info=" + Color.toString-impl(this.info) + ", error=" + Color.toString-impl(this.error) + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lorg/jetbrains/jewel/foundation/TextColors$Companion;", "", "<init>", "()V", "foundation"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\TextColors.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */