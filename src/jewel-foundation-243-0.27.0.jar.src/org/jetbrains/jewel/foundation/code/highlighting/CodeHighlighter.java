package org.jetbrains.jewel.foundation.code.highlighting;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jewel.foundation.ExperimentalJewelApi;

@ExperimentalJewelApi
@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\bg\030\0002\0020\001J%\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\006\020\007\032\0020\bH&¢\006\004\b\t\020\n¨\006\013"}, d2 = {"Lorg/jetbrains/jewel/foundation/code/highlighting/CodeHighlighter;", "", "highlight", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/ui/text/AnnotatedString;", "code", "", "mimeType", "Lorg/jetbrains/jewel/foundation/code/MimeType;", "highlight-C7ITchA", "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "foundation"})
public interface CodeHighlighter {
  @NotNull
  Flow<AnnotatedString> highlight-C7ITchA(@NotNull String paramString1, @NotNull String paramString2);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\code\highlighting\CodeHighlighter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */