/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\b'\030\0002\0020\001:\002\013\fB\007\b\002¢\006\002\020\002R\024\020\003\032\004\030\0010\004X¦\004¢\006\006\032\004\b\005\020\006R\024\020\007\032\004\030\0010\bX¦\004¢\006\006\032\004\b\t\020\n¨\006\r"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation;", "", "()V", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "styles", "Landroidx/compose/ui/text/TextLinkStyles;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "Clickable", "Url", "ui-text"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class LinkAnnotation {
/*    */   public static final int $stable;
/*    */   
/*    */   private LinkAnnotation() {}
/*    */   
/*    */   @Nullable
/*    */   public abstract LinkInteractionListener getLinkInteractionListener();
/*    */   
/*    */   @Nullable
/*    */   public abstract TextLinkStyles getStyles();
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\002\020\bJ\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022H\002J\b\020\023\032\0020\024H\026J\b\020\025\032\0020\003H\026R\026\020\006\032\004\030\0010\007X\004¢\006\b\n\000\032\004\b\t\020\nR\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\026"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Url;", "Landroidx/compose/ui/text/LinkAnnotation;", "url", "", "styles", "Landroidx/compose/ui/text/TextLinkStyles;", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "getUrl", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "ui-text"})
/*    */   @StabilityInferred(parameters = 0)
/*    */   public static final class Url
/*    */     extends LinkAnnotation
/*    */   {
/*    */     @NotNull
/*    */     private final String url;
/*    */     @Nullable
/*    */     private final TextLinkStyles styles;
/*    */     @Nullable
/*    */     private final LinkInteractionListener linkInteractionListener;
/*    */     public static final int $stable = 8;
/*    */     
/*    */     @NotNull
/* 37 */     public final String getUrl() { return this.url; } @Nullable
/* 38 */     public TextLinkStyles getStyles() { return this.styles; } @Nullable
/* 39 */     public LinkInteractionListener getLinkInteractionListener() { return this.linkInteractionListener; }
/* 40 */     public Url(@NotNull String url, @Nullable TextLinkStyles styles, @Nullable LinkInteractionListener linkInteractionListener) { super(null); this.url = url;
/*    */       this.styles = styles;
/* 42 */       this.linkInteractionListener = linkInteractionListener; } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 43 */       if (!(other instanceof Url)) return false;
/*    */       
/* 45 */       if (!Intrinsics.areEqual(this.url, ((Url)other).url)) return false; 
/* 46 */       if (!Intrinsics.areEqual(getStyles(), ((Url)other).getStyles())) return false; 
/* 47 */       if (!Intrinsics.areEqual(getLinkInteractionListener(), ((Url)other).getLinkInteractionListener())) return false;
/*    */       
/* 49 */       return true; }
/*    */ 
/*    */     
/*    */     public int hashCode() {
/* 53 */       int result = this.url.hashCode();
/* 54 */       getStyles(); result = 31 * result + ((getStyles() != null) ? getStyles().hashCode() : 0);
/* 55 */       getLinkInteractionListener(); result = 31 * result + ((getLinkInteractionListener() != null) ? getLinkInteractionListener().hashCode() : 0);
/* 56 */       return result;
/*    */     }
/*    */     @NotNull
/*    */     public String toString() {
/* 60 */       return "LinkAnnotation.Url(url=" + this.url + ')';
/*    */     }
/*    */   }
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bJ\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022H\002J\b\020\023\032\0020\024H\026J\b\020\025\032\0020\003H\026R\026\020\006\032\004\030\0010\007X\004¢\006\b\n\000\032\004\b\t\020\nR\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\026"}, d2 = {"Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "Landroidx/compose/ui/text/LinkAnnotation;", "tag", "", "styles", "Landroidx/compose/ui/text/TextLinkStyles;", "linkInteractionListener", "Landroidx/compose/ui/text/LinkInteractionListener;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextLinkStyles;Landroidx/compose/ui/text/LinkInteractionListener;)V", "getLinkInteractionListener", "()Landroidx/compose/ui/text/LinkInteractionListener;", "getStyles", "()Landroidx/compose/ui/text/TextLinkStyles;", "getTag", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "ui-text"})
/*    */   @StabilityInferred(parameters = 0)
/*    */   public static final class Clickable extends LinkAnnotation { @NotNull
/*    */     private final String tag; @Nullable
/*    */     private final TextLinkStyles styles;
/*    */     @NotNull
/* 69 */     public final String getTag() { return this.tag; } @Nullable private final LinkInteractionListener linkInteractionListener; public static final int $stable = 8; @Nullable
/* 70 */     public TextLinkStyles getStyles() { return this.styles; }
/*    */     @Nullable
/* 72 */     public LinkInteractionListener getLinkInteractionListener() { return this.linkInteractionListener; }
/* 73 */     public Clickable(@NotNull String tag, @Nullable TextLinkStyles styles, @Nullable LinkInteractionListener linkInteractionListener) { super(null); this.tag = tag;
/*    */       this.styles = styles;
/* 75 */       this.linkInteractionListener = linkInteractionListener; } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 76 */       if (!(other instanceof Clickable)) return false;
/*    */       
/* 78 */       if (!Intrinsics.areEqual(this.tag, ((Clickable)other).tag)) return false; 
/* 79 */       if (!Intrinsics.areEqual(getStyles(), ((Clickable)other).getStyles())) return false; 
/* 80 */       if (!Intrinsics.areEqual(getLinkInteractionListener(), ((Clickable)other).getLinkInteractionListener())) return false;
/*    */       
/* 82 */       return true; }
/*    */ 
/*    */     
/*    */     public int hashCode() {
/* 86 */       int result = this.tag.hashCode();
/* 87 */       getStyles(); result = 31 * result + ((getStyles() != null) ? getStyles().hashCode() : 0);
/* 88 */       getLinkInteractionListener(); result = 31 * result + ((getLinkInteractionListener() != null) ? getLinkInteractionListener().hashCode() : 0);
/* 89 */       return result;
/*    */     }
/*    */     @NotNull
/*    */     public String toString() {
/* 93 */       return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\LinkAnnotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */