package com.martinosorio.mycv.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.martinosorio.mycv.R
import com.martinosorio.mycv.ui.theme.LightGray

@Deprecated("Replace me")
@Composable
fun TitleText(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp, bottom = 10.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.titleLarge
    )
}

@Composable
fun ScreenTitle(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.displayLarge
    )
}

@Composable
fun ScreenSubTitle(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp, bottom = 20.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineMedium
    )
}

@Composable
fun ContentsItem(
    itemTitle: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .border(width = 2.dp, color = LightGray, shape = RoundedCornerShape(8.dp))
            .clickable {
                onClick()
            },
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = itemTitle,
            modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, start = 16.dp),
            textAlign = TextAlign.Start,
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = stringResource(R.string.right_carret),   // TODO: Replace with icon
            modifier = Modifier.padding(top = 6.dp, bottom = 7.dp, end = 16.dp),
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

@Composable
fun ExperienceItem(
    onClick: () -> Unit,
    jobTitle: String,
    companyName: String,
    location: String,
    startDate: String,
    endDate: String,
    employmentType: String,
    officeType: String,
    description: String
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 15.dp)
            .border(width = 2.dp, color = LightGray, shape = RoundedCornerShape(8.dp))
            .clickable {
                onClick()
            },
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 8.dp, bottom = 10.dp, start = 16.dp, end = 16.dp)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                textAlign = TextAlign.Center,
                text = jobTitle,
                style = MaterialTheme.typography.titleLarge
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp),
                horizontalArrangement = Arrangement.Start,
            ) {
                Text(
                    text = companyName,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    modifier = Modifier
                        .padding(start = 6.dp, end = 6.dp),
                    text = "-",
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = employmentType,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp),
                horizontalArrangement = Arrangement.Start,
            ) {
                Text(
                    text = startDate,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    modifier = Modifier
                        .padding(start = 6.dp, end = 6.dp),
                    text = "-",
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = endDate,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.Start,
            ) {
                Text(
                    text = location,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    modifier = Modifier
                        .padding(start = 6.dp, end = 6.dp),
                    text = "-",
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = officeType,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Text(
                text = description,
                maxLines = 5,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}

@Composable
fun EducationItem(
    institutionName: String,
    degreeType: String,
    degreeSubject: String,
    location: String,
    startDate: String,
    endDate: String,
    description: String = ""
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 15.dp)
            .border(width = 2.dp, color = LightGray, shape = RoundedCornerShape(8.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 8.dp, bottom = 10.dp, start = 16.dp, end = 16.dp)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                textAlign = TextAlign.Center,
                text = institutionName,
                style = MaterialTheme.typography.titleLarge
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp),
                horizontalArrangement = Arrangement.Start,
            ) {
                Text(
                    text = degreeType,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    modifier = Modifier
                        .padding(start = 6.dp, end = 6.dp),
                    text = "-",
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = degreeSubject,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp),
                horizontalArrangement = Arrangement.Start,
            ) {
                Text(
                    text = startDate,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    modifier = Modifier
                        .padding(start = 6.dp, end = 6.dp),
                    text = "-",
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = endDate,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                horizontalArrangement = Arrangement.Start,
            ) {
                Text(
                    text = location,
                    style = MaterialTheme.typography.titleMedium
                )
            }

            if (description.isNotEmpty()) {
                Text(
                    text = description,
                    maxLines = 5,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.titleSmall
                )
            }
        }
    }
}

@Composable
fun CertificationItem(
    certificationName: String,
    institutionName: String,
    certificationId: String = "",
    issueDate: String,
    expirationDate: String = ""
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 15.dp)
            .border(width = 2.dp, color = LightGray, shape = RoundedCornerShape(8.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 8.dp, bottom = 10.dp, start = 16.dp, end = 16.dp)
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                textAlign = TextAlign.Center,
                text = certificationName,
                style = MaterialTheme.typography.titleLarge
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp),
                horizontalArrangement = Arrangement.Start,
            ) {
                Text(
                    text = "From: $institutionName",
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 6.dp),
                horizontalArrangement = Arrangement.Start,
            ) {
                Text(
                    text = "Issued $issueDate",
                    style = MaterialTheme.typography.titleMedium
                )

                if (expirationDate.isNotEmpty()) {
                    Text(
                        modifier = Modifier
                            .padding(start = 6.dp, end = 6.dp),
                        text = "-",
                        style = MaterialTheme.typography.titleMedium
                    )

                    Text(
                        text = "Expires $expirationDate",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }

            if (certificationId.isNotEmpty()) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.Start,
                ) {
                    Text(
                        text = "Certification ID: $certificationId",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
        }
    }
}