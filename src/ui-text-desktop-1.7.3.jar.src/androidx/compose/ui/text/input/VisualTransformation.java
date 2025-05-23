/*    */ package androidx.compose.ui.text.input;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.text.AnnotatedString;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bç\001\030\000 \0062\0020\001:\001\006J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "Companion", "ui-text"})
/*    */ @Immutable
/*    */ public interface VisualTransformation
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   TransformedText filter(@NotNull AnnotatedString paramAnnotatedString);
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/input/VisualTransformation;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/text/input/VisualTransformation;", "ui-text"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/* 94 */     private static final VisualTransformation None = Companion::None$lambda$0; @NotNull public final VisualTransformation getNone() { return None; } private static final TransformedText None$lambda$0(AnnotatedString text) {
/* 95 */       Intrinsics.checkNotNullParameter(text, "text"); return new TransformedText(text, OffsetMapping.Companion.getIdentity());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\input\VisualTransformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */